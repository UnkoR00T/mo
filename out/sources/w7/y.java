package w7;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static y f210802f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f210803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f210804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f210805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f210806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f210807e;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final y f210808a;

            public a(y yVar) {
                this.f210808a = yVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f210808a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) zj.p.q((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(yVar);
                telephonyManager.registerTelephonyCallback(yVar.f210803a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                yVar.m(5);
            }
        }
    }

    public interface c {
        void a(int i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f210809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f210810b;

        public d(c cVar, Executor executor) {
            this.f210809a = new WeakReference<>(cVar);
            this.f210810b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = dVar.f210809a.get();
            if (cVar != null) {
                cVar.a(y.this.g());
            }
        }

        public void b() {
            this.f210810b.execute(new Runnable() { // from class: w7.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.d.a(this.f210820a);
                }
            });
        }

        public boolean c() {
            return this.f210809a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            y.this.f210803a.execute(new Runnable() { // from class: w7.a0
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.i(context);
                }
            });
        }
    }

    private y(final Context context) {
        Executor executorA = w7.a.a();
        this.f210803a = executorA;
        this.f210804b = new CopyOnWriteArrayList<>();
        this.f210805c = new Object();
        this.f210806d = 0;
        executorA.execute(new Runnable() { // from class: w7.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f210798a.j(context);
            }
        });
    }

    public static synchronized y e(Context context) {
        try {
            if (f210802f == null) {
                f210802f = new y(context);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f210802f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i15 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i15 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (Build.VERSION.SDK_INT < 31 || iH != 5) {
            m(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnprotectedReceiver"})
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void l() {
        for (d dVar : this.f210804b) {
            if (dVar.c()) {
                this.f210804b.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i15) {
        l();
        synchronized (this.f210805c) {
            try {
                if (this.f210807e && this.f210806d == i15) {
                    return;
                }
                this.f210807e = true;
                this.f210806d = i15;
                Iterator<d> it = this.f210804b.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public int g() {
        int i15;
        synchronized (this.f210805c) {
            i15 = this.f210806d;
        }
        return i15;
    }

    public void k(c cVar, Executor executor) {
        boolean z15;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f210805c) {
            this.f210804b.add(dVar);
            z15 = this.f210807e;
        }
        if (z15) {
            dVar.b();
        }
    }
}
