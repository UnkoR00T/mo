package cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jg.s;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f25705c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f25706d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f25707a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f25708b;

    a(Context context) {
        this.f25708b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        s.l(context);
        f25705c.lock();
        try {
            if (f25706d == null) {
                f25706d = new a(context.getApplicationContext());
            }
            return f25706d;
        } finally {
            f25705c.unlock();
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb5 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb5.append(str);
        sb5.append(":");
        sb5.append(str2);
        return sb5.toString();
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.J(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    protected final String c(String str) {
        this.f25707a.lock();
        try {
            return this.f25708b.getString(str, null);
        } finally {
            this.f25707a.unlock();
        }
    }
}
