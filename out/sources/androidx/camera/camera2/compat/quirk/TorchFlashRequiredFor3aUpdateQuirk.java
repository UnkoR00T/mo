package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import fr.k;
import fr.t;
import h.x;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p071kotlin.Metadata;
import pq.v;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk;", "Lv/c3;", "Lh/x;", "cameraMetadata", "<init>", "(Lh/x;)V", "b", "Lh/x;", "c", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class TorchFlashRequiredFor3aUpdateQuirk implements c3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f9194d = v.t("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x cameraMetadata;

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0018\u0010\r\u001a\u00020\u0006*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/compat/quirk/TorchFlashRequiredFor3aUpdateQuirk$a;", "", "<init>", "()V", "Lh/x;", "cameraMetadata", "", "a", "(Lh/x;)Z", "b", "()Z", "c", "d", "isFrontCamera", "", "", "AFFECTED_PIXEL_MODELS", "Ljava/util/List;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final boolean a(x cameraMetadata) {
            return b() && d(cameraMetadata);
        }

        private final boolean b() {
            Iterator it = TorchFlashRequiredFor3aUpdateQuirk.f9194d.iterator();
            while (it.hasNext()) {
                if (t.c(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        private final boolean d(x xVar) {
            Integer num = (Integer) xVar.J(CameraCharacteristics.LENS_FACING);
            return num != null && num.intValue() == 0;
        }

        public final boolean c(x cameraMetadata) {
            return a(cameraMetadata);
        }

        private Companion() {
        }
    }

    public TorchFlashRequiredFor3aUpdateQuirk(x xVar) {
        this.cameraMetadata = xVar;
    }
}
