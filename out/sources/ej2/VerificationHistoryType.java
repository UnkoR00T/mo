package ej2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ej2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lej2/b;", "", "", "timestamp", "Lrq0/b;", "documentType", "", "isAccepted", "connectionError", "<init>", "(JLrq0/b;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Lrq0/b;", "()Lrq0/b;", "Z", "d", "()Z", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationHistoryType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAccepted;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean connectionError;

    public VerificationHistoryType(long j15, rq0.b bVar, boolean z15, boolean z16) {
        this.timestamp = j15;
        this.documentType = bVar;
        this.isAccepted = z15;
        this.connectionError = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getConnectionError() {
        return this.connectionError;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rq0.b getDocumentType() {
        return this.documentType;
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
        if (!(other instanceof VerificationHistoryType)) {
            return false;
        }
        VerificationHistoryType verificationHistoryType = (VerificationHistoryType) other;
        return this.timestamp == verificationHistoryType.timestamp && t.c(this.documentType, verificationHistoryType.documentType) && this.isAccepted == verificationHistoryType.isAccepted && this.connectionError == verificationHistoryType.connectionError;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.timestamp) * 31) + this.documentType.hashCode()) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + Boolean.hashCode(this.connectionError);
    }

    public String toString() {
        return "VerificationHistoryType(timestamp=" + this.timestamp + ", documentType=" + this.documentType + ", isAccepted=" + this.isAccepted + ", connectionError=" + this.connectionError + ')';
    }
}
