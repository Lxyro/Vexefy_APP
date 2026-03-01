
package vexefy.live.nofication.android.com
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
class MainActivity:AppCompatActivity(){
 override fun onCreate(b:Bundle?){super.onCreate(b)
 startActivity(Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS))
 finish()
 }}