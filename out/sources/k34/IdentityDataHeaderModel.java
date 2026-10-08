package k34;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.t, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b!\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010¨\u0006#"}, d2 = {"Lk34/t;", "", "", "dn", "sn", "issuer", "", "timestamp", "requestId", "dataRequester", "", "dataType", "internalDocumentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "g", "e", "d", "J", "h", "()J", "f", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdentityDataHeaderModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String requestId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataRequester;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dataType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String internalDocumentId;

    public IdentityDataHeaderModel(String str, String str2, String str3, long j15, String str4, String str5, int i15, String str6) {
        this.dn = str;
        this.sn = str2;
        this.issuer = str3;
        this.timestamp = j15;
        this.requestId = str4;
        this.dataRequester = str5;
        this.dataType = i15;
        this.internalDocumentId = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataRequester() {
        return this.dataRequester;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDn() {
        return this.dn;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInternalDocumentId() {
        return this.internalDocumentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityDataHeaderModel)) {
            return false;
        }
        IdentityDataHeaderModel identityDataHeaderModel = (IdentityDataHeaderModel) other;
        return fr.t.c(this.dn, identityDataHeaderModel.dn) && fr.t.c(this.sn, identityDataHeaderModel.sn) && fr.t.c(this.issuer, identityDataHeaderModel.issuer) && this.timestamp == identityDataHeaderModel.timestamp && fr.t.c(this.requestId, identityDataHeaderModel.requestId) && fr.t.c(this.dataRequester, identityDataHeaderModel.dataRequester) && this.dataType == identityDataHeaderModel.dataType && fr.t.c(this.internalDocumentId, identityDataHeaderModel.internalDocumentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.dn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sn;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuer;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31;
        String str4 = this.requestId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataRequester;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.dataType)) * 31;
        String str6 = this.internalDocumentId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "IdentityDataHeaderModel(dn=" + this.dn + ", sn=" + this.sn + ", issuer=" + this.issuer + ", timestamp=" + this.timestamp + ", requestId=" + this.requestId + ", dataRequester=" + this.dataRequester + ", dataType=" + this.dataType + ", internalDocumentId=" + this.internalDocumentId + ")";
    }
}
