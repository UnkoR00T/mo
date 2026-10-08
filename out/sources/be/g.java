package be;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class g<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<fe.o.a<?>> f18654a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<zd.f> f18655b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f18656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f18657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class<?> f18660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h.e f18661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private zd.h f18662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<Class<?>, zd.l<?>> f18663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class<Transcode> f18664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.f f18667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f18668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f18669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18671r;

    g() {
    }

    void a() {
        this.f18656c = null;
        this.f18657d = null;
        this.f18667n = null;
        this.f18660g = null;
        this.f18664k = null;
        this.f18662i = null;
        this.f18668o = null;
        this.f18663j = null;
        this.f18669p = null;
        this.f18654a.clear();
        this.f18665l = false;
        this.f18655b.clear();
        this.f18666m = false;
    }

    ce.b b() {
        return this.f18656c.b();
    }

    List<zd.f> c() {
        if (!this.f18666m) {
            this.f18666m = true;
            this.f18655b.clear();
            List<fe.o.a<?>> listG = g();
            int size = listG.size();
            for (int i15 = 0; i15 < size; i15++) {
                fe.o.a<?> aVar = listG.get(i15);
                if (!this.f18655b.contains(aVar.f61675a)) {
                    this.f18655b.add(aVar.f61675a);
                }
                for (int i16 = 0; i16 < aVar.f61676b.size(); i16++) {
                    if (!this.f18655b.contains(aVar.f61676b.get(i16))) {
                        this.f18655b.add(aVar.f61676b.get(i16));
                    }
                }
            }
        }
        return this.f18655b;
    }

    de.a d() {
        return this.f18661h.a();
    }

    j e() {
        return this.f18669p;
    }

    int f() {
        return this.f18659f;
    }

    List<fe.o.a<?>> g() {
        if (!this.f18665l) {
            this.f18665l = true;
            this.f18654a.clear();
            List listI = this.f18656c.i().i(this.f18657d);
            int size = listI.size();
            for (int i15 = 0; i15 < size; i15++) {
                fe.o.a<?> aVarA = ((fe.o) listI.get(i15)).a(this.f18657d, this.f18658e, this.f18659f, this.f18662i);
                if (aVarA != null) {
                    this.f18654a.add(aVarA);
                }
            }
        }
        return this.f18654a;
    }

    <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f18656c.i().h(cls, this.f18660g, this.f18664k);
    }

    Class<?> i() {
        return this.f18657d.getClass();
    }

    List<fe.o<File, ?>> j(File file) {
        return this.f18656c.i().i(file);
    }

    zd.h k() {
        return this.f18662i;
    }

    com.bumptech.glide.g l() {
        return this.f18668o;
    }

    List<Class<?>> m() {
        return this.f18656c.i().j(this.f18657d.getClass(), this.f18660g, this.f18664k);
    }

    <Z> zd.k<Z> n(v<Z> vVar) {
        return this.f18656c.i().k(vVar);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t15) {
        return this.f18656c.i().l(t15);
    }

    zd.f p() {
        return this.f18667n;
    }

    <X> zd.d<X> q(X x15) {
        return this.f18656c.i().m(x15);
    }

    Class<?> r() {
        return this.f18664k;
    }

    <Z> zd.l<Z> s(Class<Z> cls) {
        zd.l<Z> lVar = (zd.l) this.f18663j.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, zd.l<?>> entry : this.f18663j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (zd.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f18663j.isEmpty() || !this.f18670q) {
            return he.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f18658e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.d dVar, Object obj, zd.f fVar, int i15, int i16, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, zd.h hVar, Map<Class<?>, zd.l<?>> map, boolean z15, boolean z16, h.e eVar) {
        this.f18656c = dVar;
        this.f18657d = obj;
        this.f18667n = fVar;
        this.f18658e = i15;
        this.f18659f = i16;
        this.f18669p = jVar;
        this.f18660g = cls;
        this.f18661h = eVar;
        this.f18664k = cls2;
        this.f18668o = gVar;
        this.f18662i = hVar;
        this.f18663j = map;
        this.f18670q = z15;
        this.f18671r = z16;
    }

    boolean w(v<?> vVar) {
        return this.f18656c.i().n(vVar);
    }

    boolean x() {
        return this.f18671r;
    }

    boolean y(zd.f fVar) {
        List<fe.o.a<?>> listG = g();
        int size = listG.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (listG.get(i15).f61675a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
