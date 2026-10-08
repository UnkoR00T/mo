package fw0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.r2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010 \u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lfw0/r2;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "collisionDate", "b", "Ljava/lang/String;", "collisionDescription", "c", "latitude", "d", "localizationDescription", "e", "longitude", "Lfw0/s2;", "f", "Lfw0/s2;", "()Lfw0/s2;", "perpetrator", "g", "victim", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionDescriptionDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("collisionDate")
    private final OffsetDateTime collisionDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("collisionDescription")
    private final String collisionDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("latitude")
    private final String latitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("localizationDescription")
    private final String localizationDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("longitude")
    private final String longitude;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("perpetrator")
    private final VehicleCollisionDescriptionParticipantDto perpetrator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("victim")
    private final VehicleCollisionDescriptionParticipantDto victim;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getCollisionDate() {
        return this.collisionDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCollisionDescription() {
        return this.collisionDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocalizationDescription() {
        return this.localizationDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionDescriptionDto)) {
            return false;
        }
        VehicleCollisionDescriptionDto vehicleCollisionDescriptionDto = (VehicleCollisionDescriptionDto) other;
        return fr.t.c(this.collisionDate, vehicleCollisionDescriptionDto.collisionDate) && fr.t.c(this.collisionDescription, vehicleCollisionDescriptionDto.collisionDescription) && fr.t.c(this.latitude, vehicleCollisionDescriptionDto.latitude) && fr.t.c(this.localizationDescription, vehicleCollisionDescriptionDto.localizationDescription) && fr.t.c(this.longitude, vehicleCollisionDescriptionDto.longitude) && fr.t.c(this.perpetrator, vehicleCollisionDescriptionDto.perpetrator) && fr.t.c(this.victim, vehicleCollisionDescriptionDto.victim);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final VehicleCollisionDescriptionParticipantDto getPerpetrator() {
        return this.perpetrator;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final VehicleCollisionDescriptionParticipantDto getVictim() {
        return this.victim;
    }

    public int hashCode() {
        return (((((((((((this.collisionDate.hashCode() * 31) + this.collisionDescription.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.localizationDescription.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.perpetrator.hashCode()) * 31) + this.victim.hashCode();
    }

    public String toString() {
        return "VehicleCollisionDescriptionDto(collisionDate=" + this.collisionDate + ", collisionDescription=" + this.collisionDescription + ", latitude=" + this.latitude + ", localizationDescription=" + this.localizationDescription + ", longitude=" + this.longitude + ", perpetrator=" + this.perpetrator + ", victim=" + this.victim + ')';
    }
}
