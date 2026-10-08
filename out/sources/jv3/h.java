package jv3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Ljv3/d;", "viewModel", "Loq/i0;", "g", "(Ljv3/d;Lm2/r;I)V", "Ljv3/d$a$b;", "data", "d", "(Ljv3/d$a$b;Lm2/r;I)V", "Ljv3/d$a;", "documentdownloadloader_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void d(final d.a.Loader loader, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1164533228);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(loader) : rVarH.G(loader) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1164533228, i16, -1, "pl.gov.coi.mobywatel.segment.documentdownloadloader.presentation.DocumentDownloadLoaderContent (DocumentDownloadLoaderScreen.kt:42)");
            }
            i50.s.r(loader.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-26417639, true, new er.q() { // from class: jv3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.e(loader, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, loader.f(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jv3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(loader, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d.a.Loader loader, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-26417639, i16, -1, "pl.gov.coi.mobywatel.segment.documentdownloadloader.presentation.DocumentDownloadLoaderContent.<anonymous> (DocumentDownloadLoaderScreen.kt:47)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.m mVarE = androidx.compose.foundation.layout.d.E(mVarD, companion2.e(), false, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), companion2.g(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarE);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, loader.getShowTakesTooLong() ? loader.getDocumentDownloadingTakeTooLong() : loader.getDocumentDownloading(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).a(), null, Float.valueOf(-1.0f), false, false, null, rVar, 0, 0, 0, 30932987);
            p076m2.r rVar2 = rVar;
            if (loader.getShowTakesTooLong()) {
                rVar2.X(1366435535);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing400()), rVar2, 0);
                j70.h.g(null, null, loader.getInterruptProcessPossibility(), null, null, aVar.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing400()), rVar2, 0);
                h30.q.p(loader.getInterruptButtonData(), false, null, rVar2, 0, 6);
            } else {
                rVar2.X(1363920691);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(d.a.Loader loader, int i15, p076m2.r rVar, int i16) {
        d(loader, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1913989190);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1913989190, i16, -1, "pl.gov.coi.mobywatel.segment.documentdownloadloader.presentation.DocumentDownloadLoaderScreen (DocumentDownloadLoaderScreen.kt:29)");
            }
            d.a aVarH = h(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarH, d.a.C2518a.f106108a)) {
                rVarH.X(-333633779);
                rVarH.R();
            } else {
                if (!(aVarH instanceof d.a.Loader)) {
                    rVarH.X(1097613849);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1097618774);
                d((d.a.Loader) aVarH, rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jv3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a h(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar, int i15, p076m2.r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
