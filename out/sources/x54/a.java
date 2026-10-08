package x54;

import p071kotlin.Metadata;
import r54.LocalDocumentNotification;
import r54.LocalVehicleNotification;
import y54.LocalDocumentNotificationEntity;
import y54.LocalVehicleNotificationEntity;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0006*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly54/b;", "Lr54/a;", "a", "(Ly54/b;)Lr54/a;", "c", "(Lr54/a;)Ly54/b;", "Ly54/c;", "Lr54/d;", "b", "(Ly54/c;)Lr54/d;", "d", "(Lr54/d;)Ly54/c;", "localnotifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final LocalDocumentNotification a(LocalDocumentNotificationEntity localDocumentNotificationEntity) {
        return new LocalDocumentNotification(localDocumentNotificationEntity.getConfigId(), localDocumentNotificationEntity.getDocumentType(), localDocumentNotificationEntity.getDocumentSubType(), localDocumentNotificationEntity.getExpirationDate(), localDocumentNotificationEntity.getNotificationDate(), localDocumentNotificationEntity.getStatus());
    }

    public static final LocalVehicleNotification b(LocalVehicleNotificationEntity localVehicleNotificationEntity) {
        return new LocalVehicleNotification(localVehicleNotificationEntity.getReminderId(), localVehicleNotificationEntity.getConfigId(), localVehicleNotificationEntity.getDocumentType(), localVehicleNotificationEntity.getRegisterNo(), localVehicleNotificationEntity.getExpirationDate(), localVehicleNotificationEntity.getNotificationDate(), localVehicleNotificationEntity.getStatus());
    }

    public static final LocalDocumentNotificationEntity c(LocalDocumentNotification localDocumentNotification) {
        return new LocalDocumentNotificationEntity(0L, localDocumentNotification.getConfigId(), localDocumentNotification.getDocumentType(), localDocumentNotification.getDocumentSubType(), localDocumentNotification.getExpirationDate(), localDocumentNotification.getNotificationDate(), localDocumentNotification.getStatus(), 1, null);
    }

    public static final LocalVehicleNotificationEntity d(LocalVehicleNotification localVehicleNotification) {
        return new LocalVehicleNotificationEntity(0L, localVehicleNotification.getReminderId(), localVehicleNotification.getConfigId(), localVehicleNotification.getDocumentType(), localVehicleNotification.getRegisterNo(), localVehicleNotification.getExpirationDate(), localVehicleNotification.getNotificationDate(), localVehicleNotification.getStatus(), 1, null);
    }
}
