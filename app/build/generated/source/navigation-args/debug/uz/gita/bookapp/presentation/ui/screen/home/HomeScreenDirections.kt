package uz.gita.bookapp.presentation.ui.screen.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import uz.gita.bookapp.R
import uz.gita.bookapp.`data`.model.BookData

public class HomeScreenDirections private constructor() {
  private data class ActionHomeScreenToBookInfoScreen(
    public val `data`: BookData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeScreen_to_bookInfoScreen

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
    public fun actionHomeScreenToBookInfoScreen(`data`: BookData): NavDirections =
        ActionHomeScreenToBookInfoScreen(data)
  }
}
