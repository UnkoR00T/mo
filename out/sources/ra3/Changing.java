package ra3;

import p071kotlin.Metadata;
import v93.CountryDetailsFormatted;

/* JADX INFO: renamed from: ra3.i, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lra3/i;", "", "", "isSubscribed", "Lv93/e;", "countryDetails", "<init>", "(ZLv93/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lv93/e;", "()Lv93/e;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Changing implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscribed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CountryDetailsFormatted countryDetails;

    public Changing(boolean z15, CountryDetailsFormatted countryDetailsFormatted) {
        this.isSubscribed = z15;
        this.countryDetails = countryDetailsFormatted;
    }

    @Override // ra3.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @Override // ra3.k.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public CountryDetailsFormatted getCountryDetails() {
        return this.countryDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Changing)) {
            return false;
        }
        Changing changing = (Changing) other;
        return this.isSubscribed == changing.isSubscribed && fr.t.c(this.countryDetails, changing.countryDetails);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSubscribed) * 31) + this.countryDetails.hashCode();
    }

    public String toString() {
        return "Changing(isSubscribed=" + this.isSubscribed + ", countryDetails=" + this.countryDetails + ')';
    }
}
