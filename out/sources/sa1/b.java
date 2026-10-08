package sa1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lsa1/b;", "", "a", "c", "b", "g", "f", "d", "e", "Lsa1/b$a;", "Lsa1/b$b;", "Lsa1/b$c;", "Lsa1/b$d;", "Lsa1/b$e;", "Lsa1/b$f;", "Lsa1/b$g;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsa1/b$a;", "Lsa1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f179605a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 611857788;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: sa1.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsa1/b$c;", "Lsa1/b;", "", "ceidgUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoData implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ceidgUrl;

        public NoData(String str) {
            this.ceidgUrl = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCeidgUrl() {
            return this.ceidgUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoData) && fr.t.c(this.ceidgUrl, ((NoData) other).ceidgUrl);
        }

        public int hashCode() {
            return this.ceidgUrl.hashCode();
        }

        public String toString() {
            return "NoData(ceidgUrl=" + this.ceidgUrl + ')';
        }
    }

    /* JADX INFO: renamed from: sa1.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lsa1/b$d;", "Lsa1/b;", "", "title", "applicationNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenCompanyPendingStatus implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String applicationNumber;

        public OpenCompanyPendingStatus(String str, String str2) {
            this.title = str;
            this.applicationNumber = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApplicationNumber() {
            return this.applicationNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenCompanyPendingStatus)) {
                return false;
            }
            OpenCompanyPendingStatus openCompanyPendingStatus = (OpenCompanyPendingStatus) other;
            return fr.t.c(this.title, openCompanyPendingStatus.title) && fr.t.c(this.applicationNumber, openCompanyPendingStatus.applicationNumber);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.applicationNumber;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "OpenCompanyPendingStatus(title=" + this.title + ", applicationNumber=" + this.applicationNumber + ')';
        }
    }

    /* JADX INFO: renamed from: sa1.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lsa1/b$e;", "Lsa1/b;", "", "title", "rejectedReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenCompanyRejectedStatus implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rejectedReason;

        public OpenCompanyRejectedStatus(String str, String str2) {
            this.title = str;
            this.rejectedReason = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRejectedReason() {
            return this.rejectedReason;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenCompanyRejectedStatus)) {
                return false;
            }
            OpenCompanyRejectedStatus openCompanyRejectedStatus = (OpenCompanyRejectedStatus) other;
            return fr.t.c(this.title, openCompanyRejectedStatus.title) && fr.t.c(this.rejectedReason, openCompanyRejectedStatus.rejectedReason);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.rejectedReason;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "OpenCompanyRejectedStatus(title=" + this.title + ", rejectedReason=" + this.rejectedReason + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsa1/b$f;", "Lsa1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f179616a = new f();

        private f() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return 2105811536;
        }

        public String toString() {
            return "UpdateRequired";
        }
    }

    /* JADX INFO: renamed from: sa1.b$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsa1/b$g;", "Lsa1/b;", "Lma1/j;", "status", "<init>", "(Lma1/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lma1/j;", "()Lma1/j;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WorkInProgressNewApplication implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ma1.j status;

        public WorkInProgressNewApplication(ma1.j jVar) {
            this.status = jVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ma1.j getStatus() {
            return this.status;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WorkInProgressNewApplication) && this.status == ((WorkInProgressNewApplication) other).status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "WorkInProgressNewApplication(status=" + this.status + ')';
        }
    }

    /* JADX INFO: renamed from: sa1.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lsa1/b$b;", "Lsa1/b;", "Lma1/f;", "companyDetails", "", "", "hiddenAlertMessages", "ceidgUrl", "", "isSuspensionCompanyFlagOn", "isRepresentativesFeatureFlagOn", "<init>", "(Lma1/f;Ljava/util/List;Ljava/lang/String;ZZ)V", "a", "(Lma1/f;Ljava/util/List;Ljava/lang/String;ZZ)Lsa1/b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lma1/f;", "d", "()Lma1/f;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Ljava/lang/String;", "Z", "g", "()Z", "f", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ma1.f companyDetails;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> hiddenAlertMessages;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ceidgUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSuspensionCompanyFlagOn;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRepresentativesFeatureFlagOn;

        public Initialized(ma1.f fVar, List<String> list, String str, boolean z15, boolean z16) {
            this.companyDetails = fVar;
            this.hiddenAlertMessages = list;
            this.ceidgUrl = str;
            this.isSuspensionCompanyFlagOn = z15;
            this.isRepresentativesFeatureFlagOn = z16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, ma1.f fVar, List list, String str, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                fVar = initialized.companyDetails;
            }
            if ((i15 & 2) != 0) {
                list = initialized.hiddenAlertMessages;
            }
            if ((i15 & 4) != 0) {
                str = initialized.ceidgUrl;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.isSuspensionCompanyFlagOn;
            }
            if ((i15 & 16) != 0) {
                z16 = initialized.isRepresentativesFeatureFlagOn;
            }
            boolean z17 = z16;
            String str2 = str;
            return initialized.a(fVar, list, str2, z15, z17);
        }

        public final Initialized a(ma1.f companyDetails, List<String> hiddenAlertMessages, String ceidgUrl, boolean isSuspensionCompanyFlagOn, boolean isRepresentativesFeatureFlagOn) {
            return new Initialized(companyDetails, hiddenAlertMessages, ceidgUrl, isSuspensionCompanyFlagOn, isRepresentativesFeatureFlagOn);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCeidgUrl() {
            return this.ceidgUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ma1.f getCompanyDetails() {
            return this.companyDetails;
        }

        public final List<String> e() {
            return this.hiddenAlertMessages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.companyDetails, initialized.companyDetails) && fr.t.c(this.hiddenAlertMessages, initialized.hiddenAlertMessages) && fr.t.c(this.ceidgUrl, initialized.ceidgUrl) && this.isSuspensionCompanyFlagOn == initialized.isSuspensionCompanyFlagOn && this.isRepresentativesFeatureFlagOn == initialized.isRepresentativesFeatureFlagOn;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsRepresentativesFeatureFlagOn() {
            return this.isRepresentativesFeatureFlagOn;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsSuspensionCompanyFlagOn() {
            return this.isSuspensionCompanyFlagOn;
        }

        public int hashCode() {
            return (((((((this.companyDetails.hashCode() * 31) + this.hiddenAlertMessages.hashCode()) * 31) + this.ceidgUrl.hashCode()) * 31) + Boolean.hashCode(this.isSuspensionCompanyFlagOn)) * 31) + Boolean.hashCode(this.isRepresentativesFeatureFlagOn);
        }

        public String toString() {
            return "Initialized(companyDetails=" + this.companyDetails + ", hiddenAlertMessages=" + this.hiddenAlertMessages + ", ceidgUrl=" + this.ceidgUrl + ", isSuspensionCompanyFlagOn=" + this.isSuspensionCompanyFlagOn + ", isRepresentativesFeatureFlagOn=" + this.isRepresentativesFeatureFlagOn + ')';
        }

        public /* synthetic */ Initialized(ma1.f fVar, List list, String str, boolean z15, boolean z16, int i15, fr.k kVar) {
            this(fVar, (i15 & 2) != 0 ? pq.v.n() : list, str, z15, z16);
        }
    }
}
