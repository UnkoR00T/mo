package p046f2;

import h2.CalendarMonth;
import h2.l0;
import h2.o0;
import java.util.Locale;
import lr.i;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\n\u001a\u00060\bj\u0002`\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR$\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\r\u0010'¨\u0006)"}, d2 = {"Lf2/h0;", "", "", "initialDisplayedMonthMillis", "Llr/i;", "yearRange", "Lf2/pi;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Llr/i;Lf2/pi;Ljava/util/Locale;)V", "a", "Llr/i;", "c", "()Llr/i;", "b", "Ljava/util/Locale;", "g", "()Ljava/util/Locale;", "Lh2/l0;", "Lh2/l0;", "m", "()Lh2/l0;", "calendarModel", "<set-?>", "d", "Lm2/a3;", "()Lf2/pi;", "n", "(Lf2/pi;)V", "Lm2/a3;", "Lh2/p0;", "e", "_displayedMonth", "monthMillis", "f", "()J", "(J)V", "displayedMonthMillis", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i yearRange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l0 calendarModel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 selectableDates;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a3<CalendarMonth> _displayedMonth;

    public h0(Long l15, i iVar, pi piVar, Locale locale) {
        CalendarMonth calendarMonthI;
        this.yearRange = iVar;
        this.locale = locale;
        l0 l0VarA = o0.a(locale);
        this.calendarModel = l0VarA;
        this.selectableDates = c6.e(piVar, null, 2, null);
        if (l15 != null) {
            calendarMonthI = l0VarA.h(l15.longValue());
            if (!iVar.q(calendarMonthI.getYear())) {
                calendarMonthI = l0VarA.i(l0VarA.j());
            }
        } else {
            calendarMonthI = l0VarA.i(l0VarA.j());
        }
        this._displayedMonth = c6.e(calendarMonthI, null, 2, null);
    }

    public final void a(long j15) {
        CalendarMonth calendarMonthH = this.calendarModel.h(j15);
        if (this.yearRange.q(calendarMonthH.getYear())) {
            this._displayedMonth.setValue(calendarMonthH);
        }
    }

    public final pi b() {
        return (pi) this.selectableDates.getValue();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getYearRange() {
        return this.yearRange;
    }

    public final long f() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final l0 getCalendarModel() {
        return this.calendarModel;
    }

    public final void n(pi piVar) {
        this.selectableDates.setValue(piVar);
    }
}
