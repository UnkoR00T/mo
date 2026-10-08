package v84;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import f1.q0;
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
import y84.SemesterSheetItemData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lv84/c;", "viewModel", "Loq/i0;", "C", "(Lv84/c;Lm2/r;I)V", "Lv84/c$a;", "data", "r", "(Lv84/c$a;Lm2/r;I)V", "A", "(Lm2/r;I)V", "Lv84/c$a$b;", "t", "(Lv84/c$a$b;Lm2/r;I)V", "", "Ly84/b;", "items", "F", "(Ljava/util/List;Lm2/r;I)V", "Lv84/c$a$a;", "n", "(Lv84/c$a$a;Lm2/r;I)V", "Lv84/c$a$c;", "x", "(Lv84/c$a$c;Lm2/r;I)V", "state", "schoolattendance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f204863a;

        public a(List list) {
            this.f204863a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f204863a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f204864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f204865b;

        public b(List list, List list2) {
            this.f204864a = list;
            this.f204865b = list2;
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
            SemesterSheetItemData semesterSheetItemData = (SemesterSheetItemData) this.f204864a.get(i15);
            rVar.X(-1918098052);
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
            if (i15 != this.f204865b.size() - 1) {
                rVar.X(1450017304);
                vb.h(null, aVar.b(rVar, i18).getStrokeWidth(), aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 1);
            } else {
                rVar.X(1445352796);
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

    private static final void A(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-870308523);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-870308523, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceSummaryLoading (AttendanceSummaryScreen.kt:59)");
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
            d5VarM.a(new er.p() { // from class: v84.g0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.B(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(int i15, p076m2.r rVar, int i16) {
        A(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void C(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-605360487);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-605360487, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceSummaryScreen (AttendanceSummaryScreen.kt:41)");
            }
            r(D(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v84.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.E(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a D(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(c cVar, int i15, p076m2.r rVar, int i16) {
        C(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void F(final List<SemesterSheetItemData> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-815591147);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-815591147, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.SemesterBottomSheetContent (AttendanceSummaryScreen.kt:107)");
            }
            boolean zG = rVarH.G(list);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: v84.a0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m0.G(list, (q0) obj);
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
            d5VarM.a(new er.p() { // from class: v84.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.H(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(List list, q0 q0Var) {
        q0Var.j(list.size(), null, new a(list), y2.m.b(2039820996, true, new b(list, list)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(List list, int i15, p076m2.r rVar, int i16) {
        F(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final c.a.AttendanceEmptyState attendanceEmptyState, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1142270634);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(attendanceEmptyState) : rVarH.G(attendanceEmptyState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1142270634, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceEmptyState (AttendanceSummaryScreen.kt:133)");
            }
            rVar2 = rVarH;
            i50.s.r(attendanceEmptyState.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1755546615, true, new er.q() { // from class: v84.k0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m0.o(attendanceEmptyState, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: v84.l0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.q(attendanceEmptyState, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(final c.a.AttendanceEmptyState attendanceEmptyState, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1755546615, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceEmptyState.<anonymous> (AttendanceSummaryScreen.kt:135)");
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(1150878354, true, new er.p() { // from class: v84.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.p(attendanceEmptyState, (p076m2.r) obj, ((Integer) obj2).intValue());
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
    public static final oq.i0 p(c.a.AttendanceEmptyState attendanceEmptyState, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1150878354, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceEmptyState.<anonymous>.<anonymous>.<anonymous> (AttendanceSummaryScreen.kt:144)");
            }
            k40.d.c(null, attendanceEmptyState.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(c.a.AttendanceEmptyState attendanceEmptyState, int i15, p076m2.r rVar, int i16) {
        n(attendanceEmptyState, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1013923000);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1013923000, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceSummaryContent (AttendanceSummaryScreen.kt:49)");
            }
            if (aVar instanceof c.a.d) {
                rVarH.X(577577922);
                A(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof c.a.AttendanceEmptyState) {
                rVarH.X(577580905);
                n((c.a.AttendanceEmptyState) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof c.a.Displaying) {
                rVarH.X(577583792);
                t((c.a.Displaying) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.ErrorLoadingInitialData)) {
                    rVarH.X(577576151);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(577587307);
                x((c.a.ErrorLoadingInitialData) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: v84.d0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.s(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(c.a aVar, int i15, p076m2.r rVar, int i16) {
        r(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final c.a.Displaying displaying, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2122399543);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displaying) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2122399543, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceSummaryDisplaying (AttendanceSummaryScreen.kt:66)");
            }
            g30.m.j(displaying.getBottomSheetData(), displaying.getScaffoldData(), 0.0f, null, null, null, y2.m.d(-1688634030, true, new er.p() { // from class: v84.h0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.u(displaying, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-2147438578, true, new er.q() { // from class: v84.i0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m0.v(displaying, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14155776 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 60);
            p088nul.q0.g(false, displaying.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v84.j0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.w(displaying, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(c.a.Displaying displaying, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1688634030, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceSummaryDisplaying.<anonymous> (AttendanceSummaryScreen.kt:70)");
            }
            F(displaying.e(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(c.a.Displaying displaying, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2147438578, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceSummaryDisplaying.<anonymous> (AttendanceSummaryScreen.kt:72)");
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
            if (displaying.getSemesterChanger() == null) {
                rVar2.X(-719476770);
                rVar2.R();
                companion = companion2;
            } else {
                rVar2.X(-719476769);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
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
                companion = companion2;
                j70.h.g(p3.c(q3.f39261a, companion2, 1.0f, false, 2, null), null, displaying.getSemesterChanger().getName(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 1, 0, null, aVar.f(rVar2, i17).m(), null, null, false, false, null, rVar, 0, 1597440, 0, 32948218);
                rVar2 = rVar;
                j30.f.e(null, displaying.getSemesterChanger().getChangeButtonData(), false, rVar2, ButtonTextData.f99099f << 3, 5);
                rVar2.x();
                rVar2.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
            q50.h.b(displaying.f(), rVar2, 0);
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
    public static final oq.i0 w(c.a.Displaying displaying, int i15, p076m2.r rVar, int i16) {
        t(displaying, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void x(final c.a.ErrorLoadingInitialData errorLoadingInitialData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-243942235);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(errorLoadingInitialData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-243942235, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.AttendanceSummaryError (AttendanceSummaryScreen.kt:153)");
            }
            errorLoadingInitialData.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: v84.e0
                    @Override // er.a
                    public final Object a() {
                        return m0.y();
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
            d5VarM.a(new er.p() { // from class: v84.f0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m0.z(errorLoadingInitialData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(c.a.ErrorLoadingInitialData errorLoadingInitialData, int i15, p076m2.r rVar, int i16) {
        x(errorLoadingInitialData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
