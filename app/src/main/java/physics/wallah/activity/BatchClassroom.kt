package physics.wallah.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import physics.wallah.R
import physics.wallah.databinding.ActivityBatchClassroomBinding
import physics.wallah.fragments.classroom.ClassroomContent
import physics.wallah.fragments.classroom.RecentClasses

class BatchClassroom : AppCompatActivity() {

    private lateinit var binding : ActivityBatchClassroomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_batch_classroom)

        changeTab(0)

        binding.tab1.setOnClickListener {
            changeTab(0)
        }

        binding.tab2.setOnClickListener {
            changeTab(1)
        }

    }

    fun changeTab(position : Int){
        when(position){
            0 -> {
                binding.tab1.setBackgroundResource(R.drawable.classroom_selected)
                binding.tab1dot.visibility = View.VISIBLE
                binding.tab1.setTextColor(Color.parseColor("#CB3066"))

                binding.tab2.setBackgroundResource(R.drawable.classroom_not_selected)
                binding.tab2dot.visibility = View.GONE
                binding.tab2.setTextColor(Color.parseColor("#FFFFFF"))

                addFragment(RecentClasses.newInstance())
            }
            1 -> {
                binding.tab2.setBackgroundResource(R.drawable.classroom_selected)
                binding.tab2dot.visibility = View.VISIBLE
                binding.tab2.setTextColor(Color.parseColor("#CB3066"))

                binding.tab1.setBackgroundResource(R.drawable.classroom_not_selected)
                binding.tab1dot.visibility = View.GONE
                binding.tab1.setTextColor(Color.parseColor("#FFFFFF"))

                addFragment(ClassroomContent.newInstance())
            }
        }
    }

    fun addFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.classroom_container,fragment)
            .commit()
    }
}