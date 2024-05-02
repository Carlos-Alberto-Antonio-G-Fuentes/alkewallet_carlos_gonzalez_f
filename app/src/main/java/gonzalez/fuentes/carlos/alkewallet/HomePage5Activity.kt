package gonzalez.fuentes.carlos.alkewallet

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page5)
        val texthola=findViewById<TextView>(R.id.textsaldo)
        texthola.setOnClickListener{
            val intent= Intent(this,HomePageEmptyCase6Activity::class.java)
            startActivity(intent)

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.homepage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}