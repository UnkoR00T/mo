package ak;

import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
class m1<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Object[] f6907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f6908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f6909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f6910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f6911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    transient long[] f6912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient float f6913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f6914h;

    class a extends i1.a<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f6915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6916b;

        a(int i15) {
            this.f6915a = (K) m1.this.f6907a[i15];
            this.f6916b = i15;
        }

        void a() {
            int i15 = this.f6916b;
            if (i15 == -1 || i15 >= m1.this.v() || !zj.l.a(this.f6915a, m1.this.f6907a[this.f6916b])) {
                this.f6916b = m1.this.l(this.f6915a);
            }
        }

        @Override // ak.h1.a
        public K b() {
            return this.f6915a;
        }

        @Override // ak.h1.a
        public int getCount() {
            a();
            int i15 = this.f6916b;
            if (i15 == -1) {
                return 0;
            }
            return m1.this.f6908b[i15];
        }
    }

    m1() {
        m(3, 1.0f);
    }

    static <K> m1<K> a() {
        return new m1<>();
    }

    static <K> m1<K> b(int i15) {
        return new m1<>(i15);
    }

    private static int g(long j15) {
        return (int) (j15 >>> 32);
    }

    private static int i(long j15) {
        return (int) j15;
    }

    private int k() {
        return this.f6911e.length - 1;
    }

    private static long[] o(int i15) {
        long[] jArr = new long[i15];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] p(int i15) {
        int[] iArr = new int[i15];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void t(int i15) {
        int length = this.f6912f.length;
        if (i15 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                s(iMax);
            }
        }
    }

    private void u(int i15) {
        if (this.f6911e.length >= 1073741824) {
            this.f6914h = Integer.MAX_VALUE;
            return;
        }
        int i16 = ((int) (i15 * this.f6913g)) + 1;
        int[] iArrP = p(i15);
        long[] jArr = this.f6912f;
        int length = iArrP.length - 1;
        for (int i17 = 0; i17 < this.f6909c; i17++) {
            int iG = g(jArr[i17]);
            int i18 = iG & length;
            int i19 = iArrP[i18];
            iArrP[i18] = i17;
            jArr[i17] = (((long) iG) << 32) | (((long) i19) & BodyPartID.bodyIdMax);
        }
        this.f6914h = i16;
        this.f6911e = iArrP;
    }

    private static long w(long j15, int i15) {
        return (j15 & (-4294967296L)) | (BodyPartID.bodyIdMax & ((long) i15));
    }

    void c(int i15) {
        if (i15 > this.f6912f.length) {
            s(i15);
        }
        if (i15 >= this.f6914h) {
            u(Math.max(2, Integer.highestOneBit(i15 - 1) << 1));
        }
    }

    int d() {
        return this.f6909c == 0 ? -1 : 0;
    }

    public int e(Object obj) {
        int iL = l(obj);
        if (iL == -1) {
            return 0;
        }
        return this.f6908b[iL];
    }

    h1.a<K> f(int i15) {
        zj.p.o(i15, this.f6909c);
        return new a(i15);
    }

    K h(int i15) {
        zj.p.o(i15, this.f6909c);
        return (K) this.f6907a[i15];
    }

    int j(int i15) {
        zj.p.o(i15, this.f6909c);
        return this.f6908b[i15];
    }

    int l(Object obj) {
        int iC = k0.c(obj);
        int i15 = this.f6911e[k() & iC];
        while (i15 != -1) {
            long j15 = this.f6912f[i15];
            if (g(j15) == iC && zj.l.a(obj, this.f6907a[i15])) {
                return i15;
            }
            i15 = i(j15);
        }
        return -1;
    }

    void m(int i15, float f15) {
        zj.p.e(i15 >= 0, "Initial capacity must be non-negative");
        zj.p.e(f15 > 0.0f, "Illegal load factor");
        int iA = k0.a(i15, f15);
        this.f6911e = p(iA);
        this.f6913g = f15;
        this.f6907a = new Object[i15];
        this.f6908b = new int[i15];
        this.f6912f = o(i15);
        this.f6914h = Math.max(1, (int) (iA * f15));
    }

    void n(int i15, K k15, int i16, int i17) {
        this.f6912f[i15] = (((long) i17) << 32) | BodyPartID.bodyIdMax;
        this.f6907a[i15] = k15;
        this.f6908b[i15] = i16;
    }

    int q(int i15) {
        int i16 = i15 + 1;
        if (i16 < this.f6909c) {
            return i16;
        }
        return -1;
    }

    public int r(K k15, int i15) {
        y.c(i15, "count");
        long[] jArr = this.f6912f;
        Object[] objArr = this.f6907a;
        int[] iArr = this.f6908b;
        int iC = k0.c(k15);
        int iK = k() & iC;
        int i16 = this.f6909c;
        int[] iArr2 = this.f6911e;
        int i17 = iArr2[iK];
        if (i17 == -1) {
            iArr2[iK] = i16;
        } else {
            while (true) {
                long j15 = jArr[i17];
                if (g(j15) == iC && zj.l.a(k15, objArr[i17])) {
                    int i18 = iArr[i17];
                    iArr[i17] = i15;
                    return i18;
                }
                int i19 = i(j15);
                if (i19 == -1) {
                    jArr[i17] = w(j15, i16);
                    break;
                }
                i17 = i19;
            }
        }
        if (i16 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i25 = i16 + 1;
        t(i25);
        n(i16, k15, i15, iC);
        this.f6909c = i25;
        if (i16 >= this.f6914h) {
            u(this.f6911e.length * 2);
        }
        this.f6910d++;
        return 0;
    }

    void s(int i15) {
        this.f6907a = Arrays.copyOf(this.f6907a, i15);
        this.f6908b = Arrays.copyOf(this.f6908b, i15);
        long[] jArr = this.f6912f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i15);
        if (i15 > length) {
            Arrays.fill(jArrCopyOf, length, i15, -1L);
        }
        this.f6912f = jArrCopyOf;
    }

    int v() {
        return this.f6909c;
    }

    m1(m1<? extends K> m1Var) {
        m(m1Var.v(), 1.0f);
        int iD = m1Var.d();
        while (iD != -1) {
            r(m1Var.h(iD), m1Var.j(iD));
            iD = m1Var.q(iD);
        }
    }

    m1(int i15) {
        this(i15, 1.0f);
    }

    m1(int i15, float f15) {
        m(i15, f15);
    }
}
