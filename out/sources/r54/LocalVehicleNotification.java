package r54;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: r54.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lr54/d;", "", "", "reminderId", "configId", "documentType", "registerNo", "Ljava/time/LocalDate;", "expirationDate", "notificationDate", "Lr54/e;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "d", "e", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "g", "Lr54/e;", "()Lr54/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalVehicleNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reminderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String configId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registerNo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate notificationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final e status;

    public LocalVehicleNotification(String str, String str2, String str3, String str4, LocalDate localDate, LocalDate localDate2, e eVar) {
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
    public final LocalDate getNotificationDate() {
        return this.notificationDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRegisterNo() {
        return this.registerNo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalVehicleNotification)) {
            return false;
        }
        LocalVehicleNotification localVehicleNotification = (LocalVehicleNotification) other;
        return t.c(this.reminderId, localVehicleNotification.reminderId) && t.c(this.configId, localVehicleNotification.configId) && t.c(this.documentType, localVehicleNotification.documentType) && t.c(this.registerNo, localVehicleNotification.registerNo) && t.c(this.expirationDate, localVehicleNotification.expirationDate) && t.c(this.notificationDate, localVehicleNotification.notificationDate) && this.status == localVehicleNotification.status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReminderId() {
        return this.reminderId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((this.reminderId.hashCode() * 31) + this.configId.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.registerNo.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.notificationDate.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LocalVehicleNotification(reminderId=" + this.reminderId + ", configId=" + this.configId + ", documentType=" + this.documentType + ", registerNo=" + this.registerNo + ", expirationDate=" + this.expirationDate + ", notificationDate=" + this.notificationDate + ", status=" + this.status + ")";
    }
}
