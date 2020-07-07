package physics.wallah.factory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import physics.wallah.viewmodel.LiveViewModel

class LiveViewModelFactory(
    var context: Context
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LiveViewModel(context) as T
    }
}