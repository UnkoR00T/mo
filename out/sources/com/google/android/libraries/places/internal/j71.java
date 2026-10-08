package com.google.android.libraries.places.internal;

import android.os.StrictMode;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes4.dex */
final class j71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final l71 f32647a;

    static {
        l71 h71Var;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(l71.class, l71.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                h71Var = (l71) it.next();
                zj.p.x(!it.hasNext(), "Expected at most one FlagsService");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } else {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                h71Var = new h71();
            }
            f32647a = h71Var;
        } catch (Throwable th4) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th4;
        }
    }
}
