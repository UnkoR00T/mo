package i;

import android.os.Build;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 12\u00020\u0001:\u0001\"BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Li/x3;", "Li/w3;", "Li/w2;", "cameraStateOpener", "Lm/d;", "cameraErrorListener", "Li/j2;", "cameraAvailabilityMonitor", "Lk/a0;", "timeSource", "Li/f3;", "devicePolicyManager", "Li/n0;", "audioRestrictionController", "Lh/z$b;", "cameraInteropConfig", "Lk/z;", "threads", "<init>", "(Li/w2;Lm/d;Li/j2;Lk/a0;Li/f3;Li/n0;Lh/z$b;Lk/z;)V", "Lh/v;", "cameraId", "Li/x1;", "camera2DeviceCloser", "Lkotlin/Function1;", "Loq/i0;", "", "isForegroundObserver", "Li/k3;", "b", "(Ljava/lang/String;Li/x1;Ler/l;Ltq/e;)Ljava/lang/Object;", "Li/q0;", "c", "(Ljava/lang/String;Li/x1;)Li/q0;", "a", "()V", "Li/w2;", "Lm/d;", "Li/j2;", "d", "Lk/a0;", "e", "Li/f3;", "f", "Li/n0;", "g", "Lh/z$b;", "h", "Lk/z;", "i", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x3 implements w3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w2 cameraStateOpener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j2 cameraAvailabilityMonitor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k.a0 timeSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f3 devicePolicyManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n0 audioRestrictionController;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h.z.CameraInteropConfig cameraInteropConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: i.x3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Li/x3$a;", "", "<init>", "()V", "Lk/i;", "d1", "d2", "c", "(JLk/i;)J", "Lh/q;", "errorCode", "", "attempts", "elapsedNs", "", "camerasDisabledByDevicePolicy", "isForeground", "cameraOpenRetryMaxTimeoutNs", "e", "(IIJZZLk/i;)Z", "d", "(ZI)Z", "activeResumeActivated", "b", "(ZLk/i;)J", "", "a", "(JZ)J", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final long c(long d15, k.i d16) {
            return (d16 == null || k.i.b(d15, d16.getValue()) == -1) ? d15 : d16.getValue();
        }

        public final long a(long elapsedNs, boolean activeResumeActivated) {
            if (activeResumeActivated && k.i.b(elapsedNs, y3.f87643c[0].getValue()) >= 0) {
                return k.i.b(elapsedNs, y3.f87643c[1].getValue()) < 0 ? 2000L : 4000L;
            }
            return 500L;
        }

        public final long b(boolean activeResumeActivated, k.i cameraOpenRetryMaxTimeoutNs) {
            return !activeResumeActivated ? c(y3.f87641a, cameraOpenRetryMaxTimeoutNs) : c(y3.f87642b, cameraOpenRetryMaxTimeoutNs);
        }

        public final boolean d(boolean isForeground, int errorCode) {
            int i15;
            if (!isForeground || 29 > (i15 = Build.VERSION.SDK_INT) || i15 >= 33) {
                return false;
            }
            h.q.Companion companion = h.q.INSTANCE;
            return h.q.r(errorCode, companion.g()) || h.q.r(errorCode, companion.h()) || h.q.r(errorCode, companion.f());
        }

        public final boolean e(int errorCode, int attempts, long elapsedNs, boolean camerasDisabledByDevicePolicy, boolean isForeground, k.i cameraOpenRetryMaxTimeoutNs) {
            boolean zD = d(isForeground, errorCode);
            if (zD) {
                k.k.f107055a.a();
            }
            if (k.i.b(elapsedNs, b(zD, cameraOpenRetryMaxTimeoutNs)) > 0) {
                return false;
            }
            h.q.Companion companion = h.q.INSTANCE;
            if (h.q.r(errorCode, companion.p())) {
                return attempts <= 1;
            }
            if (h.q.r(errorCode, companion.g())) {
                return Build.VERSION.SDK_INT >= 29 || attempts <= 1;
            }
            if (h.q.r(errorCode, companion.h())) {
                return true;
            }
            if (h.q.r(errorCode, companion.e())) {
                return !camerasDisabledByDevicePolicy || attempts <= 1;
            }
            if (h.q.r(errorCode, companion.d()) || h.q.r(errorCode, companion.k()) || h.q.r(errorCode, companion.f()) || h.q.r(errorCode, companion.n())) {
                return true;
            }
            if (h.q.r(errorCode, companion.o())) {
                return attempts <= 1;
            }
            if (h.q.r(errorCode, companion.l())) {
                return false;
            }
            if (h.q.r(errorCode, companion.q())) {
                return attempts <= 1;
            }
            if (k.k.f107055a.b()) {
                io.sentry.android.core.c2.e("CXCP", "Unexpected CameraError: " + x3.INSTANCE);
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Li/q0;", "<anonymous>", "(Lju/p0;)Li/q0;"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super AwaitOpenCameraResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f87610f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f87612h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ x1 f87613j;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li/s2;", "it", "", "<anonymous>", "(Li/s2;)Z"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<s2, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87614e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f87615f;

            a(tq.e<? super a> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f87614e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return vq.b.a(!fr.t.c((s2) this.f87615f, x2.f87599a));
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(s2 s2Var, tq.e<? super Boolean> eVar) {
                return ((a) v(s2Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(eVar);
                aVar.f87615f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, x1 x1Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f87612h = str;
            this.f87613j = x1Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r1 == r7) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i.x3.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super AwaitOpenCameraResult> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return x3.this.new b(this.f87612h, this.f87613j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f87619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f87620h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f87621j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f87622k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f87623l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f87625n;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87623l = obj;
            this.f87625n |= PKIFailureInfo.systemUnavail;
            return x3.this.b(null, null, null, this);
        }
    }

    public x3(w2 w2Var, m.d dVar, j2 j2Var, k.a0 a0Var, f3 f3Var, n0 n0Var, h.z.CameraInteropConfig cameraInteropConfig, k.z zVar) {
        this.cameraStateOpener = w2Var;
        this.cameraErrorListener = dVar;
        this.cameraAvailabilityMonitor = j2Var;
        this.timeSource = a0Var;
        this.devicePolicyManager = f3Var;
        this.audioRestrictionController = n0Var;
        this.cameraInteropConfig = cameraInteropConfig;
        this.threads = zVar;
    }

    @Override // i.w3
    public void a() {
        this.cameraStateOpener.c();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:38:0x012a  */
    /* JADX WARN: Code duplicated, block: B:40:0x012e A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0136 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x013e A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0147 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0169 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0172  */
    /* JADX WARN: Code duplicated, block: B:55:0x0181 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0187  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:60:0x0197 A[DONT_INVERT, PHI: r33
      0x0197: PHI (r33v2 i.k3) = (r33v3 i.k3), (r33v4 i.k3) binds: [B:59:0x018a, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0199 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x004b, B:70:0x0257, B:72:0x025f, B:74:0x0267, B:35:0x0114, B:40:0x012e, B:43:0x0136, B:45:0x013e, B:48:0x0147, B:50:0x0169, B:53:0x0175, B:55:0x0181, B:59:0x018a, B:61:0x0199, B:63:0x01a1, B:67:0x0227, B:22:0x0082), top: B:86:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0226  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        if (r7 == r4) goto L69;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01a1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0254 -> B:16:0x0052). Please report as a decompilation issue!!! */
    @Override // i.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r32, i.x1 r33, er.l<? super oq.i0, java.lang.Boolean> r34, tq.e<? super i.OpenCameraResult> r35) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.x3.b(java.lang.String, i.x1, er.l, tq.e):java.lang.Object");
    }

    @Override // i.w3
    public AwaitOpenCameraResult c(String cameraId, x1 camera2DeviceCloser) {
        if (k.k.f107055a.a()) {
            h.v.f(cameraId);
        }
        return (AwaitOpenCameraResult) ju.i.e(this.threads.getBlockingDispatcher(), new b(cameraId, camera2DeviceCloser, null));
    }
}
