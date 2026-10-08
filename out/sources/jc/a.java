package jc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f101382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f101383b;

    public a(byte[] bArr, byte[] bArr2) {
        this.f101382a = bArr;
        this.f101383b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f101382a, aVar.f101382a) && Arrays.equals(this.f101383b, aVar.f101383b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f101383b) + (Arrays.hashCode(this.f101382a) * 31);
    }

    public final String toString() {
        return "PaceEphemeralKeyPair(publicKey=" + Arrays.toString(this.f101382a) + ", privateKey=" + Arrays.toString(this.f101383b) + ')';
    }
}
