package p049fm;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import er.p;
import fr.q;
import fr.z;
import nh.k;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aM\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loq/i0;", "n", "(Lm2/r;I)V", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Lkotlin/Function0;", "callback", "Lkotlin/Function2;", "Llh/c;", "setter", "listener", "k", "(Ler/a;Ler/p;Ljava/lang/Object;Lm2/r;I)V", "Lfm/h1;", "factory", "j", "(Ler/a;Ler/a;Lm2/r;I)V", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class s1 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements p<lh.c, lh.c.r, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f65258j = new a();

        a() {
            super(2, lh.c.class, "setOnMyLocationButtonClickListener", "setOnMyLocationButtonClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(lh.c cVar, lh.c.r rVar) {
            E(cVar, rVar);
            return i0.f148189a;
        }

        public final void E(lh.c cVar, lh.c.r rVar) {
            cVar.K(rVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class c extends q implements p<lh.c, lh.c.s, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c f65259j = new c();

        c() {
            super(2, lh.c.class, "setOnMyLocationClickListener", "setOnMyLocationClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationClickListener;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(lh.c cVar, lh.c.s sVar) {
            E(cVar, sVar);
            return i0.f148189a;
        }

        public final void E(lh.c cVar, lh.c.s sVar) {
            cVar.L(sVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class e extends q implements p<lh.c, lh.c.t, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final e f65260j = new e();

        e() {
            super(2, lh.c.class, "setOnPoiClickListener", "setOnPoiClickListener(Lcom/google/android/gms/maps/GoogleMap$OnPoiClickListener;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(lh.c cVar, lh.c.t tVar) {
            E(cVar, tVar);
            return i0.f148189a;
        }

        public final void E(lh.c cVar, lh.c.t tVar) {
            cVar.M(tVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class g extends q implements p<lh.c, lh.c.i, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g f65261j = new g();

        g() {
            super(2, lh.c.class, "setOnIndoorStateChangeListener", "setOnIndoorStateChangeListener(Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(lh.c cVar, lh.c.i iVar) {
            E(cVar, iVar);
            return i0.f148189a;
        }

        public final void E(lh.c cVar, lh.c.i iVar) {
            cVar.B(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"fm/s1$h", "Llh/c$i;", "Loq/i0;", "b", "()V", "Lnh/f;", "building", "a", "(Lnh/f;)V", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements lh.c.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mr.i<e0> f65262a;

        h(mr.i<e0> iVar) {
            this.f65262a = iVar;
        }

        @Override // lh.c.i
        public void a(nh.f building) {
            this.f65262a.a().a(building);
        }

        @Override // lh.c.i
        public void b() {
            this.f65262a.a().b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class j extends q implements p<lh.c, lh.c.m, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final j f65263j = new j();

        j() {
            super(2, lh.c.class, "setOnMapClickListener", "setOnMapClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(lh.c cVar, lh.c.m mVar) {
            E(cVar, mVar);
            return i0.f148189a;
        }

        public final void E(lh.c cVar, lh.c.m mVar) {
            cVar.F(mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class l extends q implements p<lh.c, lh.c.o, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final l f65264j = new l();

        l() {
            super(2, lh.c.class, "setOnMapLongClickListener", "setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(lh.c cVar, lh.c.o oVar) {
            E(cVar, oVar);
            return i0.f148189a;
        }

        public final void E(lh.c cVar, lh.c.o oVar) {
            cVar.H(oVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class n extends q implements p<lh.c, lh.c.n, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final n f65265j = new n();

        n() {
            super(2, lh.c.class, "setOnMapLoadedCallback", "setOnMapLoadedCallback(Lcom/google/android/gms/maps/GoogleMap$OnMapLoadedCallback;)V", 0);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(lh.c cVar, lh.c.n nVar) {
            E(cVar, nVar);
            return i0.f148189a;
        }

        public final void E(lh.c cVar, lh.c.n nVar) {
            cVar.G(nVar);
        }
    }

    private static final void j(final er.a<? extends Object> aVar, final er.a<? extends h1<?>> aVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1042600347);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1042600347, i16, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:187)");
            }
            if (aVar.a() != null) {
                rVarH.X(-1211533631);
                if (!(rVarH.l() instanceof g1)) {
                    p076m2.m.d();
                }
                rVarH.n();
                if (rVarH.getInserting()) {
                    rVarH.H(aVar2);
                } else {
                    rVarH.u();
                }
                n6.c(rVarH);
                rVarH.x();
            } else {
                rVarH.X(1097220765);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: fm.r1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s1.m(aVar, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final <L> void k(er.a<? extends Object> aVar, final p<? super lh.c, ? super L, i0> pVar, final L l15, r rVar, int i15) {
        if (t.k()) {
            t.o(-649632125, i15, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:176)");
        }
        final g1 g1Var = (g1) rVar.l();
        boolean zG = rVar.G(g1Var) | ((((i15 & 112) ^ 48) > 32 && rVar.W(pVar)) || (i15 & 48) == 32) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.G(l15)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: fm.q1
                @Override // er.a
                public final Object a() {
                    return s1.l(g1Var, pVar, l15);
                }
            };
            rVar.v(objE);
        }
        j(aVar, (er.a) objE, rVar, i15 & 14);
        if (t.k()) {
            t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h1 l(g1 g1Var, p pVar, Object obj) {
        return new h1(g1Var.getMap(), pVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(er.a aVar, er.a aVar2, int i15, r rVar, int i16) {
        j(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(r rVar, final int i15) {
        r rVarH = rVar.h(1792062778);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(1792062778, i15, -1, "com.google.maps.android.compose.MapClickListenerUpdater (MapClickListeners.kt:88)");
            }
            i1 mapClickListeners = ((g1) rVarH.l()).getMapClickListeners();
            rVarH.X(-109547171);
            z zVar = new z(mapClickListeners) { // from class: fm.s1.f
                @Override // mr.m
                public Object get() {
                    return ((i1) this.f66391b).a();
                }
            };
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = g.f65261j;
                rVarH.v(objE);
            }
            k(zVar, (p) ((mr.g) objE), new h(zVar), rVarH, 48);
            rVarH.R();
            rVarH.X(-109530250);
            final z zVar2 = new z(mapClickListeners) { // from class: fm.s1.i
                @Override // mr.m
                public Object get() {
                    return ((i1) this.f66391b).b();
                }
            };
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = j.f65263j;
                rVarH.v(objE2);
            }
            p pVar = (p) ((mr.g) objE2);
            boolean zG = rVarH.G(zVar2);
            Object objE3 = rVarH.E();
            if (zG || objE3 == companion.a()) {
                objE3 = new lh.c.m() { // from class: fm.j1
                    @Override // lh.c.m
                    public final void a(LatLng latLng) {
                        s1.o(zVar2, latLng);
                    }
                };
                rVarH.v(objE3);
            }
            k(zVar2, pVar, (lh.c.m) objE3, rVarH, 48);
            rVarH.R();
            rVarH.X(-109522338);
            final z zVar3 = new z(mapClickListeners) { // from class: fm.s1.k
                @Override // mr.m
                public Object get() {
                    return ((i1) this.f66391b).d();
                }
            };
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = l.f65264j;
                rVarH.v(objE4);
            }
            p pVar2 = (p) ((mr.g) objE4);
            boolean zG2 = rVarH.G(zVar3);
            Object objE5 = rVarH.E();
            if (zG2 || objE5 == companion.a()) {
                objE5 = new lh.c.o() { // from class: fm.k1
                    @Override // lh.c.o
                    public final void a(LatLng latLng) {
                        s1.p(zVar3, latLng);
                    }
                };
                rVarH.v(objE5);
            }
            k(zVar3, pVar2, (lh.c.o) objE5, rVarH, 48);
            rVarH.R();
            rVarH.X(-109514282);
            final z zVar4 = new z(mapClickListeners) { // from class: fm.s1.m
                @Override // mr.m
                public Object get() {
                    return ((i1) this.f66391b).c();
                }
            };
            Object objE6 = rVarH.E();
            if (objE6 == companion.a()) {
                objE6 = n.f65265j;
                rVarH.v(objE6);
            }
            p pVar3 = (p) ((mr.g) objE6);
            boolean zG3 = rVarH.G(zVar4);
            Object objE7 = rVarH.E();
            if (zG3 || objE7 == companion.a()) {
                objE7 = new lh.c.n() { // from class: fm.l1
                    @Override // lh.c.n
                    public final void a() {
                        s1.q(zVar4);
                    }
                };
                rVarH.v(objE7);
            }
            k(zVar4, pVar3, (lh.c.n) objE7, rVarH, 48);
            rVarH.R();
            rVarH.X(-109506057);
            final z zVar5 = new z(mapClickListeners) { // from class: fm.s1.o
                @Override // mr.m
                public Object get() {
                    return ((i1) this.f66391b).e();
                }
            };
            Object objE8 = rVarH.E();
            if (objE8 == companion.a()) {
                objE8 = a.f65258j;
                rVarH.v(objE8);
            }
            p pVar4 = (p) ((mr.g) objE8);
            boolean zG4 = rVarH.G(zVar5);
            Object objE9 = rVarH.E();
            if (zG4 || objE9 == companion.a()) {
                objE9 = new lh.c.r() { // from class: fm.m1
                    @Override // lh.c.r
                    public final boolean a() {
                        return s1.r(zVar5);
                    }
                };
                rVarH.v(objE9);
            }
            k(zVar5, pVar4, (lh.c.r) objE9, rVarH, 48);
            rVarH.R();
            rVarH.X(-109497020);
            final z zVar6 = new z(mapClickListeners) { // from class: fm.s1.b
                @Override // mr.m
                public Object get() {
                    return ((i1) this.f66391b).f();
                }
            };
            Object objE10 = rVarH.E();
            if (objE10 == companion.a()) {
                objE10 = c.f65259j;
                rVarH.v(objE10);
            }
            p pVar5 = (p) ((mr.g) objE10);
            boolean zG5 = rVarH.G(zVar6);
            Object objE11 = rVarH.E();
            if (zG5 || objE11 == companion.a()) {
                objE11 = new lh.c.s() { // from class: fm.n1
                    @Override // lh.c.s
                    public final void a(Location location) {
                        s1.s(zVar6, location);
                    }
                };
                rVarH.v(objE11);
            }
            k(zVar6, pVar5, (lh.c.s) objE11, rVarH, 48);
            rVarH.R();
            rVarH.X(-109488810);
            final z zVar7 = new z(mapClickListeners) { // from class: fm.s1.d
                @Override // mr.m
                public Object get() {
                    return ((i1) this.f66391b).g();
                }
            };
            Object objE12 = rVarH.E();
            if (objE12 == companion.a()) {
                objE12 = e.f65260j;
                rVarH.v(objE12);
            }
            p pVar6 = (p) ((mr.g) objE12);
            boolean zG6 = rVarH.G(zVar7);
            Object objE13 = rVarH.E();
            if (zG6 || objE13 == companion.a()) {
                objE13 = new lh.c.t() { // from class: fm.o1
                    @Override // lh.c.t
                    public final void a(k kVar) {
                        s1.t(zVar7, kVar);
                    }
                };
                rVarH.v(objE13);
            }
            k(zVar7, pVar6, (lh.c.t) objE13, rVarH, 48);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: fm.p1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s1.u(i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(mr.i iVar, LatLng latLng) {
        er.l lVar = (er.l) iVar.a();
        if (lVar != null) {
            lVar.b(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(mr.i iVar, LatLng latLng) {
        er.l lVar = (er.l) iVar.a();
        if (lVar != null) {
            lVar.b(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(mr.i iVar) {
        er.a aVar = (er.a) iVar.a();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(mr.i iVar) {
        er.a aVar = (er.a) iVar.a();
        if (aVar != null) {
            return ((Boolean) aVar.a()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(mr.i iVar, Location location) {
        er.l lVar = (er.l) iVar.a();
        if (lVar != null) {
            lVar.b(location);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(mr.i iVar, nh.k kVar) {
        er.l lVar = (er.l) iVar.a();
        if (lVar != null) {
            lVar.b(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(int i15, r rVar, int i16) {
        n(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
