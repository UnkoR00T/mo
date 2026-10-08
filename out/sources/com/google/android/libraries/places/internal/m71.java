package com.google.android.libraries.places.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class m71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f32925a;

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
            f32925a = method;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) f32925a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e15) {
            io.sentry.android.core.c2.f("SystemProperties", "get error", e15);
            return "false";
        }
    }
}
