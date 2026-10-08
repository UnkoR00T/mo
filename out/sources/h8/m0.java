package h8;

import a8.b2;
import a8.f3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class m0 implements b0, b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0[] f81630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f81631b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f81633d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b0.a f81636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j1 f81637h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a1 f81639k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<b0> f81634e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<t7.f0, t7.f0> f81635f = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<z0, Integer> f81632c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b0[] f81638j = new b0[0];

    private static final class a extends j8.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t7.f0 f81640b;

        public a(j8.r rVar, t7.f0 f0Var) {
            super(rVar);
            this.f81640b = f0Var;
        }

        @Override // j8.v
        public t7.p d(int i15) {
            return this.f81640b.a(n().e(i15));
        }

        @Override // j8.t
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.f81640b.equals(((a) obj).f81640b);
            }
            return false;
        }

        @Override // j8.t
        public int hashCode() {
            return (super.hashCode() * 31) + this.f81640b.hashCode();
        }

        @Override // j8.v
        public t7.f0 i() {
            return this.f81640b;
        }

        @Override // j8.r
        public t7.p l() {
            return this.f81640b.a(n().k());
        }
    }

    public m0(i iVar, long[] jArr, b0... b0VarArr) {
        this.f81633d = iVar;
        this.f81630a = b0VarArr;
        this.f81639k = iVar.empty();
        this.f81631b = new boolean[b0VarArr.length];
        for (int i15 = 0; i15 < b0VarArr.length; i15++) {
            long j15 = jArr[i15];
            if (j15 != 0) {
                this.f81631b[i15] = true;
                this.f81630a[i15] = new g1(b0VarArr[i15], j15);
            }
        }
    }

    @Override // h8.b0, h8.a1
    public long a() {
        return this.f81639k.a();
    }

    @Override // h8.b0, h8.a1
    public boolean b() {
        return this.f81639k.b();
    }

    @Override // h8.b0, h8.a1
    public boolean c(b2 b2Var) {
        if (this.f81634e.isEmpty()) {
            return this.f81639k.c(b2Var);
        }
        int size = this.f81634e.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f81634e.get(i15).c(b2Var);
        }
        return false;
    }

    @Override // h8.b0, h8.a1
    public long d() {
        return this.f81639k.d();
    }

    @Override // h8.b0, h8.a1
    public void e(long j15) {
        this.f81639k.e(j15);
    }

    @Override // h8.b0.a
    public void f(b0 b0Var) {
        this.f81634e.remove(b0Var);
        if (!this.f81634e.isEmpty()) {
            return;
        }
        int i15 = 0;
        for (b0 b0Var2 : this.f81630a) {
            i15 += b0Var2.t().f81616a;
        }
        t7.f0[] f0VarArr = new t7.f0[i15];
        int i16 = 0;
        int i17 = 0;
        while (true) {
            b0[] b0VarArr = this.f81630a;
            if (i16 >= b0VarArr.length) {
                this.f81637h = new j1(f0VarArr);
                ((b0.a) zj.p.q(this.f81636g)).f(this);
                return;
            }
            j1 j1VarT = b0VarArr[i16].t();
            int i18 = j1VarT.f81616a;
            int i19 = 0;
            while (i19 < i18) {
                t7.f0 f0VarB = j1VarT.b(i19);
                t7.p[] pVarArr = new t7.p[f0VarB.f188177a];
                for (int i25 = 0; i25 < f0VarB.f188177a; i25++) {
                    t7.p pVarA = f0VarB.a(i25);
                    t7.p.b bVarB = pVarA.b();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i16);
                    sb5.append(":");
                    String str = pVarA.f188366a;
                    if (str == null) {
                        str = "";
                    }
                    sb5.append(str);
                    bVarB.k0(sb5.toString());
                    if (pVarA.f188379n != null) {
                        bVarB.w0(i16 + ":" + pVarA.f188379n);
                    }
                    pVarArr[i25] = bVarB.Q();
                }
                t7.f0 f0Var = new t7.f0(i16 + ":" + f0VarB.f188178b, pVarArr);
                this.f81635f.put(f0Var, f0VarB);
                f0VarArr[i17] = f0Var;
                i19++;
                i17++;
            }
            i16++;
        }
    }

    @Override // h8.b0
    public long h(long j15, f3 f3Var) {
        b0[] b0VarArr = this.f81638j;
        return (b0VarArr.length > 0 ? b0VarArr[0] : this.f81630a[0]).h(j15, f3Var);
    }

    @Override // h8.b0
    public long i(long j15) {
        long jI = this.f81638j[0].i(j15);
        int i15 = 1;
        while (true) {
            b0[] b0VarArr = this.f81638j;
            if (i15 >= b0VarArr.length) {
                return jI;
            }
            if (b0VarArr[i15].i(jI) != jI) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i15++;
        }
    }

    @Override // h8.b0
    public long k() {
        long j15 = -9223372036854775807L;
        for (b0 b0Var : this.f81638j) {
            long jK = b0Var.k();
            if (jK == -9223372036854775807L) {
                if (j15 != -9223372036854775807L && b0Var.i(j15) != j15) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j15 == -9223372036854775807L) {
                for (b0 b0Var2 : this.f81638j) {
                    if (b0Var2 == b0Var) {
                        break;
                    }
                    if (b0Var2.i(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j15 = jK;
            } else if (jK != j15) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j15;
    }

    public b0 l(int i15) {
        return this.f81631b[i15] ? ((g1) this.f81630a[i15]).j() : this.f81630a[i15];
    }

    @Override // h8.a1.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void g(b0 b0Var) {
        ((b0.a) zj.p.q(this.f81636g)).g(this);
    }

    @Override // h8.b0
    public long n(long j15) {
        boolean z15 = true;
        for (b0 b0Var : this.f81630a) {
            z15 &= b0Var.n(j15) == j15;
        }
        if (z15) {
            return j15;
        }
        return Long.MIN_VALUE;
    }

    @Override // h8.b0
    public void p(b0.a aVar, long j15) {
        this.f81636g = aVar;
        Collections.addAll(this.f81634e, this.f81630a);
        for (b0 b0Var : this.f81630a) {
            b0Var.p(this, j15);
        }
    }

    @Override // h8.b0
    public void q() {
        for (b0 b0Var : this.f81630a) {
            b0Var.q();
        }
    }

    @Override // h8.b0
    public j1 t() {
        return (j1) zj.p.q(this.f81637h);
    }

    @Override // h8.b0
    public long u(j8.r[] rVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j15) {
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i15 = 0;
        for (int i16 = 0; i16 < rVarArr.length; i16++) {
            z0 z0Var = z0VarArr[i16];
            Integer num = z0Var == null ? null : this.f81632c.get(z0Var);
            iArr[i16] = num == null ? -1 : num.intValue();
            j8.r rVar = rVarArr[i16];
            if (rVar != null) {
                String str = rVar.i().f188178b;
                iArr2[i16] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i16] = -1;
            }
        }
        this.f81632c.clear();
        int length = rVarArr.length;
        z0[] z0VarArr2 = new z0[length];
        z0[] z0VarArr3 = new z0[rVarArr.length];
        j8.r[] rVarArr2 = new j8.r[rVarArr.length];
        ArrayList arrayList = new ArrayList(this.f81630a.length);
        long j16 = j15;
        int i17 = 0;
        while (i17 < this.f81630a.length) {
            for (int i18 = i15; i18 < rVarArr.length; i18++) {
                z0VarArr3[i18] = iArr[i18] == i17 ? z0VarArr[i18] : null;
                if (iArr2[i18] == i17) {
                    j8.r rVar2 = (j8.r) zj.p.q(rVarArr[i18]);
                    rVarArr2[i18] = new a(rVar2, (t7.f0) zj.p.q(this.f81635f.get(rVar2.i())));
                } else {
                    rVarArr2[i18] = null;
                }
            }
            int i19 = i17;
            long jU = this.f81630a[i17].u(rVarArr2, zArr, z0VarArr3, zArr2, j16);
            if (i19 == 0) {
                j16 = jU;
            } else if (jU != j16) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z15 = false;
            for (int i25 = 0; i25 < rVarArr.length; i25++) {
                if (iArr2[i25] == i19) {
                    z0 z0Var2 = (z0) zj.p.q(z0VarArr3[i25]);
                    z0VarArr2[i25] = z0VarArr3[i25];
                    this.f81632c.put(z0Var2, Integer.valueOf(i19));
                    z15 = true;
                } else if (iArr[i25] == i19) {
                    zj.p.w(z0VarArr3[i25] == null);
                }
            }
            if (z15) {
                arrayList.add(this.f81630a[i19]);
            }
            i17 = i19 + 1;
            i15 = 0;
        }
        int i26 = i15;
        System.arraycopy(z0VarArr2, i26, z0VarArr, i26, length);
        this.f81638j = (b0[]) arrayList.toArray(new b0[i26]);
        this.f81639k = this.f81633d.a(arrayList, ak.a1.k(arrayList, new zj.g() { // from class: h8.l0
            @Override // zj.g
            public final Object apply(Object obj) {
                return ((b0) obj).t().c();
            }
        }));
        return j16;
    }

    @Override // h8.b0
    public void w(long j15, boolean z15) {
        for (b0 b0Var : this.f81638j) {
            b0Var.w(j15, z15);
        }
    }
}
