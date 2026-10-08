package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class fq0 implements e80 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f32338c = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p00 f32339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g00 f32340b;

    fq0(g00 g00Var, int i15) {
        this.f32340b = (g00) zj.p.r(g00Var, "defaultInstance cannot be null");
        this.f32339a = g00Var.l();
    }

    @Override // com.google.android.libraries.places.internal.e80
    public final Class a() {
        return this.f32340b.getClass();
    }

    @Override // com.google.android.libraries.places.internal.c80
    public final /* bridge */ /* synthetic */ InputStream b(Object obj) {
        return new dq0((g00) obj, this.f32339a);
    }

    @Override // com.google.android.libraries.places.internal.c80
    public final /* bridge */ /* synthetic */ Object c(InputStream inputStream) {
        xx xxVarE;
        byte[] bArr;
        if (inputStream instanceof dq0) {
            dq0 dq0Var = (dq0) inputStream;
            if (dq0Var.m() == this.f32339a) {
                try {
                    return dq0Var.h();
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            if (inputStream instanceof t60) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return this.f32340b;
                    }
                    xxVarE = null;
                } else {
                    ThreadLocal threadLocal = f32338c;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i15 = iAvailable;
                    while (i15 > 0) {
                        int i16 = inputStream.read(bArr, iAvailable - i15, i15);
                        if (i16 == -1) {
                            break;
                        }
                        i15 -= i16;
                    }
                    if (i15 != 0) {
                        int i17 = iAvailable - i15;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(iAvailable).length() + 21 + String.valueOf(i17).length());
                        sb5.append("size inaccurate: ");
                        sb5.append(iAvailable);
                        sb5.append(" != ");
                        sb5.append(i17);
                        throw new RuntimeException(sb5.toString());
                    }
                    xxVarE = xx.f(bArr, 0, iAvailable);
                }
            } else {
                xxVarE = null;
            }
            if (xxVarE == null) {
                xxVarE = xx.e(inputStream, PKIFailureInfo.certConfirmed);
            }
            xxVarE.k(Integer.MAX_VALUE);
            try {
                g00 g00Var = (g00) this.f32339a.b(xxVarE, gq0.f32418a);
                try {
                    xxVarE.o(0);
                    return g00Var;
                } catch (lz e15) {
                    throw e15;
                }
            } catch (lz e16) {
                throw new p90(l90.f32814l.e("Invalid protobuf byte sequence").d(e16), null);
            }
        } catch (IOException e17) {
            throw new RuntimeException(e17);
        }
    }
}
