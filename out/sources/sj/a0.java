package sj;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f181957o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f181958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f181959b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f181964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f181965h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f181969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IInterface f181970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rj.o f181971n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f181961d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f181962e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f181963f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f181967j = new IBinder.DeathRecipient() { // from class: sj.s
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            a0.j(this.f181990a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f181968k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f181960c = "AppUpdateService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f181966i = new WeakReference(null);

    public a0(Context context, p pVar, String str, Intent intent, rj.o oVar, v vVar) {
        this.f181958a = context;
        this.f181959b = pVar;
        this.f181965h = intent;
        this.f181971n = oVar;
    }

    public static /* synthetic */ void j(a0 a0Var) {
        a0Var.f181959b.c("reportBinderDeath", new Object[0]);
        v vVar = (v) a0Var.f181966i.get();
        if (vVar != null) {
            a0Var.f181959b.c("calling onBinderDied", new Object[0]);
            vVar.zza();
        } else {
            a0Var.f181959b.c("%s : Binder has died.", a0Var.f181960c);
            Iterator it = a0Var.f181961d.iterator();
            while (it.hasNext()) {
                ((q) it.next()).c(a0Var.v());
            }
            a0Var.f181961d.clear();
        }
        synchronized (a0Var.f181963f) {
            a0Var.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final a0 a0Var, final vh.m mVar) {
        a0Var.f181962e.add(mVar);
        mVar.a().c(new vh.f() { // from class: sj.r
            @Override // vh.f
            public final void a(vh.l lVar) {
                this.f181988a.t(mVar, lVar);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(a0 a0Var, q qVar) {
        if (a0Var.f181970m != null || a0Var.f181964g) {
            if (!a0Var.f181964g) {
                qVar.run();
                return;
            } else {
                a0Var.f181959b.c("Waiting to bind to the service.", new Object[0]);
                a0Var.f181961d.add(qVar);
                return;
            }
        }
        a0Var.f181959b.c("Initiate binding to the service.", new Object[0]);
        a0Var.f181961d.add(qVar);
        z zVar = new z(a0Var, null);
        a0Var.f181969l = zVar;
        a0Var.f181964g = true;
        if (a0Var.f181958a.bindService(a0Var.f181965h, zVar, 1)) {
            return;
        }
        a0Var.f181959b.c("Failed to bind to the service.", new Object[0]);
        a0Var.f181964g = false;
        Iterator it = a0Var.f181961d.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c(new b0());
        }
        a0Var.f181961d.clear();
    }

    static /* bridge */ /* synthetic */ void q(a0 a0Var) {
        a0Var.f181959b.c("linkToDeath", new Object[0]);
        try {
            a0Var.f181970m.asBinder().linkToDeath(a0Var.f181967j, 0);
        } catch (RemoteException e15) {
            a0Var.f181959b.b(e15, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(a0 a0Var) {
        a0Var.f181959b.c("unlinkToDeath", new Object[0]);
        a0Var.f181970m.asBinder().unlinkToDeath(a0Var.f181967j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f181960c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f181962e.iterator();
        while (it.hasNext()) {
            ((vh.m) it.next()).d(v());
        }
        this.f181962e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f181957o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f181960c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f181960c, 10);
                    handlerThread.start();
                    map.put(this.f181960c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f181960c);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f181970m;
    }

    public final void s(q qVar, vh.m mVar) {
        c().post(new t(this, qVar.b(), mVar, qVar));
    }

    final /* synthetic */ void t(vh.m mVar, vh.l lVar) {
        synchronized (this.f181963f) {
            this.f181962e.remove(mVar);
        }
    }

    public final void u(vh.m mVar) {
        synchronized (this.f181963f) {
            this.f181962e.remove(mVar);
        }
        c().post(new u(this));
    }
}
