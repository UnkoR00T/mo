package fg;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static d0 f62274e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f62276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f62277c = new x(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62278d = 1;

    d0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f62276b = scheduledExecutorService;
        this.f62275a = context.getApplicationContext();
    }

    public static synchronized d0 b(Context context) {
        try {
            if (f62274e == null) {
                wg.e.a();
                f62274e = new d0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new pg.b("MessengerIpcClient"))));
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f62274e;
    }

    private final synchronized int f() {
        int i15;
        i15 = this.f62278d;
        this.f62278d = i15 + 1;
        return i15;
    }

    private final synchronized vh.l g(a0 a0Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(a0Var.toString());
            }
            if (!this.f62277c.g(a0Var)) {
                x xVar = new x(this, null);
                this.f62277c = xVar;
                xVar.g(a0Var);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return a0Var.f62258b.a();
    }

    public final vh.l c(int i15, Bundle bundle) {
        return g(new z(f(), i15, bundle));
    }

    public final vh.l d(int i15, Bundle bundle) {
        return g(new c0(f(), i15, bundle));
    }
}
