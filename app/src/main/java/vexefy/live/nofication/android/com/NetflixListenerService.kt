
package vexefy.live.nofication.android.com
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log
class NetflixListenerService:NotificationListenerService(){
 override fun onNotificationPosted(sbn:StatusBarNotification){
  if(sbn.packageName.contains("netflix",true)){
   Log.i("VeXeFy","Netflix detected")
  }
 }
}