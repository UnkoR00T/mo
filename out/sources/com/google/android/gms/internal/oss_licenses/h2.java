package com.google.android.gms.internal.oss_licenses;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f30789b = i2.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f30790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c2 f30791d;

    class a extends c2 {
        a() {
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z15 = true;
        if (str != null && !"robolectric".equals(str)) {
            z15 = false;
        }
        f30790c = z15;
        f30791d = new a();
    }

    static boolean d() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return i2.class.getName().equals(e());
        } catch (Throwable unused) {
            return false;
        }
    }

    static String e() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.oss_licenses.d2
    protected q1 b(String str) {
        return m2.b(str);
    }
}
