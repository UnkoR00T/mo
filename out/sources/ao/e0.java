package ao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class e0 {
    private static String a(int i15) {
        if (i15 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i15 == 1) {
            return "MMMM d, yyyy";
        }
        if (i15 == 2) {
            return "MMM d, yyyy";
        }
        if (i15 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i15);
    }

    private static String b(int i15) {
        if (i15 == 0 || i15 == 1) {
            return "h:mm:ss a z";
        }
        if (i15 == 2) {
            return "h:mm:ss a";
        }
        if (i15 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i15);
    }

    public static DateFormat c(int i15, int i16) {
        return new SimpleDateFormat(a(i15) + " " + b(i16), Locale.US);
    }
}
