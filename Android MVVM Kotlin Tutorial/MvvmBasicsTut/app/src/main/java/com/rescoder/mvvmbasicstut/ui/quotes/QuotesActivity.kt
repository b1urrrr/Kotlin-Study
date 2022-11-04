package com.rescoder.mvvmbasicstut.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rescoder.mvvmbasicstut.data.Quote
import com.rescoder.mvvmbasicstut.databinding.ActivityQuotesBinding
import com.rescoder.mvvmbasicstut.utilities.InjectorUtils

class QuotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeUi()
    }

    /** UI 초기화 (TextView, Button) */
    private fun initializeUi() {
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val viewModel = ViewModelProvider(this, factory).get(QuotesViewModel::class.java)

        // Quotes TextView 초기화 (QuotesViewModel을 통해 Quote Model 불러오기)
        viewModel.getQuotes().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("${quote}\n\n")
            }
            binding.txtQuotes.text = stringBuilder.toString()
        })

        // Add Quote 버튼을 클릭한 경우
        binding.btnAddQuote.setOnClickListener {
            val quote = Quote(binding.editQuote.text.toString(), binding.editAuthor.text.toString())
            viewModel.addQuote(quote)
            binding.editQuote.setText("")
            binding.editAuthor.setText("")
        }
    }
}