package garcia.sergio.practica04thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var btnCold: Button = findViewById(R.id.button_cold_drinks)
        var btnHot: Button = findViewById(R.id.button_hot_drinks)
        var btnSweets: Button = findViewById(R.id.button_sweets)
        var btnSalties: Button = findViewById(R.id.button_salties)



        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "cold");
            startActivity(intent)

        }

        btnHot.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "hot");
            startActivity(intent)

        }

        btnSweets.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "sweets");
            startActivity(intent)

        }

        btnSalties.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "salties");
            startActivity(intent)

        }


    }
}