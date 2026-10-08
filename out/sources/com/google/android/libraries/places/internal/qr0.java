package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class qr0 {
    public static final rr0 a(String str) {
        rr0 rr0Var = new rr0(hs0.b(str));
        rr0Var.j(str);
        return rr0Var;
    }

    public static final rr0 b(byte... bArr) {
        return new rr0(Arrays.copyOf(bArr, bArr.length));
    }
}
