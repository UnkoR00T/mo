package e;

import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b'\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00103R\u001c\u00108\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u0010\u0010R*\u0010\u001b\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u001a8F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00106\u0012\u0004\b<\u0010\u0010\u001a\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010=R(\u0010!\u001a\u0004\u0018\u00010 2\b\u00109\u001a\u0004\u0018\u00010 8F@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010CR0\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138F@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010\u0017R(\u0010J\u001a\u0004\u0018\u0001022\b\u00109\u001a\u0004\u0018\u0001028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010H\"\u0004\b*\u0010I¨\u0006K"}, d2 = {"Le/f1;", "Le/z1;", "Le/b0;", "cameraProperties", "Le/r1;", "state3AControl", "Le/u2;", "threads", "Le/x1;", "torchControl", "Lc/j0;", "useFlashModeTorchFor3aUpdate", "<init>", "(Le/b0;Le/r1;Le/u2;Le/x1;Lc/j0;)V", "Loq/i0;", "u", "()V", "", "timeoutMillis", "Lju/w0;", "f", "(JLtq/e;)Ljava/lang/Object;", "m", "()Lju/w0;", "r", "reset", "", "flashMode", "", "cancelPreviousTask", "o", "(IZ)Lju/w0;", "Lo/t0$j;", "screenFlash", "q", "(Lo/t0$j;)V", "t", "(Ltq/e;)Ljava/lang/Object;", "v", "h", "a", "Le/b0;", "b", "Le/r1;", "c", "Le/u2;", "d", "Le/x1;", "e", "Lc/j0;", "Le/f2;", "Le/f2;", "_requestControl", "g", "I", "get_flashMode$annotations", "_flashMode", "value", "i", "()I", "getFlashMode$annotations", "Lo/t0$j;", "_screenFlash", "j", "k", "()Lo/t0$j;", "Lju/x;", "Lju/x;", "_updateSignal", "l", "Lju/w0;", "updateSignal", "()Le/f2;", "(Le/f2;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r1 state3AControl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x1 torchControl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c.j0 useFlashModeTorchFor3aUpdate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> _updateSignal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile int _flashMode = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int flashMode = this._flashMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile o.t0.j _screenFlash;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private o.t0.j screenFlash = this._screenFlash;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private ju.w0<oq.i0> updateSignal = ju.z.a(oq.i0.f148189a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f45767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45769f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f45771h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45769f = obj;
            this.f45771h |= PKIFailureInfo.systemUnavail;
            return f1.this.f(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f45773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f1 f45774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o.t0.k f45775h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j15, f1 f1Var, o.t0.k kVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f45773f = j15;
            this.f45774g = f1Var;
            this.f45775h = kVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f45772e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            long jCurrentTimeMillis = System.currentTimeMillis() + this.f45773f;
            o.t0.j jVar = this.f45774g.get_screenFlash();
            if (jVar != null) {
                jVar.a(jCurrentTimeMillis, this.f45775h);
            }
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f45773f, this.f45774g, this.f45775h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ju.x<oq.i0> f45777f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f45778g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ju.x<oq.i0> xVar, long j15, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f45777f = xVar;
            this.f45778g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f45776e;
            if (i15 == 0) {
                oq.u.b(obj);
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
                ju.x<oq.i0> xVar = this.f45777f;
                long j15 = this.f45778g;
                this.f45776e = 1;
                obj = PRN.a0.o(xVar, j15, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                e.c cVar2 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                }
            } else {
                e.c cVar3 = e.c.f45719a;
                long j16 = this.f45778g;
                if (o.e1.k("CXCP")) {
                    io.sentry.android.core.c2.g(e.c.TRUNCATED_TAG, "applyScreenFlash: ScreenFlashListener completion timed out after " + j16 + " ms");
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f45777f, this.f45778g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f45780e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45782g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45780e = obj;
            this.f45782g |= PKIFailureInfo.systemUnavail;
            return f1.this.h(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45785f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f45787h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45785f = obj;
            this.f45787h |= PKIFailureInfo.systemUnavail;
            return f1.this.t(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f45788d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45790f;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45788d = obj;
            this.f45790f |= PKIFailureInfo.systemUnavail;
            return f1.this.v(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45791e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f45791e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o.t0.j jVar = f1.this.get_screenFlash();
            if (jVar != null) {
                jVar.clear();
            }
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((g) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return f1.this.new g(eVar);
        }
    }

    public f1(b0 b0Var, r1 r1Var, u2 u2Var, x1 x1Var, c.j0 j0Var) {
        this.cameraProperties = b0Var;
        this.state3AControl = r1Var;
        this.threads = u2Var;
        this.torchControl = x1Var;
        this.useFlashModeTorchFor3aUpdate = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(long j15, tq.e<? super ju.w0<oq.i0>> eVar) throws Throwable {
        a aVar;
        long j16;
        ju.x xVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f45771h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f45771h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f45769f;
        Object objE = uq.b.e();
        int i16 = aVar2.f45771h;
        if (i16 == 0) {
            oq.u.b(obj);
            final ju.x xVarC = ju.z.c(null, 1, null);
            o.t0.k kVar = new o.t0.k() { // from class: e.d1
                @Override // o.t0.k
                public final void a() {
                    f1.g(xVarC);
                }
            };
            ju.n2 n2VarC = ju.g1.c();
            j16 = j15;
            b bVar = new b(j16, this, kVar, null);
            aVar2.f45768e = xVarC;
            aVar2.f45767d = j16;
            aVar2.f45771h = 1;
            if (ju.i.g(n2VarC, bVar, aVar2) == objE) {
                return objE;
            }
            xVar = xVarC;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j16 = aVar2.f45767d;
            xVar = (ju.x) aVar2.f45768e;
            oq.u.b(obj);
        }
        return ju.k.b(this.threads.getScope(), null, null, new c(xVar, j16, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ju.x xVar) {
        xVar.d0(oq.i0.f148189a);
    }

    private final ju.w0<oq.i0> m() {
        boolean zH = z.h(this.cameraProperties.getMetadata());
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
        }
        if (!zH) {
            return null;
        }
        ju.w0<oq.i0> w0VarU = this.state3AControl.u(true);
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
        }
        w0VarU.C0(new er.l() { // from class: e.e1
            @Override // er.l
            public final Object b(Object obj) {
                return f1.n((Throwable) obj);
            }
        });
        return w0VarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(Throwable th4) {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
        }
        return oq.i0.f148189a;
    }

    public static /* synthetic */ ju.w0 p(f1 f1Var, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            z15 = true;
        }
        return f1Var.o(i15, z15);
    }

    private final ju.w0<oq.i0> r() {
        boolean zA = this.useFlashModeTorchFor3aUpdate.a();
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
        }
        if (!zA) {
            return null;
        }
        ju.w0<oq.i0> w0VarN = x1.n(this.torchControl, x1.a.INSTANCE.c(), false, true, 2, null);
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
        }
        w0VarN.C0(new er.l() { // from class: e.c1
            @Override // er.l
            public final Object b(Object obj) {
                return f1.s((Throwable) obj);
            }
        });
        return w0VarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Throwable th4) {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
        }
        return oq.i0.f148189a;
    }

    private final void u() {
        ju.x<oq.i0> xVar = this._updateSignal;
        if (xVar != null) {
            xVar.p(new o.j.a("There is a new flash mode being set or camera was closed"));
        }
        this._updateSignal = null;
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._requestControl = f2Var;
        o(this._flashMode, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(tq.e<? super Integer> eVar) throws Throwable {
        d dVar;
        int i15;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i16 = dVar.f45782g;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f45782g = i16 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f45780e;
        Object objE = uq.b.e();
        int i17 = dVar.f45782g;
        if (i17 == 0) {
            oq.u.b(obj);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            int i18 = get_flashMode();
            ju.w0<oq.i0> w0VarL = l();
            dVar.f45779d = i18;
            dVar.f45782g = 1;
            if (w0VarL.T0(dVar) == objE) {
                return objE;
            }
            i15 = i18;
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = dVar.f45779d;
            oq.u.b(obj);
        }
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
        }
        return vq.b.e(i15);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int get_flashMode() {
        return this._flashMode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final o.t0.j get_screenFlash() {
        return this._screenFlash;
    }

    public final ju.w0<oq.i0> l() {
        ju.x<oq.i0> xVar = this._updateSignal;
        return xVar != null ? xVar : ju.z.a(oq.i0.f148189a);
    }

    public final ju.w0<oq.i0> o(int flashMode, boolean cancelPreviousTask) {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(get_requestControl());
        }
        ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
        if (get_requestControl() == null) {
            xVarC.p(new o.j.a("Camera is not active."));
            return xVarC;
        }
        this._flashMode = flashMode;
        if (cancelPreviousTask) {
            u();
        } else {
            ju.x<oq.i0> xVar = this._updateSignal;
            if (xVar != null) {
                PRN.a0.s(xVarC, xVar);
            }
        }
        this._updateSignal = xVarC;
        PRN.a0.s(this.state3AControl.r(flashMode), xVarC);
        return xVarC;
    }

    public final void q(o.t0.j screenFlash) {
        this._screenFlash = screenFlash;
    }

    @Override // e.z1
    public void reset() {
        this._flashMode = 2;
        this._screenFlash = null;
        u();
        p(this, 2, false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (ju.f.a(r4, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof e.f1.e
            if (r0 == 0) goto L13
            r0 = r8
            e.f1$e r0 = (e.f1.e) r0
            int r1 = r0.f45787h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45787h = r1
            goto L18
        L13:
            e.f1$e r0 = new e.f1$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f45785f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f45787h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r8)
            goto L8b
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            java.lang.Object r2 = r0.f45784e
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f45783d
            java.util.List r4 = (java.util.List) r4
            oq.u.b(r8)
            goto L5e
        L40:
            oq.u.b(r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 3
            long r5 = r8.toMillis(r5)
            r0.f45783d = r2
            r0.f45784e = r2
            r0.f45787h = r4
            java.lang.Object r8 = r7.f(r5, r0)
            if (r8 != r1) goto L5d
            goto L8a
        L5d:
            r4 = r2
        L5e:
            r2.add(r8)
            ju.w0 r8 = r7.m()
            if (r8 == 0) goto L6e
            boolean r8 = r4.add(r8)
            vq.b.a(r8)
        L6e:
            ju.w0 r8 = r7.r()
            if (r8 == 0) goto L7b
            boolean r8 = r4.add(r8)
            vq.b.a(r8)
        L7b:
            java.util.Collection r4 = (java.util.Collection) r4
            r8 = 0
            r0.f45783d = r8
            r0.f45784e = r8
            r0.f45787h = r3
            java.lang.Object r8 = ju.f.a(r4, r0)
            if (r8 != r1) goto L8b
        L8a:
            return r1
        L8b:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f1.t(tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(tq.e<? super oq.i0> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f45790f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f45790f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f45788d;
        Object objE = uq.b.e();
        int i16 = fVar.f45790f;
        if (i16 == 0) {
            oq.u.b(obj);
            ju.n2 n2VarC = ju.g1.c();
            g gVar = new g(null);
            fVar.f45790f = 1;
            if (ju.i.g(n2VarC, gVar, fVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        if (z.h(this.cameraProperties.getMetadata())) {
            this.state3AControl.u(false);
        }
        if (this.useFlashModeTorchFor3aUpdate.a()) {
            x1.n(this.torchControl, x1.a.INSTANCE.a(), false, true, 2, null);
        }
        return oq.i0.f148189a;
    }
}
