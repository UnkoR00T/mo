package t7;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f188568a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f188569b = "media3.common";

    public static synchronized void a(String str) {
        if (f188568a.add(str)) {
            f188569b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f188569b;
    }
}
