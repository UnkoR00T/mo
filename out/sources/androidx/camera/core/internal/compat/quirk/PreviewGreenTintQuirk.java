package androidx.camera.core.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import fr.t;
import fu.r;
import java.util.Collection;
import java.util.Iterator;
import o.j2;
import o.m1;
import p071kotlin.Metadata;
import v.c3;
import v.w3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "Lv/c3;", "<init>", "()V", "", "d", "()Z", "", "cameraId", "", "Lo/j2;", "appUseCases", "e", "(Ljava/lang/String;Ljava/util/Collection;)Z", "f", "c", "isMotoE20", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewGreenTintQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PreviewGreenTintQuirk f9271b = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    private final boolean c() {
        return r.G("motorola", Build.BRAND, true) && r.G("moto e20", Build.MODEL, true);
    }

    public static final boolean d() {
        return f9271b.c();
    }

    public static final boolean e(String cameraId, Collection<? extends j2> appUseCases) {
        PreviewGreenTintQuirk previewGreenTintQuirk = f9271b;
        if (previewGreenTintQuirk.c()) {
            return previewGreenTintQuirk.f(cameraId, appUseCases);
        }
        return false;
    }

    private final boolean f(String cameraId, Collection<? extends j2> appUseCases) {
        boolean z15;
        boolean z16;
        if (t.c(cameraId, d.f37012h1) && appUseCases.size() == 2) {
            Collection<? extends j2> collection = appUseCases;
            boolean z17 = collection instanceof Collection;
            if (!z17 || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z15 = false;
                        break;
                    }
                    if (((j2) it.next()) instanceof m1) {
                        z15 = true;
                        break;
                    }
                }
            } else {
                z15 = false;
                break;
            }
            if (!z17 || !collection.isEmpty()) {
                Iterator<T> it4 = collection.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z16 = false;
                        break;
                    }
                    j2 j2Var = (j2) it4.next();
                    if (j2Var.l().h(w3.L) && j2Var.l().W() == x3.b.VIDEO_CAPTURE) {
                        z16 = true;
                        break;
                    }
                }
            } else {
                z16 = false;
                break;
            }
            if (z15 && z16) {
                return true;
            }
        }
        return false;
    }
}
