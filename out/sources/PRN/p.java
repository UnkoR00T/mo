package PRN;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p071kotlin.Metadata;
import v.SurfaceConfig;
import v.SurfaceStreamSpecQueryResult;
import v.j1;
import v.o3;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0007H\u0001¢\u0006\u0004\b!\u0010\"Jk\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000b2\u001c\u0010&\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u00107¨\u00069"}, d2 = {"LPRN/p;", "Lv/k0;", "Landroid/content/Context;", "context", "", "cameraComponent", "", "", "availableCameraIds", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)V", "", "cameraIdsToBuild", "", "LPRN/v0;", "i", "(Ljava/util/List;)Ljava/util/Map;", "cameraIds", "Loq/i0;", "g", "(Ljava/util/List;)V", "", "cameraMode", "cameraId", "imageFormat", "Landroid/util/Size;", "size", "Lv/o3;", "streamUseCase", "Lv/q3;", "d", "(ILjava/lang/String;ILandroid/util/Size;Lv/o3;)Lv/q3;", "", "j", "(Ljava/lang/String;)Z", "Lv/g;", "existingSurfaces", "Lv/w3;", "newUseCaseConfigsSupportedSizeMap", "Lx/a;", "videoStabilization", "hasVideoCapture", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Lv/s3;", "a", "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Lx/a;ZZZ)Lv/s3;", "Landroid/content/Context;", "Ld/a;", "b", "Ld/a;", "component", "c", "Ljava/lang/Object;", "lock", "Ljava/util/Map;", "supportedSurfaceCombinationMap", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements v.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d.a component;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Map<String, v0> supportedSurfaceCombinationMap = pq.v0.i();

    public p(Context context, Object obj, Set<String> set) throws o.c1 {
        this.context = context;
        this.component = (d.a) obj;
        try {
            g(pq.v.f1(set));
        } catch (j1 e15) {
            throw new o.c1(e15);
        }
    }

    private final Map<String, v0> i(List<String> cameraIdsToBuild) throws j1 {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cameraIdsToBuild.isEmpty()) {
            try {
                for (String str : cameraIdsToBuild) {
                    h.x xVarH = h.p.h(this.component.b(), h.v.b(str), null, 2, null);
                    if (xVarH != null) {
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) xVarH.J(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        androidx.camera.camera2.compat.quirk.a aVar = new androidx.camera.camera2.compat.quirk.a(xVarH, new a.u(streamConfigurationMap, new c.a0(xVarH, streamConfigurationMap)));
                        linkedHashMap.put(str, new v0(this.context, xVarH, d.o.INSTANCE.d(str, aVar), Build.VERSION.SDK_INT >= 35 ? new e.b1(xVarH, this.component.a(), aVar) : r.a.f169767b));
                    }
                }
            } catch (h.l0 e15) {
                throw new j1("Failed to query camera metadata", e15);
            } catch (Exception e16) {
                throw new j1("Failed to build surface combinations", e16);
            }
        }
        return linkedHashMap;
    }

    @Override // v.k0
    public SurfaceStreamSpecQueryResult a(int cameraMode, String cameraId, List<? extends v.g> existingSurfaces, Map<w3<?>, ? extends List<Size>> newUseCaseConfigsSupportedSizeMap, x.a videoStabilization, boolean hasVideoCapture, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        v0 v0Var;
        i6.i.b(j(cameraId), "No such camera id in supported combination list: " + cameraId);
        synchronized (this.lock) {
            v0Var = this.supportedSurfaceCombinationMap.get(cameraId);
        }
        if (v0Var != null) {
            return v0Var.U(cameraMode, existingSurfaces, newUseCaseConfigsSupportedSizeMap, videoStabilization, hasVideoCapture, isFeatureComboInvocation, findMaxSupportedFrameRate);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + cameraId);
    }

    @Override // v.k0
    public SurfaceConfig d(int cameraMode, String cameraId, int imageFormat, Size size, o3 streamUseCase) {
        v0 v0Var;
        i6.i.b(j(cameraId), "No such camera id in supported combination list: " + cameraId);
        synchronized (this.lock) {
            v0Var = this.supportedSurfaceCombinationMap.get(cameraId);
        }
        if (v0Var != null) {
            return v0Var.m0(cameraMode, imageFormat, size, streamUseCase);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + cameraId);
    }

    @Override // v.i2
    public void g(List<String> cameraIds) throws j1 {
        List<String> listH0;
        synchronized (this.lock) {
            listH0 = pq.v.H0(cameraIds, this.supportedSurfaceCombinationMap.keySet());
            oq.i0 i0Var = oq.i0.f148189a;
        }
        if (!listH0.isEmpty()) {
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                Objects.toString(listH0);
            }
        }
        Map<String, v0> mapI = i(listH0);
        synchronized (this.lock) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : cameraIds) {
                    if (this.supportedSurfaceCombinationMap.containsKey(str)) {
                        linkedHashMap.put(str, this.supportedSurfaceCombinationMap.get(str));
                    }
                }
                linkedHashMap.putAll(mapI);
                this.supportedSurfaceCombinationMap = linkedHashMap;
                e.c cVar2 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                    linkedHashMap.size();
                }
                oq.i0 i0Var2 = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean j(String cameraId) {
        return this.supportedSurfaceCombinationMap.containsKey(cameraId);
    }
}
