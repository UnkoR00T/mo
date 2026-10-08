package zg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f235106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f235107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final StringBuilder f235108c;

    static {
        Locale locale = Locale.ROOT;
        f235106a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f235107b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f235108c = new StringBuilder(33);
    }

    public static String a(long j15) {
        return j15 >= 0 ? f235106a.format(new Date(j15)) : Long.toString(j15);
    }

    public static String b(long j15) {
        String string;
        StringBuilder sb5 = f235108c;
        synchronized (sb5) {
            sb5.setLength(0);
            c(j15, sb5);
            string = sb5.toString();
        }
        return string;
    }

    public static StringBuilder c(long j15, StringBuilder sb5) {
        if (j15 == 0) {
            sb5.append("0s");
            return sb5;
        }
        sb5.ensureCapacity(sb5.length() + 27);
        boolean z15 = false;
        if (j15 < 0) {
            sb5.append("-");
            if (j15 != Long.MIN_VALUE) {
                j15 = -j15;
            } else {
                j15 = Long.MAX_VALUE;
                z15 = true;
            }
        }
        if (j15 >= 86400000) {
            sb5.append(j15 / 86400000);
            sb5.append("d");
            j15 %= 86400000;
        }
        if (true == z15) {
            j15 = 25975808;
        }
        if (j15 >= 3600000) {
            sb5.append(j15 / 3600000);
            sb5.append("h");
            j15 %= 3600000;
        }
        if (j15 >= 60000) {
            sb5.append(j15 / 60000);
            sb5.append("m");
            j15 %= 60000;
        }
        if (j15 >= 1000) {
            sb5.append(j15 / 1000);
            sb5.append("s");
            j15 %= 1000;
        }
        if (j15 > 0) {
            sb5.append(j15);
            sb5.append("ms");
        }
        return sb5;
    }
}
