package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import b11.b0;
import b11.n;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import gx.b;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.d;
import tw.c;
import y2.m;

/* JADX INFO: renamed from: a11.j, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@p071kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "La11/a;", "startDestination", "Leo2/a;", "confirmationData", "Lkotlin/Function1;", "Lgx/b;", "navigateToGlobalDestination", "i", "(Ler/a;La11/a;Leo2/a;Ler/l;Lm2/r;I)V", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void i(final a<i0> aVar, final a aVar2, final eo2.a aVar3, final l<? super b, i0> lVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-486988731);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-486988731, i16, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.AuthConfirmationNavContent (AuthConfirmationNavContent.kt:24)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            boolean zG = rVarH.G(aVar3) | ((i16 & 14) == 4) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: a11.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.j(sVarJ, aVar3, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, aVar2, (l) objE, rVarH, (i16 & 112) | s.f54562e);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a11.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.q(aVar, aVar2, aVar3, lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final s sVar, final eo2.a aVar, final a aVar2, d1 d1Var) {
        f00.r.u(d1Var, a.C0011a.f1230a, null, m.b(458927942, true, new er.r() { // from class: a11.d
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k(aVar, aVar2, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.c.f1235a, null, m.b(1714117615, true, new er.r() { // from class: a11.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.n(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        c.c(d1Var, a.b.f1233a, sVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final eo2.a aVar, final a aVar2, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(458927942, i15, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.AuthConfirmationNavContent.<anonymous>.<anonymous>.<anonymous> (AuthConfirmationNavContent.kt:32)");
        }
        boolean zG = rVar.G(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: a11.f
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.l(aVar, (b0.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (l) objE);
        b0 b0Var = (b0) d.c(q0.c(b0.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<n.f> bVarY1 = b0Var.Y1();
        boolean zW = rVar.W(aVar2) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: a11.g
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.m(aVar2, sVar, (n.f) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, xw.b.f221619c);
        b11.m.w(b0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 l(eo2.a aVar, b0.a aVar2) {
        return aVar2.a(new b0.a.SetupData(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(a aVar, s sVar, n.f fVar) {
        if (fr.t.c(fVar, n.f.a.f16040a)) {
            aVar.a();
        } else if (fVar instanceof n.f.Error) {
            s.i(sVar, a.c.f1235a, ((n.f.Error) fVar).getErrorData(), null, 4, null);
        } else {
            if (!(fVar instanceof n.f.ShowNavigationDialog)) {
                throw new oq.p();
            }
            s.i(sVar, a.b.f1233a, ((n.f.ShowNavigationDialog) fVar).getNavigationDialogModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1714117615, i15, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.AuthConfirmationNavContent.<anonymous>.<anonymous>.<anonymous> (AuthConfirmationNavContent.kt:61)");
        }
        a.c cVar = a.c.f1235a;
        f00.r.D(wVar, cVar, sVar.e(cVar), m.d(2120937200, true, new q() { // from class: a11.h
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.o(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2120937200, i15, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.AuthConfirmationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AuthConfirmationNavContent.kt:65)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: a11.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.p(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(a aVar, a aVar2, eo2.a aVar3, l lVar, int i15, r rVar, int i16) {
        i(aVar, aVar2, aVar3, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
