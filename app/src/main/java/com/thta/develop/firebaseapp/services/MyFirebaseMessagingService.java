package com.thta.develop.firebaseapp.services;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.thta.develop.firebaseapp.utilities.MyNotificationManager;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private String TAG = "MyFirebaseMessagingService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        String title = remoteMessage.getNotification().getTitle();
        String body = remoteMessage.getNotification().getBody();

        MyNotificationManager.getmInstance(getApplicationContext()).displayNotification(title ,body);

        /*
        * Displaying a notification locally
        */
//        MyNotificationManager.getInstance(this).displayNotification("Greetings", "Hello how are you?");

    }
}
