package fw1;

import androidx.p016lifecycle.y0;
import fr.q0;
import kw1.DynamicMultiDocumentSingleNav;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrq0/b$c;", "dynamicMultiDocumentType", "Lkotlin/Function1;", "Lfw1/g0;", "Loq/i0;", "navResult", "v", "(Lrq0/b$c;Ler/l;Lm2/r;I)V", "dynamicdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<DynamicMultiDocumentSingleNav, i0> {
        a(Object obj) {
            super(1, obj, iw1.u.class, "setup", "setup(Lpl/gov/coi/mobywatel/feature/dynamicdocument/presentation/multidocument/single/model/DynamicMultiDocumentSingleNav;)V", 0);
        }

        public final void E(DynamicMultiDocumentSingleNav dynamicMultiDocumentSingleNav) {
            ((iw1.u) this.f66391b).P5(dynamicMultiDocumentSingleNav);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(DynamicMultiDocumentSingleNav dynamicMultiDocumentSingleNav) {
            E(dynamicMultiDocumentSingleNav);
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(er.l lVar, f00.s sVar, iw1.a.h hVar) {
        if (fr.t.c(hVar, iw1.a.h.b.f97267a)) {
            lVar.b(g0.a.f68396a);
        } else if (hVar instanceof iw1.a.h.Error) {
            f00.s.i(sVar, h.f68400a, ((iw1.a.h.Error) hVar).getErrorData(), null, 4, null);
        } else if (fr.t.c(hVar, iw1.a.h.C2280a.f97266a)) {
            sVar.c();
        } else if (hVar instanceof iw1.a.h.ShowDialog) {
            f00.s.i(sVar, d.f68385a, ((iw1.a.h.ShowDialog) hVar).getDialogData(), null, 4, null);
        } else if (hVar instanceof iw1.a.h.ToVerification) {
            iw1.a.h.ToVerification c2281h = (iw1.a.h.ToVerification) hVar;
            lVar.b(new g0.VerifyMultiDocument(c2281h.getDocumentType(), c2281h.getDocumentId()));
        } else if (hVar instanceof iw1.a.h.ShowAsyncDownloadLoader) {
            sVar.h(g.f68394a, ((iw1.a.h.ShowAsyncDownloadLoader) hVar).getSetupData(), j.f68404a);
        } else if (hVar instanceof iw1.a.h.ToDiplomaPdfList) {
            f00.s.l(sVar, f.f68392a, ((iw1.a.h.ToDiplomaPdfList) hVar).getSetupData(), null, 4, null);
        } else {
            if (!(hVar instanceof iw1.a.h.d)) {
                throw new oq.p();
            }
            lVar.b(g0.b.f68397a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-392882390, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:138)");
        }
        f00.r.o(wVar, q0.c(zv1.v.class), sVar.g(f.f68392a), y2.m.d(1455491291, true, new er.q() { // from class: fw1.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f0.C(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f68380a.d(), rVar, ((i15 >> 3) & 14) | 27648 | (iy.b0.f97726c << 6));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1455491291, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:142)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fw1.r
                @Override // er.l
                public final Object b(Object obj) {
                    return f0.D(sVar, (zv1.c.e) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(f00.s sVar, zv1.c.e eVar) {
        if (fr.t.c(eVar, zv1.c.e.a.f237906a)) {
            sVar.c();
        } else {
            if (!(eVar instanceof zv1.c.e.ToLoader)) {
                throw new oq.p();
            }
            f00.s.i(sVar, e.f68388a, ((zv1.c.e.ToLoader) eVar).getSetupData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1667040107, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:157)");
        }
        h hVar = h.f68400a;
        f00.r.D(wVar, hVar, sVar.e(hVar), y2.m.d(1369809610, true, new er.q() { // from class: fw1.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f0.F(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1369809610, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:161)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fw1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return f0.G(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-568004692, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:173)");
        }
        d dVar = d.f68385a;
        f00.r.D(wVar, dVar, sVar.e(dVar), y2.m.d(246567733, true, new er.q() { // from class: fw1.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f0.I(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(246567733, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:177)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fw1.s
                @Override // er.l
                public final Object b(Object obj) {
                    return f0.J(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1491917805, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:187)");
        }
        g gVar = g.f68394a;
        f00.r.D(wVar, gVar, sVar.e(gVar), y2.m.d(-1132044389, true, new er.q() { // from class: fw1.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f0.L(lVar, sVar, (gv3.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final er.l lVar, final f00.s sVar, gv3.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1132044389, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:194)");
        }
        xw.b<gv3.b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fw1.t
                @Override // er.l
                public final Object b(Object obj) {
                    return f0.M(lVar, sVar, (gv3.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(er.l lVar, f00.s sVar, gv3.b.a aVar) {
        if (aVar instanceof gv3.b.a.Close) {
            lVar.b(g0.a.f68396a);
        } else if (aVar instanceof gv3.b.a.LoadDocument) {
            f00.s.i(sVar, i.f68402a, null, g.f68394a, 2, null);
        } else if (aVar instanceof gv3.b.a.Error) {
            f00.s.i(sVar, h.f68400a, ((gv3.b.a.Error) aVar).getError(), null, 4, null);
        } else {
            if (!(aVar instanceof gv3.b.a.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.i(sVar, d.f68385a, ((gv3.b.a.ShowDialog) aVar).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-743126994, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:222)");
        }
        f00.r.o(wVar, q0.c(bw1.n.class), sVar.g(e.f68388a), y2.m.d(1105246687, true, new er.q() { // from class: fw1.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f0.O(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c.f68380a.c(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1105246687, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:228)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fw1.w
                @Override // er.l
                public final Object b(Object obj) {
                    return f0.P(sVar, (bw1.a.InterfaceC0575a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(f00.s sVar, bw1.a.InterfaceC0575a interfaceC0575a) {
        if (!fr.t.c(interfaceC0575a, bw1.a.InterfaceC0575a.C0576a.f21790a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(rq0.b.c cVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        v(cVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void v(final rq0.b.c cVar, final er.l<? super g0, i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(986877651);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.c(cVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(986877651, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent (DynamicMultiDocumentNavContent.kt:34)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            i iVar = i.f68402a;
            boolean zG = ((i16 & 14) == 4) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: fw1.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f0.w(cVar, lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, iVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fw1.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.Q(cVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 w(final rq0.b.c cVar, final er.l lVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, i.f68402a, null, y2.m.b(-1591331278, true, new er.r() { // from class: fw1.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return f0.x(cVar, lVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f68404a, null, y2.m.b(1842162409, true, new er.r() { // from class: fw1.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return f0.z(sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f68392a, null, y2.m.b(-392882390, true, new er.r() { // from class: fw1.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return f0.B(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f68400a, null, y2.m.b(1667040107, true, new er.r() { // from class: fw1.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return f0.E(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, d.f68385a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(-568004692, true, new er.r() { // from class: fw1.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return f0.H(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, g.f68394a, null, y2.m.b(1491917805, true, new er.r() { // from class: fw1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return f0.K(sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f68388a, null, y2.m.b(-743126994, true, new er.r() { // from class: fw1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return f0.N(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(rq0.b.c cVar, final er.l lVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1591331278, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:42)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        gw1.a0 a0Var = (gw1.a0) q7.d.c(q0.c(gw1.a0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        a0Var.da(cVar);
        xw.b<gw1.b.j> bVarY1 = a0Var.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fw1.q
                @Override // er.l
                public final Object b(Object obj) {
                    return f0.y(lVar, sVar, (gw1.b.j) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        gw1.l.p(a0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(er.l lVar, f00.s sVar, gw1.b.j jVar) {
        if (fr.t.c(jVar, gw1.b.j.a.f77867a)) {
            lVar.b(g0.a.f68396a);
        } else if (jVar instanceof gw1.b.j.Error) {
            f00.s.i(sVar, h.f68400a, ((gw1.b.j.Error) jVar).getErrorData(), null, 4, null);
        } else if (jVar instanceof gw1.b.j.ToSingleDocument) {
            f00.s.i(sVar, j.f68404a, ((gw1.b.j.ToSingleDocument) jVar).getDynamicMultiDocumentSingleNav(), null, 4, null);
        } else if (jVar instanceof gw1.b.j.ToVerification) {
            gw1.b.j.ToVerification hVar = (gw1.b.j.ToVerification) jVar;
            lVar.b(new g0.VerifyMultiDocument(hVar.getDocumentType(), hVar.getDocumentId()));
        } else if (jVar instanceof gw1.b.j.ShowDialog) {
            f00.s.i(sVar, d.f68385a, ((gw1.b.j.ShowDialog) jVar).getDialogData(), null, 4, null);
        } else if (jVar instanceof gw1.b.j.ShowAsyncDownloadLoader) {
            sVar.h(g.f68394a, ((gw1.b.j.ShowAsyncDownloadLoader) jVar).getSetupData(), i.f68402a);
        } else if (jVar instanceof gw1.b.j.ToDiplomaPdfList) {
            f00.s.l(sVar, f.f68392a, ((gw1.b.j.ToDiplomaPdfList) jVar).getSetupData(), null, 4, null);
        } else {
            if (!(jVar instanceof gw1.b.j.c)) {
                throw new oq.p();
            }
            lVar.b(g0.b.f68397a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1842162409, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.DynamicMultiDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicMultiDocumentNavContent.kt:89)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        iw1.u uVar = (iw1.u) q7.d.c(q0.c(iw1.u.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        j jVar = j.f68404a;
        boolean zG = rVar.G(uVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(uVar);
            rVar.v(objE);
        }
        sVar.f(jVar, (er.l) ((mr.g) objE));
        xw.b<iw1.a.h> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fw1.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return f0.A(lVar, sVar, (iw1.a.h) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        iw1.j.n(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
