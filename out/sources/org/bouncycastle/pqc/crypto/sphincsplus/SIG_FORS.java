package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes5.dex */
class SIG_FORS {
    final byte[][] authPath;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final byte[] f149588sk;

    SIG_FORS(byte[] bArr, byte[][] bArr2) {
        this.authPath = bArr2;
        this.f149588sk = bArr;
    }

    public byte[][] getAuthPath() {
        return this.authPath;
    }

    byte[] getSK() {
        return this.f149588sk;
    }
}
