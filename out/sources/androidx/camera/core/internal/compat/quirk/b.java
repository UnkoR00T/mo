package androidx.camera.core.internal.compat.quirk;

import java.util.ArrayList;
import java.util.List;
import v.c3;
import v.d3;

/* JADX INFO: loaded from: classes.dex */
public class b {
    static List<c3> a(d3 d3Var) {
        ArrayList arrayList = new ArrayList();
        if (d3Var.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.f())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (d3Var.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.c())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (d3Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.d())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (d3Var.a(LowMemoryQuirk.class, LowMemoryQuirk.c())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (d3Var.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.f())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (d3Var.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.g())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        if (d3Var.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ImageCaptureFailedForSpecificCombinationQuirk.f())) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (d3Var.a(PreviewGreenTintQuirk.class, PreviewGreenTintQuirk.d())) {
            arrayList.add(PreviewGreenTintQuirk.f9271b);
        }
        return arrayList;
    }
}
