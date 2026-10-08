package io.sentry;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c9 f94857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f94858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f94859c;

    public e4(c9 c9Var, k kVar, Double d15, Map<String, Object> map) {
        this.f94857a = (c9) io.sentry.util.v.c(c9Var, "transactionContexts is required");
        this.f94858b = d15;
        this.f94859c = map == null ? Collections.EMPTY_MAP : map;
    }

    public Double a() {
        return this.f94858b;
    }

    public c9 b() {
        return this.f94857a;
    }
}
