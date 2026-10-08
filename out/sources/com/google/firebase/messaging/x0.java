package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f36612a;

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f36613d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f36614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f36615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f36616c;

        private a(String str, String str2, long j15) {
            this.f36614a = str;
            this.f36615b = str2;
            this.f36616c = j15;
        }

        static String a(String str, String str2, long j15) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j15);
                return jSONObject.toString();
            } catch (JSONException e15) {
                c2.g("FirebaseMessaging", "Failed to encode token: " + e15);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e15) {
                c2.g("FirebaseMessaging", "Failed to parse token: " + e15);
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f36616c + f36613d || !str.equals(this.f36615b);
        }
    }

    public x0(Context context) {
        this.f36612a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(u5.a.j(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            c();
        } catch (IOException e15) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e15.getMessage();
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f36612a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String strB = b(str, str2);
        SharedPreferences.Editor editorEdit = this.f36612a.edit();
        editorEdit.remove(strB);
        editorEdit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f36612a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f36612a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f36612a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }
}
