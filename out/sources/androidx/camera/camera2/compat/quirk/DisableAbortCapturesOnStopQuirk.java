package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import b.e;
import fr.k;
import fu.r;
import p071kotlin.Metadata;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk;", "Lv/c3;", "<init>", "()V", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class DisableAbortCapturesOnStopQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f9130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f9131d;

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/DisableAbortCapturesOnStopQuirk$a;", "", "<init>", "()V", "", "a", "()Z", "isSamsungNote10PlusDevice", "Z", "isPocoX3ProDevice", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a() {
            return e.f15545a.r() || DisableAbortCapturesOnStopQuirk.f9130c || DisableAbortCapturesOnStopQuirk.f9131d;
        }

        private Companion() {
        }
    }

    static {
        e eVar = e.f15545a;
        boolean z15 = false;
        f9130c = eVar.p() && r.G("d2q", Build.DEVICE, true);
        if (eVar.l() && r.G("M2102J20SG", Build.MODEL, true)) {
            z15 = true;
        }
        f9131d = z15;
    }
}
