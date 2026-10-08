package a;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import o.e1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0010\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"La/w;", "La/u$a;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "streamConfigurationMap", "<init>", "(Landroid/hardware/camera2/params/StreamConfigurationMap;)V", "", "", "d", "()[Ljava/lang/Integer;", "format", "Landroid/util/Size;", "c", "(I)[Landroid/util/Size;", "g", "size", "Landroid/util/Range;", "f", "(Landroid/util/Size;)[Landroid/util/Range;", "e", "()[Landroid/util/Size;", "", "b", "(ILandroid/util/Size;)J", "a", "()Landroid/hardware/camera2/params/StreamConfigurationMap;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "getStreamConfigurationMap", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class w implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StreamConfigurationMap streamConfigurationMap;

    public w(StreamConfigurationMap streamConfigurationMap) {
        this.streamConfigurationMap = streamConfigurationMap;
    }

    @Override // a.u.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public StreamConfigurationMap getStreamConfigurationMap() {
        return this.streamConfigurationMap;
    }

    @Override // a.u.a
    public long b(int format, Size size) {
        StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(format, size);
        }
        return 0L;
    }

    @Override // a.u.a
    public Size[] c(int format) {
        StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(format);
        }
        return null;
    }

    @Override // a.u.a
    public Integer[] d() {
        int[] outputFormats;
        try {
            StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
            outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
        } catch (IllegalArgumentException e15) {
            e1.p("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e15);
        } catch (NullPointerException e16) {
            e1.p("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e16);
        }
        if (outputFormats != null) {
            return pq.n.W(outputFormats);
        }
        return null;
    }

    @Override // a.u.a
    public Size[] e() {
        StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighSpeedVideoSizes();
        }
        return null;
    }

    @Override // a.u.a
    public Range<Integer>[] f(Size size) {
        StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
        }
        return null;
    }

    @Override // a.u.a
    public Size[] g(int format) {
        StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMap;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getHighResolutionOutputSizes(format);
        }
        return null;
    }
}
