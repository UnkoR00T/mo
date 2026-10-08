package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.i2;
import vr.h1;
import vr.t1;
import vr.u1;

/* JADX INFO: loaded from: classes4.dex */
public class u0 extends w0 implements t1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f228930m = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f228931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f228932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f228933h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f228934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final st.t0 f228935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t1 f228936l;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final u0 a(vr.a aVar, t1 t1Var, int i15, wr.h hVar, zs.f fVar, st.t0 t0Var, boolean z15, boolean z16, boolean z17, st.t0 t0Var2, h1 h1Var, er.a<? extends List<? extends u1>> aVar2) {
            return aVar2 == null ? new u0(aVar, t1Var, i15, hVar, fVar, t0Var, z15, z16, z17, t0Var2, h1Var) : new b(aVar, t1Var, i15, hVar, fVar, t0Var, z15, z16, z17, t0Var2, h1Var, aVar2);
        }

        private a() {
        }
    }

    public static final class b extends u0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final oq.k f228937n;

        public b(vr.a aVar, t1 t1Var, int i15, wr.h hVar, zs.f fVar, st.t0 t0Var, boolean z15, boolean z16, boolean z17, st.t0 t0Var2, h1 h1Var, er.a<? extends List<? extends u1>> aVar2) {
            super(aVar, t1Var, i15, hVar, fVar, t0Var, z15, z16, z17, t0Var2, h1Var);
            this.f228937n = oq.l.a(aVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List U0(b bVar) {
            return bVar.V0();
        }

        public final List<u1> V0() {
            return (List) this.f228937n.getValue();
        }

        @Override // yr.u0, vr.t1
        public t1 t0(vr.a aVar, zs.f fVar, int i15) {
            return new b(aVar, null, i15, getAnnotations(), fVar, getType(), E0(), v0(), u0(), y0(), h1.f208052a, new v0(this));
        }
    }

    public u0(vr.a aVar, t1 t1Var, int i15, wr.h hVar, zs.f fVar, st.t0 t0Var, boolean z15, boolean z16, boolean z17, st.t0 t0Var2, h1 h1Var) {
        super(aVar, hVar, fVar, t0Var, h1Var);
        this.f228931f = i15;
        this.f228932g = z15;
        this.f228933h = z16;
        this.f228934j = z17;
        this.f228935k = t0Var2;
        this.f228936l = t1Var == null ? this : t1Var;
    }

    public static final u0 Q0(vr.a aVar, t1 t1Var, int i15, wr.h hVar, zs.f fVar, st.t0 t0Var, boolean z15, boolean z16, boolean z17, st.t0 t0Var2, h1 h1Var, er.a<? extends List<? extends u1>> aVar2) {
        return f228930m.a(aVar, t1Var, i15, hVar, fVar, t0Var, z15, z16, z17, t0Var2, h1Var, aVar2);
    }

    @Override // vr.t1
    public boolean E0() {
        return this.f228932g && ((vr.b) b()).k().b();
    }

    @Override // vr.u1
    public boolean Q() {
        return false;
    }

    public Void R0() {
        return null;
    }

    @Override // vr.j1
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public t1 c(i2 i2Var) {
        if (i2Var.l()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // vr.a
    public Collection<t1> e() {
        Collection<? extends vr.a> collectionE = b().e();
        ArrayList arrayList = new ArrayList(pq.v.y(collectionE, 10));
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(((vr.a) it.next()).l().get(getIndex()));
        }
        return arrayList;
    }

    @Override // vr.t1
    public int getIndex() {
        return this.f228931f;
    }

    @Override // vr.q
    public vr.u h() {
        return vr.t.f208081f;
    }

    @Override // vr.u1
    public /* bridge */ /* synthetic */ ft.g s0() {
        return (ft.g) R0();
    }

    @Override // vr.t1
    public t1 t0(vr.a aVar, zs.f fVar, int i15) {
        return new u0(aVar, null, i15, getAnnotations(), fVar, getType(), E0(), v0(), u0(), y0(), h1.f208052a);
    }

    @Override // vr.t1
    public boolean u0() {
        return this.f228934j;
    }

    @Override // vr.t1
    public boolean v0() {
        return this.f228933h;
    }

    @Override // vr.t1
    public st.t0 y0() {
        return this.f228935k;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.b(this, d15);
    }

    @Override // yr.n, vr.m
    public vr.a b() {
        return (vr.a) super.b();
    }

    @Override // yr.n, yr.m, vr.m
    public t1 a() {
        t1 t1Var = this.f228936l;
        return t1Var == this ? this : t1Var.a();
    }
}
