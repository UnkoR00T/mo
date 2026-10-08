package zu0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.x, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lzu0/x;", "", "Ljava/time/LocalDate;", "endDate", "Lzu0/u;", "placeDetails", "startDate", "<init>", "(Ljava/time/LocalDate;Lzu0/u;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Lzu0/u;", "()Lzu0/u;", "c", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelStageDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("endDate")
    private final LocalDate endDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("placeDetails")
    private final TravelPlaceDetailsDto placeDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("startDate")
    private final LocalDate startDate;

    public TravelStageDto(LocalDate localDate, TravelPlaceDetailsDto travelPlaceDetailsDto, LocalDate localDate2) {
        this.endDate = localDate;
        this.placeDetails = travelPlaceDetailsDto;
        this.startDate = localDate2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TravelPlaceDetailsDto getPlaceDetails() {
        return this.placeDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelStageDto)) {
            return false;
        }
        TravelStageDto travelStageDto = (TravelStageDto) other;
        return fr.t.c(this.endDate, travelStageDto.endDate) && fr.t.c(this.placeDetails, travelStageDto.placeDetails) && fr.t.c(this.startDate, travelStageDto.startDate);
    }

    public int hashCode() {
        return (((this.endDate.hashCode() * 31) + this.placeDetails.hashCode()) * 31) + this.startDate.hashCode();
    }

    public String toString() {
        return "TravelStageDto(endDate=" + this.endDate + ", placeDetails=" + this.placeDetails + ", startDate=" + this.startDate + ')';
    }
}
