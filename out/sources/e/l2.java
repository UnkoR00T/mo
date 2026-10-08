package e;

import android.hardware.camera2.CaptureRequest;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002)'B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\b*\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0092\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00152\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bH\u0086@¢\u0006\u0004\b$\u0010\nJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u00103R\u001c\u00108\u001a\b\u0012\u0004\u0012\u000206058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0016\u0010:\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u00109R$\u0010=\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010<R$\u0010>\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00010;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001f0?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0018\u0010F\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u00060SR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00103¨\u0006Y"}, d2 = {"Le/l2;", "", "Ld/g0;", "useCaseGraphContext", "Lc/g0;", "templateParamsOverride", "<init>", "(Ld/g0;Lc/g0;)V", "Loq/i0;", "g", "(Ltq/e;)Ljava/lang/Object;", "Lh/s$g;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "parameters", "i", "(Lh/s$g;Ljava/util/Map;)V", "key", "", "f", "(Ljava/util/Map;Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Integer;", "", "appendParameters", "Lh/a1$a;", "internalParameters", "appendInternalParameters", "", "Lh/q1;", "streams", "Lh/k1;", "template", "Lh/g1$a;", "listeners", "Lju/w0;", "j", "(Ljava/util/Map;ZLjava/util/Map;ZLjava/util/Set;Lh/k1;Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "h", "e", "()V", "a", "Ld/g0;", "b", "Lc/g0;", "c", "Ljava/lang/Object;", "lock", "Lju/x;", "d", "Lju/x;", "updateSignal", "Liu/c;", "Liu/c;", "submittedRequestCounter", "Lpq/m;", "Le/l2$b;", "Lpq/m;", "updateSignals", "Z", "updating", "", "Ljava/util/Map;", "currentParameters", "currentInternalParameters", "", "Ljava/util/Set;", "currentStreams", "k", "currentListeners", "l", "Lh/k1;", "currentTemplate", "Lh/a;", "m", "Lh/a;", "lastAeMode", "Lh/b;", "n", "Lh/b;", "lastAfMode", "Lh/d;", "o", "Lh/d;", "lastAwbMode", "Le/l2$a;", "p", "Le/l2$a;", "requestListener", "q", "pendingSignalCount", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.g0 useCaseGraphContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c.g0 templateParamsOverride;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> updateSignal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean updating;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private h.k1 currentTemplate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private h.a lastAeMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private h.b lastAfMode;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private h.d lastAwbMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iu.c submittedRequestCounter = iu.b.c(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private pq.m<RequestSignal> updateSignals = new pq.m<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<CaptureRequest.Key<?>, Object> currentParameters = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<h.a1.a<?>, Object> currentInternalParameters = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Set<h.q1> currentStreams = new LinkedHashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Set<h.g1.a> currentListeners = new LinkedHashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a requestListener = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final iu.c pendingSignalCount = iu.b.c(0);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Le/l2$a;", "Lh/g1$a;", "<init>", "(Le/l2;)V", "Lh/i1;", "requestMetadata", "Lh/h1;", "requestFailure", "Loq/i0;", "c", "(Lh/i1;Lh/h1;)V", "Lpq/m;", "Le/l2$b;", "", "requestNo", "a", "(Lpq/m;I)V", "", "throwable", "d", "(Lpq/m;ILjava/lang/Throwable;)V", "Lh/r0;", "frameNumber", "Lh/p0;", "totalCaptureResult", "a0", "(Lh/i1;JLh/p0;)V", "p", "(Lh/i1;JLh/h1;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements h.g1.a {
        public a() {
        }

        private final void a(pq.m<RequestSignal> mVar, int i15) {
            while (!mVar.isEmpty() && mVar.first().getRequestNo() <= i15) {
                mVar.first().b().d0(oq.i0.f148189a);
                pq.v.K(mVar);
                l2.this.pendingSignalCount.b();
            }
        }

        private final void c(h.i1 requestMetadata, h.h1 requestFailure) {
            String str;
            Integer num = (Integer) requestMetadata.c(u1.b());
            if (num != null) {
                l2 l2Var = l2.this;
                int iIntValue = num.intValue();
                synchronized (l2Var.lock) {
                    try {
                        pq.m<RequestSignal> mVar = l2Var.updateSignals;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Failed in framework level");
                        if (requestFailure != null) {
                            str = " with CaptureFailure.reason = " + requestFailure.getReason();
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        sb5.append(str);
                        d(mVar, iIntValue, new Throwable(sb5.toString()));
                        oq.i0 i0Var = oq.i0.f148189a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }

        private final void d(pq.m<RequestSignal> mVar, int i15, Throwable th4) {
            while (!mVar.isEmpty() && mVar.first().getRequestNo() <= i15) {
                mVar.first().b().p(th4);
                pq.v.K(mVar);
                l2.this.pendingSignalCount.b();
            }
        }

        @Override // h.g1.a
        public void a0(h.i1 requestMetadata, long frameNumber, h.p0 totalCaptureResult) {
            Integer num;
            if (l2.this.pendingSignalCount.getValue() == 0 || (num = (Integer) requestMetadata.c(u1.b())) == null) {
                return;
            }
            l2 l2Var = l2.this;
            int iIntValue = num.intValue();
            synchronized (l2Var.lock) {
                a(l2Var.updateSignals, iIntValue);
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }

        @Override // h.g1.a
        public void p(h.i1 requestMetadata, long frameNumber, h.h1 requestFailure) {
            if (l2.this.pendingSignalCount.getValue() == 0) {
                return;
            }
            c(requestMetadata, requestFailure);
        }
    }

    /* JADX INFO: renamed from: e.l2$b, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Le/l2$b;", "", "", "requestNo", "Lju/x;", "Loq/i0;", "signal", "<init>", "(ILju/x;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lju/x;", "()Lju/x;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestSignal {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int requestNo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ju.x<oq.i0> signal;

        public RequestSignal(int i15, ju.x<oq.i0> xVar) {
            this.requestNo = i15;
            this.signal = xVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getRequestNo() {
            return this.requestNo;
        }

        public final ju.x<oq.i0> b() {
            return this.signal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestSignal)) {
                return false;
            }
            RequestSignal requestSignal = (RequestSignal) other;
            return this.requestNo == requestSignal.requestNo && fr.t.c(this.signal, requestSignal.signal);
        }

        public int hashCode() {
            return (Integer.hashCode(this.requestNo) * 31) + this.signal.hashCode();
        }

        public String toString() {
            return "RequestSignal(requestNo=" + this.requestNo + ", signal=" + this.signal + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f46153e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f46155g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46153e = obj;
            this.f46155g |= PKIFailureInfo.systemUnavail;
            return l2.this.g(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f46157e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f46159g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46157e = obj;
            this.f46159g |= PKIFailureInfo.systemUnavail;
            return l2.this.j(null, false, null, false, null, null, null, this);
        }
    }

    public l2(d.g0 g0Var, c.g0 g0Var2) {
        this.useCaseGraphContext = g0Var;
        this.templateParamsOverride = g0Var2;
    }

    private final Integer f(Map<CaptureRequest.Key<?>, ? extends Object> map, CaptureRequest.Key<?> key) {
        Object obj = map != null ? map.get(key) : null;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a A[Catch: all -> 0x0153, TryCatch #2 {all -> 0x0153, blocks: (B:65:0x0146, B:67:0x014a, B:70:0x0155), top: B:84:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, ju.x<oq.i0>] */
    /* JADX WARN: Type inference failed for: r9v11, types: [T, h.g1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, ju.x<oq.i0>] */
    public final Object g(tq.e<? super oq.i0> eVar) throws Exception {
        c cVar;
        fr.p0 p0Var;
        ju.x xVar;
        ?? r15;
        int iD;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f46155g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f46155g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f46153e;
        Object objE = uq.b.e();
        int i16 = cVar.f46155g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.p0 p0Var2 = new fr.p0();
            try {
                h.s sVarF = this.useCaseGraphContext.f();
                cVar.f46152d = p0Var2;
                cVar.f46155g = 1;
                Object objM3 = sVarF.m3(cVar);
                if (objM3 == objE) {
                    return objE;
                }
                p0Var = p0Var2;
                obj = objM3;
            } catch (CancellationException unused) {
                p0Var = p0Var2;
                e.c cVar2 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                }
                synchronized (this.lock) {
                    if (this.updating) {
                        this.updating = false;
                        p0Var.f66410a = this.updateSignal;
                        this.updateSignal = null;
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (fr.p0) cVar.f46152d;
            try {
                oq.u.b(obj);
            } catch (CancellationException unused3) {
                e.c cVar3 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused4 = e.c.TRUNCATED_TAG;
                }
                synchronized (this.lock) {
                    try {
                        if (this.updating) {
                            this.updating = false;
                            p0Var.f66410a = this.updateSignal;
                            this.updateSignal = null;
                        }
                        oq.i0 i0Var2 = oq.i0.f148189a;
                        xVar = (ju.x) p0Var.f66410a;
                        if (xVar != null) {
                            vq.b.a(xVar.d0(oq.i0.f148189a));
                        }
                        return oq.i0.f148189a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        AutoCloseable autoCloseable = (AutoCloseable) obj;
        try {
            h.s.g gVar = (h.s.g) autoCloseable;
            fr.p0 p0Var3 = new fr.p0();
            fr.p0 p0Var4 = new fr.p0();
            synchronized (this.lock) {
                try {
                    if (this.currentStreams.isEmpty()) {
                        p0Var3.f66410a = null;
                    } else {
                        h.k1 k1Var = this.currentTemplate;
                        List listF1 = pq.v.f1(this.currentStreams);
                        Map mapO = pq.v0.o(this.templateParamsOverride.a(this.currentTemplate), pq.v0.u(this.currentParameters));
                        Map mapW = pq.v0.w(this.currentInternalParameters);
                        mapW.put(u1.b(), vq.b.e(this.submittedRequestCounter.d()));
                        List listI1 = pq.v.i1(this.currentListeners);
                        listI1.add(this.requestListener);
                        p0Var3.f66410a = new h.g1(listF1, mapO, mapW, listI1, k1Var, null, 32, null);
                    }
                    r15 = this.updateSignal;
                    p0Var4.f66410a = r15;
                    this.updating = false;
                    this.updateSignal = null;
                    oq.i0 i0Var3 = oq.i0.f148189a;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            if (p0Var3.f66410a == 0) {
                gVar.stopRepeating();
                p0Var.f66410a = p0Var4.f66410a;
            } else {
                ju.x xVar2 = (ju.x) r15;
                if (xVar2 != null) {
                    synchronized (this.lock) {
                        this.updateSignals.add(new RequestSignal(this.submittedRequestCounter.getValue(), xVar2));
                        iD = this.pendingSignalCount.d();
                    }
                    vq.b.e(iD);
                }
                e.c cVar4 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused5 = e.c.TRUNCATED_TAG;
                    Objects.toString(p0Var3.f66410a);
                }
                gVar.L0((h.g1) p0Var3.f66410a);
                i(gVar, ((h.g1) p0Var3.f66410a).e());
            }
            cr.a.a(autoCloseable, null);
            xVar = (ju.x) p0Var.f66410a;
            if (xVar != null) {
                vq.b.a(xVar.d0(oq.i0.f148189a));
            }
            return oq.i0.f148189a;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                cr.a.a(autoCloseable, th6);
                throw th7;
            }
        }
    }

    private final void i(h.s.g gVar, Map<CaptureRequest.Key<?>, ? extends Object> map) {
        h.a aVarA;
        h.b bVarA;
        Integer numF = f(map, CaptureRequest.CONTROL_AE_MODE);
        h.d dVarA = null;
        if (numF != null) {
            aVarA = h.a.INSTANCE.a(numF.intValue());
        } else {
            aVarA = null;
        }
        Integer numF2 = f(map, CaptureRequest.CONTROL_AF_MODE);
        if (numF2 != null) {
            bVarA = h.b.INSTANCE.a(numF2.intValue());
        } else {
            bVarA = null;
        }
        Integer numF3 = f(map, CaptureRequest.CONTROL_AWB_MODE);
        if (numF3 != null) {
            dVarA = h.d.INSTANCE.a(numF3.intValue());
        }
        h.d dVar = dVarA;
        boolean z15 = false;
        boolean z16 = (aVarA == null || fr.t.c(aVarA, this.lastAeMode)) ? false : true;
        boolean z17 = (bVarA == null || fr.t.c(bVarA, this.lastAfMode)) ? false : true;
        if (dVar != null && !fr.t.c(dVar, this.lastAwbMode)) {
            z15 = true;
        }
        if (z16 || z17 || z15) {
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                Objects.toString(aVarA);
                Objects.toString(bVarA);
                Objects.toString(dVar);
            }
            h.o.b(gVar, aVarA, bVarA, dVar, null, null, null, 56, null);
            if (aVarA != null) {
                this.lastAeMode = aVarA;
            }
            if (bVarA != null) {
                this.lastAfMode = bVarA;
            }
            if (dVar != null) {
                this.lastAwbMode = dVar;
            }
        }
    }

    public final void e() {
        synchronized (this.lock) {
            try {
                if (this.updating) {
                    this.updating = false;
                    ju.x<oq.i0> xVar = this.updateSignal;
                    if (xVar != null) {
                        xVar.p(new CancellationException("UseCaseCameraState closed"));
                    }
                    this.updateSignal = null;
                }
                while (!this.updateSignals.isEmpty()) {
                    this.updateSignals.removeFirst().b().p(new CancellationException("UseCaseCameraState closed"));
                    this.pendingSignalCount.b();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final Object h(tq.e<? super oq.i0> eVar) throws Exception {
        Object objG = g(eVar);
        return objG == uq.b.e() ? objG : oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, ju.x<oq.i0>] */
    public final Object j(Map<CaptureRequest.Key<?>, ? extends Object> map, boolean z15, Map<h.a1.a<?>, ? extends Object> map2, boolean z16, Set<h.q1> set, h.k1 k1Var, Set<? extends h.g1.a> set2, tq.e<? super ju.w0<oq.i0>> eVar) throws Throwable {
        d dVar;
        fr.p0 p0Var;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f46159g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f46159g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f46157e;
        Object objE = uq.b.e();
        int i16 = dVar.f46159g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.p0 p0Var2 = new fr.p0();
            synchronized (this.lock) {
                try {
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                        Objects.toString(map);
                        Objects.toString(map2);
                        Objects.toString(set);
                        Objects.toString(k1Var);
                    }
                    if (map != null) {
                        if (!z15) {
                            this.currentParameters.clear();
                        }
                        this.currentParameters.putAll(map);
                    }
                    if (map2 != null) {
                        if (!z16) {
                            this.currentInternalParameters.clear();
                        }
                        this.currentInternalParameters.putAll(map2);
                    }
                    if (set != null) {
                        this.currentStreams.clear();
                        this.currentStreams.addAll(set);
                    }
                    if (k1Var != null) {
                        this.currentTemplate = k1Var;
                    }
                    if (set2 != null) {
                        this.currentListeners.clear();
                        this.currentListeners.addAll(set2);
                    }
                    if (this.updateSignal == null) {
                        this.updateSignal = ju.z.c(null, 1, null);
                    }
                    if (this.updating) {
                        return this.updateSignal;
                    }
                    this.updating = true;
                    p0Var2.f66410a = this.updateSignal;
                    oq.i0 i0Var = oq.i0.f148189a;
                    dVar.f46156d = p0Var2;
                    dVar.f46159g = 1;
                    if (g(dVar) == objE) {
                        return objE;
                    }
                    p0Var = p0Var2;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (fr.p0) dVar.f46156d;
            oq.u.b(obj);
        }
        return p0Var.f66410a;
    }
}
