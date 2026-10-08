package c;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0004\"$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "Landroid/util/Size;", "a", "([Landroid/util/Size;)[Landroid/util/Size;", "Landroid/util/Size;", "MINI_PREVIEW_SIZE_HUAWEI_MATE_9", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "b", "Ljava/util/Comparator;", "SIZE_COMPARATOR", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Size f22223a = new Size(320, 240);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<Size> f22224b = new y.d();

    public static final Size[] a(Size[] sizeArr) {
        if (((RepeatingStreamConstraintForVideoRecordingQuirk) b.g.f15546a.c(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f22224b.compare(size, f22223a) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
