package p111sd0;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
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
import p7.CreationExtras;
import q7.b;
import q7.d;
import td0.n;
import y2.m;

/* JADX INFO: renamed from: sd0.g, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "goToActivation", "goToSplashScreen", "navResult", "e", "(Ler/a;Ler/a;Ler/a;Lm2/r;I)V", "setpin_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void e(final a<i0> aVar, final a<i0> aVar2, final a<i0> aVar3, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-51789433);
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
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-51789433, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.onboarding.OnboardingPinNavContent (OnboardingPinNavContent.kt:17)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a aVar4 = a.f180265a;
            boolean z15 = ((i16 & 112) == 32) | ((i16 & 896) == 256) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: sd0.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.f(aVar3, aVar2, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, aVar4, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: sd0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.i(aVar, aVar2, aVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final a aVar, final a aVar2, final a aVar3, d1 d1Var) {
        f00.r.u(d1Var, a.f180265a, null, m.b(-2139856474, true, new er.r() { // from class: sd0.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g(aVar, aVar2, aVar3, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final a aVar, final a aVar2, final a aVar3, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2139856474, i15, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.onboarding.OnboardingPinNavContent.<anonymous>.<anonymous>.<anonymous> (OnboardingPinNavContent.kt:26)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        n nVar = (n) d.c(q0.c(n.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<td0.a.c> bVarY1 = nVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(aVar2) | rVar.W(aVar3);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: sd0.f
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.h(aVar, aVar2, aVar3, (td0.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        td0.h.h(nVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a aVar, a aVar2, a aVar3, td0.a.c cVar) {
        if (fr.t.c(cVar, td0.a.c.C4930a.f189649a)) {
            aVar.a();
        } else if (fr.t.c(cVar, td0.a.c.C4931c.f189651a)) {
            aVar2.a();
        } else {
            if (!fr.t.c(cVar, td0.a.c.b.f189650a)) {
                throw new oq.p();
            }
            aVar3.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(a aVar, a aVar2, a aVar3, int i15, r rVar, int i16) {
        e(aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
