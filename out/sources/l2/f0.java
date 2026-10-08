package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b¨\u0006#"}, d2 = {"Ll2/f0;", "", "<init>", "()V", "Lc5/h;", "b", "F", "getActiveThickness-D9Ej5fM", "()F", "ActiveThickness", "c", "getActiveWaveAmplitude-D9Ej5fM", "ActiveWaveAmplitude", "d", "getActiveWaveWavelength-D9Ej5fM", "ActiveWaveWavelength", "e", "a", "Height", "f", "getIndeterminateActiveWaveWavelength-D9Ej5fM", "IndeterminateActiveWaveWavelength", "g", "StopSize", "h", "getStopTrailingSpace-D9Ej5fM", "StopTrailingSpace", "i", "TrackActiveSpace", "j", "getTrackThickness-D9Ej5fM", "TrackThickness", "k", "getWaveHeight-D9Ej5fM", "WaveHeight", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveThickness;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float StopSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float TrackActiveSpace;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float TrackThickness;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f114495a = new f0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveWaveAmplitude = c5.h.n((float) 3.0d);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveWaveWavelength = c5.h.n((float) 40.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float IndeterminateActiveWaveWavelength = c5.h.n((float) 20.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float StopTrailingSpace = c5.h.n((float) 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float WaveHeight = c5.h.n((float) 10.0d);

    static {
        float f15 = (float) 4.0d;
        ActiveThickness = c5.h.n(f15);
        Height = c5.h.n(f15);
        StopSize = c5.h.n(f15);
        TrackActiveSpace = c5.h.n(f15);
        TrackThickness = c5.h.n(f15);
    }

    private f0() {
    }

    public final float a() {
        return Height;
    }

    public final float b() {
        return StopSize;
    }

    public final float c() {
        return TrackActiveSpace;
    }
}
