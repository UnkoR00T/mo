package p123uw0;

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
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import ww0.AboutApplicationSetupData;
import xw.b;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: uw0.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "goToLegalInformation", "goToLicense", "navResult", "", "shouldShowKPOLogo", "f", "(Ler/a;Ler/a;Ler/a;ZLm2/r;I)V", "aboutapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void f(final a<i0> aVar, final a<i0> aVar2, final a<i0> aVar3, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1084086950);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
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
            i16 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(-1084086950, i16, -1, "pl.gov.coi.mobywatel.feature.aboutapplication.presentation.AboutApplicationNavContent (AboutApplicationNavContent.kt:19)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a.C5243a c5243a = a.C5243a.f201848a;
            boolean z16 = ((i16 & 14) == 4) | ((i16 & 896) == 256) | ((i16 & 7168) == 2048) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (z16 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: uw0.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.g(z15, aVar3, aVar, aVar2, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, c5243a, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: uw0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, aVar2, aVar3, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final boolean z15, final a aVar, final a aVar2, final a aVar3, d1 d1Var) {
        f00.r.u(d1Var, a.C5243a.f201848a, null, m.b(-761907591, true, new er.r() { // from class: uw0.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h(z15, aVar, aVar2, aVar3, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(boolean z15, final a aVar, final a aVar2, final a aVar3, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-761907591, i15, -1, "pl.gov.coi.mobywatel.feature.aboutapplication.presentation.AboutApplicationNavContent.<anonymous>.<anonymous>.<anonymous> (AboutApplicationNavContent.kt:26)");
        }
        f00.r.o(wVar, q0.c(xw0.m.class), new AboutApplicationSetupData(z15), m.d(-58905942, true, new q() { // from class: uw0.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.i(aVar, aVar2, aVar3, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f201871a.b(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final a aVar, final a aVar2, final a aVar3, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-58905942, i15, -1, "pl.gov.coi.mobywatel.feature.aboutapplication.presentation.AboutApplicationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutApplicationNavContent.kt:30)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: uw0.g
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, aVar2, aVar3, (xw0.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, a aVar2, a aVar3, xw0.d dVar) {
        if (fr.t.c(dVar, xw0.d.a.f221647a)) {
            aVar.a();
        } else if (fr.t.c(dVar, xw0.d.b.f221648a)) {
            aVar2.a();
        } else {
            if (!fr.t.c(dVar, xw0.d.c.f221649a)) {
                throw new oq.p();
            }
            aVar3.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(a aVar, a aVar2, a aVar3, boolean z15, int i15, r rVar, int i16) {
        f(aVar, aVar2, aVar3, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
