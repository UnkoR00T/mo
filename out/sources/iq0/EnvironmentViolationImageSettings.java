package iq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Liq0/s;", "", "", "longestSide", "quality", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "getQuality", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EnvironmentViolationImageSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int longestSide;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quality;

    public EnvironmentViolationImageSettings(int i15, int i16) {
        this.longestSide = i15;
        this.quality = i16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLongestSide() {
        return this.longestSide;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvironmentViolationImageSettings)) {
            return false;
        }
        EnvironmentViolationImageSettings environmentViolationImageSettings = (EnvironmentViolationImageSettings) other;
        return this.longestSide == environmentViolationImageSettings.longestSide && this.quality == environmentViolationImageSettings.quality;
    }

    public int hashCode() {
        return (Integer.hashCode(this.longestSide) * 31) + Integer.hashCode(this.quality);
    }

    public String toString() {
        return "EnvironmentViolationImageSettings(longestSide=" + this.longestSide + ", quality=" + this.quality + ")";
    }
}
