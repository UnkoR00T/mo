package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements n1 {
    @Override // io.sentry.n1
    public io.sentry.transport.q a(q7 q7Var, c4 c4Var) {
        io.sentry.util.v.c(q7Var, "options is required");
        io.sentry.util.v.c(c4Var, "requestDetails is required");
        return new io.sentry.transport.e(q7Var, new io.sentry.transport.a0(q7Var), q7Var.getTransportGate(), c4Var);
    }
}
