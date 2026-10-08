package i;

import android.graphics.ColorSpace;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001e\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010\u001fJ%\u0010+\u001a\u00020\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0017¢\u0006\u0004\b+\u0010\u001fJ-\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020)0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0017¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00132\u0006\u0010!\u001a\u000200H\u0017¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u0004\u0018\u0001052\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u0004\u0018\u0001052\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<H\u0017¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0016H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010AJ)\u0010G\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010D*\u00020C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006`"}, d2 = {"Li/e;", "Li/m2;", "Lh/x;", "cameraMetadata", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Lh/v;", "cameraId", "Lm/d;", "cameraErrorListener", "Lh/w$b;", "interopCaptureSessionListener", "Lk/z;", "threads", "<init>", "(Lh/x;Landroid/hardware/camera2/CameraDevice;Ljava/lang/String;Lm/d;Lh/w$b;Lk/z;Lfr/k;)V", "Li/b4;", "stateCallback", "Loq/r;", "", "j", "(Li/b4;)Loq/r;", "Loq/i0;", "k", "(Li/b4;)V", "l", "", "Landroid/view/Surface;", "outputs", "Li/k2$a;", "T0", "(Ljava/util/List;Li/k2$a;)Z", "Li/h3;", "config", "O0", "(Li/h3;)Z", "Landroid/hardware/camera2/params/InputConfiguration;", "input", "N", "(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Li/k2$a;)Z", "y", "Li/l3;", "outputConfigurations", "M", "Li/j3;", "inputConfig", "u0", "(Li/j3;Ljava/util/List;Li/k2$a;)Z", "Li/z3;", "t0", "(Li/z3;)Z", "Lh/k1;", "template", "Landroid/hardware/camera2/CaptureRequest$Builder;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(I)Landroid/hardware/camera2/CaptureRequest$Builder;", "Landroid/hardware/camera2/TotalCaptureResult;", "inputResult", "V", "(Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;", "Lh/c;", "mode", "a", "(I)V", "E", "()V", "n0", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lh/x;", "b", "Landroid/hardware/camera2/CameraDevice;", "c", "Ljava/lang/String;", "m", "d", "Lm/d;", "e", "Lh/w$b;", "f", "Lk/z;", "Liu/a;", "g", "Liu/a;", "closed", "Liu/e;", "h", "Liu/e;", "_lastStateCallback", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidCameraDevice implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CameraDevice cameraDevice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h.w.b interopCaptureSessionListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final iu.a closed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final iu.e<b4> _lastStateCallback;

    public /* synthetic */ AndroidCameraDevice(h.x xVar, CameraDevice cameraDevice, String str, m.d dVar, h.w.b bVar, k.z zVar, fr.k kVar) {
        this(xVar, cameraDevice, str, dVar, bVar, zVar);
    }

    private final oq.r<Boolean, b4> j(b4 stateCallback) {
        if (!this.closed.b()) {
            return new oq.r<>(Boolean.TRUE, this._lastStateCallback.b(stateCallback));
        }
        l(stateCallback);
        return new oq.r<>(Boolean.FALSE, null);
    }

    private final void k(b4 b4Var) {
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            b4Var.i();
            oq.i0 i0Var = oq.i0.f148189a;
        } finally {
            Trace.endSection();
        }
    }

    private final void l(b4 b4Var) {
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            b4Var.a();
            oq.i0 i0Var = oq.i0.f148189a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // i.m2
    public void E() {
        b4 b4VarC;
        if (!this.closed.a(false, true) || (b4VarC = this._lastStateCallback.c()) == null) {
            return;
        }
        k(b4VarC);
    }

    @Override // i.m2
    public CaptureRequest.Builder H(int template) {
        CaptureRequest.Builder builderCreateCaptureRequest;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#createCaptureRequest-" + getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                builderCreateCaptureRequest = this.cameraDevice.createCaptureRequest(template);
            } catch (Exception e15) {
                if (e15 instanceof CameraAccessException) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                    }
                    dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
                } else if ((e15 instanceof IllegalArgumentException) || (e15 instanceof SecurityException) || (e15 instanceof UnsupportedOperationException) || (e15 instanceof NullPointerException)) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
                    }
                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                } else {
                    if (!(e15 instanceof IllegalStateException)) {
                        throw e15;
                    }
                    k.k.f107055a.a();
                }
                builderCreateCaptureRequest = null;
            }
            Trace.endSection();
            long jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            return builderCreateCaptureRequest;
        } catch (Throwable th4) {
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e3 A[Catch: all -> 0x00d8, TryCatch #4 {all -> 0x00d8, blocks: (B:24:0x00c5, B:32:0x00df, B:34:0x00e3, B:36:0x00eb, B:37:0x0103, B:40:0x0111, B:42:0x0115, B:44:0x0119, B:46:0x011d, B:49:0x0122, B:51:0x0126, B:52:0x012c, B:53:0x012d, B:55:0x0135, B:56:0x014d), top: B:82:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00eb A[Catch: all -> 0x00d8, TryCatch #4 {all -> 0x00d8, blocks: (B:24:0x00c5, B:32:0x00df, B:34:0x00e3, B:36:0x00eb, B:37:0x0103, B:40:0x0111, B:42:0x0115, B:44:0x0119, B:46:0x011d, B:49:0x0122, B:51:0x0126, B:52:0x012c, B:53:0x012d, B:55:0x0135, B:56:0x014d), top: B:82:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0111 A[Catch: all -> 0x00d8, TryCatch #4 {all -> 0x00d8, blocks: (B:24:0x00c5, B:32:0x00df, B:34:0x00e3, B:36:0x00eb, B:37:0x0103, B:40:0x0111, B:42:0x0115, B:44:0x0119, B:46:0x011d, B:49:0x0122, B:51:0x0126, B:52:0x012c, B:53:0x012d, B:55:0x0135, B:56:0x014d), top: B:82:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0135 A[Catch: all -> 0x00d8, TryCatch #4 {all -> 0x00d8, blocks: (B:24:0x00c5, B:32:0x00df, B:34:0x00e3, B:36:0x00eb, B:37:0x0103, B:40:0x0111, B:42:0x0115, B:44:0x0119, B:46:0x011d, B:49:0x0122, B:51:0x0126, B:52:0x012c, B:53:0x012d, B:55:0x0135, B:56:0x014d), top: B:82:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    /* JADX WARN: Code duplicated, block: B:62:0x019a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c6  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00eb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0135, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0171, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01a0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // i.m2
    public boolean M(List<? extends l3> outputConfigurations, k2.a stateCallback) throws Throwable {
        k.h hVar;
        long j15;
        int i15;
        int i16;
        double d15;
        b4 b4Var;
        boolean z15;
        boolean z16;
        oq.i0 i0Var;
        ?? r15;
        long jC;
        k.k kVar;
        oq.r<Boolean, b4> rVarJ = j(stateCallback);
        boolean zBooleanValue = rVarJ.a().booleanValue();
        b4 b4VarB = rVarJ.b();
        if (!zBooleanValue) {
            return false;
        }
        if (b4VarB != null) {
            k(b4VarB);
        }
        k.h hVar2 = k.h.f107050a;
        String str = "CXCP#createCaptureSessionByOutputConfigurations-" + getCameraId();
        long jA = hVar2.g().a();
        try {
            Trace.beginSection(str);
            d15 = 1000000.0d;
            try {
                String cameraId = getCameraId();
                m.d dVar = this.cameraErrorListener;
                try {
                    CameraDevice cameraDevice = this.cameraDevice;
                    List<? extends l3> list = outputConfigurations;
                    ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((OutputConfiguration) ((l3) it.next()).c0(fr.q0.c(OutputConfiguration.class)));
                    }
                    b4Var = b4VarB;
                    try {
                        hVar = hVar2;
                        j15 = jA;
                        i15 = 3;
                        i16 = 1;
                        r15 = 1;
                        z15 = true;
                        try {
                            try {
                                t.a(cameraDevice, arrayList, new i(this, stateCallback, b4Var, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads.i()), this.threads.i());
                                i0Var = oq.i0.f148189a;
                                z16 = false;
                            } catch (Exception e15) {
                                e = e15;
                                if (!(e instanceof CameraAccessException)) {
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    }
                                    dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                } else {
                                    if (e instanceof IllegalArgumentException) {
                                    }
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    }
                                    z16 = false;
                                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                    i0Var = null;
                                    r15 = z15;
                                }
                                z16 = false;
                                i0Var = null;
                                r15 = z15;
                            }
                            Trace.endSection();
                            jC = k.i.c(hVar.g().a() - j15);
                            kVar = k.k.f107055a;
                            if (kVar.a()) {
                                k.c0 c0Var = k.c0.f107031a;
                                String.format(null, "%." + i15 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, (int) r15));
                            }
                            if (i0Var == null) {
                                if (kVar.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                }
                                if (b4Var != null) {
                                    l(b4Var);
                                }
                            }
                            return i0Var != null ? r15 : z16;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            long jC2 = k.i.c(hVar.g().a() - j15);
                            if (k.k.f107055a.a()) {
                                k.c0 c0Var2 = k.c0.f107031a;
                                String.format(null, "%." + i15 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / d15)}, i16));
                            }
                            throw th;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        hVar = hVar2;
                        j15 = jA;
                        i15 = 3;
                        z15 = true;
                        if (!(e instanceof CameraAccessException)) {
                            if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                if (k.k.f107055a.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                }
                                z16 = false;
                                dVar.a(cameraId, h.q.INSTANCE.m(), false);
                            } else {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                k.k.f107055a.a();
                            }
                            i0Var = null;
                            r15 = z15;
                            Trace.endSection();
                            jC = k.i.c(hVar.g().a() - j15);
                            kVar = k.k.f107055a;
                            if (kVar.a()) {
                                k.c0 c0Var3 = k.c0.f107031a;
                                String.format(null, "%." + i15 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, (int) r15));
                            }
                            if (i0Var == null) {
                                if (kVar.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                }
                                if (b4Var != null) {
                                    l(b4Var);
                                }
                            }
                            if (i0Var != null) {
                            }
                        }
                        if (k.k.f107055a.d()) {
                            io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        }
                        dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                        z16 = false;
                        i0Var = null;
                        r15 = z15;
                        Trace.endSection();
                        jC = k.i.c(hVar.g().a() - j15);
                        kVar = k.k.f107055a;
                        if (kVar.a()) {
                            k.c0 c0Var4 = k.c0.f107031a;
                            String.format(null, "%." + i15 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, (int) r15));
                        }
                        if (i0Var == null) {
                            if (kVar.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                            }
                            if (b4Var != null) {
                                l(b4Var);
                            }
                        }
                        if (i0Var != null) {
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                    b4Var = b4VarB;
                }
            } catch (Throwable th5) {
                th = th5;
                hVar = hVar2;
                j15 = jA;
                i15 = 3;
                i16 = 1;
            }
        } catch (Throwable th6) {
            th = th6;
            hVar = hVar2;
            j15 = jA;
            i15 = 3;
            i16 = 1;
            d15 = 1000000.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c3 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:17:0x0089, B:33:0x00bf, B:35:0x00c3, B:37:0x00cb, B:38:0x00e3, B:41:0x00f1, B:43:0x00f5, B:45:0x00f9, B:47:0x00fd, B:50:0x0102, B:52:0x0106, B:53:0x010c, B:54:0x010d, B:56:0x0115, B:57:0x012d), top: B:81:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:17:0x0089, B:33:0x00bf, B:35:0x00c3, B:37:0x00cb, B:38:0x00e3, B:41:0x00f1, B:43:0x00f5, B:45:0x00f9, B:47:0x00fd, B:50:0x0102, B:52:0x0106, B:53:0x010c, B:54:0x010d, B:56:0x0115, B:57:0x012d), top: B:81:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:17:0x0089, B:33:0x00bf, B:35:0x00c3, B:37:0x00cb, B:38:0x00e3, B:41:0x00f1, B:43:0x00f5, B:45:0x00f9, B:47:0x00fd, B:50:0x0102, B:52:0x0106, B:53:0x010c, B:54:0x010d, B:56:0x0115, B:57:0x012d), top: B:81:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:17:0x0089, B:33:0x00bf, B:35:0x00c3, B:37:0x00cb, B:38:0x00e3, B:41:0x00f1, B:43:0x00f5, B:45:0x00f9, B:47:0x00fd, B:50:0x0102, B:52:0x0106, B:53:0x010c, B:54:0x010d, B:56:0x0115, B:57:0x012d), top: B:81:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cf  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00cb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0115, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0150, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0180, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01cf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v0, types: [k.h] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8, types: [k.h] */
    @Override // i.m2
    public boolean N(InputConfiguration input, List<? extends Surface> outputs, k2.a stateCallback) throws Throwable {
        double d15;
        ?? r15;
        Locale locale;
        long jC;
        b4 b4Var;
        ?? r19;
        boolean z15;
        boolean z16;
        oq.i0 i0Var;
        ?? r110;
        ?? r16;
        long jC2;
        k.k kVar;
        oq.r<Boolean, b4> rVarJ = j(stateCallback);
        boolean zBooleanValue = rVarJ.a().booleanValue();
        b4 b4VarB = rVarJ.b();
        if (!zBooleanValue) {
            return false;
        }
        if (b4VarB != null) {
            k(b4VarB);
        }
        ?? r17 = k.h.f107050a;
        String str = "CXCP#createReprocessableCaptureSession-" + getCameraId();
        long jA = r17.g().a();
        try {
            Trace.beginSection(str);
            d15 = 1000000.0d;
            try {
                try {
                    String cameraId = getCameraId();
                    m.d dVar = this.cameraErrorListener;
                    try {
                        try {
                            b4Var = b4VarB;
                            try {
                                try {
                                    r19 = r17;
                                    z15 = true;
                                    try {
                                        this.cameraDevice.createReprocessableCaptureSession(input, outputs, new i(this, stateCallback, b4Var, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads.i()), this.threads.i());
                                        i0Var = oq.i0.f148189a;
                                        z16 = false;
                                        r16 = z15;
                                        r110 = r19;
                                    } catch (Exception e15) {
                                        e = e15;
                                        if (!(e instanceof CameraAccessException)) {
                                            if (k.k.f107055a.d()) {
                                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                            }
                                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                        } else {
                                            if (e instanceof IllegalArgumentException) {
                                            }
                                            if (k.k.f107055a.d()) {
                                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            }
                                            z16 = false;
                                            dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                            i0Var = null;
                                            r16 = z15;
                                            r110 = r19;
                                        }
                                        z16 = false;
                                        i0Var = null;
                                        r16 = z15;
                                        r110 = r19;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    r19 = r17;
                                    z15 = true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r17 = 1;
                                    locale = null;
                                    r15 = r17;
                                    Trace.endSection();
                                    jC = k.i.c(r17.g().a() - jA);
                                    if (k.k.f107055a.a()) {
                                        k.c0 c0Var = k.c0.f107031a;
                                        String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, (int) r15));
                                    }
                                    throw th;
                                }
                            } catch (Exception e17) {
                                e = e17;
                                r19 = r17;
                                z15 = true;
                                if (!(e instanceof CameraAccessException)) {
                                    if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        if (k.k.f107055a.d()) {
                                            io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        }
                                        z16 = false;
                                        dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        k.k.f107055a.a();
                                    }
                                    i0Var = null;
                                    r16 = z15;
                                    r110 = r19;
                                    Trace.endSection();
                                    jC2 = k.i.c(r110.g().a() - jA);
                                    kVar = k.k.f107055a;
                                    if (kVar.a()) {
                                        k.c0 c0Var2 = k.c0.f107031a;
                                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                                    }
                                    if (i0Var == null) {
                                        if (kVar.d()) {
                                            io.sentry.android.core.c2.g("CXCP", "Failed to create reprocess session from " + this.cameraDevice + ". Finalizing previous session");
                                        }
                                        if (b4Var != null) {
                                            l(b4Var);
                                        }
                                    }
                                    return i0Var != null ? r16 : z16;
                                }
                                if (k.k.f107055a.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                }
                                dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                z16 = false;
                                i0Var = null;
                                r16 = z15;
                                r110 = r19;
                                Trace.endSection();
                                jC2 = k.i.c(r110.g().a() - jA);
                                kVar = k.k.f107055a;
                                if (kVar.a()) {
                                    k.c0 c0Var3 = k.c0.f107031a;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                                }
                                if (i0Var == null) {
                                    if (kVar.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to create reprocess session from " + this.cameraDevice + ". Finalizing previous session");
                                    }
                                    if (b4Var != null) {
                                        l(b4Var);
                                    }
                                }
                                if (i0Var != null) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r17 = 1;
                        }
                    } catch (Exception e18) {
                        e = e18;
                        b4Var = b4VarB;
                    }
                    Trace.endSection();
                    jC2 = k.i.c(r110.g().a() - jA);
                    kVar = k.k.f107055a;
                    if (kVar.a()) {
                        k.c0 c0Var4 = k.c0.f107031a;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                    }
                    if (i0Var == null) {
                        if (kVar.d()) {
                            io.sentry.android.core.c2.g("CXCP", "Failed to create reprocess session from " + this.cameraDevice + ". Finalizing previous session");
                        }
                        if (b4Var != null) {
                            l(b4Var);
                        }
                    }
                    if (i0Var != null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                r15 = 1;
                locale = null;
                Trace.endSection();
                jC = k.i.c(r17.g().a() - jA);
                if (k.k.f107055a.a()) {
                    k.c0 c0Var5 = k.c0.f107031a;
                    String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, (int) r15));
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            d15 = 1000000.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011e A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:29:0x00d8, B:31:0x00e5, B:33:0x00eb, B:35:0x00fb, B:40:0x0104, B:41:0x010b, B:42:0x010c, B:46:0x011a, B:48:0x011e, B:50:0x0126, B:51:0x013e, B:54:0x014c, B:56:0x0150, B:58:0x0154, B:60:0x0158, B:63:0x015d, B:65:0x0161, B:66:0x0167, B:67:0x0168, B:69:0x0170, B:70:0x0188), top: B:99:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0126 A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:29:0x00d8, B:31:0x00e5, B:33:0x00eb, B:35:0x00fb, B:40:0x0104, B:41:0x010b, B:42:0x010c, B:46:0x011a, B:48:0x011e, B:50:0x0126, B:51:0x013e, B:54:0x014c, B:56:0x0150, B:58:0x0154, B:60:0x0158, B:63:0x015d, B:65:0x0161, B:66:0x0167, B:67:0x0168, B:69:0x0170, B:70:0x0188), top: B:99:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014c A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:29:0x00d8, B:31:0x00e5, B:33:0x00eb, B:35:0x00fb, B:40:0x0104, B:41:0x010b, B:42:0x010c, B:46:0x011a, B:48:0x011e, B:50:0x0126, B:51:0x013e, B:54:0x014c, B:56:0x0150, B:58:0x0154, B:60:0x0158, B:63:0x015d, B:65:0x0161, B:66:0x0167, B:67:0x0168, B:69:0x0170, B:70:0x0188), top: B:99:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0170 A[Catch: all -> 0x00ff, TryCatch #5 {all -> 0x00ff, blocks: (B:29:0x00d8, B:31:0x00e5, B:33:0x00eb, B:35:0x00fb, B:40:0x0104, B:41:0x010b, B:42:0x010c, B:46:0x011a, B:48:0x011e, B:50:0x0126, B:51:0x013e, B:54:0x014c, B:56:0x0150, B:58:0x0154, B:60:0x0158, B:63:0x015d, B:65:0x0161, B:66:0x0167, B:67:0x0168, B:69:0x0170, B:70:0x0188), top: B:99:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0200  */
    /* JADX WARN: Code duplicated, block: B:83:0x0202  */
    /* JADX WARN: Code duplicated, block: B:89:0x0228  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0126, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0170, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x01ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x0228, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // i.m2
    public boolean O0(ExtensionSessionConfigData config) throws Throwable {
        int i15;
        double d15;
        long jC;
        b4 b4Var;
        k.h hVar;
        long j15;
        boolean z15;
        boolean z16;
        oq.i0 i0Var;
        ?? r15;
        long jC2;
        k.k kVar;
        o2.a extensionStateCallback = config.getExtensionStateCallback();
        if (extensionStateCallback == null) {
            throw new IllegalStateException("extensionStateCallback must be set to create Extension session");
        }
        if (config.getExtensionMode() == null) {
            throw new IllegalStateException("extensionMode must be set to create Extension session");
        }
        oq.r<Boolean, b4> rVarJ = j(extensionStateCallback);
        boolean zBooleanValue = rVarJ.a().booleanValue();
        b4 b4VarB = rVarJ.b();
        if (!zBooleanValue) {
            return false;
        }
        if (b4VarB != null) {
            k(b4VarB);
        }
        k.h hVar2 = k.h.f107050a;
        String str = "CXCP#createExtensionSession-" + getCameraId();
        long jA = hVar2.g().a();
        try {
            Trace.beginSection(str);
            d15 = 1000000.0d;
            try {
                try {
                    String cameraId = getCameraId();
                    m.d dVar = this.cameraErrorListener;
                    try {
                        int iIntValue = config.getExtensionMode().intValue();
                        List<l3> listD = config.d();
                        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                        Iterator it = listD.iterator();
                        while (it.hasNext()) {
                            arrayList.add((OutputConfiguration) ((l3) it.next()).c0(fr.q0.c(OutputConfiguration.class)));
                        }
                        b4Var = b4VarB;
                        try {
                            hVar = hVar2;
                            j15 = jA;
                            z15 = true;
                            r15 = 1;
                            try {
                                ExtensionSessionConfiguration extensionSessionConfigurationF = e0.f(iIntValue, arrayList, config.getExecutor(), new l(this, extensionStateCallback, b4Var, this.cameraErrorListener, this.interopCaptureSessionListener, config.getExecutor()));
                                if (config.getPostviewOutputConfiguration() != null && Build.VERSION.SDK_INT >= 34) {
                                    OutputConfiguration outputConfiguration = (OutputConfiguration) config.getPostviewOutputConfiguration().c0(fr.q0.c(OutputConfiguration.class));
                                    if (outputConfiguration == null) {
                                        throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                                    }
                                    h0.e(extensionSessionConfigurationF, outputConfiguration);
                                }
                                e0.b(this.cameraDevice, extensionSessionConfigurationF);
                                i0Var = oq.i0.f148189a;
                                z16 = false;
                            } catch (Exception e15) {
                                e = e15;
                                if (!(e instanceof CameraAccessException)) {
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    }
                                    dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                } else {
                                    if (e instanceof IllegalArgumentException) {
                                    }
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    }
                                    z16 = false;
                                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                    i0Var = null;
                                    r15 = z15;
                                }
                                z16 = false;
                                i0Var = null;
                                r15 = z15;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            hVar = hVar2;
                            j15 = jA;
                            z15 = true;
                            if (!(e instanceof CameraAccessException)) {
                                if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    }
                                    z16 = false;
                                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    k.k.f107055a.a();
                                }
                                i0Var = null;
                                r15 = z15;
                                Trace.endSection();
                                jC2 = k.i.c(hVar.g().a() - j15);
                                kVar = k.k.f107055a;
                                if (kVar.a()) {
                                    k.c0 c0Var = k.c0.f107031a;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r15));
                                }
                                if (i0Var == null) {
                                    if (kVar.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to create extension session from " + this.cameraDevice + ". Finalizing previous session");
                                    }
                                    if (b4Var != null) {
                                        l(b4Var);
                                    }
                                }
                                return i0Var != null ? r15 : z16;
                            }
                            if (k.k.f107055a.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            }
                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                            z16 = false;
                            i0Var = null;
                            r15 = z15;
                            Trace.endSection();
                            jC2 = k.i.c(hVar.g().a() - j15);
                            kVar = k.k.f107055a;
                            if (kVar.a()) {
                                k.c0 c0Var2 = k.c0.f107031a;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r15));
                            }
                            if (i0Var == null) {
                                if (kVar.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to create extension session from " + this.cameraDevice + ". Finalizing previous session");
                                }
                                if (b4Var != null) {
                                    l(b4Var);
                                }
                            }
                            if (i0Var != null) {
                            }
                        }
                    } catch (Exception e17) {
                        e = e17;
                        b4Var = b4VarB;
                    }
                    Trace.endSection();
                    jC2 = k.i.c(hVar.g().a() - j15);
                    kVar = k.k.f107055a;
                    if (kVar.a()) {
                        k.c0 c0Var3 = k.c0.f107031a;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r15));
                    }
                    if (i0Var == null) {
                        if (kVar.d()) {
                            io.sentry.android.core.c2.g("CXCP", "Failed to create extension session from " + this.cameraDevice + ". Finalizing previous session");
                        }
                        if (b4Var != null) {
                            l(b4Var);
                        }
                    }
                    if (i0Var != null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i15 = 1;
                    Trace.endSection();
                    jC = k.i.c(hVar2.g().a() - jA);
                    if (k.k.f107055a.a()) {
                        k.c0 c0Var4 = k.c0.f107031a;
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, i15));
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                Trace.endSection();
                jC = k.i.c(hVar2.g().a() - jA);
                if (k.k.f107055a.a()) {
                    k.c0 c0Var5 = k.c0.f107031a;
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, i15));
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            i15 = 1;
            d15 = 1000000.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cd  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00c9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0113, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x014e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x017e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01cd, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    @Override // i.m2
    public boolean T0(List<? extends Surface> outputs, k2.a stateCallback) throws Throwable {
        double d15;
        ?? r15;
        Locale locale;
        long jC;
        b4 b4Var;
        boolean z15;
        boolean z16;
        oq.i0 i0Var;
        ?? r16;
        long jC2;
        k.k kVar;
        oq.r<Boolean, b4> rVarJ = j(stateCallback);
        boolean zBooleanValue = rVarJ.a().booleanValue();
        b4 b4VarB = rVarJ.b();
        if (!zBooleanValue) {
            return false;
        }
        if (b4VarB != null) {
            k(b4VarB);
        }
        k.h hVar = k.h.f107050a;
        String str = "CXCP#createCaptureSession-" + getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            d15 = 1000000.0d;
            try {
                String cameraId = getCameraId();
                m.d dVar = this.cameraErrorListener;
                try {
                    try {
                        b4Var = b4VarB;
                        try {
                            try {
                                hVar = hVar;
                                z15 = true;
                                try {
                                    try {
                                        this.cameraDevice.createCaptureSession(outputs, new i(this, stateCallback, b4Var, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads.i()), this.threads.i());
                                        i0Var = oq.i0.f148189a;
                                        z16 = false;
                                        r16 = z15;
                                    } catch (Exception e15) {
                                        e = e15;
                                        if (!(e instanceof CameraAccessException)) {
                                            if (k.k.f107055a.d()) {
                                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                            }
                                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                        } else {
                                            if (e instanceof IllegalArgumentException) {
                                            }
                                            if (k.k.f107055a.d()) {
                                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            }
                                            z16 = false;
                                            dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                            i0Var = null;
                                            r16 = z15;
                                        }
                                        z16 = false;
                                        i0Var = null;
                                        r16 = z15;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    locale = null;
                                    r15 = z15;
                                    Trace.endSection();
                                    jC = k.i.c(hVar.g().a() - jA);
                                    if (k.k.f107055a.a()) {
                                        k.c0 c0Var = k.c0.f107031a;
                                        String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, (int) r15));
                                    }
                                    throw th;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                hVar = hVar;
                                z15 = true;
                            } catch (Throwable th5) {
                                th = th5;
                                hVar = hVar;
                                z15 = true;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            hVar = hVar;
                            z15 = true;
                            if (!(e instanceof CameraAccessException)) {
                                if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    }
                                    z16 = false;
                                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    k.k.f107055a.a();
                                }
                                i0Var = null;
                                r16 = z15;
                                Trace.endSection();
                                jC2 = k.i.c(hVar.g().a() - jA);
                                kVar = k.k.f107055a;
                                if (kVar.a()) {
                                    k.c0 c0Var2 = k.c0.f107031a;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                                }
                                if (i0Var == null) {
                                    if (kVar.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                    }
                                    if (b4Var != null) {
                                        l(b4Var);
                                    }
                                }
                                return i0Var != null ? r16 : z16;
                            }
                            if (k.k.f107055a.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            }
                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                            z16 = false;
                            i0Var = null;
                            r16 = z15;
                            Trace.endSection();
                            jC2 = k.i.c(hVar.g().a() - jA);
                            kVar = k.k.f107055a;
                            if (kVar.a()) {
                                k.c0 c0Var3 = k.c0.f107031a;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                            }
                            if (i0Var == null) {
                                if (kVar.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                }
                                if (b4Var != null) {
                                    l(b4Var);
                                }
                            }
                            if (i0Var != null) {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        hVar = hVar;
                        z15 = true;
                    }
                } catch (Exception e18) {
                    e = e18;
                    b4Var = b4VarB;
                }
                Trace.endSection();
                jC2 = k.i.c(hVar.g().a() - jA);
                kVar = k.k.f107055a;
                if (kVar.a()) {
                    k.c0 c0Var4 = k.c0.f107031a;
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                }
                if (i0Var == null) {
                    if (kVar.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                    }
                    if (b4Var != null) {
                        l(b4Var);
                    }
                }
                if (i0Var != null) {
                }
            } catch (Throwable th7) {
                th = th7;
                r15 = 1;
                locale = null;
                Trace.endSection();
                jC = k.i.c(hVar.g().a() - jA);
                if (k.k.f107055a.a()) {
                    k.c0 c0Var5 = k.c0.f107031a;
                    String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, (int) r15));
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            d15 = 1000000.0d;
        }
    }

    @Override // i.m2
    public CaptureRequest.Builder V(TotalCaptureResult inputResult) {
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        k.h hVar = k.h.f107050a;
        String str = "CXCP#createReprocessCaptureRequest-" + getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            String cameraId = getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                builderCreateReprocessCaptureRequest = this.cameraDevice.createReprocessCaptureRequest(inputResult);
            } catch (Exception e15) {
                if (e15 instanceof CameraAccessException) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                    }
                    dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
                } else if ((e15 instanceof IllegalArgumentException) || (e15 instanceof SecurityException) || (e15 instanceof UnsupportedOperationException) || (e15 instanceof NullPointerException)) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
                    }
                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                } else {
                    if (!(e15 instanceof IllegalStateException)) {
                        throw e15;
                    }
                    k.k.f107055a.a();
                }
                builderCreateReprocessCaptureRequest = null;
            }
            Trace.endSection();
            long jC = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
            }
            return builderCreateReprocessCaptureRequest;
        } catch (Throwable th4) {
            Trace.endSection();
            long jC2 = k.i.c(hVar.g().a() - jA);
            if (k.k.f107055a.a()) {
                k.c0 c0Var2 = k.c0.f107031a;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, 1));
            }
            throw th4;
        }
    }

    @Override // i.n0.a
    public void a(int mode) {
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String cameraId = getCameraId();
            m.d dVar = this.cameraErrorListener;
            try {
                y.b(this.cameraDevice, mode);
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Exception e15) {
                if (e15 instanceof CameraAccessException) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                    }
                    dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e15), true);
                } else if ((e15 instanceof IllegalArgumentException) || (e15 instanceof SecurityException) || (e15 instanceof UnsupportedOperationException) || (e15 instanceof NullPointerException)) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
                    }
                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                } else {
                    if (!(e15 instanceof IllegalStateException)) {
                        throw e15;
                    }
                    k.k.f107055a.a();
                }
            }
            Trace.endSection();
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(CameraDevice.class))) {
            return (T) this.cameraDevice;
        }
        return null;
    }

    @Override // i.m2
    /* JADX INFO: renamed from: m, reason: from getter */
    public String getCameraId() {
        return this.cameraId;
    }

    @Override // i.m2
    public void n0() {
        if (!this.closed.b()) {
            throw new IllegalStateException("Check failed.");
        }
        b4 b4VarB = this._lastStateCallback.b(null);
        if (b4VarB != null) {
            l(b4VarB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029c A[Catch: all -> 0x00fb, TryCatch #8 {all -> 0x00fb, blocks: (B:26:0x00d8, B:28:0x00e5, B:30:0x00eb, B:35:0x0102, B:36:0x0134, B:39:0x0140, B:41:0x0146, B:49:0x018f, B:51:0x01a2, B:52:0x01be, B:54:0x01c4, B:55:0x01d2, B:56:0x01de, B:58:0x01e4, B:60:0x01f6, B:62:0x0203, B:63:0x0207, B:65:0x021e, B:67:0x0227, B:68:0x022a, B:70:0x022c, B:71:0x022f, B:42:0x014a, B:44:0x0152, B:46:0x016e, B:48:0x0176, B:78:0x0242, B:80:0x0246, B:82:0x024e, B:83:0x0266, B:86:0x0276, B:88:0x027c, B:90:0x0280, B:92:0x0284, B:95:0x0289, B:97:0x028d, B:98:0x0293, B:99:0x0294, B:101:0x029c, B:102:0x02b4), top: B:128:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:108:0x0301  */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:112:0x0326  */
    /* JADX WARN: Code duplicated, block: B:114:0x032d  */
    /* JADX WARN: Code duplicated, block: B:115:0x032f  */
    /* JADX WARN: Code duplicated, block: B:123:0x035d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0246 A[Catch: all -> 0x00fb, TryCatch #8 {all -> 0x00fb, blocks: (B:26:0x00d8, B:28:0x00e5, B:30:0x00eb, B:35:0x0102, B:36:0x0134, B:39:0x0140, B:41:0x0146, B:49:0x018f, B:51:0x01a2, B:52:0x01be, B:54:0x01c4, B:55:0x01d2, B:56:0x01de, B:58:0x01e4, B:60:0x01f6, B:62:0x0203, B:63:0x0207, B:65:0x021e, B:67:0x0227, B:68:0x022a, B:70:0x022c, B:71:0x022f, B:42:0x014a, B:44:0x0152, B:46:0x016e, B:48:0x0176, B:78:0x0242, B:80:0x0246, B:82:0x024e, B:83:0x0266, B:86:0x0276, B:88:0x027c, B:90:0x0280, B:92:0x0284, B:95:0x0289, B:97:0x028d, B:98:0x0293, B:99:0x0294, B:101:0x029c, B:102:0x02b4), top: B:128:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x024e A[Catch: all -> 0x00fb, TryCatch #8 {all -> 0x00fb, blocks: (B:26:0x00d8, B:28:0x00e5, B:30:0x00eb, B:35:0x0102, B:36:0x0134, B:39:0x0140, B:41:0x0146, B:49:0x018f, B:51:0x01a2, B:52:0x01be, B:54:0x01c4, B:55:0x01d2, B:56:0x01de, B:58:0x01e4, B:60:0x01f6, B:62:0x0203, B:63:0x0207, B:65:0x021e, B:67:0x0227, B:68:0x022a, B:70:0x022c, B:71:0x022f, B:42:0x014a, B:44:0x0152, B:46:0x016e, B:48:0x0176, B:78:0x0242, B:80:0x0246, B:82:0x024e, B:83:0x0266, B:86:0x0276, B:88:0x027c, B:90:0x0280, B:92:0x0284, B:95:0x0289, B:97:0x028d, B:98:0x0293, B:99:0x0294, B:101:0x029c, B:102:0x02b4), top: B:128:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0276 A[Catch: all -> 0x00fb, TryCatch #8 {all -> 0x00fb, blocks: (B:26:0x00d8, B:28:0x00e5, B:30:0x00eb, B:35:0x0102, B:36:0x0134, B:39:0x0140, B:41:0x0146, B:49:0x018f, B:51:0x01a2, B:52:0x01be, B:54:0x01c4, B:55:0x01d2, B:56:0x01de, B:58:0x01e4, B:60:0x01f6, B:62:0x0203, B:63:0x0207, B:65:0x021e, B:67:0x0227, B:68:0x022a, B:70:0x022c, B:71:0x022f, B:42:0x014a, B:44:0x0152, B:46:0x016e, B:48:0x0176, B:78:0x0242, B:80:0x0246, B:82:0x024e, B:83:0x0266, B:86:0x0276, B:88:0x027c, B:90:0x0280, B:92:0x0284, B:95:0x0289, B:97:0x028d, B:98:0x0293, B:99:0x0294, B:101:0x029c, B:102:0x02b4), top: B:128:0x0062 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x029c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x02d8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x0307, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x035d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x024e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v7, types: [long] */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7, types: [long] */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [long] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.StringBuilder] */
    @Override // i.m2
    public boolean t0(z3 config) throws Throwable {
        k.h hVar;
        ?? r15;
        int i15;
        double d15;
        long jC;
        ?? r19;
        int i16;
        boolean z15;
        boolean z16;
        oq.i0 i0Var;
        ?? r110;
        ?? r16;
        long jC2;
        k.k kVar;
        oq.r<Boolean, b4> rVarJ = j(config.getStateCallback());
        boolean zBooleanValue = rVarJ.a().booleanValue();
        b4 b4VarB = rVarJ.b();
        if (!zBooleanValue) {
            return false;
        }
        if (b4VarB != null) {
            k(b4VarB);
            oq.i0 i0Var2 = oq.i0.f148189a;
        }
        k.h hVar2 = k.h.f107050a;
        String str = "CXCP#createCaptureSession-" + getCameraId();
        ?? A = hVar2.g().a();
        Locale locale = null;
        try {
            Trace.beginSection(str);
            String cameraId = getCameraId();
            d15 = 1000000.0d;
            try {
                try {
                    m.d dVar = this.cameraErrorListener;
                    try {
                        int sessionType = config.getSessionType();
                        List<l3> listC = config.c();
                        hVar = hVar2;
                        try {
                            try {
                                ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
                                Iterator it = listC.iterator();
                                while (it.hasNext()) {
                                    try {
                                        arrayList.add((OutputConfiguration) ((l3) it.next()).c0(fr.q0.c(OutputConfiguration.class)));
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r15 = 3;
                                        i15 = 1;
                                        Trace.endSection();
                                        jC = k.i.c(hVar.g().a() - A);
                                        if (k.k.f107055a.a()) {
                                            k.c0 c0Var = k.c0.f107031a;
                                            String.format(locale, "%." + r15 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, i15));
                                        }
                                        throw th;
                                    }
                                }
                                cameraId = cameraId;
                                ?? r111 = A;
                                i16 = 3;
                                z15 = true;
                                r16 = 1;
                                try {
                                    SessionConfiguration sessionConfigurationG = w.g(sessionType, arrayList, config.getExecutor(), new i(this, config.getStateCallback(), b4VarB, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads.i()));
                                    if (config.b() != null) {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            w.j(sessionConfigurationG, e0.g(config.b(), getCameraId()));
                                        } else {
                                            w.j(sessionConfigurationG, new InputConfiguration(((InputConfigData) pq.v.P0(config.b())).getWidth(), ((InputConfigData) pq.v.P0(config.b())).getHeight(), ((InputConfigData) pq.v.P0(config.b())).getFormat()));
                                        }
                                    }
                                    String sessionColorSpace = config.getSessionColorSpace();
                                    if (Build.VERSION.SDK_INT >= 34 && sessionColorSpace != null) {
                                        ColorSpace.Named namedD = h.k.d(sessionColorSpace);
                                        if (namedD != null) {
                                            h0.d(sessionConfigurationG, namedD);
                                        } else if (k.k.f107055a.d()) {
                                            io.sentry.android.core.c2.g("CXCP", "Provided session color space " + sessionColorSpace + " is not supported");
                                        }
                                    } else if (sessionColorSpace != null && k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to set session color space to " + sessionColorSpace + ", at least API level 34 is required");
                                    }
                                    k.h hVar3 = k.h.f107050a;
                                    try {
                                        Trace.beginSection("createCaptureRequest");
                                        CaptureRequest.Builder builderCreateCaptureRequest = this.cameraDevice.createCaptureRequest(config.getSessionTemplateId());
                                        Trace.endSection();
                                        Set<CaptureRequest.Key<?>> setH0 = this.cameraMetadata.H0();
                                        ArrayList arrayList2 = new ArrayList(pq.v.y(setH0, 10));
                                        Iterator it4 = setH0.iterator();
                                        while (it4.hasNext()) {
                                            arrayList2.add(((CaptureRequest.Key) it4.next()).getName());
                                        }
                                        for (Map.Entry<?, Object> entry : config.e().entrySet()) {
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if ((key instanceof CaptureRequest.Key) && arrayList2.contains(((CaptureRequest.Key) key).getName())) {
                                                h.l1.b(builderCreateCaptureRequest, key, value);
                                            }
                                        }
                                        w.l(sessionConfigurationG, builderCreateCaptureRequest.build());
                                        k.h hVar4 = k.h.f107050a;
                                        try {
                                            Trace.beginSection("Api28Compat.createCaptureSession");
                                            w.a(this.cameraDevice, sessionConfigurationG);
                                            oq.i0 i0Var3 = oq.i0.f148189a;
                                            Trace.endSection();
                                            i0Var = oq.i0.f148189a;
                                            z16 = false;
                                            r110 = r111;
                                        } catch (Throwable th5) {
                                            Trace.endSection();
                                            throw th5;
                                        }
                                    } catch (Throwable th6) {
                                        Trace.endSection();
                                        throw th6;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    r19 = r111;
                                    if (!(e instanceof CameraAccessException)) {
                                        if (k.k.f107055a.d()) {
                                            io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                        }
                                        dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                    } else {
                                        String str2 = cameraId;
                                        if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                            if (k.k.f107055a.d()) {
                                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            }
                                            z16 = false;
                                            dVar.a(str2, h.q.INSTANCE.m(), false);
                                        } else {
                                            if (!(e instanceof IllegalStateException)) {
                                                throw e;
                                            }
                                            k.k.f107055a.a();
                                        }
                                        i0Var = null;
                                        r16 = z15;
                                        r110 = r19;
                                    }
                                    z16 = false;
                                    i0Var = null;
                                    r16 = z15;
                                    r110 = r19;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                A = 3;
                                i15 = 1;
                                locale = null;
                                r15 = A;
                                Trace.endSection();
                                jC = k.i.c(hVar.g().a() - A);
                                if (k.k.f107055a.a()) {
                                    k.c0 c0Var2 = k.c0.f107031a;
                                    String.format(locale, "%." + r15 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, i15));
                                }
                                throw th;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            r19 = A;
                            i16 = 3;
                            z15 = true;
                            if (!(e instanceof CameraAccessException)) {
                                String str3 = cameraId;
                                if (e instanceof IllegalArgumentException) {
                                }
                                if (k.k.f107055a.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                }
                                z16 = false;
                                dVar.a(str3, h.q.INSTANCE.m(), false);
                                i0Var = null;
                                r16 = z15;
                                r110 = r19;
                                Trace.endSection();
                                jC2 = k.i.c(hVar.g().a() - r110);
                                kVar = k.k.f107055a;
                                if (kVar.a()) {
                                    k.c0 c0Var3 = k.c0.f107031a;
                                    String.format(null, "%." + i16 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                                }
                                if (i0Var == null) {
                                    if (kVar.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                    }
                                    if (b4VarB != null) {
                                        l(b4VarB);
                                        oq.i0 i0Var4 = oq.i0.f148189a;
                                    }
                                }
                                return i0Var != null ? r16 : z16;
                            }
                            if (k.k.f107055a.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            }
                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                            z16 = false;
                            i0Var = null;
                            r16 = z15;
                            r110 = r19;
                            Trace.endSection();
                            jC2 = k.i.c(hVar.g().a() - r110);
                            kVar = k.k.f107055a;
                            if (kVar.a()) {
                                k.c0 c0Var4 = k.c0.f107031a;
                                String.format(null, "%." + i16 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                            }
                            if (i0Var == null) {
                                if (kVar.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                }
                                if (b4VarB != null) {
                                    l(b4VarB);
                                    oq.i0 i0Var5 = oq.i0.f148189a;
                                }
                            }
                            if (i0Var != null) {
                            }
                        }
                    } catch (Exception e17) {
                        e = e17;
                        hVar = hVar2;
                    } catch (Throwable th8) {
                        th = th8;
                        hVar = hVar2;
                    }
                    Trace.endSection();
                    jC2 = k.i.c(hVar.g().a() - r110);
                    kVar = k.k.f107055a;
                    if (kVar.a()) {
                        k.c0 c0Var5 = k.c0.f107031a;
                        String.format(null, "%." + i16 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                    }
                    if (i0Var == null) {
                        if (kVar.d()) {
                            io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                        }
                        if (b4VarB != null) {
                            l(b4VarB);
                            oq.i0 i0Var6 = oq.i0.f148189a;
                        }
                    }
                    if (i0Var != null) {
                    }
                } catch (Throwable th9) {
                    th = th9;
                    hVar = hVar2;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            locale = null;
            hVar = hVar2;
            r15 = 3;
            i15 = 1;
            d15 = 1000000.0d;
        }
    }

    public String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) h.v.f(getCameraId())) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f7 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:24:0x00d9, B:32:0x00f3, B:34:0x00f7, B:36:0x00ff, B:37:0x0117, B:40:0x0125, B:42:0x0129, B:44:0x012d, B:46:0x0131, B:49:0x0136, B:51:0x013a, B:52:0x0140, B:53:0x0141, B:55:0x0149, B:56:0x0161), top: B:77:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:24:0x00d9, B:32:0x00f3, B:34:0x00f7, B:36:0x00ff, B:37:0x0117, B:40:0x0125, B:42:0x0129, B:44:0x012d, B:46:0x0131, B:49:0x0136, B:51:0x013a, B:52:0x0140, B:53:0x0141, B:55:0x0149, B:56:0x0161), top: B:77:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0125 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:24:0x00d9, B:32:0x00f3, B:34:0x00f7, B:36:0x00ff, B:37:0x0117, B:40:0x0125, B:42:0x0129, B:44:0x012d, B:46:0x0131, B:49:0x0136, B:51:0x013a, B:52:0x0140, B:53:0x0141, B:55:0x0149, B:56:0x0161), top: B:77:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0149 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:24:0x00d9, B:32:0x00f3, B:34:0x00f7, B:36:0x00ff, B:37:0x0117, B:40:0x0125, B:42:0x0129, B:44:0x012d, B:46:0x0131, B:49:0x0136, B:51:0x013a, B:52:0x0140, B:53:0x0141, B:55:0x0149, B:56:0x0161), top: B:77:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    /* JADX WARN: Code duplicated, block: B:62:0x01af  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01db  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00ff, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0149, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0185, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01b5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // i.m2
    public boolean u0(InputConfigData inputConfig, List<? extends l3> outputs, k2.a stateCallback) throws Throwable {
        k.h hVar;
        long j15;
        int i15;
        double d15;
        b4 b4Var;
        boolean z15;
        boolean z16;
        oq.i0 i0Var;
        ?? r15;
        long jC;
        k.k kVar;
        oq.r<Boolean, b4> rVarJ = j(stateCallback);
        boolean zBooleanValue = rVarJ.a().booleanValue();
        b4 b4VarB = rVarJ.b();
        if (!zBooleanValue) {
            return false;
        }
        if (b4VarB != null) {
            k(b4VarB);
        }
        k.h hVar2 = k.h.f107050a;
        String str = "CXCP#createReprocessableCaptureSessionByConfigurations-" + getCameraId();
        long jA = hVar2.g().a();
        try {
            Trace.beginSection(str);
            d15 = 1000000.0d;
            try {
                String cameraId = getCameraId();
                m.d dVar = this.cameraErrorListener;
                try {
                    CameraDevice cameraDevice = this.cameraDevice;
                    InputConfiguration inputConfiguration = new InputConfiguration(inputConfig.getWidth(), inputConfig.getHeight(), inputConfig.getFormat());
                    List<? extends l3> list = outputs;
                    ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((OutputConfiguration) ((l3) it.next()).c0(fr.q0.c(OutputConfiguration.class)));
                        cameraDevice = cameraDevice;
                    }
                    b4Var = b4VarB;
                    try {
                        hVar = hVar2;
                        j15 = jA;
                        i15 = 1;
                        r15 = 1;
                        z15 = true;
                        try {
                            try {
                                t.b(cameraDevice, inputConfiguration, arrayList, new i(this, stateCallback, b4Var, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads.i()), this.threads.i());
                                i0Var = oq.i0.f148189a;
                                z16 = false;
                            } catch (Exception e15) {
                                e = e15;
                                if (!(e instanceof CameraAccessException)) {
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    }
                                    dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        if (k.k.f107055a.d()) {
                                            io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        }
                                        z16 = false;
                                        dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        k.k.f107055a.a();
                                    }
                                    i0Var = null;
                                    r15 = z15;
                                }
                                z16 = false;
                                i0Var = null;
                                r15 = z15;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            long jC2 = k.i.c(hVar.g().a() - j15);
                            if (k.k.f107055a.a()) {
                                k.c0 c0Var = k.c0.f107031a;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / d15)}, i15));
                            }
                            throw th;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        hVar = hVar2;
                        j15 = jA;
                        z15 = true;
                        if (!(e instanceof CameraAccessException)) {
                            if (e instanceof IllegalArgumentException) {
                            }
                            if (k.k.f107055a.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            }
                            z16 = false;
                            dVar.a(cameraId, h.q.INSTANCE.m(), false);
                            i0Var = null;
                            r15 = z15;
                            Trace.endSection();
                            jC = k.i.c(hVar.g().a() - j15);
                            kVar = k.k.f107055a;
                            if (kVar.a()) {
                                k.c0 c0Var2 = k.c0.f107031a;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, (int) r15));
                            }
                            if (i0Var == null) {
                                if (kVar.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to create reprocess session from " + this.cameraDevice + ". Finalizing previous session");
                                }
                                if (b4Var != null) {
                                    l(b4Var);
                                }
                            }
                            return i0Var != null ? r15 : z16;
                        }
                        if (k.k.f107055a.d()) {
                            io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        }
                        dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                        z16 = false;
                        i0Var = null;
                        r15 = z15;
                        Trace.endSection();
                        jC = k.i.c(hVar.g().a() - j15);
                        kVar = k.k.f107055a;
                        if (kVar.a()) {
                            k.c0 c0Var3 = k.c0.f107031a;
                            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, (int) r15));
                        }
                        if (i0Var == null) {
                            if (kVar.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to create reprocess session from " + this.cameraDevice + ". Finalizing previous session");
                            }
                            if (b4Var != null) {
                                l(b4Var);
                            }
                        }
                        if (i0Var != null) {
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                    b4Var = b4VarB;
                }
                Trace.endSection();
                jC = k.i.c(hVar.g().a() - j15);
                kVar = k.k.f107055a;
                if (kVar.a()) {
                    k.c0 c0Var4 = k.c0.f107031a;
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, (int) r15));
                }
                if (i0Var == null) {
                    if (kVar.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to create reprocess session from " + this.cameraDevice + ". Finalizing previous session");
                    }
                    if (b4Var != null) {
                        l(b4Var);
                    }
                }
                if (i0Var != null) {
                }
            } catch (Throwable th5) {
                th = th5;
                hVar = hVar2;
                j15 = jA;
                i15 = 1;
            }
        } catch (Throwable th6) {
            th = th6;
            hVar = hVar2;
            j15 = jA;
            i15 = 1;
            d15 = 1000000.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[Catch: all -> 0x009e, TryCatch #8 {all -> 0x009e, blocks: (B:17:0x0089, B:33:0x00bd, B:35:0x00c1, B:37:0x00c9, B:38:0x00e1, B:41:0x00ef, B:43:0x00f3, B:45:0x00f7, B:47:0x00fb, B:50:0x0100, B:52:0x0104, B:53:0x010a, B:54:0x010b, B:56:0x0113, B:57:0x012b), top: B:89:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cd  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00c9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0113, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x014e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x017e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01cd, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    @Override // i.m2
    public boolean y(List<? extends Surface> outputs, k2.a stateCallback) throws Throwable {
        double d15;
        ?? r15;
        Locale locale;
        long jC;
        b4 b4Var;
        boolean z15;
        boolean z16;
        oq.i0 i0Var;
        ?? r16;
        long jC2;
        k.k kVar;
        oq.r<Boolean, b4> rVarJ = j(stateCallback);
        boolean zBooleanValue = rVarJ.a().booleanValue();
        b4 b4VarB = rVarJ.b();
        if (!zBooleanValue) {
            return false;
        }
        if (b4VarB != null) {
            k(b4VarB);
        }
        k.h hVar = k.h.f107050a;
        String str = "CXCP#createConstrainedHighSpeedCaptureSession-" + getCameraId();
        long jA = hVar.g().a();
        try {
            Trace.beginSection(str);
            d15 = 1000000.0d;
            try {
                String cameraId = getCameraId();
                m.d dVar = this.cameraErrorListener;
                try {
                    try {
                        b4Var = b4VarB;
                        try {
                            try {
                                hVar = hVar;
                                z15 = true;
                                try {
                                    try {
                                        this.cameraDevice.createConstrainedHighSpeedCaptureSession(outputs, new i(this, stateCallback, b4Var, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads.i()), this.threads.i());
                                        i0Var = oq.i0.f148189a;
                                        z16 = false;
                                        r16 = z15;
                                    } catch (Exception e15) {
                                        e = e15;
                                        if (!(e instanceof CameraAccessException)) {
                                            if (k.k.f107055a.d()) {
                                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                            }
                                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                                        } else {
                                            if (e instanceof IllegalArgumentException) {
                                            }
                                            if (k.k.f107055a.d()) {
                                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            }
                                            z16 = false;
                                            dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                            i0Var = null;
                                            r16 = z15;
                                        }
                                        z16 = false;
                                        i0Var = null;
                                        r16 = z15;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    locale = null;
                                    r15 = z15;
                                    Trace.endSection();
                                    jC = k.i.c(hVar.g().a() - jA);
                                    if (k.k.f107055a.a()) {
                                        k.c0 c0Var = k.c0.f107031a;
                                        String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, (int) r15));
                                    }
                                    throw th;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                hVar = hVar;
                                z15 = true;
                            } catch (Throwable th5) {
                                th = th5;
                                hVar = hVar;
                                z15 = true;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            hVar = hVar;
                            z15 = true;
                            if (!(e instanceof CameraAccessException)) {
                                if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    if (k.k.f107055a.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    }
                                    z16 = false;
                                    dVar.a(cameraId, h.q.INSTANCE.m(), false);
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    k.k.f107055a.a();
                                }
                                i0Var = null;
                                r16 = z15;
                                Trace.endSection();
                                jC2 = k.i.c(hVar.g().a() - jA);
                                kVar = k.k.f107055a;
                                if (kVar.a()) {
                                    k.c0 c0Var2 = k.c0.f107031a;
                                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                                }
                                if (i0Var == null) {
                                    if (kVar.d()) {
                                        io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                    }
                                    if (b4Var != null) {
                                        l(b4Var);
                                    }
                                }
                                return i0Var != null ? r16 : z16;
                            }
                            if (k.k.f107055a.d()) {
                                io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            }
                            dVar.a(cameraId, h.q.INSTANCE.b((CameraAccessException) e), z15);
                            z16 = false;
                            i0Var = null;
                            r16 = z15;
                            Trace.endSection();
                            jC2 = k.i.c(hVar.g().a() - jA);
                            kVar = k.k.f107055a;
                            if (kVar.a()) {
                                k.c0 c0Var3 = k.c0.f107031a;
                                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                            }
                            if (i0Var == null) {
                                if (kVar.d()) {
                                    io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                                }
                                if (b4Var != null) {
                                    l(b4Var);
                                }
                            }
                            if (i0Var != null) {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        hVar = hVar;
                        z15 = true;
                    }
                } catch (Exception e18) {
                    e = e18;
                    b4Var = b4VarB;
                }
                Trace.endSection();
                jC2 = k.i.c(hVar.g().a() - jA);
                kVar = k.k.f107055a;
                if (kVar.a()) {
                    k.c0 c0Var4 = k.c0.f107031a;
                    String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC2 / 1000000.0d)}, (int) r16));
                }
                if (i0Var == null) {
                    if (kVar.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to create capture session from " + this.cameraDevice + ". Finalizing previous session");
                    }
                    if (b4Var != null) {
                        l(b4Var);
                    }
                }
                if (i0Var != null) {
                }
            } catch (Throwable th7) {
                th = th7;
                r15 = 1;
                locale = null;
                Trace.endSection();
                jC = k.i.c(hVar.g().a() - jA);
                if (k.k.f107055a.a()) {
                    k.c0 c0Var5 = k.c0.f107031a;
                    String.format(locale, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / d15)}, (int) r15));
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            d15 = 1000000.0d;
        }
    }

    private AndroidCameraDevice(h.x xVar, CameraDevice cameraDevice, String str, m.d dVar, h.w.b bVar, k.z zVar) {
        this.cameraMetadata = xVar;
        this.cameraDevice = cameraDevice;
        this.cameraId = str;
        this.cameraErrorListener = dVar;
        this.interopCaptureSessionListener = bVar;
        this.threads = zVar;
        this.closed = iu.b.a(false);
        this._lastStateCallback = iu.b.g(null);
    }
}
