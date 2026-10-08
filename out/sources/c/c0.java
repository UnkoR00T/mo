package c;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import v.SurfaceConfig;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, d2 = {"Lc/c0;", "", "<init>", "()V", "Lv/q3$d;", "configType", "", "Landroid/util/Size;", "supportedResolutions", "a", "(Lv/q3$d;Ljava/util/List;)Ljava/util/List;", "Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "extraCroppingQuirk", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ExtraCroppingQuirk extraCroppingQuirk = (ExtraCroppingQuirk) b.g.f15546a.c(ExtraCroppingQuirk.class);

    public final List<Size> a(SurfaceConfig.d configType, List<Size> supportedResolutions) {
        Size sizeD;
        ExtraCroppingQuirk extraCroppingQuirk = this.extraCroppingQuirk;
        if (extraCroppingQuirk == null || (sizeD = extraCroppingQuirk.d(configType)) == null) {
            return supportedResolutions;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeD);
        for (Size size : supportedResolutions) {
            if (!fr.t.c(size, sizeD)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
