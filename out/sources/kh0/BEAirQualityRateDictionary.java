package kh0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: kh0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lkh0/a;", "", "Lkh0/l;", "rate", "", "description", "", "pm25minValue", "pm25maxValue", "<init>", "(Lkh0/l;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkh0/l;", "d", "()Lkh0/l;", "b", "Ljava/lang/String;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEAirQualityRateDictionary {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pm25minValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float pm25maxValue;

    public BEAirQualityRateDictionary(l lVar, String str, Float f15, Float f16) {
        this.rate = lVar;
        this.description = str;
        this.pm25minValue = f15;
        this.pm25maxValue = f16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getPm25maxValue() {
        return this.pm25maxValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getPm25minValue() {
        return this.pm25minValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l getRate() {
        return this.rate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEAirQualityRateDictionary)) {
            return false;
        }
        BEAirQualityRateDictionary bEAirQualityRateDictionary = (BEAirQualityRateDictionary) other;
        return this.rate == bEAirQualityRateDictionary.rate && t.c(this.description, bEAirQualityRateDictionary.description) && t.c(this.pm25minValue, bEAirQualityRateDictionary.pm25minValue) && t.c(this.pm25maxValue, bEAirQualityRateDictionary.pm25maxValue);
    }

    public int hashCode() {
        int iHashCode = ((this.rate.hashCode() * 31) + this.description.hashCode()) * 31;
        Float f15 = this.pm25minValue;
        int iHashCode2 = (iHashCode + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.pm25maxValue;
        return iHashCode2 + (f16 != null ? f16.hashCode() : 0);
    }

    public String toString() {
        return "BEAirQualityRateDictionary(rate=" + this.rate + ", description=" + this.description + ", pm25minValue=" + this.pm25minValue + ", pm25maxValue=" + this.pm25maxValue + ")";
    }
}
