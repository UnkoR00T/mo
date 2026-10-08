package uk;

import java.util.Arrays;
import tk.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f198632a;

    private a(byte[] bArr, int i15, int i16) {
        byte[] bArr2 = new byte[i16];
        this.f198632a = bArr2;
        System.arraycopy(bArr, i15, bArr2, 0, i16);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i15, int i16) {
        if (bArr != null) {
            return new a(bArr, i15, i16);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.f198632a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f198632a, this.f198632a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f198632a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f198632a) + ")";
    }
}
