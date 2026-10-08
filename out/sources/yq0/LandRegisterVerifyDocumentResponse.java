package yq0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006\""}, d2 = {"Lyq0/t;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyq0/u;", "a", "Lyq0/u;", "c", "()Lyq0/u;", "status", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "e", "()Ljava/time/OffsetDateTime;", "verificationDate", "Ljava/lang/String;", "f", "verificationId", "d", "documentCopyId", "number", "Lyq0/j;", "Lyq0/j;", "()Lyq0/j;", "type", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LandRegisterVerifyDocumentResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final u status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationDate")
    private final OffsetDateTime verificationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationId")
    private final String verificationId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentCopyId")
    private final String documentCopyId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final j type;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentCopyId() {
        return this.documentCopyId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OffsetDateTime getVerificationDate() {
        return this.verificationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandRegisterVerifyDocumentResponse)) {
            return false;
        }
        LandRegisterVerifyDocumentResponse landRegisterVerifyDocumentResponse = (LandRegisterVerifyDocumentResponse) other;
        return this.status == landRegisterVerifyDocumentResponse.status && fr.t.c(this.verificationDate, landRegisterVerifyDocumentResponse.verificationDate) && fr.t.c(this.verificationId, landRegisterVerifyDocumentResponse.verificationId) && fr.t.c(this.documentCopyId, landRegisterVerifyDocumentResponse.documentCopyId) && fr.t.c(this.number, landRegisterVerifyDocumentResponse.number) && this.type == landRegisterVerifyDocumentResponse.type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getVerificationId() {
        return this.verificationId;
    }

    public int hashCode() {
        int iHashCode = ((((this.status.hashCode() * 31) + this.verificationDate.hashCode()) * 31) + this.verificationId.hashCode()) * 31;
        String str = this.documentCopyId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.number;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        j jVar = this.type;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public String toString() {
        return "LandRegisterVerifyDocumentResponse(status=" + this.status + ", verificationDate=" + this.verificationDate + ", verificationId=" + this.verificationId + ", documentCopyId=" + this.documentCopyId + ", number=" + this.number + ", type=" + this.type + ')';
    }
}
