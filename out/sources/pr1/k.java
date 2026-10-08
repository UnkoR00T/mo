package pr1;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;
import t50.TextAreaData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lpr1/e;", "viewModel", "Loq/i0;", "e", "(Lpr1/e;Lm2/r;I)V", "Lpr1/e$a;", "data", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void e(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-2110569244);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2110569244, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.parser.DeveloperParserScreen (DeveloperParserScreen.kt:34)");
            }
            final f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            rVar2 = rVarH;
            i50.s.r(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), f(f6VarC).b()), f(f6VarC).getTitle(), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(872640081, true, new er.q() { // from class: pr1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.g(f6VarC, context, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pr1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data f(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f6 f6Var, final Context context, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(872640081, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.parser.DeveloperParserScreen.<anonymous> (DeveloperParserScreen.kt:49)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label labelB = mx.b.b("Markdown:", "");
            Label labelB2 = mx.b.b("Wprowadz tekst Markdown", "");
            t50.r.m(new TextAreaData(null, labelB, new t50.s.Fix(3), null, new t50.e.Default(null, 1, null), f(f6Var).getInputContent(), false, t50.a.C4878a.f187691a, labelB2, v4.t.INSTANCE.a(), null, null, f(f6Var).c(), null, 11337, null), null, rVar, TextAreaData.f187694o, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, mx.b.b("Output:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            Spanned text = f(f6Var).getText();
            if (text == null) {
                rVar.X(-378530142);
                rVar.R();
            } else {
                rVar.X(-378530141);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
                j70.h.g(null, null, mx.b.b("CustomClickableText:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
                q4.e eVarN = u10.i.n(text, null, rVar, 0, 1);
                TextStyle textStyleC = aVar.f(rVar, i17).c();
                boolean zG = rVar.G(context);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: pr1.g
                        @Override // er.l
                        public final Object b(Object obj) {
                            return k.h(context, (String) obj);
                        }
                    };
                    rVar.v(objE);
                }
                b40.g.g(eVarN, textStyleC, false, 0, 0, null, null, (er.l) objE, rVar, 0, 124);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
                j70.h.g(null, null, mx.b.b("CustomText: (for talkback testing)", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
                boolean zG2 = rVar.G(context);
                Object objE2 = rVar.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: pr1.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return k.i(context, (String) obj);
                        }
                    };
                    rVar.v(objE2);
                }
                j70.h.g(null, null, null, null, u10.i.n(text, (er.l) objE2, rVar, 0, 0), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).c(), null, null, false, false, null, rVar, 0, 0, 0, 33030127);
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Context context, String str) {
        t70.s.M(context, "Clicked: " + str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Context context, String str) {
        t70.s.M(context, "Clicked: " + str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(e eVar, int i15, p076m2.r rVar, int i16) {
        e(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
