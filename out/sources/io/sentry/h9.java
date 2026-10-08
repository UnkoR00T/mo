package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f95013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s8 f95014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f95015c;

    public h9(io.sentry.protocol.v vVar, s8 s8Var, Boolean bool) {
        this.f95013a = vVar;
        this.f95014b = s8Var;
        this.f95015c = bool;
    }

    public String a() {
        return "traceparent";
    }

    public String b() {
        Boolean bool = this.f95015c;
        return String.format("00-%s-%s-%s", this.f95013a, this.f95014b, (bool == null || !bool.booleanValue()) ? "00" : "01");
    }
}
