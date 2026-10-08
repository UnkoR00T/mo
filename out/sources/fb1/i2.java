package fb1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.time.LocalDate;
import lc1.CorrespondenceAddressSelectionContractData;
import ld1.SearchModel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;
import sb1.AccountingDocumentAddressSelectionContractData;
import tt3.AddressSearchData;
import ve1.PkdCodeSearchEntryData;
import zb1.BusinessAddressSelectionContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0091\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lid1/g0;", "nestedViewModel", "Lkotlin/Function1;", "Ljb4/b;", "Loq/i0;", "goToErrorScreen", "Ltt3/b;", "goToAddressSearch", "Lld1/m;", "goToSearch", "Luw/j;", "goToDatePickerDialog", "Lkotlin/Function0;", "closeWizardWithDialog", "closeWizard", "navResult", "F0", "(Lid1/g0;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A1(er.l lVar, SearchModel searchModel) {
        lVar.b(searchModel);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B1(er.l lVar, jb4.b bVar) {
        lVar.b(bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C1(final id1.g0 g0Var, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1129881118, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:668)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.D1(g0Var, (sc1.x.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        sc1.x xVar = (sc1.x) q7.d.c(fr.q0.c(sc1.x.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<sc1.m> bVarY1 = xVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.E1(sVar, aVar, (sc1.m) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        sc1.i.k(xVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sc1.x D1(id1.g0 g0Var, sc1.x.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E1(f00.s sVar, er.a aVar, sc1.m mVar) {
        if (fr.t.c(mVar, sc1.m.a.f180060a)) {
            sVar.c();
        } else if (fr.t.c(mVar, sc1.m.b.f180061a)) {
            aVar.a();
        } else {
            if (!fr.t.c(mVar, sc1.m.c.f180062a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.x.f60811a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    public static final void F0(final id1.g0 g0Var, final er.l<? super jb4.b, oq.i0> lVar, final er.l<? super AddressSearchData, oq.i0> lVar2, final er.l<? super SearchModel, oq.i0> lVar3, final er.l<? super uw.j, oq.i0> lVar4, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, final er.a<oq.i0> aVar3, p076m2.r rVar, final int i15) {
        int i16;
        final er.l<? super jb4.b, oq.i0> lVar5;
        final er.l<? super AddressSearchData, oq.i0> lVar6;
        final er.l<? super SearchModel, oq.i0> lVar7;
        er.l<? super uw.j, oq.i0> lVar8;
        er.a<oq.i0> aVar4;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(845595948);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(g0Var) : rVarH.G(g0Var) ? 4 : 2) | i15;
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
            lVar7 = lVar3;
            i16 |= rVarH.G(lVar7) ? 2048 : 1024;
        } else {
            lVar7 = lVar3;
        }
        if ((i15 & 24576) == 0) {
            lVar8 = lVar4;
            i16 |= rVarH.G(lVar8) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar8 = lVar4;
        }
        if ((196608 & i15) == 0) {
            aVar4 = aVar;
            i16 |= rVarH.G(aVar4) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            aVar4 = aVar;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= rVarH.G(aVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= rVarH.G(aVar3) ? 8388608 : 4194304;
        }
        if (rVarH.r((i16 & 4793491) != 4793490, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(845595948, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent (OpenCompanyWizardNavContent.kt:94)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            g00.a<id1.c> aVarG = g0Var.g();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: fb1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i2.G0(sVarJ, (id1.c) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.f0.b(aVarG, (er.l) objE, rVarH, g00.a.f69171c);
            c.s sVar2 = c.s.f60801a;
            boolean zG2 = rVarH.G(sVarJ) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(g0Var))) | ((3670016 & i16) == 1048576) | ((i16 & 112) == 32) | ((458752 & i16) == 131072) | ((i16 & 896) == 256) | ((57344 & i16) == 16384) | ((i16 & 7168) == 2048) | ((i16 & 29360128) == 8388608);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                sVar = sVarJ;
                final er.l<? super uw.j, oq.i0> lVar9 = lVar8;
                final er.a<oq.i0> aVar5 = aVar4;
                er.l lVar10 = new er.l() { // from class: fb1.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i2.H0(sVar, g0Var, aVar2, lVar5, aVar5, lVar6, lVar9, lVar7, aVar3, (p136y9.d1) obj);
                    }
                };
                rVarH.v(lVar10);
                objE2 = lVar10;
            } else {
                sVar = sVarJ;
            }
            f00.d0.j(sVar, sVar2, (er.l) objE2, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fb1.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i2.k2(g0Var, lVar, lVar2, lVar3, lVar4, aVar, aVar2, aVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F1(id1.g0 g0Var, final f00.s sVar, er.a aVar, er.l lVar, er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1745762147, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:689)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: fb1.l1
                @Override // er.a
                public final Object a() {
                    return i2.G1(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar2 = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: fb1.m1
                @Override // er.a
                public final Object a() {
                    return i2.H1(sVar);
                }
            };
            rVar.v(objE2);
        }
        be1.i0.A(g0Var, aVar2, aVar, (er.a) objE2, lVar, lVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G0(f00.s sVar, id1.c cVar) {
        if (!fr.t.c(cVar, id1.c.a.f91045a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G1(f00.s sVar) {
        f00.s.i(sVar, c.e.f60773a, null, null, 6, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(final f00.s sVar, final id1.g0 g0Var, final er.a aVar, final er.l lVar, final er.a aVar2, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.a aVar3, p136y9.d1 d1Var) {
        sVar.getNavController().i(new y9.e0.c() { // from class: fb1.k0
            @Override // y9.e0.c
            public final void a(p136y9.e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
                i2.I0(g0Var, e0Var, y0Var, bundle);
            }
        });
        f00.r.u(d1Var, c.s.f60801a, null, y2.m.b(-1411708085, true, new er.r() { // from class: fb1.i
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.J0(g0Var, aVar, lVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.q.f60797a, null, y2.m.b(663194818, true, new er.r() { // from class: fb1.q
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.q1(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.o.f60793a, null, y2.m.b(-756129213, true, new er.r() { // from class: fb1.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.O1(sVar, aVar2, g0Var, lVar2, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.m.f60789a, null, y2.m.b(2119514052, true, new er.r() { // from class: fb1.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.R1(g0Var, sVar, lVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.g.f60777a, null, y2.m.b(700190021, true, new er.r() { // from class: fb1.t
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.V1(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.C1372c.f60769a, null, y2.m.b(-719134010, true, new er.r() { // from class: fb1.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.Y1(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.d.f60771a, null, y2.m.b(-2138458041, true, new er.r() { // from class: fb1.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.b2(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.l.f60787a, null, y2.m.b(737185224, true, new er.r() { // from class: fb1.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.e2(sVar, aVar2, g0Var, lVar2, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.h.f60779a, null, y2.m.b(-682138807, true, new er.r() { // from class: fb1.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.h2(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.i.f60781a, null, y2.m.b(-2101462838, true, new er.r() { // from class: fb1.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.M0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.n.f60791a, null, y2.m.b(1338814914, true, new er.r() { // from class: fb1.g1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.P0(sVar, aVar2, g0Var, lVar2, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.u.f60805a, null, y2.m.b(-80509117, true, new er.r() { // from class: fb1.r1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.S0(g0Var, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.w.f60809a, null, y2.m.b(-1499833148, true, new er.r() { // from class: fb1.c2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.V0(sVar, g0Var, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.v.f60807a, null, y2.m.b(1375810117, true, new er.r() { // from class: fb1.g2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.Y0(g0Var, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.p.f60795a, null, y2.m.b(-43513914, true, new er.r() { // from class: fb1.h2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.b1(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.a.f60765a, null, y2.m.b(-1462837945, true, new er.r() { // from class: fb1.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.e1(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.b.f60767a, null, y2.m.b(1412805320, true, new er.r() { // from class: fb1.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.h1(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.k.f60785a, null, y2.m.b(-6518711, true, new er.r() { // from class: fb1.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.k1(sVar, aVar2, g0Var, lVar2, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.e.f60773a, null, y2.m.b(-1425842742, true, new er.r() { // from class: fb1.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.n1(g0Var, sVar, lVar, lVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.x.f60811a, null, y2.m.b(1449800523, true, new er.r() { // from class: fb1.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.t1(g0Var, sVar, aVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.j.f60783a, null, y2.m.b(289442913, true, new er.r() { // from class: fb1.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.w1(g0Var, sVar, aVar2, lVar4, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.r.f60799a, null, y2.m.b(-1129881118, true, new er.r() { // from class: fb1.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.C1(g0Var, sVar, aVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.t.f60803a, null, y2.m.b(1745762147, true, new er.r() { // from class: fb1.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.F1(g0Var, sVar, aVar2, lVar, lVar4, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.y.f60813a, null, y2.m.b(326438116, true, new er.r() { // from class: fb1.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.I1(g0Var, sVar, aVar2, aVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.z.f60815a, null, y2.m.b(-1092885915, true, new er.r() { // from class: fb1.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return i2.L1(sVar, aVar3, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H1(f00.s sVar) {
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(id1.g0 g0Var, p136y9.e0 e0Var, p136y9.y0 y0Var, Bundle bundle) {
        c cVarA;
        String strU = y0Var.u();
        if (strU == null || (cVarA = c.INSTANCE.a(strU)) == null) {
            return;
        }
        g0Var.v3(cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I1(final id1.g0 g0Var, final f00.s sVar, final er.a aVar, final er.a aVar2, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(326438116, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:706)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.y
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.J1(g0Var, (fd1.u.a) obj);
                }
            };
            rVar.v(objE);
        }
        fd1.u uVar = (fd1.u) q7.d.c(fr.q0.c(fd1.u.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<fd1.a.e> bVarY1 = uVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar) | rVar.W(aVar2) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.K1(sVar, aVar, aVar2, lVar, (fd1.a.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        fd1.n.k(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J0(final id1.g0 g0Var, final er.a aVar, final er.l lVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1411708085, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:115)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.d1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.K0(g0Var, (vc1.n.a) obj);
                }
            };
            rVar.v(objE);
        }
        vc1.n nVar = (vc1.n) q7.d.c(fr.q0.c(vc1.n.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<vc1.a.c> bVarY1 = nVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.e1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.L0(aVar, lVar, sVar, (vc1.a.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        vc1.g.g(nVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd1.u J1(id1.g0 g0Var, fd1.u.a aVar) {
        return aVar.a(g0Var.Q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vc1.n K0(id1.g0 g0Var, vc1.n.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K1(f00.s sVar, er.a aVar, er.a aVar2, er.l lVar, fd1.a.e eVar) {
        if (fr.t.c(eVar, fd1.a.e.C1388a.f61391a)) {
            sVar.c();
        } else if (fr.t.c(eVar, fd1.a.e.c.f61393a)) {
            aVar.a();
        } else if (fr.t.c(eVar, fd1.a.e.b.f61392a)) {
            aVar2.a();
        } else if (!fr.t.c(eVar, fd1.a.e.C1389e.f61395a)) {
            if (eVar instanceof fd1.a.e.Error) {
                lVar.b(((fd1.a.e.Error) eVar).getErrorData());
            } else {
                if (!(eVar instanceof fd1.a.e.ToSummary)) {
                    throw new oq.p();
                }
                f00.s.l(sVar, c.z.f60815a, ((fd1.a.e.ToSummary) eVar).getSummaryStatusEntryData(), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(er.a aVar, er.l lVar, f00.s sVar, vc1.a.c cVar) {
        if (fr.t.c(cVar, vc1.a.c.C5381a.f206031a)) {
            aVar.a();
        } else if (cVar instanceof vc1.a.c.Error) {
            lVar.b(((vc1.a.c.Error) cVar).getErrorData());
        } else if (cVar instanceof vc1.a.c.EnterHomeAddress) {
            f00.s.i(sVar, c.o.f60793a, ((vc1.a.c.EnterHomeAddress) cVar).getData(), null, 4, null);
        } else {
            if (!fr.t.c(cVar, vc1.a.c.d.f206034a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.q.f60797a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L1(final f00.s sVar, final er.a aVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1092885915, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:731)");
        }
        f00.r.o(wVar, fr.q0.c(if1.n.class), sVar.g(c.z.f60815a), y2.m.d(1155832212, true, new er.q() { // from class: fb1.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i2.M1(sVar, aVar, lVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f60754a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2101462838, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:366)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.N0(g0Var, (nc1.w.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        nc1.w wVar2 = (nc1.w) q7.d.c(fr.q0.c(nc1.w.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<nc1.b> bVarY1 = wVar2.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.O0(sVar, (nc1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        nc1.o.i(wVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M1(final f00.s sVar, final er.a aVar, final er.l lVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1155832212, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:735)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.e2
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.N1(sVar, aVar, lVar, (if1.i) obj);
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
    public static final nc1.w N0(id1.g0 g0Var, nc1.w.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N1(f00.s sVar, er.a aVar, er.l lVar, if1.i iVar) {
        if (fr.t.c(iVar, if1.i.a.f92088a)) {
            sVar.c();
        } else if (fr.t.c(iVar, if1.i.b.f92089a)) {
            aVar.a();
        } else {
            if (!(iVar instanceof if1.i.c)) {
                throw new oq.p();
            }
            lVar.b(((if1.i.c) iVar).a());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(f00.s sVar, nc1.b bVar) {
        if (fr.t.c(bVar, nc1.b.a.f133926a)) {
            sVar.c();
        } else {
            if (!fr.t.c(bVar, nc1.b.C3324b.f133927a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.j.f60783a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O1(final f00.s sVar, final er.a aVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-756129213, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:166)");
        }
        c.o oVar = c.o.f60793a;
        f00.r.D(wVar, oVar, sVar.e(oVar), y2.m.d(-167852718, true, new er.q() { // from class: fb1.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i2.P1(aVar, sVar, g0Var, lVar, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(final f00.s sVar, final er.a aVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1338814914, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:387)");
        }
        c.n nVar = c.n.f60791a;
        f00.r.D(wVar, nVar, sVar.e(nVar), y2.m.d(-1899450221, true, new er.q() { // from class: fb1.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i2.Q0(aVar, sVar, g0Var, lVar, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P1(final er.a aVar, final f00.s sVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-167852718, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:170)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(g0Var) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: fb1.b2
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.Q1(aVar, sVar, g0Var, lVar, lVar2, (st3.f.a) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(final er.a aVar, final f00.s sVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1899450221, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:391)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(g0Var) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: fb1.a2
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.R0(aVar, sVar, g0Var, lVar, lVar2, (st3.f.a) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q1(er.a aVar, f00.s sVar, id1.g0 g0Var, er.l lVar, er.l lVar2, st3.f.a aVar2) {
        if (aVar2 instanceof st3.f.a.Close) {
            aVar.a();
        } else if (aVar2 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar2 instanceof st3.f.a.GoToNextScreen) {
            g0Var.T2(new HomeAddressContractData(new hb1.c(((st3.f.a.GoToNextScreen) aVar2).getResult(), null, 2, null)));
            f00.s.i(sVar, c.m.f60789a, null, null, 6, null);
        } else if (aVar2 instanceof st3.f.a.GoToSearch) {
            lVar.b(((st3.f.a.GoToSearch) aVar2).getModel());
        } else {
            if (!(aVar2 instanceof st3.f.a.GoToError)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToError) aVar2).getErrorData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(er.a aVar, f00.s sVar, id1.g0 g0Var, er.l lVar, er.l lVar2, st3.f.a aVar2) {
        if (aVar2 instanceof st3.f.a.Close) {
            aVar.a();
        } else if (aVar2 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar2 instanceof st3.f.a.GoToNextScreen) {
            g0Var.m2(new CorrespondenceAddressSelectionContractData(new hb1.c(((st3.f.a.GoToNextScreen) aVar2).getResult(), null, 2, null)));
            f00.s.i(sVar, c.j.f60783a, null, null, 6, null);
        } else if (aVar2 instanceof st3.f.a.GoToSearch) {
            lVar.b(((st3.f.a.GoToSearch) aVar2).getModel());
        } else {
            if (!(aVar2 instanceof st3.f.a.GoToError)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToError) aVar2).getErrorData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R1(final id1.g0 g0Var, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2119514052, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:200)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.t0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.S1(g0Var, (ec1.s.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ec1.s sVar2 = (ec1.s) q7.d.c(fr.q0.c(ec1.s.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ec1.a.b> bVarY1 = sVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.u0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.T1(sVar, lVar, (ec1.a.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ec1.m.g(sVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(final id1.g0 g0Var, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-80509117, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:421)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.T0(g0Var, (we1.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        we1.r rVar2 = (we1.r) q7.d.c(fr.q0.c(we1.r.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<we1.h.f> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.o1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.U0(sVar, lVar, (we1.h.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        we1.g.m(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ec1.s S1(id1.g0 g0Var, ec1.s.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final we1.r T0(id1.g0 g0Var, we1.r.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T1(f00.s sVar, er.l lVar, final ec1.a.b bVar) {
        if (fr.t.c(bVar, ec1.a.b.C1165a.f49311a)) {
            sVar.c();
        } else if (bVar instanceof ec1.a.b.ShowDataPicker) {
            ec1.a.b.ShowDataPicker showDataPicker = (ec1.a.b.ShowDataPicker) bVar;
            lVar.b(new uw.j.Single(null, showDataPicker.getTodayDate(), new er.l() { // from class: fb1.f2
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.U1(bVar, (LocalDate) obj);
                }
            }, showDataPicker.getTodayDate(), null, 17, null));
        } else {
            if (!fr.t.c(bVar, ec1.a.b.C1166b.f49312a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.g.f60777a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(f00.s sVar, er.l lVar, we1.h.f fVar) {
        if (fr.t.c(fVar, we1.h.f.d.f212706a)) {
            f00.s.i(sVar, c.v.f60807a, null, null, 6, null);
        } else if (fr.t.c(fVar, we1.h.f.c.f212705a)) {
            f00.s.i(sVar, c.C1372c.f60769a, null, null, 6, null);
        } else if (fr.t.c(fVar, we1.h.f.a.f212703a)) {
            sVar.c();
        } else if (fVar instanceof we1.h.f.Error) {
            lVar.b(((we1.h.f.Error) fVar).getErrorData());
        } else {
            if (!(fVar instanceof we1.h.f.ToSearchScreen)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.w.f60809a, new PkdCodeSearchEntryData(((we1.h.f.ToSearchScreen) fVar).a()), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U1(ec1.a.b bVar, LocalDate localDate) {
        ((ec1.a.b.ShowDataPicker) bVar).a().b(new fz.b.LocalDate(localDate));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V0(final f00.s sVar, final id1.g0 g0Var, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1499833148, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:455)");
        }
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.W0(sVar, g0Var, (te1.a0.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        te1.a0 a0Var = (te1.a0) q7.d.c(fr.q0.c(te1.a0.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<te1.o.h> bVarY1 = a0Var.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.X0(sVar, (te1.o.h) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        te1.n.r(a0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V1(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(700190021, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:230)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.W1(g0Var, (hc1.f0.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        hc1.f0 f0Var = (hc1.f0) q7.d.c(fr.q0.c(hc1.f0.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<hc1.b> bVarY1 = f0Var.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.X1(sVar, (hc1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        hc1.t.i(f0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final te1.a0 W0(f00.s sVar, id1.g0 g0Var, te1.a0.a aVar) {
        PkdCodeSearchEntryData pkdCodeSearchEntryData = (PkdCodeSearchEntryData) sVar.e(c.w.f60809a);
        if (pkdCodeSearchEntryData == null) {
            pkdCodeSearchEntryData = new PkdCodeSearchEntryData(null, 1, null);
        }
        return aVar.a(new te1.a0.a.SetupData(pkdCodeSearchEntryData, g0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hc1.f0 W1(id1.g0 g0Var, hc1.f0.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X0(f00.s sVar, te1.o.h hVar) {
        if (fr.t.c(hVar, te1.o.h.a.f189885a)) {
            f00.s.i(sVar, c.u.f60805a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X1(f00.s sVar, hc1.b bVar) {
        if (fr.t.c(bVar, hc1.b.a.f83122a)) {
            sVar.c();
        } else {
            if (!fr.t.c(bVar, hc1.b.C1913b.f83123a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.u.f60805a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(final id1.g0 g0Var, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1375810117, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:479)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.Z0(g0Var, (ze1.q.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ze1.q qVar = (ze1.q) q7.d.c(fr.q0.c(ze1.q.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ze1.f> bVarY1 = qVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.a1(sVar, lVar, (ze1.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ze1.d.g(qVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y1(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-719134010, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:250)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.Z1(g0Var, (bc1.n.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        bc1.n nVar = (bc1.n) q7.d.c(fr.q0.c(bc1.n.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<bc1.b> bVarY1 = nVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.a2(sVar, (bc1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        bc1.j.d(nVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ze1.q Z0(id1.g0 g0Var, ze1.q.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bc1.n Z1(id1.g0 g0Var, bc1.n.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a1(f00.s sVar, er.l lVar, ze1.f fVar) {
        if (fr.t.c(fVar, ze1.f.a.f234679a)) {
            sVar.c();
        } else if (fVar instanceof ze1.f.Error) {
            lVar.b(((ze1.f.Error) fVar).getErrorData());
        } else {
            if (!fr.t.c(fVar, ze1.f.c.f234681a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.C1372c.f60769a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a2(f00.s sVar, bc1.b bVar) {
        if (fr.t.c(bVar, bc1.b.a.f18096a)) {
            sVar.c();
        } else if (fr.t.c(bVar, bc1.b.c.f18098a)) {
            f00.s.i(sVar, c.d.f60771a, null, null, 6, null);
        } else {
            if (!fr.t.c(bVar, bc1.b.C0451b.f18097a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.h.f60779a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b1(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-43513914, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:501)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.h1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.c1(g0Var, (cf1.j.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        cf1.j jVar = (cf1.j) q7.d.c(fr.q0.c(cf1.j.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<cf1.d.b> bVarY1 = jVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.d1(sVar, (cf1.d.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        cf1.c.c(jVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2138458041, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:275)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.p1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.c2(g0Var, (yb1.q.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        yb1.q qVar = (yb1.q) q7.d.c(fr.q0.c(yb1.q.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<yb1.b> bVarY1 = qVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.d2(sVar, (yb1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        yb1.k.g(qVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cf1.j c1(id1.g0 g0Var, cf1.j.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yb1.q c2(id1.g0 g0Var, yb1.q.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d1(f00.s sVar, cf1.d.b bVar) {
        if (fr.t.c(bVar, cf1.d.b.a.f25632a)) {
            sVar.c();
        } else if (fr.t.c(bVar, cf1.d.b.c.f25634a)) {
            f00.s.i(sVar, c.e.f60773a, null, null, 6, null);
        } else {
            if (!fr.t.c(bVar, cf1.d.b.C0685b.f25633a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.t.f60803a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(f00.s sVar, yb1.b bVar) {
        if (fr.t.c(bVar, yb1.b.a.f225977a)) {
            sVar.c();
        } else if (fr.t.c(bVar, yb1.b.c.f225979a)) {
            f00.s.i(sVar, c.h.f60779a, null, null, 6, null);
        } else {
            if (!(bVar instanceof yb1.b.GoToEnterAddress)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.l.f60787a, ((yb1.b.GoToEnterAddress) bVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e1(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1462837945, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:522)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.f1(g0Var, (ub1.t.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ub1.t tVar = (ub1.t) q7.d.c(fr.q0.c(ub1.t.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ub1.e> bVarY1 = tVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.g1(sVar, (ub1.e) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ub1.c.c(tVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e2(final f00.s sVar, final er.a aVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(737185224, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:301)");
        }
        c.l lVar3 = c.l.f60787a;
        f00.r.D(wVar, lVar3, sVar.e(lVar3), y2.m.d(1325461719, true, new er.q() { // from class: fb1.f1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i2.f2(aVar, sVar, g0Var, lVar, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ub1.t f1(id1.g0 g0Var, ub1.t.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f2(final er.a aVar, final f00.s sVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1325461719, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:305)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(g0Var) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: fb1.z1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.g2(aVar, sVar, g0Var, lVar, lVar2, (st3.f.a) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g1(f00.s sVar, ub1.e eVar) {
        if (fr.t.c(eVar, ub1.e.a.f197229a)) {
            sVar.c();
        } else {
            if (!fr.t.c(eVar, ub1.e.b.f197230a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.b.f60767a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g2(er.a aVar, f00.s sVar, id1.g0 g0Var, er.l lVar, er.l lVar2, st3.f.a aVar2) {
        if (aVar2 instanceof st3.f.a.Close) {
            aVar.a();
        } else if (aVar2 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar2 instanceof st3.f.a.GoToNextScreen) {
            g0Var.u0(new BusinessAddressSelectionContractData(new hb1.c(((st3.f.a.GoToNextScreen) aVar2).getResult(), null, 2, null)));
            f00.s.i(sVar, c.h.f60779a, null, null, 6, null);
        } else if (aVar2 instanceof st3.f.a.GoToSearch) {
            lVar.b(((st3.f.a.GoToSearch) aVar2).getModel());
        } else {
            if (!(aVar2 instanceof st3.f.a.GoToError)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToError) aVar2).getErrorData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h1(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1412805320, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:538)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.i1(g0Var, (rb1.p.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        rb1.p pVar = (rb1.p) q7.d.c(fr.q0.c(rb1.p.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<rb1.f> bVarY1 = pVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.j1(sVar, (rb1.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        rb1.d.g(pVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h2(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-682138807, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:335)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.i2(g0Var, (kc1.r.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        kc1.r rVar2 = (kc1.r) q7.d.c(fr.q0.c(kc1.r.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<kc1.b> bVarY1 = rVar2.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.j2(sVar, (kc1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        kc1.l.g(rVar2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rb1.p i1(id1.g0 g0Var, rb1.p.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kc1.r i2(id1.g0 g0Var, kc1.r.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j1(f00.s sVar, rb1.f fVar) {
        if (fr.t.c(fVar, rb1.f.a.f172923a)) {
            sVar.c();
        } else if (fr.t.c(fVar, rb1.f.c.f172925a)) {
            f00.s.i(sVar, c.r.f60799a, null, null, 6, null);
        } else {
            if (!(fVar instanceof rb1.f.GoToEnterAddress)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.k.f60785a, ((rb1.f.GoToEnterAddress) fVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j2(f00.s sVar, kc1.b bVar) {
        if (fr.t.c(bVar, kc1.b.a.f109922a)) {
            sVar.c();
        } else if (fr.t.c(bVar, kc1.b.d.f109925a)) {
            f00.s.i(sVar, c.j.f60783a, null, null, 6, null);
        } else if (bVar instanceof kc1.b.GoToEnterAddress) {
            f00.s.i(sVar, c.n.f60791a, ((kc1.b.GoToEnterAddress) bVar).getData(), null, 4, null);
        } else {
            if (!fr.t.c(bVar, kc1.b.c.f109924a)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.i.f60781a, null, null, 6, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k1(final f00.s sVar, final er.a aVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-6518711, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:567)");
        }
        c.k kVar = c.k.f60785a;
        f00.r.D(wVar, kVar, sVar.e(kVar), y2.m.d(1050183450, true, new er.q() { // from class: fb1.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return i2.l1(aVar, sVar, g0Var, lVar, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k2(id1.g0 g0Var, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.a aVar, er.a aVar2, er.a aVar3, int i15, p076m2.r rVar, int i16) {
        F0(g0Var, lVar, lVar2, lVar3, lVar4, aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l1(final er.a aVar, final f00.s sVar, final id1.g0 g0Var, final er.l lVar, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1050183450, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:571)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(g0Var) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: fb1.d2
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.m1(aVar, sVar, g0Var, lVar, lVar2, (st3.f.a) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m1(er.a aVar, f00.s sVar, id1.g0 g0Var, er.l lVar, er.l lVar2, st3.f.a aVar2) {
        if (aVar2 instanceof st3.f.a.Close) {
            aVar.a();
        } else if (aVar2 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar2 instanceof st3.f.a.GoToNextScreen) {
            g0Var.x7(new AccountingDocumentAddressSelectionContractData(new hb1.c(((st3.f.a.GoToNextScreen) aVar2).getResult(), null, 2, null)));
            f00.s.i(sVar, c.r.f60799a, null, null, 6, null);
        } else if (aVar2 instanceof st3.f.a.GoToSearch) {
            lVar.b(((st3.f.a.GoToSearch) aVar2).getModel());
        } else {
            if (!(aVar2 instanceof st3.f.a.GoToError)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToError) aVar2).getErrorData());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n1(final id1.g0 g0Var, final f00.s sVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1425842742, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:601)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.x1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.o1(g0Var, (kf1.n.a) obj);
                }
            };
            rVar.v(objE);
        }
        kf1.n nVar = (kf1.n) q7.d.c(fr.q0.c(kf1.n.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<kf1.a.d> bVarY1 = nVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.y1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.p1(sVar, lVar, lVar2, (kf1.a.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        kf1.g.d(nVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kf1.n o1(id1.g0 g0Var, kf1.n.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p1(f00.s sVar, er.l lVar, er.l lVar2, kf1.a.d dVar) {
        if (fr.t.c(dVar, kf1.a.d.C2648a.f110488a)) {
            sVar.c();
        } else if (fr.t.c(dVar, kf1.a.d.C2649d.f110491a)) {
            f00.s.i(sVar, c.a.f60765a, null, null, 6, null);
        } else if (dVar instanceof kf1.a.d.Error) {
            lVar.b(((kf1.a.d.Error) dVar).getErrorData());
        } else {
            if (!(dVar instanceof kf1.a.d.GoToSearch)) {
                throw new oq.p();
            }
            lVar2.b(((kf1.a.d.GoToSearch) dVar).getModel());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q1(final id1.g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(663194818, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:141)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.r1(g0Var, (yd1.p.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        yd1.p pVar = (yd1.p) q7.d.c(fr.q0.c(yd1.p.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<yd1.b> bVarY1 = pVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.s1(sVar, (yd1.b) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        yd1.k.g(pVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yd1.p r1(id1.g0 g0Var, yd1.p.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s1(f00.s sVar, yd1.b bVar) {
        if (fr.t.c(bVar, yd1.b.a.f226505a)) {
            sVar.c();
        } else if (fr.t.c(bVar, yd1.b.c.f226507a)) {
            f00.s.i(sVar, c.m.f60789a, null, null, 6, null);
        } else {
            if (!(bVar instanceof yd1.b.GoToEnterAddress)) {
                throw new oq.p();
            }
            f00.s.i(sVar, c.o.f60793a, ((yd1.b.GoToEnterAddress) bVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t1(final id1.g0 g0Var, final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1449800523, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:624)");
        }
        boolean zG = rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: fb1.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.u1(g0Var, (ff1.u.a) obj);
                }
            };
            rVar.v(objE);
        }
        androidx.lifecycle.w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        ff1.u uVar = (ff1.u) q7.d.c(fr.q0.c(ff1.u.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<ff1.d> bVarY1 = uVar.Y1();
        boolean zG2 = rVar.G(sVar) | rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: fb1.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.v1(sVar, aVar, (ff1.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f00.f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        ff1.p.k(uVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff1.u u1(id1.g0 g0Var, ff1.u.a aVar) {
        return aVar.a(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v1(f00.s sVar, er.a aVar, ff1.d dVar) {
        if (fr.t.c(dVar, ff1.d.a.f62177a)) {
            sVar.c();
        } else if (fr.t.c(dVar, ff1.d.c.f62179a)) {
            f00.s.i(sVar, c.y.f60813a, null, null, 6, null);
        } else {
            if (!fr.t.c(dVar, ff1.d.b.f62178a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w1(id1.g0 g0Var, final f00.s sVar, final er.a aVar, final er.l lVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(289442913, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.OpenCompanyWizardNavContent.<anonymous>.<anonymous>.<anonymous> (OpenCompanyWizardNavContent.kt:645)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: fb1.s1
                @Override // er.a
                public final Object a() {
                    return i2.x1(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar2 = (er.a) objE;
        boolean zW = rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: fb1.t1
                @Override // er.a
                public final Object a() {
                    return i2.y1(aVar);
                }
            };
            rVar.v(objE2);
        }
        er.a aVar3 = (er.a) objE2;
        boolean zG2 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG2 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new er.a() { // from class: fb1.u1
                @Override // er.a
                public final Object a() {
                    return i2.z1(sVar);
                }
            };
            rVar.v(objE3);
        }
        er.a aVar4 = (er.a) objE3;
        boolean zW2 = rVar.W(lVar);
        Object objE4 = rVar.E();
        if (zW2 || objE4 == p076m2.r.INSTANCE.a()) {
            objE4 = new er.l() { // from class: fb1.v1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.A1(lVar, (SearchModel) obj);
                }
            };
            rVar.v(objE4);
        }
        er.l lVar3 = (er.l) objE4;
        boolean zW3 = rVar.W(lVar2);
        Object objE5 = rVar.E();
        if (zW3 || objE5 == p076m2.r.INSTANCE.a()) {
            objE5 = new er.l() { // from class: fb1.w1
                @Override // er.l
                public final Object b(Object obj) {
                    return i2.B1(lVar2, (jb4.b) obj);
                }
            };
            rVar.v(objE5);
        }
        nd1.o.l(g0Var, aVar2, aVar3, aVar4, lVar3, (er.l) objE5, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x1(f00.s sVar) {
        f00.s.i(sVar, c.p.f60795a, null, null, 6, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y1(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z1(f00.s sVar) {
        sVar.c();
        return oq.i0.f148189a;
    }
}
