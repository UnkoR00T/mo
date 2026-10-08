package i;

import android.media.ImageWriter;
import android.view.Surface;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li/x;", "", "<init>", "()V", "Landroid/view/Surface;", "surface", "", "maxImages", "format", "Landroid/media/ImageWriter;", "a", "(Landroid/view/Surface;II)Landroid/media/ImageWriter;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f87553a = new x();

    private x() {
    }

    public static final ImageWriter a(Surface surface, int maxImages, int format) {
        return ImageWriter.newInstance(surface, maxImages, format);
    }
}
