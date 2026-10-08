package e;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001a\u00020\b*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ9\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b#\u00103¨\u00064"}, d2 = {"Le/t1;", "Le/z1;", "Le/f1;", "flashControl", "Le/u2;", "threads", "<init>", "(Le/f1;Le/u2;)V", "Loq/i0;", "l", "()V", "Le/t1$a;", "request", "Le/f2;", "requestControl", "Lju/w0;", "", "Ljava/lang/Void;", "k", "(Le/t1$a;Le/f2;Ltq/e;)Ljava/lang/Object;", "submittedRequest", "currentRequestControl", "i", "(Lju/w0;Le/t1$a;Le/f2;)V", "reset", "Lv/n1;", "captureConfigs", "", "captureMode", "flashType", "Lcom/google/common/util/concurrent/q;", "h", "(Ljava/util/List;II)Lcom/google/common/util/concurrent/q;", "a", "Le/f1;", "b", "Le/u2;", "Lsu/a;", "c", "Lsu/a;", "mutex", "d", "Le/f2;", "_requestControl", "Ljava/util/LinkedList;", "e", "Ljava/util/LinkedList;", "pendingRequests", "value", "g", "()Le/f2;", "(Le/f2;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t1 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f1 flashControl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LinkedList<CaptureRequest> pendingRequests = new LinkedList<>();

    /* JADX INFO: renamed from: e.t1$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R%\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Le/t1$a;", "", "", "Lv/n1;", "captureConfigs", "", "captureMode", "flashType", "Lju/x;", "Ljava/lang/Void;", "result", "<init>", "(Ljava/util/List;IILju/x;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "c", "d", "Lju/x;", "()Lju/x;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CaptureRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<v.n1> captureConfigs;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int captureMode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int flashType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ju.x<List<Void>> result;

        public CaptureRequest(List<v.n1> list, int i15, int i16, ju.x<List<Void>> xVar) {
            this.captureConfigs = list;
            this.captureMode = i15;
            this.flashType = i16;
            this.result = xVar;
        }

        public final List<v.n1> a() {
            return this.captureConfigs;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCaptureMode() {
            return this.captureMode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getFlashType() {
            return this.flashType;
        }

        public final ju.x<List<Void>> d() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CaptureRequest)) {
                return false;
            }
            CaptureRequest captureRequest = (CaptureRequest) other;
            return fr.t.c(this.captureConfigs, captureRequest.captureConfigs) && this.captureMode == captureRequest.captureMode && this.flashType == captureRequest.flashType && fr.t.c(this.result, captureRequest.result);
        }

        public int hashCode() {
            return (((((this.captureConfigs.hashCode() * 31) + Integer.hashCode(this.captureMode)) * 31) + Integer.hashCode(this.flashType)) * 31) + this.result.hashCode();
        }

        public String toString() {
            return "CaptureRequest(captureConfigs=" + this.captureConfigs + ", captureMode=" + this.captureMode + ", flashType=" + this.flashType + ", result=" + this.result + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46318g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f46319h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<v.n1> f46320j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f46321k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f46322l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ju.x<List<Void>> f46323m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ t1 f46324n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<v.n1> list, int i15, int i16, ju.x<List<Void>> xVar, t1 t1Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f46320j = list;
            this.f46321k = i15;
            this.f46322l = i16;
            this.f46323m = xVar;
            this.f46324n = t1Var;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0093  */
        /* JADX WARN: Code duplicated, block: B:29:0x0097  */
        /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f2 f2Var;
            CaptureRequest captureRequest;
            CaptureRequest captureRequest2;
            su.a aVar;
            t1 t1Var;
            t1 t1Var2;
            t1 t1Var3;
            CaptureRequest captureRequest3;
            ju.w0 w0Var;
            Object objE = uq.b.e();
            int i15 = this.f46319h;
            if (i15 == 0) {
                oq.u.b(obj);
                CaptureRequest captureRequest4 = new CaptureRequest(this.f46320j, this.f46321k, this.f46322l, this.f46323m);
                f2Var = this.f46324n.get_requestControl();
                if (f2Var != null) {
                    this.f46316e = captureRequest4;
                    this.f46317f = f2Var;
                    this.f46319h = 1;
                    Object objC = f2Var.c(this);
                    if (objC != objE) {
                        captureRequest2 = captureRequest4;
                        obj = objC;
                    }
                } else {
                    captureRequest = captureRequest4;
                    aVar = this.f46324n.mutex;
                    t1Var = this.f46324n;
                    this.f46316e = captureRequest;
                    this.f46317f = aVar;
                    this.f46318g = t1Var;
                    this.f46319h = 3;
                    if (aVar.h(null, this) != objE) {
                        t1Var2 = t1Var;
                        t1Var2.pendingRequests.add(captureRequest);
                        aVar.r(null);
                        e.c cVar = e.c.f45719a;
                        if (o.e1.f("CXCP")) {
                            String unused = e.c.TRUNCATED_TAG;
                            Objects.toString(captureRequest);
                        }
                        return oq.i0.f148189a;
                    }
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    t1Var3 = (t1) this.f46318g;
                    f2Var = (f2) this.f46317f;
                    captureRequest3 = (CaptureRequest) this.f46316e;
                    oq.u.b(obj);
                    w0Var = (ju.w0) obj;
                    if (f2Var != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    t1Var3.i(w0Var, captureRequest3, f2Var);
                    return oq.i0.f148189a;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1Var2 = (t1) this.f46318g;
                aVar = (su.a) this.f46317f;
                captureRequest = (CaptureRequest) this.f46316e;
                oq.u.b(obj);
                try {
                    t1Var2.pendingRequests.add(captureRequest);
                    aVar.r(null);
                    e.c cVar2 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused2 = e.c.TRUNCATED_TAG;
                        Objects.toString(captureRequest);
                    }
                    return oq.i0.f148189a;
                } catch (Throwable th4) {
                    aVar.r(null);
                    throw th4;
                }
            }
            f2Var = (f2) this.f46317f;
            captureRequest2 = (CaptureRequest) this.f46316e;
            oq.u.b(obj);
            if (((Boolean) obj).booleanValue()) {
                t1 t1Var4 = this.f46324n;
                if (f2Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f46316e = captureRequest2;
                this.f46317f = f2Var;
                this.f46318g = t1Var4;
                this.f46319h = 2;
                Object objK = t1Var4.k(captureRequest2, f2Var, this);
                if (objK != objE) {
                    t1Var3 = t1Var4;
                    obj = objK;
                    captureRequest3 = captureRequest2;
                    w0Var = (ju.w0) obj;
                    if (f2Var != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    t1Var3.i(w0Var, captureRequest3, f2Var);
                    return oq.i0.f148189a;
                }
            } else {
                captureRequest = captureRequest2;
                aVar = this.f46324n.mutex;
                t1Var = this.f46324n;
                this.f46316e = captureRequest;
                this.f46317f = aVar;
                this.f46318g = t1Var;
                this.f46319h = 3;
                if (aVar.h(null, this) != objE) {
                    t1Var2 = t1Var;
                    t1Var2.pendingRequests.add(captureRequest);
                    aVar.r(null);
                    e.c cVar3 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused3 = e.c.TRUNCATED_TAG;
                        Objects.toString(captureRequest);
                    }
                    return oq.i0.f148189a;
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f46320j, this.f46321k, this.f46322l, this.f46323m, this.f46324n, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46327g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f46328h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f46329j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ f2 f46331l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ CaptureRequest f46332m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f2 f2Var, CaptureRequest captureRequest, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f46331l = f2Var;
            this.f46332m = captureRequest;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0077 A[PHI: r6
          0x0077: PHI (r6v1 fr.l0) = (r6v0 fr.l0), (r6v0 fr.l0), (r6v2 fr.l0) binds: [B:11:0x004c, B:13:0x0058, B:18:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x007b  */
        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr.l0 l0Var;
            f2 f2Var;
            t1 t1Var;
            CaptureRequest captureRequest;
            su.a aVar;
            t1 t1Var2;
            CaptureRequest captureRequest2;
            su.a aVar2;
            CaptureRequest captureRequest3;
            CaptureRequest captureRequest4;
            Object objE = uq.b.e();
            int i15 = this.f46329j;
            if (i15 != 0) {
                if (i15 == 1) {
                    t1Var = (t1) this.f46328h;
                    f2Var = (f2) this.f46327g;
                    captureRequest = (CaptureRequest) this.f46326f;
                    l0Var = (fr.l0) this.f46325e;
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    captureRequest3 = (CaptureRequest) this.f46327g;
                    t1Var2 = (t1) this.f46326f;
                    aVar2 = (su.a) this.f46325e;
                    oq.u.b(obj);
                }
                try {
                    t1Var2.pendingRequests.add(captureRequest3);
                    aVar2.r(null);
                    e.c cVar = e.c.f45719a;
                    captureRequest4 = this.f46332m;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                        Objects.toString(captureRequest4);
                    }
                    return oq.i0.f148189a;
                } catch (Throwable th4) {
                    aVar2.r(null);
                    throw th4;
                }
            }
            oq.u.b(obj);
            l0Var = new fr.l0();
            l0Var.f66404a = true;
            f2 f2Var2 = t1.this.get_requestControl();
            if (f2Var2 != null) {
                f2 f2Var3 = this.f46331l;
                t1 t1Var3 = t1.this;
                CaptureRequest captureRequest5 = this.f46332m;
                if (!fr.t.c(f2Var3, f2Var2)) {
                    this.f46325e = l0Var;
                    this.f46326f = captureRequest5;
                    this.f46327g = f2Var2;
                    this.f46328h = t1Var3;
                    this.f46329j = 1;
                    Object objK = t1Var3.k(captureRequest5, f2Var2, this);
                    if (objK != objE) {
                        f2Var = f2Var2;
                        obj = objK;
                        t1Var = t1Var3;
                        captureRequest = captureRequest5;
                    }
                } else if (l0Var.f66404a) {
                    aVar = t1.this.mutex;
                    t1Var2 = t1.this;
                    captureRequest2 = this.f46332m;
                    this.f46325e = aVar;
                    this.f46326f = t1Var2;
                    this.f46327g = captureRequest2;
                    this.f46328h = null;
                    this.f46329j = 2;
                    if (aVar.h(null, this) != objE) {
                        aVar2 = aVar;
                        captureRequest3 = captureRequest2;
                        t1Var2.pendingRequests.add(captureRequest3);
                        aVar2.r(null);
                        e.c cVar2 = e.c.f45719a;
                        captureRequest4 = this.f46332m;
                        if (o.e1.f("CXCP")) {
                            String unused2 = e.c.TRUNCATED_TAG;
                            Objects.toString(captureRequest4);
                        }
                    }
                }
                return objE;
            }
            if (l0Var.f66404a) {
                aVar = t1.this.mutex;
                t1Var2 = t1.this;
                captureRequest2 = this.f46332m;
                this.f46325e = aVar;
                this.f46326f = t1Var2;
                this.f46327g = captureRequest2;
                this.f46328h = null;
                this.f46329j = 2;
                if (aVar.h(null, this) != objE) {
                    aVar2 = aVar;
                    captureRequest3 = captureRequest2;
                    t1Var2.pendingRequests.add(captureRequest3);
                    aVar2.r(null);
                    e.c cVar3 = e.c.f45719a;
                    captureRequest4 = this.f46332m;
                    if (o.e1.f("CXCP")) {
                        String unused3 = e.c.TRUNCATED_TAG;
                        Objects.toString(captureRequest4);
                    }
                }
                return objE;
            }
            return oq.i0.f148189a;
            t1Var.i((ju.w0) obj, captureRequest, f2Var);
            l0Var.f66404a = false;
            if (l0Var.f66404a) {
                aVar = t1.this.mutex;
                t1Var2 = t1.this;
                captureRequest2 = this.f46332m;
                this.f46325e = aVar;
                this.f46326f = t1Var2;
                this.f46327g = captureRequest2;
                this.f46328h = null;
                this.f46329j = 2;
                if (aVar.h(null, this) != objE) {
                    aVar2 = aVar;
                    captureRequest3 = captureRequest2;
                    t1Var2.pendingRequests.add(captureRequest3);
                    aVar2.r(null);
                    e.c cVar4 = e.c.f45719a;
                    captureRequest4 = this.f46332m;
                    if (o.e1.f("CXCP")) {
                        String unused4 = e.c.TRUNCATED_TAG;
                        Objects.toString(captureRequest4);
                    }
                }
                return objE;
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
            return t1.this.new c(this.f46331l, this.f46332m, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f46335g;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            t1 t1Var;
            ju.x<List<Void>> xVarD;
            Object objE = uq.b.e();
            int i15 = this.f46335g;
            if (i15 == 0) {
                oq.u.b(obj);
                aVar = t1.this.mutex;
                t1 t1Var2 = t1.this;
                this.f46333e = aVar;
                this.f46334f = t1Var2;
                this.f46335g = 1;
                if (aVar.h(null, this) == objE) {
                    return objE;
                }
                t1Var = t1Var2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1Var = (t1) this.f46334f;
                aVar = (su.a) this.f46333e;
                oq.u.b(obj);
            }
            while (!t1Var.pendingRequests.isEmpty()) {
                try {
                    CaptureRequest captureRequest = (CaptureRequest) t1Var.pendingRequests.poll();
                    if (captureRequest != null && (xVarD = captureRequest.d()) != null) {
                        vq.b.a(xVarD.p(new o.v0(3, "Capture request is cancelled due to a reset", null)));
                    }
                } catch (Throwable th4) {
                    aVar.r(null);
                    throw th4;
                }
            }
            oq.i0 i0Var = oq.i0.f148189a;
            aVar.r(null);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return t1.this.new d(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f46337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f46339f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f46341h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46339f = obj;
            this.f46341h |= PKIFailureInfo.systemUnavail;
            return t1.this.k(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Ljava/lang/Void;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<ju.p0, tq.e<? super List<? extends Void>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<ju.w0<Void>> f46343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CaptureRequest f46344g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(List<? extends ju.w0<Void>> list, CaptureRequest captureRequest, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f46343f = list;
            this.f46344g = captureRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46342e;
            if (i15 == 0) {
                oq.u.b(obj);
                e.c cVar = e.c.f45719a;
                CaptureRequest captureRequest = this.f46344g;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                    Objects.toString(captureRequest);
                }
                List<ju.w0<Void>> list = this.f46343f;
                this.f46342e = 1;
                obj = ju.f.a(list, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            CaptureRequest captureRequest2 = this.f46344g;
            e.c cVar2 = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused2 = e.c.TRUNCATED_TAG;
                Objects.toString(captureRequest2);
            }
            return obj;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super List<Void>> eVar) {
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f46343f, this.f46344g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f46346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f46347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f46348h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f46349j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f46350k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f46351l;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:39:0x00be, B:31:0x0090, B:33:0x009a, B:35:0x00a7, B:40:0x00c6), top: B:46:0x002a }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bc -> B:39:0x00be). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.t1.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((g) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return t1.this.new g(eVar);
        }
    }

    public t1(f1 f1Var, u2 u2Var) {
        this.flashControl = f1Var;
        this.threads = u2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(final ju.w0<? extends List<Void>> w0Var, final CaptureRequest captureRequest, final f2 f2Var) {
        w0Var.C0(new er.l() { // from class: e.s1
            @Override // er.l
            public final Object b(Object obj) {
                return t1.j(this.f46296a, w0Var, captureRequest, f2Var, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(t1 t1Var, ju.w0 w0Var, CaptureRequest captureRequest, f2 f2Var, Throwable th4) {
        if ((th4 instanceof o.v0) && ((o.v0) th4).a() == 3) {
            ju.k.d(t1Var.threads.getSequentialScope(), null, null, t1Var.new c(f2Var, captureRequest, null), 3, null);
        } else {
            PRN.a0.q(w0Var, captureRequest.d(), th4);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(CaptureRequest captureRequest, f2 f2Var, tq.e<? super ju.w0<? extends List<Void>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f46341h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f46341h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objH = eVar2.f46339f;
        Object objE = uq.b.e();
        int i16 = eVar2.f46341h;
        if (i16 == 0) {
            oq.u.b(objH);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                Objects.toString(captureRequest);
                Objects.toString(f2Var);
            }
            f1 f1Var = this.flashControl;
            eVar2.f46337d = captureRequest;
            eVar2.f46338e = f2Var;
            eVar2.f46341h = 1;
            objH = f1Var.h(eVar2);
            if (objH == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2Var = (f2) eVar2.f46338e;
            captureRequest = (CaptureRequest) eVar2.f46337d;
            oq.u.b(objH);
        }
        int iIntValue = ((Number) objH).intValue();
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
        }
        return ju.k.b(this.threads.getSequentialScope(), null, null, new f(f2Var.d(captureRequest.a(), captureRequest.getCaptureMode(), captureRequest.getFlashType(), iIntValue), captureRequest, null), 3, null);
    }

    private final void l() {
        ju.k.d(this.threads.getSequentialScope(), null, null, new g(null), 3, null);
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._requestControl = f2Var;
        l();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    public final com.google.common.util.concurrent.q<List<Void>> h(List<v.n1> captureConfigs, int captureMode, int flashType) {
        ju.x xVarC = ju.z.c(null, 1, null);
        ju.k.d(this.threads.getSequentialScope(), null, null, new b(captureConfigs, captureMode, flashType, xVarC, this, null), 3, null);
        return a0.f.i(PRN.a0.i(xVarC, null, 1, null));
    }

    @Override // e.z1
    public void reset() {
        ju.k.d(this.threads.getSequentialScope(), null, null, new d(null), 3, null);
    }
}
