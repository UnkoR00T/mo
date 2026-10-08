package fi0;

import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: renamed from: fi0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lfi0/b;", "", "", "cardId", "institutionId", "", "encryptedData", "<init>", "(IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCardId", "b", "getInstitutionId", "c", "Ljava/lang/String;", "getEncryptedData", "backsystemservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendIdentityRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @c("cardId")
    private final int cardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @c("institutionId")
    private final int institutionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @c("encryptedData")
    private final String encryptedData;

    public SendIdentityRequest(int i15, int i16, String str) {
        this.cardId = i15;
        this.institutionId = i16;
        this.encryptedData = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendIdentityRequest)) {
            return false;
        }
        SendIdentityRequest sendIdentityRequest = (SendIdentityRequest) other;
        return this.cardId == sendIdentityRequest.cardId && this.institutionId == sendIdentityRequest.institutionId && t.c(this.encryptedData, sendIdentityRequest.encryptedData);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.cardId) * 31) + Integer.hashCode(this.institutionId)) * 31) + this.encryptedData.hashCode();
    }

    public String toString() {
        return "SendIdentityRequest(cardId=" + this.cardId + ", institutionId=" + this.institutionId + ", encryptedData=" + this.encryptedData + ')';
    }
}
