package ta0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ta0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lta0/d;", "", "", "documentId", "Lvf0/d;", "documentType", "Lta0/e;", "documentVisibleStatus", "successorDocumentId", "<init>", "(Ljava/lang/String;Lvf0/d;Lta0/e;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lvf0/d;Lta0/e;Ljava/lang/String;)Lta0/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lvf0/d;", "d", "()Lvf0/d;", "Lta0/e;", "e", "()Lta0/e;", "f", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DesktopDocumentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final vf0.d documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e documentVisibleStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String successorDocumentId;

    public DesktopDocumentModel(String str, vf0.d dVar, e eVar, String str2) {
        this.documentId = str;
        this.documentType = dVar;
        this.documentVisibleStatus = eVar;
        this.successorDocumentId = str2;
    }

    public static /* synthetic */ DesktopDocumentModel b(DesktopDocumentModel desktopDocumentModel, String str, vf0.d dVar, e eVar, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = desktopDocumentModel.documentId;
        }
        if ((i15 & 2) != 0) {
            dVar = desktopDocumentModel.documentType;
        }
        if ((i15 & 4) != 0) {
            eVar = desktopDocumentModel.documentVisibleStatus;
        }
        if ((i15 & 8) != 0) {
            str2 = desktopDocumentModel.successorDocumentId;
        }
        return desktopDocumentModel.a(str, dVar, eVar, str2);
    }

    public final DesktopDocumentModel a(String documentId, vf0.d documentType, e documentVisibleStatus, String successorDocumentId) {
        return new DesktopDocumentModel(documentId, documentType, documentVisibleStatus, successorDocumentId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final vf0.d getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getDocumentVisibleStatus() {
        return this.documentVisibleStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesktopDocumentModel)) {
            return false;
        }
        DesktopDocumentModel desktopDocumentModel = (DesktopDocumentModel) other;
        return fr.t.c(this.documentId, desktopDocumentModel.documentId) && this.documentType == desktopDocumentModel.documentType && this.documentVisibleStatus == desktopDocumentModel.documentVisibleStatus && fr.t.c(this.successorDocumentId, desktopDocumentModel.successorDocumentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSuccessorDocumentId() {
        return this.successorDocumentId;
    }

    public int hashCode() {
        int iHashCode = ((((this.documentId.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.documentVisibleStatus.hashCode()) * 31;
        String str = this.successorDocumentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DesktopDocumentModel(documentId=" + this.documentId + ", documentType=" + this.documentType + ", documentVisibleStatus=" + this.documentVisibleStatus + ", successorDocumentId=" + this.successorDocumentId + ')';
    }

    public /* synthetic */ DesktopDocumentModel(String str, vf0.d dVar, e eVar, String str2, int i15, fr.k kVar) {
        this(str, dVar, eVar, (i15 & 8) != 0 ? null : str2);
    }
}
