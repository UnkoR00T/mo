package PRN;

import e.p2;
import e.u2;
import java.util.Collection;
import o.j2;
import p071kotlin.Metadata;
import v.l3;
import v.x2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u00122\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00122\f\u00101\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u00020-H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00122\u0006\u00103\u001a\u00020-H\u0016¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\u00122\u0006\u00103\u001a\u00020-H\u0016¢\u0006\u0004\b7\u00105J\u0017\u00108\u001a\u00020\u00122\u0006\u00103\u001a\u00020-H\u0016¢\u0006\u0004\b8\u00105J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\u00122\b\u0010<\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0012H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0010H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010LR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010NR\u0016\u0010Q\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010Y¨\u0006["}, d2 = {"LPRN/l;", "Lv/n0;", "Ld/m;", "config", "Le/p2;", "useCaseManager", "Lv/m0;", "cameraInfo", "Lv/j0;", "cameraController", "Le/u2;", "threads", "LPRN/o;", "cameraStateAdapter", "<init>", "(Ld/m;Le/p2;Lv/m0;Lv/j0;Le/u2;LPRN/o;)V", "", "createImmediately", "Loq/i0;", "A", "(Z)V", "Lh/s$b;", "y", "()Lh/s$b;", "Lh/s;", "cameraGraph", "z", "(Lh/s;)V", "isPrimary", "t", "enabled", "k", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "b", "()Lcom/google/common/util/concurrent/q;", "o", "()Lv/m0;", "Lv/x2;", "Lv/n0$a;", "d", "()Lv/x2;", "h", "()Lv/j0;", "", "Lo/j2;", "useCasesToAdd", "l", "(Ljava/util/Collection;)V", "useCasesToRemove", "n", "useCase", "f", "(Lo/j2;)V", "j", "q", "m", "Lv/f0;", "i", "()Lv/f0;", "cameraConfig", "g", "(Lv/f0;)V", "e", "()V", "r", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Le/p2;", "Lv/m0;", "c", "Lv/j0;", "Le/u2;", "LPRN/o;", "Lh/v;", "Ljava/lang/String;", "cameraId", "Lv/f0;", "coreCameraConfig", "", "I", "debugId", "Lv/l3;", "Lv/l3;", "sessionProcessor", "Liu/a;", "Liu/a;", "isRemoved", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements v.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p2 useCaseManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v.m0 cameraInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v.j0 cameraController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o cameraStateAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private l3 sessionProcessor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private v.f0 coreCameraConfig = v.i0.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int debugId = m.a().d();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final iu.a isRemoved = iu.b.a(false);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f696e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f696e;
            if (i15 == 0) {
                oq.u.b(obj);
                l.this.cameraStateAdapter.j();
                p2 p2Var = l.this.useCaseManager;
                this.f696e = 1;
                if (p2Var.k(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return l.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f698e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f698e;
            if (i15 == 0) {
                oq.u.b(obj);
                p2 p2Var = l.this.useCaseManager;
                this.f698e = 1;
                if (p2Var.k(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            ju.q0.d(l.this.threads.getScope(), null, 1, null);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return l.this.new b(eVar);
        }
    }

    public l(d.m mVar, p2 p2Var, v.m0 m0Var, v.j0 j0Var, u2 u2Var, o oVar) {
        this.useCaseManager = p2Var;
        this.cameraInfo = m0Var;
        this.cameraController = j0Var;
        this.threads = u2Var;
        this.cameraStateAdapter = oVar;
        this.cameraId = mVar.getCameraId();
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            toString();
            h.v.f(this.cameraId);
        }
    }

    public final void A(boolean createImmediately) {
        this.useCaseManager.L(createImmediately);
    }

    @Override // v.n0
    public com.google.common.util.concurrent.q<Void> b() {
        return a0.j(ju.k.d(this.threads.getScope(), null, null, new b(null), 3, null), null, 1, null);
    }

    @Override // v.n0
    public x2<v.n0.a> d() {
        return this.cameraStateAdapter.e();
    }

    @Override // v.n0
    public void e() {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            toString();
        }
        if (this.isRemoved.a(false, true)) {
            ju.k.d(this.threads.getScope(), null, null, new a(null), 3, null);
        }
    }

    @Override // o.j2.c
    public void f(j2 useCase) {
        this.useCaseManager.f(useCase);
    }

    @Override // v.n0
    public void g(v.f0 cameraConfig) {
        this.coreCameraConfig = cameraConfig == null ? v.i0.a() : cameraConfig;
        l3 l3VarF = cameraConfig != null ? cameraConfig.F(null) : null;
        this.sessionProcessor = l3VarF;
        this.useCaseManager.N(l3VarF);
    }

    @Override // v.n0
    /* JADX INFO: renamed from: h, reason: from getter */
    public v.j0 getCameraController() {
        return this.cameraController;
    }

    @Override // v.n0
    /* JADX INFO: renamed from: i, reason: from getter */
    public v.f0 getCoreCameraConfig() {
        return this.coreCameraConfig;
    }

    @Override // o.j2.c
    public void j(j2 useCase) {
        this.useCaseManager.S(useCase);
    }

    @Override // v.n0
    public void k(boolean enabled) {
        this.useCaseManager.K(enabled);
    }

    @Override // v.n0
    public void l(Collection<j2> useCasesToAdd) {
        this.useCaseManager.i(pq.v.f1(useCasesToAdd));
    }

    @Override // o.j2.c
    public void m(j2 useCase) {
        this.useCaseManager.p(useCase);
    }

    @Override // v.n0
    public void n(Collection<j2> useCasesToRemove) {
        this.useCaseManager.r(pq.v.f1(useCasesToRemove));
    }

    @Override // v.n0
    /* JADX INFO: renamed from: o, reason: from getter */
    public v.m0 getCameraInfo() {
        return this.cameraInfo;
    }

    @Override // o.j2.c
    public void q(j2 useCase) {
        this.useCaseManager.H(useCase);
    }

    @Override // v.n0
    public boolean r() {
        return this.isRemoved.b();
    }

    @Override // v.n0
    public void t(boolean isPrimary) {
        this.useCaseManager.M(isPrimary);
    }

    public String toString() {
        return "CameraInternalAdapter<" + ((Object) h.v.f(this.cameraId)) + '(' + this.debugId + ")>";
    }

    public final h.s.b y() {
        return this.useCaseManager.w();
    }

    public final void z(h.s cameraGraph) {
        this.useCaseManager.I(cameraGraph);
    }
}
