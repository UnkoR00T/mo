package ca2;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ca2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0018BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u0018\u0010#¨\u0006("}, d2 = {"Lca2/b;", "", "", "id", "", "timestamp", "", "documentType", "", "isAccepted", "workCertId", "verifierId", "purpose", "type", "connectionError", "<init>", "(IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "J", "e", "()J", "Ljava/lang/String;", "d", "Z", "i", "()Z", "h", "f", "g", "j", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationHistoryEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAccepted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String workCertId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String verifierId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String purpose;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean connectionError;

    public VerificationHistoryEntity(int i15, long j15, String str, boolean z15, String str2, String str3, String str4, String str5, boolean z16) {
        this.id = i15;
        this.timestamp = j15;
        this.documentType = str;
        this.isAccepted = z15;
        this.workCertId = str2;
        this.verifierId = str3;
        this.purpose = str4;
        this.type = str5;
        this.connectionError = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getConnectionError() {
        return this.connectionError;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationHistoryEntity)) {
            return false;
        }
        VerificationHistoryEntity verificationHistoryEntity = (VerificationHistoryEntity) other;
        return this.id == verificationHistoryEntity.id && this.timestamp == verificationHistoryEntity.timestamp && t.c(this.documentType, verificationHistoryEntity.documentType) && this.isAccepted == verificationHistoryEntity.isAccepted && t.c(this.workCertId, verificationHistoryEntity.workCertId) && t.c(this.verifierId, verificationHistoryEntity.verifierId) && t.c(this.purpose, verificationHistoryEntity.purpose) && t.c(this.type, verificationHistoryEntity.type) && this.connectionError == verificationHistoryEntity.connectionError;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getVerifierId() {
        return this.verifierId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWorkCertId() {
        return this.workCertId;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.timestamp)) * 31) + this.documentType.hashCode()) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + this.workCertId.hashCode()) * 31) + this.verifierId.hashCode()) * 31) + this.purpose.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.connectionError);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public String toString() {
        return "VerificationHistoryEntity(id=" + this.id + ", timestamp=" + this.timestamp + ", documentType=" + this.documentType + ", isAccepted=" + this.isAccepted + ", workCertId=" + this.workCertId + ", verifierId=" + this.verifierId + ", purpose=" + this.purpose + ", type=" + this.type + ", connectionError=" + this.connectionError + ')';
    }

    public /* synthetic */ VerificationHistoryEntity(int i15, long j15, String str, boolean z15, String str2, String str3, String str4, String str5, boolean z16, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, j15, str, z15, str2, str3, str4, str5, z16);
    }
}
