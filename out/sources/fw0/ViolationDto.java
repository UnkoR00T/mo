package fw0;

import java.time.OffsetDateTime;
import java.util.List;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.e4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Lfw0/e4;", "", "", "Lfw0/d;", "actList", "", "conclusion", "", "penaltyPoints", "Lfw0/f1;", "penaltyPointsVehicle", "registrationAuthority", "Ljava/time/OffsetDateTime;", "violationDate", "Lfw0/f4;", "violationPlace", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lfw0/f1;Ljava/lang/String;Ljava/time/OffsetDateTime;Lfw0/f4;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Lfw0/f1;", "()Lfw0/f1;", "e", "f", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "g", "Lfw0/f4;", "()Lfw0/f4;", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViolationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("actList")
    private final List<ActDto> actList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("conclusion")
    private final String conclusion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("penaltyPoints")
    private final Integer penaltyPoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("penaltyPointsVehicle")
    private final PenaltyPointsVehicleDto penaltyPointsVehicle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationAuthority")
    private final String registrationAuthority;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("violationDate")
    private final OffsetDateTime violationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("violationPlace")
    private final ViolationPlaceDto violationPlace;

    public ViolationDto() {
        this(null, null, null, null, null, null, null, CertificateBody.profileType, null);
    }

    public final List<ActDto> a() {
        return this.actList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConclusion() {
        return this.conclusion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getPenaltyPoints() {
        return this.penaltyPoints;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PenaltyPointsVehicleDto getPenaltyPointsVehicle() {
        return this.penaltyPointsVehicle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViolationDto)) {
            return false;
        }
        ViolationDto violationDto = (ViolationDto) other;
        return fr.t.c(this.actList, violationDto.actList) && fr.t.c(this.conclusion, violationDto.conclusion) && fr.t.c(this.penaltyPoints, violationDto.penaltyPoints) && fr.t.c(this.penaltyPointsVehicle, violationDto.penaltyPointsVehicle) && fr.t.c(this.registrationAuthority, violationDto.registrationAuthority) && fr.t.c(this.violationDate, violationDto.violationDate) && fr.t.c(this.violationPlace, violationDto.violationPlace);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getViolationDate() {
        return this.violationDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ViolationPlaceDto getViolationPlace() {
        return this.violationPlace;
    }

    public int hashCode() {
        List<ActDto> list = this.actList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.conclusion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.penaltyPoints;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        PenaltyPointsVehicleDto penaltyPointsVehicleDto = this.penaltyPointsVehicle;
        int iHashCode4 = (iHashCode3 + (penaltyPointsVehicleDto == null ? 0 : penaltyPointsVehicleDto.hashCode())) * 31;
        String str2 = this.registrationAuthority;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.violationDate;
        int iHashCode6 = (iHashCode5 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        ViolationPlaceDto violationPlaceDto = this.violationPlace;
        return iHashCode6 + (violationPlaceDto != null ? violationPlaceDto.hashCode() : 0);
    }

    public String toString() {
        return "ViolationDto(actList=" + this.actList + ", conclusion=" + this.conclusion + ", penaltyPoints=" + this.penaltyPoints + ", penaltyPointsVehicle=" + this.penaltyPointsVehicle + ", registrationAuthority=" + this.registrationAuthority + ", violationDate=" + this.violationDate + ", violationPlace=" + this.violationPlace + ')';
    }

    public ViolationDto(List<ActDto> list, String str, Integer num, PenaltyPointsVehicleDto penaltyPointsVehicleDto, String str2, OffsetDateTime offsetDateTime, ViolationPlaceDto violationPlaceDto) {
        this.actList = list;
        this.conclusion = str;
        this.penaltyPoints = num;
        this.penaltyPointsVehicle = penaltyPointsVehicleDto;
        this.registrationAuthority = str2;
        this.violationDate = offsetDateTime;
        this.violationPlace = violationPlaceDto;
    }

    public /* synthetic */ ViolationDto(List list, String str, Integer num, PenaltyPointsVehicleDto penaltyPointsVehicleDto, String str2, OffsetDateTime offsetDateTime, ViolationPlaceDto violationPlaceDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? null : penaltyPointsVehicleDto, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : offsetDateTime, (i15 & 64) != 0 ? null : violationPlaceDto);
    }
}
