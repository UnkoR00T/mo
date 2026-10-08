package wj;

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
public final class t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f213736n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f213737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f213738b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f213743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f213744h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f213748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IInterface f213749m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f213740d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f213741e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f213742f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f213746j = new IBinder.DeathRecipient() { // from class: wj.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f213725a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f213747k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f213739c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f213745i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, vj.i iVar2, o oVar) {
        this.f213737a = context;
        this.f213738b = iVar;
        this.f213744h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.f213738b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f213745i.get();
        if (oVar != null) {
            tVar.f213738b.c("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.f213738b.c("%s : Binder has died.", tVar.f213739c);
            Iterator it = tVar.f213740d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f213740d.clear();
        }
        synchronized (tVar.f213742f) {
            tVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final t tVar, final vh.m mVar) {
        tVar.f213741e.add(mVar);
        mVar.a().c(new vh.f() { // from class: wj.l
            @Override // vh.f
            public final void a(vh.l lVar) {
                this.f213726a.t(mVar, lVar);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f213749m != null || tVar.f213743g) {
            if (!tVar.f213743g) {
                jVar.run();
                return;
            } else {
                tVar.f213738b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f213740d.add(jVar);
                return;
            }
        }
        tVar.f213738b.c("Initiate binding to the service.", new Object[0]);
        tVar.f213740d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f213748l = rVar;
        tVar.f213743g = true;
        if (tVar.f213737a.bindService(tVar.f213744h, rVar, 1)) {
            return;
        }
        tVar.f213738b.c("Failed to bind to the service.", new Object[0]);
        tVar.f213743g = false;
        Iterator it = tVar.f213740d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f213740d.clear();
    }

    static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.f213738b.c("linkToDeath", new Object[0]);
        try {
            tVar.f213749m.asBinder().linkToDeath(tVar.f213746j, 0);
        } catch (RemoteException e15) {
            tVar.f213738b.b(e15, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.f213738b.c("unlinkToDeath", new Object[0]);
        tVar.f213749m.asBinder().unlinkToDeath(tVar.f213746j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f213739c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f213741e.iterator();
        while (it.hasNext()) {
            ((vh.m) it.next()).d(v());
        }
        this.f213741e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f213736n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f213739c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f213739c, 10);
                    handlerThread.start();
                    map.put(this.f213739c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f213739c);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f213749m;
    }

    public final void s(j jVar, vh.m mVar) {
        c().post(new m(this, jVar.b(), mVar, jVar));
    }

    final /* synthetic */ void t(vh.m mVar, vh.l lVar) {
        synchronized (this.f213742f) {
            this.f213741e.remove(mVar);
        }
    }

    public final void u(vh.m mVar) {
        synchronized (this.f213742f) {
            this.f213741e.remove(mVar);
        }
        c().post(new n(this));
    }
}
