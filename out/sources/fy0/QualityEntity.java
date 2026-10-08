package fy0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fy0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, d2 = {"Lfy0/d;", "", "Lfy0/e;", "rate", "", "humidity", "pressure", "temperature", "pm10value", "pm25value", "<init>", "(Lfy0/e;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfy0/e;", "e", "()Lfy0/e;", "b", "Ljava/lang/Float;", "()Ljava/lang/Float;", "c", "d", "f", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QualityEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final e rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float humidity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pressure;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float temperature;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pm10value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pm25value;

    public QualityEntity(e eVar, Float f15, Float f16, Float f17, Float f18, Float f19) {
        this.rate = eVar;
        this.humidity = f15;
        this.pressure = f16;
        this.temperature = f17;
        this.pm10value = f18;
        this.pm25value = f19;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getHumidity() {
        return this.humidity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getPm10value() {
        return this.pm10value;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getPm25value() {
        return this.pm25value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getRate() {
        return this.rate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualityEntity)) {
            return false;
        }
        QualityEntity qualityEntity = (QualityEntity) other;
        return this.rate == qualityEntity.rate && t.c(this.humidity, qualityEntity.humidity) && t.c(this.pressure, qualityEntity.pressure) && t.c(this.temperature, qualityEntity.temperature) && t.c(this.pm10value, qualityEntity.pm10value) && t.c(this.pm25value, qualityEntity.pm25value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getTemperature() {
        return this.temperature;
    }

    public int hashCode() {
        int iHashCode = this.rate.hashCode() * 31;
        Float f15 = this.humidity;
        int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.pressure;
        int iHashCode3 = (iHashCode2 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.temperature;
        int iHashCode4 = (iHashCode3 + (f17 == null ? 0 : f17.hashCode())) * 31;
        Float f18 = this.pm10value;
        int iHashCode5 = (iHashCode4 + (f18 == null ? 0 : f18.hashCode())) * 31;
        Float f19 = this.pm25value;
        return iHashCode5 + (f19 != null ? f19.hashCode() : 0);
    }

    public String toString() {
        return "QualityEntity(rate=" + this.rate + ", humidity=" + this.humidity + ", pressure=" + this.pressure + ", temperature=" + this.temperature + ", pm10value=" + this.pm10value + ", pm25value=" + this.pm25value + ')';
    }
}
