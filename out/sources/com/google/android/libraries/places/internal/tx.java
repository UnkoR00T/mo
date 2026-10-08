package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tx implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tx f33820b = new sx(jz.f32680a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33821a = 0;

    static {
        int i15 = kx.f32765a;
    }

    tx() {
    }

    static tx o(byte[] bArr, int i15, int i16, boolean z15) {
        if (i16 == 0) {
            return f33820b;
        }
        u(i15, i15 + i16, bArr.length);
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        return new sx(bArr2);
    }

    static tx s(byte[] bArr, boolean z15) {
        return bArr.length == 0 ? f33820b : new sx(bArr);
    }

    static int u(int i15, int i16, int i17) {
        int i18 = i16 - i15;
        if ((i15 | i16 | i18 | (i17 - i16)) >= 0) {
            return i18;
        }
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 21);
            sb5.append("Beginning index: ");
            sb5.append(i15);
            sb5.append(" < 0");
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        if (i16 < i15) {
            StringBuilder sb6 = new StringBuilder(String.valueOf(i15).length() + 44 + String.valueOf(i16).length());
            sb6.append("Beginning index larger than ending index: ");
            sb6.append(i15);
            sb6.append(", ");
            sb6.append(i16);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        StringBuilder sb7 = new StringBuilder(String.valueOf(i16).length() + 15 + String.valueOf(i17).length());
        sb7.append("End index: ");
        sb7.append(i16);
        sb7.append(" >= ");
        sb7.append(i17);
        throw new IndexOutOfBoundsException(sb7.toString());
    }

    static /* synthetic */ boolean v(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        int i18 = i15 + i17;
        u(i15, i18, bArr.length);
        u(i16, i17 + i16, bArr2.length);
        while (i15 < i18) {
            if (bArr[i15] != bArr2[i16]) {
                return false;
            }
            i15++;
            i16++;
        }
        return true;
    }

    abstract byte e(int i15);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        int iF = f();
        if (iF != txVar.f()) {
            return false;
        }
        if (iF == 0) {
            return true;
        }
        int i15 = this.f33821a;
        int i16 = txVar.f33821a;
        if (i15 == 0 || i16 == 0 || i15 == i16) {
            return j(txVar);
        }
        return false;
    }

    public abstract int f();

    public abstract tx g(int i15, int i16);

    protected abstract void h(byte[] bArr, int i15, int i16, int i17);

    public final int hashCode() {
        int iK = this.f33821a;
        if (iK == 0) {
            int iF = f();
            iK = k(iF, 0, iF);
            if (iK == 0) {
                iK = 1;
            }
            this.f33821a = iK;
        }
        return iK;
    }

    abstract void i(mx mxVar);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new nx(this);
    }

    protected abstract boolean j(tx txVar);

    protected abstract int k(int i15, int i16, int i17);

    public abstract xx n();

    public final byte[] t() {
        int iF = f();
        if (iF == 0) {
            return jz.f32680a;
        }
        byte[] bArr = new byte[iF];
        h(bArr, 0, 0, iF);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f()), f() <= 50 ? d10.a(t()) : d10.a(g(0, 47).t()).concat("..."));
    }
}
