package b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import g0.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.e1;
import o.h0;
import o.h2;
import o.i0;
import o.j2;
import o.k2;
import o.m1;
import o.t0;
import r.ResolvedFeatureGroup;
import v.d2;
import v.f0;
import v.j0;
import v.j3;
import v.n0;
import v.n3;
import v.p1;
import v.u2;
import v.w3;
import v.x3;
import y.z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements o.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v.f f15565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v.f f15566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x3 f15567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.p f15568d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p.a f15571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k2 f15572h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0 f15576m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j2 f15580r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k0.g f15581s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h0 f15582t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h0 f15583v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final m f15585x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<j2> f15569e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<j2> f15570f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<o.k> f15573j = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15574k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Range<Integer> f15575l = n3.f202727a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f15577n = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15578p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p1 f15579q = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final e0.e f15584w = new e0.e();

    public static final class a extends Exception {
        public a(Throwable th4) {
            super(th4);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        w3<?> f15586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        w3<?> f15587b;

        b(w3<?> w3Var, w3<?> w3Var2) {
            this.f15586a = w3Var;
            this.f15587b = w3Var2;
        }
    }

    public f(n0 n0Var, n0 n0Var2, v.e eVar, v.e eVar2, h0 h0Var, h0 h0Var2, p.a aVar, m mVar, x3 x3Var) {
        this.f15576m = eVar.e();
        this.f15565a = new v.f(n0Var, eVar);
        if (n0Var2 == null || eVar2 == null) {
            this.f15566b = null;
        } else {
            this.f15566b = new v.f(n0Var2, eVar2);
        }
        this.f15582t = h0Var;
        this.f15583v = h0Var2;
        this.f15571g = aVar;
        this.f15567c = x3Var;
        this.f15568d = o.p.a.e(eVar, eVar2);
        this.f15585x = mVar;
    }

    static Collection<j2> A(Collection<j2> collection, j2 j2Var, k0.g gVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (j2Var != null) {
            arrayList.add(j2Var);
        }
        if (gVar != null) {
            arrayList.add(gVar);
            arrayList.removeAll(gVar.u0());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    private j2 B(Collection<j2> collection, k0.g gVar) {
        j2 j2VarF;
        synchronized (this.f15577n) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (gVar != null) {
                    arrayList.add(gVar);
                    arrayList.removeAll(gVar.u0());
                }
                if (!V()) {
                    j2VarF = null;
                } else if (X(arrayList)) {
                    j2VarF = b0(this.f15580r) ? this.f15580r : G();
                } else if (W(arrayList)) {
                    j2VarF = Z(this.f15580r) ? this.f15580r : F();
                } else {
                    j2VarF = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return j2VarF;
    }

    private static Matrix C(Rect rect, Size size) {
        i6.i.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private void D(Collection<j2> collection) {
        if (Q()) {
            if (S(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (T(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f15577n) {
            try {
                if (!this.f15573j.isEmpty() && (U(collection) || T(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static void E(Collection<j2> collection) {
        Iterator<j2> it = collection.iterator();
        while (it.hasNext()) {
            it.next().Z(null);
        }
    }

    private t0 F() {
        return new t0.b().q("ImageCapture-Extra").e();
    }

    private m1 G() {
        m1 m1VarE = new m1.a().o("Preview-Extra").e();
        m1VarE.t0(new m1.c() { // from class: b0.e
            @Override // o.m1.c
            public final void a(h2 h2Var) {
                f.f(h2Var);
            }
        });
        return m1VarE;
    }

    private k0.g H(Collection<j2> collection, boolean z15) {
        synchronized (this.f15577n) {
            try {
                Set<j2> setO = O(collection, z15);
                if (setO.size() >= 2 || (Q() && z.b(setO))) {
                    k0.g gVar = this.f15581s;
                    if (gVar == null || !gVar.u0().equals(setO)) {
                        if (!d0(setO)) {
                            return null;
                        }
                        return new k0.g(this.f15565a, this.f15566b, this.f15582t, this.f15583v, setO, this.f15567c);
                    }
                    this.f15581s.H0(setO);
                    k0.g gVar2 = this.f15581s;
                    Objects.requireNonNull(gVar2);
                    return gVar2;
                }
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static w3<?> J(x3 x3Var, k0.g gVar) {
        w3<?> w3VarM = new m1.a().e().m(false, x3Var);
        if (w3VarM == null) {
            return null;
        }
        u2 u2VarM0 = u2.m0(w3VarM);
        u2VarM0.n0(r.f15616c);
        return gVar.D(u2VarM0).d();
    }

    private int L() {
        synchronized (this.f15577n) {
            try {
                return this.f15571g.f() == 2 ? 1 : 0;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    static Map<j2, b> M(Collection<j2> collection, x3 x3Var, x3 x3Var2, int i15, Range<Integer> range) {
        HashMap map = new HashMap();
        for (j2 j2Var : collection) {
            map.put(j2Var, new b(k0.g.C0(j2Var) ? J(x3Var, (k0.g) j2Var) : j2Var.m(false, x3Var), w(j2Var, j2Var.m(true, x3Var2), i15, range)));
        }
        return map;
    }

    private int N(boolean z15) {
        int iG;
        synchronized (this.f15577n) {
            try {
                Iterator<o.k> it = this.f15573j.iterator();
                o.k kVar = null;
                while (true) {
                    iG = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    o.k next = it.next();
                    if (z0.b(next.g()) > 1) {
                        i6.i.j(kVar == null, "Can only have one sharing effect.");
                        kVar = next;
                    }
                }
                if (kVar != null) {
                    iG = kVar.g();
                }
                if (z15) {
                    iG |= 3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return iG;
    }

    private Set<j2> O(Collection<j2> collection, boolean z15) {
        HashSet hashSet = new HashSet();
        int iN = N(z15);
        for (j2 j2Var : collection) {
            i6.i.b(!k0.g.C0(j2Var), "Only support one level of sharing for now.");
            if (j2Var.G(iN)) {
                hashSet.add(j2Var);
            }
        }
        return hashSet;
    }

    private boolean Q() {
        boolean z15;
        synchronized (this.f15577n) {
            z15 = this.f15576m.F(null) != null;
        }
        return z15;
    }

    private static boolean R(n3 n3Var, j3 j3Var) {
        p1 p1VarD = n3Var.d();
        p1 p1VarG = j3Var.g();
        Objects.requireNonNull(p1VarD);
        if (p1VarD.b().size() != j3Var.g().b().size()) {
            return true;
        }
        for (p1.a<?> aVar : p1VarD.b()) {
            if (!p1VarG.h(aVar) || !Objects.equals(p1VarG.d(aVar), p1VarD.d(aVar))) {
                return true;
            }
        }
        return false;
    }

    private static boolean S(Collection<j2> collection) {
        Iterator<j2> it = collection.iterator();
        while (it.hasNext()) {
            if (a0(it.next().l().J())) {
                return true;
            }
        }
        return false;
    }

    private static boolean T(Collection<j2> collection) {
        for (j2 j2Var : collection) {
            if (Z(j2Var)) {
                w3<?> w3VarL = j2Var.l();
                p1.a<?> aVar = d2.W;
                if (w3VarL.h(aVar) && ((Integer) i6.i.g((Integer) w3VarL.d(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean U(Collection<j2> collection) {
        for (j2 j2Var : collection) {
            if (Z(j2Var)) {
                w3<?> w3VarL = j2Var.l();
                p1.a<?> aVar = d2.W;
                if (w3VarL.h(aVar) && ((Integer) i6.i.g((Integer) w3VarL.d(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean V() {
        boolean z15;
        synchronized (this.f15577n) {
            z15 = true;
            if (this.f15576m.x() != 1) {
                z15 = false;
            }
        }
        return z15;
    }

    private static boolean W(Collection<j2> collection) {
        boolean z15 = false;
        boolean z16 = false;
        for (j2 j2Var : collection) {
            if (b0(j2Var) || k0.g.C0(j2Var)) {
                z15 = true;
            } else if (Z(j2Var)) {
                z16 = true;
            }
        }
        return z15 && !z16;
    }

    private static boolean X(Collection<j2> collection) {
        boolean z15 = false;
        boolean z16 = false;
        for (j2 j2Var : collection) {
            if (b0(j2Var) || k0.g.C0(j2Var)) {
                z16 = true;
            } else if (Z(j2Var)) {
                z15 = true;
            }
        }
        return z15 && !z16;
    }

    @SafeVarargs
    private static boolean Y(List<j2>... listArr) {
        boolean z15 = false;
        for (List<j2> list : listArr) {
            Iterator<j2> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().o() != null) {
                    z15 = true;
                    break;
                }
            }
            if (z15) {
                return z15;
            }
        }
        return z15;
    }

    private static boolean Z(j2 j2Var) {
        return j2Var instanceof t0;
    }

    private static boolean a0(i0 i0Var) {
        return (i0Var.a() == 10) || (i0Var.b() != 1 && i0Var.b() != 0);
    }

    private static boolean b0(j2 j2Var) {
        return j2Var instanceof m1;
    }

    private boolean c0() {
        return (Q() || this.f15566b != null || this.f15574k == 1) ? false : true;
    }

    static boolean d0(Collection<j2> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (j2 j2Var : collection) {
            for (int i15 = 0; i15 < 3; i15++) {
                int i16 = iArr[i15];
                if (j2Var.G(i16)) {
                    if (hashSet.contains(Integer.valueOf(i16))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i16));
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void f(h2 h2Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(h2Var.p().getWidth(), h2Var.p().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        h2Var.t(surface, z.a.a(), new i6.a() { // from class: b0.d
            @Override // i6.a
            public final void accept(Object obj) {
                f.j(surface, surfaceTexture, (h2.g) obj);
            }
        });
    }

    private static void f0(Map<j2, Set<q.b>> map) {
        for (Map.Entry<j2, Set<q.b>> entry : map.entrySet()) {
            entry.getKey().Z(entry.getValue());
        }
    }

    private void g0() {
        synchronized (this.f15577n) {
            try {
                if (this.f15579q != null) {
                    this.f15565a.h().c(this.f15579q);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static List<o.k> i0(List<o.k> list, Collection<j2> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (j2 j2Var : collection) {
            j2Var.Y(null);
            for (o.k kVar : list) {
                if (j2Var.G(kVar.g())) {
                    i6.i.j(j2Var.n() == null, j2Var + " already has effect" + j2Var.n());
                    j2Var.Y(kVar);
                    arrayList.remove(kVar);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void j(Surface surface, SurfaceTexture surfaceTexture, h2.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    private boolean m0(Collection<j2> collection) {
        if (Q() && z.b(collection)) {
            return true;
        }
        return this.f15584w.a(this.f15565a.o().i(), collection);
    }

    static void o0(List<o.k> list, Collection<j2> collection, Collection<j2> collection2) {
        List<o.k> listI0 = i0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<o.k> listI1 = i0(listI0, arrayList);
        if (listI1.isEmpty()) {
            return;
        }
        e1.o("CameraUseCaseAdapter", "Unused effects: " + listI1);
    }

    private void p0(Map<j2, n3> map, Collection<j2> collection) {
        Map<j2, n3> map2;
        synchronized (this.f15577n) {
            try {
                if (this.f15572h == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<j2, Rect> mapA = t.a(this.f15565a.o().k(), this.f15565a.o().n() == 0, this.f15572h.a(), this.f15565a.o().A(this.f15572h.c()), this.f15572h.d(), this.f15572h.b(), map2);
                    for (j2 j2Var : collection) {
                        j2Var.d0((Rect) i6.i.g(mapA.get(j2Var)));
                    }
                }
                for (j2 j2Var2 : collection) {
                    j2Var2.b0(C(this.f15565a.o().k(), ((n3) i6.i.g(map2.get(j2Var2))).f()));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void q(CalculatedUseCaseInfo bVar) {
        p0(bVar.getPrimaryStreamSpecResult().b(), bVar.b());
        o0(this.f15573j, bVar.b(), bVar.a());
        Iterator<j2> it = bVar.d().iterator();
        while (it.hasNext()) {
            it.next().e0(this.f15565a);
        }
        this.f15565a.n(bVar.d());
        if (this.f15566b != null) {
            for (j2 j2Var : bVar.d()) {
                v.f fVar = this.f15566b;
                Objects.requireNonNull(fVar);
                j2Var.e0(fVar);
            }
            v.f fVar2 = this.f15566b;
            Objects.requireNonNull(fVar2);
            fVar2.n(bVar.d());
        }
        if (bVar.d().isEmpty()) {
            for (j2 j2Var2 : bVar.e()) {
                Map<j2, n3> mapB = bVar.getPrimaryStreamSpecResult().b();
                if (mapB.containsKey(j2Var2)) {
                    n3 n3Var = mapB.get(j2Var2);
                    Objects.requireNonNull(n3Var);
                    p1 p1VarD = n3Var.d();
                    if (p1VarD != null && R(n3Var, j2Var2.z())) {
                        j2Var2.h0(p1VarD);
                        if (this.f15578p) {
                            this.f15565a.j(j2Var2);
                            v.f fVar3 = this.f15566b;
                            if (fVar3 != null) {
                                Objects.requireNonNull(fVar3);
                                fVar3.j(j2Var2);
                            }
                        }
                    }
                }
            }
        }
        for (j2 j2Var3 : bVar.c()) {
            b bVar2 = bVar.j().get(j2Var3);
            Objects.requireNonNull(bVar2);
            v.f fVar4 = this.f15566b;
            if (fVar4 != null) {
                v.f fVar5 = this.f15565a;
                Objects.requireNonNull(fVar4);
                j2Var3.d(fVar5, fVar4, bVar2.f15586a, bVar2.f15587b);
                j2Var3.g0((n3) i6.i.g(bVar.getPrimaryStreamSpecResult().b().get(j2Var3)), ((StreamSpecQueryResult) i6.i.g(bVar.getSecondaryStreamSpecResult())).b().get(j2Var3));
            } else {
                j2Var3.d(this.f15565a, null, bVar2.f15586a, bVar2.f15587b);
                j2Var3.g0((n3) i6.i.g(bVar.getPrimaryStreamSpecResult().b().get(j2Var3)), null);
            }
        }
        if (this.f15578p) {
            this.f15565a.l(bVar.c());
            v.f fVar6 = this.f15566b;
            if (fVar6 != null) {
                Objects.requireNonNull(fVar6);
                fVar6.l(bVar.c());
            }
        }
        Iterator<j2> it4 = bVar.c().iterator();
        while (it4.hasNext()) {
            it4.next().N();
        }
        this.f15569e.clear();
        this.f15569e.addAll(bVar.a());
        this.f15570f.clear();
        this.f15570f.addAll(bVar.b());
        this.f15580r = bVar.getPlaceholderForExtensions();
        this.f15581s = bVar.getStreamSharing();
    }

    private void u() {
        this.f15565a.g(this.f15576m);
        v.f fVar = this.f15566b;
        if (fVar != null) {
            fVar.g(this.f15576m);
        }
    }

    private static Map<j2, Set<q.b>> v(Collection<j2> collection, ResolvedFeatureGroup bVar) {
        HashMap map = new HashMap();
        for (j2 j2Var : collection) {
            map.put(j2Var, j2Var.o());
            j2Var.Z(bVar != null ? bVar.a() : null);
        }
        return map;
    }

    private static w3<?> w(j2 j2Var, w3<?> w3Var, int i15, Range<Integer> range) {
        u2 u2VarM0 = w3Var != null ? u2.m0(w3Var) : u2.l0();
        u2VarM0.m(w3.F, Integer.valueOf(i15));
        if (!n3.f202727a.equals(range)) {
            u2VarM0.e0(w3.G, p1.c.HIGH_PRIORITY_REQUIRED, range);
            u2VarM0.m(w3.H, Boolean.TRUE);
        }
        return j2Var.D(u2VarM0).d();
    }

    private void y() {
        synchronized (this.f15577n) {
            j0 j0VarH = this.f15565a.h();
            this.f15579q = j0VarH.h();
            j0VarH.j();
        }
    }

    private CalculatedUseCaseInfo z(Collection<j2> collection, boolean z15, boolean z16) {
        StreamSpecQueryResult lVarB;
        boolean z17 = z16;
        D(collection);
        if (!z15 && m0(collection)) {
            return z(collection, true, z17);
        }
        k0.g gVarH = H(collection, z15);
        j2 j2VarB = B(collection, gVarH);
        Collection<j2> collectionA = A(collection, j2VarB, gVarH);
        ArrayList arrayList = new ArrayList(collectionA);
        arrayList.removeAll(this.f15570f);
        ArrayList arrayList2 = new ArrayList(collectionA);
        arrayList2.retainAll(this.f15570f);
        ArrayList arrayList3 = new ArrayList(this.f15570f);
        arrayList3.removeAll(collectionA);
        Map<j2, b> mapM = M(arrayList, this.f15576m.l(), this.f15567c, this.f15574k, this.f15575l);
        boolean zY = Y(arrayList, arrayList2);
        try {
            StreamSpecQueryResult lVarB2 = this.f15585x.b(L(), this.f15565a.o(), arrayList, arrayList2, this.f15576m, this.f15574k, this.f15575l, zY, z17);
            try {
                if (this.f15566b != null) {
                    m mVar = this.f15585x;
                    int iL = L();
                    v.f fVar = this.f15566b;
                    Objects.requireNonNull(fVar);
                    z17 = z16;
                    lVarB = mVar.b(iL, fVar.o(), arrayList, arrayList2, this.f15576m, this.f15574k, this.f15575l, zY, z17);
                } else {
                    lVarB = null;
                }
                return new CalculatedUseCaseInfo(collection, collectionA, arrayList, arrayList2, arrayList3, gVarH, j2VarB, mapM, lVarB2, lVarB);
            } catch (IllegalArgumentException e15) {
                e = e15;
                z17 = z16;
                if (z15 || !c0()) {
                    throw e;
                }
                return z(collection, true, z17);
            }
        } catch (IllegalArgumentException e16) {
            e = e16;
        }
    }

    public void I() {
        synchronized (this.f15577n) {
            try {
                if (this.f15578p) {
                    this.f15565a.n(new ArrayList(this.f15570f));
                    v.f fVar = this.f15566b;
                    if (fVar != null) {
                        fVar.n(new ArrayList(this.f15570f));
                    }
                    y();
                    this.f15578p = false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public o.p K() {
        return this.f15568d;
    }

    public List<j2> P() {
        ArrayList arrayList;
        synchronized (this.f15577n) {
            arrayList = new ArrayList(this.f15569e);
        }
        return arrayList;
    }

    @Override // o.i
    public o.j a() {
        return this.f15565a.a();
    }

    @Override // o.i
    public o.q c() {
        return this.f15565a.c();
    }

    public void e0(Collection<j2> collection) {
        synchronized (this.f15577n) {
            E(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f15569e);
            linkedHashSet.removeAll(collection);
            q(z(linkedHashSet, this.f15566b != null, false));
        }
    }

    public void h0(List<o.k> list) {
        synchronized (this.f15577n) {
            this.f15573j = list;
        }
    }

    public void j0(Range<Integer> range) {
        synchronized (this.f15577n) {
            this.f15575l = range;
        }
    }

    public void k(boolean z15) {
        this.f15565a.k(z15);
    }

    public void k0(int i15) {
        synchronized (this.f15577n) {
            this.f15574k = i15;
        }
    }

    public void l0(k2 k2Var) {
        synchronized (this.f15577n) {
            this.f15572h = k2Var;
        }
    }

    public void m(Collection<j2> collection, ResolvedFeatureGroup bVar) {
        e1.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f15577n) {
            try {
                u();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f15569e);
                linkedHashSet.addAll(collection);
                Map<j2, Set<q.b>> mapV = v(linkedHashSet, bVar);
                try {
                    q(z(linkedHashSet, this.f15566b != null, false));
                } catch (IllegalArgumentException e15) {
                    f0(mapV);
                    throw new a(e15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public CalculatedUseCaseInfo n0(Collection<j2> collection, ResolvedFeatureGroup bVar, boolean z15) {
        CalculatedUseCaseInfo bVarZ;
        e1.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f15577n) {
            u();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f15569e);
            linkedHashSet.addAll(collection);
            Map<j2, Set<q.b>> mapV = v(linkedHashSet, bVar);
            try {
                try {
                    bVarZ = z(linkedHashSet, this.f15566b != null, z15);
                    f0(mapV);
                } catch (IllegalArgumentException e15) {
                    throw new a(e15);
                }
            } catch (Throwable th4) {
                f0(mapV);
                throw th4;
            }
        }
        return bVarZ;
    }

    public boolean r() {
        if (this.f15565a.r()) {
            return true;
        }
        v.f fVar = this.f15566b;
        return fVar != null && fVar.r();
    }

    public void x() {
        synchronized (this.f15577n) {
            try {
                if (!this.f15578p) {
                    if (!this.f15570f.isEmpty()) {
                        this.f15565a.g(this.f15576m);
                        v.f fVar = this.f15566b;
                        if (fVar != null) {
                            fVar.g(this.f15576m);
                        }
                    }
                    this.f15565a.l(this.f15570f);
                    v.f fVar2 = this.f15566b;
                    if (fVar2 != null) {
                        fVar2.l(this.f15570f);
                    }
                    g0();
                    Iterator<j2> it = this.f15570f.iterator();
                    while (it.hasNext()) {
                        it.next().N();
                    }
                    this.f15578p = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
