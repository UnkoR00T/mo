package PRN;

import android.annotation.SuppressLint;
import android.util.Range;
import android.util.Rational;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: PRN.c0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LPRN/c0;", "", "", "supported", "", "index", "Landroid/util/Range;", "range", "Landroid/util/Rational;", "step", "<init>", "(ZILandroid/util/Range;Landroid/util/Rational;)V", "newIndex", "c", "(I)LPRN/c0;", "a", "(ZILandroid/util/Range;Landroid/util/Rational;)LPRN/c0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "I", "Landroid/util/Range;", "d", "Landroid/util/Rational;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UnsafeOptInUsageError"})
public final /* data */ class EvCompValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean supported;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Range<Integer> range;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rational step;

    public EvCompValue(boolean z15, int i15, Range<Integer> range, Rational rational) {
        this.supported = z15;
        this.index = i15;
        this.range = range;
        this.step = rational;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvCompValue b(EvCompValue evCompValue, boolean z15, int i15, Range range, Rational rational, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            z15 = evCompValue.supported;
        }
        if ((i16 & 2) != 0) {
            i15 = evCompValue.index;
        }
        if ((i16 & 4) != 0) {
            range = evCompValue.range;
        }
        if ((i16 & 8) != 0) {
            rational = evCompValue.step;
        }
        return evCompValue.a(z15, i15, range, rational);
    }

    public final EvCompValue a(boolean supported, int index, Range<Integer> range, Rational step) {
        return new EvCompValue(supported, index, range, step);
    }

    public final EvCompValue c(int newIndex) {
        return b(this, false, newIndex, null, null, 13, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvCompValue)) {
            return false;
        }
        EvCompValue evCompValue = (EvCompValue) other;
        return this.supported == evCompValue.supported && this.index == evCompValue.index && fr.t.c(this.range, evCompValue.range) && fr.t.c(this.step, evCompValue.step);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.supported) * 31) + Integer.hashCode(this.index)) * 31) + this.range.hashCode()) * 31) + this.step.hashCode();
    }

    public String toString() {
        return "EvCompValue(supported=" + this.supported + ", index=" + this.index + ", range=" + this.range + ", step=" + this.step + ')';
    }
}
