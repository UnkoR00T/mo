package androidx.p016lifecycle;

import java.util.Iterator;
import java.util.Map;
import p009PRn.g1;

/* JADX INFO: loaded from: classes3.dex */
public class z<T> extends b0<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g1<y<?>, a<?>> f12875l = new g1<>();

    private static class a<V> implements c0<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final y<V> f12876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c0<? super V> f12877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12878c = -1;

        a(y<V> yVar, c0<? super V> c0Var) {
            this.f12876a = yVar;
            this.f12877b = c0Var;
        }

        @Override // androidx.p016lifecycle.c0
        public void a(V v15) {
            if (this.f12878c != this.f12876a.g()) {
                this.f12878c = this.f12876a.g();
                this.f12877b.a(v15);
            }
        }

        void b() {
            this.f12876a.j(this);
        }

        void c() {
            this.f12876a.n(this);
        }
    }

    @Override // androidx.p016lifecycle.y
    protected void k() {
        Iterator<Map.Entry<y<?>, a<?>>> it = this.f12875l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.p016lifecycle.y
    protected void l() {
        Iterator<Map.Entry<y<?>, a<?>>> it = this.f12875l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void p(y<S> yVar, c0<? super S> c0Var) {
        if (yVar == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(yVar, c0Var);
        a<?> aVarJ = this.f12875l.j(yVar, aVar);
        if (aVarJ != null && aVarJ.f12877b != c0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarJ == null && h()) {
            aVar.b();
        }
    }

    public <S> void q(y<S> yVar) {
        a<?> aVarK = this.f12875l.k(yVar);
        if (aVarK != null) {
            aVarK.c();
        }
    }
}
