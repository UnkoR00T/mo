package as;

import fr.t;
import fu.r;
import ss.x;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14280c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f14281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.a f14282b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final f a(Class<?> cls) {
            ts.b bVar = new ts.b();
            c.f14278a.b(cls, bVar);
            ts.a aVarN = bVar.n();
            fr.k kVar = null;
            if (aVarN == null) {
                return null;
            }
            return new f(cls, aVarN, kVar);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, ts.a aVar, fr.k kVar) {
        this(cls, aVar);
    }

    @Override // ss.x
    public void a(x.d dVar, byte[] bArr) {
        c.f14278a.i(this.f14281a, dVar);
    }

    @Override // ss.x
    public String b() {
        return r.O(this.f14281a.getName(), '.', '/', false, 4, null) + ".class";
    }

    @Override // ss.x
    public void c(x.c cVar, byte[] bArr) {
        c.f14278a.b(this.f14281a, cVar);
    }

    @Override // ss.x
    public ts.a d() {
        return this.f14282b;
    }

    public final Class<?> e() {
        return this.f14281a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && t.c(this.f14281a, ((f) obj).f14281a);
    }

    public int hashCode() {
        return this.f14281a.hashCode();
    }

    @Override // ss.x
    public zs.b i() {
        return bs.f.e(this.f14281a);
    }

    public String toString() {
        return f.class.getName() + ": " + this.f14281a;
    }

    private f(Class<?> cls, ts.a aVar) {
        this.f14281a = cls;
        this.f14282b = aVar;
    }
}
