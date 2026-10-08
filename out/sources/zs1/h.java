package zs1;

import bt1.RefugeeChildStatementState;
import bt1.RefugeeDocumentBottomSheetData;
import d1.r3;
import h30.ButtonData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbt1/c$a;", "content", "Loq/i0;", "p", "(Lbt1/c$a;Lm2/r;I)V", "Lbt1/c$a$b;", "data", "h", "(Lbt1/c$a$b;Lm2/r;I)V", "Lbt1/c$a$a;", "m", "(Lbt1/c$a$a;Lm2/r;I)V", "diia_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void h(final RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement refugeeChildrenStatement, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1978937862);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(refugeeChildrenStatement) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1978937862, i16, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.ChildrenStatementContent (RefugeeBottomSheetContent.kt:44)");
            }
            final List<RefugeeChildStatementState> listA = refugeeChildrenStatement.a();
            f3.m.Companion companion = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            boolean zG = rVarH.G(refugeeChildrenStatement) | rVarH.G(listA);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: zs1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.i(refugeeChildrenStatement, listA, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarB, null, null, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 510);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(refugeeChildrenStatement.getChildrenStatementScreenButton(), null, 2, null), k30.d.a.f107773a, refugeeChildrenStatement.getIsButtonEnabled() ? k30.b.c.f107768a : k30.b.C2562b.f107767a, refugeeChildrenStatement.b(), 3, null), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.l(refugeeChildrenStatement, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(final RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement refugeeChildrenStatement, final List list, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(-129710245, true, new er.q() { // from class: zs1.f
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h.j(refugeeChildrenStatement, list, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(final RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement refugeeChildrenStatement, List list, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-129710245, i15, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.ChildrenStatementContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RefugeeBottomSheetContent.kt:52)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            j70.h.g(null, null, refugeeChildrenStatement.getChildrenStatementScreenHeader(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            j70.h.g(null, null, refugeeChildrenStatement.getChildrenStatementScreenInfo(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            rVar.X(-97471025);
            List<RefugeeChildStatementState> list2 = list;
            ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
            for (final RefugeeChildStatementState refugeeChildStatementState : list2) {
                Label label = refugeeChildStatementState.getLabel();
                boolean isSelected = refugeeChildStatementState.getIsSelected();
                boolean zG = rVar.G(refugeeChildrenStatement) | rVar.G(refugeeChildStatementState);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: zs1.g
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.k(refugeeChildrenStatement, refugeeChildStatementState, ((Boolean) obj).booleanValue());
                        }
                    };
                    rVar.v(objE);
                }
                arrayList.add(new CheckBoxRowData(null, isSelected, (er.l) objE, label, null, null, null, null, 241, null));
            }
            rVar.R();
            t30.e.e(new CheckBoxGroupData(arrayList, null, null, null, false, null, 62, null), rVar, CheckBoxGroupData.f194954g);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement refugeeChildrenStatement, RefugeeChildStatementState refugeeChildStatementState, boolean z15) {
        refugeeChildrenStatement.f().b(RefugeeChildStatementState.b(refugeeChildStatementState, null, null, z15, 3, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement refugeeChildrenStatement, int i15, p076m2.r rVar, int i16) {
        h(refugeeChildrenStatement, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final RefugeeDocumentBottomSheetData.a.DisplayPesel displayPesel, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-849297466);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(displayPesel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-849297466, i16, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.PeselDisplayedContent (RefugeeBottomSheetContent.kt:104)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-47539033, true, new er.p() { // from class: zs1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.n(displayPesel, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.o(displayPesel, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(RefugeeDocumentBottomSheetData.a.DisplayPesel displayPesel, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-47539033, i15, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.PeselDisplayedContent.<anonymous> (RefugeeBottomSheetContent.kt:106)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(d1.a3.p(companion, 0.0f, aVar.b(rVar, i16).getSpacing100(), 1, null), null, displayPesel.getPeselValue(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).m(), null, null, false, false, j70.a.LETTER_BY_LETTER, rVar, 0, 0, 24576, 16252922);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(RefugeeDocumentBottomSheetData.a.DisplayPesel displayPesel, int i15, p076m2.r rVar, int i16) {
        m(displayPesel, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final RefugeeDocumentBottomSheetData.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1153031979);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1153031979, i16, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.RefugeeBottomSheetContent (RefugeeBottomSheetContent.kt:29)");
            }
            f3.m mVarN = t70.s.n(f3.m.INSTANCE, rVarH, 6);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            d1.i0 i0Var = d1.i0.f39176a;
            if (aVar instanceof RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement) {
                rVarH.X(-1164145817);
                h((RefugeeDocumentBottomSheetData.a.RefugeeChildrenStatement) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof RefugeeDocumentBottomSheetData.a.DisplayPesel)) {
                    rVarH.X(-1164148592);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1164142460);
                m((RefugeeDocumentBottomSheetData.a.DisplayPesel) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.q(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(RefugeeDocumentBottomSheetData.a aVar, int i15, p076m2.r rVar, int i16) {
        p(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
