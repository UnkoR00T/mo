package v93;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: v93.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lv93/c;", "", "", "isoCode", "name", "", "isSubscribed", "Lv93/m;", "warningLevel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLv93/m;)V", "a", "(Ljava/lang/String;Ljava/lang/String;ZLv93/m;)Lv93/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "Z", "f", "()Z", "Lv93/m;", "e", "()Lv93/m;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Country {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscribed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final WarningLevel warningLevel;

    public Country(String str, String str2, boolean z15, WarningLevel mVar) {
        this.isoCode = str;
        this.name = str2;
        this.isSubscribed = z15;
        this.warningLevel = mVar;
    }

    public static /* synthetic */ Country b(Country country, String str, String str2, boolean z15, WarningLevel mVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = country.isoCode;
        }
        if ((i15 & 2) != 0) {
            str2 = country.name;
        }
        if ((i15 & 4) != 0) {
            z15 = country.isSubscribed;
        }
        if ((i15 & 8) != 0) {
            mVar = country.warningLevel;
        }
        return country.a(str, str2, z15, mVar);
    }

    public final Country a(String isoCode, String name, boolean isSubscribed, WarningLevel warningLevel) {
        return new Country(isoCode, name, isSubscribed, warningLevel);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final WarningLevel getWarningLevel() {
        return this.warningLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return t.c(this.isoCode, country.isoCode) && t.c(this.name, country.name) && this.isSubscribed == country.isSubscribed && t.c(this.warningLevel, country.warningLevel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public int hashCode() {
        return (((((this.isoCode.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSubscribed)) * 31) + this.warningLevel.hashCode();
    }

    public String toString() {
        return "Country(isoCode=" + this.isoCode + ", name=" + this.name + ", isSubscribed=" + this.isSubscribed + ", warningLevel=" + this.warningLevel + ')';
    }
}
