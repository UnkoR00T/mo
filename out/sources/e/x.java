package e;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import v.j3;
import v.n3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001DB[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 0\u001f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b#\u0010$J-\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u0004\u0018\u00010.*\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00103\u001a\u000202*\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00108\u001a\u0004\u0018\u0001072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109Jk\u0010D\u001a\u00020C2\u0006\u0010;\u001a\u00020:2\b\u0010<\u001a\u0004\u0018\u0001012\u0006\u0010=\u001a\u00020(2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010@\u001a\u0004\u0018\u0001072\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 0\u001f2\u0014\b\u0002\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0018H\u0016¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010NR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010OR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010PR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010QR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010Y\u001a\u0004\u0018\u00010V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Le/x;", "", "Le/v;", "callbackMap", "Le/u0;", "requestListener", "Ld/m;", "cameraConfig", "Landroidx/camera/camera2/compat/quirk/a;", "cameraQuirks", "LPRN/x0;", "zslControl", "Lc/g0;", "templateParamsOverride", "Lh/x;", "cameraMetadata", "Lo/e0;", "cameraXConfig", "Le/y;", "cameraInteropStateCallbackRepository", "<init>", "(Le/v;Le/u0;Ld/m;Landroidx/camera/camera2/compat/quirk/a;LPRN/x0;Lc/g0;Lh/x;Lo/e0;Le/y;)V", "Lv/j3$f;", "postviewConfig", "", "physicalCameraIdForAllStreams", "Lh/c0$a;", "d", "(Lv/j3$f;Ljava/lang/String;)Lh/c0$a;", "Lv/u1;", "deferrableSurface", "", "", "mapping", "Lh/e1$f;", "e", "(Lv/u1;Ljava/util/Map;Lh/x;)Lh/e1$f;", "Lh/e1$g;", "f", "(Lv/u1;Ljava/util/Map;)Lh/e1$g;", "", "isExtensions", "Lh/s$d;", "c", "(Landroidx/camera/camera2/compat/quirk/a;Z)Lh/s$d;", "Lo/i0;", "Lh/e1$b;", "i", "(Lo/i0;)Lh/e1$b;", "Lv/j3;", "Le/a;", "h", "(Lv/j3;)Le/a;", "Lv/n1;", "captureConfig", "", "g", "(Lv/n1;)Ljava/lang/Integer;", "Lh/s$e;", "operatingMode", "sessionConfig", "setOutputType", "LPRN/d0;", "graphStateToCameraStateAdapter", "camera2ExtensionMode", "surfaceToStreamUseCaseMap", "surfaceToStreamUseHintMap", "Le/x$a;", "a", "(ILv/j3;ZLPRN/d0;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)Le/x$a;", "toString", "()Ljava/lang/String;", "Le/v;", "b", "Le/u0;", "Ld/m;", "Landroidx/camera/camera2/compat/quirk/a;", "LPRN/x0;", "Lc/g0;", "Lh/x;", "Lo/e0;", "Le/y;", "Lc/i;", "j", "Lc/i;", "closeCameraOnCameraGraphClose", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "k", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "supportedDynamicRangeProfiles", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v callbackMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u0 requestListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d.m cameraConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.a cameraQuirks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PRN.x0 zslControl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c.g0 templateParamsOverride;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final o.e0 cameraXConfig;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y cameraInteropStateCallbackRepository;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c.i closeCameraOnCameraGraphClose;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final DynamicRangeProfiles supportedDynamicRangeProfiles;

    /* JADX INFO: renamed from: e.x$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Le/x$a;", "", "Lh/s$b;", "config", "", "Lh/c0$a;", "Lv/u1;", "streamConfigMap", "<init>", "(Lh/s$b;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh/s$b;", "()Lh/s$b;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CameraGraphCreationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h.s.b config;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<h.c0.a, v.u1> streamConfigMap;

        /* JADX WARN: Multi-variable type inference failed */
        public CameraGraphCreationResult(h.s.b bVar, Map<h.c0.a, ? extends v.u1> map) {
            this.config = bVar;
            this.streamConfigMap = map;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h.s.b getConfig() {
            return this.config;
        }

        public final Map<h.c0.a, v.u1> b() {
            return this.streamConfigMap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraGraphCreationResult)) {
                return false;
            }
            CameraGraphCreationResult cameraGraphCreationResult = (CameraGraphCreationResult) other;
            return fr.t.c(this.config, cameraGraphCreationResult.config) && fr.t.c(this.streamConfigMap, cameraGraphCreationResult.streamConfigMap);
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.streamConfigMap.hashCode();
        }

        public String toString() {
            return "CameraGraphCreationResult(config=" + this.config + ", streamConfigMap=" + this.streamConfigMap + ')';
        }
    }

    public x(v vVar, u0 u0Var, d.m mVar, androidx.camera.camera2.compat.quirk.a aVar, PRN.x0 x0Var, c.g0 g0Var, h.x xVar, o.e0 e0Var, y yVar) {
        a.m mVarA;
        this.callbackMap = vVar;
        this.requestListener = u0Var;
        this.cameraConfig = mVar;
        this.cameraQuirks = aVar;
        this.zslControl = x0Var;
        this.templateParamsOverride = g0Var;
        this.cameraMetadata = xVar;
        this.cameraXConfig = e0Var;
        this.cameraInteropStateCallbackRepository = yVar;
        this.closeCameraOnCameraGraphClose = new c.i();
        DynamicRangeProfiles dynamicRangeProfilesC = null;
        if (Build.VERSION.SDK_INT >= 33 && xVar != null && (mVarA = a.m.INSTANCE.a(xVar)) != null) {
            dynamicRangeProfilesC = mVarA.c();
        }
        this.supportedDynamicRangeProfiles = dynamicRangeProfilesC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CameraGraphCreationResult b(x xVar, int i15, j3 j3Var, boolean z15, PRN.d0 d0Var, Integer num, Map map, Map map2, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            d0Var = null;
        }
        if ((i16 & 16) != 0) {
            num = null;
        }
        if ((i16 & 32) != 0) {
            map = pq.v0.i();
        }
        if ((i16 & 64) != 0) {
            map2 = pq.v0.i();
        }
        return xVar.a(i15, j3Var, z15, d0Var, num, map, map2);
    }

    private final h.s.Flags c(androidx.camera.camera2.compat.quirk.a cameraQuirks, boolean isExtensions) {
        if (cameraQuirks.b().a(CaptureSessionStuckQuirk.class)) {
            c cVar = c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = c.TRUNCATED_TAG;
            }
        }
        int iA = FinalizeSessionOnCloseQuirk.INSTANCE.a();
        boolean zA = this.closeCameraOnCameraGraphClose.a(isExtensions);
        boolean z15 = false;
        if ((!isExtensions || b.g.f15546a.c(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && b.g.f15546a.c(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30) {
            z15 = true;
        }
        return new h.s.Flags(false, z15, new h.s.f(cameraQuirks.b().a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, h.s.f.a.AT_LEAST, null), null, iA, true, zA, true, 9, null);
    }

    private final h.c0.a d(j3.f postviewConfig, String physicalCameraIdForAllStreams) {
        h.e1.c cVarB;
        h.e1.c cVar;
        v.u1 u1VarF = postviewConfig.f();
        String strD = physicalCameraIdForAllStreams == null ? postviewConfig.d() : physicalCameraIdForAllStreams;
        int iC = postviewConfig.c();
        h.e1.a.Companion companion = h.e1.a.INSTANCE;
        Size sizeH = u1VarF.h();
        int iD = h.o1.d(u1VarF.i());
        String strB = strD == null ? null : h.v.b(strD);
        if (iC != 0) {
            if (iC != 1) {
                cVar = null;
            } else {
                cVarB = h.e1.c.b(h.e1.c.c(2));
            }
            return h.c0.a.Companion.b(h.c0.a.INSTANCE, h.e1.a.Companion.b(companion, sizeH, iD, strB, null, cVar, null, null, null, null, null, 1000, null), null, 2, null);
        }
        cVarB = h.e1.c.b(h.e1.c.c(1));
        cVar = cVarB;
        return h.c0.a.Companion.b(h.c0.a.INSTANCE, h.e1.a.Companion.b(companion, sizeH, iD, strB, null, cVar, null, null, null, null, null, 1000, null), null, 2, null);
    }

    private final h.e1.f e(v.u1 deferrableSurface, Map<v.u1, Long> mapping, h.x cameraMetadata) {
        long[] jArr;
        Long l15 = mapping.get(deferrableSurface);
        h.e1.f fVarD = l15 != null ? h.e1.f.d(h.e1.f.e(l15.longValue())) : null;
        if (Build.VERSION.SDK_INT >= 33 && fVarD != null && cameraMetadata != null && (jArr = (long[]) cameraMetadata.J(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && pq.n.e0(jArr, fVarD.getValue())) {
            return fVarD;
        }
        c cVar = c.f45719a;
        if (o.e1.k("CXCP")) {
            io.sentry.android.core.c2.g(c.TRUNCATED_TAG, "Expected stream use case for " + deferrableSurface + ", " + fVarD + " cannot be set!");
        }
        return null;
    }

    private final h.e1.g f(v.u1 deferrableSurface, Map<v.u1, Long> mapping) {
        Long l15 = mapping.get(deferrableSurface);
        if (l15 != null) {
            return h.e1.g.c(h.e1.g.d(l15.longValue()));
        }
        return null;
    }

    private final Integer g(v.n1 captureConfig) {
        int iG = captureConfig.g();
        int iK = captureConfig.k();
        if (iG == 1 || iK == 1) {
            return 0;
        }
        if (iG == 2) {
            return 2;
        }
        return iK == 2 ? 1 : null;
    }

    private final a h(j3 j3Var) {
        return new a(j3Var.g());
    }

    private final h.e1.b i(o.i0 i0Var) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        h.e1.b bVarB = h.e1.b.b(h.e1.b.INSTANCE.a());
        DynamicRangeProfiles dynamicRangeProfiles = this.supportedDynamicRangeProfiles;
        if (dynamicRangeProfiles != null) {
            Long lA = f.c.f54458a.a(i0Var, dynamicRangeProfiles);
            if (lA != null) {
                return h.e1.b.b(h.e1.b.c(lA.longValue()));
            }
            c cVar = c.f45719a;
            if (o.e1.g("CXCP")) {
                io.sentry.android.core.c2.e(c.TRUNCATED_TAG, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + i0Var);
            }
        }
        return bVarB;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x0130  */
    /* JADX WARN: Code duplicated, block: B:48:0x0136  */
    /* JADX WARN: Code duplicated, block: B:49:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x0196  */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final CameraGraphCreationResult a(int operatingMode, j3 sessionConfig, boolean setOutputType, PRN.d0 graphStateToCameraStateAdapter, Integer camera2ExtensionMode, Map<v.u1, Long> surfaceToStreamUseCaseMap, Map<v.u1, Long> surfaceToStreamUseHintMap) {
        h.c0.a aVar;
        h.c0.a aVarD;
        o.e0 e0Var;
        boolean zIsEmpty;
        ?? r15;
        g.c cVarB;
        h.e1.c cVarB2;
        h.e1.c cVar;
        h.e1.d dVarC;
        h.e1.f fVarE;
        h.e1.g gVarF;
        h.e1.a aVarB;
        Iterator it;
        v.u1 u1Var;
        h.c0.a aVarB2;
        List list;
        Class<?> clsG;
        h.s.e.Companion companion = h.s.e.INSTANCE;
        boolean zF = h.s.e.f(operatingMode, companion.b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        int iB = h.k1.b(1);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (sessionConfig != null) {
            y yVar = this.cameraInteropStateCallbackRepository;
            if (yVar != null) {
                yVar.c(sessionConfig);
            }
            if (sessionConfig.q() != -1) {
                iB = h.k1.b(sessionConfig.q());
            }
            linkedHashMap2.putAll(this.templateParamsOverride.a(h.k1.a(iB)));
            linkedHashMap2.putAll(b.b(sessionConfig.g()));
            if (h.s.e.f(operatingMode, companion.b())) {
                linkedHashMap2.put(i.q2.f87324a.b(), camera2ExtensionMode);
            }
            String strM0 = h(sessionConfig).m0(null);
            h.c0.a aVar2 = null;
            for (j3.f fVar : sessionConfig.i()) {
                v.u1 u1VarF = fVar.f();
                String strD = strM0 == null ? fVar.d() : strM0;
                int i16 = 2;
                o.i0 i0VarB = fVar.b();
                int iC = fVar.c();
                h.e1.a.Companion companion2 = h.e1.a.INSTANCE;
                h.e1.b bVarI = i(i0VarB);
                Size sizeH = u1VarF.h();
                int iD = h.o1.d(u1VarF.i());
                String strB = strD == null ? null : h.v.b(strD);
                if (iC != 0) {
                    if (iC != i15) {
                        cVar = null;
                    } else {
                        cVarB2 = h.e1.c.b(h.e1.c.c(2));
                    }
                    if (setOutputType) {
                        clsG = fVar.f().g();
                        if (fr.t.c(clsG, MediaCodec.class)) {
                            dVarC = h.e1.d.INSTANCE.a();
                        } else if (fr.t.c(clsG, SurfaceHolder.class)) {
                            dVarC = h.e1.d.INSTANCE.f();
                        } else if (fr.t.c(clsG, SurfaceTexture.class)) {
                            dVarC = h.e1.d.INSTANCE.e();
                        } else {
                            dVarC = h.e1.d.INSTANCE.c();
                        }
                    } else {
                        dVarC = h.e1.d.INSTANCE.c();
                    }
                    h.e1.d dVar = dVarC;
                    if (zF) {
                        fVarE = null;
                    } else {
                        fVarE = e(u1VarF, surfaceToStreamUseCaseMap, this.cameraMetadata);
                    }
                    if (zF) {
                        gVarF = null;
                    } else {
                        gVarF = f(u1VarF, surfaceToStreamUseHintMap);
                    }
                    aVarB = h.e1.a.Companion.b(companion2, sizeH, iD, strB, dVar, cVar, null, bVarI, fVarE, gVarF, null, 544, null);
                    String str = strM0;
                    it = pq.v.M0(fVar.e(), u1VarF).iterator();
                    while (it.hasNext()) {
                        Iterator it4 = it;
                        u1Var = (v.u1) it.next();
                        int i17 = iB;
                        aVarB2 = h.c0.a.Companion.b(h.c0.a.INSTANCE, aVarB, null, i16, null);
                        linkedHashMap3.put(aVarB2, u1Var);
                        if (fVar.g() != -1) {
                            list = (List) linkedHashMap.get(Integer.valueOf(fVar.g()));
                            if (list == null) {
                                linkedHashMap.put(Integer.valueOf(fVar.g()), pq.v.t(aVarB2));
                            } else {
                                list.add(aVarB2);
                            }
                        }
                        if (!fr.t.c(u1Var, u1VarF) && this.zslControl.c(u1Var, sessionConfig)) {
                            aVar2 = aVarB2;
                        }
                        iB = i17;
                        it = it4;
                        i16 = 2;
                    }
                    strM0 = str;
                    i15 = 1;
                } else {
                    cVarB2 = h.e1.c.b(h.e1.c.c(i15));
                }
                cVar = cVarB2;
                if (setOutputType) {
                    clsG = fVar.f().g();
                    if (fr.t.c(clsG, MediaCodec.class)) {
                        dVarC = h.e1.d.INSTANCE.a();
                    } else if (fr.t.c(clsG, SurfaceHolder.class)) {
                        dVarC = h.e1.d.INSTANCE.f();
                    } else if (fr.t.c(clsG, SurfaceTexture.class)) {
                        dVarC = h.e1.d.INSTANCE.e();
                    } else {
                        dVarC = h.e1.d.INSTANCE.c();
                    }
                } else {
                    dVarC = h.e1.d.INSTANCE.c();
                }
                h.e1.d dVar2 = dVarC;
                if (zF) {
                    fVarE = e(u1VarF, surfaceToStreamUseCaseMap, this.cameraMetadata);
                } else {
                    fVarE = null;
                }
                if (zF) {
                    gVarF = f(u1VarF, surfaceToStreamUseHintMap);
                } else {
                    gVarF = null;
                }
                aVarB = h.e1.a.Companion.b(companion2, sizeH, iD, strB, dVar2, cVar, null, bVarI, fVarE, gVarF, null, 544, null);
                String str2 = strM0;
                it = pq.v.M0(fVar.e(), u1VarF).iterator();
                while (it.hasNext()) {
                    Iterator it5 = it;
                    u1Var = (v.u1) it.next();
                    int i18 = iB;
                    aVarB2 = h.c0.a.Companion.b(h.c0.a.INSTANCE, aVarB, null, i16, null);
                    linkedHashMap3.put(aVarB2, u1Var);
                    if (fVar.g() != -1) {
                        list = (List) linkedHashMap.get(Integer.valueOf(fVar.g()));
                        if (list == null) {
                            linkedHashMap.put(Integer.valueOf(fVar.g()), pq.v.t(aVarB2));
                        } else {
                            list.add(aVarB2);
                        }
                    }
                    if (!fr.t.c(u1Var, u1VarF)) {
                    }
                    iB = i18;
                    it = it5;
                    i16 = 2;
                }
                strM0 = str2;
                i15 = 1;
            }
            int i19 = iB;
            if (sessionConfig.h() != null && aVar2 != null) {
                arrayList.add(new h.x0.a(aVar2, 1, ((h.e1.a) pq.v.P0(aVar2.b())).getFormat(), null));
            }
            iB = i19;
        }
        h.s.Flags flagsC = c(this.cameraQuirks, zF);
        Integer numG = sessionConfig != null ? g(sessionConfig.l()) : null;
        Range<Integer> rangeE = sessionConfig != null ? sessionConfig.e() : null;
        if (fr.t.c(rangeE, n3.f202727a)) {
            rangeE = null;
        }
        Map mapC = pq.v0.c();
        if (zF) {
            mapC.put(i.q2.f87324a.c(), Boolean.TRUE);
        }
        if (numG != null) {
            mapC.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(numG.intValue()));
        }
        mapC.put(i.q2.f87324a.a(), "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (rangeE != null) {
            mapC.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeE);
        }
        Map mapB = pq.v0.b(mapC);
        if (rangeE != null) {
            linkedHashMap2.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeE);
        }
        if (numG != null) {
            linkedHashMap2.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numG);
        }
        if (sessionConfig != null) {
            aVar = null;
            String strM1 = h(sessionConfig).m0(null);
            j3.f fVarJ = sessionConfig.j();
            if (fVarJ != null && (aVarD = d(fVarJ, strM1)) != null) {
                linkedHashMap3.put(aVarD, fVarJ.f());
            }
            e0Var = this.cameraXConfig;
            if (e0Var != null && (cVarB = g.d.b(e0Var)) != null) {
                g.d.a(cVarB, linkedHashMap2);
            }
            String cameraId = this.cameraConfig.getCameraId();
            List listF1 = pq.v.f1(linkedHashMap3.keySet());
            List listF2 = pq.v.f1(linkedHashMap.values());
            zIsEmpty = arrayList.isEmpty();
            r15 = arrayList;
            if (zIsEmpty) {
                r15 = aVar;
            }
            return new CameraGraphCreationResult(new h.s.b(cameraId, listF1, listF2, r15, aVarD, iB, linkedHashMap2, operatingMode, 0, mapB, pq.v.q(this.callbackMap, this.requestListener), pq.v.r(graphStateToCameraStateAdapter), null, null, null, null, flagsC, null, 192768, null), pq.v0.u(linkedHashMap3));
        }
        aVar = null;
        aVarD = aVar;
        e0Var = this.cameraXConfig;
        if (e0Var != null) {
            g.d.a(cVarB, linkedHashMap2);
        }
        String cameraId2 = this.cameraConfig.getCameraId();
        List listF3 = pq.v.f1(linkedHashMap3.keySet());
        List listF4 = pq.v.f1(linkedHashMap.values());
        zIsEmpty = arrayList.isEmpty();
        r15 = arrayList;
        if (zIsEmpty) {
            r15 = aVar;
        }
        return new CameraGraphCreationResult(new h.s.b(cameraId2, listF3, listF4, r15, aVarD, iB, linkedHashMap2, operatingMode, 0, mapB, pq.v.q(this.callbackMap, this.requestListener), pq.v.r(graphStateToCameraStateAdapter), null, null, null, null, flagsC, null, 192768, null), pq.v0.u(linkedHashMap3));
    }

    public String toString() {
        return "CameraGraphConfigProvider<" + ((Object) h.v.f(this.cameraConfig.getCameraId())) + '>';
    }

    public /* synthetic */ x(v vVar, u0 u0Var, d.m mVar, androidx.camera.camera2.compat.quirk.a aVar, PRN.x0 x0Var, c.g0 g0Var, h.x xVar, o.e0 e0Var, y yVar, int i15, fr.k kVar) {
        this(vVar, u0Var, mVar, aVar, x0Var, g0Var, xVar, (i15 & 128) != 0 ? null : e0Var, (i15 & 256) != 0 ? null : yVar);
    }
}
