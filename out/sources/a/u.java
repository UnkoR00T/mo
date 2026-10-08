package a;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import c.a0;
import io.sentry.android.core.c2;
import java.util.LinkedHashMap;
import java.util.Map;
import o.e1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0012\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R(\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R*\u0010%\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'¨\u0006)"}, d2 = {"La/u;", "", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "map", "Lc/a0;", "outputSizesCorrector", "<init>", "(Landroid/hardware/camera2/params/StreamConfigurationMap;Lc/a0;)V", "", "", "d", "()[Ljava/lang/Integer;", "format", "Landroid/util/Size;", "f", "(I)[Landroid/util/Size;", "a", "size", "Landroid/util/Range;", "b", "(Landroid/util/Size;)[Landroid/util/Range;", "c", "()[Landroid/util/Size;", "", "e", "(ILandroid/util/Size;)J", "g", "()Landroid/hardware/camera2/params/StreamConfigurationMap;", "Lc/a0;", "", "Ljava/lang/String;", "tag", "", "Ljava/util/Map;", "cachedFormatOutputSizes", "cachedFormatHighResolutionOutputSizes", "Ljava/lang/Class;", "cachedClassOutputSizes", "La/u$a;", "La/u$a;", "impl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 outputSizesCorrector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tag = "StreamConfigurationMapCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, Size[]> cachedFormatOutputSizes = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, Size[]> cachedFormatHighResolutionOutputSizes = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<Class<?>, Size[]> cachedClassOutputSizes = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a impl;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\tJ%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"La/u$a;", "", "", "", "d", "()[Ljava/lang/Integer;", "format", "Landroid/util/Size;", "c", "(I)[Landroid/util/Size;", "g", "size", "Landroid/util/Range;", "f", "(Landroid/util/Size;)[Landroid/util/Range;", "e", "()[Landroid/util/Size;", "", "b", "(ILandroid/util/Size;)J", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "a", "()Landroid/hardware/camera2/params/StreamConfigurationMap;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        StreamConfigurationMap getStreamConfigurationMap();

        long b(int format, Size size);

        Size[] c(int format);

        Integer[] d();

        Size[] e();

        Range<Integer>[] f(Size size);

        Size[] g(int format);
    }

    public u(StreamConfigurationMap streamConfigurationMap, a0 a0Var) {
        this.outputSizesCorrector = a0Var;
        this.impl = Build.VERSION.SDK_INT >= 34 ? new v(streamConfigurationMap) : new w(streamConfigurationMap);
    }

    public final Size[] a(int format) {
        if (this.cachedFormatHighResolutionOutputSizes.containsKey(Integer.valueOf(format))) {
            Size[] sizeArr = this.cachedFormatHighResolutionOutputSizes.get(Integer.valueOf(format));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        Size[] sizeArrG = this.impl.g(format);
        if (sizeArrG != null && sizeArrG.length != 0) {
            sizeArrG = this.outputSizesCorrector.b(sizeArrG, format);
        }
        this.cachedFormatHighResolutionOutputSizes.put(Integer.valueOf(format), sizeArrG);
        if (sizeArrG != null) {
            return (Size[]) sizeArrG.clone();
        }
        return null;
    }

    public final Range<Integer>[] b(Size size) {
        return this.impl.f(size);
    }

    public final Size[] c() {
        return this.impl.e();
    }

    public final Integer[] d() {
        return this.impl.d();
    }

    public final long e(int format, Size size) {
        try {
            return this.impl.b(format, size);
        } catch (RuntimeException e15) {
            e.c cVar = e.c.f45719a;
            if (!e1.k("CXCP")) {
                return 0L;
            }
            c2.h(e.c.TRUNCATED_TAG, "Unable to get min frame duration for format = " + format + " and size = " + size, e15);
            return 0L;
        }
    }

    public final Size[] f(int format) {
        Size[] sizeArrC = null;
        if (this.cachedFormatOutputSizes.containsKey(Integer.valueOf(format))) {
            Size[] sizeArr = this.cachedFormatOutputSizes.get(Integer.valueOf(format));
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            sizeArrC = this.impl.c(format);
        } catch (Throwable th4) {
            e1.p(this.tag, "Failed to get output sizes for " + format, th4);
        }
        if (sizeArrC != null && sizeArrC.length != 0) {
            Size[] sizeArrB = this.outputSizesCorrector.b(sizeArrC, format);
            this.cachedFormatOutputSizes.put(Integer.valueOf(format), sizeArrB);
            return (Size[]) sizeArrB.clone();
        }
        e1.o(this.tag, "Retrieved output sizes array is null or empty for format " + format);
        return sizeArrC;
    }

    public final StreamConfigurationMap g() {
        return this.impl.getStreamConfigurationMap();
    }
}
