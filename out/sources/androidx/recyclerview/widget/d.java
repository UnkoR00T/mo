package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Executor f13235h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f13236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c<T> f13237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Executor f13238c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<T> f13240e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f13242g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b<T>> f13239d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<T> f13241f = Collections.EMPTY_LIST;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f13243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f13244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f13246d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C0277a extends h.b {
            C0277a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean a(int i15, int i16) {
                Object obj = a.this.f13243a.get(i15);
                Object obj2 = a.this.f13244b.get(i16);
                if (obj != null && obj2 != null) {
                    return d.this.f13237b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public boolean b(int i15, int i16) {
                Object obj = a.this.f13243a.get(i15);
                Object obj2 = a.this.f13244b.get(i16);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f13237b.b().b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.h.b
            public Object c(int i15, int i16) {
                Object obj = a.this.f13243a.get(i15);
                Object obj2 = a.this.f13244b.get(i16);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f13237b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int d() {
                return a.this.f13244b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int e() {
                return a.this.f13243a.size();
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h.e f13249a;

            b(h.e eVar) {
                this.f13249a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f13242g == aVar.f13245c) {
                    dVar.c(aVar.f13244b, this.f13249a, aVar.f13246d);
                }
            }
        }

        a(List list, List list2, int i15, Runnable runnable) {
            this.f13243a = list;
            this.f13244b = list2;
            this.f13245c = i15;
            this.f13246d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f13238c.execute(new b(h.b(new C0277a())));
        }
    }

    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    private static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f13251a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f13251a.post(runnable);
        }
    }

    public d(n nVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f13236a = nVar;
        this.f13237b = cVar;
        if (cVar.c() != null) {
            this.f13238c = cVar.c();
        } else {
            this.f13238c = f13235h;
        }
    }

    private void d(List<T> list, Runnable runnable) {
        Iterator<b<T>> it = this.f13239d.iterator();
        while (it.hasNext()) {
            it.next().a(list, this.f13241f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f13239d.add(bVar);
    }

    public List<T> b() {
        return this.f13241f;
    }

    void c(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f13241f;
        this.f13240e = list;
        this.f13241f = Collections.unmodifiableList(list);
        eVar.b(this.f13236a);
        d(list2, runnable);
    }

    public void e(List<T> list) {
        f(list, null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i15 = this.f13242g + 1;
        this.f13242g = i15;
        List<T> list2 = this.f13240e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f13241f;
        if (list == null) {
            int size = list2.size();
            this.f13240e = null;
            this.f13241f = Collections.EMPTY_LIST;
            this.f13236a.b(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f13237b.a().execute(new a(list2, list, i15, runnable));
            return;
        }
        this.f13240e = list;
        this.f13241f = Collections.unmodifiableList(list);
        this.f13236a.a(0, list.size());
        d(list3, runnable);
    }
}
