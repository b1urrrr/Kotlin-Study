package com.rescoder.mvvmbasicstut.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rescoder.mvvmbasicstut.data.QuoteRepository

class QuotesViewModelFactory(private val quoteRepository: QuoteRepository) :
    ViewModelProvider.NewInstanceFactory() {

    // ViewModel 생성 메서드
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}