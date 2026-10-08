package mq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lmq0/v;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "emailAddress", "b", "I", "gracePeriodLong", "c", "gracePeriodMedium", "d", "gracePeriodShort", "e", "Z", "()Z", "nativeRateSupported", "f", "rateSupported", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RateConfigurationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("emailAddress")
    private final String emailAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gracePeriodLong")
    private final int gracePeriodLong;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gracePeriodMedium")
    private final int gracePeriodMedium;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gracePeriodShort")
    private final int gracePeriodShort;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nativeRateSupported")
    private final boolean nativeRateSupported;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rateSupported")
    private final boolean rateSupported;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getGracePeriodLong() {
        return this.gracePeriodLong;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getGracePeriodMedium() {
        return this.gracePeriodMedium;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getGracePeriodShort() {
        return this.gracePeriodShort;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNativeRateSupported() {
        return this.nativeRateSupported;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateConfigurationDto)) {
            return false;
        }
        RateConfigurationDto rateConfigurationDto = (RateConfigurationDto) other;
        return fr.t.c(this.emailAddress, rateConfigurationDto.emailAddress) && this.gracePeriodLong == rateConfigurationDto.gracePeriodLong && this.gracePeriodMedium == rateConfigurationDto.gracePeriodMedium && this.gracePeriodShort == rateConfigurationDto.gracePeriodShort && this.nativeRateSupported == rateConfigurationDto.nativeRateSupported && this.rateSupported == rateConfigurationDto.rateSupported;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRateSupported() {
        return this.rateSupported;
    }

    public int hashCode() {
        return (((((((((this.emailAddress.hashCode() * 31) + Integer.hashCode(this.gracePeriodLong)) * 31) + Integer.hashCode(this.gracePeriodMedium)) * 31) + Integer.hashCode(this.gracePeriodShort)) * 31) + Boolean.hashCode(this.nativeRateSupported)) * 31) + Boolean.hashCode(this.rateSupported);
    }

    public String toString() {
        return "RateConfigurationDto(emailAddress=" + this.emailAddress + ", gracePeriodLong=" + this.gracePeriodLong + ", gracePeriodMedium=" + this.gracePeriodMedium + ", gracePeriodShort=" + this.gracePeriodShort + ", nativeRateSupported=" + this.nativeRateSupported + ", rateSupported=" + this.rateSupported + ')';
    }
}
