package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j2 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f29738b = new i2(t3.f30242b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29739a = 0;

    static {
        int i15 = w1.f30287a;
    }

    j2() {
    }

    public static j2 C(byte[] bArr, int i15, int i16) {
        w(i15, i15 + i16, bArr.length);
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        return new i2(bArr2);
    }

    public static j2 E(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i15 = 0;
            while (i15 < iMin) {
                int i16 = inputStream.read(bArr, i15, iMin - i15);
                if (i16 == -1) {
                    break;
                }
                i15 += i16;
            }
            j2 j2VarC = i15 == 0 ? null : C(bArr, 0, i15);
            if (j2VarC == null) {
                break;
            }
            arrayList.add(j2VarC);
            iMin = Math.min(iMin + iMin, PKIFailureInfo.certRevoked);
        }
        int size = arrayList.size();
        return size == 0 ? f29738b : g(arrayList.iterator(), size);
    }

    static void G(int i15, int i16) {
        if (((i16 - (i15 + 1)) | i15) < 0) {
            if (i15 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i15);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i15 + ", " + i16);
        }
    }

    private static j2 g(Iterator it, int i15) {
        if (i15 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i15)));
        }
        if (i15 == 1) {
            return (j2) it.next();
        }
        int i16 = i15 >>> 1;
        j2 j2VarG = g(it, i16);
        j2 j2VarG2 = g(it, i15 - i16);
        if (Integer.MAX_VALUE - j2VarG.h() >= j2VarG2.h()) {
            return j5.U(j2VarG, j2VarG2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + j2VarG.h() + "+" + j2VarG2.h());
    }

    static int w(int i15, int i16, int i17) {
        int i18 = i16 - i15;
        if ((i15 | i16 | i18 | (i17 - i16)) >= 0) {
            return i18;
        }
        if (i15 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i15 + " < 0");
        }
        if (i16 < i15) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i15 + ", " + i16);
        }
        throw new IndexOutOfBoundsException("End index: " + i16 + " >= " + i17);
    }

    protected final int A() {
        return this.f29739a;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public f2 iterator() {
        return new b2(this);
    }

    public final String F() {
        return h() == 0 ? "" : t(t3.f30241a);
    }

    @Deprecated
    public final void L(byte[] bArr, int i15, int i16, int i17) {
        w(0, i17, h());
        w(i16, i16 + i17, bArr.length);
        if (i17 > 0) {
            i(bArr, 0, i16, i17);
        }
    }

    public final byte[] M() {
        int iH = h();
        if (iH == 0) {
            return t3.f30242b;
        }
        byte[] bArr = new byte[iH];
        i(bArr, 0, 0, iH);
        return bArr;
    }

    public abstract byte e(int i15);

    public abstract boolean equals(Object obj);

    abstract byte f(int i15);

    public abstract int h();

    public final int hashCode() {
        int iN = this.f29739a;
        if (iN == 0) {
            int iH = h();
            iN = n(iH, 0, iH);
            if (iN == 0) {
                iN = 1;
            }
            this.f29739a = iN;
        }
        return iN;
    }

    protected abstract void i(byte[] bArr, int i15, int i16, int i17);

    protected abstract int j();

    protected abstract boolean k();

    protected abstract int n(int i15, int i16, int i17);

    protected abstract int o(int i15, int i16, int i17);

    public abstract j2 s(int i15, int i16);

    protected abstract String t(Charset charset);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? w5.a(this) : w5.a(s(0, 47)).concat("..."));
    }

    abstract void u(a2 a2Var);

    public abstract boolean v();
}
