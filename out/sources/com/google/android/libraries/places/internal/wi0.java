package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class wi0 implements h70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fj0 f34164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ hj0 f34165b;

    /* synthetic */ wi0(hj0 hj0Var, byte[] bArr) {
        Objects.requireNonNull(hj0Var);
        this.f34165b = hj0Var;
    }

    @Override // com.google.android.libraries.places.internal.h70
    public final void a(c50 c50Var) {
        hj0 hj0Var = this.f34165b;
        if (hj0Var.n()) {
            hj0.f32479s.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{c50Var, this.f34164a.f()});
            return;
        }
        hj0.f32479s.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{c50Var, this.f34164a.f()});
        this.f34164a.i(c50Var);
        if (hj0Var.l().a()) {
            if (this.f34164a == hj0Var.k().get(hj0Var.l().d())) {
                hj0Var.h(this.f34164a);
            }
        }
    }

    final /* synthetic */ void b(fj0 fj0Var) {
        this.f34164a = fj0Var;
    }
}
