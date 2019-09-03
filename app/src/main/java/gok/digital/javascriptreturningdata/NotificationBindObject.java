/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gok.digital.javascriptreturningdata;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class NotificationBindObject {

    private Context mContext;

    public NotificationBindObject(Context context) {
        mContext = context;
    }

    /**
     * The '@JavascriptInterface is required to make the method accessible from the Javascript
     * layer
     * <p>
     * The code in this method is based on the documentation here:
     * <p>
     * http://developer.android.com/training/notify-user/build-notification.html
     *
     * @param message The message displayed in the notification
     */
    @JavascriptInterface
    public void showNotification(String message) {
        Log.d("Message: ", message);

        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }

}
