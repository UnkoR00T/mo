package a;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"La/v;", "La/w;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "map", "<init>", "(Landroid/hardware/camera2/params/StreamConfigurationMap;)V", "", "", "d", "()[Ljava/lang/Integer;", "format", "Landroid/util/Size;", "c", "(I)[Landroid/util/Size;", "g", "size", "", "b", "(ILandroid/util/Size;)J", "", "h", "()Z", "hasJpegRQuirk", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends w {
    public v(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    private final boolean h() {
        return b.g.f15546a.c(PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // a.w, a.u.a
    public long b(int format, Size size) {
        if (format == 4101 && h()) {
            return 0L;
        }
        return super.b(format, size);
    }

    @Override // a.w, a.u.a
    public Size[] c(int format) {
        if (format == 4101 && h()) {
            return null;
        }
        return super.c(format);
    }

    @Override // a.w, a.u.a
    public Integer[] d() {
        Integer[] numArrD = super.d();
        if (!h()) {
            return numArrD;
        }
        if (numArrD == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrD) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // a.w, a.u.a
    public Size[] g(int format) {
        if (format == 4101 && h()) {
            return null;
        }
        return super.g(format);
    }
}
