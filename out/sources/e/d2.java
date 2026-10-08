package e;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;
import v.j3;
import v.l3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J%\u0010)\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J(\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.H\u0096@¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00106R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\b7\u0010:R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR#\u0010K\u001a\n F*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR#\u0010O\u001a\n F*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010NR#\u0010S\u001a\n F*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Le/d2;", "Le/y1;", "Ld/g0;", "useCaseGraphContext", "Le/u2;", "threads", "Lv/l3;", "sessionProcessor", "Le/f2;", "requestControl", "Lnq/a;", "Le/r2;", "useCaseSurfaceManagerProvider", "LPRN/r0;", "sessionConfigAdapterProvider", "Le/c0;", "capturePipelineProvider", "<init>", "(Ld/g0;Le/u2;Lv/l3;Le/f2;Lnq/a;Lnq/a;Lnq/a;)V", "Lh/q1;", "p", "()Lh/q1;", "stillCaptureStreamId", "Lh/s;", "cameraGraph", "Loq/i0;", "u", "(Lh/q1;Lh/s;)V", "start", "()V", "Lju/d2;", "close", "()Lju/d2;", "", "enabled", "d", "(Z)V", "isPrimary", "", "Lo/j2;", "runningUseCases", "a", "(ZLjava/util/Collection;)Lju/d2;", "", "toString", "()Ljava/lang/String;", "", "captureMode", "flashMode", "flashType", "Lu/m;", "b", "(IIILtq/e;)Ljava/lang/Object;", "Ld/g0;", "Le/u2;", "c", "Lv/l3;", "Le/f2;", "()Le/f2;", "e", "Lnq/a;", "f", "g", "h", "I", "debugId", "Liu/a;", "i", "Liu/a;", "closed", "kotlin.jvm.PlatformType", "j", "Loq/k;", "s", "()Le/r2;", "useCaseSurfaceManager", "k", "r", "()LPRN/r0;", "sessionConfigAdapter", "l", "q", "()Le/c0;", "capturePipeline", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d2 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.g0 useCaseGraphContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l3 sessionProcessor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f2 requestControl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final nq.a<r2> useCaseSurfaceManagerProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final nq.a<PRN.r0> sessionConfigAdapterProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final nq.a<c0> capturePipelineProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int debugId = e2.b().d();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final iu.a closed = iu.b.a(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k useCaseSurfaceManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k sessionConfigAdapter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k capturePipeline;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d2 f45736f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tq.e eVar, d2 d2Var) {
            super(2, eVar);
            this.f45736f = d2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            Object objE = uq.b.e();
            int i15 = this.f45735e;
            if (i15 == 0) {
                oq.u.b(obj);
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                    Objects.toString(this.f45736f);
                }
                l3 l3Var = this.f45736f.sessionProcessor;
                if (l3Var != null) {
                    l3Var.c(null);
                }
                this.f45736f.useCaseGraphContext.d();
                ju.w0<oq.i0> w0VarR = this.f45736f.s().r();
                this.f45735e = 1;
                if (w0VarR.I(this) == objE) {
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
            return new a(eVar, this.f45736f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d2 f45738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f45739g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tq.e eVar, d2 d2Var, boolean z15) {
            super(2, eVar);
            this.f45738f = d2Var;
            this.f45739g = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f45737e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f45738f.closed.b()) {
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
            } else {
                this.f45738f.useCaseGraphContext.f().X(this.f45739g);
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
            return new b(eVar, this.f45738f, this.f45739g);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e/d2$c", "Lv/l3$a;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements l3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.q1 f45740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.s f45741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d2 f45742c;

        c(h.q1 q1Var, h.s sVar, d2 d2Var) {
            this.f45740a = q1Var;
            this.f45741b = sVar;
            this.f45742c = d2Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d2 f45744f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tq.e eVar, d2 d2Var) {
            super(2, eVar);
            this.f45744f = d2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f45743e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f45744f.closed.b()) {
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
            } else {
                h.s sVarF = this.f45744f.useCaseGraphContext.f();
                this.f45744f.useCaseGraphContext.e();
                sVarF.start();
                Map<v.u1, h.q1> mapH = this.f45744f.useCaseGraphContext.h();
                h.q1 q1VarP = this.f45744f.p();
                e.c cVar2 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                }
                if (this.f45744f.r().p()) {
                    r2.p(this.f45744f.s(), sVarF, this.f45744f.r(), mapH, 0L, 8, null).C0(e.f45745a);
                } else if (o.e1.g("CXCP")) {
                    io.sentry.android.core.c2.e(e.c.TRUNCATED_TAG, "Unable to create capture session due to conflicting configurations");
                }
                this.f45744f.u(q1VarP, sVarF);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(eVar, this.f45744f);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements er.l<Throwable, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f45745a = new e();

        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            c(th4);
            return oq.i0.f148189a;
        }

        public final void c(Throwable th4) {
            if (th4 == null || (th4 instanceof CancellationException)) {
                return;
            }
            e.c cVar = e.c.f45719a;
            if (o.e1.g("CXCP")) {
                io.sentry.android.core.c2.f(e.c.TRUNCATED_TAG, "Surface setup error!", th4);
            }
        }
    }

    public d2(d.g0 g0Var, u2 u2Var, l3 l3Var, f2 f2Var, nq.a<r2> aVar, nq.a<PRN.r0> aVar2, nq.a<c0> aVar3) {
        this.useCaseGraphContext = g0Var;
        this.threads = u2Var;
        this.sessionProcessor = l3Var;
        this.requestControl = f2Var;
        this.useCaseSurfaceManagerProvider = aVar;
        this.sessionConfigAdapterProvider = aVar2;
        this.capturePipelineProvider = aVar3;
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            toString();
        }
        this.useCaseSurfaceManager = oq.l.a(new er.a() { // from class: e.a2
            @Override // er.a
            public final Object a() {
                return d2.v(this.f45711a);
            }
        });
        this.sessionConfigAdapter = oq.l.a(new er.a() { // from class: e.b2
            @Override // er.a
            public final Object a() {
                return d2.t(this.f45718a);
            }
        });
        this.capturePipeline = oq.l.a(new er.a() { // from class: e.c2
            @Override // er.a
            public final Object a() {
                return d2.o(this.f45721a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 o(d2 d2Var) {
        return d2Var.capturePipelineProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.q1 p() {
        Object next;
        j3 j3VarN = r().n();
        if (j3VarN == null) {
            return null;
        }
        List<v.u1> listH = j3VarN.l().h();
        Iterator<T> it = j3VarN.p().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (listH.contains((v.u1) next));
        v.u1 u1Var = (v.u1) next;
        if (u1Var == null) {
            return null;
        }
        return (h.q1) pq.v.m0(this.useCaseGraphContext.g(pq.v.e(u1Var)));
    }

    private final c0 q() {
        return (c0) this.capturePipeline.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PRN.r0 r() {
        return (PRN.r0) this.sessionConfigAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r2 s() {
        return (r2) this.useCaseSurfaceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PRN.r0 t(d2 d2Var) {
        return d2Var.sessionConfigAdapterProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(h.q1 stillCaptureStreamId, h.s cameraGraph) {
        l3 l3Var = this.sessionProcessor;
        if (l3Var != null) {
            l3Var.c(new c(stillCaptureStreamId, cameraGraph, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2 v(d2 d2Var) {
        return d2Var.useCaseSurfaceManagerProvider.get();
    }

    @Override // e.y1
    public ju.d2 a(boolean isPrimary, Collection<? extends o.j2> runningUseCases) {
        return getRequestControl().a(isPrimary, runningUseCases);
    }

    @Override // e.y1
    public Object b(int i15, int i16, int i17, tq.e<? super u.m> eVar) {
        return q().b(i15, i16, i17, eVar);
    }

    @Override // e.y1
    /* JADX INFO: renamed from: c, reason: from getter */
    public f2 getRequestControl() {
        return this.requestControl;
    }

    @Override // e.y1
    public ju.d2 close() {
        if (!this.closed.a(false, true)) {
            return ju.z.a(oq.i0.f148189a);
        }
        getRequestControl().close();
        return ju.k.d(this.threads.getSequentialScope(), null, null, new a(null, this), 3, null);
    }

    @Override // e.y1
    public void d(boolean enabled) {
        ju.k.d(this.threads.getSequentialScope(), null, null, new b(null, this, enabled), 3, null);
    }

    @Override // e.y1
    public void start() {
        ju.k.d(this.threads.getSequentialScope(), null, null, new d(null, this), 3, null);
    }

    public String toString() {
        return "UseCaseCamera-" + this.debugId;
    }
}
