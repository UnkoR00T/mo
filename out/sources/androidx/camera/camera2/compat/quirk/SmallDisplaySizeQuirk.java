package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Size;
import fr.k;
import java.util.Locale;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;", "Lv/c3;", "<init>", "()V", "Landroid/util/Size;", "d", "()Landroid/util/Size;", "displaySize", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class SmallDisplaySizeQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Size> f9187c = v0.l(y.a("REDMI NOTE 8", new Size(1080, 2340)), y.a("REDMI NOTE 7", new Size(1080, 2340)), y.a("SM-A207M", new Size(720, 1560)), y.a("REDMI NOTE 7S", new Size(1080, 2340)), y.a("SM-A127F", new Size(720, 1600)), y.a("SM-A536E", new Size(1080, 2400)), y.a("220233L2I", new Size(720, 1600)), y.a("V2149", new Size(720, 1600)), y.a("VIVO 1920", new Size(1080, 2340)), y.a("CPH2223", new Size(1080, 2400)), y.a("V2029", new Size(720, 1600)), y.a("CPH1901", new Size(720, 1520)), y.a("REDMI Y3", new Size(720, 1520)), y.a("SM-A045M", new Size(720, 1600)), y.a("SM-A146U", new Size(1080, 2408)), y.a("CPH1909", new Size(720, 1520)), y.a("NOKIA 4.2", new Size(720, 1520)), y.a("SM-G960U1", new Size(1440, 2960)), y.a("SM-A137F", new Size(1080, 2408)), y.a("VIVO 1816", new Size(720, 1520)), y.a("INFINIX X6817", new Size(720, 1612)), y.a("SM-A037F", new Size(720, 1600)), y.a("NOKIA 2.4", new Size(720, 1600)), y.a("SM-A125M", new Size(720, 1600)), y.a("INFINIX X670", new Size(1080, 2400)));

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk$a;", "", "<init>", "()V", "", "a", "()Z", "", "", "Landroid/util/Size;", "MODEL_TO_DISPLAY_SIZE_MAP", "Ljava/util/Map;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a() {
            return SmallDisplaySizeQuirk.f9187c.containsKey(Build.MODEL.toUpperCase(Locale.ROOT));
        }

        private Companion() {
        }
    }

    public final Size d() {
        return f9187c.get(Build.MODEL.toUpperCase(Locale.ROOT));
    }
}
