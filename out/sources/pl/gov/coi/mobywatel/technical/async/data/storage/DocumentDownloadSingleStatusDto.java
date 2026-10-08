package pl.gov.coi.mobywatel.technical.async.data.storage;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.async.data.storage.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpl/gov/coi/mobywatel/technical/async/data/storage/b;", "", "", "documentType", "documentIID", "Llz3/h;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llz3/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Llz3/h;", "()Llz3/h;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class DocumentDownloadSingleStatusDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentType")
    private final String documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentIID")
    private final String documentIID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final lz3.h status;

    public DocumentDownloadSingleStatusDto(String str, String str2, lz3.h hVar) {
        this.documentType = str;
        this.documentIID = str2;
        this.status = hVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentIID() {
        return this.documentIID;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final lz3.h getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentDownloadSingleStatusDto)) {
            return false;
        }
        DocumentDownloadSingleStatusDto documentDownloadSingleStatusDto = (DocumentDownloadSingleStatusDto) other;
        return t.c(this.documentType, documentDownloadSingleStatusDto.documentType) && t.c(this.documentIID, documentDownloadSingleStatusDto.documentIID) && this.status == documentDownloadSingleStatusDto.status;
    }

    public int hashCode() {
        return (((this.documentType.hashCode() * 31) + this.documentIID.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "DocumentDownloadSingleStatusDto(documentType=" + this.documentType + ", documentIID=" + this.documentIID + ", status=" + this.status + ')';
    }
}
