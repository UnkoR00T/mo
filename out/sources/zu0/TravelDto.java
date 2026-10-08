package zu0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.r, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzu0/r;", "", "", "Lzu0/x;", "travelStages", "Lzu0/a0;", "fellowTravelers", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("travelStages")
    private final List<TravelStageDto> travelStages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fellowTravelers")
    private final List<TravellerDto> fellowTravelers;

    public TravelDto(List<TravelStageDto> list, List<TravellerDto> list2) {
        this.travelStages = list;
        this.fellowTravelers = list2;
    }

    public final List<TravellerDto> a() {
        return this.fellowTravelers;
    }

    public final List<TravelStageDto> b() {
        return this.travelStages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelDto)) {
            return false;
        }
        TravelDto travelDto = (TravelDto) other;
        return fr.t.c(this.travelStages, travelDto.travelStages) && fr.t.c(this.fellowTravelers, travelDto.fellowTravelers);
    }

    public int hashCode() {
        int iHashCode = this.travelStages.hashCode() * 31;
        List<TravellerDto> list = this.fellowTravelers;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TravelDto(travelStages=" + this.travelStages + ", fellowTravelers=" + this.fellowTravelers + ')';
    }
}
