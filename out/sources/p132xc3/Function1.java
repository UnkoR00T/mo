package p132xc3;

import bd3.SetupData;
import bd3.a;
import cb4.f;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import mu.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p136y9.d1;
import p136y9.w;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: xc3.v, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lxc3/w;", "Loq/i0;", "navResult", "", "forceFetchNewPassports", "o", "(Ler/l;ZLm2/r;I)V", "userdata_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final s sVar, f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-271814494, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:103)");
        }
        b<f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: xc3.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.B(sVar, (f.a) obj);
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
    public static final i0 B(s sVar, f.a aVar) {
        if (!fr.t.c(aVar, f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(l lVar, boolean z15, int i15, r rVar, int i16) {
        o(lVar, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final l<? super w, i0> lVar, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-222490369);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-222490369, i16, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent (UserDataNavContent.kt:25)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            g gVar = g.f217951a;
            boolean zG = ((i16 & 112) == 32) | ((i16 & 14) == 4) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: xc3.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.p(z15, lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, gVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xc3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.C(lVar, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 p(final boolean z15, final l lVar, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, g.f217951a, null, m.b(141612190, true, new er.r() { // from class: xc3.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.q(z15, lVar, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f217949a, null, m.b(792768405, true, new er.r() { // from class: xc3.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.t(sVar, lVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f217947a, null, m.b(-247523434, true, new er.r() { // from class: xc3.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.w(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, d.f217945a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-1287815273, true, new er.r() { // from class: xc3.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.z(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(boolean z15, final l lVar, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(141612190, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:33)");
        }
        f00.r.o(wVar, q0.c(bd3.d0.class), new SetupData(z15), m.d(-2122133937, true, new q() { // from class: xc3.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.r(lVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f217942a.d(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final l lVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2122133937, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:37)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: xc3.l
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.s(lVar, sVar, (a.e) obj);
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
    public static final i0 s(l lVar, s sVar, a.e eVar) {
        if (eVar instanceof a.e.C0466a) {
            lVar.b(w.a.f217978a);
        } else if (eVar instanceof a.e.Error) {
            s.i(sVar, e.f217947a, ((a.e.Error) eVar).getErrorData(), null, 4, null);
        } else if (eVar instanceof a.e.GoToPassportDetails) {
            s.l(sVar, f.f217949a, ((a.e.GoToPassportDetails) eVar).getData(), null, 4, null);
        } else {
            if (!(eVar instanceof a.e.ShowDialog)) {
                throw new p();
            }
            s.i(sVar, d.f217945a, ((a.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final s sVar, final l lVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(792768405, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:63)");
        }
        f00.r.o(wVar, q0.c(zc3.p.class), sVar.g(f.f217949a), m.d(-1413807866, true, new q() { // from class: xc3.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.u(sVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f217942a.c(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final s sVar, final l lVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1413807866, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:69)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: xc3.j
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.v(sVar, lVar, (zc3.d) obj);
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
    public static final i0 v(s sVar, l lVar, zc3.d dVar) {
        if (dVar instanceof zc3.d.a) {
            sVar.c();
        } else {
            if (!(dVar instanceof zc3.d.ToPassportInvalidation)) {
                throw new p();
            }
            lVar.b(new w.ToPassportInvalidation(((zc3.d.ToPassportInvalidation) dVar).getPassportNumber()));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-247523434, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:83)");
        }
        e eVar = e.f217947a;
        f00.r.D(wVar, eVar, sVar.e(eVar), m.d(-1723215051, true, new q() { // from class: xc3.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.x(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1723215051, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:87)");
        }
        b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: xc3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.y(sVar, (hb4.b.a) obj);
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
    public static final i0 y(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1287815273, i15, -1, "pl.gov.coi.mobywatel.feature.userdata.presentation.UserDataNavContent.<anonymous>.<anonymous>.<anonymous> (UserDataNavContent.kt:99)");
        }
        d dVar = d.f217945a;
        f00.r.r(wVar, dVar, sVar.g(dVar), m.d(-271814494, true, new q() { // from class: xc3.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.A(sVar, (f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
