package oh0;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\r\u0010\u0019¨\u0006\u001b"}, d2 = {"Loh0/k;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "getCurrentServerTime", "()Ljava/time/OffsetDateTime;", "currentServerTime", "b", "getNextRefreshTime", "nextRefreshTime", "", "Loh0/j;", "c", "Ljava/util/List;", "()Ljava/util/List;", "smogData", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SmogMeasurementPointContainerDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("currentServerTime")
    private final OffsetDateTime currentServerTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextRefreshTime")
    private final OffsetDateTime nextRefreshTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("smogData")
    private final List<SmogMeasurementPartialDetailsDto> smogData;

    public final List<SmogMeasurementPartialDetailsDto> a() {
        return this.smogData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmogMeasurementPointContainerDto)) {
            return false;
        }
        SmogMeasurementPointContainerDto smogMeasurementPointContainerDto = (SmogMeasurementPointContainerDto) other;
        return t.c(this.currentServerTime, smogMeasurementPointContainerDto.currentServerTime) && t.c(this.nextRefreshTime, smogMeasurementPointContainerDto.nextRefreshTime) && t.c(this.smogData, smogMeasurementPointContainerDto.smogData);
    }

    public int hashCode() {
        return (((this.currentServerTime.hashCode() * 31) + this.nextRefreshTime.hashCode()) * 31) + this.smogData.hashCode();
    }

    public String toString() {
        return "SmogMeasurementPointContainerDto(currentServerTime=" + this.currentServerTime + ", nextRefreshTime=" + this.nextRefreshTime + ", smogData=" + this.smogData + ')';
    }
}
