package m;

import CON.j0;
import h.c0;
import h.d1;
import h.e1;
import h.i1;
import h.n0;
import h.o0;
import h.p0;
import h.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import ju.x;
import ju.z;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 >2\u00020\u0001:\u0005\"\u0012 &\u001cB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010(\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001b\u0010,\u001a\u00060)R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b&\u0010+R!\u00102\u001a\f\u0012\b\u0012\u00060.R\u00020\u00000-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010<¨\u0006?"}, d2 = {"Lm/n;", "", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/f0;", "frameTimestamp", "", "Lh/c0;", "imageStreams", "<init>", "(Lh/i1;JJLjava/util/Set;Lfr/k;)V", "Loq/i0;", "g", "()V", "Lh/n0$a;", "listener", "c", "(Lh/n0$a;)V", "h", "Lh/q1;", "streamId", "i", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "Lh/i1;", "getRequestMetadata", "()Lh/i1;", "b", "J", "e", "()J", "getFrameTimestamp-LS1Wq50", "Lh/o0;", "d", "getFrameId-OMxQvVY", "frameId", "Lm/n$b;", "Lm/n$b;", "()Lm/n$b;", "frameInfoOutput", "", "Lm/n$d;", "f", "Ljava/util/List;", "()Ljava/util/List;", "imageOutputs", "Liu/e;", "Lm/n$e;", "Liu/e;", "state", "Liu/c;", "Liu/c;", "remainingStreamCount", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lm/q;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listenerStates", "j", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final iu.d f121855k = iu.b.e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i1 requestMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long frameNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long frameTimestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long frameId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b frameInfoOutput;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<d> imageOutputs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iu.e<e> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final iu.c remainingStreamCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<q> listenerStates;

    /* JADX INFO: renamed from: m.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm/n$a;", "", "<init>", "()V", "Lh/o0;", "b", "()J", "Liu/d;", "frameIds", "Liu/d;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b() {
            return o0.a(n.f121855k.c());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm/n$b;", "Lm/n$c;", "Lh/p0;", "Lm/r$a;", "<init>", "(Lm/n;)V", "Lh/r0;", "cameraFrameNumber", "Lh/f0;", "cameraTimestamp", "", "cameraOutputSequence", "outputNumber", "Lm/t;", "outputResult", "Loq/i0;", "a", "(JJJJLjava/lang/Object;)V", "d", "()V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends c<p0> implements r.a<p0> {
        public b() {
        }

        @Override // m.r.a
        public void a(long cameraFrameNumber, long cameraTimestamp, long cameraOutputSequence, long outputNumber, Object outputResult) {
            c().d0(t.b(outputResult));
            n.this.h();
        }

        @Override // m.n.c
        protected void d() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H$¢\u0006\u0004\b\u0007\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lm/n$c;", "", "T", "<init>", "()V", "Loq/i0;", "b", "d", "Liu/c;", "a", "Liu/c;", "count", "Lju/x;", "Lm/t;", "Lju/x;", "c", "()Lju/x;", "internalResult", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final iu.c count = iu.b.c(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final x<t<T>> internalResult = z.c(null, 1, null);

        public final void b() {
            if (this.count.b() == 0) {
                t.Companion companion = t.INSTANCE;
                this.internalResult.d0(t.b(t.c(d1.f(d1.INSTANCE.e()))));
                d();
            }
        }

        protected final x<t<T>> c() {
            return this.internalResult;
        }

        protected abstract void d();
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lm/n$d;", "Lm/n$c;", "Ln/s;", "Lm/r$a;", "Ln/r;", "Lh/q1;", "streamId", "Lh/c1;", "outputId", "Liu/c;", "remainingOutputResults", "<init>", "(Lm/n;IILiu/c;Lfr/k;)V", "Lh/r0;", "cameraFrameNumber", "Lh/f0;", "cameraTimestamp", "", "cameraOutputSequence", "outputNumber", "Lm/t;", "outputResult", "Loq/i0;", "a", "(JJJJLjava/lang/Object;)V", "d", "()V", "c", "I", "f", "()I", "e", "Liu/c;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d extends c<n.s> implements r.a<n.r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int streamId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int outputId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final iu.c remainingOutputResults;

        public /* synthetic */ d(n nVar, int i15, int i16, iu.c cVar, fr.k kVar) {
            this(i15, i16, cVar);
        }

        @Override // m.r.a
        public void a(long cameraFrameNumber, long cameraTimestamp, long cameraOutputSequence, long outputNumber, Object outputResult) throws Exception {
            int iE;
            n.r rVar = (n.r) (t.e(outputResult) ? outputResult : null);
            if (rVar != null) {
                n.s sVarA = n.s.INSTANCE.a(rVar);
                if (!c().d0(t.b(t.c(sVarA)))) {
                    j0.a(sVarA);
                }
            } else {
                x<t<n.s>> xVarC = c();
                if (t.e(outputResult)) {
                    iE = d1.INSTANCE.a();
                } else {
                    iE = outputResult == null ? d1.INSTANCE.e() : ((d1) outputResult).getValue();
                }
                xVarC.d0(t.b(t.c(d1.f(iE))));
            }
            if (this.remainingOutputResults.b() == 0) {
                Iterator it = n.this.listenerStates.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).c(this.streamId);
                }
                n.this.i(this.streamId);
            }
        }

        @Override // m.n.c
        protected void d() throws Exception {
            t.Companion companion = t.INSTANCE;
            x<t<n.s>> xVarC = c();
            Object obj = null;
            if (xVarC.r() && !xVarC.isCancelled()) {
                Object result = xVarC.C().getResult();
                if (t.e(result)) {
                    obj = result;
                }
            }
            n.s sVar = (n.s) obj;
            if (sVar != null) {
                j0.a(sVar);
            }
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getOutputId() {
            return this.outputId;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getStreamId() {
            return this.streamId;
        }

        private d(int i15, int i16, iu.c cVar) {
            this.streamId = i15;
            this.outputId = i16;
            this.remainingOutputResults = cVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lm/n$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum e {
        STARTED,
        FRAME_INFO_COMPLETE,
        STREAM_RESULTS_COMPLETE,
        COMPLETE;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f121877f = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121878a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.FRAME_INFO_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.STREAM_RESULTS_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f121878a = iArr;
        }
    }

    public /* synthetic */ n(i1 i1Var, long j15, long j16, Set set, fr.k kVar) {
        this(i1Var, j15, j16, set);
    }

    private final void g() {
        Iterator<q> it = this.listenerStates.iterator();
        while (it.hasNext()) {
            it.next().a(this.frameNumber, this.frameTimestamp);
        }
    }

    public final void c(n0.a listener) {
        q qVar = new q(listener);
        this.listenerStates.add(qVar);
        int i15 = f.f121878a[this.state.c().ordinal()];
        if (i15 == 1) {
            qVar.e(this.frameNumber, this.frameTimestamp);
            return;
        }
        if (i15 == 2) {
            qVar.b(this.frameNumber, this.frameTimestamp);
        } else if (i15 == 3) {
            qVar.d(this.frameNumber, this.frameTimestamp);
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            qVar.a(this.frameNumber, this.frameTimestamp);
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getFrameInfoOutput() {
        return this.frameInfoOutput;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getFrameNumber() {
        return this.frameNumber;
    }

    public final List<d> f() {
        return this.imageOutputs;
    }

    public final void h() {
        e eVarC;
        e eVar;
        iu.e<e> eVar2 = this.state;
        do {
            eVarC = eVar2.c();
            e eVar3 = eVarC;
            int i15 = f.f121878a[eVar3.ordinal()];
            if (i15 == 1) {
                eVar = e.FRAME_INFO_COMPLETE;
            } else {
                if (i15 != 3) {
                    throw new IllegalStateException("Unexpected frame state for " + this + "! State is " + eVar3 + ' ');
                }
                eVar = e.COMPLETE;
            }
        } while (!eVar2.a(eVarC, eVar));
        Iterator<q> it = this.listenerStates.iterator();
        while (it.hasNext()) {
            it.next().b(this.frameNumber, this.frameTimestamp);
        }
        if (eVar == e.COMPLETE) {
            g();
        }
    }

    public final void i(int streamId) {
        e eVarC;
        e eVar;
        if (this.remainingStreamCount.b() != 0) {
            return;
        }
        iu.e<e> eVar2 = this.state;
        do {
            eVarC = eVar2.c();
            e eVar3 = eVarC;
            int i15 = f.f121878a[eVar3.ordinal()];
            if (i15 == 1) {
                eVar = e.STREAM_RESULTS_COMPLETE;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + this + "! State is " + eVar3 + ' ');
                }
                eVar = e.COMPLETE;
            }
        } while (!eVar2.a(eVarC, eVar));
        Iterator<q> it = this.listenerStates.iterator();
        while (it.hasNext()) {
            it.next().d(this.frameNumber, this.frameTimestamp);
        }
        if (eVar == e.COMPLETE) {
            g();
        }
    }

    public String toString() {
        return "Frame-" + ((Object) o0.b(this.frameId)) + '(' + this.frameNumber + '@' + this.frameTimestamp + ')';
    }

    private n(i1 i1Var, long j15, long j16, Set<c0> set) {
        Object next;
        this.requestMetadata = i1Var;
        this.frameNumber = j15;
        this.frameTimestamp = j16;
        this.frameId = INSTANCE.b();
        this.frameInfoOutput = new b();
        List listC = v.c();
        Iterator<q1> it = i1Var.G().keySet().iterator();
        while (it.hasNext()) {
            int value = it.next().getValue();
            Iterator<T> it4 = set.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!q1.d(((c0) next).getId(), value));
            c0 c0Var = (c0) next;
            if (c0Var != null) {
                List<e1> listB = c0Var.b();
                iu.c cVarC = iu.b.c(listB.size());
                int size = listB.size();
                for (int i15 = 0; i15 < size; i15++) {
                    listC.add(new d(this, value, listB.get(i15).getId(), cVarC, null));
                }
            }
        }
        List<d> listA = v.a(listC);
        this.imageOutputs = listA;
        this.state = iu.b.g(e.STARTED);
        List<d> list = listA;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList.add(q1.a(((d) it5.next()).getStreamId()));
        }
        this.remainingStreamCount = iu.b.c(v.e0(arrayList).size());
        this.listenerStates = new CopyOnWriteArrayList<>();
    }
}
