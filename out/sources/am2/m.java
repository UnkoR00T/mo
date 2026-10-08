package am2;

import fr.t;
import i50.BaseScaffoldData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lam2/m;", "Ll00/e;", "Lam2/m$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m extends l00.e<Data> {

    /* JADX INFO: renamed from: am2.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, d2 = {"Lam2/m$a;", "", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Ln50/g;", "reportIssueButtonData", "knowledgeBaseButtonData", "Lc30/b;", "alertData", "<init>", "(Li50/a;Lo40/a;Ln50/g;Ln50/g;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lo40/a;", "c", "()Lo40/a;", "Ln50/g;", "e", "()Ln50/g;", "d", "Lc30/b;", "()Lc30/b;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData reportIssueButtonData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData knowledgeBaseButtonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b alertData;

        public Data(BaseScaffoldData baseScaffoldData, o40.a aVar, DefaultSingleCardData defaultSingleCardData, DefaultSingleCardData defaultSingleCardData2, c30.b bVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.headerData = aVar;
            this.reportIssueButtonData = defaultSingleCardData;
            this.knowledgeBaseButtonData = defaultSingleCardData2;
            this.alertData = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DefaultSingleCardData getKnowledgeBaseButtonData() {
            return this.knowledgeBaseButtonData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DefaultSingleCardData getReportIssueButtonData() {
            return this.reportIssueButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.headerData, data.headerData) && t.c(this.reportIssueButtonData, data.reportIssueButtonData) && t.c(this.knowledgeBaseButtonData, data.knowledgeBaseButtonData) && t.c(this.alertData, data.alertData);
        }

        public int hashCode() {
            int iHashCode = ((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.reportIssueButtonData.hashCode()) * 31;
            DefaultSingleCardData defaultSingleCardData = this.knowledgeBaseButtonData;
            int iHashCode2 = (iHashCode + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31;
            c30.b bVar = this.alertData;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", reportIssueButtonData=" + this.reportIssueButtonData + ", knowledgeBaseButtonData=" + this.knowledgeBaseButtonData + ", alertData=" + this.alertData + ')';
        }
    }

    oz.j a();
}
