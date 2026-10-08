package PRN;

import android.os.Looper;
import io.sentry.android.core.c2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;
import v.r2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0019\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u00100R&\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#03\u0012\u0004\u0012\u000204028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105¨\u00067"}, d2 = {"LPRN/o;", "", "<init>", "()V", "Lh/s;", "cameraGraph", "Lh/t0;", "graphState", "Loq/i0;", "g", "(Lh/s;Lh/t0;)V", "Lv/n0$a;", "internalState", "Lo/t$a;", "stateError", "k", "(Lv/n0$a;Lo/t$a;)V", "j", "i", "(Lh/s;)V", "h", "currentState", "LPRN/o$a;", "d", "(Lv/n0$a;Lh/t0;)LPRN/o$a;", "a", "Ljava/lang/Object;", "lock", "Lv/r2;", "b", "Lv/r2;", "e", "()Lv/r2;", "cameraInternalState", "Landroidx/lifecycle/b0;", "Lo/t;", "c", "Landroidx/lifecycle/b0;", "f", "()Landroidx/lifecycle/b0;", "cameraState", "Lh/s;", "currentGraph", "Lv/n0$a;", "currentCameraInternalState", "Lo/t$a;", "currentCameraStateError", "", "Z", "isRemoved", "", "Li6/a;", "Ljava/util/concurrent/Executor;", "Ljava/util/Map;", "cameraStateListeners", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r2<v.n0.a> cameraInternalState = new r2<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.b0<o.t> cameraState = new androidx.p016lifecycle.b0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private h.s currentGraph;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private v.n0.a currentCameraInternalState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private o.t.a currentCameraStateError;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRemoved;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<i6.a<o.t>, Executor> cameraStateListeners;

    /* JADX INFO: renamed from: PRN.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LPRN/o$b;", "", "<init>", "()V", "Lh/q;", "Lo/t$a;", "d", "(I)Lo/t$a;", "Lv/n0$a;", "Lo/t$b;", "c", "(Lv/n0$a;)Lo/t$b;", "cameraError", "", "a", "(I)Z", "Landroidx/lifecycle/b0;", "Lo/t;", "cameraState", "Loq/i0;", "b", "(Landroidx/lifecycle/b0;Lo/t;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: PRN.o$b$a */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f737a;

            static {
                int[] iArr = new int[v.n0.a.values().length];
                try {
                    iArr[v.n0.a.CLOSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v.n0.a.OPENING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v.n0.a.OPEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[v.n0.a.CLOSING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[v.n0.a.PENDING_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f737a = iArr;
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final boolean a(int cameraError) {
            h.q.Companion companion = h.q.INSTANCE;
            return h.q.r(cameraError, companion.f()) || h.q.r(cameraError, companion.g()) || h.q.r(cameraError, companion.h()) || h.q.r(cameraError, companion.d());
        }

        public final void b(androidx.p016lifecycle.b0<o.t> b0Var, o.t tVar) {
            if (fr.t.c(Looper.myLooper(), Looper.getMainLooper())) {
                b0Var.o(tVar);
            } else {
                b0Var.m(tVar);
            }
        }

        public final o.t.b c(v.n0.a aVar) {
            int i15 = a.f737a[aVar.ordinal()];
            if (i15 == 1) {
                return o.t.b.CLOSED;
            }
            if (i15 == 2) {
                return o.t.b.OPENING;
            }
            if (i15 == 3) {
                return o.t.b.OPEN;
            }
            if (i15 == 4) {
                return o.t.b.CLOSING;
            }
            if (i15 == 5) {
                return o.t.b.PENDING_OPEN;
            }
            throw new IllegalArgumentException("Unexpected CameraInternal state: " + aVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        public final o.t.a d(int i15) {
            h.q.Companion companion = h.q.INSTANCE;
            int i16 = 6;
            if (!h.q.r(i15, companion.p())) {
                if (h.q.r(i15, companion.g())) {
                    i16 = 2;
                } else if (h.q.r(i15, companion.h())) {
                    i16 = 1;
                } else if (h.q.r(i15, companion.e())) {
                    i16 = 5;
                } else if (h.q.r(i15, companion.d())) {
                    i16 = 3;
                } else if (!h.q.r(i15, companion.k())) {
                    if (h.q.r(i15, companion.f())) {
                        i16 = 2;
                    } else if (!h.q.r(i15, companion.n()) && !h.q.r(i15, companion.o())) {
                        if (h.q.r(i15, companion.m())) {
                            i16 = 4;
                        } else if (h.q.r(i15, companion.l())) {
                            i16 = 7;
                        } else if (!h.q.r(i15, companion.q()) && !h.q.r(i15, companion.i()) && !h.q.r(i15, companion.j())) {
                            throw new IllegalArgumentException("Unexpected CameraError: " + ((Object) h.q.u(i15)));
                        }
                    }
                }
            }
            return o.t.a.a(i16);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f738a;

        static {
            int[] iArr = new int[v.n0.a.values().length];
            try {
                iArr[v.n0.a.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.n0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.n0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.n0.a.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v.n0.a.PENDING_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f738a = iArr;
        }
    }

    public o() {
        v.n0.a aVar = v.n0.a.CLOSED;
        this.currentCameraInternalState = aVar;
        this.cameraStateListeners = new LinkedHashMap();
        l(this, aVar, null, 2, null);
    }

    private final void g(h.s cameraGraph, h.t0 graphState) {
        if (!fr.t.c(cameraGraph, this.currentGraph)) {
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                Objects.toString(graphState);
                Objects.toString(cameraGraph);
                return;
            }
            return;
        }
        CombinedCameraState combinedCameraStateD = d(this.currentCameraInternalState, graphState);
        if (combinedCameraStateD != null) {
            this.currentCameraInternalState = combinedCameraStateD.getState();
            this.currentCameraStateError = combinedCameraStateD.getError();
            e.c cVar2 = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused2 = e.c.TRUNCATED_TAG;
                combinedCameraStateD.toString();
            }
            k(this.currentCameraInternalState, this.currentCameraStateError);
            return;
        }
        e.c cVar3 = e.c.f45719a;
        if (o.e1.k("CXCP")) {
            c2.g(e.c.TRUNCATED_TAG, "Impermissible state transition: current camera internal state: " + this.currentCameraInternalState + ", received graph state: " + graphState);
        }
    }

    private final void k(v.n0.a internalState, o.t.a stateError) {
        List<Map.Entry> listF1;
        this.cameraInternalState.m(internalState);
        Companion companion = INSTANCE;
        final o.t tVarA = o.t.a(companion.c(internalState), stateError);
        companion.b(this.cameraState, tVarA);
        synchronized (this.lock) {
            listF1 = pq.v.f1(this.cameraStateListeners.entrySet());
        }
        for (Map.Entry entry : listF1) {
            final i6.a aVar = (i6.a) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: PRN.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.m(aVar, tVarA);
                }
            });
        }
    }

    static /* synthetic */ void l(o oVar, v.n0.a aVar, o.t.a aVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar2 = null;
        }
        oVar.k(aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(i6.a aVar, o.t tVar) {
        aVar.accept(tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CombinedCameraState d(v.n0.a currentState, h.t0 graphState) {
        int i15 = c.f738a[currentState.ordinal()];
        int i16 = 2;
        o.t.a aVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        if (i15 == 1) {
            if (fr.t.c(graphState, h.t0.c.f79080b)) {
                return new CombinedCameraState(v.n0.a.OPENING, objArr4 == true ? 1 : 0, i16, objArr3 == true ? 1 : 0);
            }
            if (fr.t.c(graphState, h.t0.b.f79079b)) {
                return new CombinedCameraState(v.n0.a.OPEN, objArr2 == true ? 1 : 0, i16, objArr == true ? 1 : 0);
            }
            return null;
        }
        if (i15 == 2) {
            if (fr.t.c(graphState, h.t0.b.f79079b)) {
                return new CombinedCameraState(v.n0.a.OPEN, objArr10 == true ? 1 : 0, i16, objArr9 == true ? 1 : 0);
            }
            if (graphState instanceof h.t0.a) {
                h.t0.a aVar2 = (h.t0.a) graphState;
                if (aVar2.getWillAttemptRetry()) {
                    return new CombinedCameraState(v.n0.a.OPENING, INSTANCE.d(aVar2.getCameraError()));
                }
                Companion companion = INSTANCE;
                return companion.a(aVar2.getCameraError()) ? new CombinedCameraState(v.n0.a.PENDING_OPEN, companion.d(aVar2.getCameraError())) : new CombinedCameraState(v.n0.a.CLOSING, companion.d(aVar2.getCameraError()));
            }
            if (fr.t.c(graphState, h.t0.e.f79082b)) {
                return new CombinedCameraState(v.n0.a.CLOSING, objArr8 == true ? 1 : 0, i16, objArr7 == true ? 1 : 0);
            }
            if (fr.t.c(graphState, h.t0.d.f79081b)) {
                return new CombinedCameraState(v.n0.a.CLOSED, objArr6 == true ? 1 : 0, i16, objArr5 == true ? 1 : 0);
            }
            return null;
        }
        if (i15 == 3) {
            if (fr.t.c(graphState, h.t0.e.f79082b)) {
                return new CombinedCameraState(v.n0.a.CLOSING, objArr14 == true ? 1 : 0, i16, objArr13 == true ? 1 : 0);
            }
            if (fr.t.c(graphState, h.t0.d.f79081b)) {
                return new CombinedCameraState(v.n0.a.CLOSED, objArr12 == true ? 1 : 0, i16, objArr11 == true ? 1 : 0);
            }
            if (!(graphState instanceof h.t0.a)) {
                return null;
            }
            Companion companion2 = INSTANCE;
            h.t0.a aVar3 = (h.t0.a) graphState;
            return companion2.a(aVar3.getCameraError()) ? new CombinedCameraState(v.n0.a.PENDING_OPEN, companion2.d(aVar3.getCameraError())) : new CombinedCameraState(v.n0.a.CLOSED, companion2.d(aVar3.getCameraError()));
        }
        if (i15 == 4) {
            if (fr.t.c(graphState, h.t0.d.f79081b)) {
                return new CombinedCameraState(v.n0.a.CLOSED, objArr18 == true ? 1 : 0, i16, objArr17 == true ? 1 : 0);
            }
            if (fr.t.c(graphState, h.t0.c.f79080b)) {
                return new CombinedCameraState(v.n0.a.OPENING, objArr16 == true ? 1 : 0, i16, objArr15 == true ? 1 : 0);
            }
            if (graphState instanceof h.t0.a) {
                return new CombinedCameraState(v.n0.a.CLOSING, INSTANCE.d(((h.t0.a) graphState).getCameraError()));
            }
            return null;
        }
        if (i15 != 5) {
            return null;
        }
        if (fr.t.c(graphState, h.t0.c.f79080b)) {
            return new CombinedCameraState(v.n0.a.OPENING, aVar, i16, objArr21 == true ? 1 : 0);
        }
        if (fr.t.c(graphState, h.t0.b.f79079b)) {
            return new CombinedCameraState(v.n0.a.OPEN, objArr20 == true ? 1 : 0, i16, objArr19 == true ? 1 : 0);
        }
        if (!(graphState instanceof h.t0.a)) {
            return null;
        }
        Companion companion3 = INSTANCE;
        h.t0.a aVar4 = (h.t0.a) graphState;
        return companion3.a(aVar4.getCameraError()) ? new CombinedCameraState(v.n0.a.PENDING_OPEN, companion3.d(aVar4.getCameraError())) : new CombinedCameraState(v.n0.a.CLOSED, companion3.d(aVar4.getCameraError()));
    }

    public final r2<v.n0.a> e() {
        return this.cameraInternalState;
    }

    public final androidx.p016lifecycle.b0<o.t> f() {
        return this.cameraState;
    }

    public final void h(h.s cameraGraph, h.t0 graphState) {
        synchronized (this.lock) {
            if (!this.isRemoved) {
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                    Objects.toString(cameraGraph);
                    Objects.toString(graphState);
                }
                g(cameraGraph, graphState);
                oq.i0 i0Var = oq.i0.f148189a;
                return;
            }
            e.c cVar2 = e.c.f45719a;
            if (o.e1.k("CXCP")) {
                c2.g(e.c.TRUNCATED_TAG, "Ignoring graph state update " + graphState + " on removed camera.");
            }
        }
    }

    public final void i(h.s cameraGraph) {
        synchronized (this.lock) {
            try {
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                    Objects.toString(this.currentGraph);
                    Objects.toString(cameraGraph);
                }
                v.n0.a aVar = this.currentCameraInternalState;
                v.n0.a aVar2 = v.n0.a.CLOSED;
                if (aVar != aVar2) {
                    l(this, v.n0.a.CLOSING, null, 2, null);
                    l(this, aVar2, null, 2, null);
                }
                this.currentGraph = cameraGraph;
                this.currentCameraInternalState = aVar2;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void j() {
        o.t.a aVarA = o.t.a.a(8);
        synchronized (this.lock) {
            try {
                if (this.isRemoved) {
                    return;
                }
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
                this.isRemoved = true;
                v.n0.a aVar = v.n0.a.CLOSED;
                this.currentCameraInternalState = aVar;
                this.currentCameraStateError = aVarA;
                k(aVar, aVarA);
                this.currentGraph = null;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: PRN.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LPRN/o$a;", "", "Lv/n0$a;", "state", "Lo/t$a;", "error", "<init>", "(Lv/n0$a;Lo/t$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv/n0$a;", "b", "()Lv/n0$a;", "Lo/t$a;", "()Lo/t$a;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CombinedCameraState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v.n0.a state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o.t.a error;

        public CombinedCameraState(v.n0.a aVar, o.t.a aVar2) {
            this.state = aVar;
            this.error = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o.t.a getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final v.n0.a getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CombinedCameraState)) {
                return false;
            }
            CombinedCameraState combinedCameraState = (CombinedCameraState) other;
            return this.state == combinedCameraState.state && fr.t.c(this.error, combinedCameraState.error);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            o.t.a aVar = this.error;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "CombinedCameraState(state=" + this.state + ", error=" + this.error + ')';
        }

        public /* synthetic */ CombinedCameraState(v.n0.a aVar, o.t.a aVar2, int i15, fr.k kVar) {
            this(aVar, (i15 & 2) != 0 ? null : aVar2);
        }
    }
}
