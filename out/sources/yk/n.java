package yk;

import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class n implements d, cl.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kl.b<Set<Object>> f227492i = new kl.b() { // from class: yk.j
        @Override // kl.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<c<?>, kl.b<?>> f227493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<d0<?>, kl.b<?>> f227494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<d0<?>, x<?>> f227495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<kl.b<ComponentRegistrar>> f227496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f227497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f227498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f227499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f227500h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f227501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<kl.b<ComponentRegistrar>> f227502b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c<?>> f227503c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f227504d = i.f227485a;

        b(Executor executor) {
            this.f227501a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f227503c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f227502b.add(new kl.b() { // from class: yk.o
                @Override // kl.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<kl.b<ComponentRegistrar>> collection) {
            this.f227502b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f227501a, this.f227502b, this.f227503c, this.f227504d);
        }

        public b f(i iVar) {
            this.f227504d = iVar;
            return this;
        }
    }

    public static /* synthetic */ Object h(n nVar, c cVar) {
        nVar.getClass();
        return cVar.h().a(new e0(cVar, nVar));
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<kl.b<ComponentRegistrar>> it = this.f227496d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f227500h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e15) {
                    it.remove();
                    c2.h("ComponentDiscovery", "Invalid component registrar.", e15);
                }
            }
            Iterator<c<?>> it4 = list.iterator();
            while (it4.hasNext()) {
                for (Object obj : it4.next().j().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f227497e.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f227497e.add(obj.toString());
                    }
                }
            }
            if (this.f227493a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f227493a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f227493a.put(cVar, new w(new kl.b() { // from class: yk.k
                    @Override // kl.b
                    public final Object get() {
                        return n.h(this.f227486a, cVar);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        p();
    }

    private void m(Map<c<?>, kl.b<?>> map, boolean z15) {
        for (Map.Entry<c<?>, kl.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            kl.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z15)) {
                value.get();
            }
        }
        this.f227498f.c();
    }

    private static <T> List<T> o(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void p() {
        Boolean bool = this.f227499g.get();
        if (bool != null) {
            m(this.f227493a, bool.booleanValue());
        }
    }

    private void q() {
        for (c<?> cVar : this.f227493a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.f() && !this.f227495c.containsKey(qVar.b())) {
                    this.f227495c.put(qVar.b(), x.b(Collections.EMPTY_SET));
                } else if (this.f227494b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", cVar, qVar.b()));
                    }
                    if (!qVar.f()) {
                        this.f227494b.put(qVar.b(), b0.c());
                    }
                }
            }
        }
    }

    private List<Runnable> r(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final kl.b<?> bVar = this.f227493a.get(cVar);
                for (d0<? super Object> d0Var : cVar.j()) {
                    if (this.f227494b.containsKey(d0Var)) {
                        final b0 b0Var = (b0) this.f227494b.get(d0Var);
                        arrayList.add(new Runnable() { // from class: yk.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                b0Var.d(bVar);
                            }
                        });
                    } else {
                        this.f227494b.put(d0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<c<?>, kl.b<?>> entry : this.f227493a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                kl.b<?> value = entry.getValue();
                for (d0<? super Object> d0Var : key.j()) {
                    if (!map.containsKey(d0Var)) {
                        map.put(d0Var, new HashSet());
                    }
                    ((Set) map.get(d0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f227495c.containsKey(entry2.getKey())) {
                final x<?> xVar = this.f227495c.get(entry2.getKey());
                for (final kl.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: yk.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f227495c.put((d0) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // yk.d
    public synchronized <T> kl.b<Set<T>> f(d0<T> d0Var) {
        x<?> xVar = this.f227495c.get(d0Var);
        if (xVar != null) {
            return xVar;
        }
        return (kl.b<Set<T>>) f227492i;
    }

    @Override // yk.d
    public synchronized <T> kl.b<T> g(d0<T> d0Var) {
        c0.c(d0Var, "Null interface requested.");
        return (kl.b) this.f227494b.get(d0Var);
    }

    public void n(boolean z15) {
        HashMap map;
        if (androidx.camera.view.i.a(this.f227499g, null, Boolean.valueOf(z15))) {
            synchronized (this) {
                map = new HashMap(this.f227493a);
            }
            m(map, z15);
        }
    }

    private n(Executor executor, Iterable<kl.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, i iVar) {
        this.f227493a = new HashMap();
        this.f227494b = new HashMap();
        this.f227495c = new HashMap();
        this.f227497e = new HashSet();
        this.f227499g = new AtomicReference<>();
        u uVar = new u(executor);
        this.f227498f = uVar;
        this.f227500h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.q(uVar, u.class, hl.d.class, hl.c.class));
        arrayList.add(c.q(this, cl.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f227496d = o(iterable);
        l(arrayList);
    }
}
