package gonzalez.fuentes.carlos.alkewallet

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePageEmptyCase6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page_empty_case6)
        val textbala=findViewById<TextView>(R.id.textbalance2)
                textbala.setOnClickListener{
                    val intent=Intent(this,ProfilePage7Activity::class.java)
                    startActivity(intent)
                }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.homepageempty)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}