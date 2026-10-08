package oh0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Loh0/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loh0/f;", "a", "Loh0/f;", "()Loh0/f;", "airQuality", "b", "Z", "()Z", "expired", "c", "favourite", "Loh0/a;", "d", "Loh0/a;", "()Loh0/a;", "location", "Ljava/time/OffsetDateTime;", "e", "Ljava/time/OffsetDateTime;", "getTimestamp", "()Ljava/time/OffsetDateTime;", "timestamp", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SmogMeasurementPointDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("airQuality")
    private final FullAirQualityDataDto airQuality;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expired")
    private final boolean expired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("favourite")
    private final boolean favourite;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("location")
    private final AirQualityLocationDto location;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("timestamp")
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FullAirQualityDataDto getAirQuality() {
        return this.airQuality;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getExpired() {
        return this.expired;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFavourite() {
        return this.favourite;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AirQualityLocationDto getLocation() {
        return this.location;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmogMeasurementPointDetailsDto)) {
            return false;
        }
        SmogMeasurementPointDetailsDto smogMeasurementPointDetailsDto = (SmogMeasurementPointDetailsDto) other;
        return t.c(this.airQuality, smogMeasurementPointDetailsDto.airQuality) && this.expired == smogMeasurementPointDetailsDto.expired && this.favourite == smogMeasurementPointDetailsDto.favourite && t.c(this.location, smogMeasurementPointDetailsDto.location) && t.c(this.timestamp, smogMeasurementPointDetailsDto.timestamp);
    }

    public int hashCode() {
        return (((((((this.airQuality.hashCode() * 31) + Boolean.hashCode(this.expired)) * 31) + Boolean.hashCode(this.favourite)) * 31) + this.location.hashCode()) * 31) + this.timestamp.hashCode();
    }

    public String toString() {
        return "SmogMeasurementPointDetailsDto(airQuality=" + this.airQuality + ", expired=" + this.expired + ", favourite=" + this.favourite + ", location=" + this.location + ", timestamp=" + this.timestamp + ')';
    }
}
