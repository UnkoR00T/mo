package x84;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q50.StatisticCardData;
import q50.TrailingSection;
import s84.AttendanceStatusSummary;
import s84.SemesterAttendanceSummary;
import s84.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y84.SemesterChangerData;
import y84.SemesterSheetItemData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lx84/d;", "Lxw/f;", "Lx84/d$a;", "Lv84/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lv84/b$b;", "state", "params", "Lv84/c$a$b;", "l", "(Lv84/b$b;Lx84/d$a;)Lv84/c$a$b;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "h", "(Ler/a;)Li50/a;", "Ls84/k;", "data", "Lkotlin/Function1;", "Ls84/c;", "onStatusSelected", "", "Lq50/a;", "s", "(Ls84/k;Ler/l;)Ljava/util/List;", "status", "", "r", "(Ls84/c;)I", "i", "(Lx84/d$a;)Lv84/c$a;", "a", "Lmx/c;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, v84.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: x84.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010!¨\u0006("}, d2 = {"Lx84/d$a;", "", "Lv84/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onChangeSemester", "onDismissChangeSemester", "Lkotlin/Function1;", "Ls84/k;", "onSemesterSelected", "Ls84/c;", "onStatusSelected", "onGoToAttendanceDetails", "<init>", "(Lv84/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv84/b;", "g", "()Lv84/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "f", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v84.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeSemester;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDismissChangeSemester;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<SemesterAttendanceSummary, i0> onSemesterSelected;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<s84.c, i0> onStatusSelected;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToAttendanceDetails;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(v84.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super SemesterAttendanceSummary, i0> lVar, l<? super s84.c, i0> lVar2, er.a<i0> aVar4) {
            this.state = bVar;
            this.onBack = aVar;
            this.onChangeSemester = aVar2;
            this.onDismissChangeSemester = aVar3;
            this.onSemesterSelected = lVar;
            this.onStatusSelected = lVar2;
            this.onGoToAttendanceDetails = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onChangeSemester;
        }

        public final er.a<i0> c() {
            return this.onDismissChangeSemester;
        }

        public final er.a<i0> d() {
            return this.onGoToAttendanceDetails;
        }

        public final l<SemesterAttendanceSummary, i0> e() {
            return this.onSemesterSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onChangeSemester, params.onChangeSemester) && t.c(this.onDismissChangeSemester, params.onDismissChangeSemester) && t.c(this.onSemesterSelected, params.onSemesterSelected) && t.c(this.onStatusSelected, params.onStatusSelected) && t.c(this.onGoToAttendanceDetails, params.onGoToAttendanceDetails);
        }

        public final l<s84.c, i0> f() {
            return this.onStatusSelected;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final v84.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onChangeSemester.hashCode()) * 31) + this.onDismissChangeSemester.hashCode()) * 31) + this.onSemesterSelected.hashCode()) * 31) + this.onStatusSelected.hashCode()) * 31) + this.onGoToAttendanceDetails.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onChangeSemester=" + this.onChangeSemester + ", onDismissChangeSemester=" + this.onDismissChangeSemester + ", onSemesterSelected=" + this.onSemesterSelected + ", onStatusSelected=" + this.onStatusSelected + ", onGoToAttendanceDetails=" + this.onGoToAttendanceDetails + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217433a;

        static {
            int[] iArr = new int[s84.c.values().length];
            try {
                iArr[s84.c.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s84.c.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s84.c.LATENESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s84.c.EXCUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s84.c.JUSTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s84.c.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f217433a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AttendanceStatusSummary f217434a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f217435a;

            static {
                int[] iArr = new int[s84.c.values().length];
                try {
                    iArr[s84.c.ABSENCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s84.c.SCHOOL_REASONS_ABSENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s84.c.LATENESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s84.c.EXCUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[s84.c.JUSTIFICATION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[s84.c.UNKNOWN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f217435a = iArr;
            }
        }

        c(AttendanceStatusSummary attendanceStatusSummary) {
            this.f217434a = attendanceStatusSummary;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jG;
            rVar.X(2030397329);
            if (p076m2.t.k()) {
                p076m2.t.o(2030397329, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancedashboard.mapper.AttendanceDashboardMapper.mapStatisticsData.<anonymous>.<anonymous> (AttendanceDashboardMapper.kt:135)");
            }
            switch (a.f217435a[this.f217434a.getStatus().ordinal()]) {
                case 1:
                    rVar.X(1296684189);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                    break;
                case 2:
                    rVar.X(1296687133);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                    break;
                case 3:
                    rVar.X(1296689631);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
                    rVar.R();
                    break;
                case 4:
                    rVar.X(1296692123);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                    rVar.R();
                    break;
                case 5:
                    rVar.X(1296694716);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
                    rVar.R();
                    break;
                case 6:
                    rVar.X(1296697147);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                    rVar.R();
                    break;
                default:
                    rVar.X(1296681690);
                    rVar.R();
                    throw new oq.p();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData h(er.a<i0> onBack) {
        return new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(o84.a.f143357o), null, null, false, null, 60, null), null, null, null, null, 60, null);
    }

    private final v84.c.a.Displaying l(v84.b.Displaying state, final Params params) {
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldDataH = h(params.a());
        SemesterChangerData semesterChangerData = state.getData().a().size() > 1 ? new SemesterChangerData(mx.b.b(state.getSelectedSemester().getTitle(), "attendanceSummary_semesterChangerTitle"), new ButtonTextData(null, this.labelProvider.c(o84.a.f143343a), null, null, params.b(), 13, null)) : null;
        Label labelB = mx.b.b(state.getSelectedSemester().getPresenceSummary().getTitle(), "attendanceSummary_status_PRESENCE");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(state.getSelectedSemester().getPresenceSummary().getSemesterAttendancePercentage());
        sb5.append('%');
        List listL0 = v.L0(v.e(new StatisticCardData(labelB, mx.b.b(sb5.toString(), "attendanceSummary_status_PRESENCE_count"), false, q50.i.b.f164798a, TrailingSection.INSTANCE.a(), jz.a.f106782g6, params.d(), 4, null)), s(state.getSelectedSemester(), params.f()));
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(state.getIsBottomSheetVisible() ? g30.v.EXPANDED : g30.v.HIDDEN, false, new l() { // from class: x84.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(params, (g30.v) obj);
            }
        }, 2, null), null, params.c(), null, 10, null);
        List<SemesterAttendanceSummary> listA = state.getData().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (final SemesterAttendanceSummary semesterAttendanceSummary : listA) {
            arrayList.add(new SemesterSheetItemData(semesterAttendanceSummary.getSemesterId(), mx.b.b(semesterAttendanceSummary.getTitle(), "semesterSheet_" + semesterAttendanceSummary.getSemesterId()), new er.a() { // from class: x84.c
                @Override // er.a
                public final Object a() {
                    return d.q(params, semesterAttendanceSummary);
                }
            }));
        }
        return new v84.c.a.Displaying(aVarA, baseScaffoldDataH, semesterChangerData, listL0, modalBottomSheetData, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, g30.v vVar) {
        if (vVar == g30.v.HIDDEN) {
            params.c().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, SemesterAttendanceSummary semesterAttendanceSummary) {
        params.e().b(semesterAttendanceSummary);
        return i0.f148189a;
    }

    private final int r(s84.c status) {
        switch (b.f217433a[status.ordinal()]) {
            case 1:
                return jz.a.f106804k;
            case 2:
                return jz.a.f106827n1;
            case 3:
                return jz.a.f106797j;
            case 4:
                return jz.a.F0;
            case 5:
                return jz.a.K1;
            case 6:
                return jz.a.f106782g6;
            default:
                throw new oq.p();
        }
    }

    private final List<StatisticCardData> s(SemesterAttendanceSummary data, final l<? super s84.c, i0> onStatusSelected) {
        List<AttendanceStatusSummary> listD = data.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        for (final AttendanceStatusSummary attendanceStatusSummary : listD) {
            arrayList.add(new StatisticCardData(mx.b.b(attendanceStatusSummary.getTitle(), "attendanceSummary_status_" + attendanceStatusSummary.getStatus().name()), mx.b.b(String.valueOf(attendanceStatusSummary.getCount()), "attendanceSummary_status_" + attendanceStatusSummary.getStatus().name() + "_count"), false, new q50.i.DefaultContainer(new c(attendanceStatusSummary)), TrailingSection.INSTANCE.a(), r(attendanceStatusSummary.getStatus()), new er.a() { // from class: x84.a
                @Override // er.a
                public final Object a() {
                    return d.u(attendanceStatusSummary, onStatusSelected);
                }
            }, 4, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(AttendanceStatusSummary attendanceStatusSummary, l lVar) {
        if (g.a(attendanceStatusSummary.getStatus()) != null) {
            lVar.b(attendanceStatusSummary.getStatus());
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public v84.c.a b(Params params) {
        v84.b state = params.getState();
        if (state instanceof v84.b.d) {
            return v84.c.a.d.f204787a;
        }
        if (state instanceof v84.b.AttendanceEmptyState) {
            BaseScaffoldData baseScaffoldDataH = h(params.a());
            v84.b.AttendanceEmptyState attendanceEmptyState = (v84.b.AttendanceEmptyState) state;
            String title = attendanceEmptyState.getMessage().getTitle();
            return new v84.c.a.AttendanceEmptyState(params.a(), baseScaffoldDataH, new EmptyStateData(title != null ? mx.b.b(title, "attendanceSummary_emptyState_title") : null, mx.b.b(attendanceEmptyState.getMessage().getMessage(), "attendanceSummary_emptyState_description"), null, 4, null));
        }
        if (state instanceof v84.b.Displaying) {
            return l((v84.b.Displaying) state, params);
        }
        if (state instanceof v84.b.ErrorLoadingInitialData) {
            return new v84.c.a.ErrorLoadingInitialData(((v84.b.ErrorLoadingInitialData) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
