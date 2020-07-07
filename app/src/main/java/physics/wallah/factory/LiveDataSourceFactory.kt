package physics.wallah.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import androidx.paging.PageKeyedDataSource
import physics.wallah.datasource.LiveDataSource
import physics.wallah.listener.LivePageListener

class LiveDataSourceFactory(
    private var livePageListener: LivePageListener
) : DataSource.Factory<Int, Int>() {

    private var liveDataSource: MutableLiveData<PageKeyedDataSource<Int, Int>> = MutableLiveData()

    override fun create(): DataSource<Int, Int> {
        val dataSource = LiveDataSource(livePageListener)
        liveDataSource.postValue(dataSource)
        return dataSource
    }

    fun getDataSource(): MutableLiveData<PageKeyedDataSource<Int, Int>> {
        return liveDataSource
    }
}