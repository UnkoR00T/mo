package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public enum fp0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32337a;

    fp0(String str) {
        this.f32337a = str;
    }

    public static fp0 b(String str) throws IOException {
        fp0 fp0Var = HTTP_1_0;
        if (str.equals(fp0Var.f32337a)) {
            return fp0Var;
        }
        fp0 fp0Var2 = HTTP_1_1;
        if (str.equals(fp0Var2.f32337a)) {
            return fp0Var2;
        }
        fp0 fp0Var3 = HTTP_2;
        if (str.equals(fp0Var3.f32337a)) {
            return fp0Var3;
        }
        fp0 fp0Var4 = SPDY_3;
        if (str.equals(fp0Var4.f32337a)) {
            return fp0Var4;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32337a;
    }
}
