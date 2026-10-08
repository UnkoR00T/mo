package p070ke0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import me0.VerificationUutCardData;
import ne0.c0;
import ne0.j;
import ne0.p0;
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
import q7.d;
import xw.b;
import y2.m;

/* JADX INFO: renamed from: ke0.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function1;", "Lme0/f;", "goToVerification", "", "goToDocumentLoader", "f", "(Ler/a;Ler/l;Ler/l;Lm2/r;I)V", "uutcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void f(final a<i0> aVar, final l<? super VerificationUutCardData, i0> lVar, final l<? super String, i0> lVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1903229891);
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
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-1903229891, i16, -1, "pl.gov.coi.mjunior.feature.uutcard.presentation.UutCardNavContent (UutCardNavContent.kt:18)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a aVar2 = a.f110244a;
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: ke0.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.g(sVarJ, aVar, lVar, lVar2, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, aVar2, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ke0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, lVar, lVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final s sVar, final a aVar, final l lVar, final l lVar2, d1 d1Var) {
        f00.r.u(d1Var, a.f110244a, null, m.b(1132773310, true, new er.r() { // from class: ke0.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h(sVar, aVar, lVar, lVar2, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final s sVar, final a aVar, final l lVar, final l lVar2, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1132773310, i15, -1, "pl.gov.coi.mjunior.feature.uutcard.presentation.UutCardNavContent.<anonymous>.<anonymous>.<anonymous> (UutCardNavContent.kt:25)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ke0.d
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i(sVar, (p0.a) obj);
                }
            };
            rVar.v(objE);
        }
        p0 p0Var = (p0) d.c(q0.c(p0.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        b<j> bVarY1 = p0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar) | rVar.W(lVar2);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: ke0.e
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, lVar, lVar2, (j) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, b.f221619c);
        c0.y(p0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 i(s sVar, p0.a aVar) {
        return aVar.a(new p0.a.SetupData((String) sVar.g(b.f110246a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, l lVar, l lVar2, j jVar) {
        if (fr.t.c(jVar, j.a.f134890a)) {
            aVar.a();
        } else if (jVar instanceof j.GoToVerification) {
            lVar.b(((j.GoToVerification) jVar).getDocumentData());
        } else {
            if (!(jVar instanceof j.ShowDocumentLoader)) {
                throw new oq.p();
            }
            lVar2.b(((j.ShowDocumentLoader) jVar).getId());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(a aVar, l lVar, l lVar2, int i15, r rVar, int i16) {
        f(aVar, lVar, lVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
