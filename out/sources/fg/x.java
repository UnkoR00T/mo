package fg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import io.sentry.android.core.c2;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class x implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    y f62314c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ d0 f62317f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f62312a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Messenger f62313b = new Messenger(new wg.f(Looper.getMainLooper(), new Handler.Callback() { // from class: fg.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i15 = message.arg1;
            x xVar = this.f62309a;
            synchronized (xVar) {
                try {
                    a0 a0Var = (a0) xVar.f62316e.get(i15);
                    if (a0Var == null) {
                        c2.g("MessengerIpcClient", "Received response for unknown request: " + i15);
                        return true;
                    }
                    xVar.f62316e.remove(i15);
                    xVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        a0Var.c(new b0(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    a0Var.a(data);
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Queue f62315d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseArray f62316e = new SparseArray();

    /* synthetic */ x(d0 d0Var, w wVar) {
        this.f62317f = d0Var;
    }

    final synchronized void a(int i15, String str) {
        b(i15, str, null);
    }

    final synchronized void b(int i15, String str, Throwable th4) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i16 = this.f62312a;
            if (i16 == 0) {
                throw new IllegalStateException();
            }
            if (i16 != 1 && i16 != 2) {
                if (i16 != 3) {
                    return;
                }
                this.f62312a = 4;
                return;
            }
            this.f62312a = 4;
            og.a.b().c(this.f62317f.f62275a, this);
            b0 b0Var = new b0(i15, str, th4);
            Iterator it = this.f62315d.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).c(b0Var);
            }
            this.f62315d.clear();
            for (int i17 = 0; i17 < this.f62316e.size(); i17++) {
                ((a0) this.f62316e.valueAt(i17)).c(b0Var);
            }
            this.f62316e.clear();
        } catch (Throwable th5) {
            throw th5;
        }
    }

    final void c() {
        this.f62317f.f62276b.execute(new Runnable() { // from class: fg.r
            @Override // java.lang.Runnable
            public final void run() {
                final a0 a0Var;
                while (true) {
                    final x xVar = this.f62306a;
                    synchronized (xVar) {
                        try {
                            if (xVar.f62312a != 2) {
                                return;
                            }
                            if (xVar.f62315d.isEmpty()) {
                                xVar.f();
                                return;
                            } else {
                                a0Var = (a0) xVar.f62315d.poll();
                                xVar.f62316e.put(a0Var.f62257a, a0Var);
                                xVar.f62317f.f62276b.schedule(new Runnable() { // from class: fg.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        xVar.e(a0Var.f62257a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(a0Var));
                    }
                    d0 d0Var = xVar.f62317f;
                    Messenger messenger = xVar.f62313b;
                    int i15 = a0Var.f62259c;
                    Context context = d0Var.f62275a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i15;
                    messageObtain.arg1 = a0Var.f62257a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a0Var.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", a0Var.f62260d);
                    messageObtain.setData(bundle);
                    try {
                        xVar.f62314c.a(messageObtain);
                    } catch (RemoteException e15) {
                        xVar.a(2, e15.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f62312a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i15) {
        a0 a0Var = (a0) this.f62316e.get(i15);
        if (a0Var != null) {
            c2.g("MessengerIpcClient", "Timing out request: " + i15);
            this.f62316e.remove(i15);
            a0Var.c(new b0(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        if (this.f62312a == 2 && this.f62315d.isEmpty() && this.f62316e.size() == 0) {
            this.f62312a = 3;
            og.a.b().c(this.f62317f.f62275a, this);
        }
    }

    final synchronized boolean g(a0 a0Var) {
        int i15 = this.f62312a;
        if (i15 != 0) {
            if (i15 == 1) {
                this.f62315d.add(a0Var);
                return true;
            }
            if (i15 != 2) {
                return false;
            }
            this.f62315d.add(a0Var);
            c();
            return true;
        }
        this.f62315d.add(a0Var);
        jg.s.o(this.f62312a == 0);
        this.f62312a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (og.a.b().a(this.f62317f.f62275a, intent, this, 1)) {
                this.f62317f.f62276b.schedule(new Runnable() { // from class: fg.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62307a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e15) {
            b(0, "Unable to bind to service", e15);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f62317f.f62276b.execute(new Runnable() { // from class: fg.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = this.f62304a;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    if (iBinder2 == null) {
                        xVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        xVar.f62314c = new y(iBinder2);
                        xVar.f62312a = 2;
                        xVar.c();
                    } catch (RemoteException e15) {
                        xVar.a(0, e15.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f62317f.f62276b.execute(new Runnable() { // from class: fg.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f62308a.a(2, "Service disconnected");
            }
        });
    }
}
