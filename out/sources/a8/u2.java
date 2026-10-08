package a8;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b8.e2 f4622a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f4626e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b8.a f4629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w7.p f4630i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private y7.x f4633l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h8.b1 f4631j = new h8.b1.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<h8.b0, c> f4624c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f4625d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f4623b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f4627f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<c> f4628g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements h8.j0, d8.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f4634a;

        public a(c cVar) {
            this.f4634a = cVar;
        }

        private Pair<Integer, h8.c0.b> K(int i15, h8.c0.b bVar) {
            h8.c0.b bVar2 = null;
            if (bVar != null) {
                h8.c0.b bVarN = u2.n(this.f4634a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(u2.s(this.f4634a, i15)), bVar2);
        }

        @Override // d8.t
        public void D(int i15, h8.c0.b bVar) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.s2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4610a;
                        Pair pair = pairK;
                        u2.this.f4629h.D(((Integer) pair.first).intValue(), (h8.c0.b) pair.second);
                    }
                });
            }
        }

        @Override // h8.j0
        public void G(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var, final int i16) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4574a;
                        Pair pair = pairK;
                        u2.this.f4629h.G(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, xVar, a0Var, i16);
                    }
                });
            }
        }

        @Override // h8.j0
        public void H(int i15, h8.c0.b bVar, final h8.a0 a0Var) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4547a;
                        Pair pair = pairK;
                        u2.this.f4629h.H(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, a0Var);
                    }
                });
            }
        }

        @Override // h8.j0
        public void I(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var, final IOException iOException, final boolean z15) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4581a;
                        Pair pair = pairK;
                        u2.this.f4629h.I(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, xVar, a0Var, iOException, z15);
                    }
                });
            }
        }

        @Override // h8.j0
        public void N(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4565a;
                        Pair pair = pairK;
                        u2.this.f4629h.N(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, xVar, a0Var);
                    }
                });
            }
        }

        @Override // d8.t
        public void W(int i15, h8.c0.b bVar, final Exception exc) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4590a;
                        Pair pair = pairK;
                        u2.this.f4629h.W(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // d8.t
        public void b0(int i15, h8.c0.b bVar, final d8.h0 h0Var) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4540a;
                        Pair pair = pairK;
                        u2.this.f4629h.b0(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, h0Var);
                    }
                });
            }
        }

        @Override // d8.t
        public void d0(int i15, h8.c0.b bVar, final int i16) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4601a;
                        Pair pair = pairK;
                        u2.this.f4629h.d0(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, i16);
                    }
                });
            }
        }

        @Override // d8.t
        public void l0(int i15, h8.c0.b bVar) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4615a;
                        Pair pair = pairK;
                        u2.this.f4629h.l0(((Integer) pair.first).intValue(), (h8.c0.b) pair.second);
                    }
                });
            }
        }

        @Override // d8.t
        public void m0(int i15, h8.c0.b bVar) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4595a;
                        Pair pair = pairK;
                        u2.this.f4629h.m0(((Integer) pair.first).intValue(), (h8.c0.b) pair.second);
                    }
                });
            }
        }

        @Override // h8.j0
        public void n0(int i15, h8.c0.b bVar, final h8.x xVar, final h8.a0 a0Var) {
            final Pair<Integer, h8.c0.b> pairK = K(i15, bVar);
            if (pairK != null) {
                u2.this.f4630i.j(new Runnable() { // from class: a8.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        u2.a aVar = this.f4523a;
                        Pair pair = pairK;
                        u2.this.f4629h.n0(((Integer) pair.first).intValue(), (h8.c0.b) pair.second, xVar, a0Var);
                    }
                });
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h8.c0 f4636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h8.c0.c f4637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f4638c;

        public b(h8.c0 c0Var, h8.c0.c cVar, a aVar) {
            this.f4636a = c0Var;
            this.f4637b = cVar;
            this.f4638c = aVar;
        }
    }

    static final class c implements h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h8.z f4639a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4643e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<h8.c0.b> f4641c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f4640b = new Object();

        public c(h8.c0 c0Var, boolean z15) {
            this.f4639a = new h8.z(c0Var, z15);
        }

        @Override // a8.h2
        public Object a() {
            return this.f4640b;
        }

        @Override // a8.h2
        public t7.e0 b() {
            return this.f4639a.U();
        }

        public void c(int i15) {
            this.f4642d = i15;
            this.f4643e = false;
            this.f4641c.clear();
        }
    }

    public interface d {
        void c();
    }

    public u2(d dVar, b8.a aVar, w7.p pVar, b8.e2 e2Var) {
        this.f4622a = e2Var;
        this.f4626e = dVar;
        this.f4629h = aVar;
        this.f4630i = pVar;
    }

    private void B(int i15, int i16) {
        for (int i17 = i16 - 1; i17 >= i15; i17--) {
            c cVarRemove = this.f4623b.remove(i17);
            this.f4625d.remove(cVarRemove.f4640b);
            g(i17, -cVarRemove.f4639a.U().p());
            cVarRemove.f4643e = true;
            if (this.f4632k) {
                u(cVarRemove);
            }
        }
    }

    private void g(int i15, int i16) {
        while (i15 < this.f4623b.size()) {
            this.f4623b.get(i15).f4642d += i16;
            i15++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f4627f.get(cVar);
        if (bVar != null) {
            bVar.f4636a.g(bVar.f4637b);
        }
    }

    private void k() {
        Iterator<c> it = this.f4628g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f4641c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f4628g.add(cVar);
        b bVar = this.f4627f.get(cVar);
        if (bVar != null) {
            bVar.f4636a.h(bVar.f4637b);
        }
    }

    private static Object m(Object obj) {
        return a8.a.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h8.c0.b n(c cVar, h8.c0.b bVar) {
        for (int i15 = 0; i15 < cVar.f4641c.size(); i15++) {
            if (cVar.f4641c.get(i15).f81471d == bVar.f81471d) {
                return bVar.a(p(cVar, bVar.f81468a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return a8.a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return a8.a.y(cVar.f4640b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i15) {
        return i15 + cVar.f4642d;
    }

    private void u(c cVar) {
        if (cVar.f4643e && cVar.f4641c.isEmpty()) {
            b bVar = (b) zj.p.q(this.f4627f.remove(cVar));
            bVar.f4636a.i(bVar.f4637b);
            bVar.f4636a.l(bVar.f4638c);
            bVar.f4636a.f(bVar.f4638c);
            this.f4628g.remove(cVar);
        }
    }

    private void x(c cVar) {
        h8.z zVar = cVar.f4639a;
        h8.c0.c cVar2 = new h8.c0.c() { // from class: a8.i2
            @Override // h8.c0.c
            public final void a(h8.c0 c0Var, t7.e0 e0Var) {
                this.f4505a.f4626e.c();
            }
        };
        a aVar = new a(cVar);
        this.f4627f.put(cVar, new b(zVar, cVar2, aVar));
        zVar.n(w7.o0.B(), aVar);
        zVar.a(w7.o0.B(), aVar);
        zVar.d(cVar2, this.f4633l, this.f4622a);
    }

    public t7.e0 A(int i15, int i16, h8.b1 b1Var) {
        zj.p.d(i15 >= 0 && i15 <= i16 && i16 <= r());
        this.f4631j = b1Var;
        B(i15, i16);
        return i();
    }

    public t7.e0 C(List<c> list, h8.b1 b1Var) {
        B(0, this.f4623b.size());
        return f(this.f4623b.size(), list, b1Var);
    }

    public t7.e0 D(h8.b1 b1Var) {
        int iR = r();
        if (b1Var.a() != iR) {
            b1Var = b1Var.e().h(0, iR);
        }
        this.f4631j = b1Var;
        return i();
    }

    public t7.e0 E(int i15, int i16, List<t7.s> list) {
        zj.p.d(i15 >= 0 && i15 <= i16 && i16 <= r());
        zj.p.d(list.size() == i16 - i15);
        for (int i17 = i15; i17 < i16; i17++) {
            this.f4623b.get(i17).f4639a.c(list.get(i17 - i15));
        }
        return i();
    }

    public t7.e0 f(int i15, List<c> list, h8.b1 b1Var) {
        if (!list.isEmpty()) {
            this.f4631j = b1Var;
            for (int i16 = i15; i16 < list.size() + i15; i16++) {
                c cVar = list.get(i16 - i15);
                if (i16 > 0) {
                    c cVar2 = this.f4623b.get(i16 - 1);
                    cVar.c(cVar2.f4642d + cVar2.f4639a.U().p());
                } else {
                    cVar.c(0);
                }
                g(i16, cVar.f4639a.U().p());
                this.f4623b.add(i16, cVar);
                this.f4625d.put(cVar.f4640b, cVar);
                if (this.f4632k) {
                    x(cVar);
                    if (this.f4624c.isEmpty()) {
                        this.f4628g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public h8.b0 h(h8.c0.b bVar, k8.b bVar2, long j15) {
        Object objO = o(bVar.f81468a);
        h8.c0.b bVarA = bVar.a(m(bVar.f81468a));
        c cVar = (c) zj.p.q(this.f4625d.get(objO));
        l(cVar);
        cVar.f4641c.add(bVarA);
        h8.y yVarE = cVar.f4639a.e(bVarA, bVar2, j15);
        this.f4624c.put(yVarE, cVar);
        k();
        return yVarE;
    }

    public t7.e0 i() {
        if (this.f4623b.isEmpty()) {
            return t7.e0.f188127a;
        }
        int iP = 0;
        for (int i15 = 0; i15 < this.f4623b.size(); i15++) {
            c cVar = this.f4623b.get(i15);
            cVar.f4642d = iP;
            iP += cVar.f4639a.U().p();
        }
        return new y2(this.f4623b, this.f4631j);
    }

    public h8.b1 q() {
        return this.f4631j;
    }

    public int r() {
        return this.f4623b.size();
    }

    public boolean t() {
        return this.f4632k;
    }

    public t7.e0 v(int i15, int i16, int i17, h8.b1 b1Var) {
        zj.p.d(i15 >= 0 && i15 <= i16 && i16 <= r() && i17 >= 0);
        this.f4631j = b1Var;
        if (i15 == i16 || i15 == i17) {
            return i();
        }
        int iMin = Math.min(i15, i17);
        int iMax = Math.max(((i16 - i15) + i17) - 1, i16 - 1);
        int iP = this.f4623b.get(iMin).f4642d;
        w7.o0.I0(this.f4623b, i15, i16, i17);
        while (iMin <= iMax) {
            c cVar = this.f4623b.get(iMin);
            cVar.f4642d = iP;
            iP += cVar.f4639a.U().p();
            iMin++;
        }
        return i();
    }

    public void w(y7.x xVar) {
        zj.p.w(!this.f4632k);
        this.f4633l = xVar;
        for (int i15 = 0; i15 < this.f4623b.size(); i15++) {
            c cVar = this.f4623b.get(i15);
            x(cVar);
            this.f4628g.add(cVar);
        }
        this.f4632k = true;
    }

    public void y() {
        for (b bVar : this.f4627f.values()) {
            try {
                bVar.f4636a.i(bVar.f4637b);
            } catch (RuntimeException e15) {
                w7.t.d("MediaSourceList", "Failed to release child source.", e15);
            }
            bVar.f4636a.l(bVar.f4638c);
            bVar.f4636a.f(bVar.f4638c);
        }
        this.f4627f.clear();
        this.f4628g.clear();
        this.f4632k = false;
    }

    public void z(h8.b0 b0Var) {
        c cVar = (c) zj.p.q(this.f4624c.remove(b0Var));
        cVar.f4639a.p(b0Var);
        cVar.f4641c.remove(((h8.y) b0Var).f81826a);
        if (!this.f4624c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
