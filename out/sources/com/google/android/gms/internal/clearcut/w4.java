package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile int f29584a = -1;

    public static final void c(w4 w4Var, byte[] bArr, int i15, int i16) {
        try {
            q4 q4VarT = q4.t(bArr, 0, i16);
            w4Var.b(q4VarT);
            q4VarT.p();
        } catch (IOException e15) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e15);
        }
    }

    public void b(q4 q4Var) {
    }

    public final int e() {
        int iG = g();
        this.f29584a = iG;
        return iG;
    }

    protected int g() {
        return 0;
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public w4 clone() {
        return (w4) super.clone();
    }

    public String toString() {
        return y4.a(this);
    }
}
