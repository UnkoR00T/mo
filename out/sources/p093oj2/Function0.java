package p093oj2;

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
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import pj2.c0;
import q7.b;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: oj2.g, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "e", "(Ler/a;Lm2/r;I)V", "legalinformation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void e(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1680240994);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1680240994, i16, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.LegalInformationNavContent (LegalInformationNavContent.kt:15)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            a.C3638a c3638a = a.C3638a.f146358a;
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: oj2.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.f(aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, c3638a, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: oj2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.i(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final a aVar, d1 d1Var) {
        f00.r.u(d1Var, a.C3638a.f146358a, null, m.b(1764242493, true, new er.r() { // from class: oj2.e
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g(aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1764242493, i15, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.LegalInformationNavContent.<anonymous>.<anonymous>.<anonymous> (LegalInformationNavContent.kt:22)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        c0 c0Var = (c0) d.c(q0.c(c0.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<pj2.t.c> bVarY1 = c0Var.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: oj2.f
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.h(aVar, (pj2.t.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        pj2.s.t(c0Var, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a aVar, pj2.t.c cVar) {
        if (!fr.t.c(cVar, pj2.t.c.a.f158015a)) {
            throw new oq.p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(a aVar, int i15, r rVar, int i16) {
        e(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
