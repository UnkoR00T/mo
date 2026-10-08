package p046f2;

import b3.b;
import b3.b0;
import b3.x;
import er.l;
import er.p;
import fr.k;
import h2.CalendarDate;
import java.util.List;
import java.util.Locale;
import lr.i;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001,BI\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010%\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010&\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010$R$\u0010'\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lf2/ma;", "Lf2/h0;", "Lf2/ja;", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Llr/i;", "yearRange", "Lf2/ob;", "initialDisplayMode", "Lf2/pi;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llr/i;ILf2/pi;Ljava/util/Locale;Lfr/k;)V", "dateMillis", "Lh2/k0;", "o", "(Ljava/lang/Long;)Lh2/k0;", "startDateMillis", "endDateMillis", "Loq/i0;", "i", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Lm2/a3;", "f", "Lm2/a3;", "_selectedStartDate", "g", "_selectedEndDate", "h", "_displayMode", "k", "()Ljava/lang/Long;", "selectedStartDateMillis", "selectedEndDateMillis", "displayMode", "e", "()I", "d", "(I)V", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ma extends h0 implements ja {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a3<CalendarDate> _selectedStartDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private a3<CalendarDate> _selectedEndDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a3<ob> _displayMode;

    /* JADX INFO: renamed from: f2.ma$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf2/ma$a;", "", "<init>", "()V", "Lf2/pi;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Lb3/x;", "Lf2/ma;", "c", "(Lf2/pi;Ljava/util/Locale;)Lb3/x;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(b0 b0Var, ma maVar) {
            return v.q(maVar.k(), maVar.h(), Long.valueOf(maVar.f()), Integer.valueOf(maVar.getYearRange().getFirst()), Integer.valueOf(maVar.getYearRange().getLast()), Integer.valueOf(maVar.e()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ma e(pi piVar, Locale locale, List list) {
            return new ma((Long) list.get(0), (Long) list.get(1), (Long) list.get(2), new i(((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue()), ob.d(((Integer) list.get(5)).intValue()), piVar, locale, null);
        }

        public final x<ma, Object> c(final pi selectableDates, final Locale locale) {
            return b.b(new p() { // from class: f2.ka
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ma.Companion.d((b0) obj, (ma) obj2);
                }
            }, new l() { // from class: f2.la
                @Override // er.l
                public final Object b(Object obj) {
                    return ma.Companion.e(selectableDates, locale, (List) obj);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ ma(Long l15, Long l16, Long l17, i iVar, int i15, pi piVar, Locale locale, k kVar) {
        this(l15, l16, l17, iVar, i15, piVar, locale);
    }

    private final CalendarDate o(Long dateMillis) {
        if (dateMillis != null) {
            CalendarDate calendarDateB = getCalendarModel().b(dateMillis.longValue());
            if (getYearRange().q(calendarDateB.getYear())) {
                return calendarDateB;
            }
        }
        return null;
    }

    @Override // p046f2.ja
    public void d(int i15) {
        Long lK = k();
        if (lK != null) {
            a(getCalendarModel().h(lK.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(ob.c(i15));
    }

    @Override // p046f2.ja
    public int e() {
        return this._displayMode.getValue().getValue();
    }

    @Override // p046f2.ja
    public Long h() {
        CalendarDate value = this._selectedEndDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // p046f2.ja
    public void i(Long startDateMillis, Long endDateMillis) {
        CalendarDate calendarDateO = o(startDateMillis);
        CalendarDate calendarDateO2 = o(endDateMillis);
        if (calendarDateO == null || (calendarDateO2 != null && calendarDateO.getUtcTimeMillis() > calendarDateO2.getUtcTimeMillis())) {
            this._selectedStartDate.setValue(null);
            this._selectedEndDate.setValue(null);
        } else {
            this._selectedStartDate.setValue(calendarDateO);
            this._selectedEndDate.setValue(calendarDateO2);
        }
    }

    @Override // p046f2.ja
    public Long k() {
        CalendarDate value = this._selectedStartDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    private ma(Long l15, Long l16, Long l17, i iVar, int i15, pi piVar, Locale locale) {
        super(l17, iVar, piVar, locale);
        this._selectedStartDate = c6.e(null, null, 2, null);
        this._selectedEndDate = c6.e(null, null, 2, null);
        i(l15, l16);
        this._displayMode = c6.e(ob.c(i15), null, 2, null);
    }
}
