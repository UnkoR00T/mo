package t7;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f188028g = new a(null, new C4892a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C4892a f188029h = new C4892a(0).i(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f188030i = o0.u0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f188031j = o0.u0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f188032k = o0.u0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f188033l = o0.u0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f188034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f188036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f188037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f188038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C4892a[] f188039f;

    /* JADX INFO: renamed from: t7.a$a, reason: collision with other inner class name */
    public static final class C4892a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f188040m = o0.u0(0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f188041n = o0.u0(1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f188042o = o0.u0(2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f188043p = o0.u0(3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f188044q = o0.u0(4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f188045r = o0.u0(5);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f188046s = o0.u0(6);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f188047t = o0.u0(7);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        static final String f188048u = o0.u0(8);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final String f188049v = o0.u0(9);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final String f188050w = o0.u0(10);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f188051x = o0.u0(11);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f188052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f188053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f188054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f188055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s[] f188056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f188057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f188058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f188059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final b[] f188060i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f188061j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f188062k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f188063l;

        public C4892a(long j15) {
            this(j15, -1, -1, new int[0], new s[0], new long[0], 0L, false, new String[0], new b[0], false);
        }

        private static long[] a(long[] jArr, int i15) {
            int length = jArr.length;
            int iMax = Math.max(i15, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static b[] b(b[] bVarArr, int i15) {
            return (b[]) Arrays.copyOf(bVarArr, Math.max(i15, bVarArr.length));
        }

        private static int[] c(int[] iArr, int i15) {
            int length = iArr.length;
            int iMax = Math.max(i15, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int d() {
            return e(-1);
        }

        public int e(int i15) {
            int i16;
            int i17 = i15 + 1;
            while (true) {
                int[] iArr = this.f188057f;
                if (i17 >= iArr.length || this.f188062k || (i16 = iArr[i17]) == 0 || i16 == 1) {
                    break;
                }
                i17++;
            }
            return i17;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C4892a.class == obj.getClass()) {
                C4892a c4892a = (C4892a) obj;
                if (this.f188052a == c4892a.f188052a && this.f188053b == c4892a.f188053b && this.f188054c == c4892a.f188054c && Arrays.equals(this.f188056e, c4892a.f188056e) && Arrays.equals(this.f188057f, c4892a.f188057f) && Arrays.equals(this.f188058g, c4892a.f188058g) && this.f188061j == c4892a.f188061j && this.f188062k == c4892a.f188062k && Arrays.equals(this.f188059h, c4892a.f188059h) && Arrays.equals(this.f188060i, c4892a.f188060i) && this.f188063l == c4892a.f188063l) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            if (this.f188053b == -1) {
                return true;
            }
            for (int i15 = 0; i15 < this.f188053b; i15++) {
                int i16 = this.f188057f[i15];
                if (i16 == 0 || i16 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean g() {
            return this.f188063l && this.f188052a == Long.MIN_VALUE && this.f188053b == -1;
        }

        public boolean h() {
            return this.f188053b == -1 || d() < this.f188053b;
        }

        public int hashCode() {
            int i15 = ((this.f188053b * 31) + this.f188054c) * 31;
            long j15 = this.f188052a;
            int iHashCode = (((((((i15 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + Arrays.hashCode(this.f188056e)) * 31) + Arrays.hashCode(this.f188057f)) * 31) + Arrays.hashCode(this.f188058g)) * 31;
            long j16 = this.f188061j;
            return ((((((((iHashCode + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f188062k ? 1 : 0)) * 31) + Arrays.hashCode(this.f188059h)) * 31) + Arrays.hashCode(this.f188060i)) * 31) + (this.f188063l ? 1 : 0);
        }

        public C4892a i(int i15) {
            int[] iArrC = c(this.f188057f, i15);
            long[] jArrA = a(this.f188058g, i15);
            return new C4892a(this.f188052a, i15, this.f188054c, iArrC, (s[]) Arrays.copyOf(this.f188056e, i15), jArrA, this.f188061j, this.f188062k, (String[]) Arrays.copyOf(this.f188059h, i15), b(this.f188060i, i15), this.f188063l);
        }

        private C4892a(long j15, int i15, int i16, int[] iArr, s[] sVarArr, long[] jArr, long j16, boolean z15, String[] strArr, b[] bVarArr, boolean z16) {
            int i17 = 0;
            zj.p.d(iArr.length == sVarArr.length);
            zj.p.d(iArr.length == bVarArr.length);
            this.f188052a = j15;
            this.f188053b = i15;
            this.f188054c = i16;
            this.f188057f = iArr;
            this.f188056e = sVarArr;
            this.f188058g = jArr;
            this.f188061j = j16;
            this.f188062k = z15;
            this.f188055d = new Uri[sVarArr.length];
            while (true) {
                Uri[] uriArr = this.f188055d;
                if (i17 >= uriArr.length) {
                    this.f188059h = strArr;
                    this.f188060i = bVarArr;
                    this.f188063l = z16;
                    return;
                } else {
                    s sVar = sVarArr[i17];
                    uriArr[i17] = sVar == null ? null : ((s.h) zj.p.q(sVar.f188433b)).f188528a;
                    i17++;
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f188064d = o0.u0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f188065e = o0.u0(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f188066f = o0.u0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f188067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f188068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f188069c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f188067a == bVar.f188067a && this.f188068b == bVar.f188068b && Objects.equals(this.f188069c, bVar.f188069c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f188067a), Long.valueOf(this.f188068b), this.f188069c);
        }
    }

    private a(Object obj, C4892a[] c4892aArr, long j15, long j16, int i15) {
        this.f188034a = obj;
        this.f188036c = j15;
        this.f188037d = j16;
        this.f188035b = c4892aArr.length + i15;
        this.f188039f = c4892aArr;
        this.f188038e = i15;
    }

    private boolean e(long j15, long j16, int i15) {
        if (j15 == Long.MIN_VALUE) {
            return false;
        }
        C4892a c4892aA = a(i15);
        long j17 = c4892aA.f188052a;
        if (j17 == Long.MIN_VALUE) {
            return j16 == -9223372036854775807L || c4892aA.g() || j15 < j16;
        }
        return j15 < j17;
    }

    public C4892a a(int i15) {
        int i16 = this.f188038e;
        return i15 < i16 ? f188029h : this.f188039f[i15 - i16];
    }

    public int b(long j15, long j16) {
        if (j15 != Long.MIN_VALUE && (j16 == -9223372036854775807L || j15 < j16)) {
            int i15 = this.f188038e;
            while (i15 < this.f188035b && ((a(i15).f188052a != Long.MIN_VALUE && a(i15).f188052a <= j15) || !a(i15).h())) {
                i15++;
            }
            if (i15 < this.f188035b && (j16 == -9223372036854775807L || a(i15).f188052a <= j16)) {
                return i15;
            }
        }
        return -1;
    }

    public int c(long j15, long j16) {
        int i15 = this.f188035b - 1;
        int i16 = i15 - (d(i15) ? 1 : 0);
        while (i16 >= 0) {
            long j17 = j15;
            long j18 = j16;
            if (!e(j17, j18, i16)) {
                break;
            }
            i16--;
            j15 = j17;
            j16 = j18;
        }
        if (i16 < 0 || !a(i16).f()) {
            return -1;
        }
        return i16;
    }

    public boolean d(int i15) {
        return i15 == this.f188035b - 1 && a(i15).g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (Objects.equals(this.f188034a, aVar.f188034a) && this.f188035b == aVar.f188035b && this.f188036c == aVar.f188036c && this.f188037d == aVar.f188037d && this.f188038e == aVar.f188038e && Arrays.equals(this.f188039f, aVar.f188039f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = this.f188035b * 31;
        Object obj = this.f188034a;
        return ((((((((i15 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f188036c)) * 31) + ((int) this.f188037d)) * 31) + this.f188038e) * 31) + Arrays.hashCode(this.f188039f);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("AdPlaybackState(adsId=");
        sb5.append(this.f188034a);
        sb5.append(", adResumePositionUs=");
        sb5.append(this.f188036c);
        sb5.append(", adGroups=[");
        for (int i15 = 0; i15 < this.f188039f.length; i15++) {
            sb5.append("adGroup(timeUs=");
            sb5.append(this.f188039f[i15].f188052a);
            sb5.append(", ads=[");
            for (int i16 = 0; i16 < this.f188039f[i15].f188057f.length; i16++) {
                sb5.append("ad(state=");
                int i17 = this.f188039f[i15].f188057f[i16];
                if (i17 == 0) {
                    sb5.append('_');
                } else if (i17 == 1) {
                    sb5.append('R');
                } else if (i17 == 2) {
                    sb5.append('S');
                } else if (i17 == 3) {
                    sb5.append('P');
                } else if (i17 != 4) {
                    sb5.append('?');
                } else {
                    sb5.append('!');
                }
                sb5.append(", durationUs=");
                sb5.append(this.f188039f[i15].f188058g[i16]);
                sb5.append(')');
                if (i16 < this.f188039f[i15].f188057f.length - 1) {
                    sb5.append(", ");
                }
            }
            sb5.append("])");
            if (i15 < this.f188039f.length - 1) {
                sb5.append(", ");
            }
        }
        sb5.append("])");
        return sb5.toString();
    }
}
