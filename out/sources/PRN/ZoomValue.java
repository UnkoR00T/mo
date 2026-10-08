package PRN;

import o.l2;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: PRN.w0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"LPRN/w0;", "Lo/l2;", "", "zoomRatio", "minZoomRatio", "maxZoomRatio", "<init>", "(FFF)V", "c", "()F", "a", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ZoomValue implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float zoomRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float minZoomRatio;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float maxZoomRatio;

    public ZoomValue(float f15, float f16, float f17) {
        this.zoomRatio = f15;
        this.minZoomRatio = f16;
        this.maxZoomRatio = f17;
    }

    @Override // o.l2
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // o.l2
    /* JADX INFO: renamed from: b, reason: from getter */
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // o.l2
    /* JADX INFO: renamed from: c, reason: from getter */
    public float getZoomRatio() {
        return this.zoomRatio;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZoomValue)) {
            return false;
        }
        ZoomValue zoomValue = (ZoomValue) other;
        return Float.compare(this.zoomRatio, zoomValue.zoomRatio) == 0 && Float.compare(this.minZoomRatio, zoomValue.minZoomRatio) == 0 && Float.compare(this.maxZoomRatio, zoomValue.maxZoomRatio) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.zoomRatio) * 31) + Float.hashCode(this.minZoomRatio)) * 31) + Float.hashCode(this.maxZoomRatio);
    }

    public String toString() {
        return "ZoomValue(zoomRatio=" + this.zoomRatio + ", minZoomRatio=" + this.minZoomRatio + ", maxZoomRatio=" + this.maxZoomRatio + ')';
    }
}
