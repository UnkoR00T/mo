package i;

import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 *2\u00020\u0001:\u0003DB7Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b#\u0010$J7\u0010*\u001a\u00020\u001c2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0003¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u001c2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u0010\u001eJ\u0017\u00100\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010\u001eJ\u0017\u00101\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010\u001eJ\u0017\u00102\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b2\u0010\u001eJ\u0017\u00103\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00104\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b4\u0010\u001eJ\u000f\u00105\u001a\u00020\u001cH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001cH\u0016¢\u0006\u0004\b7\u00106J\r\u00108\u001a\u00020\u001c¢\u0006\u0004\b8\u00106J\r\u00109\u001a\u00020\u001c¢\u0006\u0004\b9\u00106J\u0019\u0010<\u001a\u00020\u001c2\b\b\u0002\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010HR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010KR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010NR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001f0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YRT\u0010_\u001aB\u0012\f\u0012\n \\*\u0004\u0018\u00010&0&\u0012\f\u0012\n \\*\u0004\u0018\u00010'0' \\* \u0012\f\u0012\n \\*\u0004\u0018\u00010&0&\u0012\f\u0012\n \\*\u0004\u0018\u00010'0'\u0018\u00010%0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^RT\u0010b\u001aB\u0012\f\u0012\n \\*\u0004\u0018\u00010`0`\u0012\f\u0012\n \\*\u0004\u0018\u00010'0' \\* \u0012\f\u0012\n \\*\u0004\u0018\u00010`0`\u0012\f\u0012\n \\*\u0004\u0018\u00010'0'\u0018\u00010%0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010^R\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010q\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010pR$\u0010s\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020r\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010^R$\u0010t\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010^R\u0016\u0010w\u001a\u00020u8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010}\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010|R\u0014\u0010\u007f\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010zR%\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010^R'\u0010\u0083\u0001\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\n\u0012\b0\u0081\u0001j\u0003`\u0082\u00010[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010^R-\u0010\u0088\u0001\u001a\u0004\u0018\u00010k2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010k8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0005\b~\u0010\u0087\u0001¨\u0006\u0089\u0001"}, d2 = {"Li/a3;", "Li/k2$a;", "Ll/i;", "graphListener", "Li/y2;", "captureSessionFactory", "Li/p1;", "captureSequenceProcessorFactory", "Lh/e0;", "cameraSurfaceManager", "Lk/a0;", "timeSource", "Lh/s$d;", "cameraGraphFlags", "Li/d3;", "concurrentSessionSequencer", "Lh/p1;", "streamGraph", "Lh/r1;", "strictMode", "Lk/z;", "threads", "Lju/p0;", "scope", "<init>", "(Ll/i;Li/y2;Li/p1;Lh/e0;Lk/a0;Lh/s$d;Li/d3;Lh/p1;Lh/r1;Lk/z;Lju/p0;)V", "Li/k2;", "session", "Loq/i0;", "t", "(Li/k2;)V", "", "retryAllowed", "w", "(Z)V", "B", "(Ltq/e;)Ljava/lang/Object;", "", "Lh/q1;", "Landroid/view/Surface;", "oldSurfaceMap", "newSurfaceMap", "C", "(Ljava/util/Map;Ljava/util/Map;)V", "surfaces", "u", "(Ljava/util/Map;)V", "h", "k", "f", "e", "d", "g", "i", "()V", "a", "v", "A", "", "delayMs", "y", "(J)V", "", "toString", "()Ljava/lang/String;", "Ll/i;", "b", "Li/y2;", "c", "Li/p1;", "Lh/e0;", "Lk/a0;", "Lh/s$d;", "Li/d3;", "Lh/p1;", "Lh/r1;", "j", "Lk/z;", "Lju/p0;", "", "l", "I", "debugId", "", "m", "Ljava/lang/Object;", "lock", "Liu/e;", "n", "Liu/e;", "finalized", "", "kotlin.jvm.PlatformType", "o", "Ljava/util/Map;", "activeStreamSurfaceMap", "Lh/c1;", "p", "activeOutputSurfaceMap", "Lk/b0;", "q", "Lk/b0;", "sessionCreatingTimestamp", "Li/a4;", "r", "Li/a4;", "sessionSequencer", "Li/m2;", "s", "Li/m2;", "_cameraDevice", "Li/a3$b;", "Li/a3$b;", "cameraCaptureSession", "Li/l3;", "pendingOutputMap", "pendingSurfaceMap", "Li/a3$c;", "Li/a3$c;", "state", "Ljava/util/concurrent/CountDownLatch;", "x", "Ljava/util/concurrent/CountDownLatch;", "sessionDisconnected", "Z", "hasAttemptedCaptureSession", "z", "captureSessionAttemptCompleted", "_surfaceMap", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "_surfaceTokenMap", "value", "getCameraDevice", "()Li/m2;", "(Li/m2;)V", "cameraDevice", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a3 implements k2.a {
    private static final a C = new a(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Map<h.q1, ? extends Surface> _surfaceMap;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Map<Surface, AutoCloseable> _surfaceTokenMap;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.i graphListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y2 captureSessionFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 captureSequenceProcessorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h.e0 cameraSurfaceManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.a0 timeSource;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h.s.Flags cameraGraphFlags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d3 concurrentSessionSequencer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h.p1 streamGraph;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final h.r1 strictMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int debugId = b3.a().d();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final iu.e<Boolean> finalized = iu.b.g(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<h.q1, Surface> activeStreamSurfaceMap = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map<h.c1, Surface> activeOutputSurfaceMap = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private k.b0 sessionCreatingTimestamp;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a4 sessionSequencer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private m2 _cameraDevice;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private ConfiguredCameraCaptureSession cameraCaptureSession;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Map<h.q1, ? extends l3> pendingOutputMap;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Map<h.q1, ? extends Surface> pendingSurfaceMap;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private c state;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch sessionDisconnected;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean hasAttemptedCaptureSession;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch captureSessionAttemptCompleted;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Li/a3$a;", "", "<init>", "()V", "", "CAPTURE_SESSION_TIMEOUT_MS", "J", "ABORT_CAPTURES_TIMEOUT_MS", "CLOSE_SESSION_TIMEOUT_MS", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: i.a3$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Li/a3$b;", "", "Li/k2;", "session", "Ll/m;", "processor", "Li/o1;", "captureSequenceProcessor", "<init>", "(Li/k2;Ll/m;Li/o1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li/k2;", "c", "()Li/k2;", "b", "Ll/m;", "()Ll/m;", "Li/o1;", "()Li/o1;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ConfiguredCameraCaptureSession {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k2 session;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.m processor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o1 captureSequenceProcessor;

        public ConfiguredCameraCaptureSession(k2 k2Var, l.m mVar, o1 o1Var) {
            this.session = k2Var;
            this.processor = mVar;
            this.captureSequenceProcessor = o1Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o1 getCaptureSequenceProcessor() {
            return this.captureSequenceProcessor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final l.m getProcessor() {
            return this.processor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final k2 getSession() {
            return this.session;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfiguredCameraCaptureSession)) {
                return false;
            }
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = (ConfiguredCameraCaptureSession) other;
            return fr.t.c(this.session, configuredCameraCaptureSession.session) && fr.t.c(this.processor, configuredCameraCaptureSession.processor) && fr.t.c(this.captureSequenceProcessor, configuredCameraCaptureSession.captureSequenceProcessor);
        }

        public int hashCode() {
            int iHashCode = ((this.session.hashCode() * 31) + this.processor.hashCode()) * 31;
            o1 o1Var = this.captureSequenceProcessor;
            return iHashCode + (o1Var == null ? 0 : o1Var.hashCode());
        }

        public String toString() {
            return "ConfiguredCameraCaptureSession(session=" + this.session + ", processor=" + this.processor + ", captureSequenceProcessor=" + this.captureSequenceProcessor + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Li/a3$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum c {
        PENDING,
        CREATING,
        CREATED,
        CLOSING,
        CLOSED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f86996g = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86997e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f86997e;
            if (i15 == 0) {
                oq.u.b(obj);
                a3 a3Var = a3.this;
                this.f86997e = 1;
                if (a3Var.B(this) == objE) {
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
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return a3.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86999e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f86999e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a3.x(a3.this, false, 1, null);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return a3.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87001e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87001e;
            if (i15 == 0) {
                oq.u.b(obj);
                a3 a3Var = a3.this;
                this.f87001e = 1;
                if (a3Var.B(this) == objE) {
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
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return a3.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87003e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ConfiguredCameraCaptureSession f87005g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ConfiguredCameraCaptureSession configuredCameraCaptureSession, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f87005g = configuredCameraCaptureSession;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87003e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k.h hVar = k.h.f107050a;
            String str = a3.this + " CameraCaptureSessionWrapper#close";
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.f87005g;
            a3 a3Var = a3.this;
            try {
                Trace.beginSection(str);
                if (k.k.f107055a.a()) {
                    Objects.toString(a3Var);
                }
                CON.j0.a(configuredCameraCaptureSession.getSession());
                oq.i0 i0Var = oq.i0.f148189a;
                return oq.i0.f148189a;
            } finally {
                Trace.endSection();
            }
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return a3.this.new g(this.f87005g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((g) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87006e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87006e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a3.this.captureSessionAttemptCompleted.await();
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return a3.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((h) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87008e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l.m f87010g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(l.m mVar, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f87010g = mVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87008e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k.h hVar = k.h.f107050a;
            String str = a3.this + " stopRepeating";
            l.m mVar = this.f87010g;
            try {
                Trace.beginSection(str);
                mVar.f();
                oq.i0 i0Var = oq.i0.f148189a;
                Trace.endSection();
                String str2 = a3.this + " abortCaptures";
                l.m mVar2 = this.f87010g;
                try {
                    Trace.beginSection(str2);
                    mVar2.a();
                    return oq.i0.f148189a;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return a3.this.new i(this.f87010g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((i) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f87012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f87013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3 f87014h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j15, a3 a3Var, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f87013g = j15;
            this.f87014h = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            Object objE = uq.b.e();
            int i15 = this.f87011e;
            if (i15 == 0) {
                oq.u.b(obj);
                ju.p0 p0Var = (ju.p0) this.f87012f;
                if (k.k.f107055a.a()) {
                    Objects.toString(p0Var);
                }
                long j15 = this.f87013g;
                this.f87011e = 1;
                if (ju.z0.b(j15, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            this.f87014h.y(0L);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((j) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = new j(this.f87013g, this.f87014h, eVar);
            jVar.f87012f = obj;
            return jVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87017f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87019h;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87017f = obj;
            this.f87019h |= PKIFailureInfo.systemUnavail;
            return a3.this.B(this);
        }
    }

    public a3(l.i iVar, y2 y2Var, p1 p1Var, h.e0 e0Var, k.a0 a0Var, h.s.Flags flags, d3 d3Var, h.p1 p1Var2, h.r1 r1Var, k.z zVar, ju.p0 p0Var) {
        this.graphListener = iVar;
        this.captureSessionFactory = y2Var;
        this.captureSequenceProcessorFactory = p1Var;
        this.cameraSurfaceManager = e0Var;
        this.timeSource = a0Var;
        this.cameraGraphFlags = flags;
        this.concurrentSessionSequencer = d3Var;
        this.streamGraph = p1Var2;
        this.strictMode = r1Var;
        this.threads = zVar;
        this.scope = p0Var;
        this.sessionSequencer = d3Var != null ? new a4(d3Var) : null;
        this.state = c.PENDING;
        this.sessionDisconnected = new CountDownLatch(1);
        this.captureSessionAttemptCompleted = new CountDownLatch(1);
        this._surfaceTokenMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:111:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:61:0x011f, B:63:0x0125, B:66:0x012b, B:68:0x012f, B:70:0x0154, B:72:0x015a, B:75:0x017f, B:77:0x0185, B:78:0x0192, B:80:0x0198, B:82:0x01a8, B:85:0x01b7, B:87:0x01c1, B:88:0x01c3, B:92:0x01cc, B:93:0x01e8, B:94:0x01e9, B:96:0x01ef, B:97:0x01f9), top: B:111:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0154 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:61:0x011f, B:63:0x0125, B:66:0x012b, B:68:0x012f, B:70:0x0154, B:72:0x015a, B:75:0x017f, B:77:0x0185, B:78:0x0192, B:80:0x0198, B:82:0x01a8, B:85:0x01b7, B:87:0x01c1, B:88:0x01c3, B:92:0x01cc, B:93:0x01e8, B:94:0x01e9, B:96:0x01ef, B:97:0x01f9), top: B:111:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x015a A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:61:0x011f, B:63:0x0125, B:66:0x012b, B:68:0x012f, B:70:0x0154, B:72:0x015a, B:75:0x017f, B:77:0x0185, B:78:0x0192, B:80:0x0198, B:82:0x01a8, B:85:0x01b7, B:87:0x01c1, B:88:0x01c3, B:92:0x01cc, B:93:0x01e8, B:94:0x01e9, B:96:0x01ef, B:97:0x01f9), top: B:111:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0185 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:61:0x011f, B:63:0x0125, B:66:0x012b, B:68:0x012f, B:70:0x0154, B:72:0x015a, B:75:0x017f, B:77:0x0185, B:78:0x0192, B:80:0x0198, B:82:0x01a8, B:85:0x01b7, B:87:0x01c1, B:88:0x01c3, B:92:0x01cc, B:93:0x01e8, B:94:0x01e9, B:96:0x01ef, B:97:0x01f9), top: B:111:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0198 A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:61:0x011f, B:63:0x0125, B:66:0x012b, B:68:0x012f, B:70:0x0154, B:72:0x015a, B:75:0x017f, B:77:0x0185, B:78:0x0192, B:80:0x0198, B:82:0x01a8, B:85:0x01b7, B:87:0x01c1, B:88:0x01c3, B:92:0x01cc, B:93:0x01e8, B:94:0x01e9, B:96:0x01ef, B:97:0x01f9), top: B:111:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc A[Catch: all -> 0x017c, TRY_ENTER, TryCatch #1 {all -> 0x017c, blocks: (B:61:0x011f, B:63:0x0125, B:66:0x012b, B:68:0x012f, B:70:0x0154, B:72:0x015a, B:75:0x017f, B:77:0x0185, B:78:0x0192, B:80:0x0198, B:82:0x01a8, B:85:0x01b7, B:87:0x01c1, B:88:0x01c3, B:92:0x01cc, B:93:0x01e8, B:94:0x01e9, B:96:0x01ef, B:97:0x01f9), top: B:111:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef A[Catch: all -> 0x017c, TryCatch #1 {all -> 0x017c, blocks: (B:61:0x011f, B:63:0x0125, B:66:0x012b, B:68:0x012f, B:70:0x0154, B:72:0x015a, B:75:0x017f, B:77:0x0185, B:78:0x0192, B:80:0x0198, B:82:0x01a8, B:85:0x01b7, B:87:0x01c1, B:88:0x01c3, B:92:0x01cc, B:93:0x01e8, B:94:0x01e9, B:96:0x01ef, B:97:0x01f9), top: B:111:0x011f }] */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x00fe, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01cc, please report this as an issue */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.Map<h.q1, ? extends android.view.Surface>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, i.m2] */
    public final Object B(tq.e<? super oq.i0> eVar) throws Throwable {
        k kVar;
        fr.p0 p0Var;
        fr.p0 p0Var2;
        fr.p0 p0Var3;
        fr.p0 p0Var4;
        k.k kVar2;
        m2 m2Var;
        String cameraId;
        y2.a aVarA;
        c cVar;
        Map<h.q1, l3> mapA;
        Map<h.q1, ? extends Surface> map;
        LinkedHashMap linkedHashMap;
        m2 m2Var2;
        String cameraId2;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f87019h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f87019h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object obj = kVar.f87017f;
        Object objE = uq.b.e();
        int i16 = kVar.f87019h;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                p0Var = new fr.p0();
                p0Var2 = new fr.p0();
                synchronized (this.lock) {
                    if (this.state != c.PENDING) {
                        return oq.i0.f148189a;
                    }
                    p0Var.f66410a = this._surfaceMap;
                    ?? r15 = this._cameraDevice;
                    p0Var2.f66410a = r15;
                    if (p0Var.f66410a != 0 && r15 != 0) {
                        this.state = c.CREATING;
                        this.hasAttemptedCaptureSession = true;
                        k.c0 c0Var = k.c0.f107031a;
                        this.sessionCreatingTimestamp = k.b0.a(this.timeSource.a());
                        oq.i0 i0Var = oq.i0.f148189a;
                        a4 a4Var = this.sessionSequencer;
                        if (a4Var != null) {
                            k.k.f107055a.a();
                            kVar.f87015d = p0Var;
                            kVar.f87016e = p0Var2;
                            kVar.f87019h = 1;
                            if (a4Var.a(kVar) == objE) {
                                return objE;
                            }
                            p0Var3 = p0Var;
                            p0Var4 = p0Var2;
                        }
                        kVar2 = k.k.f107055a;
                        if (kVar2.c()) {
                            m2Var2 = (m2) p0Var2.f66410a;
                            if (m2Var2 != null) {
                                cameraId2 = m2Var2.getCameraId();
                            } else {
                                cameraId2 = null;
                            }
                            if (cameraId2 != null) {
                                h.v.f(cameraId2);
                            }
                            toString();
                            Objects.toString(p0Var.f66410a);
                        }
                        k.h hVar = k.h.f107050a;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("CameraDevice-");
                        m2Var = (m2) p0Var2.f66410a;
                        if (m2Var != null) {
                            cameraId = m2Var.getCameraId();
                        } else {
                            cameraId = null;
                        }
                        sb5.append(cameraId);
                        sb5.append("#createCaptureSession");
                        Trace.beginSection(sb5.toString());
                        aVarA = this.captureSessionFactory.a((m2) p0Var2.f66410a, (Map) p0Var.f66410a, this);
                        Trace.endSection();
                        if (!(aVarA instanceof y2.a.Success)) {
                            if (kVar2.b()) {
                                io.sentry.android.core.c2.e("CXCP", "Failed to create capture session for " + this + '!');
                            }
                            return oq.i0.f148189a;
                        }
                        synchronized (this.lock) {
                            try {
                                cVar = this.state;
                                if (cVar != c.CLOSING && cVar != c.CLOSED) {
                                    if (cVar == c.CREATING) {
                                        throw new IllegalStateException(("Unexpected state: " + this.state).toString());
                                    }
                                    this.state = c.CREATED;
                                    this.activeStreamSurfaceMap.putAll((Map) p0Var.f66410a);
                                    this.activeOutputSurfaceMap.putAll(((y2.a.Success) aVarA).b());
                                    mapA = ((y2.a.Success) aVarA).a();
                                    if (!mapA.isEmpty()) {
                                        if (kVar2.c()) {
                                            toString();
                                            Objects.toString(pq.v.f1(((Map) p0Var.f66410a).keySet()));
                                            Objects.toString(pq.v.f1(mapA.keySet()));
                                        }
                                        this.pendingOutputMap = mapA;
                                        map = this._surfaceMap;
                                        if (map != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry<h.q1, ? extends Surface> entry : map.entrySet()) {
                                                if (mapA.containsKey(entry.getKey())) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        if (linkedHashMap != null && linkedHashMap.size() == mapA.size()) {
                                            this.pendingSurfaceMap = linkedHashMap;
                                        }
                                    }
                                    oq.i0 i0Var2 = oq.i0.f148189a;
                                    t(null);
                                    return oq.i0.f148189a;
                                }
                                if (kVar2.c()) {
                                    toString();
                                    Objects.toString(this.state);
                                }
                                return oq.i0.f148189a;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    return oq.i0.f148189a;
                }
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var4 = (fr.p0) kVar.f87016e;
            p0Var3 = (fr.p0) kVar.f87015d;
            oq.u.b(obj);
            Trace.beginSection(sb5.toString());
            aVarA = this.captureSessionFactory.a((m2) p0Var2.f66410a, (Map) p0Var.f66410a, this);
            Trace.endSection();
            if (!(aVarA instanceof y2.a.Success)) {
                if (kVar2.b()) {
                    io.sentry.android.core.c2.e("CXCP", "Failed to create capture session for " + this + '!');
                }
                return oq.i0.f148189a;
            }
            synchronized (this.lock) {
                cVar = this.state;
                if (cVar != c.CLOSING) {
                    if (cVar == c.CREATING) {
                        throw new IllegalStateException(("Unexpected state: " + this.state).toString());
                    }
                    this.state = c.CREATED;
                    this.activeStreamSurfaceMap.putAll((Map) p0Var.f66410a);
                    this.activeOutputSurfaceMap.putAll(((y2.a.Success) aVarA).b());
                    mapA = ((y2.a.Success) aVarA).a();
                    if (!mapA.isEmpty()) {
                        if (kVar2.c()) {
                            toString();
                            Objects.toString(pq.v.f1(((Map) p0Var.f66410a).keySet()));
                            Objects.toString(pq.v.f1(mapA.keySet()));
                        }
                        this.pendingOutputMap = mapA;
                        map = this._surfaceMap;
                        if (map != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r8.hasNext()) {
                                if (mapA.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            this.pendingSurfaceMap = linkedHashMap;
                        }
                    }
                    oq.i0 i0Var3 = oq.i0.f148189a;
                    t(null);
                    return oq.i0.f148189a;
                }
                if (kVar2.c()) {
                    toString();
                    Objects.toString(this.state);
                }
                return oq.i0.f148189a;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
        p0Var = p0Var3;
        p0Var2 = p0Var4;
        kVar2 = k.k.f107055a;
        if (kVar2.c()) {
            m2Var2 = (m2) p0Var2.f66410a;
            if (m2Var2 != null) {
                cameraId2 = m2Var2.getCameraId();
            } else {
                cameraId2 = null;
            }
            if (cameraId2 != null) {
                h.v.f(cameraId2);
            }
            toString();
            Objects.toString(p0Var.f66410a);
        }
        k.h hVar2 = k.h.f107050a;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("CameraDevice-");
        m2Var = (m2) p0Var2.f66410a;
        if (m2Var != null) {
            cameraId = m2Var.getCameraId();
        } else {
            cameraId = null;
        }
        sb6.append(cameraId);
        sb6.append("#createCaptureSession");
    }

    private final void C(Map<h.q1, ? extends Surface> oldSurfaceMap, Map<h.q1, ? extends Surface> newSurfaceMap) throws Exception {
        Set setK1 = pq.v.k1(oldSurfaceMap.values());
        Set setK2 = pq.v.k1(newSurfaceMap.values());
        for (Surface surface : pq.e1.j(setK1, setK2)) {
            AutoCloseable autoCloseableRemove = this._surfaceTokenMap.remove(surface);
            if (autoCloseableRemove != null) {
                CON.j0.a(autoCloseableRemove);
            } else {
                autoCloseableRemove = null;
            }
            if (autoCloseableRemove == null) {
                throw new IllegalStateException(("Surface " + surface + " doesn't have a matching surface token!").toString());
            }
        }
        for (Surface surface2 : pq.e1.j(setK2, setK1)) {
            this._surfaceTokenMap.put(surface2, this.cameraSurfaceManager.d(surface2));
        }
    }

    private final void t(k2 session) {
        synchronized (this.lock) {
            try {
                ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
                if (configuredCameraCaptureSession == null && session != null) {
                    h.h0<?, ?> h0VarA = this.captureSequenceProcessorFactory.a(session, this.activeStreamSurfaceMap, this.activeOutputSurfaceMap);
                    configuredCameraCaptureSession = h0VarA instanceof o1 ? new ConfiguredCameraCaptureSession(session, l.m.INSTANCE.a(h0VarA), (o1) h0VarA) : new ConfiguredCameraCaptureSession(session, l.m.INSTANCE.a(h0VarA), null);
                    this.cameraCaptureSession = configuredCameraCaptureSession;
                }
                if (this.state == c.CREATED && configuredCameraCaptureSession != null) {
                    boolean z15 = (this.pendingOutputMap == null || this.pendingSurfaceMap == null) ? false : true;
                    oq.i0 i0Var = oq.i0.f148189a;
                    if (z15) {
                        w(false);
                    }
                    synchronized (this.lock) {
                        try {
                            if (k.k.f107055a.c()) {
                                k.c0 c0Var = k.c0.f107031a;
                                long jC = k.i.c(this.timeSource.a() - this.sessionCreatingTimestamp.getValue());
                                toString();
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                            }
                            this.graphListener.i(configuredCameraCaptureSession.getProcessor());
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private final void w(boolean retryAllowed) {
        ConfiguredCameraCaptureSession configuredCameraCaptureSession;
        Map<h.q1, ? extends l3> map;
        Map<h.q1, ? extends Surface> map2;
        boolean z15;
        synchronized (this.lock) {
            configuredCameraCaptureSession = this.cameraCaptureSession;
            map = this.pendingOutputMap;
            map2 = this.pendingSurfaceMap;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        if (configuredCameraCaptureSession == null || map == null || map2 == null) {
            return;
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        k.c0 c0Var = k.c0.f107031a;
        long jA = this.timeSource.a();
        for (Map.Entry<h.q1, ? extends l3> entry : map.entrySet()) {
            int value = entry.getKey().getValue();
            l3 value2 = entry.getValue();
            Surface surface = map2.get(h.q1.a(value));
            if (surface == null) {
                throw new IllegalStateException("Required value was null.");
            }
            value2.u(surface);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<h.q1, ? extends l3>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getValue());
        }
        configuredCameraCaptureSession.getSession().L1(pq.v.f1(linkedHashSet));
        synchronized (this.lock) {
            try {
                if (this.state == c.CREATED) {
                    this.activeStreamSurfaceMap.putAll(map2);
                    Iterator<Map.Entry<h.q1, ? extends Surface>> it4 = map2.entrySet().iterator();
                    while (true) {
                        z15 = true;
                        if (!it4.hasNext()) {
                            if (!k.k.f107055a.c()) {
                                break;
                            }
                            k.c0 c0Var2 = k.c0.f107031a;
                            long jC = k.i.c(this.timeSource.a() - jA);
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator<Map.Entry<h.q1, ? extends l3>> it5 = map.entrySet().iterator();
                            while (it5.hasNext()) {
                                arrayList.add(h.q1.a(it5.next().getKey().getValue()));
                            }
                            arrayList.toString();
                            toString();
                            k.c0 c0Var3 = k.c0.f107031a;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                            break;
                        }
                        Map.Entry<h.q1, ? extends Surface> next = it4.next();
                        int value3 = next.getKey().getValue();
                        Surface value4 = next.getValue();
                        h.c0 c0VarH = this.streamGraph.h(value3);
                        if (c0VarH == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (c0VarH.b().size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        this.activeOutputSurfaceMap.put(h.c1.a(((h.e1) pq.v.P0(c0VarH.b())).getId()), value4);
                    }
                } else {
                    z15 = false;
                }
                oq.i0 i0Var2 = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15 && retryAllowed) {
            this.graphListener.h(configuredCameraCaptureSession.getProcessor());
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
    }

    static /* synthetic */ void x(a3 a3Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        a3Var.w(z15);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    public final void A() {
        long j15;
        boolean z15;
        v();
        synchronized (this.lock) {
            try {
                c cVar = this.state;
                c cVar2 = c.CLOSED;
                j15 = 0;
                if (cVar != cVar2) {
                    z15 = true;
                    if (this._cameraDevice != null && this.hasAttemptedCaptureSession) {
                        int finalizeSessionOnCloseBehavior = this.cameraGraphFlags.getFinalizeSessionOnCloseBehavior();
                        h.s.Flags.a.Companion companion = h.s.Flags.a.INSTANCE;
                        if (!h.s.Flags.a.e(finalizeSessionOnCloseBehavior, companion.a())) {
                            if (h.s.Flags.a.e(finalizeSessionOnCloseBehavior, companion.c())) {
                                j15 = 2000;
                            } else {
                                z15 = false;
                            }
                        }
                    }
                } else {
                    z15 = false;
                }
                this._cameraDevice = null;
                this.state = cVar2;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            y(j15);
        }
    }

    @Override // i.b4
    public void a() throws Exception {
        if (this.finalized.a(Boolean.FALSE, Boolean.TRUE)) {
            if (k.k.f107055a.a()) {
                toString();
            }
            k.h hVar = k.h.f107050a;
            Trace.beginSection(this + "#onSessionFinalized");
            A();
            y(0L);
            Trace.endSection();
        }
    }

    @Override // i.k2.a
    public void d(k2 session) {
        if (k.k.f107055a.a()) {
            toString();
        }
    }

    @Override // i.k2.a
    public void e(k2 session) {
        if (k.k.f107055a.a()) {
            toString();
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(this + "#configure");
        t(session);
        this.captureSessionAttemptCompleted.countDown();
        a4 a4Var = this.sessionSequencer;
        if (a4Var != null) {
            a4Var.b();
        }
        Trace.endSection();
    }

    @Override // i.k2.a
    public void f(k2 session) {
        if (k.k.f107055a.d()) {
            io.sentry.android.core.c2.g("CXCP", this + " Configuration Failed");
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(this + "#onConfigureFailed");
        this.graphListener.d(new h.t0.a(h.q.INSTANCE.m(), false, null));
        A();
        this.captureSessionAttemptCompleted.countDown();
        a4 a4Var = this.sessionSequencer;
        if (a4Var != null) {
            a4Var.b();
        }
        Trace.endSection();
    }

    @Override // i.k2.a
    public void g(k2 session) {
        if (k.k.f107055a.a()) {
            toString();
        }
    }

    @Override // i.k2.a
    public void h(k2 session) {
        if (k.k.f107055a.a()) {
            toString();
        }
    }

    @Override // i.b4
    public void i() {
        if (k.k.f107055a.a()) {
            toString();
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(this + "#onSessionDisconnected");
        v();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.sessionDisconnected.await();
            oq.i0 i0Var = oq.i0.f148189a;
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // i.k2.a
    public void k(k2 session) {
        if (k.k.f107055a.a()) {
            toString();
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(this + "#onClosed");
        A();
        this.captureSessionAttemptCompleted.countDown();
        a4 a4Var = this.sessionSequencer;
        if (a4Var != null) {
            a4Var.b();
        }
        Trace.endSection();
    }

    public String toString() {
        return "CaptureSessionState-" + this.debugId;
    }

    public final void u(Map<h.q1, ? extends Surface> surfaces) {
        synchronized (this.lock) {
            try {
                c cVar = this.state;
                if (cVar != c.CLOSING && cVar != c.CLOSED) {
                    Map<h.q1, ? extends Surface> mapI = this._surfaceMap;
                    if (mapI == null) {
                        mapI = pq.v0.i();
                    }
                    C(mapI, surfaces);
                    this._surfaceMap = surfaces;
                    Map<h.q1, ? extends l3> map = this.pendingOutputMap;
                    if (map != null && this.pendingSurfaceMap == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<h.q1, ? extends Surface> entry : surfaces.entrySet()) {
                            if (map.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map.size()) {
                            this.pendingSurfaceMap = linkedHashMap;
                            ju.k.d(this.scope, null, null, new e(null), 3, null);
                        }
                    }
                    ju.k.d(this.scope, null, null, new f(null), 3, null);
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void v() {
        synchronized (this.lock) {
            try {
                c cVar = this.state;
                c cVar2 = c.CLOSING;
                if (cVar != cVar2 && cVar != c.CLOSED) {
                    this.state = cVar2;
                    ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
                    boolean z15 = false;
                    if (configuredCameraCaptureSession != null) {
                        this.cameraCaptureSession = null;
                    } else {
                        if (this.cameraGraphFlags.getCloseCaptureSessionOnDisconnect() && this.hasAttemptedCaptureSession) {
                            z15 = true;
                        }
                        configuredCameraCaptureSession = null;
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                    a4 a4Var = this.sessionSequencer;
                    if (a4Var != null) {
                        a4Var.b();
                    }
                    if (z15) {
                        k.k kVar = k.k.f107055a;
                        kVar.a();
                        if (((oq.i0) this.threads.n(3000L, new h(null))) == null && kVar.b()) {
                            io.sentry.android.core.c2.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.lock) {
                            configuredCameraCaptureSession = this.cameraCaptureSession;
                            this.cameraCaptureSession = null;
                        }
                    }
                    k.h hVar = k.h.f107050a;
                    Trace.beginSection(this.graphListener + "#onGraphStopping");
                    this.graphListener.a();
                    Trace.endSection();
                    if (configuredCameraCaptureSession != null) {
                        l.m processor = configuredCameraCaptureSession.getProcessor();
                        k.k kVar2 = k.k.f107055a;
                        if (kVar2.a()) {
                            toString();
                        }
                        Trace.beginSection(this + "#shutdown");
                        if (this.cameraGraphFlags.getAbortCapturesOnStop() && ((oq.i0) this.threads.n(2000L, new i(processor, null))) == null && kVar2.b()) {
                            io.sentry.android.core.c2.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        o1 captureSequenceProcessor = configuredCameraCaptureSession.getCaptureSequenceProcessor();
                        if (captureSequenceProcessor != null) {
                            captureSequenceProcessor.n();
                        }
                        Trace.endSection();
                        if (this.cameraGraphFlags.getCloseCaptureSessionOnDisconnect() && ((oq.i0) this.threads.n(3000L, new g(configuredCameraCaptureSession, null))) == null && kVar2.b()) {
                            io.sentry.android.core.c2.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.graphListener + "#onGraphStopped");
                        this.graphListener.k(processor);
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.graphListener + "#onGraphStopped");
                        this.graphListener.k(null);
                        Trace.endSection();
                    }
                    this.sessionDisconnected.countDown();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void y(long delayMs) throws Exception {
        List listF1;
        if (delayMs != 0) {
            ju.k.d(this.scope, null, null, new j(delayMs, this, null), 3, null);
            return;
        }
        if (k.k.f107055a.a()) {
            toString();
        }
        synchronized (this.lock) {
            listF1 = pq.v.f1(this._surfaceTokenMap.values());
            this._surfaceTokenMap.clear();
        }
        Iterator it = listF1.iterator();
        while (it.hasNext()) {
            CON.j0.a((AutoCloseable) it.next());
        }
    }

    public final void z(m2 m2Var) {
        synchronized (this.lock) {
            try {
                c cVar = this.state;
                if (cVar != c.CLOSING && cVar != c.CLOSED) {
                    this._cameraDevice = m2Var;
                    if (m2Var != null) {
                        ju.k.d(this.scope, null, null, new d(null), 3, null);
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
