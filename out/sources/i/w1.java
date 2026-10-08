package i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ju.CoroutineName;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001BY\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J7\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\u001f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u001c\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u001c\u001a\u00020\u0017H\u0087@¢\u0006\u0004\b4\u00102J\u0015\u00105\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b5\u0010*J\u001b\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001706\u0018\u000106¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u001f¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010<R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010P\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001706\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR(\u0010U\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000R0Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR(\u0010W\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001030R0Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u0014\u0010Z\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010\u0019R#\u0010b\u001a\n ^*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010_\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Li/w1;", "", "Lnq/a;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lk/z;", "threads", "Landroid/content/Context;", "context", "Landroid/content/pm/PackageManager;", "packageManager", "Lm/d;", "cameraErrorListener", "Ll0/e;", "cameraDeviceSetupCompatFactoryProvider", "Lm/g;", "cameraPipeLifetime", "Lju/d2;", "cameraPipeJob", "<init>", "(Lnq/a;Lk/z;Landroid/content/Context;Landroid/content/pm/PackageManager;Lm/d;Lnq/a;Lm/g;Lju/d2;)V", "Lmu/g;", "", "Lh/v;", "q", "()Lmu/g;", "Llu/w;", "", "cameraId", "", "isAvailable", "Loq/i0;", "y", "(Llu/w;Ljava/lang/String;Z)V", "cachedCameraIds", "cameraIdsRead", "w", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "cameraIds", "A", "(Llu/w;Ljava/util/List;)V", "z", "()Ljava/util/List;", "", "r", "(Landroid/content/pm/PackageManager;)I", "x", "(Ljava/util/List;)Z", "Ll0/d;", "u", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Li/b2;", "v", "n", "", "o", "()Ljava/util/Set;", "B", "()V", "a", "Lnq/a;", "b", "Lk/z;", "c", "Landroid/content/Context;", "d", "Lm/d;", "e", "Lju/p0;", "f", "Lju/p0;", "scope", "g", "Ljava/lang/Object;", "lock", "h", "Ljava/util/List;", "openableCameras", "i", "Ljava/util/Set;", "concurrentCameras", "", "Lju/w0;", "j", "Ljava/util/Map;", "cameraDeviceSetupCache", "k", "camera2DeviceSetupWrapperCache", "l", "I", "minimumCameraCount", "m", "Lmu/g;", "t", "kotlin.jvm.PlatformType", "Loq/k;", "s", "()Ll0/e;", "cameraDeviceSetupCompatFactory", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nq.a<CameraManager> cameraManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m.d cameraErrorListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final nq.a<l0.e> cameraDeviceSetupCompatFactoryProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<h.v> openableCameras;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Set<? extends Set<h.v>> concurrentCameras;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Map<h.v, ju.w0<l0.d>> cameraDeviceSetupCache;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Map<h.v, ju.w0<b2>> camera2DeviceSetupWrapperCache;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int minimumCameraCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.g<List<h.v>> cameraIds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oq.k cameraDeviceSetupCompatFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu/w;", "", "Lh/v;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<lu.w<? super List<? extends h.v>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f87482f;

        /* JADX INFO: renamed from: i.w1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"i/w1$a$a", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "", "cameraId", "Loq/i0;", "onCameraAvailable", "(Ljava/lang/String;)V", "onCameraUnavailable", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2053a extends CameraManager.AvailabilityCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w1 f87484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ lu.w<List<h.v>> f87485b;

            /* JADX WARN: Multi-variable type inference failed */
            C2053a(w1 w1Var, lu.w<? super List<h.v>> wVar) {
                this.f87484a = w1Var;
                this.f87485b = wVar;
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAvailable(String cameraId) {
                this.f87484a.y(this.f87485b, cameraId, true);
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraUnavailable(String cameraId) {
                this.f87484a.y(this.f87485b, cameraId, false);
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(CameraManager cameraManager, C2053a c2053a) {
            cameraManager.unregisterAvailabilityCallback(c2053a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List list;
            Object objE = uq.b.e();
            int i15 = this.f87481e;
            if (i15 == 0) {
                oq.u.b(obj);
                lu.w wVar = (lu.w) this.f87482f;
                final C2053a c2053a = new C2053a(w1.this, wVar);
                final CameraManager cameraManager = (CameraManager) w1.this.cameraManager.get();
                cameraManager.registerAvailabilityCallback(c2053a, w1.this.threads.i());
                Object obj2 = w1.this.lock;
                w1 w1Var = w1.this;
                synchronized (obj2) {
                    list = w1Var.openableCameras;
                }
                if (list != null) {
                    w1.this.A(wVar, list);
                } else {
                    List listZ = w1.this.z();
                    if (listZ != null) {
                        w1.this.A(wVar, listZ);
                    }
                }
                er.a aVar = new er.a() { // from class: i.v1
                    @Override // er.a
                    public final Object a() {
                        return w1.a.O(cameraManager, c2053a);
                    }
                };
                this.f87481e = 1;
                if (lu.u.b(wVar, aVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(lu.w<? super List<h.v>> wVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(wVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = w1.this.new a(eVar);
            aVar.f87482f = obj;
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87488f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87490h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87488f = obj;
            this.f87490h |= PKIFailureInfo.systemUnavail;
            return w1.this.u(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ll0/d;", "<anonymous>", "(Lju/p0;)Ll0/d;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super l0.d>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f87492f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w1 f87493g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, w1 w1Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f87492f = str;
            this.f87493g = w1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            uq.b.e();
            if (this.f87491e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k.k kVar = k.k.f107055a;
            String str = this.f87492f;
            if (kVar.a()) {
                h.v.f(str);
            }
            String str2 = this.f87492f;
            m.d dVar = this.f87493g.cameraErrorListener;
            try {
                return this.f87493g.s().a(this.f87492f);
            } catch (Exception e15) {
                if (e15 instanceof CameraAccessException) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                    }
                    dVar.a(str2, h.q.INSTANCE.b((CameraAccessException) e15), true);
                    return null;
                }
                if (!(e15 instanceof IllegalArgumentException) && !(e15 instanceof SecurityException) && !(e15 instanceof UnsupportedOperationException) && !(e15 instanceof NullPointerException)) {
                    if (!(e15 instanceof IllegalStateException)) {
                        throw e15;
                    }
                    k.k.f107055a.a();
                    return null;
                }
                if (k.k.f107055a.d()) {
                    io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
                }
                dVar.a(str2, h.q.INSTANCE.m(), false);
                return null;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super l0.d> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f87492f, this.f87493g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87496f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f87498h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87496f = obj;
            this.f87498h |= PKIFailureInfo.systemUnavail;
            return w1.this.v(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Li/a2;", "<anonymous>", "(Lju/p0;)Li/a2;"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super a2>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f87500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w1 f87501g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, w1 w1Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f87500f = str;
            this.f87501g = w1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            Boolean boolA;
            CameraDevice.CameraDeviceSetup cameraDeviceSetup;
            uq.b.e();
            if (this.f87499e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String str = this.f87500f;
            m.d dVar = this.f87501g.cameraErrorListener;
            try {
                boolA = vq.b.a(((CameraManager) this.f87501g.cameraManager.get()).isCameraDeviceSetupSupported(this.f87500f));
            } catch (Exception e15) {
                if (e15 instanceof CameraAccessException) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e15.getMessage());
                    }
                    dVar.a(str, h.q.INSTANCE.b((CameraAccessException) e15), true);
                } else if ((e15 instanceof IllegalArgumentException) || (e15 instanceof SecurityException) || (e15 instanceof UnsupportedOperationException) || (e15 instanceof NullPointerException)) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e15.getMessage());
                    }
                    dVar.a(str, h.q.INSTANCE.m(), false);
                } else {
                    if (!(e15 instanceof IllegalStateException)) {
                        throw e15;
                    }
                    k.k.f107055a.a();
                }
                boolA = null;
            }
            if (!fr.t.c(boolA, vq.b.a(true))) {
                return null;
            }
            k.k kVar = k.k.f107055a;
            String str2 = this.f87500f;
            if (kVar.a()) {
                h.v.f(str2);
            }
            String str3 = this.f87500f;
            m.d dVar2 = this.f87501g.cameraErrorListener;
            try {
                cameraDeviceSetup = ((CameraManager) this.f87501g.cameraManager.get()).getCameraDeviceSetup(this.f87500f);
            } catch (Exception e16) {
                if (e16 instanceof CameraAccessException) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Camera encountered an error: " + e16.getMessage());
                    }
                    dVar2.a(str3, h.q.INSTANCE.b((CameraAccessException) e16), true);
                } else if ((e16 instanceof IllegalArgumentException) || (e16 instanceof SecurityException) || (e16 instanceof UnsupportedOperationException) || (e16 instanceof NullPointerException)) {
                    if (k.k.f107055a.d()) {
                        io.sentry.android.core.c2.g("CXCP", "Failed to execute call: Unexpected exception: " + e16.getMessage());
                    }
                    dVar2.a(str3, h.q.INSTANCE.m(), false);
                } else {
                    if (!(e16 instanceof IllegalStateException)) {
                        throw e16;
                    }
                    k.k.f107055a.a();
                }
                cameraDeviceSetup = null;
            }
            if (cameraDeviceSetup != null) {
                return new a2(cameraDeviceSetup, this.f87500f, this.f87501g.cameraErrorListener, null);
            }
            return null;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super a2> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f87500f, this.f87501g, eVar);
        }
    }

    public w1(nq.a<CameraManager> aVar, k.z zVar, Context context, PackageManager packageManager, m.d dVar, nq.a<l0.e> aVar2, m.g gVar, ju.d2 d2Var) {
        this.cameraManager = aVar;
        this.threads = zVar;
        this.context = context;
        this.cameraErrorListener = dVar;
        this.cameraDeviceSetupCompatFactoryProvider = aVar2;
        ju.p0 p0VarA = ju.q0.a(ju.z2.a(d2Var).n0(zVar.getLightweightDispatcher()).n0(new CoroutineName("Camera2DeviceCache")));
        this.scope = p0VarA;
        this.lock = new Object();
        this.cameraDeviceSetupCache = new LinkedHashMap();
        this.camera2DeviceSetupWrapperCache = new LinkedHashMap();
        this.minimumCameraCount = r(packageManager);
        if (k.k.f107055a.a()) {
            int unused = this.minimumCameraCount;
        }
        gVar.d(m.g.b.SCOPE, new Runnable() { // from class: i.t1
            @Override // java.lang.Runnable
            public final void run() {
                w1.c(this.f87419a);
            }
        });
        this.cameraIds = mu.i.a0(mu.i.p(q()), p0VarA, mu.l0.Companion.b(mu.l0.INSTANCE, 0L, 0L, 3, null), 1);
        this.cameraDeviceSetupCompatFactory = oq.l.a(new er.a() { // from class: i.u1
            @Override // er.a
            public final Object a() {
                return w1.p(this.f87454a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(lu.w<? super List<h.v>> wVar, List<h.v> list) {
        k.k kVar = k.k.f107055a;
        if (kVar.a()) {
            Objects.toString(list);
        }
        Object objB = lu.n.b(wVar, list);
        if (objB instanceof lu.k.c) {
            lu.k.e(objB);
            if (kVar.b()) {
                io.sentry.android.core.c2.e("CXCP", "Failed to send camera ID list: " + list + '!');
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(w1 w1Var) {
        ju.q0.d(w1Var.scope, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0.e p(w1 w1Var) {
        return w1Var.cameraDeviceSetupCompatFactoryProvider.get();
    }

    private final mu.g<List<h.v>> q() {
        return mu.i.e(new a(null));
    }

    private final int r(PackageManager packageManager) {
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        return packageManager.hasSystemFeature("android.hardware.camera.front") ? (zHasSystemFeature ? 1 : 0) + 1 : zHasSystemFeature ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0.e s() {
        return (l0.e) this.cameraDeviceSetupCompatFactory.getValue();
    }

    private final List<h.v> w(List<h.v> cachedCameraIds, List<h.v> cameraIdsRead) {
        return (cameraIdsRead == null || !(x(cameraIdsRead) || cachedCameraIds == null)) ? cachedCameraIds : cameraIdsRead;
    }

    private final boolean x(List<h.v> cameraIds) {
        return cameraIds.size() >= this.minimumCameraCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[EDGE_INSN: B:20:0x0038->B:34:0x007a BREAK  A[LOOP:0: B:15:0x0021->B:47:?]] */
    public final void y(lu.w<? super List<h.v>> wVar, String str, boolean z15) {
        List<h.v> list;
        synchronized (this.lock) {
            list = this.openableCameras;
        }
        List<h.v> listZ = null;
        if (z15) {
            if (list == null) {
                k.k.f107055a.c();
                listZ = z();
                break;
            }
            List<h.v> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        k.k.f107055a.c();
                        listZ = z();
                        break;
                    }
                } while (!fr.t.c(((h.v) it.next()).getValue(), str));
            } else {
                k.k.f107055a.c();
                listZ = z();
                break;
            }
        } else if (!z15) {
            if (list == null) {
                k.k.f107055a.c();
                listZ = z();
                break;
            }
            List<h.v> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    if (fr.t.c(((h.v) it4.next()).getValue(), str)) {
                        k.k.f107055a.c();
                        listZ = z();
                        break;
                    }
                }
            }
        } else {
            throw new oq.p();
        }
        List<h.v> listW = w(list, listZ);
        if (listW != null) {
            A(wVar, listW);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<h.v> z() {
        try {
            String[] cameraIdList = this.cameraManager.get().getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                String strB = h.v.b(str);
                h.v vVarA = strB != null ? h.v.a(strB) : null;
                if (vVarA != null) {
                    arrayList.add(vVarA);
                }
            }
            if (x(arrayList)) {
                synchronized (this.lock) {
                    this.openableCameras = arrayList;
                    oq.i0 i0Var = oq.i0.f148189a;
                }
                if (k.k.f107055a.c()) {
                    arrayList.toString();
                    return arrayList;
                }
            } else if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Failed to query camera ID list: Invalid list returned: " + arrayList + '.');
            }
            return arrayList;
        } catch (CameraAccessException e15) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to query CameraManager#getCameraIdList!", e15);
            }
            return null;
        } catch (ArrayIndexOutOfBoundsException e16) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", e16);
            }
            return null;
        } catch (NullPointerException e17) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.h("CXCP", "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", e17);
            }
            return null;
        }
    }

    public final void B() {
        ju.q0.d(this.scope, null, 1, null);
    }

    public final List<h.v> n() {
        List<h.v> list;
        synchronized (this.lock) {
            list = this.openableCameras;
        }
        return list != null ? list : z();
    }

    public final Set<Set<h.v>> o() {
        Set set;
        if (Build.VERSION.SDK_INT < 30) {
            return pq.e1.e();
        }
        synchronized (this.lock) {
            set = this.concurrentCameras;
        }
        Set set2 = set;
        if (set2 != null && !set2.isEmpty()) {
            return set;
        }
        try {
            Set<Set<String>> setA = y.a(this.cameraManager.get());
            if (k.k.f107055a.a()) {
                Objects.toString(setA);
            }
            Set<Set<String>> set3 = setA;
            ArrayList arrayList = new ArrayList(pq.v.y(set3, 10));
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                Set set4 = (Set) it.next();
                ArrayList arrayList2 = new ArrayList(pq.v.y(set4, 10));
                Iterator it4 = set4.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(h.v.a(h.v.b((String) it4.next())));
                }
                arrayList.add(pq.v.k1(arrayList2));
            }
            return pq.v.k1(arrayList);
        } catch (CameraAccessException e15) {
            if (!k.k.f107055a.d()) {
                return null;
            }
            io.sentry.android.core.c2.h("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e15);
            return null;
        }
    }

    public final mu.g<List<h.v>> t() {
        return this.cameraIds;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, tq.e<? super l0.d> eVar) throws Throwable {
        b bVar;
        ju.w0<l0.d> w0Var;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f87490h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f87490h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objI = bVar.f87488f;
        Object objE = uq.b.e();
        int i16 = bVar.f87490h;
        if (i16 == 0) {
            oq.u.b(objI);
            if (Build.VERSION.SDK_INT < 35) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    Map<h.v, ju.w0<l0.d>> map = this.cameraDeviceSetupCache;
                    h.v vVarA = h.v.a(str);
                    ju.w0<l0.d> w0VarB = map.get(vVarA);
                    if (w0VarB == null) {
                        w0VarB = ju.k.b(this.scope, this.threads.getBackgroundDispatcher(), null, new c(str, this, null), 2, null);
                        map.put(vVarA, w0VarB);
                    }
                    w0Var = w0VarB;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            bVar.f87486d = str;
            bVar.f87487e = w0Var;
            bVar.f87490h = 1;
            objI = w0Var.I(bVar);
            if (objI == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ju.w0<l0.d> w0Var2 = (ju.w0) bVar.f87487e;
            String str2 = (String) bVar.f87486d;
            oq.u.b(objI);
            w0Var = w0Var2;
            str = str2;
        }
        l0.d dVar = (l0.d) objI;
        if (dVar != null) {
            return dVar;
        }
        if (k.k.f107055a.a()) {
            h.v.f(str);
        }
        synchronized (this.lock) {
            this.cameraDeviceSetupCache.remove(h.v.a(str), w0Var);
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(String str, tq.e<? super b2> eVar) throws Throwable {
        d dVar;
        ju.w0<b2> w0Var;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f87498h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f87498h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objI = dVar.f87496f;
        Object objE = uq.b.e();
        int i16 = dVar.f87498h;
        if (i16 == 0) {
            oq.u.b(objI);
            synchronized (this.lock) {
                try {
                    Map<h.v, ju.w0<b2>> map = this.camera2DeviceSetupWrapperCache;
                    h.v vVarA = h.v.a(str);
                    ju.w0<b2> w0VarB = map.get(vVarA);
                    if (w0VarB == null) {
                        w0VarB = ju.k.b(this.scope, this.threads.getBackgroundDispatcher(), null, new e(str, this, null), 2, null);
                        map.put(vVarA, w0VarB);
                    }
                    w0Var = w0VarB;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            dVar.f87494d = str;
            dVar.f87495e = w0Var;
            dVar.f87498h = 1;
            objI = w0Var.I(dVar);
            if (objI == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ju.w0<b2> w0Var2 = (ju.w0) dVar.f87495e;
            String str2 = (String) dVar.f87494d;
            oq.u.b(objI);
            w0Var = w0Var2;
            str = str2;
        }
        b2 b2Var = (b2) objI;
        if (b2Var != null) {
            return b2Var;
        }
        if (k.k.f107055a.a()) {
            h.v.f(str);
        }
        synchronized (this.lock) {
            this.camera2DeviceSetupWrapperCache.remove(h.v.a(str), w0Var);
        }
        return b2Var;
    }
}
