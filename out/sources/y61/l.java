package y61;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.Iterator;
import mx.Label;
import n40.FilePickerData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Ly61/d;", "viewModel", "Loq/i0;", "q", "(Ly61/d;Lm2/r;I)V", "Ly61/d$a$c;", "screenData", "j", "(Ly61/d$a$c;Lm2/r;I)V", "n", "Lz61/d;", "data", "h", "(Lz61/d;Lm2/r;I)V", "Ly61/d$a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final void h(final z61.d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-914110334);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-914110334, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.attachments.BottomSheetContent (ChildPassportApplicationAttachmentsScreen.kt:119)");
            }
            if (!(dVar instanceof z61.d.File)) {
                rVarH.X(2008266616);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(2008268193);
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
            rVarH.X(1324031632);
            Iterator<T> it = ((z61.d.File) dVar).a().iterator();
            while (it.hasNext()) {
                z30.e.d((FileBottomSheetItemData) it.next(), rVarH, FileBottomSheetItemData.f232760e);
            }
            rVarH.R();
            rVarH.x();
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y61.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(z61.d dVar, int i15, p076m2.r rVar, int i16) {
        h(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1021152098);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1021152098, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.attachments.ChildPassportApplicationAttachmentsContent (ChildPassportApplicationAttachmentsScreen.kt:45)");
            }
            g30.t.f(initialized.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-998379349, true, new er.p() { // from class: y61.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1097456202, true, new er.p() { // from class: y61.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: y61.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-998379349, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.attachments.ChildPassportApplicationAttachmentsContent.<anonymous>.<anonymous> (ChildPassportApplicationAttachmentsScreen.kt:48)");
            }
            z61.d bottomSheetContentData = initialized.getBottomSheetContentData();
            if (bottomSheetContentData == null) {
                rVar.X(-70623097);
            } else {
                rVar.X(-70623096);
                h(bottomSheetContentData, rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1097456202, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.attachments.ChildPassportApplicationAttachmentsContent.<anonymous>.<anonymous> (ChildPassportApplicationAttachmentsScreen.kt:49)");
            }
            n(initialized, rVar, BaseScaffoldData.f89350g | FilePickerData.f131319k | CheckBoxSingleData.f210090f | ModalBottomSheetData.f70192e | InfoRowListData.f187643b);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(187317672);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(187317672, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.attachments.ChildPassportApplicationAttachmentsInnerContent (ChildPassportApplicationAttachmentsScreen.kt:54)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1266587663, true, new er.q() { // from class: y61.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.o(initialized, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: y61.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.p(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final oq.i0 o(d.a.Initialized initialized, d.a.Initialized initialized2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        TextStyle textStyleD;
        f3.m.Companion companion;
        k70.a aVar;
        int i17;
        k70.a aVar2;
        int i18;
        f3.m.Companion companion2;
        int i19;
        k70.a aVar3;
        int i25;
        f3.m.Companion companion3;
        ?? r15;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1266587663, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.attachments.ChildPassportApplicationAttachmentsInnerContent.<anonymous>.<anonymous> (ChildPassportApplicationAttachmentsScreen.kt:56)");
            }
            f3.m.Companion companion4 = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion4, 0.0f, 1, null);
            k70.a aVar4 = k70.a.f108864a;
            int i26 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(mVarF, aVar4.a(rVar, i26).getBase().a(), null, 2, null), d3Var), aVar4.b(rVar, i26).getSpacing200(), 0.0f, aVar4.b(rVar, i26).getSpacing200(), aVar4.b(rVar, i26).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion5 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion5.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion6.b();
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
            n6.i(rVarC, w0VarA, companion6.d());
            n6.i(rVarC, e0VarT, companion6.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion6.c());
            n6.g(rVarC, companion6.a());
            n6.i(rVarC, mVarE, companion6.e());
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.f(companion4, 0.0f, 1, null), 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar4.b(rVar, i26).getSpacing100(), 0.0f, aVar4.b(rVar, i26).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion5.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion6.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion6.d());
            n6.i(rVarC2, e0VarT2, companion6.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion6.c());
            n6.g(rVarC2, companion6.a());
            n6.i(rVarC2, mVarE2, companion6.e());
            j70.h.g(null, null, initialized2.getHeaderLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar, i26).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            Label messageLabel = initialized2.getMessageLabel();
            if (messageLabel == null) {
                rVar2.X(-1692765054);
                rVar2.R();
                companion = companion4;
                aVar = aVar4;
                i17 = i26;
            } else {
                rVar2.X(-1692765053);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar4.b(rVar2, i26).getSpacing100()), rVar2, 0);
                if (initialized2.getInfoRowListData() != null) {
                    rVar2.X(-834412425);
                    textStyleD = aVar4.f(rVar2, i26).a();
                    rVar2.R();
                } else {
                    rVar2.X(-834341931);
                    textStyleD = aVar4.f(rVar2, i26).d();
                    rVar2.R();
                }
                companion = companion4;
                aVar = aVar4;
                i17 = i26;
                j70.h.g(null, null, messageLabel, null, null, aVar4.a(rVar2, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                oq.i0 i0Var = oq.i0.f148189a;
                rVar2.R();
            }
            InfoRowListData infoRowListData = initialized2.getInfoRowListData();
            if (infoRowListData == null) {
                rVar2.X(-1692331178);
                rVar2.R();
                companion2 = companion;
                aVar2 = aVar;
                i18 = i17;
                i19 = 0;
            } else {
                rVar2.X(-1692331177);
                aVar2 = aVar;
                i18 = i17;
                companion2 = companion;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                s40.g.c(infoRowListData, 0.0f, rVar2, InfoRowListData.f187643b, 2);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar2.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, i19);
            m40.c.c(null, initialized2.getFilePickerData(), rVar2, FilePickerData.f131319k << 3, 1);
            d.a.StatementData statementData = initialized2.getStatementData();
            if (statementData == null) {
                rVar2.X(-1692031718);
                rVar2.R();
                aVar3 = aVar2;
                i25 = i18;
                companion3 = companion2;
                r15 = i19;
            } else {
                rVar2.X(-1692031717);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing300()), rVar2, i19);
                j70.h.g(null, null, statementData.getHeader(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar3 = aVar2;
                i25 = i18;
                companion3 = companion2;
                r15 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar2, i25).getSpacing200()), rVar2, 0);
                v30.d.f(statementData.getCheckBoxData(), rVar2, CheckBoxSingleData.f210090f);
                oq.i0 i0Var3 = oq.i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar3.b(rVar2, i25).getSpacing250()), rVar2, r15);
            h30.q.p(initialized2.getNextButton(), false, null, rVar2, 0, 6);
            rVar2.x();
            q0.g(r15, initialized.i(), rVar2, r15, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        n(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2030146111);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2030146111, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.attachments.ChildPassportApplicationAttachmentsScreen (ChildPassportApplicationAttachmentsScreen.kt:35)");
            }
            d.a aVarR = r(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarR instanceof d.a.b) {
                rVarH.X(-1055254126);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarR instanceof d.a.Initialized) {
                rVarH.X(-1055252642);
                j((d.a.Initialized) aVarR, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarR instanceof d.a.Error)) {
                    rVarH.X(-1055255663);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1055249591);
                ((d.a.Error) aVarR).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: y61.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a r(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(d dVar, int i15, p076m2.r rVar, int i16) {
        q(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
