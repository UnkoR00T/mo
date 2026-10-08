package i;

import android.os.Build;
import android.view.Surface;
import h.ConcurrentCameraGraphs;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l.StreamGraph;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.x0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u009d\u00012\u00020\u0001:\u0002PNB\u0091\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0003¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0003¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020&H\u0003¢\u0006\u0004\b*\u0010(J\u0017\u0010-\u001a\u00020&2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020&H\u0082@¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020&2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J#\u00109\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u0001052\b\u00108\u001a\u0004\u0018\u000107H\u0003¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0003¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020&H\u0016¢\u0006\u0004\b>\u0010(J\u000f\u0010?\u001a\u00020&H\u0016¢\u0006\u0004\b?\u0010(J\u0010\u0010@\u001a\u00020;H\u0096@¢\u0006\u0004\b@\u00100J#\u0010E\u001a\u00020&2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0AH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010jR\u0014\u0010m\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010lR\u0016\u0010o\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010@R(\u0010w\u001a\u00020p8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010q\u0012\u0004\bv\u0010(\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010z\u001a\u00020+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010}\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010|R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010\u007fR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0086\u0001R\u001d\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010\u0089\u0001R\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u008b\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0091\u0001\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010\u0090\u0001R\u001b\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0083\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0083\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0083\u0001R\u0016\u0010\u0098\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010IR)\u0010\u009c\u0001\u001a\u00020;2\u0007\u0010\u0099\u0001\u001a\u00020;8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b\u0082\u0001\u0010=\"\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Li/x0;", "Lh/n;", "Lju/p0;", "scope", "Lk/z;", "threads", "Lh/r1;", "strictMode", "Lh/s$b;", "graphConfig", "Ll/i;", "graphListener", "Lh/s1;", "surfaceTracker", "Lm/h;", "cameraStatusMonitor", "Li/y2;", "captureSessionFactory", "Li/p1;", "captureSequenceProcessorFactory", "Li/z1;", "camera2DeviceManager", "Lh/e0;", "cameraSurfaceManager", "Li/h2;", "camera2Quirks", "Lk/a0;", "timeSource", "Lh/u;", "cameraGraphId", "Li/x0$d;", "shutdownListener", "Ll/x;", "streamGraph", "Li/e3;", "concurrentSessionSequencers", "<init>", "(Lju/p0;Lk/z;Lh/r1;Lh/s$b;Ll/i;Lh/s1;Lm/h;Li/y2;Li/p1;Li/z1;Lh/e0;Li/h2;Lk/a0;Lh/u;Li/x0$d;Ll/x;Li/e3;)V", "Loq/i0;", "C", "()V", "z", "B", "Lm/h$a;", "cameraStatus", "x", "(Lm/h$a;)V", "p", "(Ltq/e;)Ljava/lang/Object;", "Li/t2;", "cameraState", "y", "(Li/t2;)V", "Li/a3;", "session", "Li/e4;", "camera", "q", "(Li/a3;Li/e4;)V", "", "v", "()Z", "start", "close", "Z", "", "Lh/q1;", "Landroid/view/Surface;", "surfaceMap", "a0", "(Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "a", "Lju/p0;", "b", "Lk/z;", "c", "Lh/r1;", "d", "Lh/s$b;", "e", "Ll/i;", "f", "Lh/s1;", "g", "Lm/h;", "h", "Li/y2;", "i", "Li/p1;", "j", "Li/z1;", "k", "Lh/e0;", "l", "Li/h2;", "m", "Lk/a0;", "n", "Lh/u;", "s", "()Lh/u;", "o", "Li/x0$d;", "Ll/x;", "", "Ljava/lang/Object;", "lock", "r", "_isForeground", "Lh/n$a;", "Lh/n$a;", "u", "()Lh/n$a;", "setControllerState$camera_camera2_pipe", "(Lh/n$a;)V", "getControllerState$camera_camera2_pipe$annotations", "controllerState", "t", "Lm/h$a;", "cameraAvailability", "Lh/q;", "Lh/q;", "lastCameraError", "Lk/b0;", "Lk/b0;", "lastCameraPrioritiesChangedTs", "Lju/d2;", "w", "Lju/d2;", "restartJob", "Li/d3;", "Li/d3;", "concurrentSessionSequencer", "Lju/x;", "Lju/x;", "closedDeferred", "Li/e4;", "currentCamera", "A", "Li/a3;", "currentSession", "Ljava/util/Map;", "currentSurfaceMap", "currentCameraStateJob", ip.a.f96138c, "cameraAvailabilityJob", "E", "cameraPrioritiesJob", "Lh/v;", "cameraId", "value", "X", "(Z)V", "isForeground", "F", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraController implements h.n {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long G = k.i.c(200000000);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private a3 currentSession;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Map<h.q1, ? extends Surface> currentSurfaceMap;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private ju.d2 currentCameraStateJob;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ju.d2 cameraAvailabilityJob;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ju.d2 cameraPrioritiesJob;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.r1 strictMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h.s.b graphConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l.i graphListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h.s1 surfaceTracker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m.h cameraStatusMonitor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y2 captureSessionFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p1 captureSequenceProcessorFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final z1 camera2DeviceManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h.e0 cameraSurfaceManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h2 camera2Quirks;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k.a0 timeSource;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final h.u cameraGraphId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final d shutdownListener;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraph;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean _isForeground = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private h.n.a controllerState = h.n.a.f.f78983a;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private m.h.a cameraAvailability = new m.h.a.CameraUnavailable(t(), null);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private h.q lastCameraError;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private k.b0 lastCameraPrioritiesChangedTs;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private ju.d2 restartJob;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final d3 concurrentSessionSequencer;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final ju.x<oq.i0> closedDeferred;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private e4 currentCamera;

    /* JADX INFO: renamed from: i.x0$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87580e;

        /* JADX INFO: renamed from: i.x0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C2055a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Camera2CameraController f87582a;

            C2055a(Camera2CameraController camera2CameraController) {
                this.f87582a = camera2CameraController;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(m.h.a aVar, tq.e<? super oq.i0> eVar) {
                if (aVar instanceof m.h.a.CameraAvailable) {
                    if (!h.v.d(((m.h.a.CameraAvailable) aVar).getCamera(), this.f87582a.t())) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.f87582a.x(aVar);
                } else if (aVar instanceof m.h.a.CameraUnavailable) {
                    if (!h.v.d(((m.h.a.CameraUnavailable) aVar).getCamera(), this.f87582a.t())) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.f87582a.x(aVar);
                }
                return oq.i0.f148189a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87580e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.p0<m.h.a> p0VarI1 = Camera2CameraController.this.cameraStatusMonitor.I1();
                C2055a c2055a = new C2055a(Camera2CameraController.this);
                this.f87580e = 1;
                if (p0VarI1.a(c2055a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return Camera2CameraController.this.new a(eVar);
        }
    }

    /* JADX INFO: renamed from: i.x0$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87583e;

        /* JADX INFO: renamed from: i.x0$b$a */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Camera2CameraController f87585a;

            a(Camera2CameraController camera2CameraController) {
                this.f87585a = camera2CameraController;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(oq.i0 i0Var, tq.e<? super oq.i0> eVar) {
                this.f87585a.x(m.h.a.b.f121828a);
                return oq.i0.f148189a;
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87583e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.f0<oq.i0> f0VarM1 = Camera2CameraController.this.cameraStatusMonitor.m1();
                a aVar = new a(Camera2CameraController.this);
                this.f87583e = 1;
                if (f0VarM1.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return Camera2CameraController.this.new b(eVar);
        }
    }

    /* JADX INFO: renamed from: i.x0$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, d2 = {"Li/x0$c;", "", "<init>", "()V", "Lh/n$a;", "controllerState", "Lh/q;", "lastCameraError", "Lm/h$a;", "cameraAvailability", "Lk/b0;", "lastCameraPrioritiesChangedTs", "currentTs", "", "a", "(Lh/n$a;Lh/q;Lm/h$a;Lk/b0;J)Z", "", "RESTART_TIMEOUT_WHEN_ENABLED_MS", "J", "", "MS_TO_NS", "I", "Lk/i;", "PRIORITIES_CHANGED_THRESHOLD_NS", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        public final boolean a(h.n.a controllerState, h.q lastCameraError, m.h.a cameraAvailability, k.b0 lastCameraPrioritiesChangedTs, long currentTs) {
            boolean z15;
            if (cameraAvailability instanceof m.h.a.CameraAvailable) {
                if (lastCameraError == null ? false : h.q.r(lastCameraError.getValue(), h.q.INSTANCE.e())) {
                    z15 = false;
                } else {
                    z15 = true;
                }
            } else {
                z15 = false;
            }
            boolean z16 = lastCameraPrioritiesChangedTs != null && k.i.b(k.i.c(currentTs - lastCameraPrioritiesChangedTs.getValue()), Camera2CameraController.G) <= 0;
            if (fr.t.c(controllerState, h.n.a.c.f78980a)) {
                if (!z15 && !z16) {
                    int i15 = Build.VERSION.SDK_INT;
                    if (29 <= i15 && i15 < 33) {
                        k.k.f107055a.a();
                    }
                }
                return true;
            }
            if (fr.t.c(controllerState, h.n.a.d.f78981a) && z15) {
                h.q.Companion companion = h.q.INSTANCE;
                if (!(lastCameraError == null ? false : h.q.r(lastCameraError.getValue(), companion.m()))) {
                    if (!(lastCameraError == null ? false : h.q.r(lastCameraError.getValue(), companion.o()))) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: i.x0$d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Li/x0$d;", "", "Lh/n;", "cameraController", "Loq/i0;", "b", "(Lh/n;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {
        void b(h.n cameraController);
    }

    /* JADX INFO: renamed from: i.x0$e */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f87586d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f87588f;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87586d = obj;
            this.f87588f |= PKIFailureInfo.systemUnavail;
            return Camera2CameraController.this.Z(this);
        }
    }

    /* JADX INFO: renamed from: i.x0$f */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f<T> implements mu.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fr.p0<a3> f87589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Camera2CameraController f87590b;

        f(fr.p0<a3> p0Var, Camera2CameraController camera2CameraController) {
            this.f87589a = p0Var;
            this.f87590b = camera2CameraController;
        }

        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(s2 s2Var, tq.e<? super oq.i0> eVar) {
            if (s2Var instanceof CameraStateOpen) {
                this.f87589a.f66410a.z(((CameraStateOpen) s2Var).getCameraDevice());
            } else if (s2Var instanceof CameraStateClosing) {
                this.f87589a.f66410a.A();
            } else if (s2Var instanceof CameraStateClosed) {
                this.f87589a.f66410a.A();
                this.f87590b.y((CameraStateClosed) s2Var);
            }
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: i.x0$g */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a3 f87592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e4 f87593g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a3 a3Var, e4 e4Var, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f87592f = a3Var;
            this.f87593g = e4Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87591e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a3 a3Var = this.f87592f;
            if (a3Var != null) {
                a3Var.A();
            }
            e4 e4Var = this.f87593g;
            if (e4Var != null) {
                e4.a(e4Var, null, 1, null);
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
            return new g(this.f87592f, this.f87593g, eVar);
        }
    }

    /* JADX INFO: renamed from: i.x0$h */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87594e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87594e;
            if (i15 == 0) {
                oq.u.b(obj);
                Camera2CameraController camera2CameraController = Camera2CameraController.this;
                this.f87594e = 1;
                if (camera2CameraController.p(this) == objE) {
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
            return Camera2CameraController.this.new h(eVar);
        }
    }

    /* JADX INFO: renamed from: i.x0$i */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f87597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Camera2CameraController f87598g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j15, Camera2CameraController camera2CameraController, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f87597f = j15;
            this.f87598g = camera2CameraController;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87596e;
            if (i15 == 0) {
                oq.u.b(obj);
                long j15 = this.f87597f;
                this.f87596e = 1;
                if (ju.z0.b(j15, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            Object obj2 = this.f87598g.lock;
            Camera2CameraController camera2CameraController = this.f87598g;
            synchronized (obj2) {
                try {
                    if (!camera2CameraController.v() && !fr.t.c(camera2CameraController.getControllerState(), h.n.a.g.f78984a) && !fr.t.c(camera2CameraController.getControllerState(), h.n.a.f.f78983a)) {
                        if (k.k.f107055a.a()) {
                            camera2CameraController.toString();
                        }
                        camera2CameraController.surfaceTracker.h();
                        camera2CameraController.B();
                        camera2CameraController.z();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((i) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f87597f, this.f87598g, eVar);
        }
    }

    public Camera2CameraController(ju.p0 p0Var, k.z zVar, h.r1 r1Var, h.s.b bVar, l.i iVar, h.s1 s1Var, m.h hVar, y2 y2Var, p1 p1Var, z1 z1Var, h.e0 e0Var, h2 h2Var, k.a0 a0Var, h.u uVar, d dVar, StreamGraph xVar, e3 e3Var) {
        this.scope = p0Var;
        this.threads = zVar;
        this.strictMode = r1Var;
        this.graphConfig = bVar;
        this.graphListener = iVar;
        this.surfaceTracker = s1Var;
        this.cameraStatusMonitor = hVar;
        this.captureSessionFactory = y2Var;
        this.captureSequenceProcessorFactory = p1Var;
        this.camera2DeviceManager = z1Var;
        this.cameraSurfaceManager = e0Var;
        this.camera2Quirks = h2Var;
        this.timeSource = a0Var;
        this.cameraGraphId = uVar;
        this.shutdownListener = dVar;
        this.streamGraph = xVar;
        ConcurrentCameraGraphs concurrentCameraGraphs = bVar.getConcurrentCameraGraphs();
        this.concurrentSessionSequencer = concurrentCameraGraphs != null ? e3Var.a(getCameraGraphId(), concurrentCameraGraphs) : null;
        this.closedDeferred = ju.z.c(null, 1, null);
        this.cameraAvailabilityJob = ju.k.d(p0Var, null, null, new a(null), 3, null);
        this.cameraPrioritiesJob = ju.k.d(p0Var, null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(Camera2CameraController camera2CameraController, oq.i0 i0Var) {
        return camera2CameraController.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        if (v()) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Ignoring stop(): " + this + " is already closed");
                return;
            }
            return;
        }
        h.n.a aVar = this.controllerState;
        h.n.a.g gVar = h.n.a.g.f78984a;
        if (fr.t.c(aVar, gVar) || fr.t.c(this.controllerState, h.n.a.f.f78983a)) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Ignoring stop(): " + this + " already stopping or stopped");
                return;
            }
            return;
        }
        e4 e4Var = this.currentCamera;
        a3 a3Var = this.currentSession;
        this.currentCamera = null;
        this.currentSession = null;
        this.controllerState = gVar;
        if (k.k.f107055a.a()) {
            toString();
        }
        q(a3Var, e4Var);
    }

    private final void C() {
        long jA = this.timeSource.a();
        if (INSTANCE.a(this.controllerState, this.lastCameraError, this.cameraAvailability, this.lastCameraPrioritiesChangedTs, jA)) {
            long j15 = this.graphConfig.getFlags().getEnableRestartDelays() ? 700L : 0L;
            ju.d2 d2Var = this.restartJob;
            if (d2Var != null) {
                ju.d2.a.a(d2Var, null, 1, null);
            }
            this.restartJob = ju.k.d(this.scope, null, null, new i(j15, this, null), 3, null);
            return;
        }
        if (k.k.f107055a.a()) {
            toString();
            Objects.toString(getControllerState());
            Objects.toString(this.lastCameraError);
            Objects.toString(this.cameraAvailability);
            Objects.toString(this.lastCameraPrioritiesChangedTs);
            k.b0.f(jA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, i.a3] */
    public final Object p(tq.e<? super oq.i0> eVar) {
        e4 e4Var;
        ?? r15;
        fr.p0 p0Var = new fr.p0();
        synchronized (this.lock) {
            e4Var = this.currentCamera;
            r15 = this.currentSession;
            p0Var.f66410a = r15;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        if (e4Var == null || r15 == 0) {
            return oq.i0.f148189a;
        }
        Object objA = e4Var.getState().a(new f(p0Var, this), eVar);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    private final void q(a3 session, e4 camera) {
        ju.d2 d2VarD = ju.k.d(this.scope, null, null, new g(session, camera, null), 3, null);
        if (fr.t.c(this.controllerState, h.n.a.b.f78979a)) {
            d2VarD.C0(new er.l() { // from class: i.v0
                @Override // er.l
                public final Object b(Object obj) {
                    return Camera2CameraController.r(this.f87461a, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(Camera2CameraController camera2CameraController, Throwable th4) {
        synchronized (camera2CameraController.lock) {
            try {
                camera2CameraController.controllerState = h.n.a.C1805a.f78978a;
                if (k.k.f107055a.a()) {
                    camera2CameraController.toString();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        camera2CameraController.shutdownListener.b(camera2CameraController);
        ju.x<oq.i0> xVar = camera2CameraController.closedDeferred;
        oq.i0 i0Var2 = oq.i0.f148189a;
        xVar.d0(i0Var2);
        ju.q0.d(camera2CameraController.scope, null, 1, null);
        return i0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        return fr.t.c(this.controllerState, h.n.a.b.f78979a) || fr.t.c(this.controllerState, h.n.a.C1805a.f78978a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(m.h.a cameraStatus) {
        if (k.k.f107055a.a()) {
            toString();
            h.v.f(t());
            Objects.toString(cameraStatus);
        }
        synchronized (this.lock) {
            try {
                if (v()) {
                    return;
                }
                if ((cameraStatus instanceof m.h.a.CameraAvailable) || (cameraStatus instanceof m.h.a.CameraUnavailable)) {
                    this.cameraAvailability = cameraStatus;
                } else if (cameraStatus instanceof m.h.a.b) {
                    this.lastCameraPrioritiesChangedTs = k.b0.a(this.timeSource.a());
                }
                C();
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(CameraStateClosed cameraState) {
        synchronized (this.lock) {
            try {
                if (v()) {
                    return;
                }
                if (cameraState.getCameraErrorCode() != null) {
                    this.lastCameraError = cameraState.getCameraErrorCode();
                    if (h.q.t(cameraState.getCameraErrorCode().getValue())) {
                        this.controllerState = h.n.a.c.f78980a;
                        if (k.k.f107055a.a()) {
                            toString();
                        }
                    } else {
                        this.controllerState = h.n.a.d.f78981a;
                        if (k.k.f107055a.a()) {
                            toString();
                            h.q.u(cameraState.getCameraErrorCode().getValue());
                        }
                    }
                } else {
                    this.controllerState = h.n.a.f.f78983a;
                }
                this.surfaceTracker.b();
                C();
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        Set<h.v> setD;
        if (v()) {
            if (k.k.f107055a.c()) {
                toString();
                return;
            }
            return;
        }
        h.n.a aVar = this.controllerState;
        h.n.a.e eVar = h.n.a.e.f78982a;
        if (fr.t.c(aVar, eVar)) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Ignoring start(): " + this + " is already started");
                return;
            }
            return;
        }
        this.lastCameraError = null;
        String camera = this.graphConfig.getCamera();
        ConcurrentCameraGraphs concurrentCameraGraphs = this.graphConfig.getConcurrentCameraGraphs();
        if (concurrentCameraGraphs == null || (setD = concurrentCameraGraphs.b()) == null) {
            setD = pq.e1.d(h.v.a(camera));
        }
        e4 e4VarC = this.camera2DeviceManager.c(camera, pq.v.f1(pq.e1.k(setD, h.v.a(camera))), this.graphListener, false, new er.l() { // from class: i.w0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(Camera2CameraController.A(this.f87466a, (oq.i0) obj));
            }
        });
        if (e4VarC == null) {
            if (k.k.f107055a.b()) {
                io.sentry.android.core.c2.e("CXCP", "Failed to start " + this + ": Open request submission failed");
                return;
            }
            return;
        }
        if (this.currentCamera != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.currentSession != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.currentCamera = e4VarC;
        a3 a3Var = new a3(this.graphListener, this.captureSessionFactory, this.captureSequenceProcessorFactory, this.cameraSurfaceManager, this.timeSource, this.graphConfig.getFlags(), this.concurrentSessionSequencer, this.streamGraph, this.strictMode, this.threads, this.scope);
        this.currentSession = a3Var;
        Map<h.q1, ? extends Surface> map = this.currentSurfaceMap;
        if (map != null) {
            a3Var.u(map);
        }
        this.controllerState = eVar;
        if (k.k.f107055a.a()) {
            toString();
        }
        ju.d2 d2Var = this.currentCameraStateJob;
        if (d2Var != null) {
            ju.d2.a.a(d2Var, null, 1, null);
        }
        this.currentCameraStateJob = ju.k.d(this.scope, null, null, new h(null), 3, null);
    }

    @Override // h.n
    public void X(boolean z15) {
        synchronized (this.lock) {
            this._isForeground = z15;
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h.n
    public Object Z(tq.e<? super Boolean> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f87588f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f87588f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f87586d;
        Object objE = uq.b.e();
        int i16 = eVar2.f87588f;
        if (i16 == 0) {
            oq.u.b(obj);
            k.k kVar = k.k.f107055a;
            if (kVar.a()) {
                toString();
            }
            synchronized (this.lock) {
                try {
                    if (fr.t.c(this.controllerState, h.n.a.C1805a.f78978a)) {
                        if (kVar.a()) {
                            toString();
                        }
                        return vq.b.a(true);
                    }
                    if (!fr.t.c(this.controllerState, h.n.a.b.f78979a)) {
                        if (kVar.d()) {
                            io.sentry.android.core.c2.g("CXCP", this + "#awaitClosed: Controller isn't closing!");
                        }
                        return vq.b.a(false);
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                    ju.x<oq.i0> xVar = this.closedDeferred;
                    eVar2.f87588f = 1;
                    if (xVar.I(eVar2) == objE) {
                        return objE;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return vq.b.a(true);
    }

    @Override // h.n
    public void a0(Map<h.q1, ? extends Surface> surfaceMap) {
        synchronized (this.lock) {
            if (v()) {
                return;
            }
            this.currentSurfaceMap = surfaceMap;
            a3 a3Var = this.currentSession;
            if (a3Var != null) {
                a3Var.u(surfaceMap);
            }
        }
    }

    @Override // h.n
    public void close() {
        synchronized (this.lock) {
            try {
                if (v()) {
                    return;
                }
                this.controllerState = h.n.a.b.f78979a;
                k.k kVar = k.k.f107055a;
                if (kVar.a()) {
                    toString();
                }
                e4 e4Var = this.currentCamera;
                a3 a3Var = this.currentSession;
                this.currentCamera = null;
                this.currentSession = null;
                ju.d2 d2Var = this.restartJob;
                if (d2Var != null) {
                    ju.d2.a.a(d2Var, null, 1, null);
                }
                ju.d2 d2Var2 = this.currentCameraStateJob;
                if (d2Var2 != null) {
                    ju.d2.a.a(d2Var2, null, 1, null);
                }
                this.currentCameraStateJob = null;
                ju.d2 d2Var3 = this.cameraAvailabilityJob;
                if (d2Var3 != null) {
                    ju.d2.a.a(d2Var3, null, 1, null);
                }
                this.cameraAvailabilityJob = null;
                ju.d2 d2Var4 = this.cameraPrioritiesJob;
                if (d2Var4 != null) {
                    ju.d2.a.a(d2Var4, null, 1, null);
                }
                this.cameraPrioritiesJob = null;
                CON.j0.a(this.cameraStatusMonitor);
                q(a3Var, e4Var);
                if (this.graphConfig.getFlags().getCloseCameraDeviceOnClose() || this.camera2Quirks.c(t())) {
                    if (kVar.a()) {
                        h.v.f(t());
                        toString();
                    }
                    this.camera2DeviceManager.b(t());
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public h.u getCameraGraphId() {
        return this.cameraGraphId;
    }

    @Override // h.n
    public void start() {
        synchronized (this.lock) {
            z();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public String t() {
        return this.graphConfig.getCamera();
    }

    public String toString() {
        return "Camera2CameraController(" + getCameraGraphId() + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final h.n.a getControllerState() {
        return this.controllerState;
    }

    public boolean w() {
        boolean z15;
        synchronized (this.lock) {
            z15 = this._isForeground;
        }
        return z15;
    }
}
