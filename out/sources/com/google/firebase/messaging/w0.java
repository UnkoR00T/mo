package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f36604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36606c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f36608e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque<String> f36607d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36609f = false;

    private w0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f36604a = sharedPreferences;
        this.f36605b = str;
        this.f36606c = str2;
        this.f36608e = executor;
    }

    private boolean b(boolean z15) {
        if (z15 && !this.f36609f) {
            i();
        }
        return z15;
    }

    static w0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        w0 w0Var = new w0(sharedPreferences, str, str2, executor);
        w0Var.d();
        return w0Var;
    }

    private void d() {
        synchronized (this.f36607d) {
            try {
                this.f36607d.clear();
                String string = this.f36604a.getString(this.f36605b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f36606c)) {
                    String[] strArrSplit = string.split(this.f36606c, -1);
                    if (strArrSplit.length == 0) {
                        c2.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f36607d.add(str);
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f36607d) {
            this.f36604a.edit().putString(this.f36605b, g()).commit();
        }
    }

    private void i() {
        this.f36608e.execute(new Runnable() { // from class: com.google.firebase.messaging.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f36600a.h();
            }
        });
    }

    public String e() {
        String strPeek;
        synchronized (this.f36607d) {
            strPeek = this.f36607d.peek();
        }
        return strPeek;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f36607d) {
            zB = b(this.f36607d.remove(obj));
        }
        return zB;
    }

    public String g() {
        StringBuilder sb5 = new StringBuilder();
        Iterator<String> it = this.f36607d.iterator();
        while (it.hasNext()) {
            sb5.append(it.next());
            sb5.append(this.f36606c);
        }
        return sb5.toString();
    }
}
