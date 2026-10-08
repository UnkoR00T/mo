package i;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001BBa\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 JY\u0010$\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b0!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0!2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0!H\u0002¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*Jy\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010-\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010,0\n2\u0012\u0010.\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010,0\n2\u0012\u0010/\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010,0\n2\u0006\u00101\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001cH\u0016¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0019H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0019H\u0016¢\u0006\u0004\b;\u0010:J\u0010\u0010<\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0019H\u0000¢\u0006\u0004\b>\u0010:J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010GR\u0014\u0010T\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010SR\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010PR\u0018\u0010W\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010VR\u0016\u0010Z\u001a\u0004\u0018\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010Y¨\u0006["}, d2 = {"Li/o1;", "Lh/h0;", "Landroid/hardware/camera2/CaptureRequest;", "Li/n1;", "Li/k2;", "session", "Lk/z;", "threads", "Lh/k1;", "template", "", "Lh/q1;", "Landroid/view/Surface;", "streamToSurfaceMap", "Lh/c1;", "outputToSurfaceMap", "Lh/p1;", "streamGraph", "Lh/r1;", "strictMode", "", "awaitRepeatingRequestOnDisconnect", "<init>", "(Li/k2;Lk/z;ILjava/util/Map;Ljava/util/Map;Lh/p1;Lh/r1;ZLfr/k;)V", "captureSequence", "Loq/i0;", "j", "(Li/n1;)V", "", "Lh/g1;", "requests", "p", "(Ljava/util/List;Li/k2;)Z", "", "surfaceToStreamMap", "surfaceToOutputMap", "m", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Z", "request", "requestTemplate", "Landroid/hardware/camera2/CaptureRequest$Builder;", "l", "(Lh/g1;I)Landroid/hardware/camera2/CaptureRequest$Builder;", "isRepeating", "", "defaultParameters", "graphParameters", "requiredParameters", "Lh/g0$a;", "sequenceListener", "Lh/g1$a;", "listeners", "k", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lh/g0$a;Ljava/util/List;)Li/n1;", "", "o", "(Li/n1;)Ljava/lang/Integer;", "T", "()V", "stopRepeating", "U", "(Ltq/e;)Ljava/lang/Object;", "n", "", "toString", "()Ljava/lang/String;", "a", "Li/k2;", "b", "Lk/z;", "c", "I", "d", "Ljava/util/Map;", "e", "f", "Lh/p1;", "g", "Lh/r1;", "h", "Z", "i", "debugId", "Ljava/lang/Object;", "lock", "disconnected", "Li/n1;", "lastSingleRepeatingRequestSequence", "Ln/p;", "Ln/p;", "imageWriter", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 implements h.h0<CaptureRequest, n1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k2 session;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int template;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<h.q1, Surface> streamToSurfaceMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<h.c1, Surface> outputToSurfaceMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h.p1 streamGraph;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h.r1 strictMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean awaitRepeatingRequestOnDisconnect;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int debugId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean disconnected;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private n1 lastSingleRepeatingRequestSequence;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final n.p imageWriter;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n1 f87298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n1 n1Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f87298f = n1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87297e;
            if (i15 == 0) {
                oq.u.b(obj);
                n1 n1Var = this.f87298f;
                this.f87297e = 1;
                if (n1Var.g(this) == objE) {
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

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new b(this.f87298f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public /* synthetic */ o1(k2 k2Var, k.z zVar, int i15, Map map, Map map2, h.p1 p1Var, h.r1 r1Var, boolean z15, fr.k kVar) {
        this(k2Var, zVar, i15, map, map2, p1Var, r1Var, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(n1 captureSequence) {
        k.k kVar = k.k.f107055a;
        if (kVar.a()) {
            Objects.toString(captureSequence);
        }
        if (((oq.i0) this.threads.n(2000L, new b(captureSequence, null))) == null && kVar.b()) {
            io.sentry.android.core.c2.e("CXCP", this + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + captureSequence);
        }
    }

    private final CaptureRequest.Builder l(h.g1 request, int requestTemplate) {
        CaptureRequest.Builder builderH;
        if (request.getInputRequest() != null) {
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) request.getInputRequest().getFrameInfo().c0(fr.q0.c(TotalCaptureResult.class));
            if (totalCaptureResult == null) {
                throw new IllegalStateException(("Failed to unwrap FrameInfo " + request.getInputRequest().getFrameInfo() + " as TotalCaptureResult").toString());
            }
            builderH = this.session.getDevice().V(totalCaptureResult);
        } else {
            builderH = this.session.getDevice().H(requestTemplate);
        }
        if (builderH != null) {
            return builderH;
        }
        if (request.getInputRequest() != null) {
            if (!k.k.f107055a.c()) {
                return null;
            }
            Objects.toString(request.getInputRequest().getFrameInfo());
            return null;
        }
        if (!k.k.f107055a.c()) {
            return null;
        }
        h.k1.g(requestTemplate);
        return null;
    }

    private final boolean m(List<h.g1> requests, Map<Surface, h.q1> surfaceToStreamMap, Map<Surface, h.c1> surfaceToOutputMap, Map<h.q1, Surface> streamToSurfaceMap) {
        if (requests.isEmpty()) {
            throw new IllegalStateException("build(...) should never be called with an empty request list!");
        }
        for (h.g1 g1Var : requests) {
            Iterator<h.q1> it = g1Var.f().iterator();
            boolean z15 = false;
            while (it.hasNext()) {
                int value = it.next().getValue();
                if (!streamToSurfaceMap.containsKey(h.q1.a(value))) {
                    Surface surface = this.streamToSurfaceMap.get(h.q1.a(value));
                    if (surface != null) {
                        surfaceToStreamMap.put(surface, h.q1.a(value));
                        streamToSurfaceMap.put(h.q1.a(value), surface);
                        h.c0 c0VarH = this.streamGraph.h(value);
                        if (c0VarH == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        for (h.e1 e1Var : c0VarH.b()) {
                            Surface surface2 = this.outputToSurfaceMap.get(h.c1.a(e1Var.getId()));
                            if (surface2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            surfaceToOutputMap.put(surface2, h.c1.a(e1Var.getId()));
                        }
                    } else {
                        continue;
                    }
                }
                z15 = true;
            }
            if (!z15) {
                if (k.k.f107055a.c()) {
                    g1Var.toString();
                }
                return false;
            }
            if (!z15) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f  */
    private final boolean p(List<h.g1> requests, k2 session) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z25;
        boolean z26;
        if (requests.isEmpty()) {
            throw new IllegalStateException("build(...) should never be called with an empty request list!");
        }
        if (session instanceof l2) {
            Boolean bool = null;
            Boolean bool2 = null;
            for (h.g1 g1Var : requests) {
                List<h.q1> listF = g1Var.f();
                if (!(listF instanceof Collection) || !listF.isEmpty()) {
                    Iterator<T> it = listF.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = false;
                            break;
                        }
                        ((h.q1) it.next()).getValue();
                        List<h.e1> listM = this.streamGraph.m();
                        if (!(listM instanceof Collection) || !listM.isEmpty()) {
                            Iterator<T> it4 = listM.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z16 = false;
                                    break;
                                }
                                h.e1 e1Var = (h.e1) it4.next();
                                h.e1.f streamUseCase = e1Var.getStreamUseCase();
                                if (streamUseCase == null ? false : h.e1.f.g(streamUseCase.getValue(), h.e1.f.INSTANCE.b())) {
                                    z15 = true;
                                } else {
                                    h.e1.g streamUseHint = e1Var.getStreamUseHint();
                                    if ((streamUseHint == null ? false : h.e1.g.f(streamUseHint.getValue(), h.e1.g.INSTANCE.a())) || e1Var.getStreamUseHint() == null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                }
                                if (z15) {
                                    z16 = true;
                                    break;
                                }
                            }
                        } else {
                            z16 = false;
                            break;
                            break;
                        }
                        if (z16) {
                            z17 = true;
                            break;
                        }
                    }
                } else {
                    z17 = false;
                    break;
                }
                Boolean boolValueOf = Boolean.valueOf(z17);
                if (bool != null && !fr.t.c(bool, boolValueOf) && k.k.f107055a.b()) {
                    io.sentry.android.core.c2.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool.booleanValue() + ". Current request contains preview stream use case or hint: " + z17 + '.');
                }
                List<h.q1> listF2 = g1Var.f();
                if (!(listF2 instanceof Collection) || !listF2.isEmpty()) {
                    Iterator<T> it5 = listF2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z25 = false;
                            break;
                        }
                        ((h.q1) it5.next()).getValue();
                        List<h.e1> listM2 = this.streamGraph.m();
                        if (!(listM2 instanceof Collection) || !listM2.isEmpty()) {
                            Iterator<T> it6 = listM2.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    z19 = false;
                                    break;
                                }
                                h.e1 e1Var2 = (h.e1) it6.next();
                                h.e1.f streamUseCase2 = e1Var2.getStreamUseCase();
                                if (streamUseCase2 == null ? false : h.e1.f.g(streamUseCase2.getValue(), h.e1.f.INSTANCE.c())) {
                                    z18 = true;
                                } else {
                                    h.e1.g streamUseHint2 = e1Var2.getStreamUseHint();
                                    if (streamUseHint2 == null ? false : h.e1.g.f(streamUseHint2.getValue(), h.e1.g.INSTANCE.b())) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                }
                                if (z18) {
                                    z19 = true;
                                    break;
                                }
                            }
                        } else {
                            z19 = false;
                            break;
                            break;
                        }
                        if (z19) {
                            z25 = true;
                            break;
                        }
                    }
                } else {
                    z25 = false;
                    break;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z25);
                if (bool2 != null && !fr.t.c(bool2, boolValueOf2) && k.k.f107055a.b()) {
                    io.sentry.android.core.c2.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool2.booleanValue() + ". Current request contains video stream use case: " + z25 + '.');
                }
                List<h.e1> listM3 = this.streamGraph.m();
                if (!(listM3 instanceof Collection) || !listM3.isEmpty()) {
                    Iterator<T> it7 = listM3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            z26 = true;
                            break;
                        }
                        if (!((h.e1) it7.next()).e()) {
                            z26 = false;
                            break;
                        }
                    }
                } else {
                    z26 = true;
                    break;
                }
                if (!z26) {
                    if (k.k.f107055a.b()) {
                        io.sentry.android.core.c2.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + this.streamGraph.m());
                    }
                    return false;
                }
                bool2 = boolValueOf2;
                bool = boolValueOf;
            }
        }
        return true;
    }

    @Override // h.h0
    public void T() {
        synchronized (this.lock) {
            try {
                if (k.k.f107055a.a()) {
                    toString();
                }
                this.session.T();
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // h.h0
    public Object U(tq.e<? super oq.i0> eVar) {
        n();
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0203  */
    @Override // h.h0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public n1 W(boolean isRepeating, List<h.g1> requests, Map<?, ? extends Object> defaultParameters, Map<?, ? extends Object> graphParameters, Map<?, ? extends Object> requiredParameters, h.g0.a sequenceListener, List<? extends h.g1.a> listeners) {
        boolean z15;
        Map<?, ? extends Object> map;
        ArrayList arrayList;
        Iterator it;
        ArrayMap arrayMap;
        boolean z16;
        boolean z17;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayMap arrayMap2;
        this = this;
        Map<?, ? extends Object> map2 = defaultParameters;
        Map<?, ? extends Object> map3 = requiredParameters;
        ArrayList arrayList4 = new ArrayList(requests.size());
        ArrayList arrayList5 = new ArrayList(requests.size());
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        ArrayMap arrayMap5 = new ArrayMap();
        if (!this.p(requests, this.session) || !this.m(requests, arrayMap3, arrayMap4, arrayMap5)) {
            return null;
        }
        Iterator<h.g1> it4 = requests.iterator();
        while (it4.hasNext()) {
            h.g1 next = it4.next();
            if (k.k.f107055a.a()) {
                Objects.toString(next);
            }
            h.k1 template = next.getTemplate();
            int value = template != null ? template.getValue() : this.template;
            CaptureRequest.Builder builderL = this.l(next, value);
            if (builderL == null) {
                return null;
            }
            q2 q2Var = q2.f87324a;
            Object obj = map3.get(q2Var.a());
            if (obj == null) {
                obj = map2.get(q2Var.a());
            }
            builderL.setTag(obj);
            int size = next.f().size();
            int i15 = 0;
            boolean z18 = false;
            while (true) {
                z15 = true;
                if (i15 >= size) {
                    break;
                }
                Surface surface = (Surface) arrayMap5.get(next.f().get(i15));
                if (surface != null) {
                    builderL.addTarget(surface);
                    z18 = true;
                }
                i15++;
            }
            if (!z18) {
                throw new IllegalStateException("Check failed.");
            }
            if (next.getInputRequest() == null) {
                h.l1.c(builderL, map2);
                map = graphParameters;
                h.l1.c(builderL, map);
                h.l1.c(builderL, next.e());
                h.l1.c(builderL, map3);
            } else {
                if (this.imageWriter == null) {
                    if (k.k.f107055a.b()) {
                        io.sentry.android.core.c2.e("CXCP", "Failed to queue request to ImageWriter - No ImageWriter available!");
                    }
                    return null;
                }
                n.o image = next.getInputRequest().getImage();
                synchronized (this.lock) {
                    if (this.disconnected) {
                        if (k.k.f107055a.d()) {
                            io.sentry.android.core.c2.g("CXCP", this + " disconnected. " + image + " can't be queued to " + this.imageWriter);
                        }
                        return null;
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                    k.k kVar = k.k.f107055a;
                    if (kVar.a()) {
                        Objects.toString(image);
                        Objects.toString(this.imageWriter);
                    }
                    if (!this.imageWriter.G3(image)) {
                        if (kVar.a()) {
                            Objects.toString(image);
                            Objects.toString(this.imageWriter);
                        }
                        return null;
                    }
                    h.l1.c(builderL, next.e());
                    map = graphParameters;
                }
            }
            long jC = q1.c();
            CaptureRequest captureRequestBuild = builderL.build();
            ArrayMap arrayMap6 = arrayMap3;
            k2 k2Var = this.session;
            it4 = it4;
            if (k2Var instanceof l2) {
                List<CaptureRequest> listG1 = ((l2) k2Var).G1(captureRequestBuild);
                if (listG1 == null) {
                    return null;
                }
                List<h.q1> listF = next.f();
                if (!(listF instanceof Collection) || !listF.isEmpty()) {
                    Iterator it5 = listF.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            arrayList = arrayList5;
                            arrayMap = arrayMap4;
                            z15 = false;
                            break;
                        }
                        ((h.q1) it5.next()).getValue();
                        List<h.e1> listM = this.streamGraph.m();
                        arrayList = arrayList5;
                        if (!(listM instanceof Collection) || !listM.isEmpty()) {
                            Iterator it6 = listM.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    it = it5;
                                    arrayMap = arrayMap4;
                                    z17 = false;
                                    break;
                                }
                                h.e1 e1Var = (h.e1) it6.next();
                                h.e1.f streamUseCase = e1Var.getStreamUseCase();
                                Iterator it7 = it6;
                                it = it5;
                                arrayMap = arrayMap4;
                                if (streamUseCase == null ? false : h.e1.f.g(streamUseCase.getValue(), h.e1.f.INSTANCE.c())) {
                                    z16 = true;
                                } else {
                                    h.e1.g streamUseHint = e1Var.getStreamUseHint();
                                    if (streamUseHint == null ? false : h.e1.g.f(streamUseHint.getValue(), h.e1.g.INSTANCE.b())) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                }
                                if (z16) {
                                    z17 = true;
                                    break;
                                }
                                arrayMap4 = arrayMap;
                                it5 = it;
                                it6 = it7;
                            }
                        } else {
                            it = it5;
                            arrayMap = arrayMap4;
                            z17 = false;
                            break;
                        }
                        if (z17) {
                            break;
                        }
                        arrayList5 = arrayList;
                        arrayMap4 = arrayMap;
                        it5 = it;
                    }
                } else {
                    arrayList = arrayList5;
                    arrayMap = arrayMap4;
                    z15 = false;
                    break;
                }
                if (z15) {
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList;
                    int i16 = 0;
                    arrayMap2 = arrayMap6;
                    int size2 = listG1.size();
                    while (i16 < size2) {
                        int i17 = size2;
                        ArrayList arrayList6 = arrayList2;
                        i2 i2Var = new i2(this.session, listG1.get(i16), defaultParameters, graphParameters, requiredParameters, arrayMap5, value, isRepeating, next, jC, null);
                        arrayList3.add(listG1.get(i16));
                        arrayList6.add(i2Var);
                        i16++;
                        arrayList2 = arrayList6;
                        size2 = i17;
                    }
                    map2 = defaultParameters;
                } else {
                    ArrayList arrayList7 = arrayList4;
                    arrayList3 = arrayList;
                    map2 = defaultParameters;
                    arrayMap2 = arrayMap6;
                    i2 i2Var2 = new i2(this.session, listG1.get(0), map2, map, map3, arrayMap5, value, isRepeating, next, jC, null);
                    arrayList3.add(listG1.get(0));
                    arrayList2 = arrayList7;
                    arrayList2.add(i2Var2);
                }
                map3 = requiredParameters;
                arrayList5 = arrayList3;
                arrayMap4 = arrayMap;
                arrayList4 = arrayList2;
                arrayMap3 = arrayMap2;
            } else {
                ArrayMap arrayMap7 = arrayMap4;
                ArrayList arrayList8 = arrayList4;
                ArrayList arrayList9 = arrayList5;
                map2 = defaultParameters;
                map3 = requiredParameters;
                i2 i2Var3 = new i2(k2Var, captureRequestBuild, map2, graphParameters, map3, arrayMap5, value, isRepeating, next, jC, null);
                arrayList9.add(captureRequestBuild);
                arrayList8.add(i2Var3);
                this = this;
                arrayList5 = arrayList9;
                arrayMap3 = arrayMap6;
                arrayMap4 = arrayMap7;
                arrayList4 = arrayList8;
            }
        }
        return new n1(this.session.getDevice().getCameraId(), isRepeating, arrayList5, arrayList4, listeners, sequenceListener, arrayMap3, arrayMap4, this.streamGraph, this.strictMode, null);
    }

    public final void n() {
        n1 n1Var;
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.lock) {
                try {
                    if (this.disconnected) {
                        n1Var = null;
                    } else {
                        this.disconnected = true;
                        n.p pVar = this.imageWriter;
                        if (pVar != null) {
                            CON.j0.a(pVar);
                        }
                        Surface inputSurface = this.session.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        n1Var = this.lastSingleRepeatingRequestSequence;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (this.awaitRepeatingRequestOnDisconnect && n1Var != null) {
                j(n1Var);
            }
            oq.i0 i0Var = oq.i0.f148189a;
            Trace.endSection();
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    @Override // h.h0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer V(n1 captureSequence) {
        Integer numB1;
        synchronized (this.lock) {
            if (this.disconnected) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", this + " disconnected. " + captureSequence + " won't be submitted");
                }
                return null;
            }
            if (captureSequence.i().size() != 1 || (this.session instanceof l2)) {
                numB1 = captureSequence.getRepeating() ? this.session.B1(captureSequence.i(), captureSequence) : this.session.r0(captureSequence.i(), captureSequence);
            } else if (captureSequence.getRepeating()) {
                if (this.awaitRepeatingRequestOnDisconnect) {
                    this.lastSingleRepeatingRequestSequence = captureSequence;
                }
                numB1 = this.session.e2(captureSequence.i().get(0), captureSequence);
            } else {
                numB1 = this.session.L2(captureSequence.i().get(0), captureSequence);
            }
            return numB1;
        }
    }

    @Override // h.h0
    public void stopRepeating() {
        synchronized (this.lock) {
            try {
                if (k.k.f107055a.a()) {
                    toString();
                }
                this.session.stopRepeating();
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.debugId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o1(k2 k2Var, k.z zVar, int i15, Map<h.q1, ? extends Surface> map, Map<h.c1, ? extends Surface> map2, h.p1 p1Var, h.r1 r1Var, boolean z15) {
        this.session = k2Var;
        this.threads = zVar;
        this.template = i15;
        this.streamToSurfaceMap = map;
        this.outputToSurfaceMap = map2;
        this.streamGraph = p1Var;
        this.strictMode = r1Var;
        this.awaitRepeatingRequestOnDisconnect = z15;
        this.debugId = q1.b().d();
        this.lock = new Object();
        n.p pVarA = null;
        if (!p1Var.b().isEmpty()) {
            h.x0 x0Var = (h.x0) pq.v.l0(p1Var.b());
            Surface inputSurface = k2Var.getInputSurface();
            if (inputSurface == null) {
                throw new IllegalStateException("inputSurface is required to create instance of imageWriter.");
            }
            try {
                pVarA = n.b.INSTANCE.a(inputSurface, x0Var.getId(), x0Var.getMaxImages(), h.o1.c(x0Var.getFormat()), zVar.i());
            } catch (RuntimeException e15) {
                if (k.k.f107055a.b()) {
                    io.sentry.android.core.c2.f("CXCP", "Failed to create ImageWriter for session " + this.session + "! Reprocessing will not be supported!", e15);
                }
            }
            if (pVarA != null && k.k.f107055a.a()) {
                pVarA.toString();
                Objects.toString(this.session);
            }
        }
        this.imageWriter = pVarA;
    }
}
