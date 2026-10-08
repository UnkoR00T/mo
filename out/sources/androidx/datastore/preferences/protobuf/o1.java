package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o1 f12059f = new o1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f12061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f12062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12064e;

    private o1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i15) {
        int[] iArr = this.f12061b;
        if (i15 > iArr.length) {
            int i16 = this.f12060a;
            int i17 = i16 + (i16 / 2);
            if (i17 >= i15) {
                i15 = i17;
            }
            if (i15 < 8) {
                i15 = 8;
            }
            this.f12061b = Arrays.copyOf(iArr, i15);
            this.f12062c = Arrays.copyOf(this.f12062c, i15);
        }
    }

    public static o1 c() {
        return f12059f;
    }

    private static int f(int[] iArr, int i15) {
        int i16 = 17;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        return i16;
    }

    private static int g(Object[] objArr, int i15) {
        int iHashCode = 17;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return iHashCode;
    }

    static o1 j(o1 o1Var, o1 o1Var2) {
        int i15 = o1Var.f12060a + o1Var2.f12060a;
        int[] iArrCopyOf = Arrays.copyOf(o1Var.f12061b, i15);
        System.arraycopy(o1Var2.f12061b, 0, iArrCopyOf, o1Var.f12060a, o1Var2.f12060a);
        Object[] objArrCopyOf = Arrays.copyOf(o1Var.f12062c, i15);
        System.arraycopy(o1Var2.f12062c, 0, objArrCopyOf, o1Var.f12060a, o1Var2.f12060a);
        return new o1(i15, iArrCopyOf, objArrCopyOf, true);
    }

    static o1 k() {
        return new o1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (!objArr[i16].equals(objArr2[i16])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (iArr[i16] != iArr2[i16]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i15, Object obj, t1 t1Var) {
        int iA = s1.a(i15);
        int iB = s1.b(i15);
        if (iB == 0) {
            t1Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            t1Var.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            t1Var.K(iA, (g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(a0.e());
            }
            t1Var.c(iA, ((Integer) obj).intValue());
        } else if (t1Var.t() == t1.a.ASCENDING) {
            t1Var.x(iA);
            ((o1) obj).r(t1Var);
            t1Var.C(iA);
        } else {
            t1Var.C(iA);
            ((o1) obj).r(t1Var);
            t1Var.x(iA);
        }
    }

    void a() {
        if (!this.f12064e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iX;
        int i15 = this.f12063d;
        if (i15 != -1) {
            return i15;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f12060a; i17++) {
            int i18 = this.f12061b[i17];
            int iA = s1.a(i18);
            int iB = s1.b(i18);
            if (iB == 0) {
                iX = j.X(iA, ((Long) this.f12062c[i17]).longValue());
            } else if (iB == 1) {
                iX = j.o(iA, ((Long) this.f12062c[i17]).longValue());
            } else if (iB == 2) {
                iX = j.g(iA, (g) this.f12062c[i17]);
            } else if (iB == 3) {
                iX = (j.U(iA) * 2) + ((o1) this.f12062c[i17]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(a0.e());
                }
                iX = j.m(iA, ((Integer) this.f12062c[i17]).intValue());
            }
            i16 += iX;
        }
        this.f12063d = i16;
        return i16;
    }

    public int e() {
        int i15 = this.f12063d;
        if (i15 != -1) {
            return i15;
        }
        int iJ = 0;
        for (int i16 = 0; i16 < this.f12060a; i16++) {
            iJ += j.J(s1.a(this.f12061b[i16]), (g) this.f12062c[i16]);
        }
        this.f12063d = iJ;
        return iJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i15 = this.f12060a;
        return i15 == o1Var.f12060a && o(this.f12061b, o1Var.f12061b, i15) && l(this.f12062c, o1Var.f12062c, this.f12060a);
    }

    public void h() {
        if (this.f12064e) {
            this.f12064e = false;
        }
    }

    public int hashCode() {
        int i15 = this.f12060a;
        return ((((527 + i15) * 31) + f(this.f12061b, i15)) * 31) + g(this.f12062c, this.f12060a);
    }

    o1 i(o1 o1Var) {
        if (o1Var.equals(c())) {
            return this;
        }
        a();
        int i15 = this.f12060a + o1Var.f12060a;
        b(i15);
        System.arraycopy(o1Var.f12061b, 0, this.f12061b, this.f12060a, o1Var.f12060a);
        System.arraycopy(o1Var.f12062c, 0, this.f12062c, this.f12060a, o1Var.f12060a);
        this.f12060a = i15;
        return this;
    }

    final void m(StringBuilder sb5, int i15) {
        for (int i16 = 0; i16 < this.f12060a; i16++) {
            t0.d(sb5, i15, String.valueOf(s1.a(this.f12061b[i16])), this.f12062c[i16]);
        }
    }

    void n(int i15, Object obj) {
        a();
        b(this.f12060a + 1);
        int[] iArr = this.f12061b;
        int i16 = this.f12060a;
        iArr[i16] = i15;
        this.f12062c[i16] = obj;
        this.f12060a = i16 + 1;
    }

    void p(t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            for (int i15 = this.f12060a - 1; i15 >= 0; i15--) {
                t1Var.b(s1.a(this.f12061b[i15]), this.f12062c[i15]);
            }
            return;
        }
        for (int i16 = 0; i16 < this.f12060a; i16++) {
            t1Var.b(s1.a(this.f12061b[i16]), this.f12062c[i16]);
        }
    }

    public void r(t1 t1Var) {
        if (this.f12060a == 0) {
            return;
        }
        if (t1Var.t() == t1.a.ASCENDING) {
            for (int i15 = 0; i15 < this.f12060a; i15++) {
                q(this.f12061b[i15], this.f12062c[i15], t1Var);
            }
            return;
        }
        for (int i16 = this.f12060a - 1; i16 >= 0; i16--) {
            q(this.f12061b[i16], this.f12062c[i16], t1Var);
        }
    }

    private o1(int i15, int[] iArr, Object[] objArr, boolean z15) {
        this.f12063d = -1;
        this.f12060a = i15;
        this.f12061b = iArr;
        this.f12062c = objArr;
        this.f12064e = z15;
    }
}
