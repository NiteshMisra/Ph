package physics.wallah.fragments.classroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import physics.wallah.R
import physics.wallah.adapter.ClassroomContentAdapter
import physics.wallah.databinding.FragmentClassroomContentBinding

class ClassroomContent : Fragment() {

    companion object {
        fun newInstance() : ClassroomContent = ClassroomContent()
    }

    private lateinit var binding : FragmentClassroomContentBinding
    private lateinit var activity1 : FragmentActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity1 = requireActivity()
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_classroom_content, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contentDataHandling()
    }

    private fun contentDataHandling() {
        binding.contentRcv.layoutManager = LinearLayoutManager(activity1)

        val list : ArrayList<Int> = ArrayList()
        for (i in 0..20){
            list.add(i)
        }
        val classroomContentAdapter = ClassroomContentAdapter()
        classroomContentAdapter.addItems(list)
        binding.contentRcv.adapter = classroomContentAdapter
        classroomContentAdapter.notifyDataSetChanged()
    }
}