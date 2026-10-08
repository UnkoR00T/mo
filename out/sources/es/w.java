package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53228b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f53230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f53231e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<gs.i> f53234h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<x> f53229c = new ArrayList(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<e> f53232f = new ArrayList(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<c0> f53233g = new ArrayList(0);

    public w(int i15, String str) {
        this.f53227a = i15;
        this.f53228b = str;
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            ((gs.n) it.next()).a();
        }
        this.f53234h = arrayList;
    }

    public final List<e> a() {
        return this.f53232f;
    }

    public final int b() {
        return this.f53227a;
    }

    public final List<x> c() {
        return this.f53229c;
    }

    public final List<c0> d() {
        return this.f53233g;
    }

    public final void e(v vVar) {
        this.f53231e = vVar;
    }

    public final void f(int i15) {
        this.f53227a = i15;
    }

    public final void g(v vVar) {
        this.f53230d = vVar;
    }
}
