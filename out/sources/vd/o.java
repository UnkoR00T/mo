package vd;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f206206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<n<?>> f206207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f206208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<n<?>> f206209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vd.b f206210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f206211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q f206212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i[] f206213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f206214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<b> f206215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<a> f206216k;

    public interface a {
        void a(n<?> nVar, int i15);
    }

    @Deprecated
    public interface b<T> {
        void a(n<T> nVar);
    }

    public o(vd.b bVar, h hVar, int i15, q qVar) {
        this.f206206a = new AtomicInteger();
        this.f206207b = new HashSet();
        this.f206208c = new PriorityBlockingQueue<>();
        this.f206209d = new PriorityBlockingQueue<>();
        this.f206215j = new ArrayList();
        this.f206216k = new ArrayList();
        this.f206210e = bVar;
        this.f206211f = hVar;
        this.f206213h = new i[i15];
        this.f206212g = qVar;
    }

    public <T> n<T> a(n<T> nVar) {
        nVar.W(this);
        synchronized (this.f206207b) {
            this.f206207b.add(nVar);
        }
        nVar.Y(d());
        nVar.e("add-to-queue");
        e(nVar, 0);
        b(nVar);
        return nVar;
    }

    <T> void b(n<T> nVar) {
        if (nVar.a0()) {
            this.f206208c.add(nVar);
        } else {
            f(nVar);
        }
    }

    <T> void c(n<T> nVar) {
        synchronized (this.f206207b) {
            this.f206207b.remove(nVar);
        }
        synchronized (this.f206215j) {
            try {
                Iterator<b> it = this.f206215j.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        e(nVar, 5);
    }

    public int d() {
        return this.f206206a.incrementAndGet();
    }

    void e(n<?> nVar, int i15) {
        synchronized (this.f206216k) {
            try {
                Iterator<a> it = this.f206216k.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar, i15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    <T> void f(n<T> nVar) {
        this.f206209d.add(nVar);
    }

    public void g() {
        h();
        c cVar = new c(this.f206208c, this.f206209d, this.f206210e, this.f206212g);
        this.f206214i = cVar;
        cVar.start();
        for (int i15 = 0; i15 < this.f206213h.length; i15++) {
            i iVar = new i(this.f206209d, this.f206211f, this.f206210e, this.f206212g);
            this.f206213h[i15] = iVar;
            iVar.start();
        }
    }

    public void h() {
        c cVar = this.f206214i;
        if (cVar != null) {
            cVar.d();
        }
        for (i iVar : this.f206213h) {
            if (iVar != null) {
                iVar.e();
            }
        }
    }

    public o(vd.b bVar, h hVar, int i15) {
        this(bVar, hVar, i15, new f(new Handler(Looper.getMainLooper())));
    }

    public o(vd.b bVar, h hVar) {
        this(bVar, hVar, 4);
    }
}
