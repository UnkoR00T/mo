package wr;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f214545a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends c> list) {
        this.f214545a = list;
    }

    @Override // wr.h
    public /* bridge */ c H(zs.c cVar) {
        return h.b.a(this, cVar);
    }

    @Override // wr.h
    public /* bridge */ boolean d2(zs.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // wr.h
    public boolean isEmpty() {
        return this.f214545a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return this.f214545a.iterator();
    }

    public String toString() {
        return this.f214545a.toString();
    }
}
