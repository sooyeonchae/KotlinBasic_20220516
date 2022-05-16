package net.soozip.kotlinbasic_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener{

            //btnLog가 클릭되면 할 일.
            Log.d("메인화면", "로그 찍기 버튼 눌름")

        }

        btnLog.setOnLongClickListener {

            Log.d("메인화면", "로그 버튼 길게 눌림")
            return@setOnLongClickListener true
        }

        btnToast.setOnClickListener {

            Toast.makeText(this, "테스트용 토스트", Toast.LENGTH_SHORT).show()
        }

        btnVariable.setOnClickListener {
            var name1 : String
            var name2 : String

            name1 = "홍길동"
            name2 = "김삿갓"

            var year1 = 1997

        }

        btnCondition.setOnClickListener{
            var userAge = 18

            if (userAge >= 20) {
                Toast.makeText(this, "성인입니다", Toast.LENGTH_SHORT).show()
            }
            else if (userAge >= 17) {
                Toast.makeText(this, "고등학생입니다", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "중학생 이하입니다.", Toast.LENGTH_SHORT).show()
            }

            val num = 30

            when (num) {
                10 -> {
                    Log.d("when테스트", "10인경우")
                }
                15 -> Log.d("when테스트", "15인 경우 - 코드 한 줄")
                20, 30, 40 -> Log.d("when테스트", "20,30,40 중 하나")
                in 41..100 -> Log.d("when테스트", "41~100 사이의 값")
                else -> Log.d("when테스트", "그 외의 모든 경우")
            }
        }

        btnRepeat.setOnClickListener{
            //1.정석 - ArrayList연계
            var studentList = ArrayList<String>()
            studentList.add("이석민")
            studentList.add("전원우")
            studentList.add("우풀")

            for (name in studentList){
                Log.d("정석for문",name)
            }

            //2. 0~4, 0~5 직전 (자바식 for)
            for (i in 0..4) {
                Log.d("0~4", i.toString())
            }
            for (i in 0 until 5){
                Log.d("0~5직전", i.toString())
            }
        }
    }
}