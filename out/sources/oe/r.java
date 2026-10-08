package oe;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f145005d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f145006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<oe.b.a> f145007b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f145008c;

    class a implements ve.f.b<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f145009a;

        a(Context context) {
            this.f145009a = context;
        }

        @Override // ve.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f145009a.getSystemService("connectivity");
        }
    }

    class b implements oe.b.a {
        b() {
        }

        @Override // oe.b.a
        public void a(boolean z15) {
            ArrayList arrayList;
            ve.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f145007b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((oe.b.a) it.next()).a(z15);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f145012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final oe.b.a f145013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ve.f.b<ConnectivityManager> f145014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f145015d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: oe.r$d$a$a, reason: collision with other inner class name */
            class RunnableC3597a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f145017a;

                RunnableC3597a(boolean z15) {
                    this.f145017a = z15;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f145017a);
                }
            }

            a() {
            }

            private void b(boolean z15) {
                ve.l.u(new RunnableC3597a(z15));
            }

            void a(boolean z15) {
                ve.l.a();
                d dVar = d.this;
                boolean z16 = dVar.f145012a;
                dVar.f145012a = z15;
                if (z16 != z15) {
                    dVar.f145013b.a(z15);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(ve.f.b<ConnectivityManager> bVar, oe.b.a aVar) {
            this.f145014c = bVar;
            this.f145013b = aVar;
        }

        @Override // oe.r.c
        public void a() {
            this.f145014c.get().unregisterNetworkCallback(this.f145015d);
        }

        @Override // oe.r.c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.f145012a = this.f145014c.get().getActiveNetwork() != null;
            try {
                this.f145014c.get().registerDefaultNetworkCallback(this.f145015d);
                return true;
            } catch (RuntimeException e15) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    c2.h("ConnectivityMonitor", "Failed to register callback", e15);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f145006a = new d(ve.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f145005d == null) {
            synchronized (r.class) {
                try {
                    if (f145005d == null) {
                        f145005d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return f145005d;
    }

    private void b() {
        if (this.f145008c || this.f145007b.isEmpty()) {
            return;
        }
        this.f145008c = this.f145006a.b();
    }

    private void c() {
        if (this.f145008c && this.f145007b.isEmpty()) {
            this.f145006a.a();
            this.f145008c = false;
        }
    }

    synchronized void d(oe.b.a aVar) {
        this.f145007b.add(aVar);
        b();
    }

    synchronized void e(oe.b.a aVar) {
        this.f145007b.remove(aVar);
        c();
    }
}
