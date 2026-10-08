package ig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f92227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f92228b;

    public m0(l0 l0Var) {
        this.f92228b = l0Var;
    }

    public final void a(Context context) {
        this.f92227a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f92227a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f92227a = null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f92228b.a();
            b();
        }
    }
}
