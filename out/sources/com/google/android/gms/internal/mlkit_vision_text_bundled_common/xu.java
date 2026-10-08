package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
class xu extends wu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f30702c;

    xu(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f30702c = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    public byte e(int i15) {
        return this.f30702c[i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yu) || g() != ((yu) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return obj.equals(this);
        }
        xu xuVar = (xu) obj;
        int iN = n();
        int iN2 = xuVar.n();
        if (iN != 0 && iN2 != 0 && iN != iN2) {
            return false;
        }
        int iG = g();
        if (iG > xuVar.g()) {
            throw new IllegalArgumentException("Length too large: " + iG + g());
        }
        if (iG > xuVar.g()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iG + ", " + xuVar.g());
        }
        byte[] bArr = this.f30702c;
        byte[] bArr2 = xuVar.f30702c;
        xuVar.s();
        int i15 = 0;
        int i16 = 0;
        while (i15 < iG) {
            if (bArr[i15] != bArr2[i16]) {
                return false;
            }
            i15++;
            i16++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    byte f(int i15) {
        return this.f30702c[i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    public int g() {
        return this.f30702c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    protected final int h(int i15, int i16, int i17) {
        return kw.b(i15, this.f30702c, 0, i17);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    public final yu i(int i15, int i16) {
        int iK = yu.k(0, i16, g());
        return iK == 0 ? yu.f30716b : new ru(this.f30702c, 0, iK);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.yu
    final void j(ou ouVar) {
        ((dv) ouVar).H(this.f30702c, 0, g());
    }

    protected int s() {
        return 0;
    }
}
