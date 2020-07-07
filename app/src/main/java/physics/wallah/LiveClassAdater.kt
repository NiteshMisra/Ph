package physics.wallah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.RecyclerView
import physics.wallah.extras.LiveDiffUtilCallBack

class LiveClassAdater : PagedListAdapter<Int,LiveClassAdater.VH>(LiveDiffUtilCallBack()) {

    class VH(view : View) : RecyclerView.ViewHolder(view){
        val position : TextView = view.findViewById(R.id.position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.element_live, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val current = getItem(position)!!
        holder.position.text = position.toString()
    }

}