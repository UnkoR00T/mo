package v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements x2<List<o.p>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<o.p> f202497c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f202495a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f202496b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f202498d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f202499e = false;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Executor f202500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x2.a<? super List<o.p>> f202501b;

        a(Executor executor, x2.a<? super List<o.p>> aVar) {
            this.f202500a = executor;
            this.f202501b = aVar;
        }
    }

    public b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o.p.a.a(it.next()));
        }
        this.f202497c = arrayList;
    }

    public static /* synthetic */ void d(Throwable th4, a aVar, List list) {
        if (th4 != null) {
            aVar.f202501b.onError(th4);
        } else {
            aVar.f202501b.a(list);
        }
    }

    private void e(final a aVar, final List<o.p> list, final Throwable th4) {
        aVar.f202500a.execute(new Runnable() { // from class: v.a
            @Override // java.lang.Runnable
            public final void run() {
                b.d(th4, aVar, list);
            }
        });
    }

    private void j(List<o.p> list, Throwable th4) {
        boolean z15;
        List<o.p> listUnmodifiableList;
        Throwable th5;
        synchronized (this.f202495a) {
            z15 = true;
            try {
                if (th4 != null) {
                    if (this.f202498d != null && this.f202497c.isEmpty()) {
                        z15 = false;
                    }
                    this.f202498d = th4;
                    this.f202497c = Collections.EMPTY_LIST;
                } else {
                    i6.i.g(list);
                    if (this.f202498d == null && this.f202497c.equals(list)) {
                        z15 = false;
                    }
                    this.f202498d = null;
                    this.f202497c = list;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f202497c);
                th5 = this.f202498d;
            } catch (Throwable th6) {
                throw th6;
            }
        }
        if (z15) {
            this.f202496b.size();
            Iterator<a> it = this.f202496b.iterator();
            while (it.hasNext()) {
                e(it.next(), listUnmodifiableList, th5);
            }
        }
    }

    @Override // v.x2
    public void a(Executor executor, x2.a<? super List<o.p>> aVar) {
        List<o.p> listUnmodifiableList;
        Throwable th4;
        i6.i.g(executor);
        i6.i.g(aVar);
        this.f202496b.add(new a(executor, aVar));
        synchronized (this.f202495a) {
            try {
                if (!this.f202499e && !this.f202496b.isEmpty()) {
                    this.f202499e = true;
                    f();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f202497c);
                th4 = this.f202498d;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        e(new a(executor, aVar), listUnmodifiableList, th4);
    }

    @Override // v.x2
    public void c(x2.a<? super List<o.p>> aVar) {
        a next;
        i6.i.g(aVar);
        Iterator<a> it = this.f202496b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.f202501b.equals(aVar));
        if (next != null) {
            this.f202496b.remove(next);
        }
        synchronized (this.f202495a) {
            try {
                if (this.f202499e && this.f202496b.isEmpty()) {
                    this.f202499e = false;
                    g();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected abstract void f();

    protected abstract void g();

    protected void h(List<o.p> list) {
        j(list, null);
    }

    protected void i(Throwable th4) {
        j(null, th4);
    }
}
