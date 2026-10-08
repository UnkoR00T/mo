package zu0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzu0/j;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzu0/p;", "a", "Lzu0/p;", "getConfig", "()Lzu0/p;", "config", "", "Lzu0/i;", "b", "Ljava/util/List;", "()Ljava/util/List;", "countries", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("config")
    private final SubscriptionConfigDto config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countries")
    private final List<CountryDto> countries;

    public final List<CountryDto> a() {
        return this.countries;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryResponse)) {
            return false;
        }
        CountryResponse countryResponse = (CountryResponse) other;
        return fr.t.c(this.config, countryResponse.config) && fr.t.c(this.countries, countryResponse.countries);
    }

    public int hashCode() {
        return (this.config.hashCode() * 31) + this.countries.hashCode();
    }

    public String toString() {
        return "CountryResponse(config=" + this.config + ", countries=" + this.countries + ')';
    }
}
