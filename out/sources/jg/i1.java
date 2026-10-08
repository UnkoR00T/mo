package jg;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class i1 extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f102500g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f102501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Handler f102502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h1 f102503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final og.a f102504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f102505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f102506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Executor f102507n;

    i1(Context context, Looper looper, Executor executor) {
        h1 h1Var = new h1(this, null);
        this.f102503j = h1Var;
        this.f102501h = context.getApplicationContext();
        this.f102502i = new xg.p(looper, h1Var);
        this.f102504k = og.a.b();
        this.f102505l = 5000L;
        this.f102506m = 300000L;
        this.f102507n = executor;
    }

    @Override // jg.j
    protected final gg.a c(f1 f1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        gg.a aVarJ;
        s.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f102500g;
        synchronized (map) {
            try {
                g1 g1Var = (g1) map.get(f1Var);
                if (executor == null) {
                    executor = this.f102507n;
                }
                if (g1Var == null) {
                    g1Var = new g1(this, f1Var);
                    g1Var.b(serviceConnection, serviceConnection, str);
                    UserHandle userHandleE = f1Var.e();
                    aVarJ = (userHandleE == null || Build.VERSION.SDK_INT < 33) ? g1Var.j(str, executor) : g1Var.k(str, userHandleE);
                    map.put(f1Var, g1Var);
                } else {
                    this.f102502i.removeMessages(0, f1Var);
                    if (g1Var.f(serviceConnection)) {
                        String string = f1Var.toString();
                        StringBuilder sb5 = new StringBuilder(string.length() + 81);
                        sb5.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb5.append(string);
                        throw new IllegalStateException(sb5.toString());
                    }
                    g1Var.b(serviceConnection, serviceConnection, str);
                    int iE = g1Var.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(g1Var.i(), g1Var.h());
                    } else if (iE == 2) {
                        UserHandle userHandleE2 = f1Var.e();
                        aVarJ = (userHandleE2 == null || Build.VERSION.SDK_INT < 33) ? g1Var.j(str, executor) : g1Var.k(str, userHandleE2);
                    }
                    aVarJ = null;
                }
                if (g1Var.d()) {
                    return gg.a.f72705f;
                }
                if (aVarJ == null) {
                    aVarJ = new gg.a(-1);
                }
                return aVarJ;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // jg.j
    protected final void e(f1 f1Var, ServiceConnection serviceConnection, String str) {
        s.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f102500g;
        synchronized (map) {
            try {
                g1 g1Var = (g1) map.get(f1Var);
                if (g1Var == null) {
                    String string = f1Var.toString();
                    StringBuilder sb5 = new StringBuilder(string.length() + 50);
                    sb5.append("Nonexistent connection status for service config: ");
                    sb5.append(string);
                    throw new IllegalStateException(sb5.toString());
                }
                if (!g1Var.f(serviceConnection)) {
                    String string2 = f1Var.toString();
                    StringBuilder sb6 = new StringBuilder(string2.length() + 76);
                    sb6.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb6.append(string2);
                    throw new IllegalStateException(sb6.toString());
                }
                g1Var.c(serviceConnection, str);
                if (g1Var.g()) {
                    this.f102502i.sendMessageDelayed(this.f102502i.obtainMessage(0, f1Var), this.f102505l);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final /* synthetic */ HashMap f() {
        return this.f102500g;
    }

    final /* synthetic */ Context g() {
        return this.f102501h;
    }

    final /* synthetic */ Handler h() {
        return this.f102502i;
    }

    final /* synthetic */ og.a i() {
        return this.f102504k;
    }

    final /* synthetic */ long j() {
        return this.f102506m;
    }
}
