package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f36058b = new j(a0.f36002d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f36059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<h> f36060d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36061a = 0;

    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36062a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36063b;

        a() {
            this.f36063b = h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.g
        public byte b() {
            int i15 = this.f36062a;
            if (i15 >= this.f36063b) {
                throw new NoSuchElementException();
            }
            this.f36062a = i15 + 1;
            return h.this.o(i15);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36062a < this.f36063b;
        }
    }

    class b implements Comparator<h> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            g it = hVar.iterator();
            g it4 = hVar2.iterator();
            while (it.hasNext() && it4.hasNext()) {
                int iCompareTo = Integer.valueOf(h.E(it.b())).compareTo(Integer.valueOf(h.E(it4.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(hVar.size()).compareTo(Integer.valueOf(hVar2.size()));
        }
    }

    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i15, int i16) {
            return Arrays.copyOfRange(bArr, i15, i16 + i15);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f36065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f36066g;

        e(byte[] bArr, int i15, int i16) {
            super(bArr);
            h.h(i15, i15 + i16, bArr.length);
            this.f36065f = i15;
            this.f36066g = i16;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j
        protected int V() {
            return this.f36065f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public byte f(int i15) {
            h.g(i15, size());
            return this.f36069e[this.f36065f + i15];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        protected void n(byte[] bArr, int i15, int i16, int i17) {
            System.arraycopy(this.f36069e, V() + i15, bArr, i16, i17);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        byte o(int i15) {
            return this.f36069e[this.f36065f + i15];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f36066g;
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int i15, int i16);
    }

    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    static final class C0758h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.crypto.tink.shaded.protobuf.k f36067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f36068b;

        /* synthetic */ C0758h(int i15, a aVar) {
            this(i15);
        }

        public h a() {
            this.f36067a.c();
            return new j(this.f36068b);
        }

        public com.google.crypto.tink.shaded.protobuf.k b() {
            return this.f36067a;
        }

        private C0758h(int i15) {
            byte[] bArr = new byte[i15];
            this.f36068b = bArr;
            this.f36067a = com.google.crypto.tink.shaded.protobuf.k.c0(bArr);
        }
    }

    static abstract class i extends h {
        i() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f36069e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f36069e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final h B(int i15, int i16) {
            int iH = h.h(i15, i16, size());
            return iH == 0 ? h.f36058b : new e(this.f36069e, V() + i15, iH);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final String G(Charset charset) {
            return new String(this.f36069e, V(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        final void T(com.google.crypto.tink.shaded.protobuf.g gVar) {
            gVar.a(this.f36069e, V(), size());
        }

        final boolean U(h hVar, int i15, int i16) {
            if (i16 > hVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i16 + size());
            }
            int i17 = i15 + i16;
            if (i17 > hVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i15 + ", " + i16 + ", " + hVar.size());
            }
            if (!(hVar instanceof j)) {
                return hVar.B(i15, i17).equals(B(0, i16));
            }
            j jVar = (j) hVar;
            byte[] bArr = this.f36069e;
            byte[] bArr2 = jVar.f36069e;
            int iV = V() + i16;
            int iV2 = V();
            int iV3 = jVar.V() + i15;
            while (iV2 < iV) {
                if (bArr[iV2] != bArr2[iV3]) {
                    return false;
                }
                iV2++;
                iV3++;
            }
            return true;
        }

        protected int V() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iA = A();
            int iA2 = jVar.A();
            if (iA == 0 || iA2 == 0 || iA == iA2) {
                return U(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte f(int i15) {
            return this.f36069e[i15];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected void n(byte[] bArr, int i15, int i16, int i17) {
            System.arraycopy(this.f36069e, i15, bArr, i16, i17);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        byte o(int i15) {
            return this.f36069e[i15];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean s() {
            int iV = V();
            return s1.n(this.f36069e, iV, size() + iV);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f36069e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final com.google.crypto.tink.shaded.protobuf.i v() {
            return com.google.crypto.tink.shaded.protobuf.i.j(this.f36069e, V(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final int w(int i15, int i16, int i17) {
            return a0.i(i15, this.f36069e, V() + i16, i17);
        }
    }

    private static final class k implements f {
        private k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i15, int i16) {
            byte[] bArr2 = new byte[i16];
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f36059c = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f36060d = new b();
    }

    h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(byte b15) {
        return b15 & 255;
    }

    private String M() {
        if (size() <= 50) {
            return l1.a(this);
        }
        return l1.a(B(0, 47)) + "...";
    }

    static h Q(byte[] bArr) {
        return new j(bArr);
    }

    static h R(byte[] bArr, int i15, int i16) {
        return new e(bArr, i15, i16);
    }

    static void g(int i15, int i16) {
        if (((i16 - (i15 + 1)) | i15) < 0) {
            if (i15 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i15);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i15 + ", " + i16);
        }
    }

    static int h(int i15, int i16, int i17) {
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

    public static h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static h j(byte[] bArr, int i15, int i16) {
        h(i15, i15 + i16, bArr.length);
        return new j(f36059c.a(bArr, i15, i16));
    }

    public static h k(String str) {
        return new j(str.getBytes(a0.f36000b));
    }

    static C0758h u(int i15) {
        return new C0758h(i15, null);
    }

    protected final int A() {
        return this.f36061a;
    }

    public abstract h B(int i15, int i16);

    public final byte[] C() {
        int size = size();
        if (size == 0) {
            return a0.f36002d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public final String F(Charset charset) {
        return size() == 0 ? "" : G(charset);
    }

    protected abstract String G(Charset charset);

    public final String L() {
        return F(a0.f36000b);
    }

    abstract void T(com.google.crypto.tink.shaded.protobuf.g gVar);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i15);

    public final int hashCode() {
        int iW = this.f36061a;
        if (iW == 0) {
            int size = size();
            iW = w(size, 0, size);
            if (iW == 0) {
                iW = 1;
            }
            this.f36061a = iW;
        }
        return iW;
    }

    protected abstract void n(byte[] bArr, int i15, int i16, int i17);

    abstract byte o(int i15);

    public abstract boolean s();

    public abstract int size();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), M());
    }

    public abstract com.google.crypto.tink.shaded.protobuf.i v();

    protected abstract int w(int i15, int i16, int i17);
}
