package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import h.x;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import v.n3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\u0010\t\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;", "Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;", "Lh/x;", "cameraMetadata", "<init>", "(Lh/x;)V", "", "Landroid/util/Range;", "", "availableFpsRanges", "f", "([Landroid/util/Range;)Landroid/util/Range;", "fpsRange", "d", "(Landroid/util/Range;)Landroid/util/Range;", "a", "()Landroid/util/Range;", "b", "Loq/k;", "e", "range", "c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k range;

    /* JADX INFO: renamed from: androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk$a;", "", "<init>", "()V", "Lh/x;", "cameraMetadata", "", "a", "(Lh/x;)Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final boolean a(x cameraMetadata) {
            return x.INSTANCE.l(cameraMetadata);
        }

        private Companion() {
        }
    }

    public AeFpsRangeLegacyQuirk(final x xVar) {
        this.range = l.a(new er.a() { // from class: b.a
            @Override // er.a
            public final Object a() {
                return AeFpsRangeLegacyQuirk.g(xVar, this);
            }
        });
    }

    private final Range<Integer> d(Range<Integer> fpsRange) {
        Integer numValueOf = (Integer) fpsRange.getUpper();
        Integer numValueOf2 = (Integer) fpsRange.getLower();
        if (((Number) fpsRange.getUpper()).intValue() >= 1000) {
            numValueOf = Integer.valueOf(((Number) fpsRange.getUpper()).intValue() / 1000);
        }
        if (((Number) fpsRange.getLower()).intValue() >= 1000) {
            numValueOf2 = Integer.valueOf(((Number) fpsRange.getLower()).intValue() / 1000);
        }
        return new Range<>(numValueOf2, numValueOf);
    }

    private final Range<Integer> e() {
        return (Range) this.range.getValue();
    }

    private final Range<Integer> f(Range<Integer>[] availableFpsRanges) {
        Range<Integer> range = null;
        if (availableFpsRanges != null && availableFpsRanges.length != 0) {
            for (Range<Integer> range2 : availableFpsRanges) {
                Range<Integer> rangeD = d(range2);
                Integer num = (Integer) rangeD.getUpper();
                if (num != null && num.intValue() == 30 && (range == null || ((Number) rangeD.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
                    range = rangeD;
                }
            }
        }
        return range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Range g(x xVar, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        return aeFpsRangeLegacyQuirk.f((Range[]) xVar.J(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    public Range<Integer> a() {
        Range<Integer> rangeE = e();
        return rangeE == null ? n3.f202727a : rangeE;
    }
}
