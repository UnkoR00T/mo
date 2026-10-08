package fw0;

import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.x3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R\u001c\u0010(\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b#\u0010\u0019R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b'\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b)\u0010\u0019R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b+\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b-\u0010\u0019R\u001c\u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b/\u0010%R\u001c\u00104\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b1\u0010%R\u001c\u00106\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b3\u0010%R\u001c\u00108\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b5\u0010%R\u001c\u0010:\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b7\u0010%R\u001c\u0010<\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b9\u0010%R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0012\u001a\u0004\b;\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010$\u001a\u0004\b=\u0010%R\u001c\u0010B\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\b?\u0010%R\u001c\u0010D\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010$\u001a\u0004\bA\u0010%R\u001c\u0010F\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010$\u001a\u0004\bC\u0010%R\u001c\u0010G\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\bE\u0010\u0019¨\u0006H"}, d2 = {"Lfw0/x3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "z", "()Z", "isEuroNorm", "b", "Ljava/lang/String;", "alternativeFuelType", "c", "alternativeFuelType2", "Ljava/math/BigDecimal;", "d", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "averageAlternativeFuelConsumption", "e", "averageAlternativeFuelConsumption2", "f", "averageEmissionLevelCO2AlternativeFuel", "g", "averageEmissionLevelCO2AlternativeFuel2", "h", "averageFuelConsumption", "i", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "curbWeight", "j", "emissionLevelCO2", "k", "emissionLevelEuro", "l", "enginePower", "m", "fuelType", "n", "maxAxleLoad", "o", "maxCurbWeight", "p", "maxTrailerWeightNoBrake", "q", "maxTrailerWeightWithBrake", "r", "numberOfAxles", "s", "numberOfSeats", "t", "numberOfStandingPlaces", "u", "odometerState", "v", "permissibleGrossWeight", "w", "permissibleTotalPayload", "x", "totalNumberOfSeats", "y", "trackOfWheels", "wheelbase", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryTechnicalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isEuroNorm")
    private final boolean isEuroNorm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("alternativeFuelType")
    private final String alternativeFuelType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("alternativeFuelType2")
    private final String alternativeFuelType2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("averageAlternativeFuelConsumption")
    private final BigDecimal averageAlternativeFuelConsumption;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("averageAlternativeFuelConsumption2")
    private final BigDecimal averageAlternativeFuelConsumption2;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("averageEmissionLevelCO2AlternativeFuel")
    private final BigDecimal averageEmissionLevelCO2AlternativeFuel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("averageEmissionLevelCO2AlternativeFuel2")
    private final BigDecimal averageEmissionLevelCO2AlternativeFuel2;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("averageFuelConsumption")
    private final BigDecimal averageFuelConsumption;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("curbWeight")
    private final Integer curbWeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("emissionLevelCO2")
    private final BigDecimal emissionLevelCO2;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("emissionLevelEuro")
    private final String emissionLevelEuro;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("enginePower")
    private final BigDecimal enginePower;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fuelType")
    private final String fuelType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxAxleLoad")
    private final BigDecimal maxAxleLoad;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxCurbWeight")
    private final Integer maxCurbWeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxTrailerWeightNoBrake")
    private final Integer maxTrailerWeightNoBrake;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxTrailerWeightWithBrake")
    private final Integer maxTrailerWeightWithBrake;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("numberOfAxles")
    private final Integer numberOfAxles;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("numberOfSeats")
    private final Integer numberOfSeats;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("numberOfStandingPlaces")
    private final Integer numberOfStandingPlaces;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("odometerState")
    private final String odometerState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("permissibleGrossWeight")
    private final Integer permissibleGrossWeight;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("permissibleTotalPayload")
    private final Integer permissibleTotalPayload;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("totalNumberOfSeats")
    private final Integer totalNumberOfSeats;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("trackOfWheels")
    private final Integer trackOfWheels;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("wheelbase")
    private final BigDecimal wheelbase;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlternativeFuelType() {
        return this.alternativeFuelType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAlternativeFuelType2() {
        return this.alternativeFuelType2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getAverageAlternativeFuelConsumption() {
        return this.averageAlternativeFuelConsumption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getAverageAlternativeFuelConsumption2() {
        return this.averageAlternativeFuelConsumption2;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getAverageEmissionLevelCO2AlternativeFuel() {
        return this.averageEmissionLevelCO2AlternativeFuel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryTechnicalDataDto)) {
            return false;
        }
        VehicleHistoryTechnicalDataDto vehicleHistoryTechnicalDataDto = (VehicleHistoryTechnicalDataDto) other;
        return this.isEuroNorm == vehicleHistoryTechnicalDataDto.isEuroNorm && fr.t.c(this.alternativeFuelType, vehicleHistoryTechnicalDataDto.alternativeFuelType) && fr.t.c(this.alternativeFuelType2, vehicleHistoryTechnicalDataDto.alternativeFuelType2) && fr.t.c(this.averageAlternativeFuelConsumption, vehicleHistoryTechnicalDataDto.averageAlternativeFuelConsumption) && fr.t.c(this.averageAlternativeFuelConsumption2, vehicleHistoryTechnicalDataDto.averageAlternativeFuelConsumption2) && fr.t.c(this.averageEmissionLevelCO2AlternativeFuel, vehicleHistoryTechnicalDataDto.averageEmissionLevelCO2AlternativeFuel) && fr.t.c(this.averageEmissionLevelCO2AlternativeFuel2, vehicleHistoryTechnicalDataDto.averageEmissionLevelCO2AlternativeFuel2) && fr.t.c(this.averageFuelConsumption, vehicleHistoryTechnicalDataDto.averageFuelConsumption) && fr.t.c(this.curbWeight, vehicleHistoryTechnicalDataDto.curbWeight) && fr.t.c(this.emissionLevelCO2, vehicleHistoryTechnicalDataDto.emissionLevelCO2) && fr.t.c(this.emissionLevelEuro, vehicleHistoryTechnicalDataDto.emissionLevelEuro) && fr.t.c(this.enginePower, vehicleHistoryTechnicalDataDto.enginePower) && fr.t.c(this.fuelType, vehicleHistoryTechnicalDataDto.fuelType) && fr.t.c(this.maxAxleLoad, vehicleHistoryTechnicalDataDto.maxAxleLoad) && fr.t.c(this.maxCurbWeight, vehicleHistoryTechnicalDataDto.maxCurbWeight) && fr.t.c(this.maxTrailerWeightNoBrake, vehicleHistoryTechnicalDataDto.maxTrailerWeightNoBrake) && fr.t.c(this.maxTrailerWeightWithBrake, vehicleHistoryTechnicalDataDto.maxTrailerWeightWithBrake) && fr.t.c(this.numberOfAxles, vehicleHistoryTechnicalDataDto.numberOfAxles) && fr.t.c(this.numberOfSeats, vehicleHistoryTechnicalDataDto.numberOfSeats) && fr.t.c(this.numberOfStandingPlaces, vehicleHistoryTechnicalDataDto.numberOfStandingPlaces) && fr.t.c(this.odometerState, vehicleHistoryTechnicalDataDto.odometerState) && fr.t.c(this.permissibleGrossWeight, vehicleHistoryTechnicalDataDto.permissibleGrossWeight) && fr.t.c(this.permissibleTotalPayload, vehicleHistoryTechnicalDataDto.permissibleTotalPayload) && fr.t.c(this.totalNumberOfSeats, vehicleHistoryTechnicalDataDto.totalNumberOfSeats) && fr.t.c(this.trackOfWheels, vehicleHistoryTechnicalDataDto.trackOfWheels) && fr.t.c(this.wheelbase, vehicleHistoryTechnicalDataDto.wheelbase);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getAverageEmissionLevelCO2AlternativeFuel2() {
        return this.averageEmissionLevelCO2AlternativeFuel2;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getAverageFuelConsumption() {
        return this.averageFuelConsumption;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getCurbWeight() {
        return this.curbWeight;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEuroNorm) * 31;
        String str = this.alternativeFuelType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.alternativeFuelType2;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.averageAlternativeFuelConsumption;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.averageAlternativeFuelConsumption2;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.averageEmissionLevelCO2AlternativeFuel;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.averageEmissionLevelCO2AlternativeFuel2;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.averageFuelConsumption;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Integer num = this.curbWeight;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.emissionLevelCO2;
        int iHashCode10 = (iHashCode9 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str3 = this.emissionLevelEuro;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.enginePower;
        int iHashCode12 = (iHashCode11 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str4 = this.fuelType;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.maxAxleLoad;
        int iHashCode14 = (iHashCode13 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Integer num2 = this.maxCurbWeight;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxTrailerWeightNoBrake;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxTrailerWeightWithBrake;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.numberOfAxles;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.numberOfSeats;
        int iHashCode19 = (iHashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.numberOfStandingPlaces;
        int iHashCode20 = (iHashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this.odometerState;
        int iHashCode21 = (iHashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num8 = this.permissibleGrossWeight;
        int iHashCode22 = (iHashCode21 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.permissibleTotalPayload;
        int iHashCode23 = (iHashCode22 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.totalNumberOfSeats;
        int iHashCode24 = (iHashCode23 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.trackOfWheels;
        int iHashCode25 = (iHashCode24 + (num11 == null ? 0 : num11.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.wheelbase;
        return iHashCode25 + (bigDecimal9 != null ? bigDecimal9.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getEmissionLevelCO2() {
        return this.emissionLevelCO2;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getEmissionLevelEuro() {
        return this.emissionLevelEuro;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final BigDecimal getEnginePower() {
        return this.enginePower;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getFuelType() {
        return this.fuelType;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final BigDecimal getMaxAxleLoad() {
        return this.maxAxleLoad;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getMaxCurbWeight() {
        return this.maxCurbWeight;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getMaxTrailerWeightNoBrake() {
        return this.maxTrailerWeightNoBrake;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Integer getMaxTrailerWeightWithBrake() {
        return this.maxTrailerWeightWithBrake;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getNumberOfAxles() {
        return this.numberOfAxles;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getNumberOfSeats() {
        return this.numberOfSeats;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getNumberOfStandingPlaces() {
        return this.numberOfStandingPlaces;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getOdometerState() {
        return this.odometerState;
    }

    public String toString() {
        return "VehicleHistoryTechnicalDataDto(isEuroNorm=" + this.isEuroNorm + ", alternativeFuelType=" + this.alternativeFuelType + ", alternativeFuelType2=" + this.alternativeFuelType2 + ", averageAlternativeFuelConsumption=" + this.averageAlternativeFuelConsumption + ", averageAlternativeFuelConsumption2=" + this.averageAlternativeFuelConsumption2 + ", averageEmissionLevelCO2AlternativeFuel=" + this.averageEmissionLevelCO2AlternativeFuel + ", averageEmissionLevelCO2AlternativeFuel2=" + this.averageEmissionLevelCO2AlternativeFuel2 + ", averageFuelConsumption=" + this.averageFuelConsumption + ", curbWeight=" + this.curbWeight + ", emissionLevelCO2=" + this.emissionLevelCO2 + ", emissionLevelEuro=" + this.emissionLevelEuro + ", enginePower=" + this.enginePower + ", fuelType=" + this.fuelType + ", maxAxleLoad=" + this.maxAxleLoad + ", maxCurbWeight=" + this.maxCurbWeight + ", maxTrailerWeightNoBrake=" + this.maxTrailerWeightNoBrake + ", maxTrailerWeightWithBrake=" + this.maxTrailerWeightWithBrake + ", numberOfAxles=" + this.numberOfAxles + ", numberOfSeats=" + this.numberOfSeats + ", numberOfStandingPlaces=" + this.numberOfStandingPlaces + ", odometerState=" + this.odometerState + ", permissibleGrossWeight=" + this.permissibleGrossWeight + ", permissibleTotalPayload=" + this.permissibleTotalPayload + ", totalNumberOfSeats=" + this.totalNumberOfSeats + ", trackOfWheels=" + this.trackOfWheels + ", wheelbase=" + this.wheelbase + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Integer getPermissibleGrossWeight() {
        return this.permissibleGrossWeight;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Integer getPermissibleTotalPayload() {
        return this.permissibleTotalPayload;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Integer getTotalNumberOfSeats() {
        return this.totalNumberOfSeats;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Integer getTrackOfWheels() {
        return this.trackOfWheels;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final BigDecimal getWheelbase() {
        return this.wheelbase;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsEuroNorm() {
        return this.isEuroNorm;
    }
}
