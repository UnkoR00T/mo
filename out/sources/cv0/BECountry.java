package cv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cv0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcv0/d;", "", "", "isoCode", "name", "", "isSubscribed", "Lcv0/s;", "warningLevel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcv0/s;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "d", "()Z", "Lcv0/s;", "()Lcv0/s;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BECountry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscribed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEWarningLevel warningLevel;

    public BECountry(String str, String str2, boolean z15, BEWarningLevel bEWarningLevel) {
        this.isoCode = str;
        this.name = str2;
        this.isSubscribed = z15;
        this.warningLevel = bEWarningLevel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEWarningLevel getWarningLevel() {
        return this.warningLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BECountry)) {
            return false;
        }
        BECountry bECountry = (BECountry) other;
        return fr.t.c(this.isoCode, bECountry.isoCode) && fr.t.c(this.name, bECountry.name) && this.isSubscribed == bECountry.isSubscribed && fr.t.c(this.warningLevel, bECountry.warningLevel);
    }

    public int hashCode() {
        return (((((this.isoCode.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSubscribed)) * 31) + this.warningLevel.hashCode();
    }

    public String toString() {
        return "BECountry(isoCode=" + this.isoCode + ", name=" + this.name + ", isSubscribed=" + this.isSubscribed + ", warningLevel=" + this.warningLevel + ')';
    }
}
