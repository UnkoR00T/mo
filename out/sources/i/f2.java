package i;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Arrays;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150+2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00108\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020#048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020(048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u00107R \u0010<\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001a048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u00107¨\u0006="}, d2 = {"Li/f2;", "Li/g2;", "Landroid/content/Context;", "cameraPipeContext", "Lk/z;", "threads", "Lk/n;", "permissions", "Lh/z$c;", "cameraMetadataConfig", "Lk/a0;", "timeSource", "<init>", "(Landroid/content/Context;Lk/z;Lk/n;Lh/z$c;Lk/a0;)V", "Lh/v;", "cameraId", "", "redacted", "Li/i1;", "p", "(Ljava/lang/String;Z)Li/i1;", "", "extension", "Li/z0;", "o", "(Ljava/lang/String;ZI)Li/z0;", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "q", "(Ljava/lang/String;)Landroid/hardware/camera2/CameraExtensionCharacteristics;", "r", "()Z", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "s", "(Landroid/hardware/camera2/CameraCharacteristics;)Z", "Lh/x;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;)Lh/x;", "Lh/r;", "d", "(Ljava/lang/String;I)Lh/r;", "", "c", "(Ljava/lang/String;)Ljava/util/Set;", "Landroid/content/Context;", "Lk/z;", "Lk/n;", "Lh/z$c;", "e", "Lk/a0;", "Landroid/util/ArrayMap;", "", "f", "Landroid/util/ArrayMap;", "cache", "g", "extensionCache", "h", "extensionCharacteristicsCache", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context cameraPipeContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k.n permissions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h.z.c cameraMetadataConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k.a0 timeSource;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayMap<String, h.x> cache = new ArrayMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayMap<String, h.r> extensionCache = new ArrayMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ArrayMap<String, CameraExtensionCharacteristics> extensionCharacteristicsCache = new ArrayMap<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lh/x;", "<anonymous>", "(Lju/p0;)Lh/x;"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super h.x>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87103e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f87105g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f87105g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87103e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return f2.this.a(this.f87105g);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super h.x> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return f2.this.new a(this.f87105g, eVar);
        }
    }

    public f2(Context context, k.z zVar, k.n nVar, h.z.c cVar, k.a0 a0Var) {
        this.cameraPipeContext = context;
        this.threads = zVar;
        this.permissions = nVar;
        this.cameraMetadataConfig = cVar;
        this.timeSource = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0 o(String cameraId, boolean redacted, int extension) {
        String str;
        Throwable th4;
        k.c0 c0Var = k.c0.f107031a;
        long jA = this.timeSource.a();
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(((Object) h.v.f(cameraId)) + "#readCameraExtensionMetadata");
            try {
                k.k kVar = k.k.f107055a;
                if (kVar.a()) {
                    try {
                        h.v.f(cameraId);
                    } catch (Throwable th5) {
                        th4 = th5;
                        str = cameraId;
                        throw new IllegalStateException("Failed to load extension metadata for " + ((Object) h.v.f(str)) + '!', th4);
                    }
                }
                str = cameraId;
                try {
                    z0 z0Var = new z0(str, redacted, extension, q(cameraId), pq.v0.i(), null);
                    if (kVar.c()) {
                        long jC = k.i.c(this.timeSource.a() - jA);
                        if (redacted && !redacted) {
                            throw new oq.p();
                        }
                        h.v.f(str);
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                    }
                    Trace.endSection();
                    return z0Var;
                } catch (Throwable th6) {
                    th = th6;
                    th4 = th;
                    throw new IllegalStateException("Failed to load extension metadata for " + ((Object) h.v.f(str)) + '!', th4);
                }
            } catch (Throwable th7) {
                th = th7;
                str = cameraId;
            }
        } catch (Throwable th8) {
            Trace.endSection();
            throw th8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i1 p(String cameraId, boolean redacted) {
        Throwable th4;
        Set<CameraCharacteristics.Key<?>> setM;
        k.c0 c0Var = k.c0.f107031a;
        long jA = this.timeSource.a();
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(((Object) h.v.f(cameraId)) + "#readCameraMetadata");
            try {
                k.k kVar = k.k.f107055a;
                if (kVar.a()) {
                    try {
                        h.v.f(cameraId);
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                }
                CameraCharacteristics cameraCharacteristics = ((CameraManager) this.cameraPipeContext.getSystemService("camera")).getCameraCharacteristics(cameraId);
                try {
                    if (cameraCharacteristics == null) {
                        throw new IllegalStateException(("Failed to get CameraCharacteristics for " + ((Object) h.v.f(cameraId)) + '!').toString());
                    }
                    if (s(cameraCharacteristics)) {
                        Set<CameraCharacteristics.Key<?>> setE = this.cameraMetadataConfig.b().get(h.v.a(cameraId));
                        if (setE == null) {
                            setE = pq.e1.e();
                        }
                        setM = pq.e1.m(setE, CameraCharacteristics.SENSOR_ORIENTATION);
                    } else {
                        setM = this.cameraMetadataConfig.b().get(h.v.a(cameraId));
                    }
                    i1 i1Var = new i1(cameraId, redacted, cameraCharacteristics, this, pq.v0.i(), setM == null ? this.cameraMetadataConfig.a() : pq.e1.l(this.cameraMetadataConfig.a(), setM), null);
                    if (kVar.c()) {
                        long jC = k.i.c(this.timeSource.a() - jA);
                        if (redacted && !redacted) {
                            throw new oq.p();
                        }
                        h.v.f(cameraId);
                        String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jC / 1000000.0d)}, 1));
                    }
                    Trace.endSection();
                    return i1Var;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
            th4 = th;
            if (h.q.INSTANCE.s(th4)) {
                throw new h.l0("Failed to load metadata: Do Not Disturb mode is on!");
            }
            throw new IllegalStateException("Failed to load metadata for " + ((Object) h.v.f(cameraId)) + '!', th4);
        } catch (Throwable th8) {
            Trace.endSection();
            throw th8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraExtensionCharacteristics q(String cameraId) {
        synchronized (this.extensionCharacteristicsCache) {
            CameraExtensionCharacteristics cameraExtensionCharacteristicsA = d2.a(this.extensionCharacteristicsCache.get(cameraId));
            if (cameraExtensionCharacteristicsA != null) {
                return cameraExtensionCharacteristicsA;
            }
            oq.i0 i0Var = oq.i0.f148189a;
            if (k.k.f107055a.a()) {
                h.v.f(cameraId);
            }
            CameraExtensionCharacteristics cameraExtensionCharacteristicsC = e0.c((CameraManager) this.cameraPipeContext.getSystemService("camera"), cameraId);
            if (cameraExtensionCharacteristicsC != null) {
                return cameraExtensionCharacteristicsC;
            }
            throw new IllegalStateException(("Failed to get CameraExtensionCharacteristics for " + ((Object) h.v.f(cameraId)) + '!').toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return !this.permissions.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s(CameraCharacteristics characteristics) {
        return Build.VERSION.SDK_INT >= 32 && characteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) != null;
    }

    @Override // i.g2
    public h.x a(String cameraId) {
        h.x xVarP;
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(((Object) h.v.f(cameraId)) + "#awaitMetadata");
            synchronized (this.cache) {
                try {
                    xVarP = (h.x) this.cache.get(cameraId);
                    if (xVarP == null) {
                        if (r()) {
                            oq.i0 i0Var = oq.i0.f148189a;
                            xVarP = p(cameraId, true);
                        } else {
                            xVarP = p(cameraId, false);
                            this.cache.put(cameraId, xVarP);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            Trace.endSection();
            return xVarP;
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    @Override // i.g2
    public Object b(String str, tq.e<? super h.x> eVar) {
        synchronized (this.cache) {
            h.x xVar = this.cache.get(str);
            if (xVar != null) {
                return xVar;
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return ju.i.g(this.threads.getBackgroundDispatcher(), new a(str, null), eVar);
        }
    }

    @Override // i.g2
    public Set<Integer> c(String cameraId) {
        return Build.VERSION.SDK_INT >= 31 ? pq.v.k1(e0.e(q(cameraId))) : pq.e1.e();
    }

    @Override // i.g2
    public h.r d(String cameraId, int extension) throws Exception {
        h.r rVarO;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 31) {
            throw new Exception("Extension sessions are only supported on Android S or higher. Device SDK is " + i15);
        }
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection(((Object) h.v.f(cameraId)) + "#awaitExtensionMetadata");
            synchronized (this.extensionCache) {
                try {
                    rVarO = (h.r) this.extensionCache.get(cameraId);
                    if (rVarO == null) {
                        if (r()) {
                            oq.i0 i0Var = oq.i0.f148189a;
                            rVarO = o(cameraId, true, extension);
                        } else {
                            rVarO = o(cameraId, false, extension);
                            this.extensionCache.put(cameraId, rVarO);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            Trace.endSection();
            return rVarO;
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }
}
