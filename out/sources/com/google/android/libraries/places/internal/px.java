package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class px extends rx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f33361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33363e;

    px(byte[] bArr, int i15, int i16) {
        super(null);
        tx.u(i15, i15 + i16, bArr.length);
        this.f33361c = bArr;
        this.f33362d = i15;
        this.f33363e = i16;
    }

    final /* synthetic */ int A() {
        return this.f33362d;
    }

    @Override // com.google.android.libraries.places.internal.tx
    final byte e(int i15) {
        return this.f33361c[this.f33362d + i15];
    }

    @Override // com.google.android.libraries.places.internal.tx
    public final int f() {
        return this.f33363e;
    }

    @Override // com.google.android.libraries.places.internal.tx
    public final tx g(int i15, int i16) {
        int iU = tx.u(i15, i16, this.f33363e);
        return iU == 0 ? tx.f33820b : new px(this.f33361c, this.f33362d + i15, iU);
    }

    @Override // com.google.android.libraries.places.internal.tx
    protected final void h(byte[] bArr, int i15, int i16, int i17) {
        System.arraycopy(this.f33361c, this.f33362d, bArr, 0, i17);
    }

    @Override // com.google.android.libraries.places.internal.tx
    final void i(mx mxVar) {
        mxVar.a(this.f33361c, this.f33362d, this.f33363e);
    }

    @Override // com.google.android.libraries.places.internal.tx
    protected final boolean j(tx txVar) {
        boolean z15 = txVar instanceof sx;
        if (!z15 && !(txVar instanceof px)) {
            return txVar.j(this);
        }
        int i15 = this.f33363e;
        if (i15 > txVar.f()) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 18 + String.valueOf(i15).length());
            sb5.append("Length too large: ");
            sb5.append(i15);
            sb5.append(i15);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (i15 <= txVar.f()) {
            if (z15) {
                return tx.v(this.f33361c, this.f33362d, ((sx) txVar).w(), 0, i15);
            }
            if (txVar instanceof px) {
                px pxVar = (px) txVar;
                return tx.v(this.f33361c, this.f33362d, pxVar.f33361c, pxVar.f33362d, i15);
            }
            tx txVarG = txVar.g(0, i15);
            int i16 = this.f33362d;
            return txVarG.equals(g(i16, i15 + i16));
        }
        int iF = txVar.f();
        StringBuilder sb6 = new StringBuilder(String.valueOf(i15).length() + 27 + String.valueOf(iF).length());
        sb6.append("Ran off end of other: 0, ");
        sb6.append(i15);
        sb6.append(", ");
        sb6.append(iF);
        throw new IllegalArgumentException(sb6.toString());
    }

    @Override // com.google.android.libraries.places.internal.tx
    protected final int k(int i15, int i16, int i17) {
        return jz.c(i15, this.f33361c, this.f33362d, i17);
    }

    @Override // com.google.android.libraries.places.internal.tx
    public final xx n() {
        throw null;
    }

    final /* synthetic */ byte[] w() {
        return this.f33361c;
    }
}
