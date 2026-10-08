package p031db0;

import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import mu.g;
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
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: db0.k, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0081\u0001\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function1;", "", "openStudentCard", "openDrivingLicence", "openFamilyCard", "openUutCard", "openDisabledPersonID", "f", "(Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Lm2/r;I)V", "documentloader_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void f(final a<i0> aVar, final l<? super String, i0> lVar, final l<? super String, i0> lVar2, final l<? super String, i0> lVar3, final l<? super String, i0> lVar4, final l<? super String, i0> lVar5, r rVar, final int i15) {
        int i16;
        l<? super String, i0> lVar6;
        r rVarH = rVar.h(466057476);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(lVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(lVar4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            lVar6 = lVar5;
            i16 |= rVarH.G(lVar6) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            lVar6 = lVar5;
        }
        if (rVarH.r((i16 & 74899) != 74898, i16 & 1)) {
            if (t.k()) {
                t.o(466057476, i16, -1, "pl.gov.coi.mjunior.feature.documentloader.presentation.DocumentLoaderNavContent (DocumentLoaderNavContent.kt:20)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            c cVar = c.f40603a;
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32) | ((i16 & 896) == 256) | ((i16 & 7168) == 2048) | ((57344 & i16) == 16384) | ((i16 & 458752) == 131072);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                final l<? super String, i0> lVar7 = lVar6;
                l lVar8 = new l() { // from class: db0.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.g(sVarJ, aVar, lVar, lVar2, lVar3, lVar4, lVar7, (d1) obj);
                    }
                };
                rVarH.v(lVar8);
                objE = lVar8;
            }
            d0.j(sVarJ, cVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: db0.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, lVar, lVar2, lVar3, lVar4, lVar5, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final s sVar, final a aVar, final l lVar, final l lVar2, final l lVar3, final l lVar4, final l lVar5, d1 d1Var) {
        f00.r.u(d1Var, c.f40603a, null, m.b(-140793885, true, new er.r() { // from class: db0.f
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h(sVar, aVar, lVar, lVar2, lVar3, lVar4, lVar5, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(s sVar, final a aVar, final l lVar, final l lVar2, final l lVar3, final l lVar4, final l lVar5, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-140793885, i15, -1, "pl.gov.coi.mjunior.feature.documentloader.presentation.DocumentLoaderNavContent.<anonymous>.<anonymous>.<anonymous> (DocumentLoaderNavContent.kt:27)");
        }
        f00.r.o(wVar, q0.c(eb0.p.class), sVar.g(e.f40607a), m.d(726069844, true, new q() { // from class: db0.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.i(aVar, lVar, lVar2, lVar3, lVar4, lVar5, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), b.f40601a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final a aVar, final l lVar, final l lVar2, final l lVar3, final l lVar4, final l lVar5, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(726069844, i15, -1, "pl.gov.coi.mjunior.feature.documentloader.presentation.DocumentLoaderNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentLoaderNavContent.kt:33)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.W(lVar2) | rVar.W(lVar3) | rVar.W(lVar4) | rVar.W(lVar5);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            l lVar6 = new l() { // from class: db0.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, lVar, lVar2, lVar3, lVar4, lVar5, (eb0.a.c) obj);
                }
            };
            rVar.v(lVar6);
            objE = lVar6;
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, eb0.a.c cVar) {
        if (fr.t.c(cVar, eb0.a.c.C1154a.f49094a)) {
            aVar.a();
        } else if (cVar instanceof eb0.a.c.OpenSchoolCard) {
            lVar.b(((eb0.a.c.OpenSchoolCard) cVar).getId());
        } else if (cVar instanceof eb0.a.c.OpenDrivingLicence) {
            lVar2.b(((eb0.a.c.OpenDrivingLicence) cVar).getId());
        } else if (cVar instanceof eb0.a.c.OpenFamilyCard) {
            lVar3.b(((eb0.a.c.OpenFamilyCard) cVar).getId());
        } else if (cVar instanceof eb0.a.c.OpenUutCard) {
            lVar4.b(((eb0.a.c.OpenUutCard) cVar).getId());
        } else {
            if (!(cVar instanceof eb0.a.c.OpenDisabledPersonID)) {
                throw new oq.p();
            }
            lVar5.b(((eb0.a.c.OpenDisabledPersonID) cVar).getId());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(a aVar, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i15, r rVar, int i16) {
        f(aVar, lVar, lVar2, lVar3, lVar4, lVar5, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
