package i;

import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0011\u0010*\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u001c¨\u0006+"}, d2 = {"Li/b;", "", "Li/g;", "androidCameraState", "", "Lh/v;", "allCameraIds", "Lju/p0;", "scope", "Lkotlin/Function1;", "Loq/i0;", "closeCallback", "<init>", "(Li/g;Ljava/util/Set;Lju/p0;Ler/l;)V", "Lk/d0;", "d", "()Lk/d0;", "Li/g4;", "virtualCameraState", "token", "g", "(Li/g4;Lk/d0;Ltq/e;)Ljava/lang/Object;", "f", "()V", "e", "(Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "a", "Li/g;", "b", "Ljava/util/Set;", "h", "()Ljava/util/Set;", "c", "Li/g4;", "current", "Lk/e0;", "Lk/e0;", "wakelock", "i", "cameraId", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActiveCamera {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g androidCameraState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<h.v> allCameraIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g4 current;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k.e0 wakelock;

    /* JADX INFO: renamed from: i.b$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87034e;

        /* JADX INFO: renamed from: i.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li/s2;", "it", "", "<anonymous>", "(Li/s2;)Z"}, k = 3, mv = {2, 1, 0})
        static final class C2046a extends vq.k implements er.p<s2, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87036e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f87037f;

            C2046a(tq.e<? super C2046a> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f87036e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                s2 s2Var = (s2) this.f87037f;
                return vq.b.a((s2Var instanceof CameraStateClosing) || (s2Var instanceof CameraStateClosed));
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(s2 s2Var, tq.e<? super Boolean> eVar) {
                return ((C2046a) v(s2Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C2046a c2046a = new C2046a(eVar);
                c2046a.f87037f = obj;
                return c2046a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87034e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.p0<s2> p0VarL = ActiveCamera.this.androidCameraState.l();
                C2046a c2046a = new C2046a(null);
                this.f87034e = 1;
                if (mu.i.y(p0VarL, c2046a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            ActiveCamera.this.wakelock.i();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return ActiveCamera.this.new a(eVar);
        }
    }

    public ActiveCamera(g gVar, Set<h.v> set, ju.p0 p0Var, final er.l<? super ActiveCamera, oq.i0> lVar) {
        this.androidCameraState = gVar;
        this.allCameraIds = set;
        this.wakelock = new k.e0(p0Var, 1000L, true, new er.a() { // from class: i.a
            @Override // er.a
            public final Object a() {
                return ActiveCamera.j(lVar, this);
            }
        });
        ju.k.d(p0Var, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(er.l lVar, ActiveCamera activeCamera) {
        lVar.b(activeCamera);
        return oq.i0.f148189a;
    }

    public final k.d0 d() {
        return this.wakelock.h();
    }

    public final Object e(tq.e<? super oq.i0> eVar) {
        Object objE = this.androidCameraState.e(eVar);
        return objE == uq.b.e() ? objE : oq.i0.f148189a;
    }

    public final void f() throws Throwable {
        this.wakelock.i();
        this.androidCameraState.f();
    }

    public final Object g(g4 g4Var, k.d0 d0Var, tq.e<? super oq.i0> eVar) {
        g4 g4Var2 = this.current;
        this.current = g4Var;
        if (g4Var2 != null) {
            e4.a(g4Var2, null, 1, null);
        }
        Object objF = g4Var.f(this.androidCameraState.l(), d0Var, eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    public final Set<h.v> h() {
        return this.allCameraIds;
    }

    public final String i() {
        return this.androidCameraState.getCameraId();
    }

    public String toString() {
        return "ActiveCamera(cameraId=" + ((Object) h.v.f(i())) + ")@" + Integer.toString(super.hashCode(), fu.a.a(16));
    }
}
