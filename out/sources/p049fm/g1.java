package p049fm;

import com.google.android.gms.maps.model.LatLng;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lh.c;
import lh.e;
import nh.d;
import nh.h;
import nh.n;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lfm/g1;", "Lm2/a;", "Lfm/x1;", "Llh/c;", "map", "Llh/e;", "mapView", "Lfm/i1;", "mapClickListeners", "<init>", "(Llh/c;Llh/e;Lfm/i1;)V", "Loq/i0;", "n", "()V", "", "index", "instance", "N", "(ILfm/x1;)V", "O", "from", "to", "count", "c", "(III)V", "b", "(II)V", "J", "e", "Llh/c;", "K", "()Llh/c;", "f", "Llh/e;", "M", "()Llh/e;", "g", "Lfm/i1;", i.f37094u, "()Lfm/i1;", "", "h", "Ljava/util/List;", "decorations", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g1 extends p076m2.a<x1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c map;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e mapView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i1 mapClickListeners;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<x1> decorations;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"fm/g1$a", "Llh/c$q;", "Lnh/h;", "marker", "Loq/i0;", "a", "(Lnh/h;)V", "h", "c", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements c.q {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 f(s4 s4Var, h hVar) {
            LatLng latLngA = hVar.a();
            s4Var.getMarkerState().g(true);
            s4Var.getMarkerState().i(latLngA);
            s4Var.getMarkerState().f(t.DRAG);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 g(s4 s4Var, h hVar) {
            LatLng latLngA = hVar.a();
            s4Var.getMarkerState().g(true);
            s4Var.getMarkerState().i(latLngA);
            s4Var.getMarkerState().g(false);
            s4Var.getMarkerState().f(t.END);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 i(s4 s4Var, h hVar) {
            LatLng latLngA = hVar.a();
            s4Var.getMarkerState().g(true);
            s4Var.getMarkerState().i(latLngA);
            s4Var.getMarkerState().f(t.START);
            return i0.f148189a;
        }

        @Override // lh.c.q
        public void a(h marker) {
            for (x1 x1Var : g1.this.decorations) {
                if (x1Var instanceof s4) {
                    final s4 s4Var = (s4) x1Var;
                    if (t.c(s4Var.getMarker(), marker)) {
                        if (t.c(new l() { // from class: fm.f1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g1.a.i(s4Var, (h) obj);
                            }
                        }.b(marker), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (x1Var instanceof t0) {
                    l<h, i0> lVarL = ((t0) x1Var).l();
                    if (lVarL != null ? t.c(lVarL.b(marker), Boolean.TRUE) : false) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }

        @Override // lh.c.q
        public void c(h marker) {
            for (x1 x1Var : g1.this.decorations) {
                if (x1Var instanceof s4) {
                    final s4 s4Var = (s4) x1Var;
                    if (t.c(s4Var.getMarker(), marker)) {
                        if (t.c(new l() { // from class: fm.e1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g1.a.g(s4Var, (h) obj);
                            }
                        }.b(marker), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (x1Var instanceof t0) {
                    l<h, i0> lVarK = ((t0) x1Var).k();
                    if (lVarK != null ? t.c(lVarK.b(marker), Boolean.TRUE) : false) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }

        @Override // lh.c.q
        public void h(h marker) {
            for (x1 x1Var : g1.this.decorations) {
                if (x1Var instanceof s4) {
                    final s4 s4Var = (s4) x1Var;
                    if (t.c(s4Var.getMarker(), marker)) {
                        if (t.c(new l() { // from class: fm.d1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g1.a.f(s4Var, (h) obj);
                            }
                        }.b(marker), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (x1Var instanceof t0) {
                    l<h, i0> lVarJ = ((t0) x1Var).j();
                    if (lVarJ != null ? t.c(lVarJ.b(marker), Boolean.TRUE) : false) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public g1(c cVar, e eVar, i1 i1Var) {
        super(y1.f65347a);
        this.map = cVar;
        this.mapView = eVar;
        this.mapClickListeners = i1Var;
        this.decorations = new ArrayList();
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(g1 g1Var, d dVar) {
        for (x1 x1Var : g1Var.decorations) {
            if (x1Var instanceof j) {
                j jVar = (j) x1Var;
                if (t.c(jVar.b(), dVar)) {
                    l<d, i0> lVarC = jVar.c();
                    if (lVarC != null ? t.c(lVarC.b(dVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<d, i0> lVarB = ((t0) x1Var).b();
                if (lVarB != null ? t.c(lVarB.b(dVar), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(g1 g1Var, nh.e eVar) {
        for (x1 x1Var : g1Var.decorations) {
            if (x1Var instanceof d0) {
                d0 d0Var = (d0) x1Var;
                if (t.c(d0Var.b(), eVar)) {
                    l<nh.e, i0> lVarC = d0Var.c();
                    if (lVarC != null ? t.c(lVarC.b(eVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<nh.e, i0> lVarC2 = ((t0) x1Var).c();
                if (lVarC2 != null ? t.c(lVarC2.b(eVar), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(g1 g1Var, nh.l lVar) {
        for (x1 x1Var : g1Var.decorations) {
            if (x1Var instanceof n5) {
                n5 n5Var = (n5) x1Var;
                if (t.c(n5Var.getPolygon(), lVar)) {
                    l<nh.l, i0> lVarB = n5Var.b();
                    if (lVarB != null ? t.c(lVarB.b(lVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<nh.l, i0> lVarM = ((t0) x1Var).m();
                if (lVarM != null ? t.c(lVarM.b(lVar), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(g1 g1Var, n nVar) {
        for (x1 x1Var : g1Var.decorations) {
            if (x1Var instanceof o5) {
                o5 o5Var = (o5) x1Var;
                if (t.c(o5Var.c(), nVar)) {
                    l<n, i0> lVarB = o5Var.b();
                    if (lVarB != null ? t.c(lVarB.b(nVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<n, i0> lVarN = ((t0) x1Var).n();
                if (lVarN != null ? t.c(lVarN.b(nVar), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(g1 g1Var, h hVar) {
        Iterator<T> it = g1Var.decorations.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            x1 x1Var = (x1) it.next();
            if (x1Var instanceof s4) {
                s4 s4Var = (s4) x1Var;
                if (t.c(s4Var.getMarker(), hVar)) {
                    l<h, Boolean> lVarL = s4Var.l();
                    if (lVarL != null ? t.c(lVarL.b(hVar), Boolean.TRUE) : false) {
                        return true;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<h, Boolean> lVarI = ((t0) x1Var).i();
                if (lVarI != null ? t.c(lVarI.b(hVar), Boolean.TRUE) : false) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(g1 g1Var, h hVar) {
        for (x1 x1Var : g1Var.decorations) {
            if (x1Var instanceof s4) {
                s4 s4Var = (s4) x1Var;
                if (t.c(s4Var.getMarker(), hVar)) {
                    l<h, i0> lVarI = s4Var.i();
                    if (lVarI != null ? t.c(lVarI.b(hVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<h, i0> lVarD = ((t0) x1Var).d();
                if (lVarD != null ? t.c(lVarD.b(hVar), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(g1 g1Var, h hVar) {
        for (x1 x1Var : g1Var.decorations) {
            if (x1Var instanceof s4) {
                s4 s4Var = (s4) x1Var;
                if (t.c(s4Var.getMarker(), hVar)) {
                    l<h, i0> lVarJ = s4Var.j();
                    if (lVarJ != null ? t.c(lVarJ.b(hVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<h, i0> lVarG = ((t0) x1Var).g();
                if (lVarG != null ? t.c(lVarG.b(hVar), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(g1 g1Var, h hVar) {
        for (x1 x1Var : g1Var.decorations) {
            if (x1Var instanceof s4) {
                s4 s4Var = (s4) x1Var;
                if (t.c(s4Var.getMarker(), hVar)) {
                    l<h, i0> lVarK = s4Var.k();
                    if (lVarK != null ? t.c(lVarK.b(hVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (x1Var instanceof t0) {
                l<h, i0> lVarH = ((t0) x1Var).h();
                if (lVarH != null ? t.c(lVarH.b(hVar), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s4 I(g1 g1Var, h hVar) {
        Object next;
        Iterator<T> it = g1Var.decorations.iterator();
        while (it.hasNext()) {
            next = it.next();
            x1 x1Var = (x1) next;
            if ((x1Var instanceof s4) && t.c(((s4) x1Var).getMarker(), hVar)) {
                return (s4) next;
            }
        }
        next = null;
        return (s4) next;
    }

    public final void J() {
        this.map.z(new c.g() { // from class: fm.u0
            @Override // lh.c.g
            public final void a(d dVar) {
                g1.A(this.f65297a, dVar);
            }
        });
        this.map.A(new c.h() { // from class: fm.v0
            @Override // lh.c.h
            public final void a(nh.e eVar) {
                g1.B(this.f65324a, eVar);
            }
        });
        this.map.N(new c.u() { // from class: fm.w0
            @Override // lh.c.u
            public final void a(nh.l lVar) {
                g1.C(this.f65339a, lVar);
            }
        });
        this.map.O(new c.v() { // from class: fm.x0
            @Override // lh.c.v
            public final void a(n nVar) {
                g1.D(this.f65344a, nVar);
            }
        });
        this.map.I(new c.p() { // from class: fm.y0
            @Override // lh.c.p
            public final boolean d(h hVar) {
                return g1.E(this.f65346a, hVar);
            }
        });
        this.map.C(new c.j() { // from class: fm.z0
            @Override // lh.c.j
            public final void f(h hVar) {
                g1.F(this.f65355a, hVar);
            }
        });
        this.map.D(new c.k() { // from class: fm.a1
            @Override // lh.c.k
            public final void a(h hVar) {
                g1.G(this.f64958a, hVar);
            }
        });
        this.map.E(new c.l() { // from class: fm.b1
            @Override // lh.c.l
            public final void g(h hVar) {
                g1.H(this.f64998a, hVar);
            }
        });
        this.map.J(new a());
        this.map.m(new p(this.mapView, new l() { // from class: fm.c1
            @Override // er.l
            public final Object b(Object obj) {
                return g1.I(this.f65003a, (h) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final c getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final i1 getMapClickListeners() {
        return this.mapClickListeners;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final e getMapView() {
        return this.mapView;
    }

    @Override // p076m2.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(int index, x1 instance) {
        this.decorations.add(index, instance);
        instance.f();
    }

    @Override // p076m2.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void d(int index, x1 instance) {
    }

    @Override // p076m2.c
    public void b(int index, int count) {
        for (int i15 = 0; i15 < count; i15++) {
            this.decorations.get(index + i15).e();
        }
        o(this.decorations, index, count);
    }

    @Override // p076m2.c
    public void c(int from, int to4, int count) {
        m(this.decorations, from, to4, count);
    }

    @Override // p076m2.a
    protected void n() {
        this.map.e();
        Iterator<T> it = this.decorations.iterator();
        while (it.hasNext()) {
            ((x1) it.next()).a();
        }
        this.decorations.clear();
    }
}
