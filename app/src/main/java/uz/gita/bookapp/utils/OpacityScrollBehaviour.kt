package uz.gita.bookapp.utils
import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout

class OpacityScrollBehavior(context: Context?, attrs: AttributeSet?) :
    CoordinatorLayout.Behavior<View>(context, attrs) {
    override fun layoutDependsOn(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        return dependency is AppBarLayout
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        val expandedPercentageFactor = dependency.y / dependency.height

        // Set the desired opacity range (0.0f - 1.0f)
        val opacity = 1.0f - expandedPercentageFactor
        child.alpha = opacity
        return true
    }
}
