package c;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import p071kotlin.Metadata;
import v.j3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lv/j3$b;", "Landroid/util/Size;", "resolution", "Loq/i0;", "b", "(Lv/j3$b;Landroid/util/Size;)V", "Landroid/util/Rational;", "aspectRatio", "", "a", "(Landroid/util/Size;Landroid/util/Rational;)Z", "Landroid/util/Rational;", "ASPECT_RATIO_16_9", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Rational f22221a = new Rational(16, 9);

    private static final boolean a(Size size, Rational rational) {
        return fr.t.c(rational, new Rational(size.getWidth(), size.getHeight()));
    }

    public static final void b(j3.b bVar, Size size) {
        if (((PreviewPixelHDRnetQuirk) b.g.f15546a.c(PreviewPixelHDRnetQuirk.class)) == null || a(size, f22221a)) {
            return;
        }
        e.a.C1050a c1050a = new e.a.C1050a();
        c1050a.g(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c1050a.c());
    }
}
