package com.rescoder.mvvmbasicstut.data

// 싱글톤 패턴을 위해 private 생성자 설정
class FakeDatabase private constructor() {

    // Dao holder 역할
    var quoteDao = FakeQuoteDao()
        private set // FakeDatabase에서만 초기화 가능

    // companion object를 통해 FakeDatabase의 데이터 접근 가능
    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: FakeDatabase().also { instance = it }
        }
    }
}