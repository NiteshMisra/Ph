package physics.wallah.fragments.classroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import physics.wallah.R

class ClassroomContent : Fragment() {

    companion object {
        fun newInstance() : ClassroomContent = ClassroomContent()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_classroom_content, container, false)
    }
}