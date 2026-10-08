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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001$B?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R(\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lf2/m8;", "Lf2/h0;", "Lf2/j8;", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Llr/i;", "yearRange", "Lf2/ob;", "initialDisplayMode", "Lf2/pi;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Llr/i;ILf2/pi;Ljava/util/Locale;Lfr/k;)V", "Lm2/a3;", "Lh2/k0;", "f", "Lm2/a3;", "_selectedDate", "g", "_displayMode", "dateMillis", "j", "()Ljava/lang/Long;", "l", "(Ljava/lang/Long;)V", "selectedDateMillis", "displayMode", "e", "()I", "d", "(I)V", "h", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m8 extends h0 implements j8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a3<CalendarDate> _selectedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private a3<ob> _displayMode;

    /* JADX INFO: renamed from: f2.m8$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf2/m8$a;", "", "<init>", "()V", "Lf2/pi;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Lb3/x;", "Lf2/m8;", "c", "(Lf2/pi;Ljava/util/Locale;)Lb3/x;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(b0 b0Var, m8 m8Var) {
            return v.q(m8Var.j(), Long.valueOf(m8Var.f()), Integer.valueOf(m8Var.getYearRange().getFirst()), Integer.valueOf(m8Var.getYearRange().getLast()), Integer.valueOf(m8Var.e()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m8 e(pi piVar, Locale locale, List list) {
            return new m8((Long) list.get(0), (Long) list.get(1), new i(((Integer) list.get(2)).intValue(), ((Integer) list.get(3)).intValue()), ob.d(((Integer) list.get(4)).intValue()), piVar, locale, null);
        }

        public final x<m8, Object> c(final pi selectableDates, final Locale locale) {
            return b.b(new p() { // from class: f2.k8
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m8.Companion.d((b0) obj, (m8) obj2);
                }
            }, new l() { // from class: f2.l8
                @Override // er.l
                public final Object b(Object obj) {
                    return m8.Companion.e(selectableDates, locale, (List) obj);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ m8(Long l15, Long l16, i iVar, int i15, pi piVar, Locale locale, k kVar) {
        this(l15, l16, iVar, i15, piVar, locale);
    }

    @Override // p046f2.j8
    public void d(int i15) {
        Long lJ = j();
        if (lJ != null) {
            a(getCalendarModel().h(lJ.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(ob.c(i15));
    }

    @Override // p046f2.j8
    public int e() {
        return this._displayMode.getValue().getValue();
    }

    @Override // p046f2.j8
    public Long j() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // p046f2.j8
    public void l(Long l15) {
        if (l15 == null) {
            this._selectedDate.setValue(null);
        } else {
            CalendarDate calendarDateB = getCalendarModel().b(l15.longValue());
            this._selectedDate.setValue(getYearRange().q(calendarDateB.getYear()) ? calendarDateB : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    private m8(Long l15, Long l16, i iVar, int i15, pi piVar, Locale locale) {
        CalendarDate calendarDateB;
        super(l16, iVar, piVar, locale);
        if (l15 != null) {
            calendarDateB = getCalendarModel().b(l15.longValue());
            calendarDateB = iVar.q(calendarDateB.getYear()) ? calendarDateB : null;
        }
        this._selectedDate = c6.e(calendarDateB, null, 2, null);
        this._displayMode = c6.e(ob.c(i15), null, 2, null);
    }
}
