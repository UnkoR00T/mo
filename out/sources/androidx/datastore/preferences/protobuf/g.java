package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f11949b = new j(z.f12230d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f11950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<g> f11951d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11952a = 0;

    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11953a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11954b;

        a() {
            this.f11954b = g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0257g
        public byte b() {
            int i15 = this.f11953a;
            if (i15 >= this.f11954b) {
                throw new NoSuchElementException();
            }
            this.f11953a = i15 + 1;
            return g.this.o(i15);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11953a < this.f11954b;
        }
    }

    class b implements Comparator<g> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0257g it = gVar.iterator();
            InterfaceC0257g it4 = gVar2.iterator();
            while (it.hasNext() && it4.hasNext()) {
                int iCompareTo = Integer.valueOf(g.C(it.b())).compareTo(Integer.valueOf(g.C(it4.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    static abstract class c implements InterfaceC0257g {
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

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] a(byte[] bArr, int i15, int i16) {
            return Arrays.copyOfRange(bArr, i15, i16 + i15);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f11956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f11957g;

        e(byte[] bArr, int i15, int i16) {
            super(bArr);
            g.h(i15, i15 + i16, bArr.length);
            this.f11956f = i15;
            this.f11957g = i16;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j
        protected int Q() {
            return this.f11956f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte f(int i15) {
            g.g(i15, size());
            return this.f11960e[this.f11956f + i15];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        protected void n(byte[] bArr, int i15, int i16, int i17) {
            System.arraycopy(this.f11960e, Q() + i15, bArr, i16, i17);
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        byte o(int i15) {
            return this.f11960e[this.f11956f + i15];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f11957g;
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int i15, int i16);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0257g extends Iterator<Byte> {
        byte b();
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.datastore.preferences.protobuf.j f11958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f11959b;

        /* synthetic */ h(int i15, a aVar) {
            this(i15);
        }

        public g a() {
            this.f11958a.c();
            return new j(this.f11959b);
        }

        public androidx.datastore.preferences.protobuf.j b() {
            return this.f11958a;
        }

        private h(int i15) {
            byte[] bArr = new byte[i15];
            this.f11959b = bArr;
            this.f11958a = androidx.datastore.preferences.protobuf.j.f0(bArr);
        }
    }

    static abstract class i extends g {
        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        private i() {
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f11960e;

        j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f11960e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g A(int i15, int i16) {
            int iH = g.h(i15, i16, size());
            return iH == 0 ? g.f11949b : new e(this.f11960e, Q() + i15, iH);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        final void L(androidx.datastore.preferences.protobuf.f fVar) {
            fVar.a(this.f11960e, Q(), size());
        }

        final boolean M(g gVar, int i15, int i16) {
            if (i16 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i16 + size());
            }
            int i17 = i15 + i16;
            if (i17 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i15 + ", " + i16 + ", " + gVar.size());
            }
            if (!(gVar instanceof j)) {
                return gVar.A(i15, i17).equals(A(0, i16));
            }
            j jVar = (j) gVar;
            byte[] bArr = this.f11960e;
            byte[] bArr2 = jVar.f11960e;
            int iQ = Q() + i16;
            int iQ2 = Q();
            int iQ3 = jVar.Q() + i15;
            while (iQ2 < iQ) {
                if (bArr[iQ2] != bArr2[iQ3]) {
                    return false;
                }
                iQ2++;
                iQ3++;
            }
            return true;
        }

        protected int Q() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iW = w();
            int iW2 = jVar.w();
            if (iW == 0 || iW2 == 0 || iW == iW2) {
                return M(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte f(int i15) {
            return this.f11960e[i15];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected void n(byte[] bArr, int i15, int i16, int i17) {
            System.arraycopy(this.f11960e, i15, bArr, i16, i17);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        byte o(int i15) {
            return this.f11960e[i15];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f11960e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final androidx.datastore.preferences.protobuf.h u() {
            return androidx.datastore.preferences.protobuf.h.k(this.f11960e, Q(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final int v(int i15, int i16, int i17) {
            return z.h(i15, this.f11960e, Q() + i16, i17);
        }
    }

    private static final class k implements f {
        private k() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
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
        f11950c = androidx.datastore.preferences.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f11951d = new b();
    }

    g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int C(byte b15) {
        return b15 & 255;
    }

    private String E() {
        if (size() <= 50) {
            return l1.a(this);
        }
        return l1.a(A(0, 47)) + "...";
    }

    static g F(byte[] bArr) {
        return new j(bArr);
    }

    static g G(byte[] bArr, int i15, int i16) {
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

    public static g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static g j(byte[] bArr, int i15, int i16) {
        h(i15, i15 + i16, bArr.length);
        return new j(f11950c.a(bArr, i15, i16));
    }

    public static g k(String str) {
        return new j(str.getBytes(z.f12228b));
    }

    static h t(int i15) {
        return new h(i15, null);
    }

    public abstract g A(int i15, int i16);

    public final byte[] B() {
        int size = size();
        if (size == 0) {
            return z.f12230d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    abstract void L(androidx.datastore.preferences.protobuf.f fVar);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i15);

    public final int hashCode() {
        int iV = this.f11952a;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f11952a = iV;
        }
        return iV;
    }

    protected abstract void n(byte[] bArr, int i15, int i16, int i17);

    abstract byte o(int i15);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC0257g iterator() {
        return new a();
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), E());
    }

    public abstract androidx.datastore.preferences.protobuf.h u();

    protected abstract int v(int i15, int i16, int i17);

    protected final int w() {
        return this.f11952a;
    }
}
