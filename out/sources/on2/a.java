package on2;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lon2/a;", "", "Lon2/a$a;", "c", "()Lon2/a$a;", "Loq/i0;", "t", "()V", "a", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: on2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lon2/a$a;", "", "", "", "maliciousWebsites", "issueDescription", "Lkm2/a$a;", "contactData", "<init>", "(Ljava/util/List;Ljava/lang/String;Lkm2/a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "Lkm2/a$a;", "()Lkm2/a$a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SummaryData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> maliciousWebsites;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String issueDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final km2.a.ContactData contactData;

        public SummaryData(List<String> list, String str, km2.a.ContactData contactData) {
            this.maliciousWebsites = list;
            this.issueDescription = str;
            this.contactData = contactData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final km2.a.ContactData getContactData() {
            return this.contactData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIssueDescription() {
            return this.issueDescription;
        }

        public final List<String> c() {
            return this.maliciousWebsites;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryData)) {
                return false;
            }
            SummaryData summaryData = (SummaryData) other;
            return t.c(this.maliciousWebsites, summaryData.maliciousWebsites) && t.c(this.issueDescription, summaryData.issueDescription) && t.c(this.contactData, summaryData.contactData);
        }

        public int hashCode() {
            return (((this.maliciousWebsites.hashCode() * 31) + this.issueDescription.hashCode()) * 31) + this.contactData.hashCode();
        }

        public String toString() {
            return "SummaryData(maliciousWebsites=" + this.maliciousWebsites + ", issueDescription=" + this.issueDescription + ", contactData=" + this.contactData + ')';
        }
    }

    SummaryData c();

    void t();
}
