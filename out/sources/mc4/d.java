package mc4;

import d1.a3;
import d1.c4;
import d1.f4;
import d1.g4;
import d1.v4;
import d1.x;
import er.p;
import f3.j;
import k70.Dimensions;
import k70.h;
import k70.k;
import k70.n;
import k70.q;
import l70.e;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.h0;
import w0.i;
import y2.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "isDarkTheme", "Lkotlin/Function0;", "Loq/i0;", "content", "d", "(ZLer/p;Lm2/r;II)V", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(boolean z15, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        final boolean zA;
        int i17;
        r rVarH = rVar.h(1329555696);
        if ((i15 & 6) == 0) {
            if ((i16 & 1) == 0) {
                zA = z15;
                int i18 = rVarH.a(zA) ? 4 : 2;
                i17 = i18 | i15;
            } else {
                zA = z15;
            }
            i17 = i18 | i15;
        } else {
            zA = z15;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 1) != 0) {
                    i17 &= -15;
                }
            } else if ((i16 & 1) != 0) {
                zA = h0.a(rVarH, 0);
                i17 &= -15;
            }
            rVarH.y();
            if (t.k()) {
                t.o(1329555696, i17, -1, "pl.gov.mc.fringers.mobywatel.config.theme.MObywatelAppTheme (MObywatelAppTheme.kt:31)");
            }
            c4.Companion companion = c4.INSTANCE;
            final c4 c4VarI = f4.i(v4.d(companion, rVarH, 6), v4.c(companion, rVarH, 6));
            p076m2.c4<l70.c> c4VarD = e.c().d(nc4.b.a(zA));
            b4<Dimensions> b4VarC = k70.e.c();
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            d0.d(new p076m2.c4[]{c4VarD, b4VarC.d(aVar.b(rVarH, i19)), h.c().d(aVar.c(rVarH, i19)), n.c().d(aVar.e(rVarH, i19)), q.c().d(aVar.f(rVarH, i19)), k.c().d(aVar.d(rVarH, i19))}, m.d(-1775670224, true, new p() { // from class: mc4.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.e(zA, c4VarI, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, p076m2.c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: mc4.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(zA, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(boolean z15, final c4 c4Var, final p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1775670224, i15, -1, "pl.gov.mc.fringers.mobywatel.config.theme.MObywatelAppTheme.<anonymous> (MObywatelAppTheme.kt:43)");
            }
            j20.b.f98651a.b(z15, m.d(1961817180, true, new p() { // from class: mc4.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.f(c4Var, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, (j20.b.f98652b << 6) | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c4 c4Var, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1961817180, i15, -1, "pl.gov.mc.fringers.mobywatel.config.theme.MObywatelAppTheme.<anonymous>.<anonymous> (MObywatelAppTheme.kt:44)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarD = i.d(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion aVar = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, aVar.d());
            n6.i(rVarC, e0VarT, aVar.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), aVar.c());
            n6.g(rVarC, aVar.a());
            n6.i(rVarC, mVarE, aVar.e());
            x xVar = x.f39368a;
            f3.m mVarA = g4.a(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), f4.f(c4Var, rVar, 0)), c4Var);
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = j.e(rVar, mVarA);
            er.a<androidx.compose.ui.node.c> aVarB2 = aVar.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarI2, aVar.d());
            n6.i(rVarC2, e0VarT2, aVar.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), aVar.c());
            n6.g(rVarC2, aVar.a());
            n6.i(rVarC2, mVarE2, aVar.e());
            pVar.B(rVar, 0);
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(boolean z15, p pVar, int i15, int i16, r rVar, int i17) {
        d(z15, pVar, rVar, p076m2.g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
