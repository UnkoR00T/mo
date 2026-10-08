package f41;

import fr.t;
import p071kotlin.Metadata;
import st3.AddressTerytDetail;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lf41/a;", "", "", "l", "()Z", "Lf41/a$a;", "C7", "()Lf41/a$a;", "data", "Loq/i0;", "W3", "(Lf41/a$a;)V", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: f41.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, d2 = {"Lf41/a$a;", "", "Lst3/l;", "province", "county", "community", "city", "", "territorialCode", "<init>", "(Lst3/l;Lst3/l;Lst3/l;Lst3/l;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/l;", "d", "()Lst3/l;", "b", "c", "e", "Ljava/lang/String;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressTerytDetail province;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressTerytDetail county;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressTerytDetail community;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressTerytDetail city;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String territorialCode;

        public Data(AddressTerytDetail addressTerytDetail, AddressTerytDetail addressTerytDetail2, AddressTerytDetail addressTerytDetail3, AddressTerytDetail addressTerytDetail4, String str) {
            this.province = addressTerytDetail;
            this.county = addressTerytDetail2;
            this.community = addressTerytDetail3;
            this.city = addressTerytDetail4;
            this.territorialCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AddressTerytDetail getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AddressTerytDetail getCommunity() {
            return this.community;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AddressTerytDetail getCounty() {
            return this.county;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AddressTerytDetail getProvince() {
            return this.province;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTerritorialCode() {
            return this.territorialCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.province, data.province) && t.c(this.county, data.county) && t.c(this.community, data.community) && t.c(this.city, data.city) && t.c(this.territorialCode, data.territorialCode);
        }

        public int hashCode() {
            return (((((((this.province.hashCode() * 31) + this.county.hashCode()) * 31) + this.community.hashCode()) * 31) + this.city.hashCode()) * 31) + this.territorialCode.hashCode();
        }

        public String toString() {
            return "Data(province=" + this.province + ", county=" + this.county + ", community=" + this.community + ", city=" + this.city + ", territorialCode=" + this.territorialCode + ')';
        }
    }

    Data C7();

    void W3(Data data);

    boolean l();
}
