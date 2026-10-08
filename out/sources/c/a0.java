package c;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.List;
import o.e1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lc/a0;", "", "Lh/x;", "cameraMetadata", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "streamConfigurationMap", "<init>", "(Lh/x;Landroid/hardware/camera2/params/StreamConfigurationMap;)V", "", "Landroid/util/Size;", "sizeList", "", "format", "Loq/i0;", "a", "(Ljava/util/List;I)V", "c", "", "sizes", "b", "([Landroid/util/Size;I)[Landroid/util/Size;", "Lh/x;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "", "Ljava/lang/String;", "tag", "Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;", "d", "Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;", "excludedSupportedSizesQuirk", "Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;", "e", "Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;", "extraSupportedOutputSizeQuirk", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StreamConfigurationMap streamConfigurationMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String tag = "OutputSizesCorrector";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk;

    public a0(h.x xVar, StreamConfigurationMap streamConfigurationMap) {
        this.cameraMetadata = xVar;
        this.streamConfigurationMap = streamConfigurationMap;
        b.g gVar = b.g.f15546a;
        this.excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) gVar.c(ExcludedSupportedSizesQuirk.class);
        this.extraSupportedOutputSizeQuirk = (ExtraSupportedOutputSizeQuirk) gVar.c(ExtraSupportedOutputSizeQuirk.class);
    }

    private final void a(List<Size> sizeList, int format) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.extraSupportedOutputSizeQuirk;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrC = extraSupportedOutputSizeQuirk.c(format);
        if (sizeArrC.length == 0) {
            return;
        }
        pq.v.E(sizeList, sizeArrC);
    }

    private final void c(List<Size> sizeList, int format) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk;
        h.x xVar = this.cameraMetadata;
        if (xVar == null || (excludedSupportedSizesQuirk = this.excludedSupportedSizesQuirk) == null) {
            return;
        }
        List<Size> listC = excludedSupportedSizesQuirk.c(xVar.h(), format);
        if (listC.isEmpty()) {
            return;
        }
        sizeList.removeAll(listC);
    }

    public final Size[] b(Size[] sizes, int format) {
        List<Size> listW1 = pq.n.w1(sizes);
        a(listW1, format);
        c(listW1, format);
        if (listW1.isEmpty()) {
            e1.o(this.tag, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) listW1.toArray(new Size[0]);
    }
}
