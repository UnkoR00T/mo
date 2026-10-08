package p046f2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneOffset;
import lr.i;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\u001aC\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0000*\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ljava/time/LocalDate;", "initialSelectedDate", "Ljava/time/YearMonth;", "initialDisplayedMonth", "Llr/i;", "yearRange", "Lf2/ob;", "initialDisplayMode", "Lf2/pi;", "selectableDates", "Lf2/j8;", "g", "(Ljava/time/LocalDate;Ljava/time/YearMonth;Llr/i;ILf2/pi;Lm2/r;II)Lf2/j8;", "initialSelectedStartDate", "initialSelectedEndDate", "Lf2/ja;", "h", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/YearMonth;Llr/i;ILf2/pi;Lm2/r;II)Lf2/ja;", "c", "(Lf2/j8;)Ljava/time/LocalDate;", "e", "(Lf2/ja;)Ljava/time/LocalDate;", "d", "yearMonth", "", "f", "(Ljava/time/YearMonth;)J", "millisUtc", "a", "(Ljava/lang/Long;)Ljava/time/LocalDate;", "date", "b", "(Ljava/time/LocalDate;)Ljava/lang/Long;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n8 {
    private static final LocalDate a(Long l15) {
        if (l15 == null) {
            return null;
        }
        return Instant.ofEpochMilli(l15.longValue()).atZone(ZoneOffset.UTC).toLocalDate();
    }

    private static final Long b(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return Long.valueOf(localDate.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli());
    }

    public static final LocalDate c(j8 j8Var) {
        return a(j8Var.j());
    }

    public static final LocalDate d(ja jaVar) {
        return a(jaVar.h());
    }

    public static final LocalDate e(ja jaVar) {
        return a(jaVar.k());
    }

    private static final long f(YearMonth yearMonth) {
        return yearMonth.atDay(1).atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    public static final j8 g(LocalDate localDate, YearMonth yearMonth, i iVar, int i15, pi piVar, r rVar, int i16, int i17) {
        if ((i17 & 2) != 0) {
            yearMonth = localDate != null ? YearMonth.from(localDate) : null;
        }
        if ((i17 & 4) != 0) {
            iVar = a5.f55133a.q();
        }
        i iVar2 = iVar;
        if ((i17 & 8) != 0) {
            i15 = ob.INSTANCE.b();
        }
        int i18 = i15;
        pi piVarM = (i17 & 16) != 0 ? a5.f55133a.m() : piVar;
        if (t.k()) {
            t.o(-2037014061, i16, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.jvmAndAndroid.kt:72)");
        }
        j8 j8VarH2 = i8.H2(localDate != null ? b(localDate) : null, yearMonth != null ? Long.valueOf(f(yearMonth)) : null, iVar2, i18, piVarM, rVar, i16 & 65408, 0);
        if (t.k()) {
            t.n();
        }
        return j8VarH2;
    }

    public static final ja h(LocalDate localDate, LocalDate localDate2, YearMonth yearMonth, i iVar, int i15, pi piVar, r rVar, int i16, int i17) {
        if ((i17 & 4) != 0) {
            yearMonth = localDate != null ? YearMonth.from(localDate) : null;
        }
        i iVarQ = (i17 & 8) != 0 ? a5.f55133a.q() : iVar;
        int iB = (i17 & 16) != 0 ? ob.INSTANCE.b() : i15;
        pi piVarM = (i17 & 32) != 0 ? a5.f55133a.m() : piVar;
        if (t.k()) {
            t.o(-931481122, i16, -1, "androidx.compose.material3.rememberDateRangePickerState (DatePicker.jvmAndAndroid.kt:175)");
        }
        ja jaVarF0 = ia.f0(localDate != null ? b(localDate) : null, localDate2 != null ? b(localDate2) : null, yearMonth != null ? Long.valueOf(f(yearMonth)) : null, iVarQ, iB, piVarM, rVar, i16 & 523264, 0);
        if (t.k()) {
            t.n();
        }
        return jaVarF0;
    }
}
