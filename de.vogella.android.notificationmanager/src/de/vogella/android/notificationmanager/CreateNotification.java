package de.vogella.android.notificationmanager;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;

public class CreateNotification extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void createNotification(View view) {
		NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		Notification notification = new Notification(R.drawable.icon,
				"A new notification", System.currentTimeMillis());
		// Hide the notification after its selected
		notification.flags |= Notification.FLAG_AUTO_CANCEL;
		// Intent intent = new Intent(this, NotificationReceiver.class);
		// PendingIntent activity = PendingIntent.getActivity(this, 0, intent,
		// 0);
		notification.setLatestEventInfo(this, "This is the title",
				"This is the text", null);
		// notification.number += 1;
		notificationManager.notify(0, notification);

	}
}
