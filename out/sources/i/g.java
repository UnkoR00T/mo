package i;

import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001EBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J!\u0010&\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020$H\u0002¢\u0006\u0004\b*\u0010+J%\u0010-\u001a\u00020,*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\u00020,*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00020\u001f¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020,2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b:\u00109J\u001f\u0010<\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b>\u00109J\u0017\u0010?\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b?\u00109J\u0017\u0010@\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010DR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010PR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010QR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010RR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010TR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010UR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010MR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010ZR\u0016\u0010]\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010NR\u0018\u0010k\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020m0q8F¢\u0006\u0006\u001a\u0004\bV\u0010r¨\u0006t"}, d2 = {"Li/g;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Lh/v;", "cameraId", "Lh/x;", "metadata", "", "attemptNumber", "Lk/b0;", "attemptTimestampNanos", "Lk/a0;", "timeSource", "Lm/d;", "cameraErrorListener", "Li/x1;", "camera2DeviceCloser", "Li/h2;", "camera2Quirks", "Lk/z;", "threads", "Li/n0;", "audioRestrictionController", "interopCameraDeviceStateCallback", "Lh/w$b;", "interopCaptureSessionListener", "<init>", "(Ljava/lang/String;Lh/x;IJLk/a0;Lm/d;Li/x1;Li/h2;Lk/z;Li/n0;Landroid/hardware/camera2/CameraDevice$StateCallback;Lh/w$b;Lfr/k;)V", "", "throwable", "Lh/q;", "cameraError", "Loq/i0;", "i", "(Ljava/lang/Throwable;I)V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Li/g$a;", "closeRequest", "g", "(Landroid/hardware/camera2/CameraDevice;Li/g$a;)V", "closingInfo", "Li/t2;", "j", "(Li/g$a;)Li/t2;", "", "o", "(Li/h2;Ljava/lang/String;Lh/q;)Z", "n", "f", "()V", "e", "(Ltq/e;)Ljava/lang/Object;", "", "timeoutMillis", "d", "(J)Z", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "errorCode", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "onClosed", "m", "h", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "b", "Lh/x;", "getMetadata", "()Lh/x;", "c", "I", "J", "Lk/a0;", "Lm/d;", "Li/x1;", "Li/h2;", "Lk/z;", "Li/n0;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "l", "Lh/w$b;", "debugId", "", "Ljava/lang/Object;", "lock", "Z", "opening", "p", "Li/g$a;", "pendingClose", "q", "shouldDelayFinalizing", "Ljava/util/concurrent/CountDownLatch;", "r", "Ljava/util/concurrent/CountDownLatch;", "cameraDeviceClosed", "s", "requestTimestampNanos", "t", "Lk/b0;", "openTimestampNanos", "Lmu/b0;", "Li/s2;", "u", "Lmu/b0;", "_state", "Lmu/p0;", "()Lmu/p0;", "state", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.x metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int attemptNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long attemptTimestampNanos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.a0 timeSource;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x1 camera2DeviceCloser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h2 camera2Quirks;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final n0 audioRestrictionController;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final CameraDevice.StateCallback interopCameraDeviceStateCallback;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h.w.b interopCaptureSessionListener;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int debugId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean opening;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private ClosingInfo pendingClose;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean shouldDelayFinalizing;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch cameraDeviceClosed;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long requestTimestampNanos;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private k.b0 openTimestampNanos;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<s2> _state;

    /* JADX INFO: renamed from: i.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Li/g$a;", "", "Li/c3;", "reason", "Lk/b0;", "closingTimestamp", "Lh/q;", "errorCode", "", "exception", "<init>", "(Li/c3;JLh/q;Ljava/lang/Throwable;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li/c3;", "d", "()Li/c3;", "b", "J", "()J", "c", "Lh/q;", "()Lh/q;", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ClosingInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c3 reason;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long closingTimestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final h.q errorCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable exception;

        public /* synthetic */ ClosingInfo(c3 c3Var, long j15, h.q qVar, Throwable th4, fr.k kVar) {
            this(c3Var, j15, qVar, th4);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getClosingTimestamp() {
            return this.closingTimestamp;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h.q getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c3 getReason() {
            return this.reason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClosingInfo)) {
                return false;
            }
            ClosingInfo closingInfo = (ClosingInfo) other;
            return this.reason == closingInfo.reason && k.b0.d(this.closingTimestamp, closingInfo.closingTimestamp) && fr.t.c(this.errorCode, closingInfo.errorCode) && fr.t.c(this.exception, closingInfo.exception);
        }

        public int hashCode() {
            int iHashCode = ((this.reason.hashCode() * 31) + k.b0.e(this.closingTimestamp)) * 31;
            h.q qVar = this.errorCode;
            int iS = (iHashCode + (qVar == null ? 0 : h.q.s(qVar.getValue()))) * 31;
            Throwable th4 = this.exception;
            return iS + (th4 != null ? th4.hashCode() : 0);
        }

        public String toString() {
            return "ClosingInfo(reason=" + this.reason + ", closingTimestamp=" + ((Object) k.b0.f(this.closingTimestamp)) + ", errorCode=" + this.errorCode + ", exception=" + this.exception + ')';
        }

        private ClosingInfo(c3 c3Var, long j15, h.q qVar, Throwable th4) {
            this.reason = c3Var;
            this.closingTimestamp = j15;
            this.errorCode = qVar;
            this.exception = th4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ClosingInfo(c3 c3Var, long j15, h.q qVar, Throwable th4, int i15, fr.k kVar) {
            if ((i15 & 2) != 0) {
                k.c0 c0Var = k.c0.f107031a;
                j15 = new k.w().a();
            }
            this(c3Var, j15, (i15 & 4) != 0 ? null : qVar, (i15 & 8) != 0 ? null : th4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li/s2;", "it", "", "<anonymous>", "(Li/s2;)Z"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<s2, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87134f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87133e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return vq.b.a(((s2) this.f87134f) instanceof CameraStateClosed);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(s2 s2Var, tq.e<? super Boolean> eVar) {
            return ((b) v(s2Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f87134f = obj;
            return bVar;
        }
    }

    public /* synthetic */ g(String str, h.x xVar, int i15, long j15, k.a0 a0Var, m.d dVar, x1 x1Var, h2 h2Var, k.z zVar, n0 n0Var, CameraDevice.StateCallback stateCallback, h.w.b bVar, fr.k kVar) {
        this(str, xVar, i15, j15, a0Var, dVar, x1Var, h2Var, zVar, n0Var, stateCallback, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    private final void g(CameraDevice cameraDevice, ClosingInfo closeRequest) throws Throwable {
        Throwable th4;
        g gVar;
        s2 value = this._state.getValue();
        m2 cameraDevice2 = value instanceof CameraStateOpen ? ((CameraStateOpen) value).getCameraDevice() : null;
        synchronized (this.lock) {
            try {
                if (this.pendingClose == null) {
                    try {
                        this.pendingClose = closeRequest;
                        if (this.opening) {
                            closeRequest = null;
                        }
                    } catch (Throwable th5) {
                        th4 = th5;
                        throw th4;
                    }
                } else {
                    closeRequest = null;
                }
                if (closeRequest != null) {
                    if (closeRequest.getErrorCode() != null && closeRequest.getReason() != c3.CAMERA2_EXCEPTION) {
                        this.cameraErrorListener.a(this.cameraId, closeRequest.getErrorCode().getValue(), false);
                    }
                    this._state.setValue(new CameraStateClosing(closeRequest.getErrorCode(), null));
                    if (closeRequest.getReason() != c3.CAMERA2_CLOSED) {
                        boolean zO = o(this.camera2Quirks, this.cameraId, closeRequest.getErrorCode());
                        if (zO) {
                            synchronized (this.lock) {
                                this.shouldDelayFinalizing = true;
                                oq.i0 i0Var = oq.i0.f148189a;
                            }
                        }
                        gVar = this;
                        this.camera2DeviceCloser.b(cameraDevice2, cameraDevice, gVar, this.audioRestrictionController, zO, n(this.camera2Quirks, this.cameraId, closeRequest.getErrorCode()));
                    } else {
                        gVar = this;
                    }
                    gVar._state.setValue(j(closeRequest));
                }
            } catch (Throwable th6) {
                th4 = th6;
            }
        }
    }

    private final void i(Throwable throwable, int cameraError) throws Throwable {
        g(null, new ClosingInfo(c3.CAMERA2_EXCEPTION, 0L, h.q.o(cameraError), throwable, 2, null));
    }

    private final CameraStateClosed j(ClosingInfo closingInfo) {
        k.c0 c0Var = k.c0.f107031a;
        long jA = this.timeSource.a();
        k.b0 b0Var = this.openTimestampNanos;
        long closingTimestamp = closingInfo.getClosingTimestamp();
        k.i iVarA = b0Var != null ? k.i.a(k.i.c(b0Var.getValue() - this.attemptTimestampNanos)) : null;
        k.i iVarA2 = b0Var != null ? k.i.a(k.i.c(b0Var.getValue() - this.requestTimestampNanos)) : null;
        k.i iVarA3 = b0Var != null ? k.i.a(k.i.c(closingTimestamp - b0Var.getValue())) : null;
        long jC = k.i.c(jA - closingTimestamp);
        return new CameraStateClosed(this.cameraId, closingInfo.getReason(), Integer.valueOf(this.attemptNumber - 1), iVarA, closingInfo.getException(), iVarA2, iVarA3, k.i.a(jC), closingInfo.getErrorCode(), null);
    }

    private final boolean n(h2 h2Var, String str, h.q qVar) {
        return h2Var.d(str) && qVar == null;
    }

    private final boolean o(h2 h2Var, String str, h.q qVar) {
        return n(h2Var, str, qVar) && h2Var.c(str);
    }

    public final boolean d(long timeoutMillis) {
        return this.cameraDeviceClosed.await(timeoutMillis, TimeUnit.MILLISECONDS);
    }

    public final Object e(tq.e<? super oq.i0> eVar) {
        Object objY = mu.i.y(l(), new b(null), eVar);
        return objY == uq.b.e() ? objY : oq.i0.f148189a;
    }

    public final void f() throws Throwable {
        s2 value = this._state.getValue();
        m2 cameraDevice = value instanceof CameraStateOpen ? ((CameraStateOpen) value).getCameraDevice() : null;
        g(cameraDevice != null ? (CameraDevice) cameraDevice.c0(fr.q0.c(CameraDevice.class)) : null, new ClosingInfo(c3.APP_CLOSED, 0L, null, null, 14, null));
    }

    public final void h(Throwable throwable) throws Throwable {
        h.q.Companion companion = h.q.INSTANCE;
        int iC = companion.c(throwable);
        if (h.q.r(iC, companion.p())) {
            return;
        }
        i(throwable, iC);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCameraId() {
        return this.cameraId;
    }

    public final mu.p0<s2> l() {
        return this._state;
    }

    public final void m(CameraDevice cameraDevice) throws Throwable {
        k.h hVar = k.h.f107050a;
        Trace.beginSection(((Object) h.v.f(getCameraId())) + "#onFinalized");
        if (k.k.f107055a.a()) {
            toString();
        }
        g(cameraDevice, new ClosingInfo(c3.CAMERA2_CLOSED, 0L, null, null, 14, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) throws Throwable {
        if (!fr.t.c(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        k.k kVar = k.k.f107055a;
        if (kVar.a()) {
            h.v.f(getCameraId());
        }
        this.cameraDeviceClosed.countDown();
        synchronized (this.lock) {
            if (this.shouldDelayFinalizing) {
                if (kVar.c()) {
                    toString();
                }
            } else {
                oq.i0 i0Var = oq.i0.f148189a;
                m(cameraDevice);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) throws Throwable {
        if (!fr.t.c(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(((Object) h.v.f(getCameraId())) + "#onDisconnected");
        if (k.k.f107055a.a()) {
            h.v.f(getCameraId());
        }
        this.cameraDeviceClosed.countDown();
        g(cameraDevice, new ClosingInfo(c3.CAMERA2_DISCONNECTED, 0L, h.q.o(h.q.INSTANCE.f()), null, 10, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int errorCode) throws Throwable {
        if (!fr.t.c(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(((Object) h.v.f(getCameraId())) + "#onError-" + errorCode);
        if (k.k.f107055a.a()) {
            h.v.f(getCameraId());
        }
        this.cameraDeviceClosed.countDown();
        g(cameraDevice, new ClosingInfo(c3.CAMERA2_ERROR, 0L, h.q.o(h.q.INSTANCE.a(errorCode)), null, 10, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, errorCode);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        ClosingInfo closingInfo;
        ClosingInfo closingInfo2;
        if (!fr.t.c(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        k.c0 c0Var = k.c0.f107031a;
        long jA = this.timeSource.a();
        this.openTimestampNanos = k.b0.a(jA);
        k.h hVar = k.h.f107050a;
        Trace.beginSection(((Object) h.v.f(getCameraId())) + "#onOpened");
        if (k.k.f107055a.c()) {
            long jC = k.i.c(jA - this.requestTimestampNanos);
            long jC2 = k.i.c(jA - this.attemptTimestampNanos);
            if (this.attemptNumber == 1) {
                h.v.f(getCameraId());
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            } else {
                h.v.f(getCameraId());
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
                int unused = this.attemptNumber;
            }
        }
        synchronized (this.lock) {
            closingInfo = this.pendingClose;
            if (closingInfo == null) {
                this.opening = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (closingInfo != null) {
            x1.a(this.camera2DeviceCloser, null, cameraDevice, this, this.audioRestrictionController, o(this.camera2Quirks, this.cameraId, closingInfo.getErrorCode()), n(this.camera2Quirks, this.cameraId, closingInfo.getErrorCode()), 1, null);
            return;
        }
        AndroidCameraDevice eVar = new AndroidCameraDevice(this.metadata, cameraDevice, this.cameraId, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads, null);
        this.audioRestrictionController.b(eVar);
        this._state.setValue(new CameraStateOpen(eVar));
        synchronized (this.lock) {
            this.opening = false;
            closingInfo2 = this.pendingClose;
        }
        if (closingInfo2 != null) {
            this._state.setValue(new CameraStateClosing(closingInfo2.getErrorCode(), null));
            this.camera2DeviceCloser.b(eVar, cameraDevice, this, this.audioRestrictionController, o(this.camera2Quirks, this.cameraId, closingInfo2.getErrorCode()), n(this.camera2Quirks, this.cameraId, closingInfo2.getErrorCode()));
            this._state.setValue(j(closingInfo2));
        }
        Trace.endSection();
    }

    public String toString() {
        return "CameraState-" + this.debugId;
    }

    private g(String str, h.x xVar, int i15, long j15, k.a0 a0Var, m.d dVar, x1 x1Var, h2 h2Var, k.z zVar, n0 n0Var, CameraDevice.StateCallback stateCallback, h.w.b bVar) {
        this.cameraId = str;
        this.metadata = xVar;
        this.attemptNumber = i15;
        this.attemptTimestampNanos = j15;
        this.timeSource = a0Var;
        this.cameraErrorListener = dVar;
        this.camera2DeviceCloser = x1Var;
        this.camera2Quirks = h2Var;
        this.threads = zVar;
        this.audioRestrictionController = n0Var;
        this.interopCameraDeviceStateCallback = stateCallback;
        this.interopCaptureSessionListener = bVar;
        this.debugId = f4.a().d();
        this.lock = new Object();
        this.cameraDeviceClosed = new CountDownLatch(1);
        this._state = mu.r0.a(x2.f87599a);
        if (k.k.f107055a.c()) {
            h.v.f(getCameraId());
        }
        if (i15 != 1) {
            k.c0 c0Var = k.c0.f107031a;
            j15 = a0Var.a();
        }
        this.requestTimestampNanos = j15;
    }
}
