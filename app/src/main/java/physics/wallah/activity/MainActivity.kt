package physics.wallah.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import physics.wallah.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginUi.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }

        batchListingUi.setOnClickListener {
            startActivity(Intent(this,Live::class.java))
        }

        batchOverViewUi.setOnClickListener {
            startActivity(Intent(this,BatchOverview::class.java))
        }

        batchScheduleUi.setOnClickListener {
            startActivity(Intent(this,BatchClassroom::class.java))
        }

    }
}