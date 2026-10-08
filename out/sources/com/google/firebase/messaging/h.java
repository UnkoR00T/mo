package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class h extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Binder f36542b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36544d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ExecutorService f36541a = n.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f36543c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36545e = 0;

    class a implements h1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.h1.a
        public vh.l<Void> a(Intent intent) {
            return h.this.h(intent);
        }
    }

    public static /* synthetic */ void a(h hVar, Intent intent, vh.m mVar) {
        hVar.getClass();
        try {
            hVar.f(intent);
        } finally {
            mVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        if (intent != null) {
            f1.c(intent);
        }
        synchronized (this.f36543c) {
            try {
                int i15 = this.f36545e - 1;
                this.f36545e = i15;
                if (i15 == 0) {
                    i(this.f36544d);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vh.l<Void> h(final Intent intent) {
        if (g(intent)) {
            return vh.o.f(null);
        }
        final vh.m mVar = new vh.m();
        this.f36541a.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                h.a(this.f36537a, intent, mVar);
            }
        });
        return mVar.a();
    }

    protected Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean i(int i15) {
        return stopSelfResult(i15);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.f36542b == null) {
                this.f36542b = new h1(new a());
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f36542b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f36541a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i15, int i16) {
        synchronized (this.f36543c) {
            this.f36544d = i16;
            this.f36545e++;
        }
        Intent intentE = e(intent);
        if (intentE == null) {
            d(intent);
            return 2;
        }
        vh.l<Void> lVarH = h(intentE);
        if (lVarH.p()) {
            d(intent);
            return 2;
        }
        lVarH.b(new ma.b(), new vh.f() { // from class: com.google.firebase.messaging.f
            @Override // vh.f
            public final void a(vh.l lVar) {
                this.f36529a.d(intent);
            }
        });
        return 3;
    }
}
