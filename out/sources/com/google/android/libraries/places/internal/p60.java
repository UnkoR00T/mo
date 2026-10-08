package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class p60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f33274a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.a f33275b = a80.f31575e;

    public static w70 a(String str, o60 o60Var) {
        char cCharAt = str.charAt(0);
        int i15 = w70.f34127e;
        return new y70(str, cCharAt == ':', o60Var, null);
    }

    public static a80 b(byte[]... bArr) {
        return new a80(bArr.length >> 1, bArr);
    }

    public static byte[][] c(a80 a80Var) {
        return a80Var.e();
    }

    public static int d(a80 a80Var) {
        return a80Var.a();
    }
}
