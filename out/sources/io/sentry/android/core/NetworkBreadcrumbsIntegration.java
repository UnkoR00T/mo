package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.b7;
import io.sentry.o5;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.r1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f93688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f93689c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q7 f93690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile b f93691e;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f93692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f93693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f93694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f93695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f93696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f93697f;

        @SuppressLint({"NewApi"})
        a(NetworkCapabilities networkCapabilities, t0 t0Var, long j15) {
            io.sentry.util.v.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.v.c(t0Var, "BuildInfoProvider is required");
            this.f93692a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f93693b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = t0Var.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f93694c = signalStrength > -100 ? signalStrength : 0;
            this.f93696e = networkCapabilities.hasTransport(4);
            String strH0 = io.sentry.android.core.internal.util.e.H0(networkCapabilities);
            this.f93697f = strH0 == null ? "" : strH0;
            this.f93695d = j15;
        }

        boolean a(a aVar) {
            int iAbs = Math.abs(this.f93694c - aVar.f93694c);
            int iAbs2 = Math.abs(this.f93692a - aVar.f93692a);
            int iAbs3 = Math.abs(this.f93693b - aVar.f93693b);
            boolean z15 = io.sentry.m.l((double) Math.abs(this.f93695d - aVar.f93695d)) < 5000.0d;
            return this.f93696e == aVar.f93696e && this.f93697f.equals(aVar.f93697f) && (z15 || iAbs <= 5) && (z15 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.f93692a)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.f93692a)) * 0.1d) ? 0 : -1)) <= 0) && (z15 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.f93693b)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.f93693b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.sentry.c1 f93698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t0 f93699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        NetworkCapabilities f93700c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f93701d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final o5 f93702e;

        b(io.sentry.c1 c1Var, t0 t0Var, o5 o5Var) {
            this.f93698a = (io.sentry.c1) io.sentry.util.v.c(c1Var, "Scopes are required");
            this.f93699b = (t0) io.sentry.util.v.c(t0Var, "BuildInfoProvider is required");
            this.f93702e = (o5) io.sentry.util.v.c(o5Var, "SentryDateProvider is required");
        }

        private io.sentry.f a(String str) {
            io.sentry.f fVar = new io.sentry.f();
            fVar.F("system");
            fVar.z("network.event");
            fVar.A("action", str);
            fVar.B(b7.INFO);
            return fVar;
        }

        private a b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j15, long j16) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f93699b, j16);
            }
            a aVar = new a(networkCapabilities, this.f93699b, j15);
            a aVar2 = new a(networkCapabilities2, this.f93699b, j16);
            if (aVar.a(aVar2)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.f93698a.c(a("NETWORK_AVAILABLE"));
            this.f93700c = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            long jL = this.f93702e.a().l();
            a aVarB = b(this.f93700c, networkCapabilities, this.f93701d, jL);
            if (aVarB == null) {
                return;
            }
            this.f93700c = networkCapabilities;
            this.f93701d = jL;
            io.sentry.f fVarA = a("NETWORK_CAPABILITIES_CHANGED");
            fVarA.A("download_bandwidth", Integer.valueOf(aVarB.f93692a));
            fVarA.A("upload_bandwidth", Integer.valueOf(aVarB.f93693b));
            fVarA.A("vpn_active", Boolean.valueOf(aVarB.f93696e));
            fVarA.A("network_type", aVarB.f93697f);
            int i15 = aVarB.f93694c;
            if (i15 != 0) {
                fVarA.A("signal_strength", Integer.valueOf(i15));
            }
            io.sentry.j0 j0Var = new io.sentry.j0();
            j0Var.k("android:networkCapabilities", aVarB);
            this.f93698a.q(fVarA, j0Var);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.f93698a.c(a("NETWORK_LOST"));
            this.f93700c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, t0 t0Var) {
        this.f93687a = (Context) io.sentry.util.v.c(a1.g(context), "Context is required");
        this.f93688b = (t0) io.sentry.util.v.c(t0Var, "BuildInfoProvider is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarA = this.f93689c.a();
        try {
            b bVar = this.f93691e;
            this.f93691e = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
            if (bVar != null) {
                io.sentry.android.core.internal.util.e.o1(bVar);
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93690d = q7Var;
        io.sentry.v0 logger = q7Var.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f93688b.d() < 24) {
                q7Var.getLogger().c(b7Var, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            io.sentry.g1 g1VarA = this.f93689c.a();
            try {
                this.f93691e = new b(c1Var, this.f93688b, q7Var.getDateProvider());
                if (io.sentry.android.core.internal.util.e.d0(this.f93687a, q7Var.getLogger(), this.f93688b, this.f93691e)) {
                    q7Var.getLogger().c(b7Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.p.a("NetworkBreadcrumbs");
                } else {
                    q7Var.getLogger().c(b7Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }
}
