package lq3;

import d1.e0;
import d1.i0;
import d1.r3;
import i30.ButtonIconData;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;
import q4.TextStyle;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Llq3/g;", "viewModel", "Loq/i0;", "j", "(Llq3/g;Lm2/r;I)V", "Llq3/g$a;", "screenData", "g", "(Llq3/g$a;Lm2/r;I)V", "Llq3/g$b;", "data", "e", "(Llq3/g$b;Lm2/r;I)V", "state", "voteidea_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void e(final g.IconPageContentData iconPageContentData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1196525050);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(iconPageContentData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1196525050, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votesucces.VoteSuccessDescription (VoteSuccessScreen.kt:56)");
            }
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), bVarG, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            Label firstMessage = iconPageContentData.getFirstMessage();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleB = aVar.f(rVarH, i17).b();
            long jB = aVar.a(rVarH, i17).getNeutral().b();
            b5.j.Companion companion3 = b5.j.INSTANCE;
            rVar2 = rVarH;
            j70.h.g(null, null, firstMessage, null, null, jB, 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, textStyleB, null, null, false, false, null, rVar2, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, iconPageContentData.getSecondMessage(), null, null, aVar.a(rVar2, i17).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, iconPageContentData.getThirdMessage(), null, null, aVar.a(rVar2, i17).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33026011);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lq3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.f(iconPageContentData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(g.IconPageContentData iconPageContentData, int i15, p076m2.r rVar, int i16) {
        e(iconPageContentData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1319053695);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1319053695, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votesucces.VoteSuccessInitialized (VoteSuccessScreen.kt:32)");
            }
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            int i17 = i16;
            rVar2 = rVarH;
            p70.n.g(null, null, Label.INSTANCE.c(), null, null, 0L, null, data.getCloseButtonData(), rVar2, ButtonIconData.f88935g << 21, 123);
            IconPageData<g.IconPageContentData, IconPageBottomContentData> iconPageDataB = data.b();
            c cVar = c.f119627a;
            q40.i.b(iconPageDataB, cVar.d(), cVar.c(), rVar2, IconPageData.f164667h | IconPageBottomContentData.f164663d | 432, 0);
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVar2.G(data));
            Object objE = rVar2.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: lq3.i
                    @Override // er.a
                    public final Object a() {
                        return l.h(data);
                    }
                };
                rVar2.v(objE);
            }
            q0.g(false, (er.a) objE, rVar2, 0, 1);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lq3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(g.Data data) {
        data.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(g.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-230547017);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-230547017, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.votesucces.VoteSuccessScreen (VoteSuccessScreen.kt:26)");
            }
            g(k(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, IconPageData.f164667h | IconPageBottomContentData.f164663d | ButtonIconData.f88935g);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lq3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data k(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(g gVar, int i15, p076m2.r rVar, int i16) {
        j(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
