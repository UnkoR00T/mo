package i82;

import cb4.DialogData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0013\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000b\u001a\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lb92/l;", "Lb92/e;", "T", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Ljb4/b;", "navError", "Lcb4/d;", "navDialog", "viewModelNavigation", "Lc92/a;", "openBottomSheet", "Ldx3/a;", "showImagePreview", "openIadAction", "Lb92/i;", "contract", "B", "(Ler/a;Ler/l;Ler/l;Lb92/l;Ler/l;Ler/l;Ler/a;Lb92/i;Lm2/r;I)V", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z1 {
    public static final <T extends b92.l & b92.e> void B(final er.a<oq.i0> aVar, final er.l<? super jb4.b, oq.i0> lVar, final er.l<? super DialogData, oq.i0> lVar2, final T t15, final er.l<? super c92.a, oq.i0> lVar3, final er.l<? super dx3.a, oq.i0> lVar4, final er.a<oq.i0> aVar2, final b92.i iVar, p076m2.r rVar, final int i15) {
        int i16;
        er.l<? super jb4.b, oq.i0> lVar5;
        final er.l<? super DialogData, oq.i0> lVar6;
        er.l<? super c92.a, oq.i0> lVar7;
        er.l<? super dx3.a, oq.i0> lVar8;
        zx.a aVar3;
        p076m2.r rVarH = rVar.h(1382850142);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            lVar5 = lVar;
            i16 |= rVarH.G(lVar5) ? 32 : 16;
        } else {
            lVar5 = lVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            lVar6 = lVar2;
            i16 |= rVarH.G(lVar6) ? 256 : 128;
        } else {
            lVar6 = lVar2;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(t15) : rVarH.G(t15) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            lVar7 = lVar3;
            i16 |= rVarH.G(lVar7) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar7 = lVar3;
        }
        if ((196608 & i15) == 0) {
            lVar8 = lVar4;
            i16 |= rVarH.G(lVar8) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            lVar8 = lVar4;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= rVarH.G(aVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= (i15 & 16777216) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 8388608 : 4194304;
        }
        if (rVarH.r((i16 & 4793491) != 4793490, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1382850142, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent (ReportViolationWizardNavContent.kt:54)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            final p136y9.g1 navController = sVarJ.getNavController();
            xw.b<b92.d.c.a> bVarG4 = t15.g4();
            boolean zG = rVarH.G(navController) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: i82.y0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z1.C(navController, aVar, (b92.d.c.a) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.f0.b(bVarG4, (er.l) objE, rVarH, xw.b.f221619c);
            fp0.k kVarV7 = iVar.v7();
            if (fr.t.c(kVarV7, fp0.k.e.f65842a) || fr.t.c(kVarV7, fp0.k.f.f65843a)) {
                aVar3 = s.i.f90228b;
            } else if (fr.t.c(kVarV7, fp0.k.d.f65841a)) {
                aVar3 = s.e.f90224b;
            } else if (fr.t.c(kVarV7, fp0.k.b.f65839a)) {
                aVar3 = s.i.f90228b;
            } else if (fr.t.c(kVarV7, fp0.k.a.f65838a)) {
                aVar3 = s.h.f90227b;
            } else {
                if (!(kVarV7 instanceof fp0.k.Others)) {
                    throw new oq.p();
                }
                aVar3 = s.g.f90226b;
            }
            boolean zG2 = ((57344 & i16) == 16384) | ((29360128 & i16) == 8388608 || ((i16 & 16777216) != 0 && rVarH.G(iVar))) | rVarH.G(navController) | ((i16 & 112) == 32) | ((i16 & 896) == 256) | ((458752 & i16) == 131072) | ((i16 & 7168) == 2048 || ((i16 & PKIFailureInfo.certConfirmed) != 0 && rVarH.G(t15))) | ((i16 & 3670016) == 1048576);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                final er.l<? super jb4.b, oq.i0> lVar9 = lVar5;
                final er.l<? super c92.a, oq.i0> lVar10 = lVar7;
                final er.l<? super dx3.a, oq.i0> lVar11 = lVar8;
                er.l lVar12 = new er.l() { // from class: i82.j1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return z1.D(iVar, navController, lVar10, lVar9, lVar6, lVar11, t15, aVar2, (p136y9.d1) obj);
                    }
                };
                rVarH.v(lVar12);
                objE2 = lVar12;
            }
            f00.d0.j(sVarJ, aVar3, (er.l) objE2, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i82.r1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z1.c0(aVar, lVar, lVar2, t15, lVar3, lVar4, aVar2, iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(p136y9.g1 g1Var, er.a aVar, b92.d.c.a aVar2) {
        g1Var.J();
        if (g1Var.r() == null) {
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final b92.i iVar, final p136y9.g1 g1Var, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final b92.l lVar5, final er.a aVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, s.g.f90226b, null, y2.m.b(147452733, true, new er.r() { // from class: i82.s1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.E(iVar, g1Var, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.i.f90228b, null, y2.m.b(-1229065868, true, new er.r() { // from class: i82.t1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.H(iVar, g1Var, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.h.f90227b, null, y2.m.b(-651870155, true, new er.r() { // from class: i82.u1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.K(iVar, g1Var, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.c.f90222b, null, y2.m.b(-74674442, true, new er.r() { // from class: i82.v1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.N(iVar, g1Var, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.a.f90220b, null, y2.m.b(502521271, true, new er.r() { // from class: i82.w1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.Q(iVar, g1Var, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.e.f90224b, null, y2.m.b(1079716984, true, new er.r() { // from class: i82.x1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.T(iVar, lVar2, g1Var, lVar3, lVar, lVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.b.f90221b, null, y2.m.b(1656912697, true, new er.r() { // from class: i82.y1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.W(iVar, g1Var, lVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.f.f90225b, null, y2.m.b(-2060858886, true, new er.r() { // from class: i82.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return z1.Z(iVar, lVar5, lVar2, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(b92.i iVar, final p136y9.g1 g1Var, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(147452733, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:79)");
        }
        f00.r.o(wVar, fr.q0.c(m92.o.class), iVar, y2.m.d(-1397344338, true, new er.q() { // from class: i82.f1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.F(g1Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final p136y9.g1 g1Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1397344338, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:84)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(g1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.G(g1Var, (m92.c) obj);
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
    public static final oq.i0 G(p136y9.g1 g1Var, m92.c cVar) {
        if (!(cVar instanceof m92.c.a)) {
            throw new oq.p();
        }
        p136y9.e0.I(g1Var, s.e.f90224b.getRoute(), null, null, 6, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(b92.i iVar, final p136y9.g1 g1Var, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1229065868, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:99)");
        }
        f00.r.o(wVar, fr.q0.c(p92.e0.class), iVar, y2.m.d(279633317, true, new er.q() { // from class: i82.h1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.I(g1Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final p136y9.g1 g1Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(279633317, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:104)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(g1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.p1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.J(g1Var, (p92.v) obj);
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
    public static final oq.i0 J(p136y9.g1 g1Var, p92.v vVar) {
        if (vVar instanceof p92.v.a) {
            p136y9.e0.I(g1Var, s.e.f90224b.getRoute(), null, null, 6, null);
        } else {
            if (!fr.t.c(vVar, p92.v.b.f153708a)) {
                throw new oq.p();
            }
            p136y9.e0.I(g1Var, s.h.f90227b.getRoute(), null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(b92.i iVar, final p136y9.g1 g1Var, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-651870155, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:122)");
        }
        f00.r.o(wVar, fr.q0.c(p92.o.class), iVar, y2.m.d(856829030, true, new er.q() { // from class: i82.g1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.L(g1Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final p136y9.g1 g1Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(856829030, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:127)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(g1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.o1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.M(g1Var, (p92.c) obj);
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
    public static final oq.i0 M(p136y9.g1 g1Var, p92.c cVar) {
        if (!(cVar instanceof p92.c.a)) {
            throw new oq.p();
        }
        p136y9.e0.I(g1Var, s.e.f90224b.getRoute(), null, null, 6, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(b92.i iVar, final p136y9.g1 g1Var, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-74674442, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:141)");
        }
        f00.r.o(wVar, fr.q0.c(s82.p.class), iVar, y2.m.d(1434024743, true, new er.q() { // from class: i82.b1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.O(g1Var, lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final p136y9.g1 g1Var, final er.l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1434024743, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:146)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(g1Var) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.P(g1Var, lVar, (s82.a.e) obj);
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
    public static final oq.i0 P(p136y9.g1 g1Var, er.l lVar, s82.a.e eVar) {
        if (eVar instanceof s82.a.e.C4600a) {
            p136y9.e0.I(g1Var, s.a.f90220b.getRoute(), null, null, 6, null);
        } else {
            if (!(eVar instanceof s82.a.e.OpenBottomSheet)) {
                throw new oq.p();
            }
            lVar.b(((s82.a.e.OpenBottomSheet) eVar).getData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(b92.i iVar, final p136y9.g1 g1Var, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(502521271, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:163)");
        }
        f00.r.o(wVar, fr.q0.c(j82.m.class), iVar, y2.m.d(2011220456, true, new er.q() { // from class: i82.e1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.R(g1Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final p136y9.g1 g1Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2011220456, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:168)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(g1Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.S(g1Var, (j82.a.b) obj);
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
    public static final oq.i0 S(p136y9.g1 g1Var, j82.a.b bVar) {
        if (!(bVar instanceof j82.a.b.C2347a)) {
            throw new oq.p();
        }
        p136y9.e0.I(g1Var, s.f.f90225b.getRoute(), null, null, 6, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(b92.i iVar, final er.l lVar, final p136y9.g1 g1Var, final er.l lVar2, final er.l lVar3, final er.l lVar4, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1079716984, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:183)");
        }
        f00.r.o(wVar, fr.q0.c(h92.r.class), iVar, y2.m.d(-1706551127, true, new er.q() { // from class: i82.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.U(lVar, g1Var, lVar2, lVar3, lVar4, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final er.l lVar, final p136y9.g1 g1Var, final er.l lVar2, final er.l lVar3, final er.l lVar4, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1706551127, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:188)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(g1Var) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.W(lVar4);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar5 = new er.l() { // from class: i82.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.V(lVar, g1Var, lVar2, lVar3, lVar4, (h92.a.f) obj);
                }
            };
            rVar.v(lVar5);
            objE = lVar5;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(er.l lVar, p136y9.g1 g1Var, er.l lVar2, er.l lVar3, er.l lVar4, h92.a.f fVar) {
        if (fVar instanceof h92.a.f.Error) {
            lVar.b(((h92.a.f.Error) fVar).getError());
        } else if (fVar instanceof h92.a.f.b) {
            p136y9.e0.I(g1Var, s.b.f90221b.getRoute(), null, null, 6, null);
        } else if (fVar instanceof h92.a.f.ShowDialog) {
            lVar2.b(((h92.a.f.ShowDialog) fVar).getDialogData());
        } else if (fVar instanceof h92.a.f.ShowBottomSheet) {
            lVar3.b(((h92.a.f.ShowBottomSheet) fVar).getAction());
        } else {
            if (!(fVar instanceof h92.a.f.ShowImagePreview)) {
                throw new oq.p();
            }
            lVar4.b(((h92.a.f.ShowImagePreview) fVar).getData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(b92.i iVar, final p136y9.g1 g1Var, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1656912697, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:211)");
        }
        f00.r.o(wVar, fr.q0.c(w82.h.class), iVar, y2.m.d(-1129355414, true, new er.q() { // from class: i82.a1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.X(g1Var, lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final p136y9.g1 g1Var, final er.l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1129355414, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:216)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(g1Var) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.m1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.Y(g1Var, lVar, (w82.a.d) obj);
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
    public static final oq.i0 Y(p136y9.g1 g1Var, er.l lVar, w82.a.d dVar) {
        if (dVar instanceof w82.a.d.C5541a) {
            p136y9.e0.I(g1Var, s.c.f90222b.getRoute(), null, null, 6, null);
        } else {
            if (!(dVar instanceof w82.a.d.ShowDialog)) {
                throw new oq.p();
            }
            lVar.b(((w82.a.d.ShowDialog) dVar).getDialogData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(b92.i iVar, final b92.l lVar, final er.l lVar2, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2060858886, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:233)");
        }
        f00.r.o(wVar, fr.q0.c(e92.p.class), iVar, y2.m.d(-552159701, true, new er.q() { // from class: i82.d1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return z1.a0(lVar, lVar2, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), l.f90167a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final b92.l lVar, final er.l lVar2, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-552159701, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.ReportViolationWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportViolationWizardNavContent.kt:238)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(lVar) | rVar.W(lVar2) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.l1
                @Override // er.l
                public final Object b(Object obj) {
                    return z1.b0(lVar, lVar2, aVar, (e92.a) obj);
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
    public static final oq.i0 b0(b92.l lVar, er.l lVar2, er.a aVar, e92.a aVar2) {
        if (aVar2 instanceof e92.a.ToOutro) {
            lVar.V7(new b92.d.ToOutro(((e92.a.ToOutro) aVar2).getReportNumber()));
        } else if (aVar2 instanceof e92.a.Error) {
            lVar2.b(((e92.a.Error) aVar2).getErrorData());
        } else {
            if (!(aVar2 instanceof e92.a.b)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(er.a aVar, er.l lVar, er.l lVar2, b92.l lVar3, er.l lVar4, er.l lVar5, er.a aVar2, b92.i iVar, int i15, p076m2.r rVar, int i16) {
        B(aVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar2, iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
