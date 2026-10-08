package com.google.android.libraries.places.internal;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes4.dex */
public final class sa1 extends oa1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f33672b = ta1.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f33673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final na1 f33674d;

    class a extends na1 {
        a() {
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z15 = true;
        if (str != null && !"robolectric".equals(str)) {
            z15 = false;
        }
        f33673c = z15;
        f33674d = new a();
    }

    static boolean d() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return ta1.class.getName().equals(e());
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

    @Override // com.google.android.libraries.places.internal.oa1
    protected aa1 b(String str) {
        return ya1.b(str);
    }
}
