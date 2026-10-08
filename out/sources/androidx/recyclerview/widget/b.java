package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RecyclerView.h f13226a;

    public b(RecyclerView.h hVar) {
        this.f13226a = hVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(int i15, int i16) {
        this.f13226a.o(i15, i16);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(int i15, int i16) {
        this.f13226a.p(i15, i16);
    }

    @Override // androidx.recyclerview.widget.n
    @SuppressLint({"UnknownNullness"})
    public void c(int i15, int i16, Object obj) {
        this.f13226a.n(i15, i16, obj);
    }

    @Override // androidx.recyclerview.widget.n
    public void d(int i15, int i16) {
        this.f13226a.m(i15, i16);
    }
}
