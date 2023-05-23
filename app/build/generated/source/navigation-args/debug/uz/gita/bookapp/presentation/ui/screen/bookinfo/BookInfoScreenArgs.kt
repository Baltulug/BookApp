package uz.gita.bookapp.presentation.ui.screen.bookinfo

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import uz.gita.bookapp.`data`.model.BookData

public data class BookInfoScreenArgs(
  public val `data`: BookData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(BookData::class.java)) {
      result.set("data", this.data as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BookData::class.java)) {
      result.set("data", this.data as Serializable)
    } else {
      throw UnsupportedOperationException(BookData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): BookInfoScreenArgs {
      bundle.setClassLoader(BookInfoScreenArgs::class.java.classLoader)
      val __data : BookData?
      if (bundle.containsKey("data")) {
        if (Parcelable::class.java.isAssignableFrom(BookData::class.java) ||
            Serializable::class.java.isAssignableFrom(BookData::class.java)) {
          __data = bundle.get("data") as BookData?
        } else {
          throw UnsupportedOperationException(BookData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__data == null) {
          throw IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue")
      }
      return BookInfoScreenArgs(__data)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): BookInfoScreenArgs {
      val __data : BookData?
      if (savedStateHandle.contains("data")) {
        if (Parcelable::class.java.isAssignableFrom(BookData::class.java) ||
            Serializable::class.java.isAssignableFrom(BookData::class.java)) {
          __data = savedStateHandle.get<BookData?>("data")
        } else {
          throw UnsupportedOperationException(BookData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__data == null) {
          throw IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue")
      }
      return BookInfoScreenArgs(__data)
    }
  }
}
