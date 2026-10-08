package io.sentry;

import java.net.URI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f94834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94835b;

    public d4(q7 q7Var) {
        io.sentry.util.v.c(q7Var, "options is required");
        this.f94834a = q7Var.retrieveParsedDsn();
        this.f94835b = q7Var.getSentryClientName();
    }

    public c4 a() {
        String str;
        URI uriC = this.f94834a.c();
        String string = uriC.resolve(uriC.getPath() + "/envelope/").toString();
        String strA = this.f94834a.a();
        String strB = this.f94834a.b();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Sentry sentry_version=7,sentry_client=");
        sb5.append(this.f94835b);
        sb5.append(",sentry_key=");
        sb5.append(strA);
        if (strB == null || strB.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + strB;
        }
        sb5.append(str);
        String string2 = sb5.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", this.f94835b);
        map.put("X-Sentry-Auth", string2);
        return new c4(string, map);
    }
}
