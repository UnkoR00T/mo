package rp1;

import er.l;
import ez.e;
import fr.t;
import fz.b;
import i50.BaseScaffoldData;
import l30.CalendarData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import qp1.State;
import qp1.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrp1/a;", "Lxw/f;", "Lrp1/a$a;", "Lqp1/c$a;", "Lez/e;", "dateFormatter", "<init>", "(Lez/e;)V", "params", "c", "(Lrp1/a$a;)Lqp1/c$a;", "a", "Lez/e;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: rp1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006#"}, d2 = {"Lrp1/a$a;", "", "Lqp1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lfz/b$c;", "onSelectDate", "onViewFirstDayOfWeek", "onOpenDatePicker", "<init>", "(Lqp1/b;Ler/a;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqp1/b;", "e", "()Lqp1/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f175394f = b.LocalDate.f68860b | b.YearMonth.f68872b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b.LocalDate, i0> onSelectDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b.LocalDate, i0> onViewFirstDayOfWeek;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenDatePicker;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super b.LocalDate, i0> lVar, l<? super b.LocalDate, i0> lVar2, er.a<i0> aVar2) {
            this.state = state;
            this.onBack = aVar;
            this.onSelectDate = lVar;
            this.onViewFirstDayOfWeek = lVar2;
            this.onOpenDatePicker = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onOpenDatePicker;
        }

        public final l<b.LocalDate, i0> c() {
            return this.onSelectDate;
        }

        public final l<b.LocalDate, i0> d() {
            return this.onViewFirstDayOfWeek;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onSelectDate, params.onSelectDate) && t.c(this.onViewFirstDayOfWeek, params.onViewFirstDayOfWeek) && t.c(this.onOpenDatePicker, params.onOpenDatePicker);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onSelectDate.hashCode()) * 31) + this.onViewFirstDayOfWeek.hashCode()) * 31) + this.onOpenDatePicker.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onSelectDate=" + this.onSelectDate + ", onViewFirstDayOfWeek=" + this.onViewFirstDayOfWeek + ", onOpenDatePicker=" + this.onOpenDatePicker + ')';
        }
    }

    public a(e eVar) {
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        Label labelB;
        String strD = this.dateFormatter.d(params.getState().getSelectedDate(), fz.c.FULLDAY_DATEDOT);
        String strB = dz.e.b(this.dateFormatter.d(params.getState().getDominantYearMonth(), fz.c.MONTH_YEAR), null, 1, null);
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Calendar (1.0.0)", ""), null, null, false, null, 60, null), null, null, null, null, 61, null);
        Label labelB2 = mx.b.b("Komponent kalendarza wyświetla pojedynczy tydzień i umożliwia przewijanie do poprzednich i następnych tygodni. Możliwy jest wybór dnia.", "");
        CalendarData calendarData = new CalendarData(null, strB, params.getState().getFirstDayInCurrentWeekDate(), params.getState().getCurrentDate(), params.getState().getSelectedDate(), params.d(), params.c(), params.b(), params.getState().getScrollTrigger(), 1, null);
        if (t.c(params.getState().getSelectedDate(), params.getState().getCurrentDate())) {
            labelB = mx.b.b("Wybrana jest dzisiejsza data", "");
        } else {
            labelB = mx.b.b("Zmieniono datę na " + strD, "");
        }
        return new c.Data(baseScaffoldData, calendarData, labelB2, labelB, params.a());
    }
}
