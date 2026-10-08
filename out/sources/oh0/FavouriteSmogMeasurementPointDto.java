package oh0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Loh0/e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "active", "Loh0/g;", "b", "Loh0/g;", "()Loh0/g;", "airQuality", "Loh0/a;", "c", "Loh0/a;", "()Loh0/a;", "location", "Ljava/time/OffsetDateTime;", "d", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "timestamp", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FavouriteSmogMeasurementPointDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("active")
    private final boolean active;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("airQuality")
    private final PartialAirQualityDataDto airQuality;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("location")
    private final AirQualityLocationDto location;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("timestamp")
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PartialAirQualityDataDto getAirQuality() {
        return this.airQuality;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AirQualityLocationDto getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavouriteSmogMeasurementPointDto)) {
            return false;
        }
        FavouriteSmogMeasurementPointDto favouriteSmogMeasurementPointDto = (FavouriteSmogMeasurementPointDto) other;
        return this.active == favouriteSmogMeasurementPointDto.active && t.c(this.airQuality, favouriteSmogMeasurementPointDto.airQuality) && t.c(this.location, favouriteSmogMeasurementPointDto.location) && t.c(this.timestamp, favouriteSmogMeasurementPointDto.timestamp);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.active) * 31) + this.airQuality.hashCode()) * 31) + this.location.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.timestamp;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "FavouriteSmogMeasurementPointDto(active=" + this.active + ", airQuality=" + this.airQuality + ", location=" + this.location + ", timestamp=" + this.timestamp + ')';
    }
}
