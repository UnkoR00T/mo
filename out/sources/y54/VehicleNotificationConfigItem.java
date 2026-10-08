package y54;

import fr.t;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y54.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Ly54/g;", "Ly54/d;", "Lrq0/b;", "documentType", "Ly54/f;", "reminderPeriod", "", "title", "message", "Lr54/f;", "vehicleNotificationEventType", "<init>", "(Lrq0/b;Ly54/f;IILr54/f;)V", "", "c", "()Ljava/lang/String;", "id", "b", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "g", "()Lrq0/b;", "Ly54/f;", "d", "()Ly54/f;", "I", "getTitle", "e", "Lr54/f;", "getVehicleNotificationEventType", "()Lr54/f;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleNotificationConfigItem implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f reminderPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final r54.f vehicleNotificationEventType;

    public VehicleNotificationConfigItem(rq0.b bVar, f fVar, int i15, int i16, r54.f fVar2) {
        this.documentType = bVar;
        this.reminderPeriod = fVar;
        this.title = i15;
        this.message = i16;
        this.vehicleNotificationEventType = fVar2;
    }

    @Override // y54.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getMessage() {
        return this.message;
    }

    public final String b(String id5) {
        return (c() + id5).toUpperCase(Locale.ROOT);
    }

    public String c() {
        return this.vehicleNotificationEventType.getUniqueId() + getReminderPeriod().getUniqueId() + getReminderPeriod().getDays();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public f getReminderPeriod() {
        return this.reminderPeriod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleNotificationConfigItem)) {
            return false;
        }
        VehicleNotificationConfigItem vehicleNotificationConfigItem = (VehicleNotificationConfigItem) other;
        return t.c(this.documentType, vehicleNotificationConfigItem.documentType) && t.c(this.reminderPeriod, vehicleNotificationConfigItem.reminderPeriod) && this.title == vehicleNotificationConfigItem.title && this.message == vehicleNotificationConfigItem.message && this.vehicleNotificationEventType == vehicleNotificationConfigItem.vehicleNotificationEventType;
    }

    @Override // y54.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public rq0.b getDocumentType() {
        return this.documentType;
    }

    @Override // y54.d
    public int getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.documentType.hashCode() * 31) + this.reminderPeriod.hashCode()) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.message)) * 31) + this.vehicleNotificationEventType.hashCode();
    }

    public String toString() {
        return "VehicleNotificationConfigItem(documentType=" + this.documentType + ", reminderPeriod=" + this.reminderPeriod + ", title=" + this.title + ", message=" + this.message + ", vehicleNotificationEventType=" + this.vehicleNotificationEventType + ')';
    }
}
