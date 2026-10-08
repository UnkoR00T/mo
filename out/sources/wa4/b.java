package wa4;

import er.l;
import ez.e;
import ez.h;
import fr.t;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import l30.CalendarData;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oa4.TimetableDay;
import oa4.TimetableSlot;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import pq.v;
import ua4.TimetableContext;
import ua4.TimetableDayViewData;
import ua4.d;
import ua4.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u00020\u0016*\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001d\u001a\u00020\u001c*\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u001f*\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140&H\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lwa4/b;", "Lxw/f;", "Lwa4/b$a;", "Lua4/g$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lez/h;", "timeProvider", "<init>", "(Lmx/c;Lez/e;Lez/h;)V", "", "Loa4/f;", "Ljava/time/LocalDate;", "selectedDate", "Ljava/time/OffsetDateTime;", "currentTime", "Lkotlin/Function1;", "", "Loq/i0;", "onLessonClick", "Lua4/f;", "f", "(Ljava/util/List;Ljava/time/LocalDate;Ljava/time/OffsetDateTime;Ler/l;)Lua4/f;", "r", "(Loa4/f;Ljava/time/OffsetDateTime;Ler/l;)Lua4/f;", "Loa4/g;", "Ln50/g;", "m", "(Loa4/g;Ljava/time/OffsetDateTime;Ler/l;)Ln50/g;", "", "i", "(Loa4/g;Ljava/time/OffsetDateTime;)Z", "Loa4/h;", "", "l", "(Loa4/h;)Ljava/lang/Integer;", "Lkotlin/Function0;", "onBack", "Li50/a;", "e", "(Ler/a;)Li50/a;", "params", "h", "(Lwa4/b$a;)Lua4/g$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lez/h;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: wa4.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b \u0010\u001fR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010#¨\u0006%"}, d2 = {"Lwa4/b$a;", "", "Lua4/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lfz/b$c;", "onSelectDate", "onViewFirstDayOfWeek", "onOpenDatePicker", "", "onLessonClick", "<init>", "(Lua4/d;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lua4/d;", "f", "()Lua4/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "e", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<fz.b.LocalDate, i0> onSelectDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<fz.b.LocalDate, i0> onViewFirstDayOfWeek;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenDatePicker;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLessonClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, l<? super fz.b.LocalDate, i0> lVar, l<? super fz.b.LocalDate, i0> lVar2, er.a<i0> aVar2, l<? super String, i0> lVar3) {
            this.state = dVar;
            this.onBack = aVar;
            this.onSelectDate = lVar;
            this.onViewFirstDayOfWeek = lVar2;
            this.onOpenDatePicker = aVar2;
            this.onLessonClick = lVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<String, i0> b() {
            return this.onLessonClick;
        }

        public final er.a<i0> c() {
            return this.onOpenDatePicker;
        }

        public final l<fz.b.LocalDate, i0> d() {
            return this.onSelectDate;
        }

        public final l<fz.b.LocalDate, i0> e() {
            return this.onViewFirstDayOfWeek;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onSelectDate, params.onSelectDate) && t.c(this.onViewFirstDayOfWeek, params.onViewFirstDayOfWeek) && t.c(this.onOpenDatePicker, params.onOpenDatePicker) && t.c(this.onLessonClick, params.onLessonClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onSelectDate.hashCode()) * 31) + this.onViewFirstDayOfWeek.hashCode()) * 31) + this.onOpenDatePicker.hashCode()) * 31) + this.onLessonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onSelectDate=" + this.onSelectDate + ", onViewFirstDayOfWeek=" + this.onViewFirstDayOfWeek + ", onOpenDatePicker=" + this.onOpenDatePicker + ", onLessonClick=" + this.onLessonClick + ')';
        }
    }

    /* JADX INFO: renamed from: wa4.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5576b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f211773a;

        static {
            int[] iArr = new int[oa4.h.values().length];
            try {
                iArr[oa4.h.PEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oa4.h.LANGUAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oa4.h.RULER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[oa4.h.MAGNET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[oa4.h.COLUMN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[oa4.h.BACTERIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[oa4.h.ATOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[oa4.h.BALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[oa4.h.PALETTE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[oa4.h.COMPUTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[oa4.h.MUSIC_NOTE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[oa4.h.BELL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[oa4.h.HOURGLASS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[oa4.h.PUZZLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[oa4.h.BLOCKS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[oa4.h.GLOBE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[oa4.h.BUILDING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[oa4.h.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[oa4.h.GLASSES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[oa4.h.SUPPORT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[oa4.h.LEAF.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[oa4.h.APPLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[oa4.h.HAND_GESTURE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[oa4.h.POOL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[oa4.h.BRIEFCASE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[oa4.h.BALANCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[oa4.h.SCISSORS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[oa4.h.SECURITY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[oa4.h.FOLDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[oa4.h.NOTEBOOK.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[oa4.h.CHART.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[oa4.h.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f211773a = iArr;
        }
    }

    public b(c cVar, e eVar, h hVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.timeProvider = hVar;
    }

    private final BaseScaffoldData e(er.a<i0> onBack) {
        return new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(ka4.a.f109658j), null, null, false, null, 60, null), null, null, null, null, 61, null);
    }

    private final TimetableDayViewData f(List<TimetableDay> list, LocalDate localDate, OffsetDateTime offsetDateTime, l<? super String, i0> lVar) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((TimetableDay) next).getDate(), localDate));
        TimetableDay timetableDay = (TimetableDay) next;
        if (timetableDay == null) {
            return null;
        }
        return r(timetableDay, offsetDateTime, lVar);
    }

    private final boolean i(TimetableSlot timetableSlot, OffsetDateTime offsetDateTime) {
        return offsetDateTime.isAfter(timetableSlot.getFromTime()) && offsetDateTime.isBefore(timetableSlot.getToTime());
    }

    private final Integer l(oa4.h hVar) {
        switch (C5576b.f211773a[hVar.ordinal()]) {
            case 1:
                return Integer.valueOf(jz.a.C5);
            case 2:
                return Integer.valueOf(jz.a.D5);
            case 3:
                return Integer.valueOf(jz.a.E5);
            case 4:
                return Integer.valueOf(jz.a.F5);
            case 5:
                return Integer.valueOf(jz.a.G5);
            case 6:
                return Integer.valueOf(jz.a.H5);
            case 7:
                return Integer.valueOf(jz.a.I5);
            case 8:
                return Integer.valueOf(jz.a.J5);
            case 9:
                return Integer.valueOf(jz.a.K5);
            case 10:
                return Integer.valueOf(jz.a.L5);
            case 11:
                return Integer.valueOf(jz.a.M5);
            case 12:
                return Integer.valueOf(jz.a.N5);
            case 13:
                return Integer.valueOf(jz.a.O5);
            case 14:
                return Integer.valueOf(jz.a.P5);
            case 15:
                return Integer.valueOf(jz.a.Q5);
            case 16:
                return Integer.valueOf(jz.a.R5);
            case 17:
                return Integer.valueOf(jz.a.S5);
            case 18:
                return Integer.valueOf(jz.a.T5);
            case 19:
                return Integer.valueOf(jz.a.U5);
            case 20:
                return Integer.valueOf(jz.a.V5);
            case 21:
                return Integer.valueOf(jz.a.W5);
            case 22:
                return Integer.valueOf(jz.a.X5);
            case 23:
                return Integer.valueOf(jz.a.Y5);
            case 24:
                return Integer.valueOf(jz.a.Z5);
            case 25:
                return Integer.valueOf(jz.a.f106734a6);
            case 26:
                return Integer.valueOf(jz.a.f106742b6);
            case 27:
                return Integer.valueOf(jz.a.f106750c6);
            case 28:
                return Integer.valueOf(jz.a.f106758d6);
            case 29:
                return Integer.valueOf(jz.a.f106766e6);
            case 30:
                return Integer.valueOf(jz.a.f106774f6);
            case BERTags.DATE /* 31 */:
                return Integer.valueOf(jz.a.f106782g6);
            case 32:
                return null;
            default:
                throw new p();
        }
    }

    private final DefaultSingleCardData m(TimetableSlot timetableSlot, OffsetDateTime offsetDateTime, final l<? super String, i0> lVar) {
        String str = "timetableSlot_" + timetableSlot.getNumber();
        final String lessonId = timetableSlot.getLessonId();
        SingleCardLabel singleCardLabel = null;
        er.a aVar = lessonId != null ? new er.a() { // from class: wa4.a
            @Override // er.a
            public final Object a() {
                return b.q(lVar, lessonId);
            }
        } : null;
        boolean z15 = offsetDateTime != null && i(timetableSlot, offsetDateTime);
        Integer numL = l(timetableSlot.getIconType());
        LeadingSection leadingSection = numL != null ? new LeadingSection(false, null, new n50.i.Icon(numL.intValue(), null, null, null, null, 30, null), 3, null) : null;
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(mx.b.b(timetableSlot.getNumber() + ". " + this.labelProvider.c(ka4.a.f109653e).getText() + " • " + timetableSlot.getFromTime().toLocalTime() + " - " + timetableSlot.getToTime().toLocalTime(), "slot_header_" + timetableSlot.getNumber()), null, null, 0, 0, null, 62, null);
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(timetableSlot.getTitle(), "slot_title_" + timetableSlot.getNumber()), null, null, 0, 0, null, 62, null));
        String classNumber = timetableSlot.getClassNumber();
        if (classNumber != null) {
            singleCardLabel = new SingleCardLabel(mx.b.b(this.labelProvider.c(ka4.a.f109652d).getText() + ' ' + classNumber, "slot_class_" + timetableSlot.getNumber()), null, null, 0, 0, null, 62, null);
        }
        return new DefaultSingleCardData(str, aVar, false, null, null, z15, null, null, new BodySection(singleCardLabel2, title, singleCardLabel), leadingSection, null, null, 3292, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    private final TimetableDayViewData r(TimetableDay timetableDay, OffsetDateTime offsetDateTime, l<? super String, i0> lVar) {
        Label labelB = mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(timetableDay.getDate()), fz.c.DOTTED), "timetable_day_" + timetableDay.getDate());
        Label labelB2 = mx.b.b(this.labelProvider.c(ka4.a.f109656h).getText() + ' ' + timetableDay.getNumberOfLessons(), "timetable_lessons_count_" + timetableDay.getDate());
        List<TimetableSlot> listC = timetableDay.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(m((TimetableSlot) it.next(), offsetDateTime, lVar));
        }
        return new TimetableDayViewData(labelB, labelB2, arrayList);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        d state = params.getState();
        if (state instanceof d.e) {
            return g.a.d.f197001a;
        }
        if (state instanceof d.LoadingMoreTimetable) {
            return g.a.c.f197000a;
        }
        if (state instanceof d.TimetableEmptyState) {
            BaseScaffoldData baseScaffoldDataE = e(params.a());
            d.TimetableEmptyState timetableEmptyState = (d.TimetableEmptyState) state;
            String title = timetableEmptyState.getMessage().getTitle();
            return new g.a.TimetableEmptyState(baseScaffoldDataE, new EmptyStateData(title != null ? mx.b.b(title, "timetable_emptyStateTitle") : null, mx.b.b(timetableEmptyState.getMessage().getMessage(), "timetable_emptyStateBody"), null, 4, null));
        }
        if (state instanceof d.ErrorLoadingMoreTimetable) {
            return new g.a.ErrorLoadingTimetable(((d.ErrorLoadingMoreTimetable) state).getErrorVMS());
        }
        if (state instanceof d.ErrorLoadingTimetable) {
            return new g.a.ErrorLoadingTimetable(((d.ErrorLoadingTimetable) state).getErrorVMS());
        }
        if (!(state instanceof d.DisplayingTimetable)) {
            throw new p();
        }
        d.DisplayingTimetable displayingTimetable = (d.DisplayingTimetable) state;
        TimetableContext context = displayingTimetable.getContext();
        LocalDate localDate = this.timeProvider.b(context.getCurrentTime(), fz.f.POLISH).toLocalDate();
        TimetableDayViewData timetableDayViewDataF = f(context.c(), displayingTimetable.getSelectedDate().getDate(), t.c(displayingTimetable.getSelectedDate().getDate(), localDate) ? context.getCurrentTime() : null, params.b());
        return new g.a.DisplayingTimetable(params.a(), e(params.a()), new CalendarData(null, dz.e.b(this.dateFormatter.d(context.getDominantYearMonth(), fz.c.MONTH_YEAR), null, 1, null), context.getCalendarAnchorDate(), new fz.b.LocalDate(localDate), displayingTimetable.getSelectedDate(), params.e(), params.d(), params.c(), displayingTimetable.getScrollTrigger(), 1, null), timetableDayViewDataF, (timetableDayViewDataF == null || timetableDayViewDataF.b().isEmpty()) ? new EmptyStateData(null, this.labelProvider.c(ka4.a.f109655g), null, 5, null) : null);
    }
}
