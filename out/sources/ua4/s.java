package ua4;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n50.DefaultSingleCardData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lua4/g;", "viewModel", "Loq/i0;", "z", "(Lua4/g;Lm2/r;I)V", "Lua4/g$a;", "data", "r", "(Lua4/g$a;Lm2/r;I)V", "x", "(Lm2/r;I)V", "Lua4/g$a$a;", "l", "(Lua4/g$a$a;Lm2/r;I)V", "Lua4/g$a$e;", "t", "(Lua4/g$a$e;Lm2/r;I)V", "state", "schooltimetable_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f197046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y0 f197047h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i15, y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f197046g = i15;
            this.f197047h = y0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r1.q(r8, 0, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (f1.y0.r(r1, 0, 0, r7, 2, null) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f197045f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                oq.u.b(r8)
                goto L41
            L1b:
                oq.u.b(r8)
                int r8 = r7.f197046g
                if (r8 < 0) goto L31
                int r8 = r8 + r3
                f1.y0 r1 = r7.f197047h
                r7.f197044e = r8
                r7.f197045f = r3
                r2 = 0
                java.lang.Object r8 = r1.q(r8, r2, r7)
                if (r8 != r0) goto L41
                goto L40
            L31:
                f1.y0 r1 = r7.f197047h
                r7.f197045f = r2
                r2 = 0
                r3 = 0
                r5 = 2
                r6 = 0
                r4 = r7
                java.lang.Object r8 = f1.y0.r(r1, r2, r3, r4, r5, r6)
                if (r8 != r0) goto L41
            L40:
                return r0
            L41:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ua4.s.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f197046g, this.f197047h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f197048a;

        public b(List list) {
            this.f197048a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f197048a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f197049a;

        public c(List list) {
            this.f197049a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
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
            DefaultSingleCardData defaultSingleCardData = (DefaultSingleCardData) this.f197049a.get(i15);
            rVar.X(-77345819);
            if (i15 > 0) {
                rVar.X(-77333017);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            } else {
                rVar.X(-81653301);
            }
            rVar.R();
            n50.h0.v(defaultSingleCardData, null, rVar, 0, 2);
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

    private static final g.a A(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(g gVar, int i15, p076m2.r rVar, int i16) {
        z(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final g.a.DisplayingTimetable displayingTimetable, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2095540083);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayingTimetable) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2095540083, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.DisplayingTimetableContent (TimetableScreen.kt:59)");
            }
            i50.s.r(displayingTimetable.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1302524774, true, new er.q() { // from class: ua4.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.m(displayingTimetable, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, displayingTimetable.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ua4.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.q(displayingTimetable, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(final g.a.DisplayingTimetable displayingTimetable, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            int i17 = -1;
            if (p076m2.t.k()) {
                p076m2.t.o(1302524774, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.DisplayingTimetableContent.<anonymous> (TimetableScreen.kt:61)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(mVarL, a3.i(aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing100(), aVar.b(rVar, i18).getSpacing200(), 0.0f, 8, null)), 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            l30.t.s(displayingTimetable.getCalendarData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            if (displayingTimetable.getEmptyStateData() != null) {
                rVar.X(-306073351);
                x30.c.c(null, 0.0f, y2.m.d(-608717772, true, new er.p() { // from class: ua4.q
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.n(displayingTimetable, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
                rVar.R();
            } else {
                rVar.X(-305917700);
                final TimetableDayViewData day = displayingTimetable.getDay();
                if (day == null) {
                    rVar.X(-305917701);
                    rVar.R();
                } else {
                    rVar.X(-305917700);
                    Iterator<DefaultSingleCardData> it = day.b().iterator();
                    int i19 = 0;
                    while (it.hasNext()) {
                        if (it.next().getContainerBorderEnabled()) {
                            i17 = i19;
                            break;
                        }
                        i19++;
                    }
                    y0 y0VarC = b1.c(0, 0, rVar, 0, 3);
                    fz.b.LocalDate selectedDate = displayingTimetable.getCalendarData().getSelectedDate();
                    boolean zC = rVar.c(i17) | rVar.W(y0VarC);
                    Object objE = rVar.E();
                    if (zC || objE == p076m2.r.INSTANCE.a()) {
                        objE = new a(i17, y0VarC, null);
                        rVar.v(objE);
                    }
                    Function0.d(selectedDate, (er.p) objE, rVar, fz.b.LocalDate.f68860b);
                    f3.m mVarF2 = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                    k70.a aVar2 = k70.a.f108864a;
                    int i25 = k70.a.f108865b;
                    d3 d3VarI = a3.i(0.0f, aVar2.b(rVar, i25).getSpacing100(), 0.0f, aVar2.b(rVar, i25).getSpacing200(), 5, null);
                    boolean zG = rVar.G(day);
                    Object objE2 = rVar.E();
                    if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new er.l() { // from class: ua4.r
                            @Override // er.l
                            public final Object b(Object obj) {
                                return s.o(day, (f1.q0) obj);
                            }
                        };
                        rVar.v(objE2);
                    }
                    f1.d.c(mVarF2, y0VarC, d3VarI, false, null, null, null, false, null, (er.l) objE2, rVar, 6, 504);
                    rVar.R();
                    oq.i0 i0Var2 = oq.i0.f148189a;
                }
                rVar.R();
            }
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
    public static final oq.i0 n(g.a.DisplayingTimetable displayingTimetable, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-608717772, i15, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.DisplayingTimetableContent.<anonymous>.<anonymous>.<anonymous> (TimetableScreen.kt:79)");
            }
            k40.d.c(null, displayingTimetable.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(final TimetableDayViewData timetableDayViewData, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(-396275386, true, new er.q() { // from class: ua4.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.p(timetableDayViewData, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        List<DefaultSingleCardData> listB = timetableDayViewData.b();
        q0Var.j(listB.size(), null, new b(listB), y2.m.b(2039820996, true, new c(listB)));
        f1.q0.c(q0Var, null, null, ua4.b.f196882a.b(), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(TimetableDayViewData timetableDayViewData, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-396275386, i15, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.DisplayingTimetableContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimetableScreen.kt:105)");
            }
            Label lessonsCountLabel = timetableDayViewData.getLessonsCountLabel();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, lessonsCountLabel, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(g.a.DisplayingTimetable displayingTimetable, int i15, p076m2.r rVar, int i16) {
        l(displayingTimetable, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final g.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1131133440);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1131133440, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.TimetableContent (TimetableScreen.kt:41)");
            }
            if (aVar instanceof g.a.d) {
                rVarH.X(-392505998);
                x(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof g.a.c) {
                rVarH.X(-392503598);
                x(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof g.a.TimetableEmptyState) {
                rVarH.X(-392501216);
                t((g.a.TimetableEmptyState) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof g.a.DisplayingTimetable) {
                rVarH.X(-392498393);
                l((g.a.DisplayingTimetable) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof g.a.ErrorLoadingTimetable)) {
                    rVarH.X(-392507702);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-392494872);
                ((g.a.ErrorLoadingTimetable) aVar).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ua4.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.s(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(g.a aVar, int i15, p076m2.r rVar, int i16) {
        r(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(final g.a.TimetableEmptyState timetableEmptyState, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-878458520);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(timetableEmptyState) : rVarH.G(timetableEmptyState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-878458520, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.TimetableEmptyState (TimetableScreen.kt:131)");
            }
            rVar2 = rVarH;
            i50.s.r(timetableEmptyState.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1783986389, true, new er.q() { // from class: ua4.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.u(timetableEmptyState, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ua4.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.w(timetableEmptyState, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(final g.a.TimetableEmptyState timetableEmptyState, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1783986389, i15, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.TimetableEmptyState.<anonymous> (TimetableScreen.kt:133)");
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
            x30.c.c(null, 0.0f, y2.m.d(-794833236, true, new er.p() { // from class: ua4.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.v(timetableEmptyState, (p076m2.r) obj, ((Integer) obj2).intValue());
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
    public static final oq.i0 v(g.a.TimetableEmptyState timetableEmptyState, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-794833236, i15, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.TimetableEmptyState.<anonymous>.<anonymous>.<anonymous> (TimetableScreen.kt:142)");
            }
            k40.d.c(null, timetableEmptyState.getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(g.a.TimetableEmptyState timetableEmptyState, int i15, p076m2.r rVar, int i16) {
        t(timetableEmptyState, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void x(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1047011565);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1047011565, i15, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.TimetableLoading (TimetableScreen.kt:52)");
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
            d5VarM.a(new er.p() { // from class: ua4.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.y(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(int i15, p076m2.r rVar, int i16) {
        x(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-796700593);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-796700593, i16, -1, "pl.gov.coi.shared.feature.schooltimetable.presentation.screens.timetable.TimetableScreen (TimetableScreen.kt:35)");
            }
            r(A(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ua4.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.B(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
