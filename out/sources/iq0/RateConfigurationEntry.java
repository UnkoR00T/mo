package iq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.x, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u0017\u0010!¨\u0006$"}, d2 = {"Liq0/x;", "", "", "gracePeriodShort", "gracePeriodMedium", "gracePeriodLong", "", "emailAddress", "", "rateSupported", "nativeRateSupported", "<init>", "(IIILjava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getGracePeriodShort", "b", "getGracePeriodMedium", "c", "getGracePeriodLong", "d", "Ljava/lang/String;", "getEmailAddress", "e", "Z", "getRateSupported", "()Z", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RateConfigurationEntry {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final RateConfigurationEntry f96351h = new RateConfigurationEntry(0, 0, 0, "mObywatel.biznes@coi.gov.pl", false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int gracePeriodShort;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int gracePeriodMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int gracePeriodLong;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailAddress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rateSupported;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean nativeRateSupported;

    /* JADX INFO: renamed from: iq0.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liq0/x$a;", "", "<init>", "()V", "Liq0/x;", "DEFAULT", "Liq0/x;", "a", "()Liq0/x;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final RateConfigurationEntry a() {
            return RateConfigurationEntry.f96351h;
        }

        private Companion() {
        }
    }

    public RateConfigurationEntry(int i15, int i16, int i17, String str, boolean z15, boolean z16) {
        this.gracePeriodShort = i15;
        this.gracePeriodMedium = i16;
        this.gracePeriodLong = i17;
        this.emailAddress = str;
        this.rateSupported = z15;
        this.nativeRateSupported = z16;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNativeRateSupported() {
        return this.nativeRateSupported;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateConfigurationEntry)) {
            return false;
        }
        RateConfigurationEntry rateConfigurationEntry = (RateConfigurationEntry) other;
        return this.gracePeriodShort == rateConfigurationEntry.gracePeriodShort && this.gracePeriodMedium == rateConfigurationEntry.gracePeriodMedium && this.gracePeriodLong == rateConfigurationEntry.gracePeriodLong && fr.t.c(this.emailAddress, rateConfigurationEntry.emailAddress) && this.rateSupported == rateConfigurationEntry.rateSupported && this.nativeRateSupported == rateConfigurationEntry.nativeRateSupported;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.gracePeriodShort) * 31) + Integer.hashCode(this.gracePeriodMedium)) * 31) + Integer.hashCode(this.gracePeriodLong)) * 31) + this.emailAddress.hashCode()) * 31) + Boolean.hashCode(this.rateSupported)) * 31) + Boolean.hashCode(this.nativeRateSupported);
    }

    public String toString() {
        return "RateConfigurationEntry(gracePeriodShort=" + this.gracePeriodShort + ", gracePeriodMedium=" + this.gracePeriodMedium + ", gracePeriodLong=" + this.gracePeriodLong + ", emailAddress=" + this.emailAddress + ", rateSupported=" + this.rateSupported + ", nativeRateSupported=" + this.nativeRateSupported + ")";
    }
}
