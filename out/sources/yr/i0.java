package yr;

/* JADX INFO: loaded from: classes4.dex */
public interface i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f228797a = a.f228798a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f228798a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final vr.h0<i0> f228799b = new vr.h0<>("PackageViewDescriptorFactory");

        private a() {
        }

        public final vr.h0<i0> a() {
            return f228799b;
        }
    }

    public static final class b implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f228800b = new b();

        private b() {
        }

        @Override // yr.i0
        public vr.v0 a(f0 f0Var, zs.c cVar, rt.n nVar) {
            return new x(f0Var, cVar, nVar);
        }
    }

    vr.v0 a(f0 f0Var, zs.c cVar, rt.n nVar);
}
