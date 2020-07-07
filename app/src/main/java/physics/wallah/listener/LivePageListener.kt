package physics.wallah.listener

interface LivePageListener {

    fun failed(message : String)

    fun progress()

    fun firstCallComplete()

    fun complete()
}