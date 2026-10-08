package j8;

import ak.d1;
import ak.e1;
import ak.n0;
import h8.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t7.e0;
import t7.f0;

/* JADX INFO: loaded from: classes3.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k8.d f100004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f100005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f100006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f100007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f100008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f100009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f100010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f100011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n0<C2345a> f100012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final w7.h f100013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f100014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f100015t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f100016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f100017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f100018w;

    /* JADX INFO: renamed from: j8.a$a, reason: collision with other inner class name */
    public static final class C2345a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f100019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f100020b;

        public C2345a(long j15, long j16) {
            this.f100019a = j15;
            this.f100020b = j16;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2345a)) {
                return false;
            }
            C2345a c2345a = (C2345a) obj;
            return this.f100019a == c2345a.f100019a && this.f100020b == c2345a.f100020b;
        }

        public int hashCode() {
            return (((int) this.f100019a) * 31) + ((int) this.f100020b);
        }
    }

    public static class b implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f100021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f100022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f100023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f100024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f100025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f100026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f100027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final w7.h f100028h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // j8.r.b
        public final r[] a(r.a[] aVarArr, k8.d dVar, c0.b bVar, e0 e0Var) {
            k8.d dVar2;
            r rVarB;
            n0 n0VarQ = a.q(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            int i15 = 0;
            while (i15 < aVarArr.length) {
                r.a aVar = aVarArr[i15];
                if (aVar != null) {
                    int[] iArr = aVar.f100136b;
                    if (iArr.length == 0) {
                        dVar2 = dVar;
                    } else {
                        if (iArr.length == 1) {
                            rVarB = new s(aVar.f100135a, iArr[0], aVar.f100137c);
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            rVarB = b(aVar.f100135a, iArr, aVar.f100137c, dVar2, (n0) n0VarQ.get(i15));
                        }
                        rVarArr[i15] = rVarB;
                    }
                } else {
                    dVar2 = dVar;
                }
                i15++;
                dVar = dVar2;
            }
            return rVarArr;
        }

        protected a b(f0 f0Var, int[] iArr, int i15, k8.d dVar, n0<C2345a> n0Var) {
            return new a(f0Var, iArr, i15, dVar, this.f100021a, this.f100022b, this.f100023c, this.f100024d, this.f100025e, this.f100026f, this.f100027g, n0Var, this.f100028h);
        }

        public b(int i15, int i16, int i17, float f15) {
            this(i15, i16, i17, 1279, 719, f15, 0.75f, w7.h.f210683a);
        }

        public b(int i15, int i16, int i17, int i18, int i19, float f15, float f16, w7.h hVar) {
            this.f100021a = i15;
            this.f100022b = i16;
            this.f100023c = i17;
            this.f100024d = i18;
            this.f100025e = i19;
            this.f100026f = f15;
            this.f100027g = f16;
            this.f100028h = hVar;
        }
    }

    protected a(f0 f0Var, int[] iArr, int i15, k8.d dVar, long j15, long j16, long j17, int i16, int i17, float f15, float f16, List<C2345a> list, w7.h hVar) {
        long j18;
        super(f0Var, iArr, i15);
        if (j17 < j15) {
            w7.t.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j18 = j15;
        } else {
            j18 = j17;
        }
        this.f100004i = dVar;
        this.f100005j = j15 * 1000;
        this.f100006k = j16 * 1000;
        this.f100007l = j18 * 1000;
        this.f100008m = i16;
        this.f100009n = i17;
        this.f100010o = f15;
        this.f100011p = f16;
        this.f100012q = n0.v(list);
        this.f100013r = hVar;
        this.f100014s = 1.0f;
        this.f100016u = 0;
        this.f100017v = -9223372036854775807L;
        this.f100018w = -2147483647L;
    }

    private static void p(List<n0.a<C2345a>> list, long[] jArr) {
        long j15 = 0;
        for (long j16 : jArr) {
            j15 += j16;
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            n0.a<C2345a> aVar = list.get(i15);
            if (aVar != null) {
                aVar.a(new C2345a(j15, jArr[i15]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n0<n0<C2345a>> q(r.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (r.a aVar : aVarArr) {
            if (aVar == null || aVar.f100136b.length <= 1) {
                arrayList.add(null);
            } else {
                n0.a aVarS = n0.s();
                aVarS.a(new C2345a(0L, 0L));
                arrayList.add(aVarS);
            }
        }
        long[][] jArrR = r(aVarArr);
        int[] iArr = new int[jArrR.length];
        long[] jArr = new long[jArrR.length];
        for (int i15 = 0; i15 < jArrR.length; i15++) {
            long[] jArr2 = jArrR[i15];
            jArr[i15] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        p(arrayList, jArr);
        n0<Integer> n0VarS = s(jArrR);
        for (int i16 = 0; i16 < n0VarS.size(); i16++) {
            int iIntValue = n0VarS.get(i16).intValue();
            int i17 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i17;
            jArr[iIntValue] = jArrR[iIntValue][i17];
            p(arrayList, jArr);
        }
        for (int i18 = 0; i18 < aVarArr.length; i18++) {
            if (arrayList.get(i18) != null) {
                jArr[i18] = jArr[i18] * 2;
            }
        }
        p(arrayList, jArr);
        n0.a aVarS2 = n0.s();
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            n0.a aVar2 = (n0.a) arrayList.get(i19);
            aVarS2.a(aVar2 == null ? n0.C() : aVar2.k());
        }
        return aVarS2.k();
    }

    private static long[][] r(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i15 = 0; i15 < aVarArr.length; i15++) {
            r.a aVar = aVarArr[i15];
            if (aVar == null) {
                jArr[i15] = new long[0];
            } else {
                jArr[i15] = new long[aVar.f100136b.length];
                int i16 = 0;
                while (true) {
                    int[] iArr = aVar.f100136b;
                    if (i16 >= iArr.length) {
                        break;
                    }
                    long j15 = aVar.f100135a.a(iArr[i16]).f188375j;
                    long[] jArr2 = jArr[i15];
                    if (j15 == -1) {
                        j15 = 0;
                    }
                    jArr2[i16] = j15;
                    i16++;
                }
                Arrays.sort(jArr[i15]);
            }
        }
        return jArr;
    }

    private static n0<Integer> s(long[][] jArr) {
        d1 d1VarE = e1.c().a().e();
        for (int i15 = 0; i15 < jArr.length; i15++) {
            long[] jArr2 = jArr[i15];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i16 = 0;
                while (true) {
                    long[] jArr3 = jArr[i15];
                    double dLog = 0.0d;
                    if (i16 >= jArr3.length) {
                        break;
                    }
                    long j15 = jArr3[i16];
                    if (j15 != -1) {
                        dLog = Math.log(j15);
                    }
                    dArr[i16] = dLog;
                    i16++;
                }
                int i17 = length - 1;
                double d15 = dArr[i17] - dArr[0];
                int i18 = 0;
                while (i18 < i17) {
                    double d16 = dArr[i18];
                    i18++;
                    d1VarE.put(Double.valueOf(d15 == 0.0d ? 1.0d : (((d16 + dArr[i18]) * 0.5d) - dArr[0]) / d15), Integer.valueOf(i15));
                }
            }
        }
        return n0.v(d1VarE.values());
    }

    @Override // j8.c, j8.r
    public void a() {
        this.f100017v = -9223372036854775807L;
    }

    @Override // j8.r
    public int b() {
        return this.f100015t;
    }

    @Override // j8.c, j8.r
    public void c() {
    }

    @Override // j8.c, j8.r
    public void f(float f15) {
        this.f100014s = f15;
    }
}
