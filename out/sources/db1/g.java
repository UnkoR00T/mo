package db1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ldb1/g;", "", "b", "a", "Ldb1/g$a;", "Ldb1/g$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: db1.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, d2 = {"Ldb1/g$a;", "Ldb1/g;", "Lma1/j;", "companyInfoStatus", "", "ceidgUrl", "<init>", "(Lma1/j;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lma1/j;", "b", "()Lma1/j;", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WelcomePageDataInformationInitialized implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ma1.j companyInfoStatus;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ceidgUrl;

        public WelcomePageDataInformationInitialized(ma1.j jVar, String str) {
            this.companyInfoStatus = jVar;
            this.ceidgUrl = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCeidgUrl() {
            return this.ceidgUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ma1.j getCompanyInfoStatus() {
            return this.companyInfoStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WelcomePageDataInformationInitialized)) {
                return false;
            }
            WelcomePageDataInformationInitialized welcomePageDataInformationInitialized = (WelcomePageDataInformationInitialized) other;
            return this.companyInfoStatus == welcomePageDataInformationInitialized.companyInfoStatus && fr.t.c(this.ceidgUrl, welcomePageDataInformationInitialized.ceidgUrl);
        }

        public int hashCode() {
            return (this.companyInfoStatus.hashCode() * 31) + this.ceidgUrl.hashCode();
        }

        public String toString() {
            return "WelcomePageDataInformationInitialized(companyInfoStatus=" + this.companyInfoStatus + ", ceidgUrl=" + this.ceidgUrl + ')';
        }
    }

    /* JADX INFO: renamed from: db1.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, d2 = {"Ldb1/g$b;", "Ldb1/g;", "Lma1/j;", "companyInfoStatus", "", "ceidgUrl", "<init>", "(Lma1/j;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lma1/j;", "b", "()Lma1/j;", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WelcomePageInitialized implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ma1.j companyInfoStatus;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ceidgUrl;

        public WelcomePageInitialized(ma1.j jVar, String str) {
            this.companyInfoStatus = jVar;
            this.ceidgUrl = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCeidgUrl() {
            return this.ceidgUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ma1.j getCompanyInfoStatus() {
            return this.companyInfoStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WelcomePageInitialized)) {
                return false;
            }
            WelcomePageInitialized welcomePageInitialized = (WelcomePageInitialized) other;
            return this.companyInfoStatus == welcomePageInitialized.companyInfoStatus && fr.t.c(this.ceidgUrl, welcomePageInitialized.ceidgUrl);
        }

        public int hashCode() {
            return (this.companyInfoStatus.hashCode() * 31) + this.ceidgUrl.hashCode();
        }

        public String toString() {
            return "WelcomePageInitialized(companyInfoStatus=" + this.companyInfoStatus + ", ceidgUrl=" + this.ceidgUrl + ')';
        }
    }
}
