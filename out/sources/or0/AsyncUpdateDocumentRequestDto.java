package or0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: or0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lor0/h;", "", "Lor0/m0;", "type", "", "documentId", "subtype", "<init>", "(Lor0/m0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor0/m0;", "getType", "()Lor0/m0;", "b", "Ljava/lang/String;", "getDocumentId", "c", "getSubtype", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncUpdateDocumentRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final m0 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentId")
    private final String documentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subtype")
    private final String subtype;

    public AsyncUpdateDocumentRequestDto(m0 m0Var, String str, String str2) {
        this.type = m0Var;
        this.documentId = str;
        this.subtype = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncUpdateDocumentRequestDto)) {
            return false;
        }
        AsyncUpdateDocumentRequestDto asyncUpdateDocumentRequestDto = (AsyncUpdateDocumentRequestDto) other;
        return this.type == asyncUpdateDocumentRequestDto.type && fr.t.c(this.documentId, asyncUpdateDocumentRequestDto.documentId) && fr.t.c(this.subtype, asyncUpdateDocumentRequestDto.subtype);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.documentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtype;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AsyncUpdateDocumentRequestDto(type=" + this.type + ", documentId=" + this.documentId + ", subtype=" + this.subtype + ')';
    }
}
