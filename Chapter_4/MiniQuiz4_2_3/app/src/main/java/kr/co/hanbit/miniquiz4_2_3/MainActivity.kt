package kr.co.hanbit.miniquiz4_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.hanbit.miniquiz4_2_3.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        thread(start=true) {
            while (true) {
                Thread.sleep(1000)
                runOnUiThread {
                    count++
                    binding.textView.text = "$count"
                }
            }
        }
    }
}