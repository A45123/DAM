package dam_a45123.helloworldoptional

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSystemInfo = findViewById<TextView>(R.id.txtSystemInfo)

        val systemInfo = """
            Manufacturer: ${Build.MANUFACTURER}
            Brand: ${Build.BRAND}
            Model: ${Build.MODEL}
            Device: ${Build.DEVICE}
            Product: ${Build.PRODUCT}
            Board: ${Build.BOARD}
            Hardware: ${Build.HARDWARE}
            
            Android Version: ${Build.VERSION.RELEASE}
            API Level: ${Build.VERSION.SDK_INT}
            Build ID: ${Build.ID}
            Build Type: ${Build.TYPE}
        """.trimIndent()

        txtSystemInfo.text = systemInfo
    }
}