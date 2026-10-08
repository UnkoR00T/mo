package y54;

import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y54.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Ly54/b;", "", "", "id", "", "configId", "documentType", "documentSubType", "Ljava/time/LocalDate;", "expirationDate", "notificationDate", "Lr54/e;", "status", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/lang/String;", "c", "d", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "f", "g", "Lr54/e;", "()Lr54/e;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalDocumentNotificationEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String configId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentSubType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate notificationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final r54.e status;

    public LocalDocumentNotificationEntity(long j15, String str, String str2, String str3, LocalDate localDate, LocalDate localDate2, r54.e eVar) {
        this.id = j15;
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
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalDocumentNotificationEntity)) {
            return false;
        }
        LocalDocumentNotificationEntity localDocumentNotificationEntity = (LocalDocumentNotificationEntity) other;
        return this.id == localDocumentNotificationEntity.id && t.c(this.configId, localDocumentNotificationEntity.configId) && t.c(this.documentType, localDocumentNotificationEntity.documentType) && t.c(this.documentSubType, localDocumentNotificationEntity.documentSubType) && t.c(this.expirationDate, localDocumentNotificationEntity.expirationDate) && t.c(this.notificationDate, localDocumentNotificationEntity.notificationDate) && this.status == localDocumentNotificationEntity.status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getNotificationDate() {
        return this.notificationDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final r54.e getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + this.configId.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.documentSubType.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.notificationDate.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LocalDocumentNotificationEntity(id=" + this.id + ", configId=" + this.configId + ", documentType=" + this.documentType + ", documentSubType=" + this.documentSubType + ", expirationDate=" + this.expirationDate + ", notificationDate=" + this.notificationDate + ", status=" + this.status + ')';
    }

    public /* synthetic */ LocalDocumentNotificationEntity(long j15, String str, String str2, String str3, LocalDate localDate, LocalDate localDate2, r54.e eVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? 0L : j15, str, str2, str3, localDate, localDate2, eVar);
    }
}
