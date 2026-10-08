package y92;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y92.h, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Ly92/h;", "", "", "timestamp", "", "description", "", "isAccepted", "connectionError", "<init>", "(JLjava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "Z", "d", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationHistoryModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAccepted;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean connectionError;

    public VerificationHistoryModel(long j15, String str, boolean z15, boolean z16) {
        this.timestamp = j15;
        this.description = str;
        this.isAccepted = z15;
        this.connectionError = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getConnectionError() {
        return this.connectionError;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationHistoryModel)) {
            return false;
        }
        VerificationHistoryModel verificationHistoryModel = (VerificationHistoryModel) other;
        return this.timestamp == verificationHistoryModel.timestamp && t.c(this.description, verificationHistoryModel.description) && this.isAccepted == verificationHistoryModel.isAccepted && this.connectionError == verificationHistoryModel.connectionError;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.timestamp) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + Boolean.hashCode(this.connectionError);
    }

    public String toString() {
        return "VerificationHistoryModel(timestamp=" + this.timestamp + ", description=" + this.description + ", isAccepted=" + this.isAccepted + ", connectionError=" + this.connectionError + ")";
    }
}
