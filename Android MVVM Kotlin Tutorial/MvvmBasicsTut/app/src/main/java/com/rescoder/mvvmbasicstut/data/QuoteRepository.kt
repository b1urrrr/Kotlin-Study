package com.rescoder.mvvmbasicstut.data

class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    /** FakeQuoteDao를 통해 가짜 DB에 Quote 추가 */
    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    /** FakeQuoteDao를 통해 가짜 DB에 저장되어 있는 모든 Quote 반환 */
    fun getQuotes() = quoteDao.getQuotes()

    companion object {
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quoteDao).also { instance = it }
            }
    }
}