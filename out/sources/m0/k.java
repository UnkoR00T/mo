package m0;

import androidx.p016lifecycle.d0;
import androidx.p016lifecycle.q;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.e1;
import o.p;
import o.p1;
import o.u1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f121963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<a, c> f121965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<b, Set<a>> f121966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<q> f121967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    p.a f121968f;

    static abstract class a {
        a() {
        }

        static a a(q qVar, p pVar) {
            return new m0.a(System.identityHashCode(qVar), pVar);
        }

        public abstract p b();

        public abstract int c();
    }

    private static class b implements androidx.p016lifecycle.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f121969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f121970b;

        b(q qVar, k kVar) {
            this.f121970b = qVar;
            this.f121969a = kVar;
        }

        q a() {
            return this.f121970b;
        }

        @d0(androidx.lifecycle.j.a.ON_DESTROY)
        public void onDestroy(q qVar) {
            this.f121969a.o(qVar);
        }

        @d0(androidx.lifecycle.j.a.ON_START)
        public void onStart(q qVar) {
            this.f121969a.j(qVar);
        }

        @d0(androidx.lifecycle.j.a.ON_STOP)
        public void onStop(q qVar) {
            this.f121969a.k(qVar);
        }
    }

    k() {
        this(y.e.d());
    }

    private b d(q qVar) {
        synchronized (this.f121963a) {
            try {
                for (b bVar : this.f121966d.keySet()) {
                    if (qVar.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private boolean f(q qVar) {
        synchronized (this.f121963a) {
            try {
                b bVarD = d(qVar);
                if (bVarD == null) {
                    return false;
                }
                Iterator<a> it = this.f121966d.get(bVarD).iterator();
                while (it.hasNext()) {
                    if (!((c) i6.i.g(this.f121965c.get(it.next()))).v().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void g(q qVar) {
        b bVarD = d(qVar);
        if (bVarD == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set<a> set = this.f121966d.get(bVarD);
        Objects.requireNonNull(set);
        for (a aVar : set) {
            c cVar = this.f121965c.get(aVar);
            if (cVar != null && cVar.q().r()) {
                hashSet.add(aVar);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        e1.o("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar2 = this.f121965c.get((a) it.next());
            Objects.requireNonNull(cVar2);
            n(cVar2);
        }
    }

    private void h(c cVar) {
        synchronized (this.f121963a) {
            try {
                q qVarU = cVar.u();
                a aVarA = a.a(qVarU, cVar.q().K());
                b bVarD = d(qVarU);
                Set<a> hashSet = bVarD != null ? this.f121966d.get(bVarD) : new HashSet<>();
                hashSet.add(aVarA);
                this.f121965c.put(aVarA, cVar);
                if (bVarD == null) {
                    b bVar = new b(qVarU, this);
                    this.f121966d.put(bVar, hashSet);
                    qVarU.getLifecycle().a(bVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void l(q qVar) {
        synchronized (this.f121963a) {
            try {
                b bVarD = d(qVar);
                if (bVarD == null) {
                    return;
                }
                Iterator<a> it = this.f121966d.get(bVarD).iterator();
                while (it.hasNext()) {
                    ((c) i6.i.g(this.f121965c.get(it.next()))).z();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void n(c cVar) {
        synchronized (this.f121963a) {
            try {
                q qVarU = cVar.u();
                a aVarA = a.a(qVarU, cVar.q().K());
                this.f121965c.remove(aVarA);
                HashSet hashSet = new HashSet();
                for (b bVar : this.f121966d.keySet()) {
                    if (qVarU.equals(bVar.a())) {
                        Set<a> set = this.f121966d.get(bVar);
                        set.remove(aVarA);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.a());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    o((q) it.next());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void p(q qVar) {
        synchronized (this.f121963a) {
            try {
                Iterator<a> it = this.f121966d.get(d(qVar)).iterator();
                while (it.hasNext()) {
                    c cVar = this.f121965c.get(it.next());
                    if (!((c) i6.i.g(cVar)).v().isEmpty()) {
                        cVar.B();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void a(c cVar, u1 u1Var, p.a aVar) {
        synchronized (this.f121963a) {
            try {
                i6.i.a(!u1Var.m().isEmpty());
                this.f121968f = aVar;
                q qVarU = cVar.u();
                g(qVarU);
                b bVarD = d(qVarU);
                if (bVarD == null) {
                    return;
                }
                Set<a> set = this.f121966d.get(bVarD);
                p.a aVar2 = this.f121968f;
                if (aVar2 == null || aVar2.f() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        c cVar2 = (c) i6.i.g(this.f121965c.get(it.next()));
                        if (!cVar2.equals(cVar) && !cVar2.v().isEmpty()) {
                            if (cVar2.y() || u1Var.p()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            cVar2.A();
                        }
                    }
                }
                try {
                    cVar.j(u1Var);
                    if (qVarU.getLifecycle().getState().e(androidx.lifecycle.j.b.STARTED)) {
                        j(qVarU);
                    }
                } catch (b0.f.a e15) {
                    throw new IllegalArgumentException(e15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    c b(q qVar, b0.f fVar, p1 p1Var) {
        synchronized (this.f121963a) {
            try {
                i6.i.b(this.f121965c.get(a.a(qVar, fVar.K())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                c cVar = new c(qVar, fVar, p1Var);
                if (fVar.P().isEmpty()) {
                    cVar.z();
                }
                if (qVar.getLifecycle().getState() == androidx.lifecycle.j.b.DESTROYED) {
                    return cVar;
                }
                h(cVar);
                return cVar;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    c c(q qVar, p pVar) {
        synchronized (this.f121963a) {
            try {
                c cVar = this.f121965c.get(a.a(qVar, pVar));
                if (cVar == null || !cVar.q().r()) {
                    return cVar;
                }
                n(cVar);
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    Collection<c> e() {
        Collection<c> collectionUnmodifiableCollection;
        synchronized (this.f121963a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f121965c.values());
        }
        return collectionUnmodifiableCollection;
    }

    void i(Set<a> set) {
        synchronized (this.f121963a) {
            if (set == null) {
                try {
                    set = this.f121965c.keySet();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            for (a aVar : set) {
                if (this.f121965c.containsKey(aVar)) {
                    n(this.f121965c.get(aVar));
                }
            }
        }
    }

    void j(q qVar) {
        synchronized (this.f121963a) {
            try {
                if (f(qVar)) {
                    if (this.f121967e.isEmpty()) {
                        this.f121967e.push(qVar);
                    } else {
                        p.a aVar = this.f121968f;
                        if (aVar == null || aVar.f() != 2) {
                            q qVarPeek = this.f121967e.peek();
                            if (!qVar.equals(qVarPeek)) {
                                l(qVarPeek);
                                this.f121967e.remove(qVar);
                                this.f121967e.push(qVar);
                            }
                        }
                    }
                    p(qVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void k(q qVar) {
        synchronized (this.f121963a) {
            try {
                this.f121967e.remove(qVar);
                l(qVar);
                if (!this.f121967e.isEmpty()) {
                    p(this.f121967e.peek());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void m(Set<a> set) {
        synchronized (this.f121963a) {
            if (set == null) {
                try {
                    set = this.f121965c.keySet();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                c cVar = this.f121965c.get(it.next());
                if (cVar != null) {
                    cVar.A();
                    k(cVar.u());
                }
            }
        }
    }

    void o(q qVar) {
        synchronized (this.f121963a) {
            try {
                b bVarD = d(qVar);
                if (bVarD == null) {
                    return;
                }
                k(qVar);
                Iterator<a> it = this.f121966d.get(bVarD).iterator();
                while (it.hasNext()) {
                    this.f121965c.remove(it.next());
                }
                this.f121966d.remove(bVarD);
                bVarD.a().getLifecycle().d(bVarD);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    k(int i15) {
        this.f121963a = new Object();
        this.f121965c = new HashMap();
        this.f121966d = new HashMap();
        this.f121967e = new ArrayDeque<>();
        this.f121964b = i15;
    }
}
