package mq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lmq0/p;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "longestSide", "b", "quality", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EnvironmentViolationImageSettingsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("longestSide")
    private final int longestSide;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("quality")
    private final int quality;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLongestSide() {
        return this.longestSide;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvironmentViolationImageSettingsDto)) {
            return false;
        }
        EnvironmentViolationImageSettingsDto environmentViolationImageSettingsDto = (EnvironmentViolationImageSettingsDto) other;
        return this.longestSide == environmentViolationImageSettingsDto.longestSide && this.quality == environmentViolationImageSettingsDto.quality;
    }

    public int hashCode() {
        return (Integer.hashCode(this.longestSide) * 31) + Integer.hashCode(this.quality);
    }

    public String toString() {
        return "EnvironmentViolationImageSettingsDto(longestSide=" + this.longestSide + ", quality=" + this.quality + ')';
    }
}
