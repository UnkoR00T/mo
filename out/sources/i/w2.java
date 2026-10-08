package i;

import android.hardware.camera2.CameraDevice;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 22\u00020\u0001:\u0001\"BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Li/w2;", "", "Li/p2;", "cameraOpener", "Li/g2;", "camera2MetadataProvider", "Lm/d;", "cameraErrorListener", "Li/h2;", "camera2Quirks", "Lk/a0;", "timeSource", "Lh/z$b;", "cameraInteropConfig", "Lk/z;", "threads", "<init>", "(Li/p2;Li/g2;Lm/d;Li/h2;Lk/a0;Lh/z$b;Lk/z;)V", "Lh/v;", "cameraId", "", "attempts", "Lk/b0;", "requestTimestamp", "Li/x1;", "camera2DeviceCloser", "Li/n0;", "audioRestrictionController", "Li/k3;", "d", "(Ljava/lang/String;IJLi/x1;Li/n0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "c", "()V", "a", "Li/p2;", "b", "Li/g2;", "Lm/d;", "Li/h2;", "e", "Lk/a0;", "f", "Lh/z$b;", "g", "Lk/z;", "Lju/x;", "h", "Lju/x;", "cameraOpenCancelled", "i", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f87502i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p2 cameraOpener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g2 camera2MetadataProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h2 camera2Quirks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.a0 timeSource;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h.z.CameraInteropConfig cameraInteropConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> cameraOpenCancelled = ju.z.c(null, 1, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Li/w2$a;", "", "<init>", "()V", "", "CAMERA_OPEN_TIMEOUT_MS", "J", "CAMERA_OPEN_CANCEL_TIMEOUT_MS", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f87514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f87515h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f87516j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f87518l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87516j = obj;
            this.f87518l |= PKIFailureInfo.systemUnavail;
            return w2.this.d(null, 0, 0L, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Li/k3;", "<anonymous>", "(Lju/p0;)Li/k3;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super OpenCameraResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f87521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f87522h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f87523j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f87524k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f87526m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ i.g f87527n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87528e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w2 f87529f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w2 w2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f87529f = w2Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
            
                if (ju.z0.b(2000, r4) == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
                /*
                    r4 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r4.f87528e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oq.u.b(r5)
                    goto L3b
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    oq.u.b(r5)
                    goto L30
                L1e:
                    oq.u.b(r5)
                    i.w2 r5 = r4.f87529f
                    ju.x r5 = i.w2.a(r5)
                    r4.f87528e = r3
                    java.lang.Object r5 = r5.I(r4)
                    if (r5 != r0) goto L30
                    goto L3a
                L30:
                    r4.f87528e = r2
                    r1 = 2000(0x7d0, double:9.88E-321)
                    java.lang.Object r5 = ju.z0.b(r1, r4)
                    if (r5 != r0) goto L3b
                L3a:
                    return r0
                L3b:
                    oq.i0 r5 = oq.i0.f148189a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: i.w2.c.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f87529f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Li/k3;", "<anonymous>", "(Lju/p0;)Li/k3;"}, k = 3, mv = {2, 1, 0})
        static final class b extends vq.k implements er.p<ju.p0, tq.e<? super OpenCameraResult>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87530e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w2 f87531f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f87532g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ i.g f87533h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w2 w2Var, String str, i.g gVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f87531f = w2Var;
                this.f87532g = str;
                this.f87533h = gVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f87530e;
                try {
                    if (i15 == 0) {
                        oq.u.b(obj);
                        p2 p2Var = this.f87531f.cameraOpener;
                        String str = this.f87532g;
                        i.g gVar = this.f87533h;
                        this.f87530e = 1;
                        if (p2Var.a(str, gVar, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                } catch (Exception e15) {
                    k.k kVar = k.k.f107055a;
                    String str2 = this.f87532g;
                    if (kVar.d()) {
                        io.sentry.android.core.c2.h("CXCP", "Failed to open " + ((Object) h.v.f(str2)), e15);
                    }
                    this.f87533h.h(e15);
                    new OpenCameraResult(null, h.q.o(h.q.INSTANCE.c(e15)), 1, null);
                }
                return null;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super OpenCameraResult> eVar) {
                return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f87531f, this.f87532g, this.f87533h, eVar);
            }
        }

        /* JADX INFO: renamed from: i.w2$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li/k3;", "it", "<anonymous>", "(Li/k3;)Li/k3;"}, k = 3, mv = {2, 1, 0})
        static final class C2054c extends vq.k implements er.p<OpenCameraResult, tq.e<? super OpenCameraResult>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87534e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f87535f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fr.p0<ju.w0<OpenCameraResult>> f87536g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f87537h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2054c(fr.p0<ju.w0<OpenCameraResult>> p0Var, String str, tq.e<? super C2054c> eVar) {
                super(2, eVar);
                this.f87536g = p0Var;
                this.f87537h = str;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f87534e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                OpenCameraResult openCameraResult = (OpenCameraResult) this.f87535f;
                k.k kVar = k.k.f107055a;
                String str = this.f87537h;
                if (kVar.a()) {
                    h.v.f(str);
                }
                this.f87536g.f66410a = null;
                return openCameraResult;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(OpenCameraResult openCameraResult, tq.e<? super OpenCameraResult> eVar) {
                return ((C2054c) v(openCameraResult, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C2054c c2054c = new C2054c(this.f87536g, this.f87537h, eVar);
                c2054c.f87535f = obj;
                return c2054c;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li/k3;", "it", "<anonymous>", "(Li/k3;)Li/k3;"}, k = 3, mv = {2, 1, 0})
        static final class d extends vq.k implements er.p<OpenCameraResult, tq.e<? super OpenCameraResult>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87538e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f87539f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fr.p0<ju.w0<OpenCameraResult>> f87540g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f87541h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(fr.p0<ju.w0<OpenCameraResult>> p0Var, String str, tq.e<? super d> eVar) {
                super(2, eVar);
                this.f87540g = p0Var;
                this.f87541h = str;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f87538e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                OpenCameraResult openCameraResult = (OpenCameraResult) this.f87539f;
                k.k kVar = k.k.f107055a;
                String str = this.f87541h;
                if (kVar.a()) {
                    h.v.f(str);
                }
                this.f87540g.f66410a = null;
                return openCameraResult;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(OpenCameraResult openCameraResult, tq.e<? super OpenCameraResult> eVar) {
                return ((d) v(openCameraResult, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                d dVar = new d(this.f87540g, this.f87541h, eVar);
                dVar.f87539f = obj;
                return dVar;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li/k3;", "<anonymous>", "()Li/k3;"}, k = 3, mv = {2, 1, 0})
        static final class e extends vq.k implements er.l<tq.e<? super OpenCameraResult>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87542e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ fr.p0<ju.d2> f87543f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fr.p0<ju.w0<OpenCameraResult>> f87544g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ i.g f87545h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(fr.p0<ju.d2> p0Var, fr.p0<ju.w0<OpenCameraResult>> p0Var2, i.g gVar, tq.e<? super e> eVar) {
                super(1, eVar);
                this.f87543f = p0Var;
                this.f87544g = p0Var2;
                this.f87545h = gVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f87542e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                k.k kVar = k.k.f107055a;
                kVar.a();
                this.f87543f.f66410a = null;
                if (this.f87544g.f66410a == null) {
                    return null;
                }
                if (kVar.b()) {
                    io.sentry.android.core.c2.e("CXCP", "tryOpenCamera: openCamera() timed out");
                }
                this.f87545h.f();
                return new OpenCameraResult(null, h.q.o(h.q.INSTANCE.j()), 1, null);
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new e(this.f87543f, this.f87544g, this.f87545h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super OpenCameraResult> eVar) {
                return ((e) M(eVar)).J(oq.i0.f148189a);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li/k3;", "<anonymous>", "()Li/k3;"}, k = 3, mv = {2, 1, 0})
        static final class f extends vq.k implements er.l<tq.e<? super OpenCameraResult>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87546e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ fr.p0<ju.d2> f87547f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(fr.p0<ju.d2> p0Var, tq.e<? super f> eVar) {
                super(1, eVar);
                this.f87547f = p0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f87546e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                k.k.f107055a.a();
                this.f87547f.f66410a = null;
                return new OpenCameraResult(null, h.q.o(h.q.INSTANCE.j()), 1, null);
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new f(this.f87547f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super OpenCameraResult> eVar) {
                return ((f) M(eVar)).J(oq.i0.f148189a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Li/k3;", "<anonymous>", "(Lju/p0;)Li/k3;"}, k = 3, mv = {2, 1, 0})
        static final class g extends vq.k implements er.p<ju.p0, tq.e<? super OpenCameraResult>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87548e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ i.g f87549f;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li/s2;", "it", "", "<anonymous>", "(Li/s2;)Z"}, k = 3, mv = {2, 1, 0})
            static final class a extends vq.k implements er.p<s2, tq.e<? super Boolean>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f87550e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f87551f;

                a(tq.e<? super a> eVar) {
                    super(2, eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    uq.b.e();
                    if (this.f87550e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return vq.b.a(!(((s2) this.f87551f) instanceof x2));
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(s2 s2Var, tq.e<? super Boolean> eVar) {
                    return ((a) v(s2Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    a aVar = new a(eVar);
                    aVar.f87551f = obj;
                    return aVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(i.g gVar, tq.e<? super g> eVar) {
                super(2, eVar);
                this.f87549f = gVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f87548e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.p0<s2> p0VarL = this.f87549f.l();
                    a aVar = new a(null);
                    this.f87548e = 1;
                    obj = mu.i.y(p0VarL, aVar, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                s2 s2Var = (s2) obj;
                if (s2Var instanceof CameraStateOpen) {
                    return new OpenCameraResult(this.f87549f, null, 2, null);
                }
                if (s2Var instanceof CameraStateClosing) {
                    this.f87549f.f();
                    return new OpenCameraResult(null, ((CameraStateClosing) s2Var).getCameraErrorCode(), 1, null);
                }
                if (s2Var instanceof CameraStateClosed) {
                    this.f87549f.f();
                    return new OpenCameraResult(null, ((CameraStateClosed) s2Var).getCameraErrorCode(), 1, null);
                }
                if (!(s2Var instanceof x2)) {
                    throw new oq.p();
                }
                this.f87549f.f();
                throw new IllegalStateException("Unexpected CameraState: " + s2Var);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super OpenCameraResult> eVar) {
                return ((g) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new g(this.f87549f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class h extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87552e;

            h(tq.e<? super h> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f87552e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    this.f87552e = 1;
                    if (ju.z0.b(3000L, this) == objE) {
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
                return ((h) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new h(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, i.g gVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f87526m = str;
            this.f87527n = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0095 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:17:0x00a8 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x00ba A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x00cc A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x00de A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00fc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0101 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0109 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0112 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x011b A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0124 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x012d A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:30:0x00fd, B:15:0x0095, B:17:0x00a8, B:18:0x00b4, B:20:0x00ba, B:21:0x00c6, B:23:0x00cc, B:24:0x00d8, B:26:0x00de, B:27:0x00ea, B:32:0x0101, B:34:0x0109, B:35:0x010c, B:37:0x0112, B:38:0x0115, B:40:0x011b, B:41:0x011e, B:43:0x0124, B:44:0x0127, B:46:0x012d), top: B:54:0x0020 }] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, ju.w0] */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, ju.w0] */
        /* JADX WARN: Type inference failed for: r5v6, types: [T, ju.d2] */
        /* JADX WARN: Type inference failed for: r5v9, types: [T, ju.d2] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00fa -> B:30:0x00fd). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:32:0x0101
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 337
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i.w2.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super OpenCameraResult> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = w2.this.new c(this.f87526m, this.f87527n, eVar);
            cVar.f87524k = obj;
            return cVar;
        }
    }

    public w2(p2 p2Var, g2 g2Var, m.d dVar, h2 h2Var, k.a0 a0Var, h.z.CameraInteropConfig cameraInteropConfig, k.z zVar) {
        this.cameraOpener = p2Var;
        this.camera2MetadataProvider = g2Var;
        this.cameraErrorListener = dVar;
        this.camera2Quirks = h2Var;
        this.timeSource = a0Var;
        this.cameraInteropConfig = cameraInteropConfig;
        this.threads = zVar;
    }

    public final void c() {
        this.cameraOpenCancelled.d0(oq.i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(String str, int i15, long j15, x1 x1Var, n0 n0Var, tq.e<? super OpenCameraResult> eVar) throws Throwable {
        b bVar;
        x1 x1Var2;
        n0 n0Var2;
        long j16;
        String str2;
        int i16;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i17 = bVar.f87518l;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f87518l = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f87516j;
        Object objE = uq.b.e();
        int i18 = bVar.f87518l;
        if (i18 == 0) {
            oq.u.b(objB);
            g2 g2Var = this.camera2MetadataProvider;
            bVar.f87511d = str;
            bVar.f87512e = x1Var;
            bVar.f87513f = n0Var;
            bVar.f87514g = i15;
            bVar.f87515h = j15;
            bVar.f87518l = 1;
            objB = g2Var.b(str, bVar);
            if (objB != objE) {
                x1Var2 = x1Var;
                n0Var2 = n0Var;
                j16 = j15;
                str2 = str;
                i16 = i15;
            }
        }
        if (i18 != 1) {
            if (i18 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
            return objB;
        }
        long j17 = bVar.f87515h;
        int i19 = bVar.f87514g;
        n0 n0Var3 = (n0) bVar.f87513f;
        x1 x1Var3 = (x1) bVar.f87512e;
        String str3 = (String) bVar.f87511d;
        oq.u.b(objB);
        n0Var2 = n0Var3;
        j16 = j17;
        x1Var2 = x1Var3;
        str2 = str3;
        i16 = i19;
        h.x xVar = (h.x) objB;
        k.a0 a0Var = this.timeSource;
        m.d dVar = this.cameraErrorListener;
        h2 h2Var = this.camera2Quirks;
        k.z zVar = this.threads;
        h.z.CameraInteropConfig cameraInteropConfig = this.cameraInteropConfig;
        CameraDevice.StateCallback cameraDeviceStateCallback = cameraInteropConfig != null ? cameraInteropConfig.getCameraDeviceStateCallback() : null;
        h.z.CameraInteropConfig cameraInteropConfig2 = this.cameraInteropConfig;
        c cVar = new c(str2, new g(str2, xVar, i16, j16, a0Var, dVar, x1Var2, h2Var, zVar, n0Var2, cameraDeviceStateCallback, cameraInteropConfig2 != null ? cameraInteropConfig2.getCameraCaptureSessionListener() : null, null), null);
        bVar.f87511d = null;
        bVar.f87512e = null;
        bVar.f87513f = null;
        bVar.f87518l = 2;
        Object objC = ju.z2.c(cVar, bVar);
        return objC == objE ? objE : objC;
    }
}
