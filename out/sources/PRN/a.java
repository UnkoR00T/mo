package PRN;

import android.annotation.SuppressLint;
import e.f1;
import e.g1;
import e.i1;
import e.p2;
import e.t1;
import e.u2;
import e.v2;
import e.x1;
import e.y1;
import e.y2;
import java.util.List;
import p071kotlin.Metadata;
import v.j3;
import v.n1;
import v.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020 2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020 H\u0016¢\u0006\u0004\b9\u0010$J;\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010*0:0)2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020-H\u0016¢\u0006\u0004\b?\u0010@J%\u0010B\u001a\b\u0012\u0004\u0012\u00020A0)2\u0006\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020-H\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010KR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010LR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, d2 = {"LPRN/a;", "Lv/j0;", "Le/b0;", "cameraProperties", "Le/a1;", "evCompControl", "Le/f1;", "flashControl", "Le/g1;", "focusMeteringControl", "Le/t1;", "stillCaptureRequestControl", "Le/x1;", "torchControl", "Le/i1;", "lowLightBoostControl", "Le/y2;", "zoomControl", "LPRN/x0;", "zslControl", "Lg/a;", "camera2cameraControl", "Le/p2;", "useCaseManager", "Le/u2;", "threads", "Le/v2;", "videoUsageControl", "<init>", "(Le/b0;Le/a1;Le/f1;Le/g1;Le/t1;Le/x1;Le/i1;Le/y2;LPRN/x0;Lg/a;Le/p2;Le/u2;Le/v2;)V", "Lv/p1;", "config", "Loq/i0;", "c", "(Lv/p1;)V", "j", "()V", "h", "()Lv/p1;", "", "ratio", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "f", "(F)Lcom/google/common/util/concurrent/q;", "", "flashMode", "g", "(I)V", "Lo/t0$j;", "screenFlash", "d", "(Lo/t0$j;)V", "Lv/j3$b;", "sessionConfigBuilder", "b", "(Lv/j3$b;)V", "a", "", "Lv/n1;", "captureConfigs", "captureMode", "flashType", "e", "(Ljava/util/List;II)Lcom/google/common/util/concurrent/q;", "Lu/m;", "i", "(II)Lcom/google/common/util/concurrent/q;", "Le/b0;", "Le/a1;", "Le/f1;", "Le/g1;", "Le/t1;", "Le/x1;", "Le/i1;", "Le/y2;", "LPRN/x0;", "k", "Lg/a;", "getCamera2cameraControl", "()Lg/a;", "l", "Le/p2;", "m", "Le/u2;", "n", "Le/v2;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UnsafeOptInUsageError"})
public final class a implements v.j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e.b0 cameraProperties;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e.a1 evCompControl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f1 flashControl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g1 focusMeteringControl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t1 stillCaptureRequestControl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x1 torchControl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i1 lowLightBoostControl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y2 zoomControl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final x0 zslControl;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g.a camera2cameraControl;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p2 useCaseManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final v2 videoUsageControl;

    /* JADX INFO: renamed from: PRN.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0000a<T> implements androidx.concurrent.futures.c.InterfaceC0250c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.p0 f580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1 f581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f584e;

        /* JADX INFO: renamed from: PRN.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C0001a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f585e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f586f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.concurrent.futures.c.a f587g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ y1 f588h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f589j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ a f590k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f591l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f592m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f593n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0001a(androidx.concurrent.futures.c.a aVar, tq.e eVar, y1 y1Var, int i15, a aVar2, int i16) {
                super(2, eVar);
                this.f587g = aVar;
                this.f588h = y1Var;
                this.f589j = i15;
                this.f590k = aVar2;
                this.f591l = i16;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                androidx.concurrent.futures.c.a aVar;
                y1 y1Var;
                int i15;
                androidx.concurrent.futures.c.a aVar2;
                Object objE = uq.b.e();
                int i16 = this.f586f;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i15 = this.f593n;
                        y1Var = (y1) this.f592m;
                        aVar = (androidx.concurrent.futures.c.a) this.f585e;
                        oq.u.b(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.concurrent.futures.c.a aVar3 = (androidx.concurrent.futures.c.a) this.f585e;
                        oq.u.b(obj);
                        aVar2 = aVar3;
                    }
                    aVar2.c(obj);
                    return oq.i0.f148189a;
                }
                oq.u.b(obj);
                androidx.concurrent.futures.c.a aVar4 = this.f587g;
                y1 y1Var2 = this.f588h;
                int i17 = this.f589j;
                f1 f1Var = this.f590k.flashControl;
                this.f585e = aVar4;
                this.f592m = y1Var2;
                this.f593n = i17;
                this.f586f = 1;
                Object objH = f1Var.h(this);
                if (objH != objE) {
                    aVar = aVar4;
                    obj = objH;
                    y1Var = y1Var2;
                    i15 = i17;
                }
                return objE;
                int iIntValue = ((Number) obj).intValue();
                int i18 = this.f591l;
                this.f585e = aVar;
                this.f592m = null;
                this.f586f = 2;
                obj = y1Var.b(i15, iIntValue, i18, this);
                if (obj != objE) {
                    aVar2 = aVar;
                    aVar2.c(obj);
                    return oq.i0.f148189a;
                }
                return objE;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((C0001a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C0001a(this.f587g, eVar, this.f588h, this.f589j, this.f590k, this.f591l);
            }
        }

        public C0000a(ju.p0 p0Var, y1 y1Var, int i15, a aVar, int i16) {
            this.f580a = p0Var;
            this.f581b = y1Var;
            this.f582c = i15;
            this.f583d = aVar;
            this.f584e = i16;
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0250c
        public final Object a(androidx.concurrent.futures.c.a<T> aVar) {
            return ju.k.d(this.f580a, null, null, new C0001a(aVar, null, this.f581b, this.f582c, this.f583d, this.f584e), 3, null);
        }
    }

    public a(e.b0 b0Var, e.a1 a1Var, f1 f1Var, g1 g1Var, t1 t1Var, x1 x1Var, i1 i1Var, y2 y2Var, x0 x0Var, g.a aVar, p2 p2Var, u2 u2Var, v2 v2Var) {
        this.cameraProperties = b0Var;
        this.evCompControl = a1Var;
        this.flashControl = f1Var;
        this.focusMeteringControl = g1Var;
        this.stillCaptureRequestControl = t1Var;
        this.torchControl = x1Var;
        this.lowLightBoostControl = i1Var;
        this.zoomControl = y2Var;
        this.zslControl = x0Var;
        this.camera2cameraControl = aVar;
        this.useCaseManager = p2Var;
        this.threads = u2Var;
        this.videoUsageControl = v2Var;
    }

    @Override // v.j0
    public void a() {
        this.zslControl.a();
    }

    @Override // v.j0
    public void b(j3.b sessionConfigBuilder) {
        this.zslControl.b(sessionConfigBuilder);
    }

    @Override // v.j0
    public void c(p1 config) {
        this.camera2cameraControl.a(g.f.a.INSTANCE.b(config).b());
    }

    @Override // v.j0
    public void d(o.t0.j screenFlash) {
        this.flashControl.q(screenFlash);
    }

    @Override // v.j0
    public com.google.common.util.concurrent.q<List<Void>> e(List<n1> captureConfigs, int captureMode, int flashType) {
        return this.stillCaptureRequestControl.h(captureConfigs, captureMode, flashType);
    }

    @Override // o.j
    public com.google.common.util.concurrent.q<Void> f(float ratio) {
        return this.zoomControl.l(ratio);
    }

    @Override // v.j0
    public void g(int flashMode) {
        f1.p(this.flashControl, flashMode, false, 2, null);
        this.zslControl.e(flashMode == 1 || flashMode == 0);
    }

    @Override // v.j0
    public p1 h() {
        return this.camera2cameraControl.d();
    }

    @Override // v.j0
    public com.google.common.util.concurrent.q<u.m> i(int captureMode, int flashType) {
        y1 y1VarT = this.useCaseManager.t();
        return y1VarT == null ? a0.f.f(new o.j.a("Camera is not active.")) : androidx.concurrent.futures.c.a(new C0000a(this.threads.getSequentialScope(), y1VarT, captureMode, this, flashType));
    }

    @Override // v.j0
    public void j() {
        this.camera2cameraControl.c();
    }
}
