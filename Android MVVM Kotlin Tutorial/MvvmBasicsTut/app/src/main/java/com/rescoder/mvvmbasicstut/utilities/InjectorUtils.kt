package com.rescoder.mvvmbasicstut.utilities

import com.rescoder.mvvmbasicstut.data.FakeDatabase
import com.rescoder.mvvmbasicstut.data.QuoteRepository
import com.rescoder.mvvmbasicstut.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        // QuotesViewModelFactory와 관련된 모든 의존 관계가 설정됨
        // 구현을 수정해야할 때 아래 코드를 통해 한번에 수정
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}