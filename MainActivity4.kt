package com.example.afterca

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
       var url=findViewById<Button>(R.id.url)
       var nevigate=findViewById<Button>(R.id.Nevigate)
       var camera=findViewById<Button>(R.id.Camera)
       var call=findViewById<Button>(R.id.Call)
       var x=findViewById<Button>(R.id.x)
        var y=findViewById<Button>(R.id.y)

        url.setOnClickListener{
            var i1=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(i1)
        }

        camera.setOnClickListener{
            var i2=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)
        }

        nevigate.setOnClickListener{
            var i3=Intent(Intent.ACTION_DIAL)
            startActivity(i3)
        }

        call.setOnClickListener{
            var i4=Intent(Intent.ACTION_CALL)
            startActivity(i4)
        }

        x.setOnClickListener{
            var i5=Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i5)
        }

        y.setOnClickListener{
            var i6=Intent(Intent.ACTION_VIEW)
            startActivity(i6)
        }

    }
}