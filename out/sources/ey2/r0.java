package ey2;

import al0.BEContactDetailsData;
import al0.BECorrespondenceAddressData;
import al0.DMSTerytDetail;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.y0;
import cb4.DialogData;
import cw3.IdentityPhotoData;
import mv2.CustomErrorData;
import mw2.SetupData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p130wv2.x0;
import p136y9.d1;
import p7.CreationExtras;
import st3.AddressTerytDetail;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aé\u0001\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzx2/c$b;", "contract", "Lyx2/c;", "nestedViewModel", "Lkotlin/Function1;", "Ltt3/b;", "Loq/i0;", "goToSearch", "Lcb4/d;", "showDialog", "Lal0/g;", "goToSuccess", "Ldx3/a;", "showImagePreview", "Ljb4/b;", "goToError", "Lmv2/a;", "goToCustomError", "Lkotlin/Function0;", "exitProcess", "Lmv3/a$b;", "goToEdorAuth", "Lcw3/a;", "goToIdentityPhoto", "closeWizardProcess", "showCloseProcessDialog", "J", "(Lzx2/c$b;Lyx2/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Lm2/r;II)V", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r0 {
    public static final void J(final zx2.c.b bVar, final yx2.c cVar, final er.l<? super AddressSearchData, oq.i0> lVar, final er.l<? super DialogData, oq.i0> lVar2, final er.l<? super al0.g, oq.i0> lVar3, final er.l<? super dx3.a, oq.i0> lVar4, final er.l<? super jb4.b, oq.i0> lVar5, final er.l<? super CustomErrorData, oq.i0> lVar6, final er.a<oq.i0> aVar, final er.l<? super mv3.a.EdorAddressRequired, oq.i0> lVar7, final er.l<? super IdentityPhotoData, oq.i0> lVar8, final er.a<oq.i0> aVar2, final er.a<oq.i0> aVar3, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.l<? super AddressSearchData, oq.i0> lVar9;
        er.l<? super DialogData, oq.i0> lVar10;
        int i18;
        p076m2.r rVar2;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(1744144636);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            lVar9 = lVar;
            i17 |= rVarH.G(lVar9) ? 256 : 128;
        } else {
            lVar9 = lVar;
        }
        if ((i15 & 3072) == 0) {
            lVar10 = lVar2;
            i17 |= rVarH.G(lVar10) ? 2048 : 1024;
        } else {
            lVar10 = lVar2;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.G(lVar3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i15 & 196608) == 0) {
            i17 |= rVarH.G(lVar4) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= rVarH.G(lVar5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= rVarH.G(lVar6) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.G(aVar) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.G(lVar7) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (rVarH.G(lVar8) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(aVar3) ? 256 : 128;
        }
        int i19 = i18;
        if (rVarH.r(((i17 & 306783379) == 306783378 && (i19 & 147) == 146) ? false : true, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1744144636, i17, i19, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent (MyselfWizardNavContent.kt:71)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            x0.g gVar = x0.g.f215459b;
            boolean zG = ((i19 & 14) == 4) | ((i19 & 112) == 32) | ((i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(bVar))) | ((234881024 & i17) == 67108864) | rVarH.G(sVarJ) | ((i17 & 896) == 256) | ((3670016 & i17) == 1048576) | ((29360128 & i17) == 8388608) | ((i19 & 896) == 256) | ((i17 & 112) == 32 || ((i17 & 64) != 0 && rVarH.G(cVar))) | ((i17 & 7168) == 2048) | ((458752 & i17) == 131072) | ((57344 & i17) == 16384) | ((1879048192 & i17) == 536870912);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                final er.l<? super AddressSearchData, oq.i0> lVar11 = lVar9;
                rVar2 = rVarH;
                final er.l<? super DialogData, oq.i0> lVar12 = lVar10;
                sVar = sVarJ;
                er.l lVar13 = new er.l() { // from class: ey2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r0.K(bVar, aVar2, aVar, sVar, lVar11, lVar5, lVar6, aVar3, cVar, lVar12, lVar4, lVar8, lVar3, lVar7, (d1) obj);
                    }
                };
                rVar2.v(lVar13);
                objE = lVar13;
            } else {
                rVar2 = rVarH;
                sVar = sVarJ;
            }
            f00.d0.j(sVar, gVar, (er.l) objE, rVar2, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ey2.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r0.s0(bVar, cVar, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, aVar, lVar7, lVar8, aVar2, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final zx2.c.b bVar, final er.a aVar, final er.a aVar2, final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar3, final yx2.c cVar, final er.l lVar4, final er.l lVar5, final er.l lVar6, final er.l lVar7, final er.l lVar8, d1 d1Var) {
        f00.r.u(d1Var, x0.g.f215459b, null, y2.m.b(-1226776707, true, new er.r() { // from class: ey2.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.L(bVar, aVar, aVar2, sVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.c.f215455b, null, y2.m.b(-1193253978, true, new er.r() { // from class: ey2.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.P(sVar, lVar2, bVar, aVar2, lVar3, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.i.f215461b, null, y2.m.b(-177033851, true, new er.r() { // from class: ey2.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.S(sVar, lVar, bVar, lVar2, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.h.f215460b, null, y2.m.b(839186276, true, new er.r() { // from class: ey2.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.V(sVar, bVar, cVar, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.f.f215458b, null, y2.m.b(1855406403, true, new er.r() { // from class: ey2.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.Z(sVar, lVar2, bVar, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.a.f215453b, null, y2.m.b(-1423340766, true, new er.r() { // from class: ey2.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.c0(sVar, bVar, lVar4, lVar2, lVar5, lVar6, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.b.f215454b, null, y2.m.b(-407120639, true, new er.r() { // from class: ey2.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.f0(sVar, lVar4, lVar2, lVar5, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.e.f215457b, null, y2.m.b(609099488, true, new er.r() { // from class: ey2.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.i0(sVar, aVar3, lVar2, bVar, lVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.d.f215456b, null, y2.m.b(1625319615, true, new er.r() { // from class: ey2.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.l0(sVar, aVar3, bVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x0.j.f215462b, null, y2.m.b(-1653427554, true, new er.r() { // from class: ey2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return r0.o0(sVar, lVar7, lVar2, lVar8, aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final zx2.c.b bVar, final er.a aVar, final er.a aVar2, final f00.s sVar, final er.l lVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1226776707, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:81)");
        }
        boolean zG = rVar.G(bVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ey2.n
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.M(bVar, (gx2.a.InterfaceC1773a) obj);
                }
            };
            rVar.v(objE);
        }
        int i16 = i15 >> 3;
        final gx2.a aVar3 = (gx2.a) q7.d.c(fr.q0.c(gx2.a.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (er.l) objE), rVar, ((i16 & 14) << 3) & 112, 0);
        f00.r.r(wVar, x0.g.f215459b, aVar3.Z8(), y2.m.d(-1818642104, true, new er.q() { // from class: ey2.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.N(aVar, aVar2, aVar3, sVar, bVar, lVar, (py3.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, (i16 & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gx2.a M(zx2.c.b bVar, gx2.a.InterfaceC1773a interfaceC1773a) {
        return (gx2.a) interfaceC1773a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final er.a aVar, final er.a aVar2, final gx2.a aVar3, final f00.s sVar, final zx2.c.b bVar, final er.l lVar, py3.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1818642104, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:89)");
        }
        xw.b<py3.d.a> bVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.G(aVar3) | rVar.G(sVar) | rVar.G(bVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar2 = new er.l() { // from class: ey2.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.O(aVar, aVar2, aVar3, lVar, sVar, bVar, (py3.d.a) obj);
                }
            };
            rVar.v(lVar2);
            objE = lVar2;
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(er.a aVar, er.a aVar2, gx2.a aVar3, er.l lVar, f00.s sVar, zx2.c.b bVar, py3.d.a aVar4) {
        if (fr.t.c(aVar4, py3.d.a.C4046a.f163265a)) {
            aVar.a();
        } else if (fr.t.c(aVar4, py3.d.a.b.f163266a)) {
            aVar2.a();
        } else if (aVar4 instanceof py3.d.a.OfficeSelected) {
            aVar3.b9(((py3.d.a.OfficeSelected) aVar4).getOffice());
            oq.i0 i0Var = oq.i0.f148189a;
            f00.s.l(sVar, x0.c.f215455b, new SetupData(mw2.l.b.f128850a, bVar), null, 4, null);
        } else {
            if (!(aVar4 instanceof py3.d.a.Search)) {
                throw new oq.p();
            }
            lVar.b(aVar3.a9(((py3.d.a.Search) aVar4).getModel()));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, final er.l lVar, final zx2.c.b bVar, final er.a aVar, final er.l lVar2, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1193253978, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:118)");
        }
        f00.r.o(wVar, fr.q0.c(mw2.z.class), sVar.g(x0.c.f215455b), y2.m.d(-830900715, true, new er.q() { // from class: ey2.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.Q(lVar, sVar, bVar, aVar, lVar2, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f54109a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final er.l lVar, final f00.s sVar, final zx2.c.b bVar, final er.a aVar, final er.l lVar2, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-830900715, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:125)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(bVar) | rVar.W(aVar) | rVar.W(lVar2) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: ey2.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.R(lVar, sVar, bVar, aVar, lVar2, aVar2, (mw2.d) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(er.l lVar, f00.s sVar, zx2.c.b bVar, er.a aVar, er.l lVar2, er.a aVar2, mw2.d dVar) {
        if (dVar instanceof mw2.d.GoToError) {
            lVar.b(((mw2.d.GoToError) dVar).getErrorData());
        } else if (dVar instanceof mw2.d.f) {
            f00.s.l(sVar, x0.i.f215461b, bVar, null, 4, null);
        } else if (fr.t.c(dVar, mw2.d.a.f128822a)) {
            sVar.c();
        } else if (fr.t.c(dVar, mw2.d.b.f128823a)) {
            aVar.a();
        } else if (dVar instanceof mw2.d.C3194d) {
            lVar2.b(((mw2.d.C3194d) dVar).a());
        } else {
            if (!fr.t.c(dVar, mw2.d.c.f128824a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(final f00.s sVar, final er.l lVar, final zx2.c.b bVar, final er.l lVar2, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-177033851, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:147)");
        }
        f00.r.o(wVar, fr.q0.c(ox2.v.class), sVar.g(x0.i.f215461b), y2.m.d(185319412, true, new er.q() { // from class: ey2.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.T(lVar, sVar, bVar, lVar2, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f54109a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final er.l lVar, final f00.s sVar, final zx2.c.b bVar, final er.l lVar2, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(185319412, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:154)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(bVar) | rVar.W(lVar2) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: ey2.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.U(lVar, sVar, bVar, lVar2, aVar, (ox2.a.d) obj);
                }
            };
            rVar.v(lVar3);
            objE = lVar3;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(er.l lVar, f00.s sVar, zx2.c.b bVar, er.l lVar2, er.a aVar, ox2.a.d dVar) {
        if (dVar instanceof ox2.a.d.GoToSearch) {
            lVar.b(((ox2.a.d.GoToSearch) dVar).getModel());
        } else if (dVar instanceof ox2.a.d.GoToNextScreen) {
            f00.s.l(sVar, x0.h.f215460b, bVar, null, 4, null);
        } else if (fr.t.c(dVar, ox2.a.d.C3709a.f150483a)) {
            sVar.c();
        } else if (dVar instanceof ox2.a.d.GoToError) {
            lVar2.b(((ox2.a.d.GoToError) dVar).getError());
        } else {
            if (!fr.t.c(dVar, ox2.a.d.b.f150484a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final f00.s sVar, final zx2.c.b bVar, final yx2.c cVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(839186276, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:175)");
        }
        f00.r.o(wVar, fr.q0.c(lx2.q.class), sVar.g(x0.h.f215460b), y2.m.d(1201539539, true, new er.q() { // from class: ey2.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.W(sVar, bVar, cVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f54109a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, final zx2.c.b bVar, final yx2.c cVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1201539539, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:182)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(bVar) | rVar.G(cVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ey2.z
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.X(sVar, bVar, aVar, cVar, (lx2.a) obj);
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
    public static final oq.i0 X(f00.s sVar, zx2.c.b bVar, er.a aVar, final yx2.c cVar, lx2.a aVar2) {
        if (fr.t.c(aVar2, lx2.a.c.f121109a)) {
            f00.s.l(sVar, x0.f.f215458b, new aw2.SetupData(bVar, new er.a() { // from class: ey2.i0
                @Override // er.a
                public final Object a() {
                    return r0.Y(cVar);
                }
            }), null, 4, null);
        } else if (fr.t.c(aVar2, lx2.a.C2963a.f121107a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, lx2.a.b.f121108a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(yx2.c cVar) {
        cVar.q2();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, final er.l lVar, final zx2.c.b bVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1855406403, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:204)");
        }
        f00.r.o(wVar, fr.q0.c(aw2.m.class), sVar.g(x0.f.f215458b), y2.m.d(-2077207630, true, new er.q() { // from class: ey2.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.a0(lVar, sVar, bVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f54109a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final er.l lVar, final f00.s sVar, final zx2.c.b bVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2077207630, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:209)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.G(sVar) | rVar.G(bVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ey2.x
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.b0(lVar, sVar, bVar, aVar, (aw2.a.InterfaceC0329a) obj);
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
    public static final oq.i0 b0(er.l lVar, f00.s sVar, zx2.c.b bVar, er.a aVar, aw2.a.InterfaceC0329a interfaceC0329a) {
        if (interfaceC0329a instanceof aw2.a.InterfaceC0329a.Error) {
            lVar.b(((aw2.a.InterfaceC0329a.Error) interfaceC0329a).getData());
        } else if (interfaceC0329a instanceof aw2.a.InterfaceC0329a.Next) {
            sVar.j(x0.a.f215453b, new jw2.SetupData(((aw2.a.InterfaceC0329a.Next) interfaceC0329a).getIdentityPhotoEnabled(), bVar), x0.f.f215458b);
        } else {
            if (!fr.t.c(interfaceC0329a, aw2.a.InterfaceC0329a.C0330a.f14778a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, final zx2.c.b bVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1423340766, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:230)");
        }
        f00.r.o(wVar, fr.q0.c(jw2.p.class), sVar.g(x0.a.f215453b), y2.m.d(-1060987503, true, new er.q() { // from class: ey2.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.d0(sVar, bVar, lVar, lVar2, lVar3, lVar4, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f54109a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, final zx2.c.b bVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1060987503, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:237)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(bVar) | rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.W(lVar4) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ey2.y
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.e0(sVar, bVar, lVar, lVar2, lVar3, lVar4, aVar, (jw2.a.c) obj);
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
    public static final oq.i0 e0(f00.s sVar, zx2.c.b bVar, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.a aVar, jw2.a.c cVar) {
        if (fr.t.c(cVar, jw2.a.c.C2525a.f106261a)) {
            f00.s.l(sVar, x0.b.f215454b, bVar, null, 4, null);
        } else if (cVar instanceof jw2.a.c.CorrespondenceAddress) {
            f00.s.l(sVar, x0.e.f215457b, ((jw2.a.c.CorrespondenceAddress) cVar).getData(), null, 4, null);
        } else if (cVar instanceof jw2.a.c.ShowNavigationDialog) {
            lVar.b(((jw2.a.c.ShowNavigationDialog) cVar).getDialogData());
        } else if (cVar instanceof jw2.a.c.ShowError) {
            lVar2.b(((jw2.a.c.ShowError) cVar).getData());
        } else if (cVar instanceof jw2.a.c.ShowImagePreview) {
            lVar3.b(((jw2.a.c.ShowImagePreview) cVar).getData());
        } else if (cVar instanceof jw2.a.c.IdentityPhoto) {
            lVar4.b(((jw2.a.c.IdentityPhoto) cVar).getData());
        } else if (fr.t.c(cVar, jw2.a.c.b.f106262a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, jw2.a.c.C2526c.f106263a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-407120639, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:265)");
        }
        f00.r.o(wVar, fr.q0.c(gw2.l0.class), sVar.g(x0.b.f215454b), y2.m.d(-44767376, true, new er.q() { // from class: ey2.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.g0(lVar, lVar2, sVar, lVar3, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f54109a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final er.l lVar, final er.l lVar2, final f00.s sVar, final er.l lVar3, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-44767376, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:272)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.G(sVar) | rVar.W(lVar3) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: ey2.h0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.h0(lVar, lVar2, sVar, lVar3, aVar, (gw2.c) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(er.l lVar, er.l lVar2, f00.s sVar, er.l lVar3, er.a aVar, gw2.c cVar) {
        if (cVar instanceof gw2.c.ShowDialog) {
            lVar.b(((gw2.c.ShowDialog) cVar).getDialogData());
        } else if (cVar instanceof gw2.c.ShowError) {
            lVar2.b(((gw2.c.ShowError) cVar).getData());
        } else if (cVar instanceof gw2.c.GoToNextScreen) {
            f00.s.l(sVar, x0.e.f215457b, ((gw2.c.GoToNextScreen) cVar).getData(), null, 4, null);
        } else if (cVar instanceof gw2.c.ShowImagePreview) {
            lVar3.b(((gw2.c.ShowImagePreview) cVar).getData());
        } else if (fr.t.c(cVar, gw2.c.a.f77974a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, gw2.c.b.f77975a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, final er.a aVar, final er.l lVar, final zx2.c.b bVar, final er.l lVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(609099488, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:294)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final ax2.a aVar2 = (ax2.a) q7.d.c(fr.q0.c(ax2.a.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        x0.e eVar = x0.e.f215457b;
        f00.r.r(wVar, eVar, sVar.g(eVar), y2.m.d(270839023, true, new er.q() { // from class: ey2.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.j0(aVar, sVar, lVar, bVar, aVar2, lVar2, (st3.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final er.a aVar, final f00.s sVar, final er.l lVar, final zx2.c.b bVar, final ax2.a aVar2, final er.l lVar2, st3.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(270839023, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:302)");
        }
        xw.b<st3.f.a> bVarY1 = fVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.W(lVar) | rVar.G(bVar) | rVar.G(aVar2) | rVar.W(lVar2);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar3 = new er.l() { // from class: ey2.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.k0(aVar, sVar, lVar, bVar, aVar2, lVar2, (st3.f.a) obj);
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
    public static final oq.i0 k0(er.a aVar, f00.s sVar, er.l lVar, zx2.c.b bVar, ax2.a aVar2, er.l lVar2, st3.f.a aVar3) {
        if (aVar3 instanceof st3.f.a.Close) {
            aVar.a();
        } else if (aVar3 instanceof st3.f.a.Back) {
            sVar.c();
        } else if (aVar3 instanceof st3.f.a.GoToError) {
            lVar.b(((st3.f.a.GoToError) aVar3).getErrorData());
        } else if (aVar3 instanceof st3.f.a.GoToNextScreen) {
            st3.f.a.GoToNextScreen goToNextScreen = (st3.f.a.GoToNextScreen) aVar3;
            DMSTerytDetail dMSTerytDetailD = kv2.a.d(goToNextScreen.getResult().getProvince());
            DMSTerytDetail dMSTerytDetailD2 = kv2.a.d(goToNextScreen.getResult().getCounty());
            DMSTerytDetail dMSTerytDetailD3 = kv2.a.d(goToNextScreen.getResult().getCommunity());
            DMSTerytDetail dMSTerytDetailD4 = kv2.a.d(goToNextScreen.getResult().getCity());
            String postalCode = goToNextScreen.getResult().getPostalCode();
            AddressTerytDetail street = goToNextScreen.getResult().getStreet();
            bVar.A0(new BECorrespondenceAddressData(dMSTerytDetailD, dMSTerytDetailD2, dMSTerytDetailD3, dMSTerytDetailD4, postalCode, street != null ? kv2.a.d(street) : null, goToNextScreen.getResult().getBuildingNumber(), goToNextScreen.getResult().getApartmentNumber()));
            f00.s.l(sVar, x0.d.f215456b, aVar2.Z8(bVar.z0()), null, 4, null);
        } else {
            if (!(aVar3 instanceof st3.f.a.GoToSearch)) {
                throw new oq.p();
            }
            lVar2.b(((st3.f.a.GoToSearch) aVar3).getModel());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, final er.a aVar, final zx2.c.b bVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1625319615, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:339)");
        }
        x0.d dVar = x0.d.f215456b;
        f00.r.r(wVar, dVar, sVar.g(dVar), y2.m.d(-1158098517, true, new er.q() { // from class: ey2.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.m0(sVar, aVar, bVar, (ru3.a) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, final er.a aVar, final zx2.c.b bVar, ru3.a aVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1158098517, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:346)");
        }
        xw.b<ru3.a.AbstractC4497a> bVarY1 = aVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.G(bVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ey2.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.n0(sVar, aVar, bVar, (ru3.a.AbstractC4497a) obj);
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
    public static final oq.i0 n0(f00.s sVar, er.a aVar, zx2.c.b bVar, ru3.a.AbstractC4497a abstractC4497a) {
        if (abstractC4497a instanceof ru3.a.AbstractC4497a.Back) {
            sVar.c();
        } else if (abstractC4497a instanceof ru3.a.AbstractC4497a.Close) {
            aVar.a();
        } else {
            if (!(abstractC4497a instanceof ru3.a.AbstractC4497a.Next)) {
                throw new oq.p();
            }
            ru3.a.AbstractC4497a.Next next = (ru3.a.AbstractC4497a.Next) abstractC4497a;
            bVar.h(new BEContactDetailsData(next.getContactDetailsData().getPhoneNumber(), next.getContactDetailsData().getEmailAddress()));
            f00.s.l(sVar, x0.j.f215462b, bVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, final er.l lVar, final er.l lVar2, final er.l lVar3, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1653427554, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:371)");
        }
        f00.r.o(wVar, fr.q0.c(rx2.o.class), sVar.g(x0.j.f215462b), y2.m.d(-1291074291, true, new er.q() { // from class: ey2.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r0.p0(lVar, lVar2, lVar3, sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), h.f54109a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final er.l lVar, final er.l lVar2, final er.l lVar3, final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1291074291, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.wizard.myself.navcontent.MyselfWizardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyselfWizardNavContent.kt:378)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar4 = new er.l() { // from class: ey2.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.q0(lVar, lVar2, lVar3, sVar, aVar, (rx2.a.c) obj);
                }
            };
            rVar.v(lVar4);
            objE = lVar4;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(er.l lVar, er.l lVar2, er.l lVar3, f00.s sVar, er.a aVar, final rx2.a.c cVar) {
        if (cVar instanceof rx2.a.c.GoToSuccess) {
            lVar.b(((rx2.a.c.GoToSuccess) cVar).getApplicationOwnerWithAge());
        } else if (cVar instanceof rx2.a.c.GoToError) {
            lVar2.b(((rx2.a.c.GoToError) cVar).getErrorData());
        } else if (cVar instanceof rx2.a.c.GoToEdorAuth) {
            lVar3.b(new mv3.a.EdorAddressRequired(new er.l() { // from class: ey2.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return r0.r0(cVar, (iy.b0) obj);
                }
            }, null, 2, null));
        } else if (fr.t.c(cVar, rx2.a.c.C4510a.f176660a)) {
            sVar.c();
        } else {
            if (!fr.t.c(cVar, rx2.a.c.b.f176661a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(rx2.a.c cVar, iy.b0 b0Var) {
        ((rx2.a.c.GoToEdorAuth) cVar).a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(zx2.c.b bVar, yx2.c cVar, er.l lVar, er.l lVar2, er.l lVar3, er.l lVar4, er.l lVar5, er.l lVar6, er.a aVar, er.l lVar7, er.l lVar8, er.a aVar2, er.a aVar3, int i15, int i16, p076m2.r rVar, int i17) {
        J(bVar, cVar, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, aVar, lVar7, lVar8, aVar2, aVar3, rVar, g4.a(i15 | 1), g4.a(i16));
        return oq.i0.f148189a;
    }
}
