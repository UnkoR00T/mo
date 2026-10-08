package mk2;

import fr.q0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import uk2.p0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnk2/a;", "colorScheme", "Lkotlin/Function1;", "Lmk2/n;", "Loq/i0;", "navResult", "x", "(Lnk2/a;Ler/l;Lm2/r;I)V", "midcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(final er.l lVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-777612076, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:44)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: mk2.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.B(lVar, sVar, (uk2.k) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(er.l lVar, f00.s sVar, uk2.k kVar) {
        if (kVar instanceof uk2.k.a) {
            lVar.b(n.b.f127006a);
        } else if (kVar instanceof uk2.k.GoToIdDocumentDetails) {
            f00.s.l(sVar, j.f126994a, ((uk2.k.GoToIdDocumentDetails) kVar).getPersonalData(), null, 4, null);
        } else if (kVar instanceof uk2.k.g) {
            lVar.b(n.g.f127011a);
        } else if (fr.t.c(kVar, uk2.k.e.f198692a)) {
            f00.s.m(sVar, l.f127001a, null, 2, null);
        } else if (kVar instanceof uk2.k.ToMoreDialog) {
            f00.s.l(sVar, m.f127003a, ((uk2.k.ToMoreDialog) kVar).getSetupData(), null, 4, null);
        } else if (fr.t.c(kVar, uk2.k.f.f198693a)) {
            lVar.b(n.f.f127010a);
        } else if (fr.t.c(kVar, uk2.k.b.f198689a)) {
            lVar.b(n.c.f127007a);
        } else if (fr.t.c(kVar, uk2.k.c.f198690a)) {
            lVar.b(n.e.f127009a);
        } else {
            if (!(kVar instanceof uk2.k.ShowAsyncDownloadLoader)) {
                throw new oq.p();
            }
            sVar.j(h.f126988a, ((uk2.k.ShowAsyncDownloadLoader) kVar).getSetupData(), k.f126998a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-533920689, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:91)");
        }
        f00.r.o(wVar, q0.c(qk2.n.class), sVar.g(j.f126994a), y2.m.d(-1990573890, true, new er.q() { // from class: mk2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.D(sVar, lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f126978a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final f00.s sVar, final er.l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1990573890, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:95)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: mk2.v
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.E(sVar, lVar, (qk2.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(f00.s sVar, er.l lVar, qk2.a.f fVar) {
        if (fr.t.c(fVar, qk2.a.f.b.f167056a)) {
            k kVar = k.f126998a;
            sVar.k(kVar, kVar);
        } else if (fVar instanceof qk2.a.f.Error) {
            f00.s.l(sVar, i.f126991a, ((qk2.a.f.Error) fVar).getError(), null, 4, null);
        } else if (fr.t.c(fVar, qk2.a.f.c.f167057a)) {
            lVar.b(n.a.f127005a);
        } else {
            if (!fr.t.c(fVar, qk2.a.f.d.f167058a)) {
                throw new oq.p();
            }
            lVar.b(n.d.f127008a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-290383826, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:122)");
        }
        f00.r.n(wVar, q0.c(sk2.k.class), y2.m.d(456400732, true, new er.q() { // from class: mk2.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.G(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f126978a.g(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(456400732, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:125)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: mk2.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.H(sVar, (sk2.f) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(f00.s sVar, sk2.f fVar) {
        if (!fr.t.c(fVar, sk2.f.a.f182129a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-46846963, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:138)");
        }
        i iVar = i.f126991a;
        f00.r.r(wVar, iVar, sVar.g(iVar), y2.m.d(-714761460, true, new er.q() { // from class: mk2.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.J(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-714761460, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:142)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: mk2.y
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.K(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(196689900, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:154)");
        }
        g gVar = g.f126985a;
        f00.r.r(wVar, gVar, sVar.g(gVar), y2.m.d(-1571651199, true, new er.q() { // from class: mk2.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.M(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1571651199, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:158)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: mk2.w
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.N(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(440226763, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:168)");
        }
        f00.r.o(wVar, q0.c(wk2.l.class), sVar.g(m.f127003a), y2.m.d(-1016426438, true, new er.q() { // from class: mk2.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.P(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f126978a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1016426438, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:172)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: mk2.x
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.Q(sVar, (wk2.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(f00.s sVar, wk2.b bVar) {
        if (!fr.t.c(bVar, wk2.b.a.f213891a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(683763626, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:185)");
        }
        h hVar = h.f126988a;
        f00.r.r(wVar, hVar, sVar.g(hVar), y2.m.d(1145500282, true, new er.q() { // from class: mk2.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.S(lVar, sVar, (gv3.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(final er.l lVar, final f00.s sVar, gv3.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1145500282, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:189)");
        }
        xw.b<gv3.b.a> bVarY1 = bVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: mk2.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return l0.T(lVar, sVar, (gv3.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(er.l lVar, f00.s sVar, gv3.b.a aVar) {
        if (aVar instanceof gv3.b.a.Close) {
            lVar.b(n.b.f127006a);
        } else if (aVar instanceof gv3.b.a.LoadDocument) {
            sVar.k(k.f126998a, h.f126988a);
        } else if (aVar instanceof gv3.b.a.Error) {
            f00.s.l(sVar, i.f126991a, ((gv3.b.a.Error) aVar).getError(), null, 4, null);
        } else {
            if (!(aVar instanceof gv3.b.a.ShowDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, g.f126985a, ((gv3.b.a.ShowDialog) aVar).getModel(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(nk2.a aVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        x(aVar, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final nk2.a aVar, final er.l<? super n, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(541707685);
        if ((i15 & 48) == 0) {
            i16 = (rVarH.G(lVar) ? 32 : 16) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 17) != 16, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(541707685, i16, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent (NavContent.kt:32)");
            }
            p076m2.d0.d(new c4[0], f.f126978a.i(), rVarH, 48);
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            k kVar = k.f126998a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: mk2.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l0.y(lVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, kVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mk2.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.U(aVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 y(final er.l lVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, k.f126998a, null, y2.m.b(1800378918, true, new er.r() { // from class: mk2.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l0.z(lVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f126994a, null, y2.m.b(-533920689, true, new er.r() { // from class: mk2.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l0.C(sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f127001a, null, y2.m.b(-290383826, true, new er.r() { // from class: mk2.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l0.F(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f126991a, null, y2.m.b(-46846963, true, new er.r() { // from class: mk2.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l0.I(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, g.f126985a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(196689900, true, new er.r() { // from class: mk2.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l0.L(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, m.f127003a, null, y2.m.b(440226763, true, new er.r() { // from class: mk2.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l0.O(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f126988a, null, y2.m.b(683763626, true, new er.r() { // from class: mk2.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l0.R(sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final er.l lVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1800378918, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:41)");
        }
        f00.r.n(wVar, q0.c(p0.class), y2.m.d(-777612076, true, new er.q() { // from class: mk2.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.A(lVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f126978a.j(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
