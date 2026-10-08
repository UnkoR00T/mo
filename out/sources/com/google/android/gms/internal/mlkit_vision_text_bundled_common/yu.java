package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yu implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yu f30716b = new xu(kw.f30477b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30717a = 0;

    static {
        int i15 = hu.f30448a;
    }

    yu() {
    }

    static int k(int i15, int i16, int i17) {
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

    public static yu o(byte[] bArr, int i15, int i16) {
        k(i15, i15 + i16, bArr.length);
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        return new xu(bArr2);
    }

    public abstract byte e(int i15);

    public abstract boolean equals(Object obj);

    abstract byte f(int i15);

    public abstract int g();

    protected abstract int h(int i15, int i16, int i17);

    public final int hashCode() {
        int iH = this.f30717a;
        if (iH == 0) {
            int iG = g();
            iH = h(iG, 0, iG);
            if (iH == 0) {
                iH = 1;
            }
            this.f30717a = iH;
        }
        return iH;
    }

    public abstract yu i(int i15, int i16);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new pu(this);
    }

    abstract void j(ou ouVar);

    protected final int n() {
        return this.f30717a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? iy.a(this) : iy.a(i(0, 47)).concat("..."));
    }
}
