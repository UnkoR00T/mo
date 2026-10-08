package r54;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: r54.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lr54/a;", "", "", "configId", "documentType", "documentSubType", "Ljava/time/LocalDate;", "expirationDate", "notificationDate", "Lr54/e;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "e", "f", "Lr54/e;", "()Lr54/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalDocumentNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String configId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentSubType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate notificationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final e status;

    public LocalDocumentNotification(String str, String str2, String str3, LocalDate localDate, LocalDate localDate2, e eVar) {
        this.configId = str;
        this.documentType = str2;
        this.documentSubType = str3;
        this.expirationDate = localDate;
        this.notificationDate = localDate2;
        this.status = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentSubType() {
        return this.documentSubType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getNotificationDate() {
        return this.notificationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalDocumentNotification)) {
            return false;
        }
        LocalDocumentNotification localDocumentNotification = (LocalDocumentNotification) other;
        return t.c(this.configId, localDocumentNotification.configId) && t.c(this.documentType, localDocumentNotification.documentType) && t.c(this.documentSubType, localDocumentNotification.documentSubType) && t.c(this.expirationDate, localDocumentNotification.expirationDate) && t.c(this.notificationDate, localDocumentNotification.notificationDate) && this.status == localDocumentNotification.status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((this.configId.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.documentSubType.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.notificationDate.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LocalDocumentNotification(configId=" + this.configId + ", documentType=" + this.documentType + ", documentSubType=" + this.documentSubType + ", expirationDate=" + this.expirationDate + ", notificationDate=" + this.notificationDate + ", status=" + this.status + ")";
    }
}
