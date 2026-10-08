package bm;

import android.content.Context;
import android.os.AsyncTask;
import bm.b;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nh.h;

/* JADX INFO: loaded from: classes4.dex */
public class c<T extends bm.b> implements lh.c.InterfaceC2868c, lh.c.p, lh.c.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final em.b f20091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final em.b.a f20092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final em.b.a f20093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private cm.g<T> f20094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dm.a<T> f20095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private lh.c f20096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CameraPosition f20097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c<T>.a f20098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ReadWriteLock f20099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e<T> f20100j;

    private class a extends AsyncTask<Float, Void, Set<? extends bm.a<T>>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<? extends bm.a<T>> doInBackground(Float... fArr) {
            cm.b<T> bVarH = c.this.h();
            bVarH.lock();
            try {
                return bVarH.f(fArr[0].floatValue());
            } finally {
                bVarH.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Set<? extends bm.a<T>> set) {
            c.this.f20095e.i(set);
        }

        private a() {
        }
    }

    public interface b<T extends bm.b> {
    }

    /* JADX INFO: renamed from: bm.c$c, reason: collision with other inner class name */
    public interface InterfaceC0519c<T extends bm.b> {
    }

    public interface d<T extends bm.b> {
    }

    public interface e<T extends bm.b> {
        boolean a(T t15);
    }

    public interface f<T extends bm.b> {
    }

    public interface g<T extends bm.b> {
    }

    public c(Context context, lh.c cVar) {
        this(context, cVar, new em.b(cVar));
    }

    @Override // lh.c.InterfaceC2868c
    public void a() {
        dm.a<T> aVar = this.f20095e;
        if (aVar instanceof lh.c.InterfaceC2868c) {
            ((lh.c.InterfaceC2868c) aVar).a();
        }
        this.f20094d.b(this.f20096f.f());
        if (this.f20094d.e()) {
            g();
            return;
        }
        CameraPosition cameraPosition = this.f20097g;
        if (cameraPosition == null || cameraPosition.f31420b != this.f20096f.f().f31420b) {
            this.f20097g = this.f20096f.f();
            g();
        }
    }

    public boolean c(Collection<T> collection) {
        cm.b<T> bVarH = h();
        bVarH.lock();
        try {
            return bVarH.c(collection);
        } finally {
            bVarH.unlock();
        }
    }

    @Override // lh.c.p
    public boolean d(h hVar) {
        return k().d(hVar);
    }

    public void e() {
        cm.b<T> bVarH = h();
        bVarH.lock();
        try {
            bVarH.d();
        } finally {
            bVarH.unlock();
        }
    }

    @Override // lh.c.j
    public void f(h hVar) {
        k().f(hVar);
    }

    public void g() {
        this.f20099i.writeLock().lock();
        try {
            this.f20098h.cancel(true);
            c<T>.a aVar = new a();
            this.f20098h = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f20096f.f().f31420b));
        } finally {
            this.f20099i.writeLock().unlock();
        }
    }

    public cm.b<T> h() {
        return this.f20094d;
    }

    public em.b.a i() {
        return this.f20093c;
    }

    public em.b.a j() {
        return this.f20092b;
    }

    public em.b k() {
        return this.f20091a;
    }

    public dm.a<T> l() {
        return this.f20095e;
    }

    public void m(cm.b<T> bVar) {
        if (bVar instanceof cm.g) {
            n((cm.g) bVar);
        } else {
            n(new cm.h(bVar));
        }
    }

    public void n(cm.g<T> gVar) {
        gVar.lock();
        try {
            cm.b<T> bVarH = h();
            this.f20094d = gVar;
            if (bVarH != null) {
                bVarH.lock();
                try {
                    gVar.c(bVarH.a());
                    bVarH.unlock();
                } catch (Throwable th4) {
                    bVarH.unlock();
                    throw th4;
                }
            }
            gVar.unlock();
            if (this.f20094d.e()) {
                this.f20094d.b(this.f20096f.f());
            }
            g();
        } catch (Throwable th5) {
            gVar.unlock();
            throw th5;
        }
    }

    public void o(e<T> eVar) {
        this.f20100j = eVar;
        this.f20095e.h(eVar);
    }

    public void p(dm.a<T> aVar) {
        this.f20095e.j(null);
        this.f20095e.h(null);
        this.f20093c.b();
        this.f20092b.b();
        this.f20095e.g();
        this.f20095e = aVar;
        aVar.e();
        this.f20095e.j(null);
        this.f20095e.d(null);
        this.f20095e.b(null);
        this.f20095e.h(this.f20100j);
        this.f20095e.f(null);
        this.f20095e.a(null);
        g();
    }

    public c(Context context, lh.c cVar, em.b bVar) {
        this.f20099i = new ReentrantReadWriteLock();
        this.f20096f = cVar;
        this.f20091a = bVar;
        this.f20093c = bVar.l();
        this.f20092b = bVar.l();
        this.f20095e = new dm.h(context, cVar, this);
        this.f20094d = new cm.h(new cm.f(new cm.c()));
        this.f20098h = new a();
        this.f20095e.e();
    }
}
