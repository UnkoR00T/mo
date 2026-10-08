package as;

import oq.i0;
import ot.n;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14287c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f14288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final as.a f14289b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            g gVar = new g(classLoader);
            ss.k.a.C4739a c4739aA = ss.k.f183904b.a(gVar, new g(i0.class.getClassLoader()), new d(classLoader), "runtime module for " + classLoader, j.f14286b, l.f14290a);
            return new k(c4739aA.a().a(), new as.a(c4739aA.b(), gVar), null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(n nVar, as.a aVar, fr.k kVar) {
        this(nVar, aVar);
    }

    public final n a() {
        return this.f14288a;
    }

    public final vr.i0 b() {
        return this.f14288a.q();
    }

    public final as.a c() {
        return this.f14289b;
    }

    private k(n nVar, as.a aVar) {
        this.f14288a = nVar;
        this.f14289b = aVar;
    }
}
