package ry2;

import f00.d0;
import f00.f0;
import f00.g0;
import fr.q0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p136y9.w;
import qy2.NipipCardContainerData;
import sy2.SetupData;
import sy2.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqy2/d$a;", "type", "Lkotlin/Function1;", "Lry2/r;", "Loq/i0;", "navResult", "o", "(Lqy2/d$a;Ler/l;Lm2/r;I)V", "pwzcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final er.l lVar, final f00.s sVar, gv3.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-246867206, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:87)");
        }
        xw.b<gv3.b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ry2.g
                @Override // er.l
                public final Object b(Object obj) {
                    return q.B(lVar, sVar, (gv3.b.a) obj);
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
    public static final i0 B(er.l lVar, f00.s sVar, gv3.b.a aVar) {
        if (aVar instanceof gv3.b.a.Close) {
            lVar.b(r.b.f176905a);
        } else if (aVar instanceof gv3.b.a.LoadDocument) {
            sVar.k(v.f176912a, t.f176908a);
        } else if (aVar instanceof gv3.b.a.Error) {
            f00.s.l(sVar, u.f176910a, ((gv3.b.a.Error) aVar).getError(), null, 4, null);
        } else {
            if (!(aVar instanceof gv3.b.a.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, s.f176906a, ((gv3.b.a.ShowDialog) aVar).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(NipipCardContainerData.a aVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        o(aVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final NipipCardContainerData.a aVar, final er.l<? super r, i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(942588354);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(942588354, i16, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent (NavContent.kt:22)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            v vVar = v.f176912a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ry2.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.p(aVar, lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, vVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ry2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.C(aVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 p(final NipipCardContainerData.a aVar, final er.l lVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, v.f176912a, null, y2.m.b(20426819, true, new er.r() { // from class: ry2.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.q(aVar, lVar, sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f176910a, null, y2.m.b(1343786092, true, new er.r() { // from class: ry2.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.t(sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, s.f176906a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(1646673483, true, new er.r() { // from class: ry2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.w(sVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, t.f176908a, null, y2.m.b(1949560874, true, new er.r() { // from class: ry2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.z(sVar, lVar, (p114t0.f) obj, (w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(NipipCardContainerData.a aVar, final er.l lVar, final f00.s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(20426819, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:30)");
        }
        f00.r.o(wVar, q0.c(m0.class), new SetupData(aVar), y2.m.d(1908111986, true, new er.q() { // from class: ry2.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.r(lVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f176877a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final er.l lVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1908111986, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:34)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ry2.e
                @Override // er.l
                public final Object b(Object obj) {
                    return q.s(lVar, sVar, (sy2.e) obj);
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
    public static final i0 s(er.l lVar, f00.s sVar, sy2.e eVar) {
        if (fr.t.c(eVar, sy2.e.a.f185682a)) {
            lVar.b(r.b.f176905a);
        } else if (fr.t.c(eVar, sy2.e.b.f185683a)) {
            lVar.b(r.a.f176904a);
        } else {
            if (!(eVar instanceof sy2.e.ShowAsyncDownloadLoader)) {
                throw new oq.p();
            }
            sVar.j(t.f176908a, ((sy2.e.ShowAsyncDownloadLoader) eVar).getSetupData(), v.f176912a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final f00.s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1343786092, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:53)");
        }
        u uVar = u.f176910a;
        f00.r.r(wVar, uVar, sVar.g(uVar), y2.m.d(153934187, true, new er.q() { // from class: ry2.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.u(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(153934187, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:57)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ry2.f
                @Override // er.l
                public final Object b(Object obj) {
                    return q.v(sVar, (hb4.b.a) obj);
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
    public static final i0 v(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final f00.s sVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1646673483, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:69)");
        }
        s sVar2 = s.f176906a;
        f00.r.r(wVar, sVar2, sVar.g(sVar2), y2.m.d(995576288, true, new er.q() { // from class: ry2.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.x(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(995576288, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:73)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ry2.d
                @Override // er.l
                public final Object b(Object obj) {
                    return q.y(sVar, (cb4.f.a) obj);
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
    public static final i0 y(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final f00.s sVar, final er.l lVar, p114t0.f fVar, w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1949560874, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:83)");
        }
        t tVar = t.f176908a;
        f00.r.r(wVar, tVar, sVar.g(tVar), y2.m.d(-246867206, true, new er.q() { // from class: ry2.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.A(lVar, sVar, (gv3.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
