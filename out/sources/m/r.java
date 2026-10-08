package m;

import fr.p0;
import h.d1;
import h.f0;
import h.r0;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0002+'B'\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001eH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010<\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u00108R\u0016\u0010>\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0016\u0010@\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u00108R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010F¨\u0006H"}, d2 = {"Lm/r;", "T", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "maximumCachedOutputs", "Ln/h;", "outputFinalizer", "Lm/s;", "outputMatcher", "<init>", "(ILn/h;Lm/s;)V", "Lm/r$b;", "output", "", "p", "(Lm/r$b;)Ljava/util/List;", "", "isOutOfOrder", "", "cameraOutputSequence", "cameraOutputNumber", "r", "(ZJJ)Ljava/util/List;", "Lh/r0;", "cameraFrameNumber", "Lh/f0;", "cameraTimestamp", "Lm/r$a;", "outputListener", "Loq/i0;", "m", "(JJJLm/r$a;)V", "outputNumber", "Lm/t;", "outputResult", "h", "(JLjava/lang/Object;)V", "frameNumber", "b", "(J)V", "close", "()V", "a", "I", "Ln/h;", "c", "Lm/s;", "", "d", "Ljava/lang/Object;", "lock", "e", "Z", "closed", "f", "J", "cameraOutputSequenceNumbers", "g", "newestCameraOutputNumber", "newestFrameNumber", "j", "lastFailedFrameNumber", "k", "lastFailedCameraOutputNumber", "", "l", "Ljava/util/List;", "startedOutputs", "", "Ljava/util/Map;", "availableOutputs", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r<T> implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maximumCachedOutputs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n.h<T> outputFinalizer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s outputMatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long cameraOutputSequenceNumbers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long newestCameraOutputNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long newestFrameNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long lastFailedFrameNumber;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long lastFailedCameraOutputNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<StartedOutput<T>> startedOutputs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<Long, t<T>> availableOutputs;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J=\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lm/r$a;", "T", "", "Lh/r0;", "cameraFrameNumber", "Lh/f0;", "cameraTimestamp", "", "cameraOutputSequence", "outputNumber", "Lm/t;", "outputResult", "Loq/i0;", "a", "(JJJJLjava/lang/Object;)V", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a<T> {
        void a(long cameraFrameNumber, long cameraTimestamp, long cameraOutputSequence, long outputNumber, Object outputResult);
    }

    /* JADX INFO: renamed from: m.r$b, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lm/r$b;", "T", "", "", "isOutOfOrder", "Lh/r0;", "cameraFrameNumber", "Lh/f0;", "cameraTimestamp", "", "cameraOutputSequence", "cameraOutputNumber", "Lm/r$a;", "outputListener", "<init>", "(ZJJJJLm/r$a;Lfr/k;)V", "Lh/d1;", "failureReason", "Loq/i0;", "b", "(I)V", "outputNumber", "Lm/t;", "outputResult", "a", "(JLjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "J", "c", "()J", "getCameraTimestamp-LS1Wq50", "d", "e", "Lm/r$a;", "Liu/a;", "g", "Liu/a;", "complete", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class StartedOutput<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOutOfOrder;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long cameraFrameNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long cameraTimestamp;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long cameraOutputSequence;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final long cameraOutputNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final a<T> outputListener;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final iu.a complete;

        public /* synthetic */ StartedOutput(boolean z15, long j15, long j16, long j17, long j18, a aVar, fr.k kVar) {
            this(z15, j15, j16, j17, j18, aVar);
        }

        public final void a(long outputNumber, Object outputResult) {
            if (this.complete.a(false, true)) {
                this.outputListener.a(this.cameraFrameNumber, this.cameraTimestamp, this.cameraOutputSequence, outputNumber, outputResult);
                return;
            }
            throw new IllegalStateException(("Output " + this.cameraOutputSequence + " at " + ((Object) r0.f(this.cameraFrameNumber)) + " for " + outputNumber + " was completed multiple times!").toString());
        }

        public final void b(int failureReason) {
            t.Companion companion = t.INSTANCE;
            a(-1L, t.c(d1.f(failureReason)));
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCameraFrameNumber() {
            return this.cameraFrameNumber;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getCameraOutputNumber() {
            return this.cameraOutputNumber;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getCameraOutputSequence() {
            return this.cameraOutputSequence;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartedOutput)) {
                return false;
            }
            StartedOutput startedOutput = (StartedOutput) other;
            return this.isOutOfOrder == startedOutput.isOutOfOrder && r0.d(this.cameraFrameNumber, startedOutput.cameraFrameNumber) && f0.b(this.cameraTimestamp, startedOutput.cameraTimestamp) && this.cameraOutputSequence == startedOutput.cameraOutputSequence && this.cameraOutputNumber == startedOutput.cameraOutputNumber && fr.t.c(this.outputListener, startedOutput.outputListener);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsOutOfOrder() {
            return this.isOutOfOrder;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.isOutOfOrder) * 31) + r0.e(this.cameraFrameNumber)) * 31) + f0.c(this.cameraTimestamp)) * 31) + Long.hashCode(this.cameraOutputSequence)) * 31) + Long.hashCode(this.cameraOutputNumber)) * 31) + this.outputListener.hashCode();
        }

        public String toString() {
            return "StartedOutput(isOutOfOrder=" + this.isOutOfOrder + ", cameraFrameNumber=" + ((Object) r0.f(this.cameraFrameNumber)) + ", cameraTimestamp=" + ((Object) f0.d(this.cameraTimestamp)) + ", cameraOutputSequence=" + this.cameraOutputSequence + ", cameraOutputNumber=" + this.cameraOutputNumber + ", outputListener=" + this.outputListener + ')';
        }

        private StartedOutput(boolean z15, long j15, long j16, long j17, long j18, a<T> aVar) {
            this.isOutOfOrder = z15;
            this.cameraFrameNumber = j15;
            this.cameraTimestamp = j16;
            this.cameraOutputSequence = j17;
            this.cameraOutputNumber = j18;
            this.outputListener = aVar;
            this.complete = iu.b.a(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(int i15, n.h<? super T> hVar, s sVar) {
        this.maximumCachedOutputs = i15;
        this.outputFinalizer = hVar;
        this.outputMatcher = sVar;
        this.lock = new Object();
        this.cameraOutputSequenceNumbers = 1L;
        this.newestCameraOutputNumber = Long.MIN_VALUE;
        this.newestFrameNumber = r0.b(Long.MIN_VALUE);
        this.lastFailedFrameNumber = Long.MIN_VALUE;
        this.lastFailedCameraOutputNumber = Long.MIN_VALUE;
        this.startedOutputs = new ArrayList();
        this.availableOutputs = new LinkedHashMap();
    }

    private final List<StartedOutput<T>> p(StartedOutput<T> output) {
        return r(output.getIsOutOfOrder(), output.getCameraOutputSequence(), output.getCameraOutputNumber());
    }

    private final List<StartedOutput<T>> r(boolean isOutOfOrder, long cameraOutputSequence, long cameraOutputNumber) {
        List<StartedOutput<T>> list = this.startedOutputs;
        ArrayList arrayList = new ArrayList();
        for (T t15 : list) {
            StartedOutput startedOutput = (StartedOutput) t15;
            if (startedOutput.getIsOutOfOrder() == isOutOfOrder && startedOutput.getCameraOutputSequence() < cameraOutputSequence && startedOutput.getCameraOutputNumber() < cameraOutputNumber) {
                arrayList.add(t15);
            }
        }
        this.startedOutputs.removeAll(arrayList);
        return arrayList;
    }

    public final void b(long frameNumber) {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.lastFailedFrameNumber = frameNumber;
                Iterator<T> it = this.startedOutputs.iterator();
                StartedOutput startedOutput = null;
                boolean z15 = false;
                StartedOutput startedOutput2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (z15) {
                            break;
                        }
                    } else {
                        T next = it.next();
                        if (r0.d(((StartedOutput) next).getCameraFrameNumber(), frameNumber)) {
                            if (!z15) {
                                z15 = true;
                                startedOutput2 = next;
                            }
                        }
                    }
                    startedOutput2 = null;
                    break;
                }
                StartedOutput startedOutput3 = startedOutput2;
                if (startedOutput3 != null) {
                    this.lastFailedCameraOutputNumber = startedOutput3.getCameraOutputNumber();
                    this.startedOutputs.remove(startedOutput3);
                    i0 i0Var = i0.f148189a;
                    startedOutput = startedOutput3;
                }
                if (startedOutput != null) {
                    startedOutput.b(d1.INSTANCE.c());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            List listI1 = v.i1(this.availableOutputs.values());
            this.availableOutputs.clear();
            List listI2 = v.i1(this.startedOutputs);
            this.startedOutputs.clear();
            i0 i0Var = i0.f148189a;
            Iterator it = listI1.iterator();
            while (it.hasNext()) {
                Object result = ((t) it.next()).getResult();
                n.h<T> hVar = this.outputFinalizer;
                if (!t.e(result)) {
                    result = null;
                }
                hVar.a((T) result);
            }
            Iterator it4 = listI2.iterator();
            while (it4.hasNext()) {
                ((StartedOutput) it4.next()).b(d1.INSTANCE.b());
            }
        }
    }

    public final void h(long outputNumber, Object outputResult) {
        t<T> tVarB;
        List<StartedOutput<T>> listP;
        T next;
        synchronized (this.lock) {
            try {
                if (this.closed || this.outputMatcher.b(this.lastFailedCameraOutputNumber, outputNumber)) {
                    tVarB = t.b(outputResult);
                } else {
                    Iterator<T> it = this.startedOutputs.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                    } while (!this.outputMatcher.b(((StartedOutput) next).getCameraOutputNumber(), outputNumber));
                    StartedOutput<T> startedOutput = next;
                    if (startedOutput != null) {
                        listP = p(startedOutput);
                        startedOutput.a(outputNumber, outputResult);
                        this.startedOutputs.remove(startedOutput);
                        tVarB = null;
                    } else {
                        this.availableOutputs.put(Long.valueOf(outputNumber), t.b(outputResult));
                        if (this.availableOutputs.size() > this.maximumCachedOutputs) {
                            tVarB = this.availableOutputs.remove(Long.valueOf(((Number) v.k0(this.availableOutputs.keySet())).longValue()));
                        } else {
                            tVarB = null;
                            listP = null;
                        }
                    }
                    i0 i0Var = i0.f148189a;
                }
                listP = null;
                i0 i0Var2 = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        t<T> tVar = tVarB;
        if (tVar != null) {
            Object result = tVar.getResult();
            Object obj = t.e(result) ? result : null;
            if (obj != null) {
                this.outputFinalizer.a((T) obj);
            }
        }
        if (listP != null) {
            Iterator<T> it4 = listP.iterator();
            while (it4.hasNext()) {
                ((StartedOutput) it4.next()).b(d1.INSTANCE.d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void m(long cameraFrameNumber, long cameraTimestamp, long cameraOutputNumber, a<T> outputListener) {
        T next;
        r<T> rVar;
        boolean z15;
        T next2;
        Long l15;
        List<StartedOutput<T>> listR;
        t<T> tVarRemove;
        Object objC;
        T next3;
        p0 p0Var = new p0();
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.startedOutputs.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!r0.d(((StartedOutput) next).getCameraFrameNumber(), cameraFrameNumber));
                StartedOutput startedOutput = next;
                if (startedOutput != null) {
                    if (k.k.f107055a.d()) {
                        c2.g("CXCP", "onOutputStarted was invoked multiple times with a previously started output!onOutputStarted with " + ((Object) r0.f(cameraFrameNumber)) + ", " + ((Object) f0.d(cameraTimestamp)) + ", " + cameraOutputNumber + ". Previously started output: " + startedOutput + ". Ignoring.");
                    }
                    return;
                }
                boolean z16 = this.closed;
                long j15 = this.cameraOutputSequenceNumbers;
                this.cameraOutputSequenceNumbers = 1 + j15;
                boolean z17 = true;
                try {
                    if (z16 || this.lastFailedFrameNumber == cameraFrameNumber || this.lastFailedCameraOutputNumber == cameraOutputNumber) {
                        rVar = this;
                        z15 = z16;
                        Iterator<T> it4 = rVar.availableOutputs.keySet().iterator();
                        do {
                            if (!it4.hasNext()) {
                                next2 = (T) null;
                                break;
                            }
                            next2 = it4.next();
                        } while (!rVar.outputMatcher.b(cameraOutputNumber, ((Number) next2).longValue()));
                        l15 = next2;
                        p0Var.f66410a = l15 != null ? (T) rVar.availableOutputs.remove(l15) : null;
                        listR = null;
                        tVarRemove = null;
                    } else {
                        boolean z18 = cameraFrameNumber < this.newestFrameNumber;
                        if (!z18) {
                            this.newestFrameNumber = cameraFrameNumber;
                        }
                        boolean z19 = cameraOutputNumber < this.newestCameraOutputNumber;
                        if (!z19) {
                            this.newestCameraOutputNumber = cameraOutputNumber;
                        }
                        boolean z25 = z18 || z19;
                        Iterator<T> it5 = this.availableOutputs.keySet().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z15 = z16;
                                next3 = (T) null;
                                break;
                            } else {
                                next3 = it5.next();
                                z15 = z16;
                                if (this.outputMatcher.b(cameraOutputNumber, ((Number) next3).longValue())) {
                                    break;
                                } else {
                                    z16 = z15;
                                }
                            }
                        }
                        l15 = next3;
                        if (l15 != null) {
                            tVarRemove = this.availableOutputs.remove(l15);
                            listR = r(z25, j15, cameraOutputNumber);
                            rVar = this;
                        } else {
                            rVar = this;
                            boolean z26 = z25;
                            List<StartedOutput<T>> list = rVar.startedOutputs;
                            StartedOutput<T> startedOutput2 = new StartedOutput<>(z26, cameraFrameNumber, cameraTimestamp, j15, cameraOutputNumber, outputListener, null);
                            j15 = j15;
                            list.add(startedOutput2);
                            z17 = false;
                            listR = null;
                            tVarRemove = null;
                            l15 = null;
                        }
                    }
                    i0 i0Var = i0.f148189a;
                    if (listR != null) {
                        Iterator<T> it6 = listR.iterator();
                        while (it6.hasNext()) {
                            ((StartedOutput) it6.next()).b(d1.INSTANCE.d());
                        }
                    }
                    t tVar = (t) p0Var.f66410a;
                    if (tVar != null) {
                        Object result = tVar.getResult();
                        if (!t.e(result)) {
                            result = null;
                        }
                        if (result != null) {
                            rVar.outputFinalizer.a((T) result);
                        }
                    }
                    if (z17) {
                        if (z15) {
                            t.Companion companion = t.INSTANCE;
                            objC = t.c(d1.f(d1.INSTANCE.b()));
                        } else {
                            t<T> tVar2 = tVarRemove;
                            if (tVar2 != null) {
                                objC = tVar2.getResult();
                            } else {
                                t.Companion companion2 = t.INSTANCE;
                                objC = t.c(d1.f(d1.INSTANCE.c()));
                            }
                        }
                        outputListener.a(cameraFrameNumber, cameraTimestamp, j15, l15 != null ? l15.longValue() : -1L, objC);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public /* synthetic */ r(int i15, n.h hVar, s sVar, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 3 : i15, hVar, sVar);
    }
}
