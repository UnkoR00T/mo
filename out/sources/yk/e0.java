package yk;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class e0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<d0<?>> f227473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<d0<?>> f227474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<d0<?>> f227475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<d0<?>> f227476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<d0<?>> f227477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f227478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f227479g;

    private static class a implements hl.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f227480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final hl.c f227481b;

        public a(Set<Class<?>> set, hl.c cVar) {
            this.f227480a = set;
            this.f227481b = cVar;
        }
    }

    e0(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(d0.b(hl.c.class));
        }
        this.f227473a = Collections.unmodifiableSet(hashSet);
        this.f227474b = Collections.unmodifiableSet(hashSet2);
        this.f227475c = Collections.unmodifiableSet(hashSet3);
        this.f227476d = Collections.unmodifiableSet(hashSet4);
        this.f227477e = Collections.unmodifiableSet(hashSet5);
        this.f227478f = cVar.k();
        this.f227479g = dVar;
    }

    @Override // yk.d
    public <T> T a(Class<T> cls) {
        if (!this.f227473a.contains(d0.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t15 = (T) this.f227479g.a(cls);
        return !cls.equals(hl.c.class) ? t15 : (T) new a(this.f227478f, (hl.c) t15);
    }

    @Override // yk.d
    public <T> T b(d0<T> d0Var) {
        if (this.f227473a.contains(d0Var)) {
            return (T) this.f227479g.b(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", d0Var));
    }

    @Override // yk.d
    public <T> kl.b<T> d(Class<T> cls) {
        return g(d0.b(cls));
    }

    @Override // yk.d
    public <T> Set<T> e(d0<T> d0Var) {
        if (this.f227476d.contains(d0Var)) {
            return this.f227479g.e(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", d0Var));
    }

    @Override // yk.d
    public <T> kl.b<Set<T>> f(d0<T> d0Var) {
        if (this.f227477e.contains(d0Var)) {
            return this.f227479g.f(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", d0Var));
    }

    @Override // yk.d
    public <T> kl.b<T> g(d0<T> d0Var) {
        if (this.f227474b.contains(d0Var)) {
            return this.f227479g.g(d0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", d0Var));
    }
}
