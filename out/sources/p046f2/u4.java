package p046f2;

import h2.CalendarDate;
import h2.DateInputFormat;
import h2.b2;
import java.util.Locale;
import lr.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0018\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R$\u0010,\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b\u001c\u0010+R$\u0010/\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b\u001a\u0010+¨\u00060"}, d2 = {"Lf2/u4;", "", "Llr/i;", "yearRange", "Lf2/pi;", "selectableDates", "Lh2/w0;", "dateInputFormat", "Lf2/h5;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "<init>", "(Llr/i;Lf2/pi;Lh2/w0;Lf2/h5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lh2/k0;", "dateToValidate", "Lf2/ed;", "inputIdentifier", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "c", "(Lh2/k0;ILjava/util/Locale;)Ljava/lang/String;", "a", "Llr/i;", "b", "Lf2/pi;", "Lh2/w0;", "d", "Lf2/h5;", "e", "Ljava/lang/String;", "f", "g", "h", "", "i", "Ljava/lang/Long;", "getCurrentStartDateMillis", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "currentStartDateMillis", "j", "getCurrentEndDateMillis", "currentEndDateMillis", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i yearRange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pi selectableDates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DateInputFormat dateInputFormat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h5 dateFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String errorDatePattern;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String errorDateOutOfYearRange;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String errorInvalidNotAllowed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String errorInvalidRangeInput;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Long currentStartDateMillis;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Long currentEndDateMillis;

    public u4(i iVar, pi piVar, DateInputFormat dateInputFormat, h5 h5Var, String str, String str2, String str3, String str4) {
        this.yearRange = iVar;
        this.selectableDates = piVar;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = h5Var;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
    }

    public final void a(Long l15) {
        this.currentEndDateMillis = l15;
    }

    public final void b(Long l15) {
        this.currentStartDateMillis = l15;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public final String c(CalendarDate dateToValidate, int inputIdentifier, Locale locale) {
        long utcTimeMillis;
        Long l15;
        long jLongValue;
        if (dateToValidate == null) {
            return b2.a(this.errorDatePattern, this.dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT));
        }
        if (!this.yearRange.q(dateToValidate.getYear())) {
            return b2.a(this.errorDateOutOfYearRange, w1.c(this.yearRange.getFirst(), 0, 0, false, locale, 7, null), w1.c(this.yearRange.getLast(), 0, 0, false, locale, 7, null));
        }
        pi piVar = this.selectableDates;
        if (!piVar.a(dateToValidate.getYear()) || !piVar.b(dateToValidate.getUtcTimeMillis())) {
            return b2.a(this.errorInvalidNotAllowed, h5.c(this.dateFormatter, Long.valueOf(dateToValidate.getUtcTimeMillis()), locale, false, 4, null));
        }
        ed.Companion companion = ed.INSTANCE;
        if (ed.e(inputIdentifier, companion.c())) {
            long utcTimeMillis2 = dateToValidate.getUtcTimeMillis();
            Long l16 = this.currentEndDateMillis;
            if (utcTimeMillis2 <= (l16 != null ? l16.longValue() : Long.MAX_VALUE)) {
                if (ed.e(inputIdentifier, companion.a())) {
                    return "";
                }
                utcTimeMillis = dateToValidate.getUtcTimeMillis();
                l15 = this.currentStartDateMillis;
                if (l15 != null) {
                    jLongValue = l15.longValue();
                } else {
                    jLongValue = Long.MIN_VALUE;
                }
                if (utcTimeMillis >= jLongValue) {
                    return "";
                }
            }
        } else {
            if (ed.e(inputIdentifier, companion.a())) {
                return "";
            }
            utcTimeMillis = dateToValidate.getUtcTimeMillis();
            l15 = this.currentStartDateMillis;
            if (l15 != null) {
                jLongValue = l15.longValue();
            } else {
                jLongValue = Long.MIN_VALUE;
            }
            if (utcTimeMillis >= jLongValue) {
                return "";
            }
        }
        return this.errorInvalidRangeInput;
    }
}
