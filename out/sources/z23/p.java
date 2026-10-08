package z23;

import a50.RadioButtonData;
import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import t50.TextAreaData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\b¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lz23/e;", "viewModel", "Loq/i0;", "u", "(Lz23/e;Lm2/r;I)V", "Lz23/e$a$a;", "data", "l", "(Lz23/e$a$a;Lm2/r;I)V", "", "Lz30/a;", "j", "(Ljava/util/List;Lm2/r;I)V", "r", "Lz23/e$a;", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    private static final void j(final List<FileBottomSheetItemData> list, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1658372607);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1658372607, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.BottomContent (DetailsScreen.kt:80)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            rVarH.X(-727765963);
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                z30.e.d(list.get(i17), rVarH, FileBottomSheetItemData.f232760e);
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
            d5VarM.a(new er.p() { // from class: z23.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.k(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(List list, int i15, p076m2.r rVar, int i16) {
        j(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final e.a.Displayed displayed, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1494905255);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayed) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1494905255, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.DetailsContent (DetailsScreen.kt:48)");
            }
            cb4.i dialogVMSAdapter = displayed.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-206468960);
            } else {
                rVarH.X(-2084870271);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            g30.m.j(displayed.getBottomSheetData(), displayed.getBaseScaffoldData(), 0.0f, null, null, y2.m.d(633125789, true, new er.p() { // from class: z23.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.m(displayed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1335060382, true, new er.p() { // from class: z23.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.n(displayed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(544644194, true, new er.q() { // from class: z23.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.o(displayed, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14352384 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 28);
            boolean zG = rVarH.G(displayed);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: z23.k
                    @Override // er.a
                    public final Object a() {
                        return p.p(displayed);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z23.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.q(displayed, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(e.a.Displayed displayed, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(633125789, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.DetailsContent.<anonymous> (DetailsScreen.kt:58)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(displayed.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 n(e.a.Displayed displayed, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1335060382, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.DetailsContent.<anonymous> (DetailsScreen.kt:55)");
            }
            j(displayed.b(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(e.a.Displayed displayed, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(544644194, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.DetailsContent.<anonymous> (DetailsScreen.kt:65)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            d1.i0 i0Var = d1.i0.f39176a;
            r(displayed, rVar, 0);
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
    public static final oq.i0 p(e.a.Displayed displayed) {
        displayed.l().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(e.a.Displayed displayed, int i15, p076m2.r rVar, int i16) {
        l(displayed, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final e.a.Displayed displayed, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-683250165);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(displayed) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-683250165, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.DetailsInnerContent (DetailsScreen.kt:91)");
            }
            Label headerDate = displayed.getHeaderDate();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headerDate, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            a50.k.j(displayed.getRadioButtonDate(), rVarH, RadioButtonData.f3462h);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, displayed.getHeaderTextArea(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1283726484, true, new er.p() { // from class: z23.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.s(displayed, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, displayed.getFilePickerTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, displayed.getFilePickerSubtitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            m40.c.c(null, displayed.getFilePickerData(), rVarH, FilePickerData.f131319k << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z23.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.t(displayed, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(e.a.Displayed displayed, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1283726484, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.DetailsInnerContent.<anonymous> (DetailsScreen.kt:104)");
            }
            t50.r.m(displayed.getDescription(), null, rVar, TextAreaData.f187694o, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(e.a.Displayed displayed, int i15, p076m2.r rVar, int i16) {
        r(displayed, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(527119767);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(527119767, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.details.DetailsScreen (DetailsScreen.kt:35)");
            }
            e.a aVarV = v(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarV, e.a.b.f232666a)) {
                rVarH.X(-244039032);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarV instanceof e.a.Error) {
                rVarH.X(-244036545);
                ((e.a.Error) aVarV).getErrorVMSAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarV instanceof e.a.Displayed)) {
                    rVarH.X(-244040810);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-244034862);
                l((e.a.Displayed) aVarV, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: z23.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.w(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a v(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(e eVar, int i15, p076m2.r rVar, int i16) {
        u(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
