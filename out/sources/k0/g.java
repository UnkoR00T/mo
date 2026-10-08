package k0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import g0.n0;
import g0.t;
import g0.v0;
import h0.r;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.e1;
import o.h0;
import o.i0;
import o.j2;
import o.k0;
import v.e2;
import v.f2;
import v.j3;
import v.m0;
import v.n3;
import v.o3;
import v.p1;
import v.t2;
import v.u2;
import v.w3;
import v.x3;
import v.z2;
import y.w;
import y.x;

/* JADX INFO: loaded from: classes.dex */
public class g extends j2 {
    private v0 A;
    private r B;
    private v0 C;
    private n0 D;
    private n0 E;
    private n0 F;
    private n0 G;
    private n0 H;
    private n0 I;
    j3.b J;
    j3.b K;
    private j3.c L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final i f107150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final k f107151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final h0 f107152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final h0 f107153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private v0 f107154z;

    interface a {
        com.google.common.util.concurrent.q<Void> a(int i15, int i16);
    }

    public g(v.n0 n0Var, v.n0 n0Var2, h0 h0Var, h0 h0Var2, Set<j2> set, x3 x3Var) {
        super(x0(set));
        this.f107150v = x0(set);
        this.f107152x = h0Var;
        this.f107153y = h0Var2;
        this.f107151w = new k(n0Var, n0Var2, set, x3Var, new a() { // from class: k0.f
            @Override // k0.g.a
            public final com.google.common.util.concurrent.q a(int i15, int i16) {
                return g.j0(this.f107149a, i15, i16);
            }
        });
        H0(set);
    }

    private int A0() {
        if (((o.k) i6.i.g(n())).h() == 1) {
            return t((v.n0) i6.i.g(i()));
        }
        return 0;
    }

    private n0 B0(n0 n0Var, v.n0 n0Var2, boolean z15) {
        return (n() == null || n().h() == 2 || z15 || n().e() == 1) ? n0Var : y0(n0Var, n0Var2);
    }

    public static boolean C0(j2 j2Var) {
        return j2Var instanceof g;
    }

    private void D0(Size size, j3.b bVar) {
        Iterator<j2> it = u0().iterator();
        while (it.hasNext()) {
            j3 j3VarO = j3.b.p(it.next().l(), size).o();
            bVar.c(j3VarO.k());
            bVar.a(j3VarO.o());
            bVar.d(j3VarO.m());
            bVar.b(j3VarO.c());
            bVar.g(j3VarO.g());
        }
    }

    private void E0(j3.b bVar) {
        Iterator<j2> it = u0().iterator();
        int iF = -1;
        while (it.hasNext()) {
            iF = j3.f(iF, t0(it.next()));
        }
        if (iF != -1) {
            bVar.y(iF);
        }
    }

    private void F0(n0 n0Var, v0 v0Var, boolean z15) {
        boolean z16 = E() != null;
        Map<j2, i0.f> mapF = this.f107151w.F(n0Var, C(), z16, z15);
        v0.c cVarJ = v0Var.j(v0.b.c(n0Var, new ArrayList(mapF.values())));
        HashMap map = new HashMap();
        for (Map.Entry<j2, i0.f> entry : mapF.entrySet()) {
            map.put(entry.getKey(), cVarJ.get(entry.getValue()));
        }
        this.f107151w.U(map, this.f107151w.K(n0Var, z16));
    }

    private void G0(n0 n0Var, n0 n0Var2, r rVar, n3 n3Var) {
        if (n() == null) {
            boolean z15 = E() != null;
            Map<j2, h0.d> mapG = this.f107151w.G(n0Var, n0Var2, C(), z15);
            r.c cVarG = this.B.g(r.b.d(n0Var, n0Var2, new ArrayList(mapG.values())));
            HashMap map = new HashMap();
            for (Map.Entry<j2, h0.d> entry : mapG.entrySet()) {
                map.put(entry.getKey(), cVarG.get(entry.getValue()));
            }
            this.f107151w.U(map, this.f107151w.K(n0Var, z15));
            return;
        }
        this.H = rVar.g(r.b.d(n0Var, n0Var2, Arrays.asList(this.f107151w.z(n0Var, n0Var2, C(), E() != null)))).values().iterator().next();
        if (n().e() == 1) {
            this.I = this.H;
        } else {
            n0 n0Var3 = this.H;
            Objects.requireNonNull(n0Var3);
            v.n0 n0VarI = i();
            Objects.requireNonNull(n0VarI);
            this.I = y0(n0Var3, n0VarI);
        }
        v.n0 n0VarI2 = i();
        Objects.requireNonNull(n0VarI2);
        v0 v0VarN0 = n0(n0VarI2, n3Var);
        this.C = v0VarN0;
        F0(this.I, v0VarN0, true);
    }

    public static /* synthetic */ void i0(g gVar, String str, String str2, w3 w3Var, n3 n3Var, n3 n3Var2, j3 j3Var, j3.g gVar2) {
        if (gVar.i() == null) {
            return;
        }
        gVar.l0();
        gVar.f0(gVar.o0(str, str2, w3Var, n3Var, n3Var2));
        gVar.M();
        gVar.f107151w.R();
    }

    public static /* synthetic */ com.google.common.util.concurrent.q j0(g gVar, int i15, int i16) {
        v0 v0Var = gVar.A;
        return v0Var != null ? v0Var.e().d(i15, i16) : a0.f.f(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void k0(j3.b bVar, final String str, final String str2, final w3<?> w3Var, final n3 n3Var, final n3 n3Var2) {
        j3.c cVar = this.L;
        if (cVar != null) {
            cVar.b();
        }
        j3.c cVar2 = new j3.c(new j3.d() { // from class: k0.e
            @Override // v.j3.d
            public final void a(j3 j3Var, j3.g gVar) {
                g.i0(this.f107143a, str, str2, w3Var, n3Var, n3Var2, j3Var, gVar);
            }
        });
        this.L = cVar2;
        bVar.r(cVar2);
    }

    private void l0() {
        j3.c cVar = this.L;
        if (cVar != null) {
            cVar.b();
            this.L = null;
        }
        n0 n0Var = this.D;
        if (n0Var != null) {
            n0Var.i();
            this.D = null;
        }
        n0 n0Var2 = this.E;
        if (n0Var2 != null) {
            n0Var2.i();
            this.E = null;
        }
        n0 n0Var3 = this.F;
        if (n0Var3 != null) {
            n0Var3.i();
            this.F = null;
        }
        n0 n0Var4 = this.G;
        if (n0Var4 != null) {
            n0Var4.i();
            this.G = null;
        }
        n0 n0Var5 = this.H;
        if (n0Var5 != null) {
            n0Var5.i();
            this.H = null;
        }
        n0 n0Var6 = this.I;
        if (n0Var6 != null) {
            n0Var6.i();
            this.I = null;
        }
        v0 v0Var = this.A;
        if (v0Var != null) {
            v0Var.f();
            this.A = null;
        }
        r rVar = this.B;
        if (rVar != null) {
            rVar.d();
            this.B = null;
        }
        v0 v0Var2 = this.f107154z;
        if (v0Var2 != null) {
            v0Var2.f();
            this.f107154z = null;
        }
        v0 v0Var3 = this.C;
        if (v0Var3 != null) {
            v0Var3.f();
            this.C = null;
        }
    }

    private r m0(v.n0 n0Var, v.n0 n0Var2, n3 n3Var, h0 h0Var, h0 h0Var2) {
        return new r(n0Var, n0Var2, h0.o.a.a(n3Var.b(), h0Var, h0Var2), "StreamSharing");
    }

    private v0 n0(v.n0 n0Var, n3 n3Var) {
        if (n() == null || n().e() != 1) {
            return new v0(n0Var, t.a.a(n3Var.b()), "StreamSharing");
        }
        v0 v0Var = new v0(n0Var, n().a(), "StreamSharing");
        this.f107154z = v0Var;
        return v0Var;
    }

    private List<j3> o0(String str, String str2, w3<?> w3Var, n3 n3Var, n3 n3Var2) {
        w.b();
        if (n3Var2 != null) {
            n0 n0VarP0 = p0(str, str2, w3Var, n3Var, n3Var2);
            n0 n0VarQ0 = q0(str, str2, w3Var, n3Var, n3Var2);
            r rVarM0 = m0(i(), v(), n3Var, this.f107152x, this.f107153y);
            this.B = rVarM0;
            G0(n0VarP0, n0VarQ0, rVarM0, n3Var);
            return k0.a(new Object[]{this.J.o(), this.K.o()});
        }
        n0 n0VarP1 = p0(str, str2, w3Var, n3Var, null);
        v.n0 n0VarI = i();
        Objects.requireNonNull(n0VarI);
        v0 v0VarN0 = n0(n0VarI, n3Var);
        this.A = v0VarN0;
        F0(n0VarP1, v0VarN0, false);
        return k0.a(new Object[]{this.J.o()});
    }

    private n0 p0(String str, String str2, w3<?> w3Var, n3 n3Var, n3 n3Var2) {
        Matrix matrixY = y();
        v.n0 n0VarI = i();
        Objects.requireNonNull(n0VarI);
        boolean zS = n0VarI.s();
        Rect rectV0 = v0(n3Var.f());
        Objects.requireNonNull(rectV0);
        v.n0 n0VarI2 = i();
        Objects.requireNonNull(n0VarI2);
        int iT = t(n0VarI2);
        v.n0 n0VarI3 = i();
        Objects.requireNonNull(n0VarI3);
        n0 n0Var = new n0(3, 34, n3Var, matrixY, zS, rectV0, iT, -1, I(n0VarI3));
        this.D = n0Var;
        boolean z15 = str2 != null;
        v.n0 n0VarI4 = i();
        Objects.requireNonNull(n0VarI4);
        this.F = B0(n0Var, n0VarI4, z15);
        j3.b bVarR0 = r0(this.D, w3Var, n3Var);
        this.J = bVarR0;
        k0(bVarR0, str, str2, w3Var, n3Var, n3Var2);
        return this.F;
    }

    private n0 q0(String str, String str2, w3<?> w3Var, n3 n3Var, n3 n3Var2) {
        Matrix matrixY = y();
        v.n0 n0VarV = v();
        Objects.requireNonNull(n0VarV);
        boolean zS = n0VarV.s();
        Rect rectV0 = v0(n3Var2.f());
        Objects.requireNonNull(rectV0);
        v.n0 n0VarV2 = v();
        Objects.requireNonNull(n0VarV2);
        int iT = t(n0VarV2);
        v.n0 n0VarV3 = v();
        Objects.requireNonNull(n0VarV3);
        n0 n0Var = new n0(3, 34, n3Var2, matrixY, zS, rectV0, iT, -1, I(n0VarV3));
        this.E = n0Var;
        v.n0 n0VarV4 = v();
        Objects.requireNonNull(n0VarV4);
        this.G = B0(n0Var, n0VarV4, true);
        j3.b bVarR0 = r0(this.E, w3Var, n3Var2);
        this.K = bVarR0;
        k0(bVarR0, str, str2, w3Var, n3Var, n3Var2);
        return this.G;
    }

    private j3.b r0(n0 n0Var, w3<?> w3Var, n3 n3Var) {
        j3.b bVarP = j3.b.p(w3Var, n3Var.f());
        E0(bVarP);
        D0(n3Var.f(), bVarP);
        bVarP.n(n0Var.o(), n3Var.b(), null, -1);
        bVarP.j(this.f107151w.I());
        if (n3Var.d() != null) {
            bVarP.g(n3Var.d());
        }
        bVarP.x(n3Var.g());
        b(bVarP, n3Var);
        return bVarP;
    }

    public static List<x3.b> s0(j2 j2Var) {
        ArrayList arrayList = new ArrayList();
        if (!C0(j2Var)) {
            arrayList.add(j2Var.l().W());
            return arrayList;
        }
        Iterator<j2> it = ((g) j2Var).u0().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l().W());
        }
        return arrayList;
    }

    private static int t0(j2 j2Var) {
        return j2Var.l().P().q();
    }

    private Rect v0(Size size) {
        return E() != null ? E() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private Rect w0(n0 n0Var) {
        return ((o.k) i6.i.g(n())).h() == 1 ? x.q(n0Var.s().f()) : n0Var.n();
    }

    private static i x0(Set<j2> set) {
        t2 t2VarA = new h().a();
        t2VarA.m(e2.f202557n, 34);
        ArrayList arrayList = new ArrayList();
        for (j2 j2Var : set) {
            if (j2Var.l().h(w3.L)) {
                arrayList.add(j2Var.l().W());
            } else {
                c2.e("StreamSharing", "A child does not have capture type.");
            }
        }
        t2VarA.m(i.S, arrayList);
        t2VarA.m(f2.f202580t, 2);
        t2VarA.m(w3.Q, o3.PREVIEW_VIDEO_STILL);
        return new i(z2.k0(t2VarA));
    }

    private n0 y0(n0 n0Var, v.n0 n0Var2) {
        this.f107154z = new v0(n0Var2, n().a(), "StreamSharing");
        int iA0 = A0();
        Rect rectW0 = w0(n0Var);
        i0.f fVarI = i0.f.i(n0Var.t(), n0Var.p(), rectW0, x.f(rectW0, iA0), iA0, z0(), true);
        n0 n0Var3 = this.f107154z.j(v0.b.c(n0Var, Collections.singletonList(fVarI))).get(fVarI);
        Objects.requireNonNull(n0Var3);
        return n0Var3;
    }

    private boolean z0() {
        if (((o.k) i6.i.g(n())).h() == 1) {
            v.n0 n0Var = (v.n0) i6.i.g(i());
            if (n0Var.p() && n0Var.s()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.j2
    public Set<i0> A(m0 m0Var) {
        Set<j2> setU0 = u0();
        HashSet hashSet = null;
        if (setU0.isEmpty()) {
            return null;
        }
        Iterator<j2> it = setU0.iterator();
        while (it.hasNext()) {
            Set<i0> setA = it.next().A(m0Var);
            if (setA != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(setA);
                } else {
                    hashSet.retainAll(setA);
                }
            }
        }
        return hashSet;
    }

    @Override // o.j2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // o.j2
    public w3.b<?, ?, ?> D(p1 p1Var) {
        return new h(u2.m0(p1Var));
    }

    public void H0(Set<j2> set) {
        Z(set.iterator().next().o());
    }

    @Override // o.j2
    public void O() {
        super.O();
        this.f107151w.u();
    }

    @Override // o.j2
    public void P() {
        super.P();
        this.f107151w.O();
    }

    @Override // o.j2
    protected w3<?> Q(m0 m0Var, w3.b<?, ?, ?> bVar) {
        this.f107151w.N(bVar.a());
        return bVar.d();
    }

    @Override // o.j2
    public void S() {
        super.S();
        this.f107151w.P();
    }

    @Override // o.j2
    public void T() {
        super.T();
        this.f107151w.Q();
    }

    @Override // o.j2
    protected n3 U(p1 p1Var) {
        this.J.g(p1Var);
        f0(k0.a(new Object[]{this.J.o()}));
        return g().i().d(p1Var).a();
    }

    @Override // o.j2
    protected n3 V(n3 n3Var, n3 n3Var2) {
        e1.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + n3Var + ", secondaryStreamSpec " + n3Var2);
        f0(o0(k(), w(), l(), n3Var, n3Var2));
        K();
        return n3Var;
    }

    @Override // o.j2
    public void W() {
        super.W();
        l0();
        this.f107151w.W();
    }

    @Override // o.j2
    public w3<?> m(boolean z15, x3 x3Var) {
        p1 p1VarA = x3Var.a(this.f107150v.W(), 1);
        if (z15) {
            p1VarA = p1.u(p1VarA, this.f107150v.getConfig());
        }
        if (p1VarA == null) {
            return null;
        }
        return D(p1VarA).d();
    }

    public Set<j2> u0() {
        return this.f107151w.E();
    }
}
