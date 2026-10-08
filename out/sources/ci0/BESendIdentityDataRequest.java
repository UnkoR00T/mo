package ci0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ci0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0018"}, d2 = {"Lci0/a;", "", "", "institutionUrl", "", "cardId", "institutionId", "encryptedData", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "I", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESendIdentityDataRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cardId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int institutionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptedData;

    public BESendIdentityDataRequest(String str, int i15, int i16, String str2) {
        this.institutionUrl = str;
        this.cardId = i15;
        this.institutionId = i16;
        this.encryptedData = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncryptedData() {
        return this.encryptedData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInstitutionUrl() {
        return this.institutionUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESendIdentityDataRequest)) {
            return false;
        }
        BESendIdentityDataRequest bESendIdentityDataRequest = (BESendIdentityDataRequest) other;
        return t.c(this.institutionUrl, bESendIdentityDataRequest.institutionUrl) && this.cardId == bESendIdentityDataRequest.cardId && this.institutionId == bESendIdentityDataRequest.institutionId && t.c(this.encryptedData, bESendIdentityDataRequest.encryptedData);
    }

    public int hashCode() {
        return (((((this.institutionUrl.hashCode() * 31) + Integer.hashCode(this.cardId)) * 31) + Integer.hashCode(this.institutionId)) * 31) + this.encryptedData.hashCode();
    }

    public String toString() {
        return "BESendIdentityDataRequest(institutionUrl=" + this.institutionUrl + ", cardId=" + this.cardId + ", institutionId=" + this.institutionId + ", encryptedData=" + this.encryptedData + ")";
    }
}
