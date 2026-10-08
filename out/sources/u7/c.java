package u7;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f195920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f195921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.p f195922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f195923d;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC5102c f195924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w7.p f195925b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (c.this.f195923d) {
                this.f195924a.u();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f195925b.j(new Runnable() { // from class: u7.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f195927a.b();
                    }
                });
            }
        }

        private b(w7.p pVar, InterfaceC5102c interfaceC5102c) {
            this.f195925b = pVar;
            this.f195924a = interfaceC5102c;
        }
    }

    /* JADX INFO: renamed from: u7.c$c, reason: collision with other inner class name */
    public interface InterfaceC5102c {
        void u();
    }

    public c(Context context, Looper looper, Looper looper2, InterfaceC5102c interfaceC5102c, w7.h hVar) {
        this.f195920a = context.getApplicationContext();
        this.f195922c = hVar.e(looper, null);
        this.f195921b = new b(hVar.e(looper2, null), interfaceC5102c);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void d(boolean z15) {
        if (z15 == this.f195923d) {
            return;
        }
        if (z15) {
            this.f195922c.j(new Runnable() { // from class: u7.a
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = this.f195918a;
                    cVar.f195920a.registerReceiver(cVar.f195921b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f195923d = true;
        } else {
            this.f195922c.j(new Runnable() { // from class: u7.b
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = this.f195919a;
                    cVar.f195920a.unregisterReceiver(cVar.f195921b);
                }
            });
            this.f195923d = false;
        }
    }
}
