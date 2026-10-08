package lt3;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lt3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Llt3/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Llt3/e;", "a", "Ljava/util/List;", "()Ljava/util/List;", "features", "b", "Z", "()Z", "school", "Ljava/time/OffsetDateTime;", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "serverCurrentTime", "juniorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorSettingsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("features")
    private final List<FeatureStatusDto> features;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("school")
    private final boolean school;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("serverCurrentTime")
    private final OffsetDateTime serverCurrentTime;

    public final List<FeatureStatusDto> a() {
        return this.features;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSchool() {
        return this.school;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getServerCurrentTime() {
        return this.serverCurrentTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JuniorSettingsDto)) {
            return false;
        }
        JuniorSettingsDto juniorSettingsDto = (JuniorSettingsDto) other;
        return t.c(this.features, juniorSettingsDto.features) && this.school == juniorSettingsDto.school && t.c(this.serverCurrentTime, juniorSettingsDto.serverCurrentTime);
    }

    public int hashCode() {
        return (((this.features.hashCode() * 31) + Boolean.hashCode(this.school)) * 31) + this.serverCurrentTime.hashCode();
    }

    public String toString() {
        return "JuniorSettingsDto(features=" + this.features + ", school=" + this.school + ", serverCurrentTime=" + this.serverCurrentTime + ')';
    }
}
