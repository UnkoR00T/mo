package th0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\f¨\u0006\u001c"}, d2 = {"Lth0/u;", "", "Lth0/u$a;", "country", "", "serialNumber", "lastName", "givenNames", "cn", "<init>", "(Lth0/u$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/u$a;", "b", "()Lth0/u$a;", "Ljava/lang/String;", "e", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDnMobileApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serialNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String givenNames;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cn;

    /* JADX INFO: renamed from: th0.u$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lth0/u$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        PL,
        UA;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f190318d = wq.b.a(b());
    }

    public UserDnMobileApi(a aVar, String str, String str2, String str3, String str4) {
        this.country = aVar;
        this.serialNumber = str;
        this.lastName = str2;
        this.givenNames = str3;
        this.cn = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCn() {
        return this.cn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGivenNames() {
        return this.givenNames;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDnMobileApi)) {
            return false;
        }
        UserDnMobileApi userDnMobileApi = (UserDnMobileApi) other;
        return this.country == userDnMobileApi.country && fr.t.c(this.serialNumber, userDnMobileApi.serialNumber) && fr.t.c(this.lastName, userDnMobileApi.lastName) && fr.t.c(this.givenNames, userDnMobileApi.givenNames) && fr.t.c(this.cn, userDnMobileApi.cn);
    }

    public int hashCode() {
        a aVar = this.country;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.serialNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.givenNames;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cn;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "UserDnMobileApi(country=" + this.country + ", serialNumber=" + this.serialNumber + ", lastName=" + this.lastName + ", givenNames=" + this.givenNames + ", cn=" + this.cn + ")";
    }
}
