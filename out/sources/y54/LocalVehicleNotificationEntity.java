package y54;

import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y54.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010$R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Ly54/c;", "", "", "id", "", "reminderId", "configId", "documentType", "registerNo", "Ljava/time/LocalDate;", "expirationDate", "notificationDate", "Lr54/e;", "status", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "Ljava/lang/String;", "g", "c", "e", "f", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "h", "Lr54/e;", "()Lr54/e;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalVehicleNotificationEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reminderId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String configId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registerNo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate notificationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final r54.e status;

    public LocalVehicleNotificationEntity(long j15, String str, String str2, String str3, String str4, LocalDate localDate, LocalDate localDate2, r54.e eVar) {
        this.id = j15;
        this.reminderId = str;
        this.configId = str2;
        this.documentType = str3;
        this.registerNo = str4;
        this.expirationDate = localDate;
        this.notificationDate = localDate2;
        this.status = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getNotificationDate() {
        return this.notificationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalVehicleNotificationEntity)) {
            return false;
        }
        LocalVehicleNotificationEntity localVehicleNotificationEntity = (LocalVehicleNotificationEntity) other;
        return this.id == localVehicleNotificationEntity.id && t.c(this.reminderId, localVehicleNotificationEntity.reminderId) && t.c(this.configId, localVehicleNotificationEntity.configId) && t.c(this.documentType, localVehicleNotificationEntity.documentType) && t.c(this.registerNo, localVehicleNotificationEntity.registerNo) && t.c(this.expirationDate, localVehicleNotificationEntity.expirationDate) && t.c(this.notificationDate, localVehicleNotificationEntity.notificationDate) && this.status == localVehicleNotificationEntity.status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRegisterNo() {
        return this.registerNo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReminderId() {
        return this.reminderId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final r54.e getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + this.reminderId.hashCode()) * 31) + this.configId.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.registerNo.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.notificationDate.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LocalVehicleNotificationEntity(id=" + this.id + ", reminderId=" + this.reminderId + ", configId=" + this.configId + ", documentType=" + this.documentType + ", registerNo=" + this.registerNo + ", expirationDate=" + this.expirationDate + ", notificationDate=" + this.notificationDate + ", status=" + this.status + ')';
    }

    public /* synthetic */ LocalVehicleNotificationEntity(long j15, String str, String str2, String str3, String str4, LocalDate localDate, LocalDate localDate2, r54.e eVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? 0L : j15, str, str2, str3, str4, localDate, localDate2, eVar);
    }
}
