package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import b.e;
import fr.k;
import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import v.SurfaceConfig;
import v.c3;
import v.p3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Lv/c3;", "<init>", "()V", "", "cameraId", "", "Lv/p3;", "f", "(Ljava/lang/String;)Ljava/util/List;", "e", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraSupportedSurfaceCombinationsQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p3 f9139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p3 f9140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p3 f9141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<String> f9142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f9143g;

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk$a;", "", "<init>", "()V", "", "d", "()Z", "f", "g", "Lv/p3;", "a", "()Lv/p3;", "b", "c", "e", "isSamsungS7", "", "TAG", "Ljava/lang/String;", "FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION", "Lv/p3;", "FULL_LEVEL_YUV_YUV_YUV_CONFIGURATION", "LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION", "", "SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS", "Ljava/util/Set;", "SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final p3 a() {
            p3 p3Var = new p3();
            SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
            SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
            p3Var.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202792c, null, 4, null));
            p3Var.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.PRIV, SurfaceConfig.b.f202795f, null, 4, null));
            p3Var.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202802n, null, 4, null));
            return p3Var;
        }

        public final p3 b() {
            p3 p3Var = new p3();
            SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
            SurfaceConfig.d dVar = SurfaceConfig.d.YUV;
            p3Var.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202792c, null, 4, null));
            p3Var.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202795f, null, 4, null));
            p3Var.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202802n, null, 4, null));
            return p3Var;
        }

        public final p3 c() {
            p3 p3Var = new p3();
            SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
            SurfaceConfig.d dVar = SurfaceConfig.d.PRIV;
            p3Var.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202795f, null, 4, null));
            p3Var.a(SurfaceConfig.Companion.b(companion, dVar, SurfaceConfig.b.f202792c, null, 4, null));
            p3Var.a(SurfaceConfig.Companion.b(companion, SurfaceConfig.d.YUV, SurfaceConfig.b.f202802n, null, 4, null));
            return p3Var;
        }

        public final boolean d() {
            return e() || f() || g();
        }

        public final boolean e() {
            String str = Build.DEVICE;
            return r.G("heroqltevzw", str, true) || r.G("heroqltetmo", str, true);
        }

        public final boolean f() {
            if (!e.f15545a.d()) {
                return false;
            }
            return ExtraSupportedSurfaceCombinationsQuirk.f9142f.contains(Build.MODEL.toUpperCase(Locale.ROOT));
        }

        public final boolean g() {
            if (!e.f15545a.p()) {
                return false;
            }
            String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
            Iterator it = ExtraSupportedSurfaceCombinationsQuirk.f9143g.iterator();
            while (it.hasNext()) {
                if (r.V(upperCase, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f9139c = companion.a();
        f9140d = companion.b();
        f9141e = companion.c();
        f9142f = e1.i("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD");
        f9143g = e1.i("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F");
    }

    private final List<p3> f(String cameraId) {
        ArrayList arrayList = new ArrayList();
        if (t.c(cameraId, "1")) {
            arrayList.add(f9139c);
        }
        return arrayList;
    }

    public final List<p3> e(String cameraId) {
        Companion companion = INSTANCE;
        if (companion.e()) {
            return f(cameraId);
        }
        return (companion.f() || companion.g()) ? v.e(f9141e) : v.n();
    }
}
