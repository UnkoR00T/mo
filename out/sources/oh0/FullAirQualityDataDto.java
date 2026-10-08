package oh0;

import fr.t;
import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001e"}, d2 = {"Loh0/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loh0/h;", "a", "Loh0/h;", "e", "()Loh0/h;", "rateCode", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "humidityAvg", "c", "pm10Avg", "d", "pm25Avg", "pressureAvg", "f", "temperatureAvg", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FullAirQualityDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rateCode")
    private final h rateCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("humidityAvg")
    private final BigDecimal humidityAvg;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pm10Avg")
    private final BigDecimal pm10Avg;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pm25Avg")
    private final BigDecimal pm25Avg;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pressureAvg")
    private final BigDecimal pressureAvg;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temperatureAvg")
    private final BigDecimal temperatureAvg;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getHumidityAvg() {
        return this.humidityAvg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getPm10Avg() {
        return this.pm10Avg;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getPm25Avg() {
        return this.pm25Avg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getPressureAvg() {
        return this.pressureAvg;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getRateCode() {
        return this.rateCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullAirQualityDataDto)) {
            return false;
        }
        FullAirQualityDataDto fullAirQualityDataDto = (FullAirQualityDataDto) other;
        return this.rateCode == fullAirQualityDataDto.rateCode && t.c(this.humidityAvg, fullAirQualityDataDto.humidityAvg) && t.c(this.pm10Avg, fullAirQualityDataDto.pm10Avg) && t.c(this.pm25Avg, fullAirQualityDataDto.pm25Avg) && t.c(this.pressureAvg, fullAirQualityDataDto.pressureAvg) && t.c(this.temperatureAvg, fullAirQualityDataDto.temperatureAvg);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getTemperatureAvg() {
        return this.temperatureAvg;
    }

    public int hashCode() {
        int iHashCode = this.rateCode.hashCode() * 31;
        BigDecimal bigDecimal = this.humidityAvg;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.pm10Avg;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.pm25Avg;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.pressureAvg;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.temperatureAvg;
        return iHashCode5 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    public String toString() {
        return "FullAirQualityDataDto(rateCode=" + this.rateCode + ", humidityAvg=" + this.humidityAvg + ", pm10Avg=" + this.pm10Avg + ", pm25Avg=" + this.pm25Avg + ", pressureAvg=" + this.pressureAvg + ", temperatureAvg=" + this.temperatureAvg + ')';
    }
}
