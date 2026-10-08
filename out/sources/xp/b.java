package xp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f220418a = {"EEEE, dd MMM yy hh:mm:ss a", "EEEE, MMM dd, yy hh:mm:ss a", "EEEE, MMM dd, yy 'at' hh:mma", "EEEE, MMM dd, yy", "EEEE MMM dd, yy HH:mm:ss", "EEEE MMM dd HH:mm:ss z yy", "EEEE MMM dd HH:mm:ss yy"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f220419b = {"dd MMM yy HH:mm:ss", "dd MMM yy HH:mm", "yyyy MMM d", "yyyymmddhh:mm:ss", "H:m M/d/yy", "M/d/yy HH:mm:ss", "M/d/yy HH:mm", "M/d/yy"};

    static String a(long j15, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("Z");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(b(j15), "unknown"));
        String str2 = simpleDateFormat.format(new Date());
        return str2.substring(0, 3) + str + str2.substring(3);
    }

    private static int b(long j15) {
        if (j15 <= 50400000 && j15 >= -50400000) {
            return (int) j15;
        }
        long j16 = (((j15 + 43200000) % 86400000) + 86400000) % 86400000;
        if (j16 == 0) {
            return 43200000;
        }
        return (int) ((j16 - 43200000) % 43200000);
    }

    public static String c(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return String.format(Locale.US, "D:%1$4tY%1$2tm%1$2td%1$2tH%1$2tM%1$2tS%2$s'", calendar, a(calendar.get(15) + calendar.get(16), "'"));
    }
}
