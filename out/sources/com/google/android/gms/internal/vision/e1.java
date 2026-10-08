package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f30998b = new p1(p2.f31224c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k1 f30999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<e1> f31000d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31001a = 0;

    static {
        d1 d1Var = null;
        f30999c = w0.b() ? new o1(d1Var) : new i1(d1Var);
        f31000d = new g1();
    }

    e1() {
    }

    public static e1 j(String str) {
        return new p1(str.getBytes(p2.f31222a));
    }

    public static e1 k(byte[] bArr, int i15, int i16) {
        u(i15, i15 + i16, bArr.length);
        return new p1(f30999c.b(bArr, i15, i16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t(byte b15) {
        return b15 & 255;
    }

    static int u(int i15, int i16, int i17) {
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

    static n1 w(int i15) {
        return new n1(i15, null);
    }

    protected final int A() {
        return this.f31001a;
    }

    public abstract boolean a();

    public abstract byte e(int i15);

    public abstract boolean equals(Object obj);

    public abstract int f();

    protected abstract int h(int i15, int i16, int i17);

    public final int hashCode() {
        int iH = this.f31001a;
        if (iH == 0) {
            int iF = f();
            iH = h(iF, 0, iF);
            if (iH == 0) {
                iH = 1;
            }
            this.f31001a = iH;
        }
        return iH;
    }

    public abstract e1 i(int i15, int i16);

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new d1(this);
    }

    protected abstract String n(Charset charset);

    abstract void o(b1 b1Var);

    abstract byte s(int i15);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f()), f() <= 50 ? y4.a(this) : String.valueOf(y4.a(i(0, 47))).concat("..."));
    }

    public final String v() {
        return f() == 0 ? "" : n(p2.f31222a);
    }
}
