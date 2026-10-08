package i;

import android.os.Build;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Li/h2;", "", "Li/g2;", "metadataProvider", "Lh/r1;", "strictMode", "<init>", "(Li/g2;Lh/r1;)V", "Lh/s$b;", "graphConfig", "", "f", "(Lh/s$b;)Z", "Lh/v;", "cameraId", "d", "(Ljava/lang/String;)Z", "e", "c", "Lh/s$d;", "graphConfigFlags", "", "b", "(Lh/s$d;)I", "a", "Li/g2;", "Lh/r1;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Set<String>> f87164d = pq.v0.f(oq.y.a("Google", pq.e1.i("oriole", "raven", "bluejay", "panther", "cheetah", "lynx")));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Set<String>> f87165e = pq.v0.l(oq.y.a("google", pq.e1.i("pixel 4", "pixel 4 xl")), oq.y.a("samsung", pq.e1.d("sm-g770f")));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g2 metadataProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.r1 strictMode;

    /* JADX INFO: renamed from: i.h2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Li/h2$a;", "", "<init>", "()V", "", "a", "()Z", "", "", "", "SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP", "Ljava/util/Map;", "SM8150_DEVICES", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final boolean a() {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 <= 27) {
                return true;
            }
            String str = Build.HARDWARE;
            if (fr.t.c(str, "samsungexynos7870")) {
                return true;
            }
            if (!fu.r.G(str, "qcom", true) || i15 > 31) {
                Map map = h2.f87165e;
                String str2 = Build.BRAND;
                Locale locale = Locale.ROOT;
                Set set = (Set) map.get(str2.toLowerCase(locale));
                if (set == null || !set.contains(Build.MODEL.toLowerCase(locale))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87168a;

        static {
            int[] iArr = new int[h.s.f.a.values().length];
            try {
                iArr[h.s.f.a.AT_LEAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.s.f.a.EXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87168a = iArr;
        }
    }

    public h2(g2 g2Var, h.r1 r1Var) {
        this.metadataProvider = g2Var;
        this.strictMode = r1Var;
    }

    public final int b(h.s.Flags graphConfigFlags) {
        int iMax = 0;
        if (this.strictMode.getEnabled()) {
            return 0;
        }
        h.s.f awaitRepeatingRequestBeforeCapture = graphConfigFlags.getAwaitRepeatingRequestBeforeCapture();
        Set<String> set = f87164d.get(Build.MANUFACTURER);
        if (set != null && set.contains(Build.DEVICE) && Build.VERSION.SDK_INT < 34) {
            iMax = Math.max(0, 10);
        }
        int i15 = b.f87168a[awaitRepeatingRequestBeforeCapture.getCompletionBehavior().ordinal()];
        if (i15 == 1) {
            return Math.max(iMax, awaitRepeatingRequestBeforeCapture.getRepeatingFramesToComplete());
        }
        if (i15 == 2) {
            return awaitRepeatingRequestBeforeCapture.getRepeatingFramesToComplete();
        }
        throw new oq.p();
    }

    public final boolean c(String cameraId) {
        if (this.strictMode.getEnabled()) {
            return false;
        }
        return (Build.VERSION.SDK_INT <= 32 && h.x.INSTANCE.l(this.metadataProvider.a(cameraId))) || (fu.r.G("motorola", Build.BRAND, true) && fu.r.G("moto e20", Build.MODEL, true) && fr.t.c(cameraId, "1"));
    }

    public final boolean d(String cameraId) {
        return !this.strictMode.getEnabled() && Build.VERSION.SDK_INT < 29 && h.x.INSTANCE.l(this.metadataProvider.a(cameraId));
    }

    public final boolean e(String cameraId) {
        if (this.strictMode.getEnabled()) {
            return false;
        }
        return h.x.INSTANCE.l(this.metadataProvider.a(cameraId));
    }

    public final boolean f(h.s.b graphConfig) {
        if (this.strictMode.getEnabled()) {
            return false;
        }
        Boolean awaitRepeatingRequestOnDisconnect = graphConfig.getFlags().getAwaitRepeatingRequestOnDisconnect();
        return awaitRepeatingRequestOnDisconnect != null ? awaitRepeatingRequestOnDisconnect.booleanValue() : h.x.INSTANCE.l(this.metadataProvider.a(graphConfig.getCamera()));
    }
}
