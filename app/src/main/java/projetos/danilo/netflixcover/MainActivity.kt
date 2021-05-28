package projetos.danilo.netflixcover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        /**
         * Aguardar 3 segundos e executa a função abrirTelaDeLogin
         */
        Handler().postDelayed({abrirTelaDeLogin()}, 3000)
    }

    private fun abrirTelaDeLogin() {
        startActivity(Intent(this, FormLoginActivity::class.java))
        finish()
    }
}