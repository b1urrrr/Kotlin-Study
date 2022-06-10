package kr.co.part3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_result.*
import kr.co.part3.R

class ResultFragment : Fragment() {

    var option = -1
    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        option = arguments?.getInt("index") ?: -1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option) // 결과값 세팅

        home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option: Int) {
        when(option) {
            1 -> {
                text_result.text = "You are a QUITTER!"
                text_description.text = "You can let the person easily."
            }
            2 -> {
                text_result.text = "You should focus on yourself!"
                text_description.text = "You become really clingy to your ex."
            }
            3 -> {
                text_result.text = "You should take it easy!"
                text_description.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                text_result.text = "You are pretty mature!"
                text_description.text = "You can easily accept the break-up."
            }
        }
    }
}