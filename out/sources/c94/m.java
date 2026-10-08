package c94;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lc94/c;", "viewModel", "Loq/i0;", "t", "(Lc94/c;Lm2/r;I)V", "Lc94/c$b;", "data", "j", "(Lc94/c$b;Lm2/r;I)V", "r", "(Lm2/r;I)V", "Lc94/c$b$b;", "w", "(Lc94/c$b$b;Lm2/r;I)V", "Lc94/c$b$a;", "n", "(Lc94/c$b$a;Lm2/r;I)V", "l", "state", "schoolattendance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void j(final c.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-88368464);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-88368464, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusDetailsContent (AttendanceStatusDetailsScreen.kt:38)");
            }
            if (bVar instanceof c.b.C0658c) {
                rVarH.X(977257200);
                r(rVarH, 0);
                rVarH.R();
            } else if (bVar instanceof c.b.Displaying) {
                rVarH.X(977260190);
                n((c.b.Displaying) bVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(bVar instanceof c.b.ErrorLoading)) {
                    rVarH.X(977255207);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(977263666);
                w((c.b.ErrorLoading) bVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: c94.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.b bVar, int i15, p076m2.r rVar, int i16) {
        j(bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final c.b.Displaying displaying, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(544230314);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(displaying) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i17 = 0;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(544230314, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusDetailsDays (AttendanceStatusDetailsScreen.kt:88)");
            }
            Iterator it = displaying.a().iterator();
            int i18 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                c.AttendanceDayViewData attendanceDayViewData = (c.AttendanceDayViewData) next;
                if (i18 > 0) {
                    rVarH.X(-1271010237);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, i17);
                } else {
                    rVarH.X(-1274079981);
                }
                rVarH.R();
                Label labelB = mx.b.b(attendanceDayViewData.getDate(), "absenceList_dayHeader");
                k70.a aVar = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                p076m2.r rVar3 = rVarH;
                int i26 = i17;
                j70.h.g(null, null, labelB, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).a(), null, null, false, false, null, rVar3, 0, 0, 0, 33030139);
                rVarH = rVar3;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i25).getSpacing200()), rVarH, i26);
                m30.i.d(attendanceDayViewData.getCardListData(), null, null, rVarH, 0, 6);
                it = it;
                i17 = i26;
                i18 = i19;
            }
            rVar2 = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c94.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.m(displaying, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.b.Displaying displaying, int i15, p076m2.r rVar, int i16) {
        l(displaying, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final c.b.Displaying displaying, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(324111411);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displaying) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(324111411, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusDetailsDisplaying (AttendanceStatusDetailsScreen.kt:64)");
            }
            i50.s.r(displaying.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1155456928, true, new er.q() { // from class: c94.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.o(displaying, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, displaying.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c94.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(displaying, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final c.b.Displaying displaying, d3 d3Var, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1155456928, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusDetailsDisplaying.<anonymous> (AttendanceStatusDetailsScreen.kt:66)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            if (displaying.getEmptyStateData() != null) {
                rVar.X(-2018852973);
                rVar2 = rVar;
                x30.c.c(null, 0.0f, y2.m.d(-1907863854, true, new er.p() { // from class: c94.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.p(displaying, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                rVar2.R();
            } else {
                rVar2 = rVar;
                rVar2.X(-2018759694);
                l(displaying, rVar2, 0);
                rVar2.R();
            }
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
    public static final i0 p(c.b.Displaying displaying, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1907863854, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusDetailsDisplaying.<anonymous>.<anonymous>.<anonymous> (AttendanceStatusDetailsScreen.kt:75)");
            }
            k40.d.c(null, displaying.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c.b.Displaying displaying, int i15, p076m2.r rVar, int i16) {
        n(displaying, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void r(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(704387965);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(704387965, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusDetailsLoading (AttendanceStatusDetailsScreen.kt:47)");
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
            d5VarM.a(new er.p() { // from class: c94.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(int i15, p076m2.r rVar, int i16) {
        r(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void t(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1144026687);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1144026687, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusDetailsScreen (AttendanceStatusDetailsScreen.kt:30)");
            }
            j(u(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c94.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.v(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.b u(f6<? extends c.b> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(c cVar, int i15, p076m2.r rVar, int i16) {
        t(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void w(final c.b.ErrorLoading errorLoading, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1049320187);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(errorLoading) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1049320187, i16, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.AttendanceStatusError (AttendanceStatusDetailsScreen.kt:54)");
            }
            errorLoading.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: c94.f
                    @Override // er.a
                    public final Object a() {
                        return m.x();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c94.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.y(errorLoading, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(c.b.ErrorLoading errorLoading, int i15, p076m2.r rVar, int i16) {
        w(errorLoading, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
