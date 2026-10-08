package w0;

import android.view.ViewConfiguration;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lc5/d;", "density", "", "velocity", "b", "(Lc5/d;F)F", "a", "F", "PlatformFlingScrollFriction", "", ip.a.f96138c, "DecelerationRate", "c", "DecelMinusOne", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f208990a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f208991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f208992c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f208991b = dLog;
        f208992c = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(c5.d dVar, float f15) {
        double density = dVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f15) * 0.35f;
        float f16 = f208990a;
        return (float) (((double) f16) * density * Math.exp((f208991b / f208992c) * Math.log(dAbs / (((double) f16) * density))));
    }
}
