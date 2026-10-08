package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class m5 extends s4<m5> implements Cloneable {
    private int[] A;
    private long B;
    private b5 C;
    public boolean D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29434c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f29435d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f29436e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f29437f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29438g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f29439h = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29440j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29441k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n5[] f29442l = n5.l();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f29443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a5 f29444n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f29445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f29447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private j5 f29448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f29449t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f29450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private k5 f29451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f29452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f29453y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f29454z;

    public m5() {
        byte[] bArr = z4.f29624h;
        this.f29443m = bArr;
        this.f29444n = null;
        this.f29445p = bArr;
        this.f29446q = "";
        this.f29447r = "";
        this.f29448s = null;
        this.f29449t = "";
        this.f29450v = 180000L;
        this.f29451w = null;
        this.f29452x = bArr;
        this.f29453y = "";
        this.f29454z = 0;
        this.A = z4.f29617a;
        this.B = 0L;
        this.C = null;
        this.D = false;
        this.f29537b = null;
        this.f29584a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final m5 clone() {
        try {
            m5 m5Var = (m5) super.clone();
            n5[] n5VarArr = this.f29442l;
            if (n5VarArr != null && n5VarArr.length > 0) {
                m5Var.f29442l = new n5[n5VarArr.length];
                int i15 = 0;
                while (true) {
                    n5[] n5VarArr2 = this.f29442l;
                    if (i15 >= n5VarArr2.length) {
                        break;
                    }
                    n5 n5Var = n5VarArr2[i15];
                    if (n5Var != null) {
                        m5Var.f29442l[i15] = (n5) n5Var.clone();
                    }
                    i15++;
                }
            }
            a5 a5Var = this.f29444n;
            if (a5Var != null) {
                m5Var.f29444n = a5Var;
            }
            j5 j5Var = this.f29448s;
            if (j5Var != null) {
                m5Var.f29448s = (j5) j5Var.clone();
            }
            k5 k5Var = this.f29451w;
            if (k5Var != null) {
                m5Var.f29451w = (k5) k5Var.clone();
            }
            int[] iArr = this.A;
            if (iArr != null && iArr.length > 0) {
                m5Var.A = (int[]) iArr.clone();
            }
            b5 b5Var = this.C;
            if (b5Var != null) {
                m5Var.C = b5Var;
            }
            return m5Var;
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    public final void b(q4 q4Var) throws r4 {
        long j15 = this.f29434c;
        if (j15 != 0) {
            q4Var.u(1, j15);
        }
        String str = this.f29437f;
        if (str != null && !str.equals("")) {
            q4Var.c(2, this.f29437f);
        }
        n5[] n5VarArr = this.f29442l;
        int i15 = 0;
        if (n5VarArr != null && n5VarArr.length > 0) {
            int i16 = 0;
            while (true) {
                n5[] n5VarArr2 = this.f29442l;
                if (i16 >= n5VarArr2.length) {
                    break;
                }
                n5 n5Var = n5VarArr2[i16];
                if (n5Var != null) {
                    q4Var.b(3, n5Var);
                }
                i16++;
            }
        }
        byte[] bArr = this.f29443m;
        byte[] bArr2 = z4.f29624h;
        if (!Arrays.equals(bArr, bArr2)) {
            q4Var.d(4, this.f29443m);
        }
        if (!Arrays.equals(this.f29445p, bArr2)) {
            q4Var.d(6, this.f29445p);
        }
        j5 j5Var = this.f29448s;
        if (j5Var != null) {
            q4Var.b(7, j5Var);
        }
        String str2 = this.f29446q;
        if (str2 != null && !str2.equals("")) {
            q4Var.c(8, this.f29446q);
        }
        a5 a5Var = this.f29444n;
        if (a5Var != null) {
            q4Var.o(9, a5Var);
        }
        int i17 = this.f29438g;
        if (i17 != 0) {
            q4Var.l(11, i17);
        }
        String str3 = this.f29447r;
        if (str3 != null && !str3.equals("")) {
            q4Var.c(13, this.f29447r);
        }
        String str4 = this.f29449t;
        if (str4 != null && !str4.equals("")) {
            q4Var.c(14, this.f29449t);
        }
        long j16 = this.f29450v;
        if (j16 != 180000) {
            q4Var.j(15, 0);
            q4Var.w(q4.v(j16));
        }
        k5 k5Var = this.f29451w;
        if (k5Var != null) {
            q4Var.b(16, k5Var);
        }
        long j17 = this.f29435d;
        if (j17 != 0) {
            q4Var.u(17, j17);
        }
        if (!Arrays.equals(this.f29452x, bArr2)) {
            q4Var.d(18, this.f29452x);
        }
        int[] iArr = this.A;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.A;
                if (i15 >= iArr2.length) {
                    break;
                }
                q4Var.l(20, iArr2[i15]);
                i15++;
            }
        }
        b5 b5Var = this.C;
        if (b5Var != null) {
            q4Var.o(23, b5Var);
        }
        String str5 = this.f29453y;
        if (str5 != null && !str5.equals("")) {
            q4Var.c(24, this.f29453y);
        }
        boolean z15 = this.D;
        if (z15) {
            q4Var.k(25, z15);
        }
        String str6 = this.f29439h;
        if (str6 != null && !str6.equals("")) {
            q4Var.c(26, this.f29439h);
        }
        super.b(q4Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        if (this.f29434c != m5Var.f29434c || this.f29435d != m5Var.f29435d) {
            return false;
        }
        String str = this.f29437f;
        if (str == null) {
            if (m5Var.f29437f != null) {
                return false;
            }
        } else if (!str.equals(m5Var.f29437f)) {
            return false;
        }
        if (this.f29438g != m5Var.f29438g) {
            return false;
        }
        String str2 = this.f29439h;
        if (str2 == null) {
            if (m5Var.f29439h != null) {
                return false;
            }
        } else if (!str2.equals(m5Var.f29439h)) {
            return false;
        }
        if (!v4.c(this.f29442l, m5Var.f29442l) || !Arrays.equals(this.f29443m, m5Var.f29443m)) {
            return false;
        }
        a5 a5Var = this.f29444n;
        if (a5Var == null) {
            if (m5Var.f29444n != null) {
                return false;
            }
        } else if (!a5Var.equals(m5Var.f29444n)) {
            return false;
        }
        if (!Arrays.equals(this.f29445p, m5Var.f29445p)) {
            return false;
        }
        String str3 = this.f29446q;
        if (str3 == null) {
            if (m5Var.f29446q != null) {
                return false;
            }
        } else if (!str3.equals(m5Var.f29446q)) {
            return false;
        }
        String str4 = this.f29447r;
        if (str4 == null) {
            if (m5Var.f29447r != null) {
                return false;
            }
        } else if (!str4.equals(m5Var.f29447r)) {
            return false;
        }
        j5 j5Var = this.f29448s;
        if (j5Var == null) {
            if (m5Var.f29448s != null) {
                return false;
            }
        } else if (!j5Var.equals(m5Var.f29448s)) {
            return false;
        }
        String str5 = this.f29449t;
        if (str5 == null) {
            if (m5Var.f29449t != null) {
                return false;
            }
        } else if (!str5.equals(m5Var.f29449t)) {
            return false;
        }
        if (this.f29450v != m5Var.f29450v) {
            return false;
        }
        k5 k5Var = this.f29451w;
        if (k5Var == null) {
            if (m5Var.f29451w != null) {
                return false;
            }
        } else if (!k5Var.equals(m5Var.f29451w)) {
            return false;
        }
        if (!Arrays.equals(this.f29452x, m5Var.f29452x)) {
            return false;
        }
        String str6 = this.f29453y;
        if (str6 == null) {
            if (m5Var.f29453y != null) {
                return false;
            }
        } else if (!str6.equals(m5Var.f29453y)) {
            return false;
        }
        if (!v4.a(this.A, m5Var.A)) {
            return false;
        }
        b5 b5Var = this.C;
        if (b5Var == null) {
            if (m5Var.C != null) {
                return false;
            }
        } else if (!b5Var.equals(m5Var.C)) {
            return false;
        }
        if (this.D != m5Var.D) {
            return false;
        }
        t4 t4Var = this.f29537b;
        if (t4Var != null && !t4Var.b()) {
            return this.f29537b.equals(m5Var.f29537b);
        }
        t4 t4Var2 = m5Var.f29537b;
        return t4Var2 == null || t4Var2.b();
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    protected final int g() {
        int[] iArr;
        int iG = super.g();
        long j15 = this.f29434c;
        if (j15 != 0) {
            iG += q4.m(1, j15);
        }
        String str = this.f29437f;
        if (str != null && !str.equals("")) {
            iG += q4.h(2, this.f29437f);
        }
        n5[] n5VarArr = this.f29442l;
        int i15 = 0;
        if (n5VarArr != null && n5VarArr.length > 0) {
            int i16 = 0;
            while (true) {
                n5[] n5VarArr2 = this.f29442l;
                if (i16 >= n5VarArr2.length) {
                    break;
                }
                n5 n5Var = n5VarArr2[i16];
                if (n5Var != null) {
                    iG += q4.g(3, n5Var);
                }
                i16++;
            }
        }
        byte[] bArr = this.f29443m;
        byte[] bArr2 = z4.f29624h;
        if (!Arrays.equals(bArr, bArr2)) {
            iG += q4.i(4, this.f29443m);
        }
        if (!Arrays.equals(this.f29445p, bArr2)) {
            iG += q4.i(6, this.f29445p);
        }
        j5 j5Var = this.f29448s;
        if (j5Var != null) {
            iG += q4.g(7, j5Var);
        }
        String str2 = this.f29446q;
        if (str2 != null && !str2.equals("")) {
            iG += q4.h(8, this.f29446q);
        }
        a5 a5Var = this.f29444n;
        if (a5Var != null) {
            iG += m0.O(9, a5Var);
        }
        int i17 = this.f29438g;
        if (i17 != 0) {
            iG += q4.y(11) + q4.z(i17);
        }
        String str3 = this.f29447r;
        if (str3 != null && !str3.equals("")) {
            iG += q4.h(13, this.f29447r);
        }
        String str4 = this.f29449t;
        if (str4 != null && !str4.equals("")) {
            iG += q4.h(14, this.f29449t);
        }
        long j16 = this.f29450v;
        if (j16 != 180000) {
            iG += q4.y(15) + q4.x(q4.v(j16));
        }
        k5 k5Var = this.f29451w;
        if (k5Var != null) {
            iG += q4.g(16, k5Var);
        }
        long j17 = this.f29435d;
        if (j17 != 0) {
            iG += q4.m(17, j17);
        }
        if (!Arrays.equals(this.f29452x, bArr2)) {
            iG += q4.i(18, this.f29452x);
        }
        int[] iArr2 = this.A;
        if (iArr2 != null && iArr2.length > 0) {
            int iZ = 0;
            while (true) {
                iArr = this.A;
                if (i15 >= iArr.length) {
                    break;
                }
                iZ += q4.z(iArr[i15]);
                i15++;
            }
            iG = iG + iZ + (iArr.length * 2);
        }
        b5 b5Var = this.C;
        if (b5Var != null) {
            iG += m0.O(23, b5Var);
        }
        String str5 = this.f29453y;
        if (str5 != null && !str5.equals("")) {
            iG += q4.h(24, this.f29453y);
        }
        if (this.D) {
            iG += q4.y(25) + 1;
        }
        String str6 = this.f29439h;
        return (str6 == null || str6.equals("")) ? iG : iG + q4.h(26, this.f29439h);
    }

    public final int hashCode() {
        int iHashCode = (m5.class.getName().hashCode() + 527) * 31;
        long j15 = this.f29434c;
        int i15 = (iHashCode + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f29435d;
        int i16 = (i15 + ((int) (j16 ^ (j16 >>> 32)))) * 961;
        String str = this.f29437f;
        int iHashCode2 = 0;
        int iHashCode3 = (((i16 + (str == null ? 0 : str.hashCode())) * 31) + this.f29438g) * 31;
        String str2 = this.f29439h;
        int iHashCode4 = ((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961) + 1237) * 31) + v4.f(this.f29442l)) * 31) + Arrays.hashCode(this.f29443m);
        a5 a5Var = this.f29444n;
        int iHashCode5 = ((((iHashCode4 * 31) + (a5Var == null ? 0 : a5Var.hashCode())) * 31) + Arrays.hashCode(this.f29445p)) * 31;
        String str3 = this.f29446q;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f29447r;
        int iHashCode7 = iHashCode6 + (str4 == null ? 0 : str4.hashCode());
        j5 j5Var = this.f29448s;
        int iHashCode8 = ((iHashCode7 * 31) + (j5Var == null ? 0 : j5Var.hashCode())) * 31;
        String str5 = this.f29449t;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long j17 = this.f29450v;
        k5 k5Var = this.f29451w;
        int iHashCode10 = (((((iHashCode9 + ((int) (j17 ^ (j17 >>> 32)))) * 31) + (k5Var == null ? 0 : k5Var.hashCode())) * 31) + Arrays.hashCode(this.f29452x)) * 31;
        String str6 = this.f29453y;
        int iHashCode11 = ((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 961) + v4.d(this.A);
        b5 b5Var = this.C;
        int iHashCode12 = ((((iHashCode11 * 961) + (b5Var == null ? 0 : b5Var.hashCode())) * 31) + (this.D ? 1231 : 1237)) * 31;
        t4 t4Var = this.f29537b;
        if (t4Var != null && !t4Var.b()) {
            iHashCode2 = this.f29537b.hashCode();
        }
        return iHashCode12 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ w4 clone() {
        return (m5) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.s4
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ s4 clone() {
        return (m5) clone();
    }
}
