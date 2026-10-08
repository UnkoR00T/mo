package p092oa0;

import aa0.AddDocumentsEntryData;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import cf0.c;
import er.a;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import jb4.b;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.d;
import ta0.o0;
import ta0.z;
import va0.l;
import xa0.g;
import xa0.j;
import y2.m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0081\u0003\u0010 \u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lva0/l;", "mainDashboardVM", "Lkotlin/Function0;", "Loq/i0;", "onLogout", "onDeactivate", "onChangeTheme", "goToAboutApp", "goToResetPin", "goToActivation", "goToInfoPage", "Lkotlin/Function1;", "Ljb4/b;", "goToError", "", "goToSchoolCard", "Lkotlin/Function2;", "Lcf0/c;", "goToDocumentLoader", "Laa0/a;", "goToAddDocument", "goToDrivingLicence", "goToFamilyCard", "goToUutCard", "goToDisabledPersonID", "goToGrades", "goToAttendance", "goToTimetable", "goToBehavior", "goToNotificationsHistory", "goToNotificationsSettings", "goToBiometrics", "m", "(Lva0/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/p;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Lm2/r;III)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    public static final void m(final l lVar, final a<i0> aVar, final a<i0> aVar2, final a<i0> aVar3, final a<i0> aVar4, final a<i0> aVar5, final a<i0> aVar6, final a<i0> aVar7, final er.l<? super b, i0> lVar2, final er.l<? super String, i0> lVar3, final p<? super String, ? super c, i0> pVar, final er.l<? super AddDocumentsEntryData, i0> lVar4, final er.l<? super String, i0> lVar5, final er.l<? super String, i0> lVar6, final er.l<? super String, i0> lVar7, final er.l<? super String, i0> lVar8, final a<i0> aVar8, final a<i0> aVar9, final a<i0> aVar10, final a<i0> aVar11, final a<i0> aVar12, final a<i0> aVar13, final a<i0> aVar14, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        a<i0> aVar15;
        a<i0> aVar16;
        a<i0> aVar17;
        int i19;
        int i25;
        r rVarH = rVar.h(1094338140);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar15 = aVar;
            i18 |= rVarH.G(aVar15) ? 32 : 16;
        } else {
            aVar15 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            aVar16 = aVar3;
            i18 |= rVarH.G(aVar16) ? 2048 : 1024;
        } else {
            aVar16 = aVar3;
        }
        if ((i15 & 24576) == 0) {
            aVar17 = aVar4;
            i18 |= rVarH.G(aVar17) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            aVar17 = aVar4;
        }
        if ((i15 & 196608) == 0) {
            i18 |= rVarH.G(aVar5) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i18 |= rVarH.G(aVar6) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= rVarH.G(aVar7) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= rVarH.G(lVar2) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i18 |= rVarH.G(lVar3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i19 = i16 | (rVarH.G(pVar) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= rVarH.G(lVar4) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i19 |= rVarH.G(lVar5) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i19 |= rVarH.G(lVar6) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i19 |= rVarH.G(lVar7) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i16 & 196608) == 0) {
            i19 |= rVarH.G(lVar8) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i16 & 1572864) == 0) {
            i19 |= rVarH.G(aVar8) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i16 & 12582912) == 0) {
            i19 |= rVarH.G(aVar9) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i19 |= rVarH.G(aVar10) ? 67108864 : 33554432;
        }
        if ((i16 & 805306368) == 0) {
            i19 |= rVarH.G(aVar11) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i26 = i19;
        if ((i17 & 6) == 0) {
            i25 = i17 | (rVarH.G(aVar12) ? 4 : 2);
        } else {
            i25 = i17;
        }
        if ((i17 & 48) == 0) {
            i25 |= rVarH.G(aVar13) ? 32 : 16;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i25 |= rVarH.G(aVar14) ? 256 : 128;
        }
        int i27 = i25;
        if (rVarH.r(((i18 & 306783379) == 306783378 && (306783379 & i26) == 306783378 && (i27 & 147) == 146) ? false : true, i18 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1094338140, i18, i26, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardInnerNavContent (DashboardInnerNavContent.kt:51)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            xw.b<va0.a.c> bVarG = lVar.g();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: oa0.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.n(sVarJ, (va0.a.c) obj);
                    }
                };
                rVarH.v(objE);
            }
            f0.b(bVarG, (er.l) objE, rVarH, xw.b.f221619c);
            d dVar = d.f143854a;
            boolean zG2 = ((i26 & 1879048192) == 536870912) | ((i18 & 112) == 32) | ((i18 & 896) == 256) | ((3670016 & i18) == 1048576) | ((1879048192 & i18) == 536870912) | rVarH.G(sVarJ) | ((29360128 & i18) == 8388608) | ((i26 & 14) == 4) | ((i26 & 112) == 32) | ((i26 & 896) == 256) | ((57344 & i26) == 16384) | ((234881024 & i18) == 67108864) | ((i26 & 7168) == 2048) | ((458752 & i26) == 131072) | ((i27 & 14) == 4) | ((3670016 & i26) == 1048576) | ((234881024 & i26) == 67108864) | ((29360128 & i26) == 8388608) | ((i18 & 7168) == 2048) | ((57344 & i18) == 16384) | ((458752 & i18) == 131072) | ((i27 & 112) == 32) | ((i27 & 896) == 256);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                final a<i0> aVar18 = aVar15;
                final a<i0> aVar19 = aVar17;
                final a<i0> aVar20 = aVar16;
                er.l lVar9 = new er.l() { // from class: oa0.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.o(aVar2, aVar6, lVar3, sVarJ, aVar18, aVar7, pVar, lVar4, lVar5, lVar7, lVar2, lVar6, lVar8, aVar12, aVar8, aVar10, aVar9, aVar11, aVar20, aVar19, aVar5, aVar13, aVar14, (d1) obj);
                    }
                };
                rVarH.v(lVar9);
                objE2 = lVar9;
            }
            d0.j(sVarJ, dVar, (er.l) objE2, rVarH, s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: oa0.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.y(lVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, lVar2, lVar3, pVar, lVar4, lVar5, lVar6, lVar7, lVar8, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(s sVar, va0.a.c cVar) {
        if (fr.t.c(cVar, va0.a.c.C5368a.f205647a)) {
            s.i(sVar, d.f143854a, null, null, 6, null);
        } else if (fr.t.c(cVar, va0.a.c.b.f205648a)) {
            s.i(sVar, f.f143858a, null, null, 6, null);
        } else {
            if (!fr.t.c(cVar, va0.a.c.C5369c.f205649a)) {
                throw new oq.p();
            }
            s.i(sVar, g.f143860a, null, null, 6, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final a aVar, final a aVar2, final er.l lVar, final s sVar, final a aVar3, final a aVar4, final p pVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.l lVar5, final er.l lVar6, final er.l lVar7, final a aVar5, final a aVar6, final a aVar7, final a aVar8, final a aVar9, final a aVar10, final a aVar11, final a aVar12, final a aVar13, final a aVar14, d1 d1Var) {
        f00.r.u(d1Var, d.f143854a, null, m.b(1392577915, true, new er.r() { // from class: oa0.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.p(aVar, aVar2, lVar, sVar, aVar3, aVar4, pVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, aVar5, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f143858a, null, m.b(1552791538, true, new er.r() { // from class: oa0.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.r(aVar6, aVar7, aVar8, aVar9, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, g.f143860a, null, m.b(197291123, true, new er.r() { // from class: oa0.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.t(aVar3, aVar, aVar10, aVar11, aVar12, sVar, aVar13, aVar14, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, e.f143856a, new g0.Dialog(null, 1, null), m.b(-1158209292, true, new er.r() { // from class: oa0.p
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.v(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final a aVar, final a aVar2, final er.l lVar, final s sVar, final a aVar3, final a aVar4, final p pVar, final er.l lVar2, final er.l lVar3, final er.l lVar4, final er.l lVar5, final er.l lVar6, final er.l lVar7, final a aVar5, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1392577915, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardInnerNavContent.<anonymous>.<anonymous>.<anonymous> (DashboardInnerNavContent.kt:75)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        o0 o0Var = (o0) d.c(q0.c(o0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<ta0.a.f> bVarY1 = o0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.W(lVar) | rVar.G(sVar) | rVar.W(aVar3) | rVar.W(aVar4) | rVar.W(pVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.W(lVar4) | rVar.W(lVar5) | rVar.W(lVar6) | rVar.W(lVar7) | rVar.W(aVar5);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            er.l lVar8 = new er.l() { // from class: oa0.i
                @Override // er.l
                public final Object b(Object obj) {
                    return t.q(aVar, aVar2, lVar, sVar, aVar3, aVar4, pVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, aVar5, (ta0.a.f) obj);
                }
            };
            rVar.v(lVar8);
            objE = lVar8;
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        z.u(o0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(a aVar, a aVar2, er.l lVar, s sVar, a aVar3, a aVar4, p pVar, er.l lVar2, er.l lVar3, er.l lVar4, er.l lVar5, er.l lVar6, er.l lVar7, a aVar5, ta0.a.f fVar) {
        if (fr.t.c(fVar, ta0.a.f.C4915a.f189111a)) {
            aVar.a();
        } else if (fr.t.c(fVar, ta0.a.f.c.f189113a)) {
            aVar2.a();
        } else if (fVar instanceof ta0.a.f.GoToSchoolCard) {
            lVar.b(((ta0.a.f.GoToSchoolCard) fVar).getDocumentId());
        } else if (fVar instanceof ta0.a.f.ShowDialog) {
            s.l(sVar, e.f143856a, ((ta0.a.f.ShowDialog) fVar).getData(), null, 4, null);
        } else if (fr.t.c(fVar, ta0.a.f.m.f189124a)) {
            aVar3.a();
        } else if (fr.t.c(fVar, ta0.a.f.i.f189120a)) {
            aVar4.a();
        } else if (fVar instanceof ta0.a.f.GoToDocumentLoader) {
            ta0.a.f.GoToDocumentLoader goToDocumentLoader = (ta0.a.f.GoToDocumentLoader) fVar;
            pVar.B(goToDocumentLoader.getDocumentId(), goToDocumentLoader.getDocumentType());
        } else if (fVar instanceof ta0.a.f.GoToAddDocument) {
            lVar2.b(new AddDocumentsEntryData(((ta0.a.f.GoToAddDocument) fVar).a()));
        } else if (fVar instanceof ta0.a.f.GoToDrivingLicence) {
            lVar3.b(((ta0.a.f.GoToDrivingLicence) fVar).getDocumentId());
        } else if (fVar instanceof ta0.a.f.GoToUutCard) {
            lVar4.b(((ta0.a.f.GoToUutCard) fVar).getDocumentId());
        } else if (fVar instanceof ta0.a.f.Error) {
            lVar5.b(((ta0.a.f.Error) fVar).getErrorData());
        } else if (fVar instanceof ta0.a.f.GoToFamilyCard) {
            lVar6.b(((ta0.a.f.GoToFamilyCard) fVar).getDocumentId());
        } else if (fVar instanceof ta0.a.f.GoToDisabledPersonID) {
            lVar7.b(((ta0.a.f.GoToDisabledPersonID) fVar).getDocumentId());
        } else {
            if (!fr.t.c(fVar, ta0.a.f.j.f189121a)) {
                throw new oq.p();
            }
            aVar5.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final a aVar, final a aVar2, final a aVar3, final a aVar4, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1552791538, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardInnerNavContent.<anonymous>.<anonymous>.<anonymous> (DashboardInnerNavContent.kt:106)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        j jVar = (j) d.c(q0.c(j.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<xa0.a> bVarY1 = jVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.W(aVar3) | rVar.W(aVar4);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: oa0.q
                @Override // er.l
                public final Object b(Object obj) {
                    return t.s(aVar, aVar2, aVar3, aVar4, (xa0.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        g.d(jVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(a aVar, a aVar2, a aVar3, a aVar4, xa0.a aVar5) {
        if (fr.t.c(aVar5, xa0.a.c.f217738a)) {
            aVar.a();
        } else if (fr.t.c(aVar5, xa0.a.d.f217739a)) {
            aVar2.a();
        } else if (fr.t.c(aVar5, xa0.a.C5811a.f217736a)) {
            aVar3.a();
        } else {
            if (!fr.t.c(aVar5, xa0.a.b.f217737a)) {
                throw new oq.p();
            }
            aVar4.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final a aVar, final a aVar2, final a aVar3, final a aVar4, final a aVar5, final s sVar, final a aVar6, final a aVar7, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(197291123, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardInnerNavContent.<anonymous>.<anonymous>.<anonymous> (DashboardInnerNavContent.kt:120)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ab0.j jVar = (ab0.j) d.c(q0.c(ab0.j.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<ab0.a.c> bVarY1 = jVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.W(aVar3) | rVar.W(aVar4) | rVar.W(aVar5) | rVar.G(sVar) | rVar.W(aVar6) | rVar.W(aVar7);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            er.l lVar = new er.l() { // from class: oa0.s
                @Override // er.l
                public final Object b(Object obj) {
                    return t.u(aVar, aVar2, aVar3, aVar4, aVar5, sVar, aVar6, aVar7, (ab0.a.c) obj);
                }
            };
            rVar.v(lVar);
            objE = lVar;
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        ab0.g.d(jVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, s sVar, a aVar6, a aVar7, ab0.a.c cVar) {
        if (fr.t.c(cVar, ab0.a.c.C0099c.f5232a)) {
            aVar.a();
        } else if (fr.t.c(cVar, ab0.a.c.b.f5231a)) {
            aVar2.a();
        } else if (fr.t.c(cVar, ab0.a.c.C0098a.f5230a)) {
            aVar3.a();
        } else if (fr.t.c(cVar, ab0.a.c.f.f5235a)) {
            aVar4.a();
        } else if (fr.t.c(cVar, ab0.a.c.d.f5233a)) {
            aVar5.a();
        } else if (cVar instanceof ab0.a.c.ShowDialog) {
            s.l(sVar, e.f143856a, ((ab0.a.c.ShowDialog) cVar).getData(), null, 4, null);
        } else if (fr.t.c(cVar, ab0.a.c.h.f5237a)) {
            aVar6.a();
        } else {
            if (!fr.t.c(cVar, ab0.a.c.g.f5236a)) {
                throw new oq.p();
            }
            aVar7.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1158209292, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardInnerNavContent.<anonymous>.<anonymous>.<anonymous> (DashboardInnerNavContent.kt:143)");
        }
        e eVar = e.f143856a;
        f00.r.r(wVar, eVar, sVar.g(eVar), m.d(788781951, true, new q() { // from class: oa0.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.w(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(788781951, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardInnerNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardInnerNavContent.kt:148)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: oa0.j
                @Override // er.l
                public final Object b(Object obj) {
                    return t.x(sVar, (cb4.f.a) obj);
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
    public static final i0 x(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(l lVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, er.l lVar2, er.l lVar3, p pVar, er.l lVar4, er.l lVar5, er.l lVar6, er.l lVar7, er.l lVar8, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, int i15, int i16, int i17, r rVar, int i18) {
        m(lVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, lVar2, lVar3, pVar, lVar4, lVar5, lVar6, lVar7, lVar8, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, rVar, g4.a(i15 | 1), g4.a(i16), g4.a(i17));
        return i0.f148189a;
    }
}
