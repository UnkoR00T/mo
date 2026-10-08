package vd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
class w implements n.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f206233b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f206235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue<n<?>> f206236e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<n<?>>> f206232a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f206234c = null;

    w(c cVar, BlockingQueue<n<?>> blockingQueue, q qVar) {
        this.f206233b = qVar;
        this.f206235d = cVar;
        this.f206236e = blockingQueue;
    }

    @Override // vd.n.b
    public void a(n<?> nVar, p<?> pVar) {
        List<n<?>> listRemove;
        b.a aVar = pVar.f206218b;
        if (aVar == null || aVar.a()) {
            b(nVar);
            return;
        }
        String strT = nVar.t();
        synchronized (this) {
            listRemove = this.f206232a.remove(strT);
        }
        if (listRemove != null) {
            if (v.f206224b) {
                v.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strT);
            }
            Iterator<n<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f206233b.c(it.next(), pVar);
            }
        }
    }

    @Override // vd.n.b
    public synchronized void b(n<?> nVar) {
        BlockingQueue<n<?>> blockingQueue;
        try {
            String strT = nVar.t();
            List<n<?>> listRemove = this.f206232a.remove(strT);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (v.f206224b) {
                    v.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strT);
                }
                n<?> nVarRemove = listRemove.remove(0);
                this.f206232a.put(strT, listRemove);
                nVarRemove.U(this);
                o oVar = this.f206234c;
                if (oVar != null) {
                    oVar.f(nVarRemove);
                } else if (this.f206235d != null && (blockingQueue = this.f206236e) != null) {
                    try {
                        blockingQueue.put(nVarRemove);
                    } catch (InterruptedException e15) {
                        v.c("Couldn't add request to queue. %s", e15.toString());
                        Thread.currentThread().interrupt();
                        this.f206235d.d();
                    }
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    synchronized boolean c(n<?> nVar) {
        try {
            String strT = nVar.t();
            if (!this.f206232a.containsKey(strT)) {
                this.f206232a.put(strT, null);
                nVar.U(this);
                if (v.f206224b) {
                    v.b("new request, sending to network %s", strT);
                }
                return false;
            }
            List<n<?>> arrayList = this.f206232a.get(strT);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            nVar.e("waiting-for-response");
            arrayList.add(nVar);
            this.f206232a.put(strT, arrayList);
            if (v.f206224b) {
                v.b("Request for cacheKey=%s is in flight, putting on hold.", strT);
            }
            return true;
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
