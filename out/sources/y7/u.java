package y7;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f224939a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f224940b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j15, long j16) {
        if (j15 == 0 && j16 == -1) {
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("bytes=");
        sb5.append(j15);
        sb5.append("-");
        if (j16 != -1) {
            sb5.append((j15 + j16) - 1);
        }
        return sb5.toString();
    }

    public static long b(String str, String str2) {
        long j15;
        if (TextUtils.isEmpty(str)) {
            j15 = -1;
        } else {
            try {
                j15 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                w7.t.c("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j15 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j15;
        }
        Matcher matcher = f224939a.matcher(str2);
        if (!matcher.matches()) {
            return j15;
        }
        try {
            long j16 = (Long.parseLong((String) zj.p.q(matcher.group(2))) - Long.parseLong((String) zj.p.q(matcher.group(1)))) + 1;
            if (j15 < 0) {
                return j16;
            }
            if (j15 == j16) {
                return j15;
            }
            w7.t.h("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j15, j16);
        } catch (NumberFormatException unused2) {
            w7.t.c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j15;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f224940b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) zj.p.q(matcher.group(1)));
        }
        return -1L;
    }
}
