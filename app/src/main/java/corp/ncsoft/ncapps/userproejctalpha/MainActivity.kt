package corp.ncsoft.ncapps.userproejctalpha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.airbnb.lottie.LottieAnimationView
import corp.ncsoft.ncapps.common.ui.loadDefaultLottie

class MainActivity : AppCompatActivity() {
    lateinit var lottieAnimView: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lottieAnimView = findViewById(R.id.lottie_anim)
        findViewById<AppCompatButton>(R.id.test_button).setOnClickListener { lottieAnimView.loadDefaultLottie() }
    }
}