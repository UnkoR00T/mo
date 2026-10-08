package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f29117b = new h0(h1.f29352c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e0 f29118c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29119a = 0;

    static {
        b0 b0Var = null;
        f29118c = u.b() ? new i0(b0Var) : new c0(b0Var);
    }

    a0() {
    }

    static int k(int i15, int i16, int i17) {
        int i18 = i16 - i15;
        if ((i15 | i16 | i18 | (i17 - i16)) >= 0) {
            return i18;
        }
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(32);
            sb5.append("Beginning index: ");
            sb5.append(i15);
            sb5.append(" < 0");
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        if (i16 < i15) {
            StringBuilder sb6 = new StringBuilder(66);
            sb6.append("Beginning index larger than ending index: ");
            sb6.append(i15);
            sb6.append(", ");
            sb6.append(i16);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        StringBuilder sb7 = new StringBuilder(37);
        sb7.append("End index: ");
        sb7.append(i16);
        sb7.append(" >= ");
        sb7.append(i17);
        throw new IndexOutOfBoundsException(sb7.toString());
    }

    public static a0 n(byte[] bArr, int i15, int i16) {
        return new h0(f29118c.a(bArr, i15, i16));
    }

    public static a0 o(String str) {
        return new h0(str.getBytes(h1.f29350a));
    }

    static f0 t(int i15) {
        return new f0(i15, null);
    }

    protected abstract int e(int i15, int i16, int i17);

    public abstract boolean equals(Object obj);

    public abstract a0 f(int i15, int i16);

    protected abstract String g(Charset charset);

    abstract void h(z zVar);

    public final int hashCode() {
        int iE = this.f29119a;
        if (iE == 0) {
            int size = size();
            iE = e(size, 0, size);
            if (iE == 0) {
                iE = 1;
            }
            this.f29119a = iE;
        }
        return iE;
    }

    public abstract boolean i();

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new b0(this);
    }

    protected final int j() {
        return this.f29119a;
    }

    public abstract byte s(int i15);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public final String u() {
        return size() == 0 ? "" : g(h1.f29350a);
    }
}
