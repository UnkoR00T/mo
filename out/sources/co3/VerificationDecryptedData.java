package co3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: co3.r, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e¨\u0006 "}, d2 = {"Lco3/r;", "", "", "scope", "", "citizenData", "", "verificationDateTime", "picture", "pictureData", "schema", "<init>", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "J", "e", "()J", "getPictureData", "f", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationDecryptedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String citizenData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long verificationDateTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String picture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pictureData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schema;

    public VerificationDecryptedData(int i15, String str, long j15, String str2, String str3, String str4) {
        this.scope = i15;
        this.citizenData = str;
        this.verificationDateTime = j15;
        this.picture = str2;
        this.pictureData = str3;
        this.schema = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCitizenData() {
        return this.citizenData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSchema() {
        return this.schema;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getVerificationDateTime() {
        return this.verificationDateTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationDecryptedData)) {
            return false;
        }
        VerificationDecryptedData verificationDecryptedData = (VerificationDecryptedData) other;
        return this.scope == verificationDecryptedData.scope && fr.t.c(this.citizenData, verificationDecryptedData.citizenData) && this.verificationDateTime == verificationDecryptedData.verificationDateTime && fr.t.c(this.picture, verificationDecryptedData.picture) && fr.t.c(this.pictureData, verificationDecryptedData.pictureData) && fr.t.c(this.schema, verificationDecryptedData.schema);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.scope) * 31) + this.citizenData.hashCode()) * 31) + Long.hashCode(this.verificationDateTime)) * 31;
        String str = this.picture;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pictureData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "VerificationDecryptedData(scope=" + this.scope + ", citizenData=" + this.citizenData + ", verificationDateTime=" + this.verificationDateTime + ", picture=" + this.picture + ", pictureData=" + this.pictureData + ", schema=" + this.schema + ')';
    }
}
