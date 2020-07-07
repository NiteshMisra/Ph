package physics.wallah.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import physics.wallah.LiveClassAdater
import physics.wallah.R
import physics.wallah.databinding.ActivityLiveBinding
import physics.wallah.factory.LiveViewModelFactory
import physics.wallah.listener.LivePageListener
import physics.wallah.viewmodel.LiveViewModel

class Live : AppCompatActivity(),LivePageListener {

    private lateinit var binding : ActivityLiveBinding
    private lateinit var liveViewModel: LiveViewModel
    private lateinit var adapter : LiveClassAdater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_live)

        val liveViewModelFactory = LiveViewModelFactory(this)
        liveViewModel = ViewModelProvider(this,liveViewModelFactory).get(LiveViewModel::class.java)

        binding.liveRcv.layoutManager = LinearLayoutManager(this)
        adapter = LiveClassAdater()
        binding.liveRcv.adapter = adapter

        liveViewModel.getLiveClasses(this).observe(this , Observer {list ->
            if (list != null){
                adapter.submitList(list)
                adapter.notifyDataSetChanged()
            }
        })

    }

    override fun failed(message: String) {

    }

    override fun progress() {

    }

    override fun firstCallComplete() {

    }

    override fun complete() {

    }
}