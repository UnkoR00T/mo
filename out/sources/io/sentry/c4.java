package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f94700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f94701b;

    public c4(String str, Map<String, String> map) {
        io.sentry.util.v.c(str, "url is required");
        io.sentry.util.v.c(map, "headers is required");
        try {
            this.f94700a = URI.create(str).toURL();
            this.f94701b = map;
        } catch (MalformedURLException e15) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e15);
        }
    }

    public Map<String, String> a() {
        return this.f94701b;
    }

    public URL b() {
        return this.f94700a;
    }
}
