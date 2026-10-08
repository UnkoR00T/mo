package l;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import fr.p0;
import h.Result3A;
import h.m0;
import h.q0;
import h.r0;
import h.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ju.h2;
import ju.w0;
import ju.z;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u0000 a2\u00020\u0001:\u0001YB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ]\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJi\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b$\u0010%J=\u0010+\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010*0\f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b+\u0010,J=\u00100\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010*0\f2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u0010,J+\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u00104J=\u00108\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010*0\f2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u0010,J?\u0010A\u001a\u00020@2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bA\u0010BJy\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u00109\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010*2\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010*2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010*¢\u0006\u0004\bG\u0010HJÎ\u0001\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010*2\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010*2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010*2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0016\b\u0002\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0004\bL\u0010MJe\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bO\u0010PJ;\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010Q\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bR\u0010SJ\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\bT\u0010\u001dJ\u0013\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\bU\u0010VJ\u001f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u00109\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010^R\u001e\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010_¨\u0006b"}, d2 = {"Ll/f;", "", "Ll/k;", "graphProcessor", "Lh/x;", "metadata", "Ll/o;", "graphState3A", "Ll/q;", "graphListener3A", "<init>", "(Ll/k;Lh/x;Ll/o;Ll/q;)V", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "triggerCondition", "Lkotlin/Function1;", "Lh/q0;", "", "lockedCondition", "", "frameLimit", "", "timeLimitNs", "Lju/w0;", "Lh/m1;", "j", "(Ljava/util/Map;Ler/l;IJ)Lju/w0;", "cancelAf", "q", "(Z)Lju/w0;", "Lh/z0;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "Lh/a;", "afTriggerStartAeMode", "l", "(Lh/z0;Lh/z0;Lh/z0;Lh/a;Ler/l;Ljava/lang/Integer;Ljava/lang/Long;)Lju/w0;", "waitForAeToConverge", "waitForAfToConverge", "waitForAwbToConverge", "Landroid/hardware/camera2/CaptureResult$Key;", "", "c", "(ZZZ)Ljava/util/Map;", "waitForAeToLock", "waitForAfToLock", "waitForAwbToLock", "g", "isAfTriggered", "waitForAwb", "e", "(ZZ)Ler/l;", "ae", "af", "awb", "h", "aeMode", "Lh/b;", "afMode", "Lh/d;", "awbMode", "Lh/m0;", "flashMode", "Ll/t;", "d", "(Lh/a;Lh/b;Lh/d;Lh/m0;)Ll/t;", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "r", "(Lh/a;Lh/b;Lh/d;Lh/m0;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lju/w0;", "convergedCondition", "convergedTimeLimitNs", "lockedTimeLimitNs", "i", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lh/z0;Lh/z0;Lh/z0;Lh/a;Ler/l;Ler/l;ILjava/lang/Long;Ljava/lang/Long;Ltq/e;)Ljava/lang/Object;", "unlockedCondition", "o", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ler/l;ILjava/lang/Long;)Lju/w0;", "triggerAf", "k", "(ZZIJ)Lju/w0;", "p", "n", "()Lju/w0;", "m", "(Lh/a;)Lju/w0;", "a", "Ll/k;", "b", "Lh/x;", "Ll/o;", "Ll/q;", "Lju/w0;", "lastUpdate3AResult", "f", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {
    private static final Map<CaptureRequest.Key<?>, Object> A;
    private static final er.l<q0, Boolean> B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<Integer> f113754g = pq.v.q(2, 4, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<Integer> f113755h = pq.v.q(2, 3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<Integer> f113756i = pq.v.q(2, 6, 4, 5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<Integer> f113757j = pq.v.e(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final List<Integer> f113758k = pq.v.e(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<Integer> f113759l = pq.v.q(4, 5);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List<Integer> f113760m = pq.v.q(2, 4, 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List<Integer> f113761n = pq.v.q(2, 3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map<CaptureRequest.Key<?>, Object> f113762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Map<CaptureRequest.Key<?>, Object> f113763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map<CaptureRequest.Key<?>, Object> f113764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Map<CaptureRequest.Key<?>, Object> f113765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ju.x<Result3A> f113766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List<Integer> f113767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<Integer> f113768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List<Integer> f113769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map<CaptureRequest.Key<Boolean>, Boolean> f113770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map<? extends CaptureRequest.Key<? extends Object>, Object> f113771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Map<CaptureRequest.Key<?>, Object> f113772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Map<CaptureRequest.Key<?>, Object> f113773z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k graphProcessor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.x metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o graphState3A;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q graphListener3A;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private w0<Result3A> lastUpdate3AResult;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f113782g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f113783h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f113784j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f113785k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f113786l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f113787m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f113789p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113787m = obj;
            this.f113789p |= PKIFailureInfo.systemUnavail;
            return f.this.i(null, null, null, null, null, null, null, null, null, 0, null, null, this);
        }
    }

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        f113762o = v0.f(oq.y.a(key, 1));
        f113763p = v0.f(oq.y.a(key, 2));
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        f113764q = v0.f(oq.y.a(key2, 1));
        f113765r = v0.l(oq.y.a(key, 1), oq.y.a(key2, 1));
        f113766s = z.a(new Result3A(Result3A.a.INSTANCE.d(), null, 2, null));
        f113767t = pq.v.q(0, 1, 2, 4);
        List<Integer> listQ = pq.v.q(0, 3, 1, 2, 6);
        f113768u = listQ;
        f113769v = pq.v.q(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        f113770w = v0.f(oq.y.a(key3, bool));
        f113771x = v0.l(oq.y.a(key, 2), oq.y.a(key3, bool));
        f113772y = v0.f(oq.y.a(key3, Boolean.FALSE));
        f113773z = v0.f(oq.y.a(key2, 2));
        A = v0.l(oq.y.a(key, 2), oq.y.a(key2, 2));
        B = v.b(v0.f(oq.y.a(CaptureResult.CONTROL_AF_STATE, listQ)));
    }

    public f(k kVar, h.x xVar, o oVar, q qVar) {
        this.graphProcessor = kVar;
        this.metadata = xVar;
        this.graphState3A = oVar;
        this.graphListener3A = qVar;
    }

    private final Map<CaptureResult.Key<?>, List<Object>> c(boolean waitForAeToConverge, boolean waitForAfToConverge, boolean waitForAwbToConverge) {
        if (!waitForAeToConverge && !waitForAfToConverge && !waitForAwbToConverge) {
            return v0.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (waitForAeToConverge) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, f113754g);
        }
        if (waitForAwbToConverge) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, f113755h);
        }
        if (waitForAfToConverge) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, f113756i);
        }
        return linkedHashMap;
    }

    private final t d(h.a aeMode, h.b afMode, h.d awbMode, m0 flashMode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aeMode != null) {
        }
        if (afMode != null) {
        }
        if (awbMode != null) {
        }
        if (flashMode != null) {
        }
        return new t(v0.u(linkedHashMap), (Integer) null, (Long) null, 6, (fr.k) null);
    }

    private final er.l<q0, Boolean> e(final boolean isAfTriggered, final boolean waitForAwb) {
        return new er.l() { // from class: l.e
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(f.f(waitForAwb, isAfTriggered, (q0) obj));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public static final boolean f(boolean z15, boolean z16, q0 q0Var) {
        boolean zC0;
        boolean zB;
        Integer num = (Integer) q0Var.I(CaptureResult.CONTROL_AF_MODE);
        if (num != null) {
            int iC = h.b.c(num.intValue());
            if (!h.b.g(iC)) {
                zC0 = true;
            } else if (z16) {
                zC0 = g.b(q0Var.I(CaptureResult.CONTROL_AF_STATE), f113759l);
            } else if (h.b.f(iC)) {
                zC0 = pq.v.c0(f113756i, q0Var.I(CaptureResult.CONTROL_AF_STATE));
            } else {
                zC0 = true;
            }
        } else {
            zC0 = false;
        }
        Integer num2 = (Integer) q0Var.I(CaptureResult.CONTROL_AE_MODE);
        boolean z17 = num2 != null && (!h.a.i(h.a.e(num2.intValue())) || g.b(q0Var.I(CaptureResult.CONTROL_AE_STATE), f113760m));
        Integer num3 = (Integer) q0Var.I(CaptureResult.CONTROL_AWB_MODE);
        int iC2 = h.d.c(num3 != null ? num3.intValue() : 0);
        if (z15 && num3 == null) {
            zB = false;
        } else {
            zB = (z15 && h.d.f(iC2)) ? g.b(q0Var.I(CaptureResult.CONTROL_AWB_STATE), f113761n) : true;
        }
        if (k.k.f107055a.a()) {
            r0.f(q0Var.Y0());
        }
        return z17 && zC0 && zB;
    }

    private final Map<CaptureResult.Key<?>, List<Object>> g(boolean waitForAeToLock, boolean waitForAfToLock, boolean waitForAwbToLock) {
        if (!waitForAeToLock && !waitForAfToLock && !waitForAwbToLock) {
            return v0.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (waitForAeToLock) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, f113757j);
        }
        if (waitForAfToLock) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, f113759l);
        }
        if (waitForAwbToLock) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, f113758k);
        }
        return linkedHashMap;
    }

    private final Map<CaptureResult.Key<?>, List<Object>> h(boolean ae5, boolean af4, boolean awb) {
        if (!ae5 && !af4 && !awb) {
            return v0.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (ae5) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, f113767t);
        }
        if (af4) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, f113768u);
        }
        if (awb) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, f113769v);
        }
        return linkedHashMap;
    }

    private final w0<Result3A> j(Map<CaptureRequest.Key<?>, ? extends Object> triggerCondition, er.l<? super q0, Boolean> lockedCondition, int frameLimit, long timeLimitNs) {
        if (this.graphProcessor.g() == null) {
            return f113766s;
        }
        if (triggerCondition == null) {
            triggerCondition = f113765r;
        }
        Iterator<Map.Entry<CaptureRequest.Key<?>, ? extends Object>> it = triggerCondition.entrySet().iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            if (fr.t.c(it.next().getValue(), 1)) {
                z15 = true;
            }
        }
        if (lockedCondition == null) {
            lockedCondition = e(z15, false);
        }
        t tVar = new t(lockedCondition, Integer.valueOf(frameLimit), Long.valueOf(timeLimitNs));
        this.graphListener3A.g(tVar);
        k.k.f107055a.a();
        if (this.graphProcessor.l(triggerCondition)) {
            this.graphProcessor.j(this.graphState3A.b());
            return tVar.b();
        }
        this.graphListener3A.i(tVar);
        return f113766s;
    }

    private final w0<Result3A> l(z0 aeLockBehavior, z0 afLockBehavior, z0 awbLockBehavior, h.a afTriggerStartAeMode, er.l<? super q0, Boolean> lockedCondition, Integer frameLimit, Long timeLimitNs) {
        w0<Result3A> w0VarB;
        h.a aVar = null;
        Boolean bool = aeLockBehavior == null ? null : Boolean.TRUE;
        Boolean bool2 = awbLockBehavior == null ? null : Boolean.TRUE;
        Map<CaptureResult.Key<?>, List<Object>> mapG = g(bool != null, afLockBehavior != null, bool2 != null);
        if (lockedCondition == null && mapG.isEmpty()) {
            w0VarB = null;
        } else {
            t tVar = new t(lockedCondition == null ? v.b(mapG) : lockedCondition, frameLimit, timeLimitNs);
            this.graphListener3A.g(tVar);
            o.d(this.graphState3A, null, null, null, null, null, null, null, bool, null, bool2, 383, null);
            k.k.f107055a.a();
            this.graphProcessor.j(this.graphState3A.b());
            w0VarB = tVar.b();
        }
        if (afLockBehavior != null) {
            if (afTriggerStartAeMode != null) {
                int value = afTriggerStartAeMode.getValue();
                h.a aeMode = this.graphState3A.a().getAeMode();
                o.d(this.graphState3A, h.a.d(value), null, null, null, null, null, null, null, null, null, 1022, null);
                this.graphProcessor.j(this.graphState3A.b());
                aVar = aeMode;
            }
            k.k.f107055a.a();
            if (!this.graphProcessor.l(f113762o)) {
                return f113766s;
            }
            o.d(this.graphState3A, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 767, null);
            if (aVar != null) {
                o.d(this.graphState3A, h.a.d(aVar.getValue()), null, null, null, null, null, null, null, null, null, 1022, null);
                this.graphProcessor.j(this.graphState3A.b());
            }
        }
        return w0VarB;
    }

    private final w0<Result3A> q(boolean cancelAf) {
        k.k.f107055a.a();
        if (!this.graphProcessor.l(cancelAf ? A : f113773z)) {
            return f113766s;
        }
        t tVar = cancelAf ? new t(B, (Integer) null, (Long) null, 6, (fr.k) null) : new t(v0.i(), (Integer) null, (Long) null, 6, (fr.k) null);
        this.graphListener3A.g(tVar);
        this.graphProcessor.j(this.graphState3A.b());
        return tVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w0 s(f fVar, h.a aVar, h.b bVar, h.d dVar, m0 m0Var, List list, List list2, List list3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = null;
        }
        if ((i15 & 2) != 0) {
            bVar = null;
        }
        if ((i15 & 4) != 0) {
            dVar = null;
        }
        if ((i15 & 8) != 0) {
            m0Var = null;
        }
        if ((i15 & 16) != 0) {
            list = null;
        }
        if ((i15 & 32) != 0) {
            list2 = null;
        }
        if ((i15 & 64) != 0) {
            list3 = null;
        }
        return fVar.r(aVar, bVar, dVar, m0Var, list, list2, list3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object i(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, z0 z0Var, z0 z0Var2, z0 z0Var3, h.a aVar, er.l<? super q0, Boolean> lVar, er.l<? super q0, Boolean> lVar2, int i15, Long l15, Long l16, tq.e<? super w0<Result3A>> eVar) throws Throwable {
        b bVar;
        p0 p0Var;
        t tVar;
        h.a aVar2;
        int i16;
        p0 p0Var2;
        er.l<? super q0, Boolean> lVar3;
        Long l17;
        z0 z0Var4;
        z0 z0Var5 = z0Var3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i17 = bVar.f113789p;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f113789p = i17 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f113787m;
        Object objE = uq.b.e();
        int i18 = bVar.f113789p;
        if (i18 == 0) {
            oq.u.b(obj);
            p0Var = new p0();
            p0Var.f66410a = z0Var2;
            if (!h.x.INSTANCE.e(this.metadata)) {
                p0Var.f66410a = null;
            }
            if (z0Var == null && p0Var.f66410a == 0 && z0Var5 == null) {
                return z.a(new Result3A(Result3A.a.INSTANCE.b(), null, null));
            }
            o.d(this.graphState3A, null, null, null, null, list, list2, list3, null, null, null, 911, null);
            this.graphProcessor.j(this.graphState3A.b());
            if (this.graphProcessor.g() == null) {
                return f113766s;
            }
            if (g.d((z0) p0Var.f66410a)) {
                k.k.f107055a.a();
                if (!this.graphProcessor.l(f113763p)) {
                    return f113766s;
                }
            }
            if (g.f(z0Var) || g.g((z0) p0Var.f66410a) || g.h(z0Var5)) {
                tVar = new t(lVar == null ? v.b(c(g.f(z0Var), g.g((z0) p0Var.f66410a), g.h(z0Var5))) : lVar, vq.b.e(i15), l15);
                this.graphListener3A.g(tVar);
                Boolean boolA = g.c(z0Var) ? vq.b.a(false) : null;
                Boolean boolA2 = g.e(z0Var5) ? vq.b.a(false) : null;
                if (boolA != null || boolA2 != null) {
                    k.k.f107055a.a();
                    o.d(this.graphState3A, null, null, null, null, null, null, null, boolA, null, boolA2, 383, null);
                }
                this.graphProcessor.j(this.graphState3A.b());
                if (k.k.f107055a.a()) {
                    g.f(z0Var);
                    g.g((z0) p0Var.f66410a);
                    g.h(z0Var5);
                }
                w0<Result3A> w0VarB = tVar.b();
                bVar.f113779d = z0Var;
                bVar.f113780e = z0Var5;
                aVar2 = aVar;
                bVar.f113781f = aVar2;
                bVar.f113782g = lVar2;
                bVar.f113783h = l16;
                bVar.f113784j = p0Var;
                bVar.f113785k = tVar;
                i16 = i15;
                bVar.f113786l = i16;
                bVar.f113789p = 1;
                Object objI = w0VarB.I(bVar);
                if (objI == objE) {
                    return objE;
                }
                p0Var2 = p0Var;
                obj = objI;
                lVar3 = lVar2;
                l17 = l16;
                z0Var4 = z0Var;
            } else {
                aVar2 = aVar;
                lVar3 = lVar2;
                i16 = i15;
                l17 = l16;
                z0Var4 = z0Var;
            }
            return l(z0Var4, (z0) p0Var.f66410a, z0Var5, aVar2, lVar3, vq.b.e(i16), l17);
        }
        if (i18 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i19 = bVar.f113786l;
        t tVar2 = (t) bVar.f113785k;
        p0Var2 = (p0) bVar.f113784j;
        l17 = (Long) bVar.f113783h;
        lVar3 = (er.l) bVar.f113782g;
        aVar2 = (h.a) bVar.f113781f;
        z0 z0Var6 = (z0) bVar.f113780e;
        z0Var4 = (z0) bVar.f113779d;
        oq.u.b(obj);
        tVar = tVar2;
        z0Var5 = z0Var6;
        i16 = i19;
        Result3A result3A = (Result3A) obj;
        if (k.k.f107055a.a()) {
            q0 frameMetadata = result3A.getFrameMetadata();
            if (frameMetadata != null) {
                vq.b.f(frameMetadata.Y0());
            }
            Result3A.a.i(result3A.getStatus());
        }
        if (!Result3A.a.g(result3A.getStatus(), Result3A.a.INSTANCE.b())) {
            return tVar.b();
        }
        p0Var = p0Var2;
        return l(z0Var4, (z0) p0Var.f66410a, z0Var5, aVar2, lVar3, vq.b.e(i16), l17);
    }

    public final w0<Result3A> k(boolean triggerAf, boolean waitForAwb, int frameLimit, long timeLimitNs) {
        return j(triggerAf ? f113765r : f113764q, e(triggerAf, waitForAwb), frameLimit, timeLimitNs);
    }

    public final w0<Result3A> m(h.a aeMode) {
        return s(this, aeMode, null, null, m0.c(m0.INSTANCE.a()), null, null, null, 118, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public final w0<Result3A> n() {
        h.a aVarD;
        h.a aeMode = this.graphState3A.a().getAeMode();
        h.a.Companion companion = h.a.INSTANCE;
        if (aeMode == null ? false : h.a.g(aeMode.getValue(), companion.c())) {
            aVarD = null;
        } else {
            if (aeMode != null ? h.a.g(aeMode.getValue(), companion.b()) : false) {
                aVarD = null;
            } else {
                aVarD = h.a.d(companion.c());
            }
        }
        return s(this, aVarD, null, null, m0.c(m0.INSTANCE.b()), null, null, null, 118, null);
    }

    public final w0<Result3A> o(Boolean ae5, Boolean af4, Boolean awb, er.l<? super q0, Boolean> unlockedCondition, int frameLimit, Long timeLimitNs) {
        Boolean bool = !h.x.INSTANCE.e(this.metadata) ? null : af4;
        Boolean bool2 = Boolean.TRUE;
        if (!fr.t.c(ae5, bool2) && !fr.t.c(bool, bool2) && !fr.t.c(awb, bool2)) {
            return z.a(new Result3A(Result3A.a.INSTANCE.b(), null, null));
        }
        if (this.graphProcessor.g() == null) {
            return f113766s;
        }
        if (fr.t.c(bool, bool2)) {
            k.k kVar = k.k.f107055a;
            kVar.a();
            if (!this.graphProcessor.l(f113763p)) {
                kVar.a();
                return f113766s;
            }
            o.d(this.graphState3A, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767, null);
        }
        t tVar = new t(unlockedCondition == null ? v.b(h(fr.t.c(ae5, bool2), fr.t.c(bool, bool2), fr.t.c(awb, bool2))) : unlockedCondition, Integer.valueOf(frameLimit), timeLimitNs);
        this.graphListener3A.g(tVar);
        Boolean bool3 = fr.t.c(ae5, bool2) ? Boolean.FALSE : null;
        Boolean bool4 = fr.t.c(awb, bool2) ? Boolean.FALSE : null;
        if (bool3 != null || bool4 != null) {
            k.k.f107055a.a();
            o.d(this.graphState3A, null, null, null, null, null, null, null, bool3, null, bool4, 383, null);
        }
        this.graphProcessor.j(this.graphState3A.b());
        return tVar.b();
    }

    public final w0<Result3A> p(boolean cancelAf) {
        return this.graphProcessor.g() == null ? f113766s : q(cancelAf);
    }

    public final w0<Result3A> r(h.a aeMode, h.b afMode, h.d awbMode, m0 flashMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        if (this.graphProcessor.g() == null) {
            o.d(this.graphState3A, aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, null, null, null, 896, null);
            this.graphProcessor.j(this.graphState3A.b());
            return f113766s;
        }
        t tVarD = d(aeMode, afMode, awbMode, flashMode);
        this.graphListener3A.g(tVarD);
        o.d(this.graphState3A, aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, null, null, null, 896, null);
        this.graphProcessor.j(this.graphState3A.b());
        w0<Result3A> w0VarB = tVarD.b();
        synchronized (this) {
            try {
                if (k.k.f107055a.a()) {
                    Objects.toString(this.lastUpdate3AResult);
                }
                w0<Result3A> w0Var = this.lastUpdate3AResult;
                if (w0Var != null) {
                    h2.e(w0Var, "A newer call for 3A state update initiated.", null, 2, null);
                }
                this.lastUpdate3AResult = w0VarB;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return w0VarB;
    }
}
