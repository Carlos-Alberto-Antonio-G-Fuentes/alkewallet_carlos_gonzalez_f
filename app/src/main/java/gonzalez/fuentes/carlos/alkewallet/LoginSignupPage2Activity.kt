package gonzalez.fuentes.carlos.alkewallet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginSignupPage2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_signup_page2)

        val textyatienescuenta = findViewById<TextView>(R.id.textyatienecta)
        val butcrearcuenta = findViewById<Button>(R.id.butcrearcuentanueva)

        textyatienescuenta.setOnClickListener {
            val intent = Intent(this, LoginPage3Activity::class.java)
            startActivity(intent)
        }

        butcrearcuenta.setOnClickListener {
            val intent = Intent(this, SignupPage4Activity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.logsingup)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}