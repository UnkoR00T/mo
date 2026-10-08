package com.google.android.gms.internal.oss_licenses;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f30743a;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        } finally {
            f30743a = method;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) f30743a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception unused) {
            return "false";
        }
    }
}
