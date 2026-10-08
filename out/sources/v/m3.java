package v;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class m3<T> implements x2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<Object> f202683b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f202682a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f202684c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f202685d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<x2.a<? super T>, b<T>> f202686e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<b<T>> f202687f = new CopyOnWriteArraySet<>();

    static abstract class a {
        a() {
        }

        static a b(Throwable th4) {
            return new p(th4);
        }

        public abstract Throwable a();
    }

    private static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Object f202688h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f202689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x2.a<? super T> f202690b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference<Object> f202692d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f202691c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f202693e = f202688h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f202694f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f202695g = false;

        b(AtomicReference<Object> atomicReference, Executor executor, x2.a<? super T> aVar) {
            this.f202692d = atomicReference;
            this.f202689a = executor;
            this.f202690b = aVar;
        }

        void a() {
            this.f202691c.set(false);
        }

        void b(int i15) {
            synchronized (this) {
                try {
                    if (this.f202691c.get()) {
                        if (i15 <= this.f202694f) {
                            return;
                        }
                        this.f202694f = i15;
                        if (this.f202695g) {
                            return;
                        }
                        this.f202695g = true;
                        try {
                            this.f202689a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f202695g = false;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f202691c.get()) {
                        this.f202695g = false;
                        return;
                    }
                    Object obj = this.f202692d.get();
                    int i15 = this.f202694f;
                    while (true) {
                        if (!Objects.equals(this.f202693e, obj)) {
                            this.f202693e = obj;
                            if (obj instanceof a) {
                                this.f202690b.onError(((a) obj).a());
                            } else {
                                this.f202690b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i15 == this.f202694f || !this.f202691c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f202692d.get();
                                    i15 = this.f202694f;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    this.f202695g = false;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    m3(Object obj, boolean z15) {
        if (!z15) {
            this.f202683b = new AtomicReference<>(obj);
        } else {
            i6.i.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f202683b = new AtomicReference<>(a.b((Throwable) obj));
        }
    }

    private void d(x2.a<? super T> aVar) {
        b<T> bVarRemove = this.f202686e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.a();
            this.f202687f.remove(bVarRemove);
        }
    }

    private void f(Object obj) {
        Iterator<b<T>> it;
        int i15;
        synchronized (this.f202682a) {
            try {
                if (Objects.equals(this.f202683b.getAndSet(obj), obj)) {
                    return;
                }
                int i16 = this.f202684c + 1;
                this.f202684c = i16;
                if (this.f202685d) {
                    return;
                }
                this.f202685d = true;
                Iterator<b<T>> it4 = this.f202687f.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        it4.next().b(i16);
                    } else {
                        synchronized (this.f202682a) {
                            try {
                                if (this.f202684c == i16) {
                                    this.f202685d = false;
                                    return;
                                } else {
                                    it = this.f202687f.iterator();
                                    i15 = this.f202684c;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        it4 = it;
                        i16 = i15;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // v.x2
    public void a(Executor executor, x2.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f202682a) {
            d(aVar);
            bVar = new b<>(this.f202683b, executor, aVar);
            this.f202686e.put(aVar, bVar);
            this.f202687f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // v.x2
    public com.google.common.util.concurrent.q<T> b() {
        Object obj = this.f202683b.get();
        return obj instanceof a ? a0.f.f(((a) obj).a()) : a0.f.h(obj);
    }

    @Override // v.x2
    public void c(x2.a<? super T> aVar) {
        synchronized (this.f202682a) {
            d(aVar);
        }
    }

    void e(T t15) {
        f(t15);
    }
}
