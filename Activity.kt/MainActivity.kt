package com.example.sampleappcoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //화면이 클릭되었다는 것 알기
        val image1 = findViewById<ImageView>(R.id.image1_1)
        image1.setOnClickListener{
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
            // 화면이 클릭되면 다음 화면으로 넘어간다
            val intent = Intent(this, AppActivity1::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.image1_2)
        val image3 = findViewById<ImageView>(R.id.image1_3)
        val image4 = findViewById<ImageView>(R.id.image2_1)
        val image5 = findViewById<ImageView>(R.id.image2_2)
        val image6 = findViewById<ImageView>(R.id.image2_3)
        val image7 = findViewById<ImageView>(R.id.image3_1)
        val image8 = findViewById<ImageView>(R.id.image3_2)
        val image9 = findViewById<ImageView>(R.id.image3_3)


        image2.setOnClickListener{
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity2::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener{
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity3::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener{
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity4::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener{
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity5::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener{
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity6::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener{
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity7::class.java)
            startActivity(intent)
        }
        image8.setOnClickListener{
            Toast.makeText(this, "8번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity8::class.java)
            startActivity(intent)
        }
        image9.setOnClickListener{
            Toast.makeText(this, "9번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AppActivity9::class.java)
            startActivity(intent)
        }

    }
}