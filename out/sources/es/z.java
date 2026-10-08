package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f53247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f53248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f53249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<e> f53250f = new ArrayList(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<gs.l> f53251g;

    public z(int i15, String str) {
        this.f53245a = i15;
        this.f53246b = str;
        List<gs.n> listC = gs.n.f76602a.c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            ((gs.n) it.next()).q();
        }
        this.f53251g = arrayList;
    }

    public final List<e> a() {
        return this.f53250f;
    }

    public final int b() {
        return this.f53245a;
    }

    public final void c(f fVar) {
        this.f53249e = fVar;
    }

    public final void d(int i15) {
        this.f53245a = i15;
    }

    public final void e(v vVar) {
        this.f53247c = vVar;
    }

    public final void f(v vVar) {
        this.f53248d = vVar;
    }
}
