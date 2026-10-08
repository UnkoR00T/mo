package m94;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import k40.EmptyStateData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lm94/e;", "viewModel", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lm94/e;Lm2/r;I)V", "Lm94/e$a;", "data", "v", "(Lm94/e$a;Lm2/r;I)V", "J", "(Lm2/r;I)V", "Lm94/e$a$a;", "x", "(Lm94/e$a$a;Lm2/r;I)V", "", "Lm94/c;", "items", "O", "(Ljava/util/List;Lm2/r;I)V", "Lm94/e$a$b;", ip.a.f96138c, "(Lm94/e$a$b;Lm2/r;I)V", "Lm94/e$a$c;", "r", "(Lm94/e$a$c;Lm2/r;I)V", "Lm94/e$a$d;", "G", "(Lm94/e$a$d;Lm2/r;I)V", "state", "schoolbehavior_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f124978a;

        public a(List list) {
            this.f124978a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f124978a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f124979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f124980b;

        public b(List list, List list2) {
            this.f124979a = list;
            this.f124980b = list2;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            SemesterSheetItemData semesterSheetItemData = (SemesterSheetItemData) this.f124979a.get(i15);
            rVar.X(229783863);
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            f3.m mVarN = androidx.compose.foundation.b.n(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), false, null, null, null, semesterSheetItemData.a(), 15, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(a3.p(mVarN, 0.0f, aVar.b(rVar, i18).getSpacing300(), 1, null), null, semesterSheetItemData.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            if (i15 != this.f124980b.size() - 1) {
                rVar.X(1061797715);
                vb.h(null, aVar.b(rVar, i18).getStrokeWidth(), aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 1);
            } else {
                rVar.X(1056086647);
            }
            rVar.R();
            rVar.x();
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(e.a.DisplayingBehaviorList displayingBehaviorList, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1889957157, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListDisplaying.<anonymous>.<anonymous>.<anonymous> (BehaviorListScreen.kt:101)");
            }
            k40.d.c(null, displayingBehaviorList.getBreakInLearningData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(e.a.DisplayingBehaviorList displayingBehaviorList, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-203908393, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListDisplaying.<anonymous>.<anonymous>.<anonymous> (BehaviorListScreen.kt:119)");
            }
            k40.d.c(null, displayingBehaviorList.getPartialGradesEmptyState(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(e.a.DisplayingBehaviorList displayingBehaviorList, int i15, p076m2.r rVar, int i16) {
        x(displayingBehaviorList, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void D(final e.a.DisplayingFullBehaviourGradeText displayingFullBehaviourGradeText, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1945895182);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(displayingFullBehaviourGradeText) : rVarH.G(displayingFullBehaviourGradeText) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1945895182, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListFullGradeText (BehaviorListScreen.kt:158)");
            }
            i50.s.r(displayingFullBehaviourGradeText.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1662944901, true, new er.q() { // from class: m94.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.E(displayingFullBehaviourGradeText, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, displayingFullBehaviourGradeText.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m94.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.F(displayingFullBehaviourGradeText, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(e.a.DisplayingFullBehaviourGradeText displayingFullBehaviourGradeText, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1662944901, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListFullGradeText.<anonymous> (BehaviorListScreen.kt:160)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, displayingFullBehaviourGradeText.getGradeLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
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
    public static final oq.i0 F(e.a.DisplayingFullBehaviourGradeText displayingFullBehaviourGradeText, int i15, p076m2.r rVar, int i16) {
        D(displayingFullBehaviourGradeText, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void G(final e.a.ErrorLoadingInitialData errorLoadingInitialData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1741498145);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(errorLoadingInitialData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1741498145, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListInitialError (BehaviorListScreen.kt:205)");
            }
            errorLoadingInitialData.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: m94.q
                    @Override // er.a
                    public final Object a() {
                        return w.H();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m94.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.I(errorLoadingInitialData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(e.a.ErrorLoadingInitialData errorLoadingInitialData, int i15, p076m2.r rVar, int i16) {
        G(errorLoadingInitialData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void J(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(1992404779);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1992404779, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListLoading (BehaviorListScreen.kt:60)");
            }
            c60.b.b(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m94.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.K(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(int i15, p076m2.r rVar, int i16) {
        J(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void L(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-703676817);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-703676817, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListScreen (BehaviorListScreen.kt:41)");
            }
            v(M(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m94.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.N(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a M(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(e eVar, int i15, p076m2.r rVar, int i16) {
        L(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void O(final List<SemesterSheetItemData> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1230613498);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1230613498, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.SemesterBottomSheetContent (BehaviorListScreen.kt:132)");
            }
            boolean zG = rVarH.G(list);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: m94.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w.P(list, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, null, null, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 511);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m94.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.Q(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(List list, f1.q0 q0Var) {
        q0Var.j(list.size(), null, new a(list), y2.m.b(2039820996, true, new b(list, list)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(List list, int i15, p076m2.r rVar, int i16) {
        O(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final e.a.EmptyState emptyState, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1385877261);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(emptyState) : rVarH.G(emptyState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1385877261, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorEmptyState (BehaviorListScreen.kt:180)");
            }
            rVar2 = rVarH;
            i50.s.r(emptyState.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(418017152, true, new er.q() { // from class: m94.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.s(emptyState, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: m94.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.u(emptyState, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final e.a.EmptyState emptyState, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(418017152, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorEmptyState.<anonymous> (BehaviorListScreen.kt:182)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, emptyState.getPartialGradesSectionTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-918974647, true, new er.p() { // from class: m94.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.t(emptyState, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final oq.i0 t(e.a.EmptyState emptyState, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-918974647, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorEmptyState.<anonymous>.<anonymous>.<anonymous> (BehaviorListScreen.kt:196)");
            }
            k40.d.c(null, emptyState.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(e.a.EmptyState emptyState, int i15, p076m2.r rVar, int i16) {
        r(emptyState, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1069121058);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1069121058, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListContent (BehaviorListScreen.kt:49)");
            }
            if (aVar instanceof e.a.C3074e) {
                rVarH.X(-928148493);
                J(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof e.a.EmptyState) {
                rVarH.X(-928146211);
                r((e.a.EmptyState) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof e.a.DisplayingBehaviorList) {
                rVarH.X(-928143231);
                x((e.a.DisplayingBehaviorList) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof e.a.DisplayingFullBehaviourGradeText) {
                rVarH.X(-928139804);
                D((e.a.DisplayingFullBehaviourGradeText) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.ErrorLoadingInitialData)) {
                    rVarH.X(-928150333);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-928136573);
                G((e.a.ErrorLoadingInitialData) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: m94.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.w(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(e.a aVar, int i15, p076m2.r rVar, int i16) {
        v(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void x(final e.a.DisplayingBehaviorList displayingBehaviorList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1750115611);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayingBehaviorList) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1750115611, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListDisplaying (BehaviorListScreen.kt:67)");
            }
            g30.m.j(displayingBehaviorList.getBottomSheetData(), displayingBehaviorList.getScaffoldData(), 0.0f, null, null, null, y2.m.d(-1404551328, true, new er.p() { // from class: m94.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.y(displayingBehaviorList, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-926259164, true, new er.q() { // from class: m94.t
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.z(displayingBehaviorList, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14155776 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 60);
            p088nul.q0.g(false, displayingBehaviorList.e(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m94.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.C(displayingBehaviorList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(e.a.DisplayingBehaviorList displayingBehaviorList, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1404551328, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListDisplaying.<anonymous> (BehaviorListScreen.kt:71)");
            }
            O(displayingBehaviorList.j(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final e.a.DisplayingBehaviorList displayingBehaviorList, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        int i17;
        f3.m.Companion companion;
        int i18;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-926259164, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.behaviorList.BehaviorListDisplaying.<anonymous> (BehaviorListScreen.kt:73)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion2, d3Var), 0.0f, 1, null), null, rVar2, 0, 1), rVar2, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar2, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            if (displayingBehaviorList.getSemesterTitle() == null || displayingBehaviorList.getChangeSemesterButtonData() == null) {
                i17 = 0;
                companion = companion2;
                i18 = 1669750612;
                rVar2.X(1669750612);
                rVar2.R();
            } else {
                rVar2.X(1673124187);
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i19).getSpacing100()), rVar2, 0);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
                w0 w0VarB = m3.b(iVar.h(), companion3.i(), rVar2, 54);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT2 = rVar2.t();
                f3.m mVarE2 = f3.j.e(rVar2, mVarH);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB2);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC2 = n6.c(rVar2);
                n6.i(rVarC2, w0VarB, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                j70.h.g(p3.c(q3.f39261a, companion2, 1.0f, false, 2, null), null, displayingBehaviorList.getSemesterTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 1, 0, null, aVar.f(rVar2, i19).m(), null, null, false, false, null, rVar, 0, 1597440, 0, 32948218);
                j30.f.e(null, displayingBehaviorList.getChangeSemesterButtonData(), false, rVar, ButtonTextData.f99099f << 3, 5);
                rVar2 = rVar;
                rVar2.x();
                float spacing200 = aVar.b(rVar2, i19).getSpacing200();
                companion = companion2;
                i17 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, spacing200), rVar2, 0);
                rVar2.R();
                i18 = 1669750612;
            }
            if (displayingBehaviorList.getBreakInLearningData() != null) {
                rVar2.X(1673846177);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, i17);
                x30.c.c(null, 0.0f, y2.m.d(-1889957157, true, new er.p() { // from class: m94.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w.A(displayingBehaviorList, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                rVar2.R();
            } else {
                rVar2.X(1674051397);
                if (displayingBehaviorList.getFinalGradeCardData() != null) {
                    rVar2.X(1674080072);
                    k70.a aVar2 = k70.a.f108864a;
                    int i25 = k70.a.f108865b;
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i25).getSpacing100()), rVar2, i17);
                    n50.h0.v(displayingBehaviorList.getFinalGradeCardData(), null, rVar2, i17, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i25).getSpacing200()), rVar2, i17);
                } else {
                    rVar2.X(i18);
                }
                rVar2.R();
                k70.a aVar3 = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar2, i26).getSpacing100()), rVar2, i17);
                j70.h.g(null, null, displayingBehaviorList.getPartialGradesSectionTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i26).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVar2, i26).getSpacing100()), rVar2, 0);
                if (displayingBehaviorList.getPartialGradesListData() != null) {
                    rVar2.X(1674653417);
                    m30.i.d(displayingBehaviorList.getPartialGradesListData(), null, null, rVar2, 0, 6);
                    rVar2.R();
                } else {
                    if (displayingBehaviorList.getPartialGradesEmptyState() != null) {
                        rVar2.X(1674776642);
                        x30.c.c(null, 0.0f, y2.m.d(-203908393, true, new er.p() { // from class: m94.l
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return w.B(displayingBehaviorList, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                    } else {
                        rVar2.X(1669750612);
                    }
                    rVar2.R();
                }
                rVar2.R();
            }
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }
}
