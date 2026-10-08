package h8;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends g<Integer> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final t7.s f81643x = new t7.s.c().c("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f81644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f81645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c0[] f81646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<List<d>> f81647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t7.e0[] f81648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList<c0> f81649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f81650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map<Object, Long> f81651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ak.d1<Object, h8.d> f81652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f81653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long[][] f81654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f81655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f81656w;

    private static final class b extends v {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f81657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f81658g;

        public b(t7.e0 e0Var, Map<Object, Long> map) {
            super(e0Var);
            int iP = e0Var.p();
            this.f81658g = new long[e0Var.p()];
            t7.e0.c cVar = new t7.e0.c();
            for (int i15 = 0; i15 < iP; i15++) {
                this.f81658g[i15] = e0Var.n(i15, cVar).f188165m;
            }
            int i16 = e0Var.i();
            this.f81657f = new long[i16];
            t7.e0.b bVar = new t7.e0.b();
            for (int i17 = 0; i17 < i16; i17++) {
                e0Var.g(i17, bVar, true);
                long jLongValue = ((Long) zj.p.q(map.get(bVar.f188137b))).longValue();
                long[] jArr = this.f81657f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f188139d : jLongValue;
                jArr[i17] = jLongValue;
                long j15 = bVar.f188139d;
                if (j15 != -9223372036854775807L) {
                    long[] jArr2 = this.f81658g;
                    int i18 = bVar.f188138c;
                    jArr2[i18] = jArr2[i18] - (j15 - jLongValue);
                }
            }
        }

        @Override // h8.v, t7.e0
        public t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
            super.g(i15, bVar, z15);
            bVar.f188139d = this.f81657f[i15];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // h8.v, t7.e0
        public t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
            long jMin;
            super.o(i15, cVar, j15);
            long j16 = this.f81658g[i15];
            cVar.f188165m = j16;
            if (j16 != -9223372036854775807L) {
                long j17 = cVar.f188164l;
                if (j17 == -9223372036854775807L) {
                    jMin = cVar.f188164l;
                } else {
                    jMin = Math.min(j17, j16);
                }
            } else {
                jMin = cVar.f188164l;
            }
            cVar.f188164l = jMin;
            return cVar;
        }
    }

    public static final class c extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81659a;

        public c(int i15) {
            this.f81659a = i15;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0.b f81660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f81661b;

        private d(c0.b bVar, b0 b0Var) {
            this.f81660a = bVar;
            this.f81661b = b0Var;
        }
    }

    public n0(c0... c0VarArr) {
        this(false, c0VarArr);
    }

    private void H() {
        t7.e0.b bVar = new t7.e0.b();
        for (int i15 = 0; i15 < this.f81653t; i15++) {
            long j15 = -this.f81648o[0].f(i15, bVar).o();
            int i16 = 1;
            while (true) {
                t7.e0[] e0VarArr = this.f81648o;
                if (i16 < e0VarArr.length) {
                    this.f81654u[i15][i16] = j15 - (-e0VarArr[i16].f(i15, bVar).o());
                    i16++;
                }
            }
        }
    }

    private void K() {
        t7.e0[] e0VarArr;
        t7.e0.b bVar = new t7.e0.b();
        for (int i15 = 0; i15 < this.f81653t; i15++) {
            int i16 = 0;
            long j15 = Long.MIN_VALUE;
            while (true) {
                e0VarArr = this.f81648o;
                if (i16 >= e0VarArr.length) {
                    break;
                }
                long jK = e0VarArr[i16].f(i15, bVar).k();
                if (jK != -9223372036854775807L) {
                    long j16 = jK + this.f81654u[i15][i16];
                    if (j15 == Long.MIN_VALUE || j16 < j15) {
                        j15 = j16;
                    }
                }
                i16++;
            }
            Object objM = e0VarArr[0].m(i15);
            this.f81651r.put(objM, Long.valueOf(j15));
            Iterator<h8.d> it = this.f81652s.get(objM).iterator();
            while (it.hasNext()) {
                it.next().A(0L, j15);
            }
        }
    }

    @Override // h8.g, h8.a
    protected void A() {
        super.A();
        Arrays.fill(this.f81648o, (Object) null);
        this.f81653t = -1;
        this.f81655v = null;
        this.f81649p.clear();
        Collections.addAll(this.f81649p, this.f81646m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h8.g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public c0.b C(Integer num, c0.b bVar) {
        List<d> list = this.f81647n.get(num.intValue());
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (list.get(i15).f81660a.equals(bVar)) {
                return this.f81647n.get(0).get(i15).f81660a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h8.g
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void F(Integer num, c0 c0Var, t7.e0 e0Var) {
        if (this.f81655v != null) {
            return;
        }
        if (this.f81653t == -1) {
            this.f81653t = e0Var.i();
        } else if (e0Var.i() != this.f81653t) {
            this.f81655v = new c(0);
            return;
        }
        if (this.f81654u.length == 0) {
            this.f81654u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f81653t, this.f81648o.length);
        }
        this.f81649p.remove(c0Var);
        this.f81648o[num.intValue()] = e0Var;
        if (this.f81649p.isEmpty()) {
            if (this.f81644k) {
                H();
            }
            t7.e0 bVar = this.f81648o[0];
            if (this.f81645l) {
                K();
                bVar = new b(bVar, this.f81651r);
            }
            z(bVar);
        }
    }

    @Override // h8.c0
    public t7.s b() {
        c0[] c0VarArr = this.f81646m;
        return c0VarArr.length > 0 ? c0VarArr[0].b() : f81643x;
    }

    @Override // h8.c0
    public void c(t7.s sVar) {
        this.f81646m[0].c(sVar);
    }

    @Override // h8.c0
    public b0 e(c0.b bVar, k8.b bVar2, long j15) {
        int length = this.f81646m.length;
        b0[] b0VarArr = new b0[length];
        int iB = this.f81648o[0].b(bVar.f81468a);
        for (int i15 = 0; i15 < length; i15++) {
            c0.b bVarA = bVar.a(this.f81648o[i15].m(iB));
            b0VarArr[i15] = this.f81646m[i15].e(bVarA, bVar2, j15 - this.f81654u[iB][i15]);
            this.f81647n.get(i15).add(new d(bVarA, b0VarArr[i15]));
        }
        m0 m0Var = new m0(this.f81650q, this.f81654u[iB], b0VarArr);
        if (!this.f81645l) {
            return m0Var;
        }
        h8.d dVar = new h8.d(m0Var, false, 0L, ((Long) zj.p.q(this.f81651r.get(bVar.f81468a))).longValue(), this.f81656w);
        this.f81652s.put(bVar.f81468a, dVar);
        return dVar;
    }

    @Override // h8.g, h8.c0
    public void j() throws c {
        c cVar = this.f81655v;
        if (cVar != null) {
            throw cVar;
        }
        super.j();
    }

    @Override // h8.c0
    public void p(b0 b0Var) {
        if (this.f81645l) {
            h8.d dVar = (h8.d) b0Var;
            for (Map.Entry<Object, h8.d> entry : this.f81652s.a()) {
                if (entry.getValue().equals(dVar)) {
                    this.f81652s.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            b0Var = dVar.f81488a;
        }
        m0 m0Var = (m0) b0Var;
        for (int i15 = 0; i15 < this.f81646m.length; i15++) {
            List<d> list = this.f81647n.get(i15);
            b0 b0VarL = m0Var.l(i15);
            for (int i16 = 0; i16 < list.size(); i16++) {
                if (list.get(i16).f81661b.equals(b0VarL)) {
                    list.remove(i16);
                    break;
                }
            }
            this.f81646m[i15].p(m0Var.l(i15));
        }
    }

    @Override // h8.g, h8.a
    protected void y(y7.x xVar) {
        super.y(xVar);
        for (int i15 = 0; i15 < this.f81646m.length; i15++) {
            G(Integer.valueOf(i15), this.f81646m[i15]);
        }
    }

    public n0(boolean z15, c0... c0VarArr) {
        this(z15, false, c0VarArr);
    }

    public n0(boolean z15, boolean z16, c0... c0VarArr) {
        this(z15, z16, new j(), c0VarArr);
    }

    public n0(boolean z15, boolean z16, i iVar, c0... c0VarArr) {
        this.f81644k = z15;
        this.f81645l = z16;
        this.f81646m = c0VarArr;
        this.f81650q = iVar;
        this.f81649p = new ArrayList<>(Arrays.asList(c0VarArr));
        this.f81653t = -1;
        this.f81647n = new ArrayList(c0VarArr.length);
        for (int i15 = 0; i15 < c0VarArr.length; i15++) {
            this.f81647n.add(new ArrayList());
        }
        this.f81648o = new t7.e0[c0VarArr.length];
        this.f81654u = new long[0][];
        this.f81651r = new HashMap();
        this.f81652s = ak.e1.a().a().e();
    }
}
