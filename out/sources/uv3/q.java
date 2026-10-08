package uv3;

import f00.d0;
import f00.f0;
import fr.q0;
import hx3.KeycloakAuthData;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import sv3.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Luv3/g;", "viewModel", "Loq/i0;", "j", "(Luv3/g;Lm2/r;I)V", "edorauth_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    public static final void j(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1811017765);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1811017765, i16, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.main.EdorAuthMainScreen (EdorAuthMainScreen.kt:18)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            zx.a aVar = (gVar.getData() instanceof mv3.a.EdorAddressNotRequired) || gVar.L() ? c.b.f201777b : c.a.f201776b;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(gVar))) {
                z15 = true;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: uv3.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.k(gVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, aVar, (er.l) objE, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uv3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.s(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final g gVar, d1 d1Var) {
        f00.r.u(d1Var, c.b.f201777b, null, y2.m.b(189982950, true, new er.r() { // from class: uv3.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.l(gVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.a.f201776b, null, y2.m.b(-978925233, true, new er.r() { // from class: uv3.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.o(gVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final g gVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(189982950, i15, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.main.EdorAuthMainScreen.<anonymous>.<anonymous>.<anonymous> (EdorAuthMainScreen.kt:36)");
        }
        f00.r.o(wVar, q0.c(j0.class), gVar.getData(), y2.m.d(2075505877, true, new er.q() { // from class: uv3.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.m(gVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f201773a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final g gVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2075505877, i15, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.main.EdorAuthMainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EdorAuthMainScreen.kt:40)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: uv3.o
                @Override // er.l
                public final Object b(Object obj) {
                    return q.n(gVar, (mv3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(g gVar, mv3.c.a aVar) {
        if (fr.t.c(aVar, mv3.c.a.C3193a.f128686a)) {
            gVar.A();
        } else {
            if (!fr.t.c(aVar, mv3.c.a.b.f128687a)) {
                throw new oq.p();
            }
            gVar.close();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final g gVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-978925233, i15, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.main.EdorAuthMainScreen.<anonymous>.<anonymous>.<anonymous> (EdorAuthMainScreen.kt:53)");
        }
        c.a aVar = c.a.f201776b;
        mv3.a data = gVar.getData();
        mv3.a.EdorAddressRequired edorAddressRequired = data instanceof mv3.a.EdorAddressRequired ? (mv3.a.EdorAddressRequired) data : null;
        er.l<b0, i0> lVarB = edorAddressRequired != null ? edorAddressRequired.b() : null;
        if (lVarB == null) {
            rVar.X(-333427996);
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: uv3.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.p((b0) obj);
                    }
                };
                rVar.v(objE);
            }
            lVarB = (er.l) objE;
        } else {
            rVar.X(-149305182);
        }
        rVar.R();
        mv3.a data2 = gVar.getData();
        mv3.a.EdorAddressRequired edorAddressRequired2 = data2 instanceof mv3.a.EdorAddressRequired ? (mv3.a.EdorAddressRequired) data2 : null;
        f00.r.r(wVar, aVar, new KeycloakAuthData(lVarB, edorAddressRequired2 != null ? edorAddressRequired2.a() : null), y2.m.d(350082299, true, new er.q() { // from class: uv3.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.q(gVar, (hx3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(b0 b0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final g gVar, hx3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(350082299, i15, -1, "pl.gov.coi.mobywatel.segment.edorauth.presentation.main.EdorAuthMainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EdorAuthMainScreen.kt:61)");
        }
        xw.b<hx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: uv3.p
                @Override // er.l
                public final Object b(Object obj) {
                    return q.r(gVar, (hx3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(g gVar, hx3.c.a aVar) {
        if (fr.t.c(aVar, hx3.c.a.C2035a.f86829a)) {
            gVar.A();
        } else {
            if (!fr.t.c(aVar, hx3.c.a.b.f86830a)) {
                throw new oq.p();
            }
            gVar.close();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(g gVar, int i15, p076m2.r rVar, int i16) {
        j(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
