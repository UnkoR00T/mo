package com.google.android.libraries.places.internal;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class mi0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wm0 f32947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ pi0 f32948c;

    /* synthetic */ mi0(pi0 pi0Var, byte[] bArr) {
        Objects.requireNonNull(pi0Var);
        this.f32948c = pi0Var;
        this.f32946a = new ArrayList();
    }

    final /* synthetic */ int b() {
        Iterator it = this.f32946a.iterator();
        int iC = 0;
        while (it.hasNext()) {
            iC += ((wm0) it.next()).c();
        }
        return iC;
    }

    final /* synthetic */ List h() {
        return this.f32946a;
    }

    @Override // java.io.OutputStream
    public final void write(int i15) {
        wm0 wm0Var = this.f32947b;
        byte b15 = (byte) i15;
        if (wm0Var == null || wm0Var.a() <= 0) {
            write(new byte[]{b15}, 0, 1);
        } else {
            wm0Var.d(b15);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i15, int i16) {
        if (this.f32947b == null) {
            pi0 pi0Var = this.f32948c;
            wm0 wm0VarB = pi0Var.g().b(Math.max(PKIFailureInfo.certConfirmed, i16));
            this.f32947b = wm0VarB;
            this.f32946a.add(wm0VarB);
        }
        while (i16 > 0) {
            int iMin = Math.min(i16, this.f32947b.a());
            if (iMin == 0) {
                int iC = this.f32947b.c();
                wm0 wm0VarB2 = this.f32948c.g().b(Math.max(i16, iC + iC));
                this.f32947b = wm0VarB2;
                this.f32946a.add(wm0VarB2);
            } else {
                this.f32947b.b(bArr, i15, iMin);
                i15 += iMin;
                i16 -= iMin;
            }
        }
    }
}
