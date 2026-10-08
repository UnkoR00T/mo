package fs;

import fr.k;
import gs.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pq.v;
import us.t;
import ws.h;
import ws.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws.d f66807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f66808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f66809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f66810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f66811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Object> f66812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, Integer> f66813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<n> f66814h;

    public e(ws.d dVar, h hVar, j jVar, boolean z15, e eVar, List<? extends Object> list) {
        this.f66807a = dVar;
        this.f66808b = hVar;
        this.f66809c = jVar;
        this.f66810d = z15;
        this.f66811e = eVar;
        this.f66812f = list;
        this.f66813g = new LinkedHashMap();
        this.f66814h = n.f76602a.c();
    }

    public final String a(int i15) {
        return f.a(this.f66807a, i15);
    }

    public final String b(int i15) {
        return this.f66807a.getString(i15);
    }

    public final List<n> c() {
        return this.f66814h;
    }

    public final boolean d() {
        return this.f66810d;
    }

    public final ws.d e() {
        return this.f66807a;
    }

    public final Integer f(int i15) {
        Integer num = this.f66813g.get(Integer.valueOf(i15));
        if (num != null) {
            return num;
        }
        e eVar = this.f66811e;
        if (eVar != null) {
            return eVar.f(i15);
        }
        return null;
    }

    public final h g() {
        return this.f66808b;
    }

    public final j h() {
        return this.f66809c;
    }

    public final e i(List<t> list) {
        e eVar = new e(this.f66807a, this.f66808b, this.f66809c, this.f66810d, this, this.f66812f);
        for (t tVar : list) {
            eVar.f66813g.put(Integer.valueOf(tVar.T()), Integer.valueOf(tVar.R()));
        }
        return eVar;
    }

    public /* synthetic */ e(ws.d dVar, h hVar, j jVar, boolean z15, e eVar, List list, int i15, k kVar) {
        this(dVar, hVar, jVar, z15, (i15 & 16) != 0 ? null : eVar, (i15 & 32) != 0 ? v.n() : list);
    }
}
