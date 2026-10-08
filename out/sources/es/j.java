package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<z> f53155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<c0> f53156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<e> f53157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<gs.c> f53158e;

    public j(int i15) {
        this.f53154a = i15;
        this.f53155b = new ArrayList();
        this.f53156c = new ArrayList(0);
        this.f53157d = new ArrayList(0);
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((gs.n) it.next()).h());
        }
        this.f53158e = arrayList;
    }

    public final List<e> a() {
        return this.f53157d;
    }

    public final List<gs.c> b() {
        return this.f53158e;
    }

    public final int c() {
        return this.f53154a;
    }

    public final List<z> d() {
        return this.f53155b;
    }

    public final List<c0> e() {
        return this.f53156c;
    }

    public final void f(int i15) {
        this.f53154a = i15;
    }

    public j() {
        this(0);
    }
}
