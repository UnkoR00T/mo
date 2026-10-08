package o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import s.DynamicRangeFeature;
import s.FpsRangeFeature;
import s.VideoStabilizationFeature;
import v.j3;
import v.n3;
import v.u2;
import v.w3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w3<?> f140029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w3<?> f140030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Set<q.b> f140031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private w3<?> f140032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n3 f140033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w3<?> f140034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f140035l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v.n0 f140037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private v.n0 f140038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f140039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f140040q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f140024a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<c> f140025b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f140026c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f140027d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f140028e = b.INACTIVE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f140036m = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p1 f140041r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p1.c f140042s = new p1.c() { // from class: o.i2
        @Override // o.p1.c
        public final void a(int i15) {
            this.f140021a.R(i15);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private j3 f140043t = j3.b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j3 f140044u = j3.b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f140045a;

        static {
            int[] iArr = new int[x.a.values().length];
            f140045a = iArr;
            try {
                iArr[x.a.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f140045a[x.a.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f140045a[x.a.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f140045a[x.a.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum b {
        ACTIVE,
        INACTIVE
    }

    public interface c {
        void f(j2 j2Var);

        void j(j2 j2Var);

        void m(j2 j2Var);

        void q(j2 j2Var);
    }

    protected j2(w3<?> w3Var) {
        this.f140030g = w3Var;
        this.f140032i = w3Var;
    }

    private void X(c cVar) {
        this.f140025b.remove(cVar);
    }

    private void a(c cVar) {
        this.f140025b.add(cVar);
    }

    private void c(u2 u2Var) {
        e1.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f140031h + ", this = " + this);
        Set<q.b> set = this.f140031h;
        if (set == null) {
            return;
        }
        i0 i0VarF = DynamicRangeFeature.f176973j;
        Range<Integer> range = n3.f202727a;
        x.a aVarF = VideoStabilizationFeature.f176992j;
        for (q.b bVar : set) {
            if (bVar instanceof DynamicRangeFeature) {
                i0VarF = ((DynamicRangeFeature) bVar).getDynamicRange();
            } else if (bVar instanceof FpsRangeFeature) {
                FpsRangeFeature cVar = (FpsRangeFeature) bVar;
                range = new Range<>(Integer.valueOf(cVar.getMinFps()), Integer.valueOf(cVar.getMaxFps()));
            } else if (bVar instanceof VideoStabilizationFeature) {
                aVarF = ((VideoStabilizationFeature) bVar).getVideoStabilization();
            }
        }
        if ((this instanceof m1) || y.z.h(this)) {
            u2Var.m(v.e2.f202559p, i0VarF);
        }
        u2Var.m(w3.G, range);
        int i15 = a.f140045a[aVarF.ordinal()];
        if (i15 == 1) {
            u2Var.m(w3.M, 0);
            u2Var.m(w3.N, 0);
            return;
        }
        if (i15 == 2) {
            u2Var.m(w3.M, 1);
            u2Var.m(w3.N, 1);
        } else if (i15 == 3) {
            u2Var.m(w3.M, 0);
            u2Var.m(w3.N, 2);
        } else {
            if (i15 != 4) {
                return;
            }
            u2Var.m(w3.M, 2);
            u2Var.m(w3.N, 0);
        }
    }

    public Set<i0> A(v.m0 m0Var) {
        return null;
    }

    protected Set<Integer> B() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    protected int C() {
        return ((v.f2) this.f140032i).I(0);
    }

    public abstract w3.b<?, ?, ?> D(v.p1 p1Var);

    public Rect E() {
        return this.f140035l;
    }

    public boolean F() {
        return false;
    }

    public boolean G(int i15) {
        Iterator<Integer> it = B().iterator();
        while (it.hasNext()) {
            if (g0.z0.c(i15, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean H() {
        return this.f140024a;
    }

    public boolean I(v.n0 n0Var) {
        int iQ = q();
        if (iQ == -1 || iQ == 0) {
            return false;
        }
        if (iQ == 1) {
            return true;
        }
        if (iQ == 2) {
            return n0Var.p();
        }
        throw new AssertionError("Unknown mirrorMode: " + iQ);
    }

    public w3<?> J(v.m0 m0Var, w3<?> w3Var, w3<?> w3Var2) {
        u2 u2VarL0;
        if (w3Var2 != null) {
            u2VarL0 = u2.m0(w3Var2);
            u2VarL0.n0(b0.r.f15615b);
        } else {
            u2VarL0 = u2.l0();
        }
        if (this.f140030g.h(v.f2.f202577q) || this.f140030g.h(v.f2.f202581u)) {
            v.p1.a<j0.c> aVar = v.f2.f202585y;
            if (u2VarL0.h(aVar)) {
                u2VarL0.n0(aVar);
            }
        }
        w3<?> w3Var3 = this.f140030g;
        v.p1.a<j0.c> aVar2 = v.f2.f202585y;
        if (w3Var3.h(aVar2)) {
            v.p1.a<Size> aVar3 = v.f2.f202583w;
            if (u2VarL0.h(aVar3) && ((j0.c) this.f140030g.d(aVar2)).d() != null) {
                u2VarL0.n0(aVar3);
            }
        }
        Iterator<v.p1.a<?>> it = this.f140030g.b().iterator();
        while (it.hasNext()) {
            v.p1.Z(u2VarL0, u2VarL0, this.f140030g, it.next());
        }
        if (w3Var != null) {
            for (v.p1.a<?> aVar4 : w3Var.b()) {
                if (!aVar4.c().equals(b0.r.f15615b.c())) {
                    v.p1.Z(u2VarL0, u2VarL0, w3Var, aVar4);
                }
            }
        }
        if (u2VarL0.h(v.f2.f202581u)) {
            v.p1.a<Integer> aVar5 = v.f2.f202577q;
            if (u2VarL0.h(aVar5)) {
                u2VarL0.n0(aVar5);
            }
        }
        v.p1.a<j0.c> aVar6 = v.f2.f202585y;
        if (u2VarL0.h(aVar6) && ((j0.c) u2VarL0.d(aVar6)).a() != 0) {
            u2VarL0.m(w3.J, Boolean.TRUE);
        }
        c(u2VarL0);
        return Q(m0Var, D(u2VarL0));
    }

    protected final void K() {
        this.f140028e = b.ACTIVE;
        N();
    }

    protected final void L() {
        this.f140028e = b.INACTIVE;
        N();
    }

    protected final void M() {
        Iterator<c> it = this.f140025b.iterator();
        while (it.hasNext()) {
            it.next().q(this);
        }
    }

    public final void N() {
        int iOrdinal = this.f140028e.ordinal();
        if (iOrdinal == 0) {
            Iterator<c> it = this.f140025b.iterator();
            while (it.hasNext()) {
                it.next().f(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator<c> it4 = this.f140025b.iterator();
            while (it4.hasNext()) {
                it4.next().m(this);
            }
        }
    }

    public void O() {
    }

    public void P() {
    }

    protected w3<?> Q(v.m0 m0Var, w3.b<?, ?, ?> bVar) {
        return bVar.d();
    }

    protected void R(int i15) {
        c0(i15);
    }

    public void S() {
        this.f140024a = true;
    }

    public void T() {
        this.f140024a = false;
    }

    protected n3 U(v.p1 p1Var) {
        n3 n3Var = this.f140033j;
        if (n3Var != null) {
            return n3Var.i().d(p1Var).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    protected n3 V(n3 n3Var, n3 n3Var2) {
        return n3Var;
    }

    public void W() {
    }

    public void Y(k kVar) {
        i6.i.a(kVar == null || G(kVar.g()));
        this.f140039p = kVar;
    }

    public void Z(Set<q.b> set) {
        this.f140031h = set != null ? new HashSet(set) : null;
    }

    public void a0(p1 p1Var) {
        synchronized (this.f140027d) {
            this.f140041r = p1Var;
        }
    }

    protected void b(j3.b bVar, n3 n3Var) {
        if (!n3.f202727a.equals(n3Var.c())) {
            bVar.s(n3Var.c());
            return;
        }
        synchronized (this.f140026c) {
            try {
                List listC = ((v.n0) i6.i.g(this.f140037n)).o().s().c(AeFpsRangeQuirk.class);
                boolean z15 = true;
                if (listC.size() > 1) {
                    z15 = false;
                }
                i6.i.b(z15, "There should not have more than one AeFpsRangeQuirk.");
                if (!listC.isEmpty()) {
                    bVar.s(((AeFpsRangeQuirk) listC.get(0)).a());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void b0(Matrix matrix) {
        this.f140036m = new Matrix(matrix);
    }

    protected boolean c0(int i15) {
        int I = ((v.f2) l()).I(-1);
        if (I != -1 && I == i15) {
            return false;
        }
        w3.b<?, ?, ?> bVarD = D(this.f140030g);
        f0.e.a(bVarD, i15);
        this.f140030g = bVarD.d();
        v.n0 n0VarI = i();
        if (n0VarI == null) {
            this.f140032i = this.f140030g;
            return true;
        }
        this.f140032i = J(n0VarI.o(), this.f140029f, this.f140034k);
        return true;
    }

    @SuppressLint({"WrongConstant"})
    public final void d(v.n0 n0Var, v.n0 n0Var2, w3<?> w3Var, w3<?> w3Var2) {
        synchronized (this.f140026c) {
            try {
                this.f140037n = n0Var;
                this.f140038o = n0Var2;
                a(n0Var);
                if (n0Var2 != null) {
                    a(n0Var2);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f140029f = w3Var;
        this.f140034k = w3Var2;
        this.f140032i = J(n0Var.o(), this.f140029f, this.f140034k);
        synchronized (this.f140027d) {
            try {
                p1 p1Var = this.f140041r;
                if (p1Var != null) {
                    p1Var.c(z.a.d(), this.f140042s);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        O();
    }

    public void d0(Rect rect) {
        this.f140035l = rect;
    }

    public w3<?> e() {
        return this.f140030g;
    }

    public final void e0(v.n0 n0Var) {
        W();
        synchronized (this.f140026c) {
            try {
                v.n0 n0Var2 = this.f140037n;
                if (n0Var == n0Var2) {
                    X(n0Var2);
                    this.f140037n = null;
                }
                v.n0 n0Var3 = this.f140038o;
                if (n0Var == n0Var3) {
                    X(n0Var3);
                    this.f140038o = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        synchronized (this.f140027d) {
            try {
                p1 p1Var = this.f140041r;
                if (p1Var != null) {
                    p1Var.e(this.f140042s);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f140033j = null;
        this.f140035l = null;
        this.f140032i = this.f140030g;
        this.f140029f = null;
        this.f140034k = null;
    }

    protected int f() {
        return ((v.f2) this.f140032i).v(-1);
    }

    protected void f0(List<j3> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f140043t = list.get(0);
        if (list.size() > 1) {
            this.f140044u = list.get(1);
        }
        Iterator<j3> it = list.iterator();
        while (it.hasNext()) {
            for (v.u1 u1Var : it.next().p()) {
                if (u1Var.g() == null) {
                    u1Var.p(getClass());
                }
            }
        }
    }

    public n3 g() {
        return this.f140033j;
    }

    public void g0(n3 n3Var, n3 n3Var2) {
        this.f140033j = V(n3Var, n3Var2);
    }

    public Size h() {
        n3 n3Var = this.f140033j;
        if (n3Var != null) {
            return n3Var.f();
        }
        return null;
    }

    public void h0(v.p1 p1Var) {
        this.f140033j = U(p1Var);
    }

    public v.n0 i() {
        v.n0 n0Var;
        synchronized (this.f140026c) {
            n0Var = this.f140037n;
        }
        return n0Var;
    }

    protected v.j0 j() {
        synchronized (this.f140026c) {
            try {
                v.n0 n0Var = this.f140037n;
                if (n0Var == null) {
                    return v.j0.f202614a;
                }
                return n0Var.h();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected String k() {
        return ((v.n0) i6.i.h(i(), "No camera attached to use case: " + this)).o().i();
    }

    public w3<?> l() {
        return this.f140032i;
    }

    public abstract w3<?> m(boolean z15, x3 x3Var);

    public k n() {
        return this.f140039p;
    }

    public Set<q.b> o() {
        return this.f140031h;
    }

    public int p() {
        return this.f140032i.r();
    }

    protected int q() {
        return ((v.f2) this.f140032i).h0(-1);
    }

    public String r() {
        String strW = this.f140032i.w("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strW);
        return strW;
    }

    public String s() {
        return this.f140040q;
    }

    protected int t(v.n0 n0Var) {
        return u(n0Var, false);
    }

    protected int u(v.n0 n0Var, boolean z15) {
        int iA = n0Var.o().A(C());
        return (n0Var.s() || !z15) ? iA : y.x.v(-iA);
    }

    public v.n0 v() {
        v.n0 n0Var;
        synchronized (this.f140026c) {
            n0Var = this.f140038o;
        }
        return n0Var;
    }

    protected String w() {
        if (v() == null) {
            return null;
        }
        return v().o().i();
    }

    public j3 x() {
        return this.f140044u;
    }

    public Matrix y() {
        return this.f140036m;
    }

    public j3 z() {
        return this.f140043t;
    }
}
