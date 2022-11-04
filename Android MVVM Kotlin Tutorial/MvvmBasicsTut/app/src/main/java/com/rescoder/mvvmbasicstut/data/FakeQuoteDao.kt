package com.rescoder.mvvmbasicstut.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        // 비어있는 quote 리스트로 즉시 초기화
        quotes.value = quoteList
    }

    /** 가짜 DB에 Quote 추가 */
    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    /** 가짜 DB에 저장되어 있는 모든 Quote 반환 */
    // quoteList를 반영하는 quotes 반환
    // Dao 클래스 외부의 quotes 수정 방지를 위해 LiveData 형태로 반환
    fun getQuotes() = quotes as LiveData<List<Quote>>
}
