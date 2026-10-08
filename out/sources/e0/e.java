package e0;

import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import java.util.Collection;
import o.j2;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageCaptureFailedForSpecificCombinationQuirk f46489a = (ImageCaptureFailedForSpecificCombinationQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PreviewGreenTintQuirk f46490b = (PreviewGreenTintQuirk) androidx.camera.core.internal.compat.quirk.a.b(PreviewGreenTintQuirk.class);

    public boolean a(String str, Collection<j2> collection) {
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.f46489a;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.g(str, collection);
        }
        if (this.f46490b != null) {
            return PreviewGreenTintQuirk.e(str, collection);
        }
        return false;
    }
}
