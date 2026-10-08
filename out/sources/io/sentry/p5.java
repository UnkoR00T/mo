package io.sentry;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q5 f95297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable<p6> f95298b;

    public p5(q5 q5Var, Iterable<p6> iterable) {
        this.f95297a = (q5) io.sentry.util.v.c(q5Var, "SentryEnvelopeHeader is required.");
        this.f95298b = (Iterable) io.sentry.util.v.c(iterable, "SentryEnvelope items are required.");
    }

    public static p5 a(h1 h1Var, i8 i8Var, io.sentry.protocol.p pVar) {
        io.sentry.util.v.c(h1Var, "Serializer is required.");
        io.sentry.util.v.c(i8Var, "session is required.");
        return new p5(null, pVar, p6.G(h1Var, i8Var));
    }

    public q5 b() {
        return this.f95297a;
    }

    public Iterable<p6> c() {
        return this.f95298b;
    }

    public p5(io.sentry.protocol.v vVar, io.sentry.protocol.p pVar, p6 p6Var) {
        io.sentry.util.v.c(p6Var, "SentryEnvelopeItem is required.");
        this.f95297a = new q5(vVar, pVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(p6Var);
        this.f95298b = arrayList;
    }
}
