package bt;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes4.dex */
class u extends bt.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f21460h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f21462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bt.d f21463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21466g;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack<bt.d> f21467a;

        private b() {
            this.f21467a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bt.d b(bt.d dVar, bt.d dVar2) {
            c(dVar);
            c(dVar2);
            bt.d dVarPop = this.f21467a.pop();
            while (!this.f21467a.isEmpty()) {
                dVarPop = new u(this.f21467a.pop(), dVarPop);
            }
            return dVarPop;
        }

        private void c(bt.d dVar) {
            if (dVar.o()) {
                e(dVar);
                return;
            }
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                c(uVar.f21462c);
                c(uVar.f21463d);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb5 = new StringBuilder(strValueOf.length() + 49);
                sb5.append("Has a new type of ByteString been created? Found ");
                sb5.append(strValueOf);
                throw new IllegalArgumentException(sb5.toString());
            }
        }

        private int d(int i15) {
            int iBinarySearch = Arrays.binarySearch(u.f21460h, i15);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(bt.d dVar) {
            int iD = d(dVar.size());
            int i15 = u.f21460h[iD + 1];
            if (this.f21467a.isEmpty() || this.f21467a.peek().size() >= i15) {
                this.f21467a.push(dVar);
                return;
            }
            int i16 = u.f21460h[iD];
            bt.d dVarPop = this.f21467a.pop();
            while (true) {
                if (this.f21467a.isEmpty() || this.f21467a.peek().size() >= i16) {
                    break;
                } else {
                    dVarPop = new u(this.f21467a.pop(), dVarPop);
                }
            }
            u uVar = new u(dVarPop, dVar);
            while (!this.f21467a.isEmpty()) {
                if (this.f21467a.peek().size() >= u.f21460h[d(uVar.size()) + 1]) {
                    break;
                } else {
                    uVar = new u(this.f21467a.pop(), uVar);
                }
            }
            this.f21467a.push(uVar);
        }
    }

    private static class c implements Iterator<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack<u> f21468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f21469b;

        private p a(bt.d dVar) {
            while (dVar instanceof u) {
                u uVar = (u) dVar;
                this.f21468a.push(uVar);
                dVar = uVar.f21462c;
            }
            return (p) dVar;
        }

        private p c() {
            while (!this.f21468a.isEmpty()) {
                p pVarA = a(this.f21468a.pop().f21463d);
                if (!pVarA.isEmpty()) {
                    return pVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p next() {
            p pVar = this.f21469b;
            if (pVar == null) {
                throw new NoSuchElementException();
            }
            this.f21469b = c();
            return pVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21469b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(bt.d dVar) {
            this.f21468a = new Stack<>();
            this.f21469b = a(dVar);
        }
    }

    private class d implements bt.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f21470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private bt.d.a f21471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21472c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // bt.d.a
        public byte b() {
            if (!this.f21471b.hasNext()) {
                this.f21471b = this.f21470a.next().iterator();
            }
            this.f21472c--;
            return this.f21471b.b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21472c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(u.this);
            this.f21470a = cVar;
            this.f21471b = cVar.next().iterator();
            this.f21472c = u.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        int i16 = 1;
        while (i15 > 0) {
            arrayList.add(Integer.valueOf(i15));
            int i17 = i16 + i15;
            i16 = i15;
            i15 = i17;
        }
        arrayList.add(Integer.MAX_VALUE);
        f21460h = new int[arrayList.size()];
        int i18 = 0;
        while (true) {
            int[] iArr = f21460h;
            if (i18 >= iArr.length) {
                return;
            }
            iArr[i18] = ((Integer) arrayList.get(i18)).intValue();
            i18++;
        }
    }

    static bt.d M(bt.d dVar, bt.d dVar2) {
        u uVar = dVar instanceof u ? (u) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() == 0) {
            return dVar2;
        }
        int size = dVar.size() + dVar2.size();
        if (size < 128) {
            return P(dVar, dVar2);
        }
        if (uVar != null && uVar.f21463d.size() + dVar2.size() < 128) {
            return new u(uVar.f21462c, P(uVar.f21463d, dVar2));
        }
        if (uVar == null || uVar.f21462c.n() <= uVar.f21463d.n() || uVar.n() <= dVar2.n()) {
            return size >= f21460h[Math.max(dVar.n(), dVar2.n()) + 1] ? new u(dVar, dVar2) : new b().b(dVar, dVar2);
        }
        return new u(uVar.f21462c, new u(uVar.f21463d, dVar2));
    }

    private static p P(bt.d dVar, bt.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.k(bArr, 0, 0, size);
        dVar2.k(bArr, 0, size, size2);
        return new p(bArr);
    }

    private boolean Q(bt.d dVar) {
        c cVar = new c(this);
        p next = cVar.next();
        c cVar2 = new c(dVar);
        p next2 = cVar2.next();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int size = next.size() - i15;
            int size2 = next2.size() - i16;
            int iMin = Math.min(size, size2);
            if (!(i15 == 0 ? next.G(next2, i16, iMin) : next2.G(next, i15, iMin))) {
                return false;
            }
            i17 += iMin;
            int i18 = this.f21461b;
            if (i17 >= i18) {
                if (i17 == i18) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i15 = 0;
            } else {
                i15 += iMin;
            }
            if (iMin == size2) {
                next2 = cVar2.next();
                i16 = 0;
            } else {
                i16 += iMin;
            }
        }
    }

    @Override // bt.d
    public String A(String str) {
        return new String(z(), str);
    }

    @Override // bt.d
    void E(OutputStream outputStream, int i15, int i16) {
        int i17 = i15 + i16;
        int i18 = this.f21464e;
        if (i17 <= i18) {
            this.f21462c.E(outputStream, i15, i16);
        } else {
            if (i15 >= i18) {
                this.f21463d.E(outputStream, i15 - i18, i16);
                return;
            }
            int i19 = i18 - i15;
            this.f21462c.E(outputStream, i15, i19);
            this.f21463d.E(outputStream, 0, i16 - i19);
        }
    }

    public boolean equals(Object obj) {
        int iX;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bt.d)) {
            return false;
        }
        bt.d dVar = (bt.d) obj;
        if (this.f21461b != dVar.size()) {
            return false;
        }
        if (this.f21461b == 0) {
            return true;
        }
        if (this.f21466g == 0 || (iX = dVar.x()) == 0 || this.f21466g == iX) {
            return Q(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iV = this.f21466g;
        if (iV == 0) {
            int i15 = this.f21461b;
            iV = v(i15, 0, i15);
            if (iV == 0) {
                iV = 1;
            }
            this.f21466g = iV;
        }
        return iV;
    }

    @Override // bt.d
    protected void l(byte[] bArr, int i15, int i16, int i17) {
        int i18 = i15 + i17;
        int i19 = this.f21464e;
        if (i18 <= i19) {
            this.f21462c.l(bArr, i15, i16, i17);
        } else {
            if (i15 >= i19) {
                this.f21463d.l(bArr, i15 - i19, i16, i17);
                return;
            }
            int i25 = i19 - i15;
            this.f21462c.l(bArr, i15, i16, i25);
            this.f21463d.l(bArr, 0, i16 + i25, i17 - i25);
        }
    }

    @Override // bt.d
    protected int n() {
        return this.f21465f;
    }

    @Override // bt.d
    protected boolean o() {
        return this.f21461b >= f21460h[this.f21465f];
    }

    @Override // bt.d
    public boolean q() {
        int iW = this.f21462c.w(0, 0, this.f21464e);
        bt.d dVar = this.f21463d;
        return dVar.w(iW, 0, dVar.size()) == 0;
    }

    @Override // bt.d, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public bt.d.a iterator() {
        return new d();
    }

    @Override // bt.d
    public int size() {
        return this.f21461b;
    }

    @Override // bt.d
    public bt.e t() {
        return bt.e.h(new e());
    }

    @Override // bt.d
    protected int v(int i15, int i16, int i17) {
        int i18 = i16 + i17;
        int i19 = this.f21464e;
        if (i18 <= i19) {
            return this.f21462c.v(i15, i16, i17);
        }
        if (i16 >= i19) {
            return this.f21463d.v(i15, i16 - i19, i17);
        }
        int i25 = i19 - i16;
        return this.f21463d.v(this.f21462c.v(i15, i16, i25), 0, i17 - i25);
    }

    @Override // bt.d
    protected int w(int i15, int i16, int i17) {
        int i18 = i16 + i17;
        int i19 = this.f21464e;
        if (i18 <= i19) {
            return this.f21462c.w(i15, i16, i17);
        }
        if (i16 >= i19) {
            return this.f21463d.w(i15, i16 - i19, i17);
        }
        int i25 = i19 - i16;
        return this.f21463d.w(this.f21462c.w(i15, i16, i25), 0, i17 - i25);
    }

    @Override // bt.d
    protected int x() {
        return this.f21466g;
    }

    private u(bt.d dVar, bt.d dVar2) {
        this.f21466g = 0;
        this.f21462c = dVar;
        this.f21463d = dVar2;
        int size = dVar.size();
        this.f21464e = size;
        this.f21461b = size + dVar2.size();
        this.f21465f = Math.max(dVar.n(), dVar2.n()) + 1;
    }

    private class e extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f21474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f21475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f21479f;

        public e() {
            h();
        }

        private void b() {
            if (this.f21475b != null) {
                int i15 = this.f21477d;
                int i16 = this.f21476c;
                if (i15 == i16) {
                    this.f21478e += i16;
                    this.f21477d = 0;
                    if (!this.f21474a.hasNext()) {
                        this.f21475b = null;
                        this.f21476c = 0;
                    } else {
                        p next = this.f21474a.next();
                        this.f21475b = next;
                        this.f21476c = next.size();
                    }
                }
            }
        }

        private void h() {
            c cVar = new c(u.this);
            this.f21474a = cVar;
            p next = cVar.next();
            this.f21475b = next;
            this.f21476c = next.size();
            this.f21477d = 0;
            this.f21478e = 0;
        }

        private int m(byte[] bArr, int i15, int i16) {
            int i17 = i16;
            while (i17 > 0) {
                b();
                if (this.f21475b == null) {
                    if (i17 != i16) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f21476c - this.f21477d, i17);
                if (bArr != null) {
                    this.f21475b.k(bArr, this.f21477d, i15, iMin);
                    i15 += iMin;
                }
                this.f21477d += iMin;
                i17 -= iMin;
            }
            return i16 - i17;
        }

        @Override // java.io.InputStream
        public int available() {
            return u.this.size() - (this.f21478e + this.f21477d);
        }

        @Override // java.io.InputStream
        public void mark(int i15) {
            this.f21479f = this.f21478e + this.f21477d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i15, int i16) {
            bArr.getClass();
            if (i15 < 0 || i16 < 0 || i16 > bArr.length - i15) {
                throw new IndexOutOfBoundsException();
            }
            return m(bArr, i15, i16);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            h();
            m(null, 0, this.f21479f);
        }

        @Override // java.io.InputStream
        public long skip(long j15) {
            if (j15 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j15 > 2147483647L) {
                j15 = 2147483647L;
            }
            return m(null, 0, (int) j15);
        }

        @Override // java.io.InputStream
        public int read() {
            b();
            p pVar = this.f21475b;
            if (pVar == null) {
                return -1;
            }
            int i15 = this.f21477d;
            this.f21477d = i15 + 1;
            return pVar.F(i15) & 255;
        }
    }
}
