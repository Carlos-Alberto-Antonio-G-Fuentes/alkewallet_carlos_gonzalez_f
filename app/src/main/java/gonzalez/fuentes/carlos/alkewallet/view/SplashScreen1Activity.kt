package gonzalez.fuentes.carlos.alkewallet.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import gonzalez.fuentes.carlos.alkewallet.LoginSignupPage2Activity
import gonzalez.fuentes.carlos.alkewallet.R
import gonzalez.fuentes.carlos.alkewallet.databinding.ActivitySplashScreen1Binding

class SplashScreen1Activity : AppCompatActivity() {
    lateinit var bond: ActivitySplashScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bond= ActivitySplashScreen1Binding.inflate(layoutInflater)
        setContentView(bond.root)

        //Declarar imagen en una variable
        bond.imagelogo.setOnClickListener{
            val intent= Intent(this, LoginSignupPage2Activity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.splash)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}