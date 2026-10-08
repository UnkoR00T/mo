package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.f0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lgm0/f0;", "", "Lgm0/h0;", "city", "Lgm0/i0;", "community", "Lgm0/j0;", "county", "Lgm0/a1;", "voivodeship", "", "medicalFacilityName", "<init>", "(Lgm0/h0;Lgm0/i0;Lgm0/j0;Lgm0/a1;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/h0;", "getCity", "()Lgm0/h0;", "b", "Lgm0/i0;", "getCommunity", "()Lgm0/i0;", "c", "Lgm0/j0;", "getCounty", "()Lgm0/j0;", "d", "Lgm0/a1;", "getVoivodeship", "()Lgm0/a1;", "e", "Ljava/lang/String;", "getMedicalFacilityName", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationGenerateXmlChildBirthPlace {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final ChildBirthRegistrationGenerateXmlCityTerytName city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("community")
    private final ChildBirthRegistrationGenerateXmlCommunityTerytName community;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("county")
    private final ChildBirthRegistrationGenerateXmlCountyTerytName county;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("voivodeship")
    private final ChildBirthRegistrationGenerateXmlVoivodeshipTerytName voivodeship;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("medicalFacilityName")
    private final String medicalFacilityName;

    public ChildBirthRegistrationGenerateXmlChildBirthPlace(ChildBirthRegistrationGenerateXmlCityTerytName childBirthRegistrationGenerateXmlCityTerytName, ChildBirthRegistrationGenerateXmlCommunityTerytName childBirthRegistrationGenerateXmlCommunityTerytName, ChildBirthRegistrationGenerateXmlCountyTerytName childBirthRegistrationGenerateXmlCountyTerytName, ChildBirthRegistrationGenerateXmlVoivodeshipTerytName childBirthRegistrationGenerateXmlVoivodeshipTerytName, String str) {
        this.city = childBirthRegistrationGenerateXmlCityTerytName;
        this.community = childBirthRegistrationGenerateXmlCommunityTerytName;
        this.county = childBirthRegistrationGenerateXmlCountyTerytName;
        this.voivodeship = childBirthRegistrationGenerateXmlVoivodeshipTerytName;
        this.medicalFacilityName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationGenerateXmlChildBirthPlace)) {
            return false;
        }
        ChildBirthRegistrationGenerateXmlChildBirthPlace childBirthRegistrationGenerateXmlChildBirthPlace = (ChildBirthRegistrationGenerateXmlChildBirthPlace) other;
        return fr.t.c(this.city, childBirthRegistrationGenerateXmlChildBirthPlace.city) && fr.t.c(this.community, childBirthRegistrationGenerateXmlChildBirthPlace.community) && fr.t.c(this.county, childBirthRegistrationGenerateXmlChildBirthPlace.county) && fr.t.c(this.voivodeship, childBirthRegistrationGenerateXmlChildBirthPlace.voivodeship) && fr.t.c(this.medicalFacilityName, childBirthRegistrationGenerateXmlChildBirthPlace.medicalFacilityName);
    }

    public int hashCode() {
        int iHashCode = ((((((this.city.hashCode() * 31) + this.community.hashCode()) * 31) + this.county.hashCode()) * 31) + this.voivodeship.hashCode()) * 31;
        String str = this.medicalFacilityName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChildBirthRegistrationGenerateXmlChildBirthPlace(city=" + this.city + ", community=" + this.community + ", county=" + this.county + ", voivodeship=" + this.voivodeship + ", medicalFacilityName=" + this.medicalFacilityName + ')';
    }
}
