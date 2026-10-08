package i;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0013*\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0013*\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R&\u0010:\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\f078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020%078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u00109R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010A\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R$\u0010D\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030B0\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010>R$\u0010G\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010>R \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010>R$\u0010K\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030B0\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010>R$\u0010M\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010>R$\u0010O\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030B0\u000e0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010>R\u001e\u0010R\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030B0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020#0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010Q¨\u0006V"}, d2 = {"Li/i1;", "Lh/x;", "Lh/v;", "camera", "", "isRedacted", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "Li/g2;", "metadataProvider", "", "Lh/a1$a;", "", "metadata", "", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "cacheBlocklist", "<init>", "(Ljava/lang/String;ZLandroid/hardware/camera2/CameraCharacteristics;Li/g2;Ljava/util/Map;Ljava/util/Set;Lfr/k;)V", "T", "key", "F", "(Landroid/hardware/camera2/CameraCharacteristics;Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "J", "(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "default", "d0", "(Landroid/hardware/camera2/CameraCharacteristics$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "cameraId", "O", "(Ljava/lang/String;)Lh/x;", "", "extension", "Lh/r;", "b0", "(I)Lh/r;", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "Z", "()Z", "c", "Landroid/hardware/camera2/CameraCharacteristics;", "d", "Li/g2;", "e", "Ljava/util/Map;", "f", "Ljava/util/Set;", "Landroid/util/ArrayMap;", "g", "Landroid/util/ArrayMap;", "values", "extensionCache", "Loq/k;", "j", "Loq/k;", "_supportedExtensions", "k", "_keys", "Landroid/hardware/camera2/CaptureRequest$Key;", "l", "_requestKeys", "Landroid/hardware/camera2/CaptureResult$Key;", "m", "_resultKeys", "n", "_physicalCameraIds", "p", "_physicalRequestKeys", "q", "_sessionCharacteristicsKeys", "r", "_sessionKeys", "H0", "()Ljava/util/Set;", "sessionKeys", "physicalCameraIds", "K", "supportedExtensions", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i1 implements h.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String camera;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isRedacted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CameraCharacteristics characteristics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g2 metadataProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<h.a1.a<?>, Object> metadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<CameraCharacteristics.Key<?>> cacheBlocklist;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayMap<CameraCharacteristics.Key<?>, Object> values;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ArrayMap<Integer, h.r> extensionCache;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<Integer>> _supportedExtensions;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CameraCharacteristics.Key<?>>> _keys;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CaptureRequest.Key<?>>> _requestKeys;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CaptureResult.Key<?>>> _resultKeys;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<h.v>> _physicalCameraIds;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CaptureRequest.Key<?>>> _physicalRequestKeys;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CameraCharacteristics.Key<?>>> _sessionCharacteristicsKeys;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CaptureRequest.Key<?>>> _sessionKeys;

    public /* synthetic */ i1(String str, boolean z15, CameraCharacteristics cameraCharacteristics, g2 g2Var, Map map, Set set, fr.k kVar) {
        this(str, z15, cameraCharacteristics, g2Var, map, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set A(i1 i1Var) {
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection("Camera-" + ((Object) h.v.f(i1Var.getCamera())) + "#supportedExtensions");
                return i1Var.metadataProvider.c(i1Var.getCamera());
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) h.v.f(i1Var.getCamera())), e15);
            }
            return pq.e1.e();
        }
    }

    private final <T> T F(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key<T> key) {
        try {
            return (T) cameraCharacteristics.get(key);
        } catch (AssertionError unused) {
            throw new IllegalStateException("Failed to get characteristic for " + key + ": Framework throw an AssertionError");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o(i1 i1Var) {
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection(((Object) h.v.f(i1Var.getCamera())) + "#keys");
                List<CameraCharacteristics.Key<?>> keys = i1Var.characteristics.getKeys();
                if (keys == null) {
                    keys = pq.v.n();
                }
                return pq.v.k1(keys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getKeys from " + ((Object) h.v.f(i1Var.getCamera())) + '}', e15);
            }
            return pq.e1.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set q(i1 i1Var) {
        if (Build.VERSION.SDK_INT < 28) {
            return pq.e1.e();
        }
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection(((Object) h.v.f(i1Var.getCamera())) + "#physicalCameraIds");
                Set<String> setE = w.e(i1Var.characteristics);
                if (k.k.f107055a.c()) {
                    h.v.f(i1Var.getCamera());
                    Objects.toString(setE);
                }
                if (setE == null) {
                    setE = pq.e1.e();
                }
                Set<String> set = setE;
                ArrayList arrayList = new ArrayList(pq.v.y(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(h.v.a(h.v.b((String) it.next())));
                }
                return pq.v.k1(arrayList);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) h.v.f(i1Var.getCamera())), e15);
            }
            return pq.e1.e();
        } catch (NullPointerException e16) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) h.v.f(i1Var.getCamera())), e16);
            }
            return pq.e1.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set s(i1 i1Var) {
        if (Build.VERSION.SDK_INT < 28) {
            return pq.e1.e();
        }
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection("Camera-" + i1Var.getCamera() + "#availablePhysicalCameraRequestKeys");
                List<CaptureRequest.Key<?>> listB = w.b(i1Var.characteristics);
                if (listB == null) {
                    listB = pq.v.n();
                }
                return pq.v.k1(listB);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + i1Var.getCamera(), e15);
            }
            return pq.e1.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set t(i1 i1Var) {
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection(((Object) h.v.f(i1Var.getCamera())) + "#availableCaptureRequestKeys");
                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = i1Var.characteristics.getAvailableCaptureRequestKeys();
                if (availableCaptureRequestKeys == null) {
                    availableCaptureRequestKeys = pq.v.n();
                }
                return pq.v.k1(availableCaptureRequestKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) h.v.f(i1Var.getCamera())), e15);
            }
            return pq.e1.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set v(i1 i1Var) {
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection(((Object) h.v.f(i1Var.getCamera())) + "#availableCaptureResultKeys");
                List<CaptureResult.Key<?>> availableCaptureResultKeys = i1Var.characteristics.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys == null) {
                    availableCaptureResultKeys = pq.v.n();
                }
                return pq.v.k1(availableCaptureResultKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) h.v.f(i1Var.getCamera())), e15);
            }
            return pq.e1.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set w(i1 i1Var) {
        if (Build.VERSION.SDK_INT < 35) {
            return pq.e1.e();
        }
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection("Camera-" + i1Var.getCamera() + "#getAvailableSessionCharacteristicsKeys");
                List<CameraCharacteristics.Key<?>> listA = m0.a(i1Var.characteristics);
                if (listA == null) {
                    listA = pq.v.n();
                }
                return pq.v.k1(listA);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + i1Var.getCamera(), e15);
            }
            return pq.e1.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set x(i1 i1Var) {
        if (Build.VERSION.SDK_INT < 28) {
            return pq.e1.e();
        }
        try {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection("Camera-" + i1Var.getCamera() + "#availableSessionKeys");
                List<CaptureRequest.Key<?>> listC = w.c(i1Var.characteristics);
                if (listC == null) {
                    listC = pq.v.n();
                }
                return pq.v.k1(listC);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to getAvailableSessionKeys from Camera-" + i1Var.getCamera(), e15);
            }
            return pq.e1.e();
        }
    }

    @Override // h.x
    public Set<CaptureRequest.Key<?>> H0() {
        return this._sessionKeys.getValue();
    }

    @Override // h.x
    public <T> T J(CameraCharacteristics.Key<T> key) {
        T t15;
        if (this.cacheBlocklist.contains(key)) {
            return (T) F(this.characteristics, key);
        }
        synchronized (this.values) {
            t15 = (T) this.values.get(key);
        }
        if (t15 != null) {
            return t15;
        }
        T t16 = (T) F(this.characteristics, key);
        if (t16 == null) {
            return t16;
        }
        synchronized (this.values) {
            this.values.put((CameraCharacteristics.Key<?>) key, t16);
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return t16;
    }

    @Override // h.x
    public Set<Integer> K() {
        return this._supportedExtensions.getValue();
    }

    @Override // h.x
    public h.x O(String cameraId) {
        if (Z().contains(h.v.a(cameraId))) {
            return this.metadataProvider.a(cameraId);
        }
        throw new IllegalStateException((((Object) h.v.f(cameraId)) + " is not a valid physical camera on " + this).toString());
    }

    @Override // h.x
    public Set<h.v> Z() {
        return this._physicalCameraIds.getValue();
    }

    @Override // h.x
    public h.r b0(int extension) {
        h.r rVar;
        synchronized (this.extensionCache) {
            rVar = this.extensionCache.get(Integer.valueOf(extension));
        }
        if (rVar != null) {
            return rVar;
        }
        h.r rVarD = this.metadataProvider.d(getCamera(), extension);
        synchronized (this.extensionCache) {
            this.extensionCache.put(Integer.valueOf(extension), rVarD);
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return rVarD;
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(CameraCharacteristics.class))) {
            return (T) this.characteristics;
        }
        return null;
    }

    @Override // h.x
    public <T> T d0(CameraCharacteristics.Key<T> key, T t15) {
        T t16 = (T) J(key);
        return t16 == null ? t15 : t16;
    }

    @Override // h.x
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getCamera() {
        return this.camera;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i1(String str, boolean z15, CameraCharacteristics cameraCharacteristics, g2 g2Var, Map<h.a1.a<?>, ? extends Object> map, Set<? extends CameraCharacteristics.Key<?>> set) {
        this.camera = str;
        this.isRedacted = z15;
        this.characteristics = cameraCharacteristics;
        this.metadataProvider = g2Var;
        this.metadata = map;
        this.cacheBlocklist = set;
        this.values = new ArrayMap<>();
        this.extensionCache = new ArrayMap<>();
        oq.o oVar = oq.o.PUBLICATION;
        this._supportedExtensions = oq.l.b(oVar, new er.a() { // from class: i.a1
            @Override // er.a
            public final Object a() {
                return i1.A(this.f86957a);
            }
        });
        this._keys = oq.l.b(oVar, new er.a() { // from class: i.b1
            @Override // er.a
            public final Object a() {
                return i1.o(this.f87038a);
            }
        });
        this._requestKeys = oq.l.b(oVar, new er.a() { // from class: i.c1
            @Override // er.a
            public final Object a() {
                return i1.t(this.f87045a);
            }
        });
        this._resultKeys = oq.l.b(oVar, new er.a() { // from class: i.d1
            @Override // er.a
            public final Object a() {
                return i1.v(this.f87062a);
            }
        });
        this._physicalCameraIds = oq.l.b(oVar, new er.a() { // from class: i.e1
            @Override // er.a
            public final Object a() {
                return i1.q(this.f87076a);
            }
        });
        this._physicalRequestKeys = oq.l.b(oVar, new er.a() { // from class: i.f1
            @Override // er.a
            public final Object a() {
                return i1.s(this.f87094a);
            }
        });
        this._sessionCharacteristicsKeys = oq.l.b(oVar, new er.a() { // from class: i.g1
            @Override // er.a
            public final Object a() {
                return i1.w(this.f87135a);
            }
        });
        this._sessionKeys = oq.l.b(oVar, new er.a() { // from class: i.h1
            @Override // er.a
            public final Object a() {
                return i1.x(this.f87162a);
            }
        });
    }
}
