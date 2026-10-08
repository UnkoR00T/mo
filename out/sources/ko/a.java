package ko;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static Date a(long j15) {
        return new Date(j15 * 1000);
    }

    public static long b(Date date) {
        return date.getTime() / 1000;
    }
}
