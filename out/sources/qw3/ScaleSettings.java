package qw3;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qw3.h, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lqw3/h;", "", "", "minScale", "maxScale", "<init>", "(FF)V", "a", "()F", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getMinScale", "c", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScaleSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float minScale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float maxScale;

    public ScaleSettings(float f15, float f16) {
        this.minScale = f15;
        this.maxScale = f16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getMinScale() {
        return this.minScale;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getMaxScale() {
        return this.maxScale;
    }

    public final float c() {
        return this.maxScale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleSettings)) {
            return false;
        }
        ScaleSettings scaleSettings = (ScaleSettings) other;
        return Float.compare(this.minScale, scaleSettings.minScale) == 0 && Float.compare(this.maxScale, scaleSettings.maxScale) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.minScale) * 31) + Float.hashCode(this.maxScale);
    }

    public String toString() {
        return "ScaleSettings(minScale=" + this.minScale + ", maxScale=" + this.maxScale + ')';
    }

    public /* synthetic */ ScaleSettings(float f15, float f16, int i15, k kVar) {
        this((i15 & 1) != 0 ? 1.0f : f15, (i15 & 2) != 0 ? 1.0f : f16);
    }
}
