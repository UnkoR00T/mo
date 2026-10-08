package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f93625a;

    public a9(q7 q7Var) {
        this.f93625a = (q7) io.sentry.util.v.c(q7Var, "options are required");
    }

    private boolean b(Double d15, Double d16) {
        return d15.doubleValue() >= d16.doubleValue();
    }

    public b9 a(e4 e4Var) {
        Double dA = e4Var.a();
        b9 b9VarJ = e4Var.b().j();
        if (b9VarJ != null) {
            return io.sentry.util.a0.a(b9VarJ);
        }
        this.f93625a.getProfilesSampler();
        Double profilesSampleRate = this.f93625a.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate, dA));
        this.f93625a.getTracesSampler();
        b9 b9VarX = e4Var.b().x();
        if (b9VarX != null) {
            return io.sentry.util.a0.a(b9VarX);
        }
        Double tracesSampleRate = this.f93625a.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f93625a.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new b9(Boolean.valueOf(b(dValueOf, dA)), dValueOf, dA, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new b9(bool, null, dA, bool, null);
    }

    public boolean c(double d15) {
        Double profileSessionSampleRate = this.f93625a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && b(profileSessionSampleRate, Double.valueOf(d15));
    }
}
