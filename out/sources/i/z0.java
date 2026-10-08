package i;

import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R,\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R0\u0010+\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010#R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020'\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R$\u00100\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00103\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010/R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00109\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001b¨\u0006:"}, d2 = {"Li/z0;", "Lh/r;", "Lh/v;", "camera", "", "isRedacted", "", "cameraExtension", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "extensionCharacteristics", "", "Lh/a1$a;", "", "metadata", "<init>", "(Ljava/lang/String;ZILandroid/hardware/camera2/CameraExtensionCharacteristics;Ljava/util/Map;Lfr/k;)V", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "Z", "()Z", "c", "I", "f", "()I", "d", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "e", "Ljava/util/Map;", "", "Loq/k;", "", "Landroid/util/Size;", "supportedExtensionSizesByFormat", "Ljava/lang/Class;", "g", "supportedExtensionSizesByClass", "supportedPostviewSizes", "Landroid/hardware/camera2/CaptureRequest$Key;", "j", "Loq/k;", "_requestKeys", "Landroid/hardware/camera2/CaptureResult$Key;", "k", "_resultKeys", "l", "_isPostviewSupported", "m", "_isCaptureProgressSupported", "p", "isPostviewSupported", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 implements h.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String camera;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isRedacted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int cameraExtension;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CameraExtensionCharacteristics extensionCharacteristics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<h.a1.a<?>, Object> metadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, oq.k<Set<Size>>> supportedExtensionSizesByFormat;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<Class<?>, oq.k<Set<Size>>> supportedExtensionSizesByClass;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<Size, oq.k<Set<Size>>> supportedPostviewSizes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CaptureRequest.Key<?>>> _requestKeys;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Set<CaptureResult.Key<?>>> _resultKeys;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Boolean> _isPostviewSupported;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Boolean> _isCaptureProgressSupported;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements er.a<Set<? extends CaptureRequest.Key<Object>>> {
        public a(z0 z0Var) {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Set<CaptureRequest.Key<Object>> a() {
            String str = ((Object) h.v.f(z0.this.getCamera())) + "#availableCaptureRequestKeys";
            try {
                k.h hVar = k.h.f107050a;
                try {
                    Trace.beginSection(str);
                    Set<CaptureRequest.Key<Object>> setK1 = Build.VERSION.SDK_INT >= 33 ? pq.v.k1(f0.a(z0.this.extensionCharacteristics, z0.this.getCameraExtension())) : pq.e1.e();
                    if (setK1 == null) {
                        setK1 = pq.e1.e();
                    }
                    return setK1;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th4) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.h("CXCP", "Failed to get " + str + "! Caching {} and ignoring exception.", th4);
                }
                return pq.e1.e();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements er.a<Set<? extends CaptureResult.Key<Object>>> {
        public b(z0 z0Var) {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Set<CaptureResult.Key<Object>> a() {
            String str = ((Object) h.v.f(z0.this.getCamera())) + "#availableCaptureResultKeys";
            try {
                k.h hVar = k.h.f107050a;
                try {
                    Trace.beginSection(str);
                    Set<CaptureResult.Key<Object>> setK1 = Build.VERSION.SDK_INT >= 33 ? pq.v.k1(f0.b(z0.this.extensionCharacteristics, z0.this.getCameraExtension())) : pq.e1.e();
                    if (setK1 == null) {
                        setK1 = pq.e1.e();
                    }
                    return setK1;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th4) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.h("CXCP", "Failed to get " + str + "! Caching {} and ignoring exception.", th4);
                }
                return pq.e1.e();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements er.a<Boolean> {
        public c(z0 z0Var) {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            String str = ((Object) h.v.f(z0.this.getCamera())) + "#isPostviewSupported";
            boolean z15 = false;
            try {
                k.h hVar = k.h.f107050a;
                try {
                    Trace.beginSection(str);
                    boolean zB = Build.VERSION.SDK_INT >= 34 ? h0.b(z0.this.extensionCharacteristics, z0.this.getCameraExtension()) : false;
                    Trace.endSection();
                    z15 = zB;
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.h("CXCP", "Failed to get " + str + "! Caching false and ignoring exception.", th5);
                }
            }
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements er.a<Boolean> {
        public d(z0 z0Var) {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            String str = ((Object) h.v.f(z0.this.getCamera())) + "#isCaptureProgressSupported";
            boolean z15 = false;
            try {
                k.h hVar = k.h.f107050a;
                try {
                    Trace.beginSection(str);
                    boolean zA = Build.VERSION.SDK_INT >= 34 ? h0.a(z0.this.extensionCharacteristics, z0.this.getCameraExtension()) : false;
                    Trace.endSection();
                    z15 = zA;
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.h("CXCP", "Failed to get " + str + "! Caching false and ignoring exception.", th5);
                }
            }
            return Boolean.valueOf(z15);
        }
    }

    public /* synthetic */ z0(String str, boolean z15, int i15, CameraExtensionCharacteristics cameraExtensionCharacteristics, Map map, fr.k kVar) {
        this(str, z15, i15, cameraExtensionCharacteristics, map);
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(y0.a()))) {
            return (T) this.extensionCharacteristics;
        }
        return null;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public int getCameraExtension() {
        return this.cameraExtension;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public String getCamera() {
        return this.camera;
    }

    @Override // h.r
    public boolean p() {
        return this._isPostviewSupported.getValue().booleanValue();
    }

    private z0(String str, boolean z15, int i15, CameraExtensionCharacteristics cameraExtensionCharacteristics, Map<h.a1.a<?>, ? extends Object> map) {
        this.camera = str;
        this.isRedacted = z15;
        this.cameraExtension = i15;
        this.extensionCharacteristics = cameraExtensionCharacteristics;
        this.metadata = map;
        this.supportedExtensionSizesByFormat = new LinkedHashMap();
        this.supportedExtensionSizesByClass = new LinkedHashMap();
        this.supportedPostviewSizes = new LinkedHashMap();
        oq.o oVar = oq.o.PUBLICATION;
        this._requestKeys = oq.l.b(oVar, new a(this));
        this._resultKeys = oq.l.b(oVar, new b(this));
        this._isPostviewSupported = oq.l.b(oVar, new c(this));
        this._isCaptureProgressSupported = oq.l.b(oVar, new d(this));
    }
}
