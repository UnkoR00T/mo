package zu0;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u0004R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0015R \u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\"\u0010\u0015R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b%\u0010)¨\u0006+"}, d2 = {"Lzu0/h;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzu0/p;", "a", "Lzu0/p;", "()Lzu0/p;", "config", "", "Lzu0/c;", "b", "Ljava/util/List;", "()Ljava/util/List;", "contacts", "c", "Ljava/lang/String;", "d", "isoCode", "f", "name", "Lzu0/m;", "e", "g", "profiles", "Lzu0/c0;", "i", "warningLevels", "flag", "h", "map", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "updatedDate", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryDetailsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("config")
    private final SubscriptionConfigDto config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("contacts")
    private final List<ContactDto> contacts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isoCode")
    private final String isoCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("profiles")
    private final List<ProfileDto> profiles;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warningLevels")
    private final List<WarningDto> warningLevels;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("flag")
    private final String flag;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("map")
    private final String map;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("updatedDate")
    private final LocalDate updatedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SubscriptionConfigDto getConfig() {
        return this.config;
    }

    public final List<ContactDto> b() {
        return this.contacts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMap() {
        return this.map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryDetailsResponse)) {
            return false;
        }
        CountryDetailsResponse countryDetailsResponse = (CountryDetailsResponse) other;
        return fr.t.c(this.config, countryDetailsResponse.config) && fr.t.c(this.contacts, countryDetailsResponse.contacts) && fr.t.c(this.isoCode, countryDetailsResponse.isoCode) && fr.t.c(this.name, countryDetailsResponse.name) && fr.t.c(this.profiles, countryDetailsResponse.profiles) && fr.t.c(this.warningLevels, countryDetailsResponse.warningLevels) && fr.t.c(this.flag, countryDetailsResponse.flag) && fr.t.c(this.map, countryDetailsResponse.map) && fr.t.c(this.updatedDate, countryDetailsResponse.updatedDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<ProfileDto> g() {
        return this.profiles;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LocalDate getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.config.hashCode() * 31) + this.contacts.hashCode()) * 31) + this.isoCode.hashCode()) * 31) + this.name.hashCode()) * 31) + this.profiles.hashCode()) * 31) + this.warningLevels.hashCode()) * 31;
        String str = this.flag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.map;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.updatedDate;
        return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
    }

    public final List<WarningDto> i() {
        return this.warningLevels;
    }

    public String toString() {
        return "CountryDetailsResponse(config=" + this.config + ", contacts=" + this.contacts + ", isoCode=" + this.isoCode + ", name=" + this.name + ", profiles=" + this.profiles + ", warningLevels=" + this.warningLevels + ", flag=" + this.flag + ", map=" + this.map + ", updatedDate=" + this.updatedDate + ')';
    }
}
