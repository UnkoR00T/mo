package t54;

import fr.t;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import y54.VehicleNotificationConfigItem;
import y54.d;
import y54.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lt54/b;", "", "<init>", "()V", "", "configId", "Ly54/d;", "b", "(Ljava/lang/String;)Ly54/d;", "", "Ly54/g;", "Ljava/util/List;", "a", "()Ljava/util/List;", "carInsuranceNotificationConfig", "c", "technicalExaminationNotificationConfig", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f187962a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<VehicleNotificationConfigItem> carInsuranceNotificationConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List<VehicleNotificationConfigItem> technicalExaminationNotificationConfig;

    static {
        rq0.b.d dVar = rq0.b.d.VEHICLE_CARD;
        f.OnTime onTime = new f.OnTime(0L, 1, null);
        int i15 = p54.a.f153150e;
        int i16 = p54.a.f153165t;
        r54.f fVar = r54.f.CAR_INSURANCE;
        carInsuranceNotificationConfig = v.q(new VehicleNotificationConfigItem(dVar, onTime, i15, i16, fVar), new VehicleNotificationConfigItem(dVar, new f.After(3L), p54.a.f153153h, p54.a.f153165t, fVar), new VehicleNotificationConfigItem(dVar, new f.Before(13L), p54.a.f153147b, p54.a.f153165t, fVar));
        f.OnTime onTime2 = new f.OnTime(0L, 1, null);
        int i17 = p54.a.f153151f;
        int i18 = p54.a.f153166u;
        r54.f fVar2 = r54.f.TECHNICAL_EXAMINATION;
        technicalExaminationNotificationConfig = v.q(new VehicleNotificationConfigItem(dVar, onTime2, i17, i18, fVar2), new VehicleNotificationConfigItem(dVar, new f.After(3L), p54.a.f153154i, p54.a.f153166u, fVar2), new VehicleNotificationConfigItem(dVar, new f.Before(13L), p54.a.f153148c, p54.a.f153166u, fVar2));
    }

    private b() {
    }

    public final List<VehicleNotificationConfigItem> a() {
        return carInsuranceNotificationConfig;
    }

    public final d b(String configId) {
        Object next;
        Iterator it = v.A(v.q(carInsuranceNotificationConfig, technicalExaminationNotificationConfig)).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (t.c(((VehicleNotificationConfigItem) next).c(), configId)) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public final List<VehicleNotificationConfigItem> c() {
        return technicalExaminationNotificationConfig;
    }
}
