package ig;

import io.sentry.android.core.c2;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gg.a f92195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f92196b;

    g0(h0 h0Var, gg.a aVar) {
        this.f92195a = aVar;
        Objects.requireNonNull(h0Var);
        this.f92196b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var = this.f92196b;
        e0 e0Var = (e0) h0Var.f92204f.c().get(h0Var.g());
        if (e0Var == null) {
            return;
        }
        if (!this.f92195a.y()) {
            e0Var.q(this.f92195a, null);
            return;
        }
        h0Var.h(true);
        if (h0Var.f().i()) {
            h0Var.e();
            return;
        }
        try {
            h0Var.f().j(null, h0Var.f().k());
        } catch (SecurityException e15) {
            c2.f("GoogleApiManager", "Failed to get service from broker. ", e15);
            this.f92196b.f().b("Failed to get service from broker.");
            e0Var.q(new gg.a(10), null);
        }
    }
}
