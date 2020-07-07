package physics.wallah.datasource

import androidx.paging.PageKeyedDataSource
import physics.wallah.listener.LivePageListener

class LiveDataSource(
    private var livePageListener: LivePageListener
) : PageKeyedDataSource<Int,Int>() {

    private val dataSize : Int = 20
    private var pageNumber : Int = 0

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Int>
    ) {
        livePageListener.progress()
        val list : ArrayList<Int> = ArrayList()
        for (i in 0..dataSize){
            list.add(i)
        }

        pageNumber += 1
        callback.onResult(list,null,pageNumber)
        livePageListener.firstCallComplete()
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Int>) {
        val list : ArrayList<Int> = ArrayList()
        for (i in 0..dataSize){
            list.add(i)
        }

        pageNumber += 1
        callback.onResult(list,pageNumber)
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Int>) {

    }
}