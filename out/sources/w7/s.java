package w7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f210754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f210755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f210756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b<T> f210757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f210758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f210759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<Runnable> f210760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f210761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f210762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f210763j;

    public interface a<T> {
        void b(T t15);
    }

    public interface b<T> {
        void a(T t15, t7.n nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f210764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private t7.n.b f210765b = new t7.n.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f210766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f210767d;

        public c(T t15) {
            this.f210764a = t15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(b<T> bVar) {
            this.f210767d = true;
            if (bVar == null || !this.f210766c) {
                return;
            }
            this.f210766c = false;
            bVar.a(this.f210764a, this.f210765b.e());
        }

        public void b(int i15, a<T> aVar) {
            if (this.f210767d) {
                return;
            }
            if (i15 != -1) {
                this.f210765b.a(i15);
            }
            this.f210766c = true;
            aVar.b(this.f210764a);
        }

        public void c(b<T> bVar) {
            if (this.f210767d || !this.f210766c) {
                return;
            }
            t7.n nVarE = this.f210765b.e();
            this.f210765b = new t7.n.b();
            this.f210766c = false;
            bVar.a(this.f210764a, nVarE);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f210764a.equals(((c) obj).f210764a);
        }

        public int hashCode() {
            return this.f210764a.hashCode();
        }
    }

    public s(Looper looper) {
        this(looper.getThread());
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i15, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(i15, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(Message message) {
        b<T> bVar = (b) zj.p.q(this.f210757d);
        Iterator<c<T>> it = this.f210758e.iterator();
        while (it.hasNext()) {
            it.next().c(bVar);
            if (((p) zj.p.q(this.f210756c)).c(1)) {
                break;
            }
        }
        return true;
    }

    private void m() {
        if (this.f210763j) {
            zj.p.w(g());
        }
    }

    public void c(T t15) {
        zj.p.q(t15);
        synchronized (this.f210761h) {
            try {
                if (this.f210762i) {
                    return;
                }
                this.f210758e.add(new c<>(t15));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public s<T> d(Looper looper, h hVar, b<T> bVar) {
        zj.p.w(hVar != null || bVar == null);
        return new s<>(this.f210758e, looper, looper.getThread(), hVar, bVar, this.f210763j);
    }

    public void e() {
        m();
        if (this.f210760g.isEmpty()) {
            return;
        }
        if (this.f210757d != null && !((p) zj.p.q(this.f210756c)).c(1)) {
            p pVar = this.f210756c;
            pVar.i(pVar.b(1));
        }
        boolean zIsEmpty = this.f210759f.isEmpty();
        this.f210759f.addAll(this.f210760g);
        this.f210760g.clear();
        if (zIsEmpty) {
            while (!this.f210759f.isEmpty()) {
                this.f210759f.peekFirst().run();
                this.f210759f.removeFirst();
            }
        }
    }

    public boolean g() {
        return Thread.currentThread() == this.f210755b;
    }

    public void h(final int i15, final a<T> aVar) {
        m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f210758e);
        this.f210760g.add(new Runnable() { // from class: w7.r
            @Override // java.lang.Runnable
            public final void run() {
                s.a(copyOnWriteArraySet, i15, aVar);
            }
        });
    }

    public void i() {
        m();
        synchronized (this.f210761h) {
            this.f210762i = true;
        }
        Iterator<c<T>> it = this.f210758e.iterator();
        while (it.hasNext()) {
            it.next().d(this.f210757d);
        }
        this.f210758e.clear();
    }

    public void j(T t15) {
        m();
        for (c<T> cVar : this.f210758e) {
            if (cVar.f210764a.equals(t15)) {
                cVar.d(this.f210757d);
                this.f210758e.remove(cVar);
            }
        }
    }

    public void k(int i15, a<T> aVar) {
        h(i15, aVar);
        e();
    }

    public void l(a<T> aVar) {
        k(-1, aVar);
    }

    public s(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public s(Looper looper, h hVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), hVar, bVar, true);
    }

    private s(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, Thread thread, h hVar, b<T> bVar, boolean z15) {
        this.f210754a = hVar;
        this.f210755b = thread;
        this.f210758e = copyOnWriteArraySet;
        this.f210757d = bVar;
        this.f210761h = new Object();
        this.f210759f = new ArrayDeque<>();
        this.f210760g = new ArrayDeque<>();
        if (looper != null && hVar != null && bVar != null) {
            this.f210756c = hVar.e(looper, new Handler.Callback() { // from class: w7.q
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f210744a.f(message);
                }
            });
        } else {
            this.f210756c = null;
        }
        this.f210763j = z15;
    }
}
