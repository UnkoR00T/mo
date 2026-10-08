package r54;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: r54.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, d2 = {"Lr54/g;", "", "Ljava/time/LocalDate;", "expirationDate", "Lr54/f;", "vehicleNotificationEventType", "", "registrationNo", "<init>", "(Ljava/time/LocalDate;Lr54/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Lr54/f;", "c", "()Lr54/f;", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleReminderNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f vehicleNotificationEventType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registrationNo;

    public VehicleReminderNotification(LocalDate localDate, f fVar, String str) {
        this.expirationDate = localDate;
        this.vehicleNotificationEventType = fVar;
        this.registrationNo = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRegistrationNo() {
        return this.registrationNo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getVehicleNotificationEventType() {
        return this.vehicleNotificationEventType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleReminderNotification)) {
            return false;
        }
        VehicleReminderNotification vehicleReminderNotification = (VehicleReminderNotification) other;
        return t.c(this.expirationDate, vehicleReminderNotification.expirationDate) && this.vehicleNotificationEventType == vehicleReminderNotification.vehicleNotificationEventType && t.c(this.registrationNo, vehicleReminderNotification.registrationNo);
    }

    public int hashCode() {
        return (((this.expirationDate.hashCode() * 31) + this.vehicleNotificationEventType.hashCode()) * 31) + this.registrationNo.hashCode();
    }

    public String toString() {
        return "VehicleReminderNotification(expirationDate=" + this.expirationDate + ", vehicleNotificationEventType=" + this.vehicleNotificationEventType + ", registrationNo=" + this.registrationNo + ")";
    }
}
