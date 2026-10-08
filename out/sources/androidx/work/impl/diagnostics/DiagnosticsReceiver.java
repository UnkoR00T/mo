package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import ub.p0;
import ub.w;
import ub.z;

/* JADX INFO: loaded from: classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13850a = w.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        w.e().a(f13850a, "Requesting diagnostics");
        try {
            p0.g(context).c(z.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e15) {
            w.e().d(f13850a, "WorkManager is not initialized", e15);
        }
    }
}
