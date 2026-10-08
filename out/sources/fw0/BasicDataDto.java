package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u001b"}, d2 = {"Lfw0/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "brand", "b", "c", "numberPlate", "d", "registrationAuthorityCode", "f", "vin", "e", "g", "yearOfProduction", "model", "type", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BasicDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("brand")
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("numberPlate")
    private final String numberPlate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationAuthorityCode")
    private final String registrationAuthorityCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vin")
    private final String vin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("yearOfProduction")
    private final String yearOfProduction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("model")
    private final String model;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final String type;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNumberPlate() {
        return this.numberPlate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRegistrationAuthorityCode() {
        return this.registrationAuthorityCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicDataDto)) {
            return false;
        }
        BasicDataDto basicDataDto = (BasicDataDto) other;
        return fr.t.c(this.brand, basicDataDto.brand) && fr.t.c(this.numberPlate, basicDataDto.numberPlate) && fr.t.c(this.registrationAuthorityCode, basicDataDto.registrationAuthorityCode) && fr.t.c(this.vin, basicDataDto.vin) && fr.t.c(this.yearOfProduction, basicDataDto.yearOfProduction) && fr.t.c(this.model, basicDataDto.model) && fr.t.c(this.type, basicDataDto.type);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getYearOfProduction() {
        return this.yearOfProduction;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.brand.hashCode() * 31) + this.numberPlate.hashCode()) * 31) + this.registrationAuthorityCode.hashCode()) * 31) + this.vin.hashCode()) * 31) + this.yearOfProduction.hashCode()) * 31;
        String str = this.model;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BasicDataDto(brand=" + this.brand + ", numberPlate=" + this.numberPlate + ", registrationAuthorityCode=" + this.registrationAuthorityCode + ", vin=" + this.vin + ", yearOfProduction=" + this.yearOfProduction + ", model=" + this.model + ", type=" + this.type + ')';
    }
}
