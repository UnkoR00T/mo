package a8;

/* JADX INFO: loaded from: classes3.dex */
public interface a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final h8.c0.b f4220a = new h8.c0.b(new Object());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b8.e2 f4221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t7.e0 f4222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h8.c0.b f4223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f4224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f4225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f4226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f4227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f4228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f4229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f4230j;

        public a(b8.e2 e2Var, t7.e0 e0Var, h8.c0.b bVar, long j15, long j16, float f15, boolean z15, boolean z16, long j17, long j18) {
            this.f4221a = e2Var;
            this.f4222b = e0Var;
            this.f4223c = bVar;
            this.f4224d = j15;
            this.f4225e = j16;
            this.f4226f = f15;
            this.f4227g = z15;
            this.f4228h = z16;
            this.f4229i = j17;
            this.f4230j = j18;
        }
    }

    @Deprecated
    default void b() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default boolean c() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean d(b8.e2 e2Var, t7.e0 e0Var, h8.c0.b bVar, long j15) {
        w7.t.h("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Deprecated
    default boolean e(t7.e0 e0Var, h8.c0.b bVar, long j15, float f15, boolean z15, long j16) {
        return l(j15, f15, z15, j16);
    }

    @Deprecated
    default long f() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Deprecated
    default void g() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default boolean h(a aVar) {
        return s(aVar.f4224d, aVar.f4225e, aVar.f4226f);
    }

    default boolean i(a aVar) {
        return e(aVar.f4222b, aVar.f4223c, aVar.f4225e, aVar.f4226f, aVar.f4228h, aVar.f4229i);
    }

    default long j(b8.e2 e2Var) {
        return f();
    }

    k8.b k(b8.e2 e2Var);

    @Deprecated
    default boolean l(long j15, float f15, boolean z15, long j16) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Deprecated
    default void m() {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void n(b8.e2 e2Var) {
        m();
    }

    default void o(b8.e2 e2Var) {
        g();
    }

    default boolean p(b8.e2 e2Var) {
        return c();
    }

    default void q(a aVar, h8.j1 j1Var, j8.r[] rVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void r(b8.e2 e2Var) {
        b();
    }

    @Deprecated
    default boolean s(long j15, long j16, float f15) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }
}
