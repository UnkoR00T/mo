package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import b.e;
import fr.k;
import java.util.Locale;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import v.SurfaceConfig;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Lv/c3;", "<init>", "()V", "Lv/q3$d;", "configType", "Landroid/util/Size;", "d", "(Lv/q3$d;)Landroid/util/Size;", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraCroppingQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Range<Integer>> f9135c = v0.m(y.a("SM-T580", null), y.a("SM-J710MN", new Range(21, 26)), y.a("SM-A320FL", null), y.a("SM-G570M", null), y.a("SM-G610F", null), y.a("SM-G610M", new Range(21, 26)));

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk$a;", "", "<init>", "()V", "", "a", "()Z", "b", "isSamsungDistortion", "", "", "Landroid/util/Range;", "", "SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP", "Ljava/util/Map;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a() {
            return b();
        }

        public final boolean b() {
            if (!e.f15545a.p()) {
                return false;
            }
            Map map = ExtraCroppingQuirk.f9135c;
            String str = Build.MODEL;
            Locale locale = Locale.ROOT;
            if (!map.containsKey(str.toUpperCase(locale))) {
                return false;
            }
            Range range = (Range) ExtraCroppingQuirk.f9135c.get(str.toUpperCase(locale));
            if (range != null) {
                return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9136a;

        static {
            int[] iArr = new int[SurfaceConfig.d.values().length];
            try {
                iArr[SurfaceConfig.d.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurfaceConfig.d.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurfaceConfig.d.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9136a = iArr;
        }
    }

    public final Size d(SurfaceConfig.d configType) {
        if (!INSTANCE.b()) {
            return null;
        }
        int i15 = b.f9136a[configType.ordinal()];
        if (i15 == 1) {
            return new Size(1920, 1080);
        }
        if (i15 == 2) {
            return new Size(1280, 720);
        }
        if (i15 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
