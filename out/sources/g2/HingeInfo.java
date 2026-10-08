package g2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g2.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0006\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lg2/e;", "", "Lm3/g;", "bounds", "", "isFlat", "isVertical", "isSeparating", "isOccluding", "<init>", "(Lm3/g;ZZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lm3/g;", "getBounds", "()Lm3/g;", "b", "Z", "()Z", "c", "d", "e", "adaptive"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HingeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m3.g bounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFlat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSeparating;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOccluding;

    public HingeInfo(m3.g gVar, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.bounds = gVar;
        this.isFlat = z15;
        this.isVertical = z16;
        this.isSeparating = z17;
        this.isOccluding = z18;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HingeInfo)) {
            return false;
        }
        HingeInfo hingeInfo = (HingeInfo) other;
        return t.c(this.bounds, hingeInfo.bounds) && this.isFlat == hingeInfo.isFlat && this.isVertical == hingeInfo.isVertical && this.isSeparating == hingeInfo.isSeparating && this.isOccluding == hingeInfo.isOccluding;
    }

    public int hashCode() {
        return (((((((this.bounds.hashCode() * 31) + Boolean.hashCode(this.isFlat)) * 31) + Boolean.hashCode(this.isVertical)) * 31) + Boolean.hashCode(this.isSeparating)) * 31) + Boolean.hashCode(this.isOccluding);
    }

    public String toString() {
        return "HingeInfo(bounds=" + this.bounds + ", isFlat=" + this.isFlat + ", isVertical=" + this.isVertical + ", isSeparating=" + this.isSeparating + ", isOccluding=" + this.isOccluding + ')';
    }
}
