package zu0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lzu0/i;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "isoCode", "b", "name", "c", "Z", "()Z", "subscribed", "Lzu0/d0;", "d", "Lzu0/d0;", "()Lzu0/d0;", "warningLevel", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isoCode")
    private final String isoCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subscribed")
    private final boolean subscribed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("warningLevel")
    private final WarningLevelDto warningLevel;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSubscribed() {
        return this.subscribed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final WarningLevelDto getWarningLevel() {
        return this.warningLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryDto)) {
            return false;
        }
        CountryDto countryDto = (CountryDto) other;
        return fr.t.c(this.isoCode, countryDto.isoCode) && fr.t.c(this.name, countryDto.name) && this.subscribed == countryDto.subscribed && fr.t.c(this.warningLevel, countryDto.warningLevel);
    }

    public int hashCode() {
        return (((((this.isoCode.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.subscribed)) * 31) + this.warningLevel.hashCode();
    }

    public String toString() {
        return "CountryDto(isoCode=" + this.isoCode + ", name=" + this.name + ", subscribed=" + this.subscribed + ", warningLevel=" + this.warningLevel + ')';
    }
}
