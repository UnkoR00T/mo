package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a0 f53238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<v> f53239e = new ArrayList(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<gs.k> f53240f;

    public x(int i15, String str, int i16, a0 a0Var) {
        this.f53235a = i15;
        this.f53236b = str;
        this.f53237c = i16;
        this.f53238d = a0Var;
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((gs.n) it.next()).p());
        }
        this.f53240f = arrayList;
    }

    public final List<gs.k> a() {
        return this.f53240f;
    }

    public final int b() {
        return this.f53235a;
    }

    public final List<v> c() {
        return this.f53239e;
    }

    public final void d(int i15) {
        this.f53235a = i15;
    }
}
