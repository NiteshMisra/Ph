package physics.wallah.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import physics.wallah.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginUi.setOnClickListener {
            Toast.makeText(this,"Not added yet",Toast.LENGTH_SHORT).show()
        }

        batchListingUi.setOnClickListener {
            startActivity(Intent(this,Live::class.java))
        }

        batchScheduleUi.setOnClickListener {
            startActivity(Intent(this,BatchClassroom::class.java))
        }

    }
}