package jg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import android.os.UserHandle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class g1 implements ServiceConnection, j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f102489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f102492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f1 f102493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f102494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ i1 f102495g;

    public g1(i1 i1Var, f1 f1Var) {
        Objects.requireNonNull(i1Var);
        this.f102495g = i1Var;
        this.f102493e = f1Var;
        this.f102489a = new HashMap();
        this.f102490b = 2;
    }

    public final void a(String str) {
        f1 f1Var = this.f102493e;
        i1 i1Var = this.f102495g;
        i1Var.h().removeMessages(1, f1Var);
        i1Var.i().c(i1Var.g(), this);
        this.f102491c = false;
        this.f102490b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f102489a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f102489a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f102491c;
    }

    public final int e() {
        return this.f102490b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f102489a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f102489a.isEmpty();
    }

    public final IBinder h() {
        return this.f102492d;
    }

    public final ComponentName i() {
        return this.f102494f;
    }

    final /* synthetic */ gg.a j(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = u0.a(this.f102495g.g(), this.f102493e);
            this.f102490b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.p.a();
            try {
                i1 i1Var = this.f102495g;
                og.a aVarI = i1Var.i();
                Context contextG = i1Var.g();
                f1 f1Var = this.f102493e;
                try {
                    boolean zD = aVarI.d(contextG, str, intentA, this, 4225, executor);
                    this.f102491c = zD;
                    if (zD) {
                        i1Var.h().sendMessageDelayed(i1Var.h().obtainMessage(1, f1Var), i1Var.j());
                        gg.a aVar = gg.a.f72705f;
                        StrictMode.setVmPolicy(vmPolicyA);
                        return aVar;
                    }
                    this.f102490b = 2;
                    try {
                        i1Var.i().c(i1Var.g(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    gg.a aVar2 = new gg.a(16);
                    StrictMode.setVmPolicy(vmPolicyA);
                    return aVar2;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    StrictMode.setVmPolicy(vmPolicyA);
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (s0 e15) {
            return e15.f102552a;
        }
    }

    final /* synthetic */ gg.a k(String str, UserHandle userHandle) throws Throwable {
        try {
            Intent intentA = u0.a(this.f102495g.g(), this.f102493e);
            this.f102490b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.p.a();
            try {
                i1 i1Var = this.f102495g;
                og.a aVarI = i1Var.i();
                Context contextG = i1Var.g();
                f1 f1Var = this.f102493e;
                try {
                    boolean zE = aVarI.e(contextG, str, intentA, this, 4225, userHandle);
                    this.f102491c = zE;
                    if (!zE) {
                        this.f102490b = 2;
                        gg.a aVar = new gg.a(16);
                        StrictMode.setVmPolicy(vmPolicyA);
                        return aVar;
                    }
                    i1Var.h().sendMessageDelayed(i1Var.h().obtainMessage(1, f1Var), i1Var.j());
                    gg.a aVar2 = gg.a.f72705f;
                    StrictMode.setVmPolicy(vmPolicyA);
                    return aVar2;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    StrictMode.setVmPolicy(vmPolicyA);
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (s0 e15) {
            return e15.f102552a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i1 i1Var = this.f102495g;
        synchronized (i1Var.f()) {
            try {
                i1Var.h().removeMessages(1, this.f102493e);
                this.f102492d = iBinder;
                this.f102494f = componentName;
                Iterator it = this.f102489a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f102490b = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i1 i1Var = this.f102495g;
        synchronized (i1Var.f()) {
            try {
                i1Var.h().removeMessages(1, this.f102493e);
                this.f102492d = null;
                this.f102494f = componentName;
                Iterator it = this.f102489a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f102490b = 2;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
