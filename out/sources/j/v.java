package j;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import h.r1;
import i.f3;
import java.util.Map;
import ju.d2;
import ju.h2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lj/v;", "", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010%\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0002052\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107¨\u00068"}, d2 = {"Lj/v$a;", "", "<init>", "()V", "Lh/z$e;", "config", "Landroid/content/Context;", "k", "(Lh/z$e;)Landroid/content/Context;", "Lju/d2;", "i", "()Lju/d2;", "Lh/z$c;", "h", "(Lh/z$e;)Lh/z$c;", "cameraPipeContext", "Landroid/hardware/camera2/CameraManager;", "g", "(Landroid/content/Context;)Landroid/hardware/camera2/CameraManager;", "Li/f3;", "l", "(Landroid/content/Context;)Li/f3;", "Lk/z;", "threads", "Lh/h;", "cameraBackends", "Lh/m;", "e", "(Landroid/content/Context;Lk/z;Lh/h;)Lh/m;", "Landroid/content/pm/PackageManager;", "m", "(Landroid/content/Context;)Landroid/content/pm/PackageManager;", "Lnq/a;", "Lh/e;", "defaultCameraBackend", "Lm/g;", "cameraPipeLifetime", "c", "(Lh/z$e;Lnq/a;Landroid/content/Context;Lk/z;Lm/g;)Lh/h;", "Ln/j;", "imageReaderImageSources", "cameraPipeConfig", "Ln/n;", "b", "(Ln/j;Lh/z$e;)Ln/n;", "Lh/e0;", "j", "()Lh/e0;", "Lh/z$f;", "flags", "Lh/r1;", "n", "(Lh/z$f;)Lh/r1;", "Ll0/e;", "f", "(Landroid/content/Context;)Ll0/e;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: j.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"j/v$a$a", "Lh/m;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lk/z;", "b", "Lk/z;", "getThreads", "()Lk/z;", "threads", "Lh/h;", "c", "Lh/h;", "getCameraBackends", "()Lh/h;", "cameraBackends", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2307a implements h.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Context appContext;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final k.z threads;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final h.h cameraBackends;

            C2307a(Context context, k.z zVar, h.h hVar) {
                this.appContext = context;
                this.threads = zVar;
                this.cameraBackends = hVar;
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.e d(h.e eVar, h.m mVar) {
            return eVar;
        }

        public final n.n b(n.j imageReaderImageSources, h.z.Config cameraPipeConfig) {
            return cameraPipeConfig.getImageSources() != null ? cameraPipeConfig.getImageSources() : imageReaderImageSources;
        }

        public final h.h c(h.z.Config config, nq.a<h.e> defaultCameraBackend, Context cameraPipeContext, k.z threads, m.g cameraPipeLifetime) {
            final h.e internalBackend = config.getCameraBackendConfig().getInternalBackend();
            if (internalBackend == null) {
                k.h hVar = k.h.f107050a;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    internalBackend = defaultCameraBackend.get();
                    Trace.endSection();
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            }
            if (config.getCameraBackendConfig().a().containsKey(h.g.a(internalBackend.f()))) {
                throw new IllegalStateException(("CameraBackendConfig#cameraBackends should not contain a backend with " + ((Object) h.g.f(internalBackend.f())) + ". Use CameraBackendConfig#internalBackend field instead.").toString());
            }
            Map mapP = pq.v0.p(config.getCameraBackendConfig().a(), oq.y.a(h.g.a(internalBackend.f()), new h.f() { // from class: j.u
                @Override // h.f
                public final h.e a(h.m mVar) {
                    return v.Companion.d(internalBackend, mVar);
                }
            }));
            String defaultBackend = config.getCameraBackendConfig().getDefaultBackend();
            if (defaultBackend == null) {
                defaultBackend = internalBackend.f();
            }
            String str = defaultBackend;
            if (mapP.containsKey(h.g.a(str))) {
                return new m.b(str, mapP, cameraPipeContext, threads, cameraPipeLifetime, null);
            }
            throw new IllegalStateException(("Failed to find " + ((Object) h.g.f(str)) + " in the list of available CameraPipe backends! Available values are " + mapP.keySet()).toString());
        }

        public final h.m e(Context cameraPipeContext, k.z threads, h.h cameraBackends) {
            return new C2307a(cameraPipeContext, threads, cameraBackends);
        }

        public final l0.e f(Context cameraPipeContext) {
            return new l0.e(cameraPipeContext);
        }

        public final CameraManager g(Context cameraPipeContext) {
            return (CameraManager) cameraPipeContext.getSystemService("camera");
        }

        public final h.z.c h(h.z.Config config) {
            return config.getCameraMetadataConfig();
        }

        public final d2 i() {
            return h2.b(null, 1, null);
        }

        public final h.e0 j() {
            return new h.e0();
        }

        public final Context k(h.z.Config config) {
            return config.getAppContext();
        }

        public final f3 l(Context cameraPipeContext) {
            return new i.j((DevicePolicyManager) cameraPipeContext.getSystemService("device_policy"));
        }

        public final PackageManager m(Context cameraPipeContext) {
            return cameraPipeContext.getPackageManager();
        }

        public final r1 n(h.z.Flags flags) {
            return new r1(flags.getStrictModeEnabled());
        }

        private Companion() {
        }
    }
}
