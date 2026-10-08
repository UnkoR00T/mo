package v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class h1 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f202601a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, n0> f202602b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<n0> f202603c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.q<Void> f202604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f202605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l0 f202606f;

    public static /* synthetic */ void i(h1 h1Var, n0 n0Var) {
        synchronized (h1Var.f202601a) {
            try {
                h1Var.f202603c.remove(n0Var);
                if (h1Var.f202603c.isEmpty()) {
                    i6.i.g(h1Var.f202605e);
                    h1Var.f202605e.c(null);
                    h1Var.f202605e = null;
                    h1Var.f202604d = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object j(h1 h1Var, androidx.concurrent.futures.c.a aVar) {
        synchronized (h1Var.f202601a) {
            h1Var.f202605e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // v.i2
    public void g(List<String> list) throws j1 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f202601a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f202602b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f202606f.a(str));
            }
            synchronized (this.f202601a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f202602b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<n0> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f202602b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : list) {
                        if (this.f202602b.containsKey(str2)) {
                            linkedHashMap.put(str2, this.f202602b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (n0) map.get(str2));
                        }
                    }
                    this.f202602b.clear();
                    this.f202602b.putAll(linkedHashMap);
                    for (n0 n0Var : arrayList) {
                        if (n0Var != null) {
                            n0Var.e();
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (o.u e15) {
            throw new j1("Failed to create CameraInternal", e15);
        }
    }

    public com.google.common.util.concurrent.q<Void> k() {
        synchronized (this.f202601a) {
            try {
                if (this.f202602b.isEmpty()) {
                    com.google.common.util.concurrent.q<Void> qVarH = this.f202604d;
                    if (qVarH == null) {
                        qVarH = a0.f.h(null);
                    }
                    return qVarH;
                }
                com.google.common.util.concurrent.q<Void> qVarA = this.f202604d;
                if (qVarA == null) {
                    qVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: v.f1
                        @Override // androidx.concurrent.futures.c.InterfaceC0250c
                        public final Object a(androidx.concurrent.futures.c.a aVar) {
                            return h1.j(this.f202576a, aVar);
                        }
                    });
                    this.f202604d = qVarA;
                }
                this.f202603c.addAll(this.f202602b.values());
                for (final n0 n0Var : this.f202602b.values()) {
                    n0Var.b().b(new Runnable() { // from class: v.g1
                        @Override // java.lang.Runnable
                        public final void run() {
                            h1.i(this.f202587a, n0Var);
                        }
                    }, z.a.a());
                }
                this.f202602b.clear();
                return qVarA;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public n0 l(String str) {
        n0 n0Var;
        synchronized (this.f202601a) {
            try {
                n0Var = this.f202602b.get(str);
                if (n0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return n0Var;
    }

    public LinkedHashSet<n0> m() {
        LinkedHashSet<n0> linkedHashSet;
        synchronized (this.f202601a) {
            linkedHashSet = new LinkedHashSet<>(this.f202602b.values());
        }
        return linkedHashSet;
    }

    public void n(l0 l0Var) {
        this.f202606f = l0Var;
        synchronized (this.f202601a) {
            try {
                for (String str : l0Var.c()) {
                    o.e1.a("CameraRepository", "Added camera: " + str);
                    n0 n0VarPut = this.f202602b.put(str, l0Var.a(str));
                    if (n0VarPut != null) {
                        n0VarPut.b();
                    }
                }
            } catch (o.u e15) {
                throw new o.c1(e15);
            }
        }
    }
}
