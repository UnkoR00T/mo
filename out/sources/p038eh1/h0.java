package p038eh1;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import ci1.j;
import ei1.a0;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import gx.b;
import mu.g;
import nh1.n;
import oh1.i;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.d;
import r54.c;
import uh1.e;
import y2.f;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ac\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\r\u001a\u00020\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgh1/a;", "colorScheme", "Lkotlin/Function1;", "Lgx/b;", "Loq/i0;", "globalEventsHandler", "navigateToGlobalDestination", "Lkotlin/Function0;", "navResult", "Lr54/c;", "localNotificationItem", "z", "(Lgh1/a;Ler/l;Ler/l;Ler/a;Lr54/c;Lm2/r;I)V", "C", "(Ler/l;Ler/l;Ler/a;Lr54/c;Lm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(l lVar, l lVar2, a aVar, c cVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1326971890, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavContent.<anonymous> (DashboardNavContent.kt:56)");
            }
            C(lVar, lVar2, aVar, cVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(gh1.a aVar, l lVar, l lVar2, a aVar2, c cVar, int i15, r rVar, int i16) {
        z(aVar, lVar, lVar2, aVar2, cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void C(final l<? super l<? super b, i0>, i0> lVar, final l<? super b, i0> lVar2, final a<i0> aVar, final c cVar, r rVar, final int i15) {
        final l<? super l<? super b, i0>, i0> lVar3;
        int i16;
        l<? super b, i0> lVar4;
        a<i0> aVar2;
        final s sVar;
        Object obj;
        r rVarH = rVar.h(1310171289);
        if ((i15 & 6) == 0) {
            lVar3 = lVar;
            i16 = (rVarH.G(lVar3) ? 4 : 2) | i15;
        } else {
            lVar3 = lVar;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            lVar4 = lVar2;
            i16 |= rVarH.G(lVar4) ? 32 : 16;
        } else {
            lVar4 = lVar2;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar2 = aVar;
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(cVar) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(1310171289, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph (DashboardNavContent.kt:71)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            h.f fVar = h.f.f51428a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ) | ((i16 & 896) == 256) | rVarH.G(cVar);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                sVar = sVarJ;
                final l<? super b, i0> lVar5 = lVar4;
                final a<i0> aVar3 = aVar2;
                obj = new l() { // from class: eh1.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.D(lVar3, lVar5, sVar, aVar3, cVar, (d1) obj2);
                    }
                };
                rVarH.v(obj);
            } else {
                sVar = sVarJ;
                obj = objE;
            }
            d0.j(sVar, fVar, (l) obj, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: eh1.d0
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return h0.Z(lVar, lVar2, aVar, cVar, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 D(final l lVar, final l lVar2, final s sVar, final a aVar, final c cVar, d1 d1Var) {
        h.f fVar = h.f.f51428a;
        f fVarB = m.b(-558301030, true, new er.r() { // from class: eh1.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.E(lVar, lVar2, sVar, aVar, cVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        });
        f00.r.u(d1Var, fVar, null, fVarB, 2, null);
        f00.r.u(d1Var, h.d.f51424a, null, m.b(-1937094077, true, new er.r() { // from class: eh1.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.G(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.c.f51422a, null, m.b(1022499490, true, new er.r() { // from class: eh1.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.I(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.b.f51420a, null, m.b(-312874239, true, new er.r() { // from class: eh1.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.K(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.i.f51434a, null, m.b(-1648247968, true, new er.r() { // from class: eh1.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.M(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.C1211h.f51432a, null, m.b(1311345599, true, new er.r() { // from class: eh1.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.O(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.j.f51436a, null, m.b(-24028130, true, new er.r() { // from class: eh1.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.R(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.e.f51426a, null, m.b(-1359401859, true, new er.r() { // from class: eh1.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.T(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, h.g.f51430a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1600191708, true, new er.r() { // from class: eh1.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.W(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(final l lVar, final l lVar2, final s sVar, final a aVar, final c cVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-558301030, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:78)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final uh1.d0 d0Var = (uh1.d0) d.c(q0.c(uh1.d0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        e.e(d0Var, m.d(-1856427479, true, new q() { // from class: eh1.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.F(lVar, lVar2, d0Var, sVar, aVar, cVar, (l3.d0) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(l lVar, l lVar2, uh1.d0 d0Var, s sVar, a aVar, c cVar, l3.d0 d0Var2, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d0Var2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1856427479, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:83)");
            }
            Function1.z(lVar, lVar2, d0Var, d0Var, sVar, aVar, cVar, d0Var2, rVar, (s.f54562e << 12) | ((i16 << 21) & 29360128));
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1937094077, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:97)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        oh1.p pVar = (oh1.p) d.c(q0.c(oh1.p.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<i.f> bVarY1 = pVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.r
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.H(sVar, (i.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        oh1.h.l(pVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(s sVar, i.f fVar) {
        if (fr.t.c(fVar, i.f.a.f145827a)) {
            sVar.c();
        } else if (fr.t.c(fVar, i.f.b.f145828a)) {
            s.m(sVar, h.c.f51422a, null, 2, null);
        } else {
            if (!fr.t.c(fVar, i.f.c.f145829a)) {
                throw new oq.p();
            }
            s.m(sVar, h.b.f51420a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1022499490, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:116)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        nh1.w wVar2 = (nh1.w) d.c(q0.c(nh1.w.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<n.e> bVarY1 = wVar2.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.J(sVar, (n.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        nh1.m.q(wVar2, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(s sVar, n.e eVar) {
        if (!fr.t.c(eVar, n.e.a.f136350a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-312874239, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:128)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        mh1.r rVar2 = (mh1.r) d.c(q0.c(mh1.r.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<mh1.i.e> bVarY1 = rVar2.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.L(sVar, (mh1.i.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        mh1.h.k(rVar2, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(s sVar, mh1.i.e eVar) {
        if (fr.t.c(eVar, mh1.i.e.a.f126544a)) {
            sVar.c();
        } else {
            if (!fr.t.c(eVar, mh1.i.e.b.f126545a)) {
                throw new oq.p();
            }
            s.m(sVar, h.f.f51428a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1648247968, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:143)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        a0 a0Var = (a0) d.c(q0.c(a0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<ei1.a.e> bVarY1 = a0Var.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.y
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.N(sVar, (ei1.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        ei1.s.p(a0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(s sVar, ei1.a.e eVar) {
        if (!fr.t.c(eVar, ei1.a.e.C1214a.f51556a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1311345599, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:155)");
        }
        f00.r.n(wVar, q0.c(j.class), m.d(-736291859, true, new q() { // from class: eh1.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.P(sVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f51354a.b(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(final s sVar, zx.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-736291859, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:158)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.z
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.Q(sVar, (ci1.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(s sVar, ci1.a aVar) {
        if (fr.t.c(aVar, ci1.a.b.f27153a)) {
            s.m(sVar, h.i.f51434a, null, 2, null);
        } else if (fr.t.c(aVar, ci1.a.c.f27154a)) {
            s.m(sVar, h.j.f51436a, null, 2, null);
        } else {
            if (!fr.t.c(aVar, ci1.a.C0698a.f27152a)) {
                throw new oq.p();
            }
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-24028130, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:177)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        oi1.n nVar = (oi1.n) d.c(q0.c(oi1.n.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<oi1.c> bVarY1 = nVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.x
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.S(sVar, (oi1.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        oi1.i.d(nVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(s sVar, oi1.c cVar) {
        if (!fr.t.c(cVar, oi1.c.a.f145940a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1359401859, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:189)");
        }
        h.e eVar = h.e.f51426a;
        f00.r.D(wVar, eVar, sVar.e(eVar), m.d(-1675586434, true, new q() { // from class: eh1.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.U(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1675586434, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:193)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.i
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.V(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1600191708, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:205)");
        }
        h.g gVar = h.g.f51430a;
        f00.r.D(wVar, gVar, sVar.e(gVar), m.d(-172522765, true, new q() { // from class: eh1.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.X(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-172522765, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:209)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: eh1.t
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.Y(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(l lVar, l lVar2, a aVar, c cVar, int i15, r rVar, int i16) {
        C(lVar, lVar2, aVar, cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void z(final gh1.a aVar, final l<? super l<? super b, i0>, i0> lVar, final l<? super b, i0> lVar2, final a<i0> aVar2, final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1170018126);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(cVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (t.k()) {
                t.o(1170018126, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.DashboardNavContent (DashboardNavContent.kt:52)");
            }
            p076m2.d0.c(gh1.c.c().d(aVar), m.d(-1326971890, true, new p() { // from class: eh1.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.A(lVar, lVar2, aVar2, cVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: eh1.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.B(aVar, lVar, lVar2, aVar2, cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
