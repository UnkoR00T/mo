package h;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.Trace;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \f2\u00020\u0001:\u0007\t\u0018\u000f\u0019\u0013\f\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lh/z;", "", "Lh/s$b;", "config", "Lh/s;", "d", "(Lh/s$b;)Lh/s;", "Lh/s$a;", "", "e", "(Lh/s$a;)Ljava/util/List;", "Lh/p;", "a", "()Lh/p;", "Lh/e0;", "b", "()Lh/e0;", "graphConfig", "Lh/k0;", "c", "(Lh/s$b;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "shutdown", "()V", "f", "g", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f79109a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh/z$a;", "", "Lh/e;", "internalBackend", "Lh/g;", "defaultBackend", "", "Lh/f;", "cameraBackends", "<init>", "(Lh/e;Ljava/lang/String;Ljava/util/Map;Lfr/k;)V", "a", "Lh/e;", "c", "()Lh/e;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/util/Map;", "()Ljava/util/Map;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e internalBackend;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String defaultBackend;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<g, f> cameraBackends;

        public /* synthetic */ a(e eVar, String str, Map map, fr.k kVar) {
            this(eVar, str, map);
        }

        public final Map<g, f> a() {
            return this.cameraBackends;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDefaultBackend() {
            return this.defaultBackend;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getInternalBackend() {
            return this.internalBackend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a(e eVar, String str, Map<g, ? extends f> map) {
            this.internalBackend = eVar;
            this.defaultBackend = str;
            this.cameraBackends = map;
            if (str != null) {
                if (map.containsKey(str != null ? g.a(str) : null)) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append((Object) (str == null ? "null" : g.f(str)));
                sb5.append(" does not exist in cameraBackends! Available backends are: ");
                sb5.append(map.keySet());
                throw new IllegalStateException(sb5.toString().toString());
            }
        }

        public /* synthetic */ a(e eVar, String str, Map map, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : eVar, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? pq.v0.i() : map, null);
        }
    }

    /* JADX INFO: renamed from: h.z$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lh/z$b;", "", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "cameraDeviceStateCallback", "Lh/w$b;", "cameraCaptureSessionListener", "Lk/i;", "cameraOpenRetryMaxTimeoutNs", "<init>", "(Landroid/hardware/camera2/CameraDevice$StateCallback;Lh/w$b;Lk/i;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "b", "()Landroid/hardware/camera2/CameraDevice$StateCallback;", "Lh/w$b;", "()Lh/w$b;", "c", "Lk/i;", "()Lk/i;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CameraInteropConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CameraDevice.StateCallback cameraDeviceStateCallback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w.b cameraCaptureSessionListener;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final k.i cameraOpenRetryMaxTimeoutNs;

        public /* synthetic */ CameraInteropConfig(CameraDevice.StateCallback stateCallback, w.b bVar, k.i iVar, fr.k kVar) {
            this(stateCallback, bVar, iVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w.b getCameraCaptureSessionListener() {
            return this.cameraCaptureSessionListener;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CameraDevice.StateCallback getCameraDeviceStateCallback() {
            return this.cameraDeviceStateCallback;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final k.i getCameraOpenRetryMaxTimeoutNs() {
            return this.cameraOpenRetryMaxTimeoutNs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraInteropConfig)) {
                return false;
            }
            CameraInteropConfig cameraInteropConfig = (CameraInteropConfig) other;
            return fr.t.c(this.cameraDeviceStateCallback, cameraInteropConfig.cameraDeviceStateCallback) && fr.t.c(this.cameraCaptureSessionListener, cameraInteropConfig.cameraCaptureSessionListener) && fr.t.c(this.cameraOpenRetryMaxTimeoutNs, cameraInteropConfig.cameraOpenRetryMaxTimeoutNs);
        }

        public int hashCode() {
            CameraDevice.StateCallback stateCallback = this.cameraDeviceStateCallback;
            int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
            w.b bVar = this.cameraCaptureSessionListener;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            k.i iVar = this.cameraOpenRetryMaxTimeoutNs;
            return iHashCode2 + (iVar != null ? k.i.e(iVar.getValue()) : 0);
        }

        public String toString() {
            return "CameraInteropConfig(cameraDeviceStateCallback=" + this.cameraDeviceStateCallback + ", cameraCaptureSessionListener=" + this.cameraCaptureSessionListener + ", cameraOpenRetryMaxTimeoutNs=" + this.cameraOpenRetryMaxTimeoutNs + ')';
        }

        private CameraInteropConfig(CameraDevice.StateCallback stateCallback, w.b bVar, k.i iVar) {
            this.cameraDeviceStateCallback = stateCallback;
            this.cameraCaptureSessionListener = bVar;
            this.cameraOpenRetryMaxTimeoutNs = iVar;
        }

        public /* synthetic */ CameraInteropConfig(CameraDevice.StateCallback stateCallback, w.b bVar, k.i iVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : stateCallback, (i15 & 2) != 0 ? null : bVar, (i15 & 4) != 0 ? null : iVar, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B;\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00020\u0005¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh/z$c;", "", "", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "cacheBlocklist", "", "Lh/v;", "cameraCacheBlocklist", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<CameraCharacteristics.Key<?>> cacheBlocklist;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<v, Set<CameraCharacteristics.Key<?>>> cameraCacheBlocklist;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final Set<CameraCharacteristics.Key<?>> a() {
            return this.cacheBlocklist;
        }

        public final Map<v, Set<CameraCharacteristics.Key<?>>> b() {
            return this.cameraCacheBlocklist;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends CameraCharacteristics.Key<?>> set, Map<v, ? extends Set<? extends CameraCharacteristics.Key<?>>> map) {
            this.cacheBlocklist = set;
            this.cameraCacheBlocklist = map;
        }

        public /* synthetic */ c(Set set, Map map, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? pq.e1.e() : set, (i15 & 2) != 0 ? pq.v0.i() : map);
        }
    }

    /* JADX INFO: renamed from: h.z$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh/z$d;", "", "<init>", "()V", "Lh/z$e;", "config", "Lh/z;", "a", "(Lh/z$e;)Lh/z;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f79109a = new Companion();

        private Companion() {
        }

        public final z a(Config config) {
            k.h hVar = k.h.f107050a;
            try {
                Trace.beginSection("CameraPipe");
                return new a0(j.i0.a().b(new j.q(config)).c(new j.z0(config.getThreadConfig())).a());
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: h.z$f, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh/z$f;", "", "", "strictModeEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Flags {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean strictModeEnabled;

        public Flags() {
            this(false, 1, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getStrictModeEnabled() {
            return this.strictModeEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Flags) && this.strictModeEnabled == ((Flags) other).strictModeEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.strictModeEnabled);
        }

        public String toString() {
            return "Flags(strictModeEnabled=" + this.strictModeEnabled + ')';
        }

        public Flags(boolean z15) {
            this.strictModeEnabled = z15;
        }

        public /* synthetic */ Flags(boolean z15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15);
        }
    }

    p a();

    e0 b();

    Object c(s.b bVar, tq.e<? super k0> eVar);

    s d(s.b config);

    List<s> e(s.a config);

    void shutdown();

    /* JADX INFO: renamed from: h.z$e, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b!\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b+\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b1\u00105¨\u00066"}, d2 = {"Lh/z$e;", "", "Landroid/content/Context;", "appContext", "Lh/z$g;", "threadConfig", "Lh/z$c;", "cameraMetadataConfig", "Lh/z$a;", "cameraBackendConfig", "Lh/z$b;", "cameraInteropConfig", "Ln/n;", "imageSources", "Lh/z$f;", "flags", "Lh/f1;", "platformApiCompat", "<init>", "(Landroid/content/Context;Lh/z$g;Lh/z$c;Lh/z$a;Lh/z$b;Ln/n;Lh/z$f;Lh/f1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Lh/z$g;", "h", "()Lh/z$g;", "c", "Lh/z$c;", "d", "()Lh/z$c;", "Lh/z$a;", "()Lh/z$a;", "e", "Lh/z$b;", "()Lh/z$b;", "f", "Ln/n;", "()Ln/n;", "g", "Lh/z$f;", "()Lh/z$f;", "Lh/f1;", "()Lh/f1;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Context appContext;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ThreadConfig threadConfig;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c cameraMetadataConfig;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a cameraBackendConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CameraInteropConfig cameraInteropConfig;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n.n imageSources;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Flags flags;

        public Config(Context context, ThreadConfig threadConfig, c cVar, a aVar, CameraInteropConfig cameraInteropConfig, n.n nVar, Flags flags, f1 f1Var) {
            this.appContext = context;
            this.threadConfig = threadConfig;
            this.cameraMetadataConfig = cVar;
            this.cameraBackendConfig = aVar;
            this.cameraInteropConfig = cameraInteropConfig;
            this.imageSources = nVar;
            this.flags = flags;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getCameraBackendConfig() {
            return this.cameraBackendConfig;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CameraInteropConfig getCameraInteropConfig() {
            return this.cameraInteropConfig;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getCameraMetadataConfig() {
            return this.cameraMetadataConfig;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Flags getFlags() {
            return this.flags;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return fr.t.c(this.appContext, config.appContext) && fr.t.c(this.threadConfig, config.threadConfig) && fr.t.c(this.cameraMetadataConfig, config.cameraMetadataConfig) && fr.t.c(this.cameraBackendConfig, config.cameraBackendConfig) && fr.t.c(this.cameraInteropConfig, config.cameraInteropConfig) && fr.t.c(this.imageSources, config.imageSources) && fr.t.c(this.flags, config.flags) && fr.t.c(null, null);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final n.n getImageSources() {
            return this.imageSources;
        }

        public final f1 g() {
            return null;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ThreadConfig getThreadConfig() {
            return this.threadConfig;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.appContext.hashCode() * 31) + this.threadConfig.hashCode()) * 31) + this.cameraMetadataConfig.hashCode()) * 31) + this.cameraBackendConfig.hashCode()) * 31) + this.cameraInteropConfig.hashCode()) * 31;
            n.n nVar = this.imageSources;
            return (((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.flags.hashCode()) * 31;
        }

        public String toString() {
            return "Config(appContext=" + this.appContext + ", threadConfig=" + this.threadConfig + ", cameraMetadataConfig=" + this.cameraMetadataConfig + ", cameraBackendConfig=" + this.cameraBackendConfig + ", cameraInteropConfig=" + this.cameraInteropConfig + ", imageSources=" + this.imageSources + ", flags=" + this.flags + ", platformApiCompat=" + ((Object) null) + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Config(Context context, ThreadConfig threadConfig, c cVar, a aVar, CameraInteropConfig cameraInteropConfig, n.n nVar, Flags flags, f1 f1Var, int i15, fr.k kVar) {
            Flags flags2;
            threadConfig = (i15 & 2) != 0 ? new ThreadConfig(null, null, null, null, null, null, null, CertificateBody.profileType, null) : threadConfig;
            Object[] objArr = 0;
            cVar = (i15 & 4) != 0 ? new c(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : cVar;
            a aVar2 = (i15 & 8) != 0 ? new a(null, null, null, 7, null) : aVar;
            CameraInteropConfig cameraInteropConfig2 = (i15 & 16) != 0 ? new CameraInteropConfig(null, null, null, 7, null) : cameraInteropConfig;
            n.n nVar2 = (i15 & 32) != 0 ? null : nVar;
            if ((i15 & 64) != 0) {
                flags2 = new Flags(false, 1, objArr == true ? 1 : 0);
            } else {
                flags2 = flags;
            }
            this(context, threadConfig, cVar, aVar2, cameraInteropConfig2, nVar2, flags2, (i15 & 128) != 0 ? null : f1Var);
        }
    }

    /* JADX INFO: renamed from: h.z$g, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b \u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lh/z$g;", "", "Ljava/util/concurrent/Executor;", "defaultLightweightExecutor", "defaultBackgroundExecutor", "defaultBlockingExecutor", "defaultCameraExecutor", "Landroid/os/Handler;", "defaultCameraHandler", "Lkotlin/Function0;", "defaultCameraHandlerFn", "Lju/p0;", "testOnlyScope", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/os/Handler;Ler/a;Lju/p0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/concurrent/Executor;", "f", "()Ljava/util/concurrent/Executor;", "b", "c", "d", "e", "Landroid/os/Handler;", "()Landroid/os/Handler;", "Ler/a;", "()Ler/a;", "g", "Lju/p0;", "()Lju/p0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThreadConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Executor defaultLightweightExecutor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Executor defaultBackgroundExecutor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Executor defaultBlockingExecutor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Executor defaultCameraExecutor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Handler defaultCameraHandler;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<Handler> defaultCameraHandlerFn;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ju.p0 testOnlyScope;

        /* JADX WARN: Multi-variable type inference failed */
        public ThreadConfig(Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, er.a<? extends Handler> aVar, ju.p0 p0Var) {
            this.defaultLightweightExecutor = executor;
            this.defaultBackgroundExecutor = executor2;
            this.defaultBlockingExecutor = executor3;
            this.defaultCameraExecutor = executor4;
            this.defaultCameraHandler = handler;
            this.defaultCameraHandlerFn = aVar;
            this.testOnlyScope = p0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Executor getDefaultBackgroundExecutor() {
            return this.defaultBackgroundExecutor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Executor getDefaultBlockingExecutor() {
            return this.defaultBlockingExecutor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Executor getDefaultCameraExecutor() {
            return this.defaultCameraExecutor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Handler getDefaultCameraHandler() {
            return this.defaultCameraHandler;
        }

        public final er.a<Handler> e() {
            return this.defaultCameraHandlerFn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThreadConfig)) {
                return false;
            }
            ThreadConfig threadConfig = (ThreadConfig) other;
            return fr.t.c(this.defaultLightweightExecutor, threadConfig.defaultLightweightExecutor) && fr.t.c(this.defaultBackgroundExecutor, threadConfig.defaultBackgroundExecutor) && fr.t.c(this.defaultBlockingExecutor, threadConfig.defaultBlockingExecutor) && fr.t.c(this.defaultCameraExecutor, threadConfig.defaultCameraExecutor) && fr.t.c(this.defaultCameraHandler, threadConfig.defaultCameraHandler) && fr.t.c(this.defaultCameraHandlerFn, threadConfig.defaultCameraHandlerFn) && fr.t.c(this.testOnlyScope, threadConfig.testOnlyScope);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Executor getDefaultLightweightExecutor() {
            return this.defaultLightweightExecutor;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ju.p0 getTestOnlyScope() {
            return this.testOnlyScope;
        }

        public int hashCode() {
            Executor executor = this.defaultLightweightExecutor;
            int iHashCode = (executor == null ? 0 : executor.hashCode()) * 31;
            Executor executor2 = this.defaultBackgroundExecutor;
            int iHashCode2 = (iHashCode + (executor2 == null ? 0 : executor2.hashCode())) * 31;
            Executor executor3 = this.defaultBlockingExecutor;
            int iHashCode3 = (iHashCode2 + (executor3 == null ? 0 : executor3.hashCode())) * 31;
            Executor executor4 = this.defaultCameraExecutor;
            int iHashCode4 = (iHashCode3 + (executor4 == null ? 0 : executor4.hashCode())) * 31;
            Handler handler = this.defaultCameraHandler;
            int iHashCode5 = (iHashCode4 + (handler == null ? 0 : handler.hashCode())) * 31;
            er.a<Handler> aVar = this.defaultCameraHandlerFn;
            int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            ju.p0 p0Var = this.testOnlyScope;
            return iHashCode6 + (p0Var != null ? p0Var.hashCode() : 0);
        }

        public String toString() {
            return "ThreadConfig(defaultLightweightExecutor=" + this.defaultLightweightExecutor + ", defaultBackgroundExecutor=" + this.defaultBackgroundExecutor + ", defaultBlockingExecutor=" + this.defaultBlockingExecutor + ", defaultCameraExecutor=" + this.defaultCameraExecutor + ", defaultCameraHandler=" + this.defaultCameraHandler + ", defaultCameraHandlerFn=" + this.defaultCameraHandlerFn + ", testOnlyScope=" + this.testOnlyScope + ')';
        }

        public /* synthetic */ ThreadConfig(Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, er.a aVar, ju.p0 p0Var, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : executor, (i15 & 2) != 0 ? null : executor2, (i15 & 4) != 0 ? null : executor3, (i15 & 8) != 0 ? null : executor4, (i15 & 16) != 0 ? null : handler, (i15 & 32) != 0 ? null : aVar, (i15 & 64) != 0 ? null : p0Var);
        }
    }
}
