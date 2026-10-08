package fw0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.y3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lfw0/y3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "yearOfProduction", "", "Lfw0/v3;", "Ljava/util/List;", "()Ljava/util/List;", "events", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryTimelineDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("yearOfProduction")
    private final int yearOfProduction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("events")
    private final List<VehicleHistoryEventDto> events;

    public final List<VehicleHistoryEventDto> a() {
        return this.events;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryTimelineDto)) {
            return false;
        }
        VehicleHistoryTimelineDto vehicleHistoryTimelineDto = (VehicleHistoryTimelineDto) other;
        return this.yearOfProduction == vehicleHistoryTimelineDto.yearOfProduction && fr.t.c(this.events, vehicleHistoryTimelineDto.events);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.yearOfProduction) * 31;
        List<VehicleHistoryEventDto> list = this.events;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "VehicleHistoryTimelineDto(yearOfProduction=" + this.yearOfProduction + ", events=" + this.events + ')';
    }
}
