package uz.gita.bookapp.presentation.ui.screen.bookinfo

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import uz.gita.bookapp.R
import uz.gita.bookapp.`data`.model.BookData

public class BookInfoScreenDirections private constructor() {
  private data class ActionBookInfoScreenToReadBookScreen(
    public val `data`: BookData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_bookInfoScreen_to_readBookScreen

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(BookData::class.java)) {
          result.putParcelable("data", this.data as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(BookData::class.java)) {
          result.putSerializable("data", this.data as Serializable)
        } else {
          throw UnsupportedOperationException(BookData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionBookInfoScreenToReadBookScreen(`data`: BookData): NavDirections =
        ActionBookInfoScreenToReadBookScreen(data)
  }
}
