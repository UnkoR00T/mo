package io.sentry.util;

import io.sentry.n0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f95815a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f95816b = Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n0 f95817c = new n0(400, 499);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n0 f95818d = new n0(500, 599);

    public static boolean a(String str) {
        return f95815a.contains(str.toUpperCase(Locale.ROOT));
    }

    public static boolean b(int i15) {
        return f95817c.a(i15);
    }

    public static boolean c(int i15) {
        return f95818d.a(i15);
    }
}
