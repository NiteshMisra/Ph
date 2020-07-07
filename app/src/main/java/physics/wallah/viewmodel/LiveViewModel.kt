package physics.wallah.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import physics.wallah.factory.LiveDataSourceFactory
import physics.wallah.listener.LivePageListener

class LiveViewModel(
    var context: Context
) : ViewModel() {

    fun getLiveClasses(livePageListener: LivePageListener) : LiveData<PagedList<Int>>{
        val factory = LiveDataSourceFactory(livePageListener)
        val musicDataSource = factory.getDataSource()

        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(20)
            .build()

        return LivePagedListBuilder(factory, config).build()
    }

}