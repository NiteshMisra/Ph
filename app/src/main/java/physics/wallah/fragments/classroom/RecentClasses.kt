package physics.wallah.fragments.classroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import physics.wallah.R
import physics.wallah.adapter.RecentClassDateAdapter
import physics.wallah.adapter.RecentClassesAdapter
import physics.wallah.databinding.FragmentRecentClassesBinding

class RecentClasses : Fragment() {

    companion object {
        fun newInstance() : RecentClasses = RecentClasses()
    }

    private lateinit var binding : FragmentRecentClassesBinding
    private var selectedPosition : Int = 0
    private lateinit var activity1 : FragmentActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity1 = requireActivity()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recent_classes, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dateUIHandling()

        classesUIHandling()

    }

    private fun classesUIHandling() {
        binding.classesRcv.layoutManager = LinearLayoutManager(activity1)

        val recentClassesAdapter = RecentClassesAdapter(activity1)
        val list : ArrayList<Int> = ArrayList()

        for (i in 0..8){
            list.add(i)
        }
        binding.classesRcv.adapter = recentClassesAdapter
        recentClassesAdapter.addItems(list)
        recentClassesAdapter.notifyDataSetChanged()

    }

    private fun dateUIHandling() {
        binding.dateRcv.layoutManager = LinearLayoutManager(activity1,RecyclerView.HORIZONTAL,false)
        val recentClassDateAdapter = RecentClassDateAdapter(selectedPosition)
        val list : ArrayList<Int> = ArrayList()

        for (i in 0..8){
            list.add(i)
        }
        binding.dateRcv.adapter = recentClassDateAdapter
        recentClassDateAdapter.addItems(list)
        recentClassDateAdapter.notifyDataSetChanged()

        recentClassDateAdapter.listener = { _, item, position ->
            recentClassDateAdapter.notifyItemChanged(selectedPosition)
            selectedPosition = position
        }
    }
}