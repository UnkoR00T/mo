package be1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import fr.q0;
import ld1.SearchModel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lce1/a;", "contract", "Lkotlin/Function0;", "Loq/i0;", "onResultAction", "closeProcess", "onBackAction", "Lkotlin/Function1;", "Ljb4/b;", "goToErrorScreen", "Lld1/m;", "goToSearch", "A", "(Lce1/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i0 {
    public static final void A(final ce1.a aVar, final er.a<oq.i0> aVar2, final er.a<oq.i0> aVar3, final er.a<oq.i0> aVar4, final er.l<? super jb4.b, oq.i0> lVar, final er.l<? super SearchModel, oq.i0> lVar2, p076m2.r rVar, final int i15) {
        int i16;
        er.a<oq.i0> aVar5;
        er.l<? super jb4.b, oq.i0> lVar3;
        er.l<? super SearchModel, oq.i0> lVar4;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(-397561145);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            aVar5 = aVar4;
            i16 |= rVarH.G(aVar5) ? 2048 : 1024;
        } else {
            aVar5 = aVar4;
        }
        if ((i15 & 24576) == 0) {
            lVar3 = lVar;
            i16 |= rVarH.G(lVar3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar3 = lVar;
        }
        if ((196608 & i15) == 0) {
            lVar4 = lVar2;
            i16 |= rVarH.G(lVar4) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            lVar4 = lVar2;
        }
        if (rVarH.r((i16 & 74899) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-397561145, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph (KrusGraph.kt:45)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            f fVar = f.f18882a;
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar))) | ((i16 & 7168) == 2048) | ((i16 & 896) == 256) | rVarH.G(sVarJ) | ((57344 & i16) == 16384) | ((458752 & i16) == 131072) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                sVar = sVarJ;
                final er.a<oq.i0> aVar6 = aVar5;
                final er.l<? super jb4.b, oq.i0> lVar5 = lVar3;
                final er.l<? super SearchModel, oq.i0> lVar6 = lVar4;
                er.l lVar7 = new er.l() { // from class: be1.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i0.B(aVar, aVar6, aVar3, sVar, lVar5, lVar6, aVar2, (d1) obj);
                    }
                };
                rVarH.v(lVar7);
                objE = lVar7;
            } else {
                sVar = sVarJ;
            }
            f00.d0.j(sVar, fVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: be1.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.a0(aVar, aVar2, aVar3, aVar4, lVar, lVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(final ce1.a aVar, final er.a aVar2, final er.a aVar3, final f00.s sVar, final er.l lVar, final er.l lVar2, final er.a aVar4, d1 d1Var) {
        f00.r.u(d1Var, f.f18882a, null, y2.m.b(-1180153498, true, new er.r() { // from class: be1.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.C(aVar, aVar2, aVar3, sVar, lVar, lVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f18888a, null, y2.m.b(-811307171, true, new er.r() { // from class: be1.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.F(aVar, sVar, aVar3, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f18894a, null, y2.m.b(454763614, true, new er.r() { // from class: be1.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.I(aVar, sVar, lVar, lVar2, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.f18864a, null, y2.m.b(1720834399, true, new er.r() { // from class: be1.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.L(aVar, sVar, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.f18871a, null, y2.m.b(-1308062112, true, new er.r() { // from class: be1.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.O(aVar, sVar, aVar3, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e.f18876a, null, y2.m.b(-41991327, true, new er.r() { // from class: be1.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.R(aVar, sVar, aVar4, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f18858a, null, y2.m.b(1224079458, true, new er.r() { // from class: be1.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.U(aVar, sVar, aVar3, aVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, a.f18850a, new f00.g0.Dialog(null, 1, null), y2.m.b(-1804817053, true, new er.r() { // from class: be1.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i0.X(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final ce1.a aVar, final er.a aVar2, final er.a aVar3, final f00.s sVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1180153498, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:52)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.m
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.D(aVar, (me1.u.a) obj);
                }
            };
            rVar.v(objE);
        }
        me1.u uVar = (me1.u) q7.d.c(q0.c(me1.u.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<me1.i.f> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(aVar2) | rVar.W(aVar3) | rVar.G(sVar) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: be1.n
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.E(aVar2, aVar3, sVar, lVar, lVar2, (me1.i.f) obj);
                }
            };
            rVar.v(lVar3);
            objE2 = lVar3;
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        me1.h.l(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final me1.u D(ce1.a aVar, me1.u.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(er.a aVar, er.a aVar2, f00.s sVar, er.l lVar, er.l lVar2, me1.i.f fVar) {
        if (fr.t.c(fVar, me1.i.f.a.f125986a)) {
            aVar.a();
        } else if (fr.t.c(fVar, me1.i.f.b.f125987a)) {
            aVar2.a();
        } else if (fr.t.c(fVar, me1.i.f.e.f125990a)) {
            f00.s.i(sVar, g.f18888a, null, null, 6, null);
        } else if (fVar instanceof me1.i.f.Error) {
            lVar.b(((me1.i.f.Error) fVar).getErrorData());
        } else {
            if (!(fVar instanceof me1.i.f.GoToSearch)) {
                throw new oq.p();
            }
            lVar2.b(((me1.i.f.GoToSearch) fVar).getModel());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final ce1.a aVar, final f00.s sVar, final er.a aVar2, final er.a aVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-811307171, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:76)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.q
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.G(aVar, (oe1.t.a) obj);
                }
            };
            rVar.v(objE);
        }
        oe1.t tVar = (oe1.t) q7.d.c(q0.c(oe1.t.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<oe1.h> bVarY1 = tVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: be1.r
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.H(sVar, aVar2, aVar3, (oe1.h) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        oe1.e.e(tVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oe1.t G(ce1.a aVar, oe1.t.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(f00.s sVar, er.a aVar, er.a aVar2, oe1.h hVar) {
        if (fr.t.c(hVar, oe1.h.a.f145055a)) {
            sVar.c();
        } else if (fr.t.c(hVar, oe1.h.b.f145056a)) {
            aVar.a();
        } else if (fr.t.c(hVar, oe1.h.d.f145058a)) {
            f00.s.i(sVar, h.f18894a, null, null, 6, null);
        } else {
            if (!fr.t.c(hVar, oe1.h.c.f145057a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final ce1.a aVar, final f00.s sVar, final er.l lVar, final er.l lVar2, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(454763614, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:96)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.o
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.J(aVar, (qe1.p.a) obj);
                }
            };
            rVar.v(objE);
        }
        qe1.p pVar = (qe1.p) q7.d.c(q0.c(qe1.p.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<qe1.a.e> bVarY1 = pVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar) | rVar.W(lVar2) | rVar.W(aVar2);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: be1.p
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.K(sVar, lVar, lVar2, aVar2, (qe1.a.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        qe1.i.f(pVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qe1.p J(ce1.a aVar, qe1.p.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(f00.s sVar, er.l lVar, er.l lVar2, er.a aVar, qe1.a.e eVar) {
        if (fr.t.c(eVar, qe1.a.e.C4163a.f166176a)) {
            sVar.c();
        } else if (eVar instanceof qe1.a.e.Error) {
            lVar.b(((qe1.a.e.Error) eVar).getErrorData());
        } else if (eVar instanceof qe1.a.e.GoToSearch) {
            lVar2.b(((qe1.a.e.GoToSearch) eVar).getModel());
        } else if (fr.t.c(eVar, qe1.a.e.C4164e.f166180a)) {
            f00.s.i(sVar, c.f18864a, null, null, 6, null);
        } else {
            if (!fr.t.c(eVar, qe1.a.e.b.f166177a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final ce1.a aVar, final f00.s sVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1720834399, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:120)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.v
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.M(aVar, (ge1.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ge1.r rVar2 = (ge1.r) q7.d.c(q0.c(ge1.r.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ge1.i> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar2);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: be1.w
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.N(sVar, aVar2, (ge1.i) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ge1.e.e(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ge1.r M(ce1.a aVar, ge1.r.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(f00.s sVar, er.a aVar, ge1.i iVar) {
        if (fr.t.c(iVar, ge1.i.a.f72061a)) {
            sVar.c();
        } else if (fr.t.c(iVar, ge1.i.d.f72064a)) {
            f00.s.i(sVar, e.f18876a, null, null, 6, null);
        } else if (fr.t.c(iVar, ge1.i.c.f72063a)) {
            f00.s.i(sVar, d.f18871a, null, null, 6, null);
        } else {
            if (!fr.t.c(iVar, ge1.i.b.f72062a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final ce1.a aVar, final f00.s sVar, final er.a aVar2, final er.a aVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1308062112, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:145)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.s
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.P(aVar, (ie1.k.a) obj);
                }
            };
            rVar.v(objE);
        }
        ie1.k kVar = (ie1.k) q7.d.c(q0.c(ie1.k.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ie1.e.c> bVarY1 = kVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: be1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.Q(sVar, aVar2, aVar3, (ie1.e.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ie1.d.d(kVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ie1.k P(ce1.a aVar, ie1.k.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(f00.s sVar, er.a aVar, er.a aVar2, ie1.e.c cVar) {
        if (fr.t.c(cVar, ie1.e.c.a.f92017a)) {
            sVar.c();
        } else if (fr.t.c(cVar, ie1.e.c.b.f92018a)) {
            aVar.a();
        } else if (fr.t.c(cVar, ie1.e.c.C2176c.f92019a)) {
            f00.s.i(sVar, b.f18858a, null, null, 6, null);
        } else {
            if (!fr.t.c(cVar, ie1.e.c.d.f92020a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final ce1.a aVar, final f00.s sVar, final er.a aVar2, final er.a aVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-41991327, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:167)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.x
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.S(aVar, (ke1.k.a) obj);
                }
            };
            rVar.v(objE);
        }
        ke1.k kVar = (ke1.k) q7.d.c(q0.c(ke1.k.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ke1.e.c> bVarY1 = kVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: be1.y
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.T(sVar, aVar2, aVar3, (ke1.e.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ke1.d.d(kVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ke1.k S(ce1.a aVar, ke1.k.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(f00.s sVar, er.a aVar, er.a aVar2, ke1.e.c cVar) {
        if (fr.t.c(cVar, ke1.e.c.a.f110270a)) {
            sVar.c();
        } else if (fr.t.c(cVar, ke1.e.c.C2640c.f110272a)) {
            aVar.a();
        } else {
            if (!fr.t.c(cVar, ke1.e.c.b.f110271a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final ce1.a aVar, final f00.s sVar, final er.a aVar2, final er.a aVar3, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1224079458, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:184)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.k
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.V(aVar, (ee1.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        ee1.r rVar2 = (ee1.r) q7.d.c(q0.c(ee1.r.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ee1.e> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: be1.l
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.W(sVar, aVar2, aVar3, (ee1.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ee1.n.e(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ee1.r V(ce1.a aVar, ee1.r.a aVar2) {
        return aVar2.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(f00.s sVar, er.a aVar, er.a aVar2, ee1.e eVar) {
        if (fr.t.c(eVar, ee1.e.a.f49595a)) {
            sVar.c();
        } else if (fr.t.c(eVar, ee1.e.b.f49596a)) {
            aVar.a();
        } else if (eVar instanceof ee1.e.ShowDialog) {
            f00.s.i(sVar, a.f18850a, ((ee1.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        } else {
            if (!fr.t.c(eVar, ee1.e.c.f49597a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1804817053, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:209)");
        }
        a aVar = a.f18850a;
        f00.r.D(wVar, aVar, sVar.e(aVar), y2.m.d(-1928523860, true, new er.q() { // from class: be1.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i0.Y(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1928523860, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.KrusGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KrusGraph.kt:213)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: be1.z
                @Override // er.l
                public final Object b(Object obj) {
                    return i0.Z(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 Z(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(ce1.a aVar, er.a aVar2, er.a aVar3, er.a aVar4, er.l lVar, er.l lVar2, int i15, p076m2.r rVar, int i16) {
        A(aVar, aVar2, aVar3, aVar4, lVar, lVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
