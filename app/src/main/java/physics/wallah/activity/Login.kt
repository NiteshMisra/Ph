package physics.wallah.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import physics.wallah.R
import physics.wallah.fragments.login.OTP
import physics.wallah.fragments.login.LogInFragment

class Login : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        fragmentManager = supportFragmentManager
        addFragment(0)
    }

    fun addFragment(position : Int){
        when(position){
            0 -> {
                fragmentManager.beginTransaction()
                    .replace(R.id.loginContainer,LogInFragment())
                    .commit()
            }
            1 -> {
                fragmentManager.beginTransaction()
                    .replace(R.id.loginContainer,OTP())
                    .addToBackStack("otp")
                    .commit()
            }
        }
    }

    override fun onBackPressed() {
       if (fragmentManager.backStackEntryCount > 1){
           fragmentManager.popBackStack()
       }else{
           super.onBackPressed()
       }
    }
}