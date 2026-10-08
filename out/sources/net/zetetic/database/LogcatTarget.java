package net.zetetic.database;

import android.util.Log;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public class LogcatTarget implements LogTarget {
    @Override // net.zetetic.database.LogTarget
    public boolean a(String str, int i15) {
        return Log.isLoggable(str, i15);
    }

    @Override // net.zetetic.database.LogTarget
    public void b(int i15, String str, String str2, Throwable th4) {
        if (i15 == 5) {
            c2.h(str, str2, th4);
        } else if (i15 == 6) {
            c2.f(str, str2, th4);
        } else {
            if (i15 != 7) {
                return;
            }
            c2.k(str, str2, th4);
        }
    }
}
