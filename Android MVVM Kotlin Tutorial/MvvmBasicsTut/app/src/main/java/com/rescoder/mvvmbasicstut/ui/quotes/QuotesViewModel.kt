package com.rescoder.mvvmbasicstut.ui.quotes

import androidx.lifecycle.ViewModel
import com.rescoder.mvvmbasicstut.data.Quote
import com.rescoder.mvvmbasicstut.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    /** QuoteRepository를 통해 가짜 DB에 Quote 추가 */
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    /** QuoteRepository를 통해 가짜 DB에 저장되어 있는 모든 Quote 반환 */
    fun getQuotes() = quoteRepository.getQuotes()
}