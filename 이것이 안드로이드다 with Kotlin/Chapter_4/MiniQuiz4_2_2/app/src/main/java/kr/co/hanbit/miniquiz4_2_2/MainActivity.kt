package kr.co.hanbit.miniquiz4_2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import kr.co.hanbit.miniquiz4_2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val listener by lazy {
        CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            var result: String = "";
            if (binding.checkApple.isChecked) if (result.isEmpty()) result += "사과" else result += "와 사과"
            if (binding.checkBanana.isChecked) if (result.isEmpty()) result += "바나나" else result += "와 바나나"
            if (binding.checkOrange.isChecked) if (result.isEmpty()) result += "오렌지" else result += "와 오렌지"
            if (result.isNotEmpty()) {
                Log.d("CheckBox", "${result}가 체크되었습니다.")
            } else {
                Log.d("CheckBox", "아무것도 체크되지 않았습니다.")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.checkApple.setOnCheckedChangeListener(listener)
        binding.checkBanana.setOnCheckedChangeListener(listener)
        binding.checkOrange.setOnCheckedChangeListener(listener)
    }
}