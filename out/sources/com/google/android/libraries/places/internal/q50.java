package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class q50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f33387a = b("GRPC_ENABLE_RFC3986_URIS", false);

    static boolean a() {
        return f33387a;
    }

    static boolean b(String str, boolean z15) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (z15) {
            return zj.v.b(strTrim) || Boolean.parseBoolean(strTrim);
        }
        return !zj.v.b(strTrim) && Boolean.parseBoolean(strTrim);
    }
}
