package e94;

import androidx.compose.ui.graphics.Color;
import er.p;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import s84.AttendanceDay;
import s84.AttendanceEntry;
import s84.AttendanceStatusDetails;
import s84.h;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Le94/a;", "Lxw/f;", "Le94/a$a;", "Lc94/c$b;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lc94/b$a;", "state", "params", "Lc94/c$b$a;", "i", "(Lc94/b$a;Le94/a$a;)Lc94/c$b$a;", "Ls84/a;", "day", "Ls84/h;", "attendanceType", "Lc94/c$a;", "h", "(Ls84/a;Ls84/h;)Lc94/c$a;", "", "Ls84/b;", "attendances", "Ln30/b;", "c", "(Ljava/util/List;Ls84/h;)Ln30/b;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lx50/i;", "e", "(Ls84/h;Ler/a;)Lx50/i;", "f", "(Le94/a$a;)Lc94/c$b;", "a", "Lmx/c;", "b", "Lez/e;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c94.c.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: e94.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Le94/a$a;", "", "Lc94/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lc94/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc94/b;", "b", "()Lc94/b;", "Ler/a;", "()Ler/a;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c94.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(c94.b bVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c94.b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48798a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.ABSENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.JUSTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.EXCUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.LATENESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.SCHOOL_REASONS_ABSENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f48798a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f48799a;

        /* JADX INFO: renamed from: e94.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C1142a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48800a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.JUSTIFICATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.ABSENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.EXCUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[h.LATENESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[h.SCHOOL_REASONS_ABSENCE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f48800a = iArr;
            }
        }

        c(h hVar) {
            this.f48799a = hVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long j15;
            rVar.X(-2015732893);
            if (p076m2.t.k()) {
                p076m2.t.o(-2015732893, i15, -1, "pl.gov.coi.shared.feature.schoolattendance.presentation.screens.attendancestatusdetails.mapper.AttendanceStatusDetailsMapper.buildCardListData.<anonymous>.<anonymous> (AttendanceStatusDetailsMapper.kt:133)");
            }
            int i16 = C1142a.f48800a[this.f48799a.ordinal()];
            if (i16 == 1) {
                rVar.X(-89056082);
                j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
                rVar.R();
            } else if (i16 == 2) {
                rVar.X(-89053585);
                j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
            } else if (i16 == 3) {
                rVar.X(-89051091);
                j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                rVar.R();
            } else if (i16 == 4) {
                rVar.X(-89048591);
                j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
                rVar.R();
            } else {
                if (i16 != 5) {
                    rVar.X(-89058711);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-89045521);
                j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return j15;
        }
    }

    public a(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final CardListData c(List<AttendanceEntry> attendances, h attendanceType) {
        int i15;
        List<AttendanceEntry> list = attendances;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            AttendanceEntry attendanceEntry = (AttendanceEntry) obj;
            StringBuilder sb5 = new StringBuilder();
            OffsetDateTime fromTime = attendanceEntry.getFromTime();
            fz.c cVar = fz.c.ONLY_HOUR;
            sb5.append(fromTime.format(DateTimeFormatter.ofPattern(cVar.getFormat())));
            sb5.append(" - ");
            sb5.append(attendanceEntry.getToTime().format(DateTimeFormatter.ofPattern(cVar.getFormat())));
            i0 i0Var = i0.f148189a;
            BodySection bodySection = new BodySection(new SingleCardLabel(mx.b.b(sb5.toString(), "absenceTimeAt" + i16), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(attendanceEntry.getSubjectName(), "absenceSubjectAt" + i16), null, null, 0, 0, null, 62, null)), null, 4, null);
            int i18 = b.f48798a[attendanceType.ordinal()];
            if (i18 == 1) {
                i15 = jz.a.f106804k;
            } else if (i18 == 2) {
                i15 = jz.a.K1;
            } else if (i18 == 3) {
                i15 = jz.a.F0;
            } else if (i18 == 4) {
                i15 = jz.a.f106797j;
            } else {
                if (i18 != 5) {
                    throw new oq.p();
                }
                i15 = jz.a.f106827n1;
            }
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, new LeadingSection(false, null, new i.Icon(i15, null, new c(attendanceType), null, null, 26, null), 3, null), null, null, 3327, null));
            i16 = i17;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    private final x50.i e(h attendanceType, er.a<i0> onBack) {
        int i15;
        mx.c cVar = this.labelProvider;
        int[] iArr = b.f48798a;
        int i16 = iArr[attendanceType.ordinal()];
        if (i16 == 1) {
            i15 = o84.a.f143344b;
        } else if (i16 == 2) {
            i15 = o84.a.f143349g;
        } else if (i16 == 3) {
            i15 = o84.a.f143347e;
        } else if (i16 == 4) {
            i15 = o84.a.f143351i;
        } else {
            if (i16 != 5) {
                throw new oq.p();
            }
            i15 = o84.a.f143353k;
        }
        Label labelC = cVar.c(i15);
        int i17 = iArr[attendanceType.ordinal()];
        if (i17 != 1 && i17 != 2) {
            if (i17 == 3 || i17 == 4) {
                return new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), labelC, null, null, false, null, 60, null);
            }
            if (i17 != 5) {
                throw new oq.p();
            }
        }
        return new x50.i.Large(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), labelC, null, null, null, 28, null);
    }

    private final c94.c.AttendanceDayViewData h(AttendanceDay day, h attendanceType) {
        return new c94.c.AttendanceDayViewData(this.dateFormatter.c(day.getDate()), c(day.a(), attendanceType));
    }

    private final c94.c.b.Displaying i(c94.b.Displaying state, Params params) {
        int i15;
        AttendanceStatusDetails attendanceStatusDetails = state.getAttendanceStatusDetails();
        List<AttendanceDay> listA = attendanceStatusDetails != null ? attendanceStatusDetails.a() : null;
        if (listA == null) {
            listA = v.n();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, e(state.getAttendanceType(), params.a()), null, null, null, null, 60, null);
        List<AttendanceDay> list = listA;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((AttendanceDay) it.next(), state.getAttendanceType()));
        }
        mx.c cVar = this.labelProvider;
        int i16 = b.f48798a[state.getAttendanceType().ordinal()];
        if (i16 == 1) {
            i15 = o84.a.f143345c;
        } else if (i16 == 2) {
            i15 = o84.a.f143350h;
        } else if (i16 == 3) {
            i15 = o84.a.f143348f;
        } else if (i16 == 4) {
            i15 = o84.a.f143352j;
        } else {
            if (i16 != 5) {
                throw new oq.p();
            }
            i15 = o84.a.f143354l;
        }
        return new c94.c.b.Displaying(aVarA, baseScaffoldData, arrayList, listA.isEmpty() ? new EmptyStateData(null, cVar.c(i15), null, 4, null) : null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c94.c.b b(Params params) {
        c94.b state = params.getState();
        if (state instanceof c94.b.c) {
            return c94.c.b.C0658c.f24645a;
        }
        if (state instanceof c94.b.Displaying) {
            return i((c94.b.Displaying) state, params);
        }
        if (state instanceof c94.b.ErrorLoading) {
            return new c94.c.b.ErrorLoading(((c94.b.ErrorLoading) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
