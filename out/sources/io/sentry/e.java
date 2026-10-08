package io.sentry;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94852a;

    public e(String str) {
        this.f94852a = str;
    }

    public static e a(d dVar, List<String> list) {
        String strP = dVar.P(d.g(list, true, dVar.f94828h).p());
        if (strP.isEmpty()) {
            return null;
        }
        return new e(strP);
    }

    public String b() {
        return "baggage";
    }

    public String c() {
        return this.f94852a;
    }
}
