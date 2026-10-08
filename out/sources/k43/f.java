package k43;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import f43.ChildStudent;
import f43.LatestAbsence;
import f43.LatestGrade;
import f43.NextLesson;
import fr.t;
import g70.ShortcutMoreData;
import g70.ShortcutMoreTransferData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.k;
import n50.x0;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u000f*\u00020\u00122\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u000f*\u00020\u00172\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lk43/f;", "Lxw/f;", "Lk43/f$a;", "Li43/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lf43/f;", "Lkotlin/Function1;", "", "Loq/i0;", "onCardClick", "Ln50/k;", "u", "(Lf43/f;Ler/l;)Ln50/k;", "Lf43/d;", "Lkotlin/Function2;", "Lf43/e;", "s", "(Lf43/d;Ler/p;)Ln50/k;", "Lf43/g;", "v", "(Lf43/g;Ler/l;)Ln50/k;", "Ljava/time/OffsetDateTime;", "fromDateTime", "toDateTime", "l", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Ljava/lang/String;", "params", "m", "(Lk43/f$a;)Li43/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, i43.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: k43.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b)\u0010'R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b,\u0010.R)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b \u00101R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b/\u0010.R)\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b+\u0010.¨\u00062"}, d2 = {"Lk43/f$a;", "", "Li43/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onGradesClick", "onScheduleClick", "onAttendanceClick", "onBehaviorClick", "Lkotlin/Function1;", "", "onGradeCardClick", "Lkotlin/Function2;", "Lf43/e;", "onAbsenceCardClick", "onLessonCardClick", "", "Lg70/b;", "onGoToMoreShortcuts", "<init>", "(Li43/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/p;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li43/b;", "j", "()Li43/b;", "b", "Ler/a;", "c", "()Ler/a;", "g", "d", "i", "e", "f", "Ler/l;", "()Ler/l;", "h", "Ler/p;", "()Ler/p;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i43.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGradesClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScheduleClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAttendanceClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBehaviorClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onGradeCardClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, f43.e, i0> onAbsenceCardClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLessonCardClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<List<ShortcutMoreTransferData>, i0> onGoToMoreShortcuts;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i43.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, l<? super String, i0> lVar, p<? super String, ? super f43.e, i0> pVar, l<? super String, i0> lVar2, l<? super List<ShortcutMoreTransferData>, i0> lVar3) {
            this.state = bVar;
            this.onBack = aVar;
            this.onGradesClick = aVar2;
            this.onScheduleClick = aVar3;
            this.onAttendanceClick = aVar4;
            this.onBehaviorClick = aVar5;
            this.onGradeCardClick = lVar;
            this.onAbsenceCardClick = pVar;
            this.onLessonCardClick = lVar2;
            this.onGoToMoreShortcuts = lVar3;
        }

        public final p<String, f43.e, i0> a() {
            return this.onAbsenceCardClick;
        }

        public final er.a<i0> b() {
            return this.onAttendanceClick;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        public final er.a<i0> d() {
            return this.onBehaviorClick;
        }

        public final l<List<ShortcutMoreTransferData>, i0> e() {
            return this.onGoToMoreShortcuts;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onGradesClick, params.onGradesClick) && t.c(this.onScheduleClick, params.onScheduleClick) && t.c(this.onAttendanceClick, params.onAttendanceClick) && t.c(this.onBehaviorClick, params.onBehaviorClick) && t.c(this.onGradeCardClick, params.onGradeCardClick) && t.c(this.onAbsenceCardClick, params.onAbsenceCardClick) && t.c(this.onLessonCardClick, params.onLessonCardClick) && t.c(this.onGoToMoreShortcuts, params.onGoToMoreShortcuts);
        }

        public final l<String, i0> f() {
            return this.onGradeCardClick;
        }

        public final er.a<i0> g() {
            return this.onGradesClick;
        }

        public final l<String, i0> h() {
            return this.onLessonCardClick;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onGradesClick.hashCode()) * 31) + this.onScheduleClick.hashCode()) * 31) + this.onAttendanceClick.hashCode()) * 31) + this.onBehaviorClick.hashCode()) * 31) + this.onGradeCardClick.hashCode()) * 31) + this.onAbsenceCardClick.hashCode()) * 31) + this.onLessonCardClick.hashCode()) * 31) + this.onGoToMoreShortcuts.hashCode();
        }

        public final er.a<i0> i() {
            return this.onScheduleClick;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final i43.b getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onGradesClick=" + this.onGradesClick + ", onScheduleClick=" + this.onScheduleClick + ", onAttendanceClick=" + this.onAttendanceClick + ", onBehaviorClick=" + this.onBehaviorClick + ", onGradeCardClick=" + this.onGradeCardClick + ", onAbsenceCardClick=" + this.onAbsenceCardClick + ", onLessonCardClick=" + this.onLessonCardClick + ", onGoToMoreShortcuts=" + this.onGoToMoreShortcuts + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LatestAbsence f108410a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f108411a;

            static {
                int[] iArr = new int[f43.e.values().length];
                try {
                    iArr[f43.e.JUSTIFICATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f43.e.ABSENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f43.e.EXCUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f43.e.LATENESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[f43.e.SCHOOL_REASONS_ABSENCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[f43.e.UNKNOWN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f108411a = iArr;
            }
        }

        b(LatestAbsence latestAbsence) {
            this.f108410a = latestAbsence;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long j15;
            rVar.X(-1189452508);
            if (p076m2.t.k()) {
                p076m2.t.o(-1189452508, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.childdashboard.mapper.SchoolChildDashboardMapper.toCard.<anonymous>.<anonymous> (SchoolChildDashboardMapper.kt:188)");
            }
            switch (a.f108411a[this.f108410a.getAbsenceType().ordinal()]) {
                case 1:
                    rVar.X(-602555857);
                    j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
                    rVar.R();
                    break;
                case 2:
                    rVar.X(-602553264);
                    j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                    break;
                case 3:
                    rVar.X(-602550674);
                    j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                    rVar.R();
                    break;
                case 4:
                    rVar.X(-602548078);
                    j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
                    rVar.R();
                    break;
                case 5:
                    rVar.X(-602544912);
                    j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                    break;
                case 6:
                    rVar.X(-602542290);
                    j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                    rVar.R();
                    break;
                default:
                    rVar.X(-602558394);
                    rVar.R();
                    throw new oq.p();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return j15;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f108412a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(601558934);
            if (p076m2.t.k()) {
                p076m2.t.o(601558934, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.childdashboard.mapper.SchoolChildDashboardMapper.toCard.<anonymous>.<anonymous> (SchoolChildDashboardMapper.kt:222)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public f(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(l lVar, NextLesson nextLesson) {
        lVar.b(nextLesson.getLessonId());
        return i0.f148189a;
    }

    private final String l(OffsetDateTime fromDateTime, OffsetDateTime toDateTime) {
        String strC = this.dateFormatter.c(fromDateTime);
        ez.e eVar = this.dateFormatter;
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(fromDateTime);
        fz.c cVar = fz.c.ONLY_HOUR;
        return strC + ", " + eVar.d(offsetDateTime, cVar) + '-' + this.dateFormatter.d(new fz.b.OffsetDateTime(toDateTime), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r() {
        return i0.f148189a;
    }

    private final k s(final LatestAbsence latestAbsence, final p<? super String, ? super f43.e, i0> pVar) {
        er.a aVar = new er.a() { // from class: k43.b
            @Override // er.a
            public final Object a() {
                return f.z(pVar, latestAbsence);
            }
        };
        BodySection bodySection = new BodySection(new SingleCardLabel(mx.b.b(l(latestAbsence.getFromTime(), latestAbsence.getToTime()), "SchoolChildDashboardAbsenceDateTime"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(latestAbsence.getSubject(), "SchoolChildDashboardAbsenceSubject"), null, null, 0, 0, null, 62, null)), null, 4, null);
        Integer numE = g.e(latestAbsence.getAbsenceType());
        return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, bodySection, numE != null ? new LeadingSection(false, null, new i.Icon(numE.intValue(), null, new b(latestAbsence), null, null, 26, null), 3, null) : null, x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    private final k u(final LatestGrade latestGrade, final l<? super String, i0> lVar) {
        er.a aVar = new er.a() { // from class: k43.c
            @Override // er.a
            public final Object a() {
                return f.x(lVar, latestGrade);
            }
        };
        BodySection bodySection = new BodySection(new SingleCardLabel(mx.b.b(this.dateFormatter.c(latestGrade.getCreatedAt()), "SchoolChildDashboardGradeDate"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(latestGrade.getGrade(), "SchoolChildDashboardGradeValue"), null, null, 2, 0, null, 54, null)), new SingleCardLabel(mx.b.b(latestGrade.getSubject(), "SchoolChildDashboardGradeSubject"), null, null, 0, 0, null, 62, null));
        Integer numD = g.d(latestGrade.getIcon());
        return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, bodySection, numD != null ? new LeadingSection(false, null, new i.Resource(new i.Resource.a.DrawableResource(numD.intValue(), null, 2, null), null, null, 6, null), 3, null) : null, x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    private final k v(final NextLesson nextLesson, final l<? super String, i0> lVar) {
        er.a aVar = new er.a() { // from class: k43.a
            @Override // er.a
            public final Object a() {
                return f.E(lVar, nextLesson);
            }
        };
        BodySection bodySection = new BodySection(new SingleCardLabel(mx.b.b(l(nextLesson.getFromTime(), nextLesson.getToTime()), "SchoolChildDashboardNextLessonDateTime"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(nextLesson.getTitle(), "SchoolChildDashboardNextLessonTitle"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(nextLesson.getDescription(), "SchoolChildDashboardNextLessonDescription"), null, null, 0, 0, null, 62, null));
        Integer numF = g.f(nextLesson.getIconType());
        return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, bodySection, numF != null ? new LeadingSection(false, null, new i.Icon(numF.intValue(), null, c.f108412a, null, null, 26, null), 3, null) : null, x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(l lVar, LatestGrade latestGrade) {
        lVar.b(latestGrade.getId());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(p pVar, LatestAbsence latestAbsence) {
        pVar.B(latestAbsence.getSemesterId(), latestAbsence.getAbsenceType());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i43.c.a b(Params params) {
        i43.b state = params.getState();
        if (state instanceof i43.b.c) {
            return i43.c.a.C2109c.f89236a;
        }
        if (!(state instanceof i43.b.DisplayingChildDashboard)) {
            if (state instanceof i43.b.ErrorChildDashboard) {
                return new i43.c.a.ErrorChildDashboard(((i43.b.ErrorChildDashboard) state).getErrorVMSAdapter());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(c43.a.f23387n), null, null, null, 28, null), null, null, null, null, 61, null);
        i43.b.DisplayingChildDashboard displayingChildDashboard = (i43.b.DisplayingChildDashboard) state;
        ChildStudent child = displayingChildDashboard.getChild();
        Label labelC = this.labelProvider.c(c43.a.f23378e);
        int i15 = jz.a.J0;
        o50.f.c cVar = o50.f.c.f142478a;
        ShortcutsLayoutData shortcutsLayoutData = new ShortcutsLayoutData(v.L0(v.q(new SmallCardData(null, labelC, null, i15, cVar, false, params.g(), 37, null), new SmallCardData(null, this.labelProvider.c(c43.a.f23377d), null, jz.a.f106759e, cVar, false, params.i(), 37, null), new SmallCardData(null, this.labelProvider.c(c43.a.f23382i), null, jz.a.E0, cVar, false, params.b(), 37, null), new SmallCardData(null, this.labelProvider.c(c43.a.f23376c), null, jz.a.f106761e1, cVar, false, params.d(), 37, null)), displayingChildDashboard.getIsSchoolInfoFlagEnabled() ? v.q(new SmallCardData(null, this.labelProvider.c(c43.a.f23384k), null, jz.a.G0, cVar, false, new er.a() { // from class: k43.d
            @Override // er.a
            public final Object a() {
                return f.q();
            }
        }, 37, null), new SmallCardData(null, this.labelProvider.c(c43.a.f23383j), null, jz.a.X0, cVar, false, new er.a() { // from class: k43.e
            @Override // er.a
            public final Object a() {
                return f.r();
            }
        }, 37, null)) : v.n()), new ShortcutMoreData(this.labelProvider.c(c43.a.f23374a), params.e()));
        Label labelC2 = this.labelProvider.c(c43.a.f23380g);
        Label labelC3 = this.labelProvider.c(c43.a.f23379f);
        Label labelC4 = this.labelProvider.c(c43.a.f23381h);
        LatestGrade latestGrade = displayingChildDashboard.getChild().getLatestGrade();
        k kVarU = latestGrade != null ? u(latestGrade, params.f()) : null;
        LatestAbsence latestAbsence = displayingChildDashboard.getChild().getLatestAbsence();
        k kVarS = latestAbsence != null ? s(latestAbsence, params.a()) : null;
        NextLesson nextLesson = displayingChildDashboard.getChild().getNextLesson();
        return new i43.c.a.DisplayingChildDashboard(baseScaffoldData, child, shortcutsLayoutData, labelC2, kVarU, labelC3, kVarS, labelC4, nextLesson != null ? v(nextLesson, params.h()) : null, params.c());
    }
}
