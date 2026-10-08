package p092oa0;

import aa0.AddDocumentsEntryData;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import cf0.c;
import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
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
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.d;
import qa0.g;
import va0.i;
import y2.m;

/* JADX INFO: renamed from: oa0.c0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aù\u0002\u0010\u001e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClose", "goToLogin", "goToAboutApp", "goToResetPin", "onDeactivate", "onChangeTheme", "goToActivation", "goToInfoPage", "Lkotlin/Function1;", "Ljb4/b;", "goToError", "", "goToSchoolCard", "Lkotlin/Function2;", "Lcf0/c;", "goToDocumentLoader", "Laa0/a;", "goToAddDocument", "goToDrivingLicence", "goToFamilyCard", "goToUutCard", "goToDisabledPersonID", "goToGrades", "goToAttendance", "goToTimetable", "goToBehavior", "goToNotificationsHistory", "goToNotificationsSettings", "i", "(Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/p;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Lm2/r;III)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void i(final a<i0> aVar, final a<i0> aVar2, final a<i0> aVar3, final a<i0> aVar4, final a<i0> aVar5, final a<i0> aVar6, final a<i0> aVar7, final a<i0> aVar8, final l<? super b, i0> lVar, final l<? super String, i0> lVar2, final p<? super String, ? super c, i0> pVar, final l<? super AddDocumentsEntryData, i0> lVar3, final l<? super String, i0> lVar4, final l<? super String, i0> lVar5, final l<? super String, i0> lVar6, final l<? super String, i0> lVar7, final a<i0> aVar9, final a<i0> aVar10, final a<i0> aVar11, final a<i0> aVar12, final a<i0> aVar13, final a<i0> aVar14, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        a<i0> aVar15;
        a<i0> aVar16;
        int i19;
        int i25;
        s sVar;
        r rVarH = rVar.h(1254773282);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar15 = aVar3;
            i18 |= rVarH.G(aVar15) ? 256 : 128;
        } else {
            aVar15 = aVar3;
        }
        if ((i15 & 3072) == 0) {
            aVar16 = aVar4;
            i18 |= rVarH.G(aVar16) ? 2048 : 1024;
        } else {
            aVar16 = aVar4;
        }
        if ((i15 & 24576) == 0) {
            i18 |= rVarH.G(aVar5) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i15 & 196608) == 0) {
            i18 |= rVarH.G(aVar6) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i18 |= rVarH.G(aVar7) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= rVarH.G(aVar8) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= rVarH.G(lVar) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i18 |= rVarH.G(lVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i19 = i16 | (rVarH.G(pVar) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= rVarH.G(lVar3) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i19 |= rVarH.G(lVar4) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i19 |= rVarH.G(lVar5) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i19 |= rVarH.G(lVar6) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i16 & 196608) == 0) {
            i19 |= rVarH.G(lVar7) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i16 & 1572864) == 0) {
            i19 |= rVarH.G(aVar9) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i16 & 12582912) == 0) {
            i19 |= rVarH.G(aVar10) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i19 |= rVarH.G(aVar11) ? 67108864 : 33554432;
        }
        if ((i16 & 805306368) == 0) {
            i19 |= rVarH.G(aVar12) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i26 = i19;
        if ((i17 & 6) == 0) {
            i25 = i17 | (rVarH.G(aVar13) ? 4 : 2);
        } else {
            i25 = i17;
        }
        if ((i17 & 48) == 0) {
            i25 |= rVarH.G(aVar14) ? 32 : 16;
        }
        if (rVarH.r(((i18 & 306783379) == 306783378 && (306783379 & i26) == 306783378 && (i25 & 19) == 18) ? false : true, i18 & 1)) {
            if (t.k()) {
                t.o(1254773282, i18, i26, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardNavContent (DashboardNavContent.kt:42)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            b bVar = b.f143849a;
            int i27 = i18;
            boolean zG = ((i26 & 1879048192) == 536870912) | ((i18 & 7168) == 2048) | ((i18 & 14) == 4) | ((57344 & i18) == 16384) | ((i18 & 112) == 32) | ((458752 & i18) == 131072) | ((i18 & 896) == 256) | ((i27 & 3670016) == 1048576) | ((i27 & 29360128) == 8388608) | ((i27 & 234881024) == 67108864) | ((i27 & 1879048192) == 536870912) | ((i26 & 14) == 4) | ((i26 & 112) == 32) | ((i26 & 896) == 256) | ((i26 & 7168) == 2048) | ((57344 & i26) == 16384) | ((458752 & i26) == 131072) | ((3670016 & i26) == 1048576) | ((29360128 & i26) == 8388608) | ((234881024 & i26) == 67108864) | ((i25 & 14) == 4) | ((i25 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                final a<i0> aVar17 = aVar15;
                final a<i0> aVar18 = aVar16;
                l lVar8 = new l() { // from class: oa0.u
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.j(aVar, aVar5, aVar2, aVar6, aVar17, aVar18, aVar7, aVar8, lVar, lVar2, pVar, lVar3, lVar4, lVar5, lVar6, lVar7, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, sVarJ, (d1) obj);
                    }
                };
                sVar = sVarJ;
                rVarH.v(lVar8);
                objE = lVar8;
            } else {
                sVar = sVarJ;
            }
            d0.j(sVar, bVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: oa0.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.q(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, lVar, lVar2, pVar, lVar3, lVar4, lVar5, lVar6, lVar7, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final a aVar, final a aVar2, final a aVar3, final a aVar4, final a aVar5, final a aVar6, final a aVar7, final a aVar8, final l lVar, final l lVar2, final p pVar, final l lVar3, final l lVar4, final l lVar5, final l lVar6, final l lVar7, final a aVar9, final a aVar10, final a aVar11, final a aVar12, final a aVar13, final a aVar14, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, b.f143849a, null, m.b(54185251, true, new er.r() { // from class: oa0.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, lVar, lVar2, pVar, lVar3, lVar4, lVar5, lVar6, lVar7, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, sVar, (f) obj, (p136y9.w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.f143824a, null, m.b(-262673972, true, new er.r() { // from class: oa0.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.o(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final a aVar, final a aVar2, final a aVar3, final a aVar4, final a aVar5, final a aVar6, final a aVar7, final a aVar8, final l lVar, final l lVar2, final p pVar, final l lVar3, final l lVar4, final l lVar5, final l lVar6, final l lVar7, final a aVar9, final a aVar10, final a aVar11, final a aVar12, final a aVar13, final a aVar14, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(54185251, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardNavContent.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:49)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final va0.l lVar8 = (va0.l) d.c(q0.c(va0.l.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<va0.a.b> bVarY1 = lVar8.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: oa0.z
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l(aVar, aVar2, aVar3, (va0.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        i.f(lVar8, m.d(980098416, true, new p() { // from class: oa0.a0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.m(lVar8, aVar3, aVar2, aVar4, aVar5, aVar6, aVar7, aVar8, lVar, lVar2, pVar, lVar3, lVar4, lVar5, lVar6, lVar7, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, sVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(a aVar, a aVar2, a aVar3, va0.a.b bVar) {
        if (fr.t.c(bVar, va0.a.b.C5366a.f205644a)) {
            aVar.a();
        } else if (fr.t.c(bVar, va0.a.b.C5367b.f205645a)) {
            aVar2.a();
        } else {
            if (!fr.t.c(bVar, va0.a.b.c.f205646a)) {
                throw new oq.p();
            }
            aVar3.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(va0.l lVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, l lVar2, l lVar3, p pVar, l lVar4, l lVar5, l lVar6, l lVar7, l lVar8, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, final s sVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(980098416, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:62)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: oa0.b0
                    @Override // er.a
                    public final Object a() {
                        return Function0.n(sVar);
                    }
                };
                rVar.v(objE);
            }
            t.m(lVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, lVar2, lVar3, pVar, lVar4, lVar5, lVar6, lVar7, lVar8, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, (a) objE, rVar, 0, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(s sVar) {
        s.i(sVar, a.f143824a, null, null, 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-262673972, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.DashboardNavContent.<anonymous>.<anonymous>.<anonymous> (DashboardNavContent.kt:91)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        qa0.l lVar = (qa0.l) d.c(q0.c(qa0.l.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<qa0.a.e> bVarY1 = lVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: oa0.y
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.p(sVar, (qa0.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        g.h(lVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(s sVar, qa0.a.e eVar) {
        if (!fr.t.c(eVar, qa0.a.e.C4133a.f165569a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, l lVar, l lVar2, p pVar, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, int i15, int i16, int i17, r rVar, int i18) {
        i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, lVar, lVar2, pVar, lVar3, lVar4, lVar5, lVar6, lVar7, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, rVar, g4.a(i15 | 1), g4.a(i16), g4.a(i17));
        return i0.f148189a;
    }
}
