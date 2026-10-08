package p102pb0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cf0.c;
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
import pe0.VerificationDocumentData;
import q7.d;
import qb0.l0;
import qb0.y;
import xw.b;
import y2.m;

/* JADX INFO: renamed from: pb0.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function2;", "", "Lcf0/c;", "goToDocumentLoader", "Lkotlin/Function1;", "Lpe0/d;", "goToVerification", "f", "(Ler/a;Ler/p;Ler/l;Lm2/r;I)V", "dynamicdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void f(final a<i0> aVar, final p<? super String, ? super c, i0> pVar, final l<? super VerificationDocumentData, i0> lVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1443686726);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-1443686726, i16, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.DynamicDocumentNavContent (DynamicDocumentNavContent.kt:19)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a aVar2 = a.f154032a;
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32) | ((i16 & 896) == 256);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: pb0.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.g(sVarJ, aVar, pVar, lVar, (d1) obj);
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
            d5VarM.a(new p() { // from class: pb0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, pVar, lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final s sVar, final a aVar, final p pVar, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, a.f154032a, null, m.b(-193028293, true, new er.r() { // from class: pb0.c
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h(sVar, aVar, pVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final s sVar, final a aVar, final p pVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-193028293, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.DynamicDocumentNavContent.<anonymous>.<anonymous>.<anonymous> (DynamicDocumentNavContent.kt:27)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: pb0.d
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i(sVar, (l0.a) obj);
                }
            };
            rVar.v(objE);
        }
        l0 l0Var = (l0) d.c(q0.c(l0.class), wVar, null, i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w()), kq.a.b(wVar.x(), (l) objE), rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        b<qb0.f> bVarY1 = l0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(pVar) | rVar.W(lVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: pb0.e
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, pVar, lVar, (qb0.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, b.f221619c);
        y.i(l0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 i(s sVar, l0.a aVar) {
        return aVar.a(new l0.a.SetupData((String) sVar.g(b.f154034a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, p pVar, l lVar, qb0.f fVar) {
        if (fr.t.c(fVar, qb0.f.a.f165709a)) {
            aVar.a();
        } else if (fVar instanceof qb0.f.ShowDocumentLoader) {
            qb0.f.ShowDocumentLoader showDocumentLoader = (qb0.f.ShowDocumentLoader) fVar;
            pVar.B(showDocumentLoader.getId(), showDocumentLoader.getType());
        } else {
            if (!(fVar instanceof qb0.f.GoToVerification)) {
                throw new oq.p();
            }
            lVar.b(((qb0.f.GoToVerification) fVar).getDocumentData());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(a aVar, p pVar, l lVar, int i15, r rVar, int i16) {
        f(aVar, pVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
