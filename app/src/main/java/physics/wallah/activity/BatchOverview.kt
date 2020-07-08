package physics.wallah.activity

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.batch_overview.*
import physics.wallah.R
import physics.wallah.adapter.BatchTimingAdapter
import physics.wallah.adapter.TeacherDetailAdapter
import physics.wallah.databinding.BatchOverviewBinding

class BatchOverview : AppCompatActivity() {

    private lateinit var binding : BatchOverviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.batch_overview)

        crossedPrice.paintFlags = crossedPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

        binding.teacherDetailRcv.layoutManager = LinearLayoutManager(this)

        val list : ArrayList<Int> = ArrayList()
        for (i in 0..3){
            list.add(i)
        }

        val teacherDetailAdapter = TeacherDetailAdapter()
        teacherDetailAdapter.addItems(list)

        binding.teacherDetailRcv.adapter = teacherDetailAdapter
        teacherDetailAdapter.notifyDataSetChanged()

        binding.batchTimingRcv.layoutManager = GridLayoutManager(this,2)
        val batchTimingAdapter = BatchTimingAdapter()
        batchTimingAdapter.addItems(list)

        binding.batchTimingRcv.adapter = batchTimingAdapter
        batchTimingAdapter.notifyDataSetChanged()

    }
}