package k0;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.e1;
import o.i0;
import o.j2;
import o.m1;
import o.t0;
import v.c0;
import v.e2;
import v.f2;
import v.j3;
import v.n0;
import v.n3;
import v.s;
import v.t2;
import v.u1;
import v.w3;
import v.x3;
import y.w;
import y.x;

/* JADX INFO: loaded from: classes.dex */
class k implements j2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set<j2> f107160a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x3 f107164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0 f107165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n0 f107166g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set<w3<?>> f107168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<j2, w3<?>> f107169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f107170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f107171m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<j2, g0.n0> f107161b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<j2, j> f107162c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map<j2, Boolean> f107163d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s f107167h = w();

    static class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<k> f107172a;

        a(k kVar) {
            this.f107172a = new WeakReference<>(kVar);
        }

        @Override // v.s
        public void b(int i15, c0 c0Var) {
            k kVar = this.f107172a.get();
            if (kVar != null) {
                Iterator<j2> it = kVar.f107160a.iterator();
                while (it.hasNext()) {
                    k.T(c0Var, it.next().z(), i15);
                }
            }
        }
    }

    k(n0 n0Var, n0 n0Var2, Set<j2> set, x3 x3Var, g.a aVar) {
        this.f107165f = n0Var;
        this.f107166g = n0Var2;
        this.f107164e = x3Var;
        this.f107160a = set;
        Map<j2, w3<?>> mapV = V(n0Var, set, x3Var);
        this.f107169k = mapV;
        HashSet hashSet = new HashSet(mapV.values());
        this.f107168j = hashSet;
        this.f107170l = new c(n0Var, hashSet);
        if (n0Var2 != null) {
            this.f107171m = new c(n0Var2, hashSet);
        }
        for (j2 j2Var : set) {
            this.f107163d.put(j2Var, Boolean.FALSE);
            this.f107162c.put(j2Var, new j(n0Var, this, aVar));
        }
    }

    private int A(j2 j2Var, n0 n0Var) {
        return n0Var.c().A(((f2) j2Var.l()).I(0));
    }

    private static n3 B(j2 j2Var, n3 n3Var, Map<j2, Size> map) {
        n3.a aVarI = n3Var.i();
        Size size = map.get(j2Var);
        if (size != null) {
            aVarI.e(size);
        }
        return aVarI.a();
    }

    static u1 C(j2 j2Var) {
        List<u1> listP = j2Var instanceof t0 ? j2Var.z().p() : j2Var.z().l().h();
        i6.i.i(listP.size() <= 1);
        if (listP.size() == 1) {
            return listP.get(0);
        }
        return null;
    }

    private static int D(j2 j2Var) {
        if (j2Var instanceof m1) {
            return 1;
        }
        return j2Var instanceof t0 ? 4 : 2;
    }

    private static int H(Set<w3<?>> set) {
        Iterator<w3<?>> it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().B(0));
        }
        return iMax;
    }

    private m1 J() {
        for (j2 j2Var : this.f107160a) {
            if (j2Var instanceof m1) {
                return (m1) j2Var;
            }
        }
        return null;
    }

    private g0.n0 L(j2 j2Var) {
        g0.n0 n0Var = this.f107161b.get(j2Var);
        Objects.requireNonNull(n0Var);
        return n0Var;
    }

    private boolean M(j2 j2Var) {
        Boolean bool = this.f107163d.get(j2Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    private static Range<Integer> S(Set<w3<?>> set) {
        Range<Integer> rangeIntersect = n3.f202727a;
        Iterator<w3<?>> it = set.iterator();
        while (it.hasNext()) {
            Range<Integer> rangeZ = it.next().z(rangeIntersect);
            Objects.requireNonNull(rangeZ);
            if (n3.f202727a.equals(rangeIntersect)) {
                rangeIntersect = rangeZ;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(rangeZ);
                } catch (IllegalArgumentException unused) {
                    e1.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + rangeZ);
                    return rangeIntersect.extend(rangeZ);
                }
            }
        }
        return rangeIntersect;
    }

    static void T(c0 c0Var, j3 j3Var, int i15) {
        Iterator<s> it = j3Var.k().iterator();
        while (it.hasNext()) {
            it.next().b(i15, new l(j3Var.l().i(), c0Var));
        }
    }

    private static Map<j2, w3<?>> V(n0 n0Var, Set<j2> set, x3 x3Var) {
        HashMap map = new HashMap();
        for (j2 j2Var : set) {
            map.put(j2Var, j2Var.J(n0Var.getCameraInfo(), null, j2Var.m(true, x3Var)));
        }
        return map;
    }

    private void X(j2 j2Var) {
        int iA = A(j2Var, this.f107165f);
        j jVar = this.f107162c.get(j2Var);
        Objects.requireNonNull(jVar);
        jVar.u(iA);
    }

    private i0.f v(j2 j2Var, c cVar, n0 n0Var, g0.n0 n0Var2, int i15, boolean z15, boolean z16) {
        int iA = n0Var.c().A(i15);
        boolean zL = x.l(n0Var2.r());
        w3<?> w3Var = this.f107169k.get(j2Var);
        Objects.requireNonNull(w3Var);
        PreferredChildSize preferredChildSizeR = cVar.r(w3Var, n0Var2.n(), x.g(n0Var2.r()), z15);
        Rect cropRectBeforeScaling = preferredChildSizeR.getCropRectBeforeScaling();
        Size childSizeToScale = preferredChildSizeR.getChildSizeToScale();
        int iV = x.v((n0Var2.q() + A(j2Var, n0Var)) - iA);
        return i0.f.h(D(j2Var), y(j2Var), cropRectBeforeScaling, x.p(childSizeToScale, iV), iV, z16 ? false : j2Var.I(n0Var) ^ zL);
    }

    private static void x(g0.n0 n0Var, u1 u1Var, j3 j3Var) {
        n0Var.v();
        try {
            n0Var.y(u1Var);
        } catch (u1.a unused) {
            if (j3Var.d() != null) {
                j3Var.d().a(j3Var, j3.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int y(j2 j2Var) {
        return j2Var instanceof t0 ? 256 : 34;
    }

    Set<j2> E() {
        return this.f107160a;
    }

    Map<j2, i0.f> F(g0.n0 n0Var, int i15, boolean z15, boolean z16) {
        HashMap map = new HashMap();
        for (j2 j2Var : this.f107160a) {
            g0.n0 n0Var2 = n0Var;
            i0.f fVarV = v(j2Var, this.f107170l, this.f107165f, n0Var2, i15, z15, z16);
            X(j2Var);
            map.put(j2Var, fVarV);
            n0Var = n0Var2;
        }
        return map;
    }

    Map<j2, h0.d> G(g0.n0 n0Var, g0.n0 n0Var2, int i15, boolean z15) {
        HashMap map = new HashMap();
        for (j2 j2Var : this.f107160a) {
            g0.n0 n0Var3 = n0Var;
            int i16 = i15;
            boolean z16 = z15;
            i0.f fVarV = v(j2Var, this.f107170l, this.f107165f, n0Var3, i16, z16, false);
            c cVar = this.f107171m;
            Objects.requireNonNull(cVar);
            n0 n0Var4 = this.f107166g;
            Objects.requireNonNull(n0Var4);
            g0.n0 n0Var5 = n0Var2;
            i0.f fVarV2 = v(j2Var, cVar, n0Var4, n0Var5, i16, z16, false);
            X(j2Var);
            map.put(j2Var, h0.d.c(fVarV, fVarV2));
            n0Var = n0Var3;
            n0Var2 = n0Var5;
            i15 = i16;
            z15 = z16;
        }
        return map;
    }

    s I() {
        return this.f107167h;
    }

    Map<j2, Size> K(g0.n0 n0Var, boolean z15) {
        HashMap map = new HashMap();
        for (j2 j2Var : this.f107160a) {
            c cVar = this.f107170l;
            w3<?> w3Var = this.f107169k.get(j2Var);
            Objects.requireNonNull(w3Var);
            PreferredChildSize preferredChildSizeR = cVar.r(w3Var, n0Var.n(), x.g(n0Var.r()), z15);
            map.put(j2Var, preferredChildSizeR.getOriginalSelectedChildSize());
            e1.a("VirtualCameraAdapter", "Selected child size: " + preferredChildSizeR.getOriginalSelectedChildSize() + ", useCase: " + j2Var);
        }
        return map;
    }

    void N(t2 t2Var) {
        t2Var.m(f2.f202586z, this.f107170l.o(t2Var));
        t2Var.m(w3.E, Integer.valueOf(H(this.f107168j)));
        i0 i0VarD = k0.a.d(this.f107168j);
        if (i0VarD == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        t2Var.m(e2.f202559p, i0VarD);
        t2Var.m(w3.G, S(this.f107168j));
        Iterator<j2> it = this.f107160a.iterator();
        while (it.hasNext()) {
            w3<?> w3Var = this.f107169k.get(it.next());
            Objects.requireNonNull(w3Var);
            w3<?> w3Var2 = w3Var;
            if (w3Var2.y() != 0) {
                t2Var.m(w3.N, Integer.valueOf(w3Var2.y()));
            }
            if (w3Var2.D() != 0) {
                t2Var.m(w3.M, Integer.valueOf(w3Var2.D()));
            }
        }
    }

    void O() {
        Iterator<j2> it = this.f107160a.iterator();
        while (it.hasNext()) {
            it.next().P();
        }
    }

    void P() {
        Iterator<j2> it = this.f107160a.iterator();
        while (it.hasNext()) {
            it.next().S();
        }
    }

    void Q() {
        Iterator<j2> it = this.f107160a.iterator();
        while (it.hasNext()) {
            it.next().T();
        }
    }

    void R() {
        w.b();
        Iterator<j2> it = this.f107160a.iterator();
        while (it.hasNext()) {
            q(it.next());
        }
    }

    void U(Map<j2, g0.n0> map, Map<j2, Size> map2) {
        this.f107161b.clear();
        this.f107161b.putAll(map);
        for (Map.Entry<j2, g0.n0> entry : this.f107161b.entrySet()) {
            j2 key = entry.getKey();
            g0.n0 value = entry.getValue();
            key.d0(value.n());
            key.b0(value.r());
            key.g0(B(key, value.s(), map2), null);
            key.N();
        }
    }

    void W() {
        for (j2 j2Var : this.f107160a) {
            j jVar = this.f107162c.get(j2Var);
            Objects.requireNonNull(jVar);
            j2Var.e0(jVar);
        }
    }

    @Override // o.j2.c
    public void f(j2 j2Var) {
        w.b();
        if (M(j2Var)) {
            return;
        }
        this.f107163d.put(j2Var, Boolean.TRUE);
        u1 u1VarC = C(j2Var);
        if (u1VarC != null) {
            x(L(j2Var), u1VarC, j2Var.z());
        }
    }

    @Override // o.j2.c
    public void j(j2 j2Var) {
        w.b();
        if (M(j2Var)) {
            g0.n0 n0VarL = L(j2Var);
            u1 u1VarC = C(j2Var);
            if (u1VarC != null) {
                x(n0VarL, u1VarC, j2Var.z());
            } else {
                n0VarL.m();
            }
        }
    }

    @Override // o.j2.c
    public void m(j2 j2Var) {
        w.b();
        if (M(j2Var)) {
            this.f107163d.put(j2Var, Boolean.FALSE);
            L(j2Var).m();
        }
    }

    @Override // o.j2.c
    public void q(j2 j2Var) {
        u1 u1VarC;
        w.b();
        g0.n0 n0VarL = L(j2Var);
        if (M(j2Var) && (u1VarC = C(j2Var)) != null) {
            x(n0VarL, u1VarC, j2Var.z());
        }
    }

    void u() {
        for (j2 j2Var : this.f107160a) {
            j jVar = this.f107162c.get(j2Var);
            Objects.requireNonNull(jVar);
            j2Var.d(jVar, null, null, j2Var.m(true, this.f107164e));
        }
    }

    s w() {
        return new a(this);
    }

    h0.d z(g0.n0 n0Var, g0.n0 n0Var2, int i15, boolean z15) {
        m1 m1Var = (m1) i6.i.g(J());
        return h0.d.c(v(m1Var, this.f107170l, this.f107165f, n0Var, i15, z15, false), v(m1Var, this.f107170l, this.f107166g, n0Var2, i15, z15, false));
    }
}
