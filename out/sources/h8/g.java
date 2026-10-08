package h8;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g<T> extends h8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f81579h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f81580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y7.x f81581j;

    private final class a implements j0, d8.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f81582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j0.a f81583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d8.t.a f81584c;

        public a(T t15) {
            this.f81583b = g.this.t(null);
            this.f81584c = g.this.r(null);
            this.f81582a = t15;
        }

        private boolean a(int i15, c0.b bVar) {
            c0.b bVarC;
            if (bVar != null) {
                bVarC = g.this.C(this.f81582a, bVar);
                if (bVarC == null) {
                    return false;
                }
            } else {
                bVarC = null;
            }
            int iE = g.this.E(this.f81582a, i15);
            j0.a aVar = this.f81583b;
            if (aVar.f81609a != iE || !Objects.equals(aVar.f81610b, bVarC)) {
                this.f81583b = g.this.s(iE, bVarC);
            }
            d8.t.a aVar2 = this.f81584c;
            if (aVar2.f40322a == iE && Objects.equals(aVar2.f40323b, bVarC)) {
                return true;
            }
            this.f81584c = g.this.q(iE, bVarC);
            return true;
        }

        private a0 c(a0 a0Var, c0.b bVar) {
            long jD = g.this.D(this.f81582a, a0Var.f81459f, bVar);
            long jD2 = g.this.D(this.f81582a, a0Var.f81460g, bVar);
            return (jD == a0Var.f81459f && jD2 == a0Var.f81460g) ? a0Var : new a0(a0Var.f81454a, a0Var.f81455b, a0Var.f81456c, a0Var.f81457d, a0Var.f81458e, jD, jD2);
        }

        @Override // d8.t
        public void D(int i15, c0.b bVar) {
            if (a(i15, bVar)) {
                this.f81584c.i();
            }
        }

        @Override // h8.j0
        public void G(int i15, c0.b bVar, x xVar, a0 a0Var, int i16) {
            if (a(i15, bVar)) {
                this.f81583b.r(xVar, c(a0Var, bVar), i16);
            }
        }

        @Override // h8.j0
        public void H(int i15, c0.b bVar, a0 a0Var) {
            if (a(i15, bVar)) {
                this.f81583b.j(c(a0Var, bVar));
            }
        }

        @Override // h8.j0
        public void I(int i15, c0.b bVar, x xVar, a0 a0Var, IOException iOException, boolean z15) {
            if (a(i15, bVar)) {
                this.f81583b.p(xVar, c(a0Var, bVar), iOException, z15);
            }
        }

        @Override // h8.j0
        public void N(int i15, c0.b bVar, x xVar, a0 a0Var) {
            if (a(i15, bVar)) {
                this.f81583b.n(xVar, c(a0Var, bVar));
            }
        }

        @Override // d8.t
        public void W(int i15, c0.b bVar, Exception exc) {
            if (a(i15, bVar)) {
                this.f81584c.l(exc);
            }
        }

        @Override // d8.t
        public void b0(int i15, c0.b bVar, d8.h0 h0Var) {
            if (a(i15, bVar)) {
                this.f81584c.h(h0Var);
            }
        }

        @Override // d8.t
        public void d0(int i15, c0.b bVar, int i16) {
            if (a(i15, bVar)) {
                this.f81584c.k(i16);
            }
        }

        @Override // d8.t
        public void l0(int i15, c0.b bVar) {
            if (a(i15, bVar)) {
                this.f81584c.j();
            }
        }

        @Override // d8.t
        public void m0(int i15, c0.b bVar) {
            if (a(i15, bVar)) {
                this.f81584c.m();
            }
        }

        @Override // h8.j0
        public void n0(int i15, c0.b bVar, x xVar, a0 a0Var) {
            if (a(i15, bVar)) {
                this.f81583b.l(xVar, c(a0Var, bVar));
            }
        }
    }

    private static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f81586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c0.c f81587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g<T>.a f81588c;

        public b(c0 c0Var, c0.c cVar, g<T>.a aVar) {
            this.f81586a = c0Var;
            this.f81587b = cVar;
            this.f81588c = aVar;
        }
    }

    protected g() {
    }

    @Override // h8.a
    protected void A() {
        for (b<T> bVar : this.f81579h.values()) {
            bVar.f81586a.i(bVar.f81587b);
            bVar.f81586a.l(bVar.f81588c);
            bVar.f81586a.f(bVar.f81588c);
        }
        this.f81579h.clear();
    }

    protected abstract c0.b C(T t15, c0.b bVar);

    protected long D(T t15, long j15, c0.b bVar) {
        return j15;
    }

    protected int E(T t15, int i15) {
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void F(T t15, c0 c0Var, t7.e0 e0Var);

    protected final void G(final T t15, c0 c0Var) {
        zj.p.d(!this.f81579h.containsKey(t15));
        c0.c cVar = new c0.c() { // from class: h8.f
            @Override // h8.c0.c
            public final void a(c0 c0Var2, t7.e0 e0Var) {
                this.f81571a.F(t15, c0Var2, e0Var);
            }
        };
        a aVar = new a(t15);
        this.f81579h.put(t15, new b<>(c0Var, cVar, aVar));
        c0Var.n((Handler) zj.p.q(this.f81580i), aVar);
        c0Var.a((Handler) zj.p.q(this.f81580i), aVar);
        c0Var.d(cVar, this.f81581j, w());
        if (x()) {
            return;
        }
        c0Var.g(cVar);
    }

    @Override // h8.c0
    public void j() {
        Iterator<b<T>> it = this.f81579h.values().iterator();
        while (it.hasNext()) {
            it.next().f81586a.j();
        }
    }

    @Override // h8.a
    protected void u() {
        for (b<T> bVar : this.f81579h.values()) {
            bVar.f81586a.g(bVar.f81587b);
        }
    }

    @Override // h8.a
    protected void v() {
        for (b<T> bVar : this.f81579h.values()) {
            bVar.f81586a.h(bVar.f81587b);
        }
    }

    @Override // h8.a
    protected void y(y7.x xVar) {
        this.f81581j = xVar;
        this.f81580i = w7.o0.z();
    }
}
