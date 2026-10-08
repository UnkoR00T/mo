package gm0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.x6, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lgm0/x6;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document", "", "Lgm0/c2;", "b", "Ljava/util/List;", "()Ljava/util/List;", "filesInfo", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardXmlApplicationV4Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("document")
    private final String document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("filesInfo")
    private final List<FileInfoDto> filesInfo;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    public final List<FileInfoDto> b() {
        return this.filesInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardXmlApplicationV4Response)) {
            return false;
        }
        PhysicalIdCardXmlApplicationV4Response physicalIdCardXmlApplicationV4Response = (PhysicalIdCardXmlApplicationV4Response) other;
        return fr.t.c(this.document, physicalIdCardXmlApplicationV4Response.document) && fr.t.c(this.filesInfo, physicalIdCardXmlApplicationV4Response.filesInfo);
    }

    public int hashCode() {
        int iHashCode = this.document.hashCode() * 31;
        List<FileInfoDto> list = this.filesInfo;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "PhysicalIdCardXmlApplicationV4Response(document=" + this.document + ", filesInfo=" + this.filesInfo + ')';
    }
}
