package fw0;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.k0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010.R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010.R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010.¨\u0006G"}, d2 = {"Lfw0/k0;", "", "", "brand", "Lfw0/a2;", "cardOwnershipType", "", "Lfw0/o3;", "damages", "kind", "model", "productionYear", "registrationNumber", "vehicleSignature", "vinNumber", "Lfw0/c0;", "companyOwner", "Lfw0/f0;", "images", "Lfw0/g0;", "imagesWithThumbnails", "Lfw0/i0;", "insurances", "Lfw0/d0;", "physicalOwners", "<init>", "(Ljava/lang/String;Lfw0/a2;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfw0/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBrand", "b", "Lfw0/a2;", "getCardOwnershipType", "()Lfw0/a2;", "c", "Ljava/util/List;", "getDamages", "()Ljava/util/List;", "d", "getKind", "e", "getModel", "f", "getProductionYear", "g", "getRegistrationNumber", "h", "getVehicleSignature", "i", "getVinNumber", "j", "Lfw0/c0;", "getCompanyOwner", "()Lfw0/c0;", "k", "getImages", "l", "getImagesWithThumbnails", "m", "getInsurances", "n", "getPhysicalOwners", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FillVehicleCollisionParticipantStatementVehicleDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("brand")
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardOwnershipType")
    private final a2 cardOwnershipType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("damages")
    private final List<o3> damages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("kind")
    private final String kind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("model")
    private final String model;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("productionYear")
    private final String productionYear;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationNumber")
    private final String registrationNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleSignature")
    private final String vehicleSignature;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vinNumber")
    private final String vinNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("companyOwner")
    private final FillCollisionCompanyOwnerDto companyOwner;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("images")
    private final List<FillVehicleCollisionParticipantImageDto> images;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("imagesWithThumbnails")
    private final List<FillVehicleCollisionParticipantImageWithThumbnailDto> imagesWithThumbnails;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurances")
    private final List<FillVehicleCollisionParticipantStatementInsuranceDataDto> insurances;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("physicalOwners")
    private final List<FillCollisionPhysicalOwnerDto> physicalOwners;

    /* JADX WARN: Multi-variable type inference failed */
    public FillVehicleCollisionParticipantStatementVehicleDataDto(String str, a2 a2Var, List<? extends o3> list, String str2, String str3, String str4, String str5, String str6, String str7, FillCollisionCompanyOwnerDto fillCollisionCompanyOwnerDto, List<FillVehicleCollisionParticipantImageDto> list2, List<FillVehicleCollisionParticipantImageWithThumbnailDto> list3, List<FillVehicleCollisionParticipantStatementInsuranceDataDto> list4, List<FillCollisionPhysicalOwnerDto> list5) {
        this.brand = str;
        this.cardOwnershipType = a2Var;
        this.damages = list;
        this.kind = str2;
        this.model = str3;
        this.productionYear = str4;
        this.registrationNumber = str5;
        this.vehicleSignature = str6;
        this.vinNumber = str7;
        this.companyOwner = fillCollisionCompanyOwnerDto;
        this.images = list2;
        this.imagesWithThumbnails = list3;
        this.insurances = list4;
        this.physicalOwners = list5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillVehicleCollisionParticipantStatementVehicleDataDto)) {
            return false;
        }
        FillVehicleCollisionParticipantStatementVehicleDataDto fillVehicleCollisionParticipantStatementVehicleDataDto = (FillVehicleCollisionParticipantStatementVehicleDataDto) other;
        return fr.t.c(this.brand, fillVehicleCollisionParticipantStatementVehicleDataDto.brand) && this.cardOwnershipType == fillVehicleCollisionParticipantStatementVehicleDataDto.cardOwnershipType && fr.t.c(this.damages, fillVehicleCollisionParticipantStatementVehicleDataDto.damages) && fr.t.c(this.kind, fillVehicleCollisionParticipantStatementVehicleDataDto.kind) && fr.t.c(this.model, fillVehicleCollisionParticipantStatementVehicleDataDto.model) && fr.t.c(this.productionYear, fillVehicleCollisionParticipantStatementVehicleDataDto.productionYear) && fr.t.c(this.registrationNumber, fillVehicleCollisionParticipantStatementVehicleDataDto.registrationNumber) && fr.t.c(this.vehicleSignature, fillVehicleCollisionParticipantStatementVehicleDataDto.vehicleSignature) && fr.t.c(this.vinNumber, fillVehicleCollisionParticipantStatementVehicleDataDto.vinNumber) && fr.t.c(this.companyOwner, fillVehicleCollisionParticipantStatementVehicleDataDto.companyOwner) && fr.t.c(this.images, fillVehicleCollisionParticipantStatementVehicleDataDto.images) && fr.t.c(this.imagesWithThumbnails, fillVehicleCollisionParticipantStatementVehicleDataDto.imagesWithThumbnails) && fr.t.c(this.insurances, fillVehicleCollisionParticipantStatementVehicleDataDto.insurances) && fr.t.c(this.physicalOwners, fillVehicleCollisionParticipantStatementVehicleDataDto.physicalOwners);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.brand.hashCode() * 31) + this.cardOwnershipType.hashCode()) * 31) + this.damages.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.model.hashCode()) * 31) + this.productionYear.hashCode()) * 31) + this.registrationNumber.hashCode()) * 31) + this.vehicleSignature.hashCode()) * 31) + this.vinNumber.hashCode()) * 31;
        FillCollisionCompanyOwnerDto fillCollisionCompanyOwnerDto = this.companyOwner;
        int iHashCode2 = (iHashCode + (fillCollisionCompanyOwnerDto == null ? 0 : fillCollisionCompanyOwnerDto.hashCode())) * 31;
        List<FillVehicleCollisionParticipantImageDto> list = this.images;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<FillVehicleCollisionParticipantImageWithThumbnailDto> list2 = this.imagesWithThumbnails;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FillVehicleCollisionParticipantStatementInsuranceDataDto> list3 = this.insurances;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<FillCollisionPhysicalOwnerDto> list4 = this.physicalOwners;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "FillVehicleCollisionParticipantStatementVehicleDataDto(brand=" + this.brand + ", cardOwnershipType=" + this.cardOwnershipType + ", damages=" + this.damages + ", kind=" + this.kind + ", model=" + this.model + ", productionYear=" + this.productionYear + ", registrationNumber=" + this.registrationNumber + ", vehicleSignature=" + this.vehicleSignature + ", vinNumber=" + this.vinNumber + ", companyOwner=" + this.companyOwner + ", images=" + this.images + ", imagesWithThumbnails=" + this.imagesWithThumbnails + ", insurances=" + this.insurances + ", physicalOwners=" + this.physicalOwners + ')';
    }

    public /* synthetic */ FillVehicleCollisionParticipantStatementVehicleDataDto(String str, a2 a2Var, List list, String str2, String str3, String str4, String str5, String str6, String str7, FillCollisionCompanyOwnerDto fillCollisionCompanyOwnerDto, List list2, List list3, List list4, List list5, int i15, fr.k kVar) {
        this(str, a2Var, list, str2, str3, str4, str5, str6, str7, (i15 & 512) != 0 ? null : fillCollisionCompanyOwnerDto, (i15 & 1024) != 0 ? null : list2, (i15 & 2048) != 0 ? null : list3, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : list4, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : list5);
    }
}
