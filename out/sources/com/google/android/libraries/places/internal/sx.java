package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class sx extends rx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f33727c;

    sx(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f33727c = bArr;
    }

    @Override // com.google.android.libraries.places.internal.tx
    final byte e(int i15) {
        return this.f33727c[i15];
    }

    @Override // com.google.android.libraries.places.internal.tx
    public final int f() {
        return this.f33727c.length;
    }

    @Override // com.google.android.libraries.places.internal.tx
    public final tx g(int i15, int i16) {
        byte[] bArr = this.f33727c;
        int iU = tx.u(0, i16, bArr.length);
        return iU == 0 ? tx.f33820b : new px(bArr, 0, iU);
    }

    @Override // com.google.android.libraries.places.internal.tx
    protected final void h(byte[] bArr, int i15, int i16, int i17) {
        System.arraycopy(this.f33727c, 0, bArr, 0, i17);
    }

    @Override // com.google.android.libraries.places.internal.tx
    final void i(mx mxVar) {
        byte[] bArr = this.f33727c;
        mxVar.a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.libraries.places.internal.tx
    protected final boolean j(tx txVar) {
        boolean z15 = txVar instanceof sx;
        if (z15) {
            return Arrays.equals(this.f33727c, ((sx) txVar).f33727c);
        }
        boolean z16 = txVar instanceof px;
        if (!z16) {
            return txVar.j(this);
        }
        byte[] bArr = this.f33727c;
        int iF = txVar.f();
        int length = bArr.length;
        if (length > iF) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb5.append("Length too large: ");
            sb5.append(length);
            sb5.append(length);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (length <= txVar.f()) {
            if (z15) {
                return tx.v(bArr, 0, ((sx) txVar).f33727c, 0, length);
            }
            if (!z16) {
                return txVar.g(0, length).equals(g(0, length));
            }
            px pxVar = (px) txVar;
            return tx.v(bArr, 0, pxVar.w(), pxVar.A(), length);
        }
        int iF2 = txVar.f();
        StringBuilder sb6 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(iF2).length());
        sb6.append("Ran off end of other: 0, ");
        sb6.append(length);
        sb6.append(", ");
        sb6.append(iF2);
        throw new IllegalArgumentException(sb6.toString());
    }

    @Override // com.google.android.libraries.places.internal.tx
    protected final int k(int i15, int i16, int i17) {
        return jz.c(i15, this.f33727c, 0, i17);
    }

    @Override // com.google.android.libraries.places.internal.tx
    public final xx n() {
        byte[] bArr = this.f33727c;
        return xx.g(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] w() {
        return this.f33727c;
    }
}
