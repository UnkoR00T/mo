package p045f11;

import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import g11.n;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: f11.o, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "l", "(Ler/a;Lm2/r;I)V", "cases_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void l(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1545649441);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1545649441, i16, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.NavContent (CasesNavContent.kt:20)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c cVar = c.f55095a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f11.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.m(aVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, cVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f11.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.w(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final a aVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, c.f55095a, null, m.b(-550926402, true, new er.r() { // from class: f11.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.n(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.f55091a, null, m.b(1945630197, true, new er.r() { // from class: f11.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.q(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f55093a, null, m.b(122442934, true, new er.r() { // from class: f11.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-550926402, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (CasesNavContent.kt:28)");
        }
        f00.r.n(wVar, q0.c(i11.t.class), m.d(-1927840688, true, new q() { // from class: f11.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.o(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), r.f55113a.d(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1927840688, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesNavContent.kt:31)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: f11.e
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.p(aVar, sVar, (i11.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(a aVar, s sVar, i11.a.f fVar) {
        if (fr.t.c(fVar, i11.a.f.C2075a.f88193a)) {
            aVar.a();
        } else if (fVar instanceof i11.a.f.GoToCaseItem) {
            s.l(sVar, a.f55091a, ((i11.a.f.GoToCaseItem) fVar).getCase(), null, 4, null);
        } else {
            if (!(fVar instanceof i11.a.f.Error)) {
                throw new oq.p();
            }
            s.l(sVar, b.f55093a, ((i11.a.f.Error) fVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1945630197, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (CasesNavContent.kt:52)");
        }
        f00.r.o(wVar, q0.c(n.class), sVar.g(a.f55091a), m.d(1108931110, true, new q() { // from class: f11.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.r(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), r.f55113a.c(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1108931110, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesNavContent.kt:56)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: f11.m
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.s(sVar, (g11.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(s sVar, g11.b bVar) {
        if (!fr.t.c(bVar, g11.b.a.f69549a)) {
            throw new oq.p();
        }
        s.m(sVar, c.f55095a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(122442934, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (CasesNavContent.kt:68)");
        }
        b bVar = b.f55093a;
        f00.r.r(wVar, bVar, sVar.g(bVar), m.d(1013818455, true, new q() { // from class: f11.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.u(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1013818455, i15, -1, "pl.gov.coi.mobywatel.feature.cases.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesNavContent.kt:72)");
        }
        b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: f11.n
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.v(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(a aVar, int i15, r rVar, int i16) {
        l(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
