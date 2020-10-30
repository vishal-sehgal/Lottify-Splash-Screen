package dev.vishalsehgal.lottifysplash

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val lottieView = findViewById<LottieAnimationView>(R.id.lottie_view)
        lottieView.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationRepeat(animation: Animator?) {
                //Do nothing
            }

            override fun onAnimationEnd(animation: Animator?) {
                Intent(this@SplashActivity, MainActivity::class.java).apply {
                    startActivity(this)
                    finish()
                }
            }

            override fun onAnimationCancel(animation: Animator?) {
                //Do nothing
            }

            override fun onAnimationStart(animation: Animator?) {
                //Do nothing
            }
        })
    }
}