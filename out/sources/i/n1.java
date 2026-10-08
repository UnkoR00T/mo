package i;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.view.Surface;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0081\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*J/\u00100\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010/\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b8\u00109J/\u0010;\u001a\u00020\"2\u0006\u0010:\u001a\u00020+2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0016¢\u0006\u0004\b;\u00101J'\u0010>\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J'\u0010@\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ'\u0010H\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bJ\u0010KJ/\u0010M\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00122\u0006\u0010L\u001a\u00020-H\u0016¢\u0006\u0004\bM\u0010NJ'\u0010P\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010O\u001a\u00020B2\u0006\u0010/\u001a\u00020-H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\"2\u0006\u0010O\u001a\u00020B2\u0006\u0010/\u001a\u00020-H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010O\u001a\u00020BH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\"2\u0006\u0010O\u001a\u00020BH\u0016¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\"H\u0080@¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b[\u0010\\R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010]\u001a\u0004\b^\u0010\\R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010_\u001a\u0004\b`\u0010aR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010b\u001a\u0004\bc\u0010dR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010b\u001a\u0004\be\u0010dR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010b\u001a\u0004\bf\u0010dR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010g\u001a\u0004\bh\u0010iR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010jR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010jR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010kR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010lR\u0014\u0010o\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\"0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010sR$\u0010x\u001a\u00020B2\u0006\u0010u\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010v\"\u0004\bw\u0010W¨\u0006y"}, d2 = {"Li/n1;", "Li/m1;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Lh/g0;", "Landroid/hardware/camera2/CaptureRequest;", "Lh/v;", "cameraId", "", "repeating", "", "captureRequestList", "Lh/i1;", "captureMetadataList", "Lh/g1$a;", "listeners", "Lh/g0$a;", "sequenceListener", "", "Landroid/view/Surface;", "Lh/q1;", "surfaceToStreamMap", "Lh/c1;", "surfaceToOutputMap", "Lh/p1;", "streamGraph", "Lh/r1;", "strictMode", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lh/g0$a;Ljava/util/Map;Ljava/util/Map;Lh/p1;Lh/r1;Lfr/k;)V", "request", "Lh/r0;", "frameNumber", "Lh/h1;", "requestFailure", "Loq/i0;", "m", "(Lh/i1;JLh/h1;)V", "surface", "l", "(Landroid/view/Surface;)Lh/q1;", "captureRequest", "o", "(Landroid/hardware/camera2/CaptureRequest;)Lh/i1;", "Landroid/hardware/camera2/CameraCaptureSession;", "captureSession", "", "captureTimestamp", "captureFrameNumber", "onCaptureStarted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V", "f", "(Landroid/hardware/camera2/CaptureRequest;JJ)V", "Landroid/hardware/camera2/CaptureResult;", "partialCaptureResult", "onCaptureProgressed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V", "n", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V", "session", "onReadoutStarted", "Landroid/hardware/camera2/TotalCaptureResult;", "captureResult", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "c", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;J)V", "", "progress", "d", "(Landroid/hardware/camera2/CaptureRequest;I)V", "Landroid/hardware/camera2/CaptureFailure;", "captureFailure", "onCaptureFailed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V", "e", "(Landroid/hardware/camera2/CaptureRequest;J)V", "frameId", "onCaptureBufferLost", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V", "captureSequenceId", "onCaptureSequenceCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;IJ)V", "a", "(IJ)V", "onCaptureSequenceAborted", "(Landroid/hardware/camera2/CameraCaptureSession;I)V", "b", "(I)V", "g", "(Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "h", "Z", "r", "()Z", "Ljava/util/List;", "i", "()Ljava/util/List;", "u", "s", "Lh/g0$a;", "j", "()Lh/g0$a;", "Ljava/util/Map;", "Lh/p1;", "Lh/r1;", "k", "J", "debugId", "Lju/x;", "Lju/x;", "hasStarted", "Ljava/lang/Integer;", "_sequenceNumber", "value", "()I", "t", "sequenceNumber", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 extends CameraCaptureSession.CaptureCallback implements m1, h.g0<CaptureRequest> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean repeating;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<CaptureRequest> captureRequestList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<h.i1> captureMetadataList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<h.g1.a> listeners;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h.g0.a sequenceListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<Surface, h.q1> surfaceToStreamMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<Surface, h.c1> surfaceToOutputMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final h.p1 streamGraph;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h.r1 strictMode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long debugId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ju.x<oq.i0> hasStarted;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private volatile Integer _sequenceNumber;

    public /* synthetic */ n1(String str, boolean z15, List list, List list2, List list3, h.g0.a aVar, Map map, Map map2, h.p1 p1Var, h.r1 r1Var, fr.k kVar) {
        this(str, z15, list, list2, list3, aVar, map, map2, p1Var, r1Var);
    }

    private final h.q1 l(Surface surface) {
        h.c0 c0VarJ;
        h.q1 q1Var = this.surfaceToStreamMap.get(surface);
        if (q1Var != null) {
            return q1Var;
        }
        h.c1 c1Var = this.surfaceToOutputMap.get(surface);
        h.e1 e1VarP = c1Var != null ? this.streamGraph.p(c1Var.getValue()) : null;
        if (e1VarP == null || (c0VarJ = e1VarP.j()) == null) {
            return null;
        }
        return h.q1.a(c0VarJ.getId());
    }

    private final void m(h.i1 request, long frameNumber, h.h1 requestFailure) {
        getSequenceListener().a(this);
        h.i0 i0Var = h.i0.f78934a;
        k.h hVar = k.h.f107050a;
        Trace.beginSection("InvokeInternalListeners");
        int size = s().size();
        for (int i15 = 0; i15 < size; i15++) {
            s().get(i15).p(request, frameNumber, requestFailure);
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = request.getRequest().d().size();
        for (int i16 = 0; i16 < size2; i16++) {
            request.getRequest().d().get(i16).p(request, frameNumber, requestFailure);
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
    }

    private final h.i1 o(CaptureRequest captureRequest) {
        int size = i().size();
        for (int i15 = 0; i15 < size; i15++) {
            if (i().get(i15) == captureRequest) {
                return u().get(i15);
            }
        }
        throw new IllegalArgumentException("Failed to find CaptureRequest " + captureRequest + " in " + i());
    }

    @Override // i.m1
    public void a(int captureSequenceId, long captureFrameNumber) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureSequenceCompleted");
        this.hasStarted.d0(oq.i0.f148189a);
        getSequenceListener().a(this);
        h.r1 r1Var = this.strictMode;
        if (!(k() == captureSequenceId)) {
            String str = "onCaptureSequenceCompleted was invoked on " + k() + ", but expected " + captureSequenceId + '!';
            if (r1Var.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", str);
            }
        }
        long jB = h.r0.b(captureFrameNumber);
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = u().size();
        for (int i15 = 0; i15 < size; i15++) {
            h.i1 i1Var = u().get(i15);
            int size2 = s().size();
            for (int i16 = 0; i16 < size2; i16++) {
                s().get(i16).r(i1Var, jB);
            }
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = u().size();
        for (int i17 = 0; i17 < size3; i17++) {
            h.i1 i1Var2 = u().get(i17);
            int size4 = i1Var2.getRequest().d().size();
            for (int i18 = 0; i18 < size4; i18++) {
                i1Var2.getRequest().d().get(i18).r(i1Var2, jB);
            }
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // i.m1
    public void b(int captureSequenceId) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureSequenceAborted");
        this.hasStarted.d0(oq.i0.f148189a);
        getSequenceListener().a(this);
        h.r1 r1Var = this.strictMode;
        if (!(k() == captureSequenceId)) {
            String str = "onCaptureSequenceAborted was invoked on " + k() + ", but expected " + captureSequenceId + '!';
            if (r1Var.getEnabled()) {
                throw new IllegalStateException(str);
            }
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", str);
            }
        }
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = u().size();
        for (int i15 = 0; i15 < size; i15++) {
            h.i1 i1Var = u().get(i15);
            int size2 = s().size();
            for (int i16 = 0; i16 < size2; i16++) {
                s().get(i16).L(i1Var);
            }
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = u().size();
        for (int i17 = 0; i17 < size3; i17++) {
            h.i1 i1Var2 = u().get(i17);
            int size4 = i1Var2.getRequest().d().size();
            for (int i18 = 0; i18 < size4; i18++) {
                i1Var2.getRequest().d().get(i18).L(i1Var2);
            }
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // i.m1
    public void c(CaptureRequest captureRequest, TotalCaptureResult captureResult, long frameNumber) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        getSequenceListener().a(this);
        Trace.endSection();
        h.i1 i1VarO = o(captureRequest);
        FrameInfo frameInfo = new FrameInfo(captureResult, getCameraId(), i1VarO, null);
        Trace.beginSection("onTotalCaptureResult");
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = s().size();
        for (int i15 = 0; i15 < size; i15++) {
            s().get(i15).a0(i1VarO, frameNumber, frameInfo);
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i1VarO.getRequest().d().size();
        for (int i16 = 0; i16 < size2; i16++) {
            i1VarO.getRequest().d().get(i16).a0(i1VarO, frameNumber, frameInfo);
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        h.i0 i0Var2 = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size3 = s().size();
        for (int i17 = 0; i17 < size3; i17++) {
            s().get(i17).K(i1VarO, frameNumber, frameInfo);
        }
        k.h hVar4 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = i1VarO.getRequest().d().size();
        for (int i18 = 0; i18 < size4; i18++) {
            i1VarO.getRequest().d().get(i18).K(i1VarO, frameNumber, frameInfo);
        }
        k.h hVar5 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    @Override // i.m1
    public void d(CaptureRequest captureRequest, int progress) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureProcessProgressed");
        h.i1 i1VarO = o(captureRequest);
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = s().size();
        for (int i15 = 0; i15 < size; i15++) {
            s().get(i15).C(i1VarO, progress);
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i1VarO.getRequest().d().size();
        for (int i16 = 0; i16 < size2; i16++) {
            i1VarO.getRequest().d().get(i16).C(i1VarO, progress);
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // i.m1
    public void e(CaptureRequest captureRequest, long frameNumber) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureFailed");
        this.hasStarted.d0(oq.i0.f148189a);
        h.i1 i1VarO = o(captureRequest);
        m(i1VarO, frameNumber, new ExtensionRequestFailure(i1VarO, false, frameNumber, 0, null));
        Trace.endSection();
    }

    @Override // i.m1
    public void f(CaptureRequest captureRequest, long captureFrameNumber, long captureTimestamp) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureStarted");
        long jA = h.f0.a(captureTimestamp);
        long jB = h.r0.b(captureFrameNumber);
        this.hasStarted.d0(oq.i0.f148189a);
        h.i1 i1VarO = o(captureRequest);
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = s().size();
        for (int i15 = 0; i15 < size; i15++) {
            s().get(i15).Z(i1VarO, jB, jA);
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i1VarO.getRequest().d().size();
        for (int i16 = 0; i16 < size2; i16++) {
            i1VarO.getRequest().d().get(i16).Z(i1VarO, jB, jA);
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
    }

    public final Object g(tq.e<? super oq.i0> eVar) {
        Object objI = this.hasStarted.I(eVar);
        return objI == uq.b.e() ? objI : oq.i0.f148189a;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public String getCameraId() {
        return this.cameraId;
    }

    public List<CaptureRequest> i() {
        return this.captureRequestList;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public h.g0.a getSequenceListener() {
        return this.sequenceListener;
    }

    public int k() {
        int iIntValue;
        if (this._sequenceNumber != null) {
            Integer num = this._sequenceNumber;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
        }
        synchronized (this) {
            Integer num2 = this._sequenceNumber;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public void n(CaptureRequest captureRequest, CaptureResult partialCaptureResult) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureProgressed");
        long jB = h.r0.b(partialCaptureResult.getFrameNumber());
        FrameMetadata frameMetadata = new FrameMetadata(partialCaptureResult, getCameraId(), null);
        h.i1 i1VarO = o(captureRequest);
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = s().size();
        for (int i15 = 0; i15 < size; i15++) {
            s().get(i15).b(i1VarO, jB, frameMetadata);
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i1VarO.getRequest().d().size();
        for (int i16 = 0; i16 < size2; i16++) {
            i1VarO.getRequest().d().get(i16).b(i1VarO, jB, frameMetadata);
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession captureSession, CaptureRequest captureRequest, Surface surface, long frameId) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureBufferLost");
        long jB = h.r0.b(frameId);
        h.q1 q1VarL = l(surface);
        h.c1 c1Var = this.surfaceToOutputMap.get(surface);
        if (q1VarL == null) {
            throw new IllegalStateException(("Unable to find the streamId for " + surface + " on " + ((Object) h.r0.f(jB))).toString());
        }
        if (c1Var == null) {
            throw new IllegalStateException(("Unable to find the outputId for " + surface + " on " + ((Object) h.r0.f(jB))).toString());
        }
        h.i1 i1VarO = o(captureRequest);
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = s().size();
        for (int i15 = 0; i15 < size; i15++) {
            s().get(i15).J(i1VarO, jB, q1VarL.getValue());
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i1VarO.getRequest().d().size();
        for (int i16 = 0; i16 < size2; i16++) {
            i1VarO.getRequest().d().get(i16).J(i1VarO, jB, q1VarL.getValue());
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        h.i0 i0Var2 = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size3 = s().size();
        for (int i17 = 0; i17 < size3; i17++) {
            s().get(i17).h(i1VarO, jB, q1VarL.getValue(), c1Var.getValue());
        }
        k.h hVar4 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = i1VarO.getRequest().d().size();
        for (int i18 = 0; i18 < size4; i18++) {
            i1VarO.getRequest().d().get(i18).h(i1VarO, jB, q1VarL.getValue(), c1Var.getValue());
        }
        k.h hVar5 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession captureSession, CaptureRequest captureRequest, TotalCaptureResult captureResult) {
        c(captureRequest, captureResult, h.r0.b(captureResult.getFrameNumber()));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession captureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onCaptureFailed");
        this.hasStarted.d0(oq.i0.f148189a);
        h.i1 i1VarO = o(captureRequest);
        m(i1VarO, h.r0.b(captureFailure.getFrameNumber()), new h(i1VarO, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession captureSession, CaptureRequest captureRequest, CaptureResult partialCaptureResult) {
        n(captureRequest, partialCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession captureSession, int captureSequenceId) {
        b(captureSequenceId);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession captureSession, int captureSequenceId, long captureFrameNumber) {
        a(captureSequenceId, captureFrameNumber);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession captureSession, CaptureRequest captureRequest, long captureTimestamp, long captureFrameNumber) {
        f(captureRequest, captureFrameNumber, captureTimestamp);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession session, CaptureRequest captureRequest, long captureTimestamp, long captureFrameNumber) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("onReadoutStarted");
        long jA = h.n1.a(captureTimestamp);
        long jB = h.r0.b(captureFrameNumber);
        h.i1 i1VarO = o(captureRequest);
        h.i0 i0Var = h.i0.f78934a;
        Trace.beginSection("InvokeInternalListeners");
        int size = s().size();
        for (int i15 = 0; i15 < size; i15++) {
            s().get(i15).O(i1VarO, jB, jA);
        }
        k.h hVar2 = k.h.f107050a;
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = i1VarO.getRequest().d().size();
        for (int i16 = 0; i16 < size2; i16++) {
            i1VarO.getRequest().d().get(i16).O(i1VarO, jB, jA);
        }
        k.h hVar3 = k.h.f107050a;
        Trace.endSection();
        Trace.endSection();
    }

    @Override // h.g0
    /* JADX INFO: renamed from: r, reason: from getter */
    public boolean getRepeating() {
        return this.repeating;
    }

    @Override // h.g0
    public List<h.g1.a> s() {
        return this.listeners;
    }

    @Override // h.g0
    public void t(int i15) {
        this._sequenceNumber = Integer.valueOf(i15);
    }

    public String toString() {
        return "Camera2CaptureSequence-" + this.debugId;
    }

    @Override // h.g0
    public List<h.i1> u() {
        return this.captureMetadataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n1(String str, boolean z15, List<CaptureRequest> list, List<? extends h.i1> list2, List<? extends h.g1.a> list3, h.g0.a aVar, Map<Surface, h.q1> map, Map<Surface, h.c1> map2, h.p1 p1Var, h.r1 r1Var) {
        this.cameraId = str;
        this.repeating = z15;
        this.captureRequestList = list;
        this.captureMetadataList = list2;
        this.listeners = list3;
        this.sequenceListener = aVar;
        this.surfaceToStreamMap = map;
        this.surfaceToOutputMap = map2;
        this.streamGraph = p1Var;
        this.strictMode = r1Var;
        this.debugId = q1.a().c();
        this.hasStarted = ju.z.c(null, 1, null);
        if (i().size() != u().size()) {
            throw new IllegalStateException("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        }
    }
}
