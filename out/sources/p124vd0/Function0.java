package p124vd0;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import cb4.DialogData;
import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import oq.i0;
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
import wd0.e;
import wd0.u;
import y2.m;

/* JADX INFO: renamed from: vd0.g, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Lcb4/d;", "closeWithDialog", "e", "(Ler/a;Ler/l;Lm2/r;I)V", "setpin_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void e(final a<i0> aVar, final l<? super DialogData, i0> lVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(609160083);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(609160083, i16, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.resetpin.ResetPinNavContent (ResetPinNavContent.kt:17)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a aVar2 = a.f206237a;
            boolean z15 = ((i16 & 14) == 4) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: vd0.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.f(aVar, lVar, (d1) obj);
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
            d5VarM.a(new p() { // from class: vd0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.i(aVar, lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final a aVar, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, a.f206237a, null, m.b(-1242002190, true, new er.r() { // from class: vd0.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g(aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1242002190, i15, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.resetpin.ResetPinNavContent.<anonymous>.<anonymous>.<anonymous> (ResetPinNavContent.kt:26)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        u uVar = (u) d.c(q0.c(u.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<wd0.f.c> bVarY1 = uVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vd0.f
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.h(aVar, lVar, (wd0.f.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        e.h(uVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a aVar, l lVar, wd0.f.c cVar) {
        if (fr.t.c(cVar, wd0.f.c.a.f212241a)) {
            aVar.a();
        } else {
            if (!(cVar instanceof wd0.f.c.CloseWithDialog)) {
                throw new oq.p();
            }
            lVar.b(((wd0.f.c.CloseWithDialog) cVar).getDialog());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(a aVar, l lVar, int i15, r rVar, int i16) {
        e(aVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
