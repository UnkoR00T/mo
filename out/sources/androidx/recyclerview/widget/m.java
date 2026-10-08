package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.f0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m<T, VH extends RecyclerView.f0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final d<T> f13403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b<T> f13404e;

    class a implements d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(List<T> list, List<T> list2) {
            m.this.D(list, list2);
        }
    }

    protected m(h.f<T> fVar) {
        a aVar = new a();
        this.f13404e = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.f13403d = dVar;
        dVar.a(aVar);
    }

    protected T C(int i15) {
        return this.f13403d.b().get(i15);
    }

    public void D(List<T> list, List<T> list2) {
    }

    public void E(List<T> list) {
        this.f13403d.e(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return this.f13403d.b().size();
    }
}
