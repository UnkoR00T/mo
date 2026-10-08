package fx3;

import d1.a3;
import d1.d3;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import n3.l0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lfx3/c;", "viewModel", "Loq/i0;", "d", "(Lfx3/c;Lm2/r;I)V", "Lfx3/c$a$b;", "data", "g", "(Lfx3/c$a$b;Lm2/r;I)V", "Lfx3/c$a;", "state", "imagepreview_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void d(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1742451695);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1742451695, i16, -1, "pl.gov.coi.mobywatel.segment.imagepreview.presentation.ImagePreviewScreen (ImagePreviewScreen.kt:17)");
            }
            c.a aVarE = e(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarE, c.a.C1540a.f68700a)) {
                rVarH.X(-541160397);
                rVarH.R();
            } else {
                if (!(aVarE instanceof c.a.Initialized)) {
                    rVarH.X(-541162443);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-541158603);
                g((c.a.Initialized) aVarE, rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fx3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a e(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c cVar, int i15, r rVar, int i16) {
        d(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void g(final c.a.Initialized initialized, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(410687828);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(410687828, i16, -1, "pl.gov.coi.mobywatel.segment.imagepreview.presentation.ImagePreviewScreenContent (ImagePreviewScreen.kt:26)");
            }
            rVar2 = rVarH;
            s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(645467719, true, new q() { // from class: fx3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.h(initialized, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fx3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(initialized, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c.a.Initialized initialized, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(645467719, i16, -1, "pl.gov.coi.mobywatel.segment.imagepreview.presentation.ImagePreviewScreenContent.<anonymous> (ImagePreviewScreen.kt:28)");
            }
            i1.g(l0.c(initialized.getImage()), null, a3.p(a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null), null, null, 0.0f, null, 0, rVar, 48, 248);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.Initialized initialized, int i15, r rVar, int i16) {
        g(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
