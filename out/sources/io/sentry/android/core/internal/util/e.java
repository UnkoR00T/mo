package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.android.core.a1;
import io.sentry.android.core.s0;
import io.sentry.android.core.t0;
import io.sentry.b7;
import io.sentry.g1;
import io.sentry.p0;
import io.sentry.q7;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p0, s0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile ConnectivityManager f93972n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f93978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f93979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.p f93980d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile ConnectivityManager.NetworkCallback f93983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile NetworkCapabilities f93984h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Network f93985j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final io.sentry.util.a f93971m = new io.sentry.util.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final io.sentry.util.a f93973p = new io.sentry.util.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List<ConnectivityManager.NetworkCallback> f93974q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f93975r = {1, 0, 3, 2};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f93976s = new int[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.a f93982f = new io.sentry.util.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f93986k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f93987l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<p0.b> f93981e = new ArrayList();

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        private void a() {
            e.this.f93987l.set(false);
            g1 g1VarA = e.this.f93982f.a();
            try {
                e.this.f93984h = null;
                e.this.f93985j = null;
                e eVar = e.this;
                eVar.f93986k = eVar.f93980d.a();
                e.this.f93978b.getLogger().c(b7.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = e.this.f93981e.iterator();
                while (it.hasNext()) {
                    ((p0.b) it.next()).h(p0.a.DISCONNECTED);
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

        private boolean b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i15 : e.f93976s) {
                if (i15 != 0 && networkCapabilities.hasCapability(i15) != networkCapabilities2.hasCapability(i15)) {
                    return true;
                }
            }
            return false;
        }

        private boolean c(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i15 : e.f93975r) {
                if (networkCapabilities.hasTransport(i15) != networkCapabilities2.hasTransport(i15)) {
                    return true;
                }
            }
            return false;
        }

        private boolean d(NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2 = e.this.f93984h;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                return true;
            }
            if (networkCapabilities2 == null && networkCapabilities == null) {
                return false;
            }
            return b(networkCapabilities2, networkCapabilities) || c(networkCapabilities2, networkCapabilities);
        }

        private void e(Network network, NetworkCapabilities networkCapabilities) {
            if (d(networkCapabilities)) {
                e.this.D1(networkCapabilities);
                p0.a aVarU0 = e.this.u0();
                g1 g1VarA = e.this.f93982f.a();
                try {
                    Iterator it = e.this.f93981e.iterator();
                    while (it.hasNext()) {
                        ((p0.b) it.next()).h(aVarU0);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e.this.f93985j = network;
            if (e.this.f93987l.getAndSet(true)) {
                return;
            }
            g1 g1VarA = e.f93973p.a();
            try {
                Iterator it = e.f93974q.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network.equals(e.this.f93985j)) {
                e(network, networkCapabilities);
                g1 g1VarA = e.f93973p.a();
                try {
                    Iterator it = e.f93974q.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(e.this.f93985j)) {
                a();
                g1 g1VarA = e.f93973p.a();
                try {
                    Iterator it = e.f93974q.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            a();
            g1 g1VarA = e.f93973p.a();
            try {
                Iterator it = e.f93974q.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
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

    @SuppressLint({"InlinedApi"})
    public e(Context context, q7 q7Var, t0 t0Var, io.sentry.transport.p pVar) {
        this.f93977a = a1.g(context);
        this.f93978b = q7Var;
        this.f93979c = t0Var;
        this.f93980d = pVar;
        int[] iArr = f93976s;
        iArr[0] = 12;
        if (t0Var.d() >= 23) {
            iArr[1] = 16;
        }
        s1(new Runnable() { // from class: io.sentry.android.core.internal.util.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f93952a.n0();
            }
        });
        s0.y().p(this);
    }

    @SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    public static String C0(Context context, v0 v0Var, t0 t0Var) {
        ConnectivityManager connectivityManagerT0 = T0(context, v0Var);
        if (connectivityManagerT0 == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!q.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            v0Var.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (t0Var.d() >= 23) {
                Network activeNetwork = connectivityManagerT0.getActiveNetwork();
                if (activeNetwork == null) {
                    v0Var.c(b7.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerT0.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    v0Var.c(b7.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerT0.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    v0Var.c(b7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport = false;
                } else if (type != 1) {
                    if (type == 9) {
                        zHasTransport = true;
                    }
                    zHasTransport2 = zHasTransport;
                } else {
                    zHasTransport = true;
                    zHasTransport2 = false;
                }
            }
            if (zHasTransport) {
                return "ethernet";
            }
            if (zHasTransport) {
                return "wifi";
            }
            if (zHasTransport2) {
                return "cellular";
            }
            return null;
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "Failed to retrieve network info", th4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C1(boolean z15) {
        g1 g1VarA = this.f93982f.a();
        if (z15) {
            try {
                this.f93981e.clear();
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
        ConnectivityManager.NetworkCallback networkCallback = this.f93983g;
        this.f93983g = null;
        if (networkCallback != null) {
            x1(this.f93977a, this.f93978b.getLogger(), networkCallback);
        }
        this.f93984h = null;
        this.f93985j = null;
        this.f93986k = 0L;
        if (g1VarA != null) {
            g1VarA.close();
        }
        this.f93978b.getLogger().c(b7.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi", "MissingPermission"})
    public void D1(NetworkCapabilities networkCapabilities) {
        g1 g1VarA = this.f93982f.a();
        try {
            if (networkCapabilities != null) {
                this.f93984h = networkCapabilities;
            } else {
                if (!q.a(this.f93977a, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.f93978b.getLogger().c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f93984h = null;
                    this.f93986k = this.f93980d.a();
                    if (g1VarA != null) {
                        g1VarA.close();
                        return;
                    }
                    return;
                }
                if (this.f93979c.d() < 23) {
                    this.f93984h = null;
                    this.f93986k = this.f93980d.a();
                    if (g1VarA != null) {
                        g1VarA.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager connectivityManagerT0 = T0(this.f93977a, this.f93978b.getLogger());
                if (connectivityManagerT0 != null) {
                    Network activeNetwork = connectivityManagerT0.getActiveNetwork();
                    this.f93984h = activeNetwork != null ? connectivityManagerT0.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f93984h = null;
                }
            }
            this.f93986k = this.f93980d.a();
            this.f93978b.getLogger().c(b7.DEBUG, "Cache updated - Status: " + u0() + ", Type: " + O0(), new Object[0]);
        } catch (Throwable th4) {
            try {
                this.f93978b.getLogger().b(b7.WARNING, "Failed to update connection status cache", th4);
                this.f93984h = null;
                this.f93986k = this.f93980d.a();
            } catch (Throwable th5) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
        if (g1VarA != null) {
            g1VarA.close();
        }
    }

    public static String H0(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    private String O0() {
        NetworkCapabilities networkCapabilities = this.f93984h;
        return networkCapabilities != null ? H0(networkCapabilities) : C0(this.f93977a, this.f93978b.getLogger(), this.f93979c);
    }

    private static ConnectivityManager T0(Context context, v0 v0Var) {
        if (f93972n != null) {
            return f93972n;
        }
        g1 g1VarA = f93971m.a();
        try {
            if (f93972n != null) {
                ConnectivityManager connectivityManager = f93972n;
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return connectivityManager;
            }
            f93972n = (ConnectivityManager) context.getSystemService("connectivity");
            if (f93972n == null) {
                v0Var.c(b7.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f93972n;
            if (g1VarA != null) {
                g1VarA.close();
            }
            return connectivityManager2;
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

    private boolean Y0() {
        return this.f93980d.a() - this.f93986k < 120000;
    }

    public static boolean d0(Context context, v0 v0Var, t0 t0Var, ConnectivityManager.NetworkCallback networkCallback) {
        if (t0Var.d() < 24) {
            v0Var.c(b7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!q.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            v0Var.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        g1 g1VarA = f93973p.a();
        try {
            f93974q.add(networkCallback);
            if (g1VarA == null) {
                return true;
            }
            g1VarA.close();
            return true;
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

    @SuppressLint({"InlinedApi"})
    private boolean d1(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (this.f93979c.d() >= 23) {
            zHasCapability = zHasCapability && networkCapabilities.hasCapability(16);
        }
        if (!zHasCapability) {
            return false;
        }
        for (int i15 : f93975r) {
            if (networkCapabilities.hasTransport(i15)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    static boolean i1(Context context, v0 v0Var, t0 t0Var, ConnectivityManager.NetworkCallback networkCallback) {
        if (t0Var.d() < 24) {
            v0Var.c(b7.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerT0 = T0(context, v0Var);
        if (connectivityManagerT0 == null) {
            return false;
        }
        if (!q.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            v0Var.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerT0.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th4) {
            v0Var.b(b7.WARNING, "registerDefaultNetworkCallback failed", th4);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        if (a1.s() && this.f93983g == null) {
            g1 g1VarA = this.f93982f.a();
            try {
                if (this.f93983g != null) {
                    if (g1VarA != null) {
                        g1VarA.close();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                if (i1(this.f93977a, this.f93978b.getLogger(), this.f93979c, aVar)) {
                    this.f93983g = aVar;
                    this.f93978b.getLogger().c(b7.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f93978b.getLogger().c(b7.WARNING, "Failed to register network callback", new Object[0]);
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

    public static void o1(ConnectivityManager.NetworkCallback networkCallback) {
        g1 g1VarA = f93973p.a();
        try {
            f93974q.remove(networkCallback);
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

    public static /* synthetic */ void r(e eVar) {
        eVar.C1(true);
        g1 g1VarA = f93973p.a();
        try {
            f93974q.clear();
            if (g1VarA != null) {
                g1VarA.close();
            }
            g1 g1VarA2 = f93971m.a();
            try {
                f93972n = null;
                if (g1VarA2 != null) {
                    g1VarA2.close();
                }
                s0.y().H(eVar);
            } catch (Throwable th4) {
                if (g1VarA2 != null) {
                    try {
                        g1VarA2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    private void s1(Runnable runnable) {
        try {
            this.f93978b.getExecutorService().submit(runnable);
        } catch (Throwable th4) {
            this.f93978b.getLogger().b(b7.ERROR, "AndroidConnectionStatusProvider submit failed", th4);
        }
    }

    private static p0.a t0(Context context, ConnectivityManager connectivityManager, v0 v0Var) {
        if (!q.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            v0Var.c(b7.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return p0.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? p0.a.CONNECTED : p0.a.DISCONNECTED;
            }
            v0Var.c(b7.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return p0.a.DISCONNECTED;
        } catch (Throwable th4) {
            v0Var.b(b7.WARNING, "Could not retrieve Connection Status", th4);
            return p0.a.UNKNOWN;
        }
    }

    public static /* synthetic */ void u(e eVar) {
        eVar.D1(null);
        p0.a aVarU0 = eVar.u0();
        if (aVarU0 == p0.a.DISCONNECTED) {
            eVar.f93987l.set(false);
            g1 g1VarA = f93973p.a();
            try {
                Iterator<ConnectivityManager.NetworkCallback> it = f93974q.iterator();
                while (it.hasNext()) {
                    it.next().onLost(null);
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
        g1 g1VarA2 = eVar.f93982f.a();
        try {
            Iterator<p0.b> it4 = eVar.f93981e.iterator();
            while (it4.hasNext()) {
                it4.next().h(aVarU0);
            }
            if (g1VarA2 != null) {
                g1VarA2.close();
            }
            eVar.n0();
        } catch (Throwable th6) {
            if (g1VarA2 != null) {
                try {
                    g1VarA2.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p0.a u0() {
        if (this.f93984h != null) {
            return d1(this.f93984h) ? p0.a.CONNECTED : p0.a.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerT0 = T0(this.f93977a, this.f93978b.getLogger());
        return connectivityManagerT0 != null ? t0(this.f93977a, connectivityManagerT0, this.f93978b.getLogger()) : p0.a.UNKNOWN;
    }

    @SuppressLint({"NewApi"})
    static void x1(Context context, v0 v0Var, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerT0 = T0(context, v0Var);
        if (connectivityManagerT0 == null) {
            return;
        }
        try {
            connectivityManagerT0.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th4) {
            v0Var.b(b7.WARNING, "unregisterNetworkCallback failed", th4);
        }
    }

    @Override // io.sentry.p0
    public String J0() {
        if (!Y0()) {
            D1(null);
        }
        return O0();
    }

    @Override // io.sentry.p0
    public void M3(p0.b bVar) {
        g1 g1VarA = this.f93982f.a();
        try {
            this.f93981e.remove(bVar);
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

    @Override // io.sentry.android.core.s0.a
    public void b() {
        if (this.f93983g != null) {
            return;
        }
        s1(new Runnable() { // from class: io.sentry.android.core.internal.util.d
            @Override // java.lang.Runnable
            public final void run() {
                e.u(this.f93970a);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        s1(new Runnable() { // from class: io.sentry.android.core.internal.util.b
            @Override // java.lang.Runnable
            public final void run() {
                e.r(this.f93968a);
            }
        });
    }

    @Override // io.sentry.android.core.s0.a
    public void h() {
        if (this.f93983g == null) {
            return;
        }
        s1(new Runnable() { // from class: io.sentry.android.core.internal.util.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f93969a.C1(false);
            }
        });
    }

    @Override // io.sentry.p0
    public p0.a w1() {
        if (!Y0()) {
            D1(null);
        }
        return u0();
    }

    @Override // io.sentry.p0
    public boolean w3(p0.b bVar) {
        g1 g1VarA = this.f93982f.a();
        try {
            this.f93981e.add(bVar);
            if (g1VarA != null) {
                g1VarA.close();
            }
            n0();
            return this.f93983g != null;
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
