package fg1;

import java.util.List;
import ld1.CompanyApplicationCitizenData;
import ma1.CompanyCategory;
import p071kotlin.Metadata;
import qg1.CompanySuspensionWizardData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lfg1/m;", "", "a", "c", "b", "Lfg1/m$a;", "Lfg1/m$b;", "Lfg1/m$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m {

    /* JADX INFO: renamed from: fg1.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfg1/m$a;", "Lfg1/m;", "Lqg1/a;", "data", "<init>", "(Lqg1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqg1/a;", "()Lqg1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanySuspensionWizardData data;

        public Initialized(CompanySuspensionWizardData companySuspensionWizardData) {
            this.data = companySuspensionWizardData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CompanySuspensionWizardData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.data, ((Initialized) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Initialized(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: fg1.m$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfg1/m$b;", "Lfg1/m;", "", "Lma1/c;", "pkdCodes", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pkd implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CompanyCategory> pkdCodes;

        public Pkd(List<CompanyCategory> list) {
            this.pkdCodes = list;
        }

        public final List<CompanyCategory> a() {
            return this.pkdCodes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pkd) && fr.t.c(this.pkdCodes, ((Pkd) other).pkdCodes);
        }

        public int hashCode() {
            List<CompanyCategory> list = this.pkdCodes;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Pkd(pkdCodes=" + this.pkdCodes + ')';
        }
    }

    /* JADX INFO: renamed from: fg1.m$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lfg1/m$c;", "Lfg1/m;", "Lld1/e;", "citizenData", "", "mIdCardNumber", "<init>", "(Lld1/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lld1/e;", "()Lld1/e;", "b", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserData implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanyApplicationCitizenData citizenData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mIdCardNumber;

        public UserData(CompanyApplicationCitizenData companyApplicationCitizenData, String str) {
            this.citizenData = companyApplicationCitizenData;
            this.mIdCardNumber = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CompanyApplicationCitizenData getCitizenData() {
            return this.citizenData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMIdCardNumber() {
            return this.mIdCardNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserData)) {
                return false;
            }
            UserData userData = (UserData) other;
            return fr.t.c(this.citizenData, userData.citizenData) && fr.t.c(this.mIdCardNumber, userData.mIdCardNumber);
        }

        public int hashCode() {
            return (this.citizenData.hashCode() * 31) + this.mIdCardNumber.hashCode();
        }

        public String toString() {
            return "UserData(citizenData=" + this.citizenData + ", mIdCardNumber=" + this.mIdCardNumber + ')';
        }
    }
}
