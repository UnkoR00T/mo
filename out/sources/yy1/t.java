package yy1;

import d1.a3;
import d1.d3;
import d1.i0;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.io.IOException;
import java.util.Iterator;
import mx.Label;
import n30.CardListData;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;
import zy1.Displayed;
import zy1.FindOutMoreData;
import zy1.FindOutMoreSectionData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lyy1/c;", "viewModel", "Loq/i0;", "o", "(Lyy1/c;Lm2/r;I)V", "Lyy1/c$a;", "screenData", "r", "(Lyy1/c$a;Lm2/r;I)V", "Lyy1/e;", "data", "l", "(Lyy1/e;Lm2/r;I)V", "Lyy1/d;", "t", "(Lyy1/d;Lm2/r;I)V", "Lzy1/c;", "j", "(Lzy1/c;Lm2/r;I)V", "electoralregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    public static final void j(final FindOutMoreData findOutMoreData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-244092847);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(findOutMoreData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i17 = 0;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-244092847, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.BottomSheetContent (ElectoralRegisterScreen.kt:128)");
            }
            char c15 = 3;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.C(f3.m.INSTANCE, null, false, 3, null), 0.0f, 1, null), null, rVarH, 6, 1);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarS, 0.0f, aVar.b(rVarH, i18).getSpacing100(), 0.0f, aVar.b(rVarH, i18).getSpacing200(), 5, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.d(), f3.c.INSTANCE.k(), rVarH, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
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
            rVarH.X(247430667);
            Iterator it = findOutMoreData.a().iterator();
            while (it.hasNext()) {
                FindOutMoreSectionData findOutMoreSectionData = (FindOutMoreSectionData) it.next();
                Label title = findOutMoreSectionData.getTitle();
                k70.a aVar2 = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                p076m2.r rVar2 = rVarH;
                j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i19).q(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
                f3.m.Companion companion2 = f3.m.INSTANCE;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing200()), rVar2, i17);
                j70.h.g(null, null, findOutMoreSectionData.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
                rVarH = rVar2;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i19).getSpacing200()), rVarH, 0);
                j30.f.e(null, findOutMoreSectionData.getButtonTextData(), false, rVarH, ButtonTextData.f99099f << 3, 5);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i19).getSpacing400()), rVarH, 0);
                it = it;
                i17 = 0;
                c15 = c15;
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yy1.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.k(findOutMoreData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(FindOutMoreData findOutMoreData, int i15, p076m2.r rVar, int i16) {
        j(findOutMoreData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final NoDataAvailable noDataAvailable, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-235660975);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noDataAvailable) : rVarH.G(noDataAvailable) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-235660975, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterNoDataScreen (ElectoralRegisterScreen.kt:53)");
            }
            rVar2 = rVarH;
            i50.s.r(noDataAvailable.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(612533088, true, new er.q() { // from class: yy1.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.m(noDataAvailable, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: yy1.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.n(noDataAvailable, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(NoDataAvailable noDataAvailable, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(612533088, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterNoDataScreen.<anonymous>.<anonymous> (ElectoralRegisterScreen.kt:55)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            q40.i.b(noDataAvailable.getElectoralRegisterScreenData().a(), null, null, rVar, IconPageData.f164667h, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(NoDataAvailable noDataAvailable, int i15, p076m2.r rVar, int i16) {
        l(noDataAvailable, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-996021738);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-996021738, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterScreen (ElectoralRegisterScreen.kt:37)");
            }
            r(p(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yy1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.q(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a p(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(c cVar, int i15, p076m2.r rVar, int i16) {
        o(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(200159289);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(200159289, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterScreenContent (ElectoralRegisterScreen.kt:43)");
            }
            if (fr.t.c(aVar, c.a.C6202a.f230726a)) {
                rVarH.X(-999515631);
                rVarH.R();
            } else if (aVar instanceof NoDataAvailable) {
                rVarH.X(-999513161);
                l((NoDataAvailable) aVar, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof Displayed)) {
                    rVarH.X(-999517318);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-999509696);
                t((Displayed) aVar, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: yy1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.s(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(c.a aVar, int i15, p076m2.r rVar, int i16) {
        r(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final Displayed displayed, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1259242292);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayed) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1259242292, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterScreenDisplayed (ElectoralRegisterScreen.kt:65)");
            }
            g30.t.f(displayed.getModalBottomSheetData(), 0.0f, false, null, null, y2.m.d(985660564, true, new er.p() { // from class: yy1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.u(displayed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-1146004523, true, new er.p() { // from class: yy1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.v(displayed, displayed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yy1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.x(displayed, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(Displayed displayed, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(985660564, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterScreenDisplayed.<anonymous>.<anonymous> (ElectoralRegisterScreen.kt:69)");
            }
            j(displayed.getBottomSheetData(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(final Displayed displayed, final Displayed displayed2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1146004523, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterScreenDisplayed.<anonymous>.<anonymous> (ElectoralRegisterScreen.kt:74)");
            }
            i50.s.r(displayed.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-82480190, true, new er.q() { // from class: yy1.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.w(displayed2, displayed, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, BaseScaffoldData.f89350g, 196608, 32766);
            q0.g(false, displayed2.e(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(Displayed displayed, Displayed displayed2, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        k70.a aVar;
        int i17;
        f3.m.Companion companion;
        int i18;
        k70.a aVar2;
        int i19;
        f3.m.Companion companion2;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-82480190, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.main.ElectoralRegisterScreenDisplayed.<anonymous>.<anonymous>.<anonymous> (ElectoralRegisterScreen.kt:77)");
            }
            f3.m.Companion companion3 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion3, 0.0f, 1, null), d3Var), null, rVar2, 0, 1), rVar2, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            i0 i0Var = i0.f39176a;
            if (displayed.getAlertData() == null) {
                rVar2.X(1645718658);
            } else {
                rVar2.X(1645718659);
                c30.e.c(null, displayed.getAlertData(), rVar2, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
            }
            rVar2.R();
            o40.j.i(displayed2.getHeaderData(), rVar2, 0);
            k70.a aVar3 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar2, i25).getSpacing300()), rVar2, 0);
            rVar2.X(468739592);
            Displayed screenData = displayed2.getScreenData();
            CardListData displayStatementsList = screenData.getDisplayStatementsList();
            if (displayStatementsList == null) {
                rVar2.X(231583861);
                rVar2.R();
                companion = companion3;
                i17 = i25;
                i18 = 0;
                aVar = aVar3;
            } else {
                rVar2.X(231583862);
                j70.h.g(null, null, screenData.getDisplayStatementsTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar3;
                i17 = i25;
                companion = companion3;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(displayStatementsList, null, null, rVar2, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
                rVar2.R();
            }
            CardListData displayElectionsAreasList = screenData.getDisplayElectionsAreasList();
            if (displayElectionsAreasList == null) {
                rVar2.X(231983761);
            } else {
                rVar2.X(231983762);
                j70.h.g(null, null, screenData.getDisplayElectionsAreasTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar;
                i17 = i17;
                companion = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(displayElectionsAreasList, null, null, rVar2, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            }
            rVar2.R();
            if (screenData.getDisplayElectionsAreasList() == null && screenData.getDisplayStatementsList() == null) {
                rVar2.X(227825763);
                rVar2.R();
                aVar2 = aVar;
                i19 = i17;
                companion2 = companion;
            } else {
                rVar2.X(232427992);
                j70.h.g(null, null, screenData.getDisplayCitizenDataTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar2 = aVar;
                i19 = i17;
                companion2 = companion;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            m30.i.d(screenData.getDisplayCitizenDataList(), null, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing100()), rVar2, i18);
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(Displayed displayed, int i15, p076m2.r rVar, int i16) {
        t(displayed, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
