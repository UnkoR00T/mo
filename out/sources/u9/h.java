package u9;

import java.util.regex.Pattern;
import t7.x;
import w7.c0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f196570a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(c0 c0Var) {
        String strB = c0Var.B();
        return strB != null && strB.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] strArrA1 = o0.a1(str, "\\.");
        long j15 = 0;
        for (String str2 : o0.Z0(strArrA1[0], ":")) {
            j15 = (j15 * 60) + Long.parseLong(str2);
        }
        long j16 = j15 * 1000;
        if (strArrA1.length == 2) {
            String strTrim = strArrA1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j16 += Long.parseLong(strTrim);
        }
        return j16 * 1000;
    }

    public static void d(c0 c0Var) throws x {
        int iG = c0Var.g();
        if (a(c0Var)) {
            return;
        }
        c0Var.f0(iG);
        throw x.a("Expected WEBVTT. Got " + c0Var.B(), null);
    }
}
