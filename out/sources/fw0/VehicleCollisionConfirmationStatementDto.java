package fw0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.l2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u000fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006*"}, d2 = {"Lfw0/l2;", "", "Ljava/time/OffsetDateTime;", "collisionDate", "", "collisionDescription", "latitude", "localizationDescription", "longitude", "Lfw0/n2;", "perpetrator", "victim", "<init>", "(Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfw0/n2;Lfw0/n2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "getCollisionDate", "()Ljava/time/OffsetDateTime;", "b", "Ljava/lang/String;", "getCollisionDescription", "c", "getLatitude", "d", "getLocalizationDescription", "e", "getLongitude", "f", "Lfw0/n2;", "getPerpetrator", "()Lfw0/n2;", "g", "getVictim", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionConfirmationStatementDto {

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
    private final VehicleCollisionConfirmationStatementParticipantDataDto perpetrator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("victim")
    private final VehicleCollisionConfirmationStatementParticipantDataDto victim;

    public VehicleCollisionConfirmationStatementDto(OffsetDateTime offsetDateTime, String str, String str2, String str3, String str4, VehicleCollisionConfirmationStatementParticipantDataDto vehicleCollisionConfirmationStatementParticipantDataDto, VehicleCollisionConfirmationStatementParticipantDataDto vehicleCollisionConfirmationStatementParticipantDataDto2) {
        this.collisionDate = offsetDateTime;
        this.collisionDescription = str;
        this.latitude = str2;
        this.localizationDescription = str3;
        this.longitude = str4;
        this.perpetrator = vehicleCollisionConfirmationStatementParticipantDataDto;
        this.victim = vehicleCollisionConfirmationStatementParticipantDataDto2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionConfirmationStatementDto)) {
            return false;
        }
        VehicleCollisionConfirmationStatementDto vehicleCollisionConfirmationStatementDto = (VehicleCollisionConfirmationStatementDto) other;
        return fr.t.c(this.collisionDate, vehicleCollisionConfirmationStatementDto.collisionDate) && fr.t.c(this.collisionDescription, vehicleCollisionConfirmationStatementDto.collisionDescription) && fr.t.c(this.latitude, vehicleCollisionConfirmationStatementDto.latitude) && fr.t.c(this.localizationDescription, vehicleCollisionConfirmationStatementDto.localizationDescription) && fr.t.c(this.longitude, vehicleCollisionConfirmationStatementDto.longitude) && fr.t.c(this.perpetrator, vehicleCollisionConfirmationStatementDto.perpetrator) && fr.t.c(this.victim, vehicleCollisionConfirmationStatementDto.victim);
    }

    public int hashCode() {
        return (((((((((((this.collisionDate.hashCode() * 31) + this.collisionDescription.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.localizationDescription.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.perpetrator.hashCode()) * 31) + this.victim.hashCode();
    }

    public String toString() {
        return "VehicleCollisionConfirmationStatementDto(collisionDate=" + this.collisionDate + ", collisionDescription=" + this.collisionDescription + ", latitude=" + this.latitude + ", localizationDescription=" + this.localizationDescription + ", longitude=" + this.longitude + ", perpetrator=" + this.perpetrator + ", victim=" + this.victim + ')';
    }
}
