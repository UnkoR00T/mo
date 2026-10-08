package mj3;

import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import tj3.AbroadDetailsPayload;
import uv0.AutoDna;
import uv0.Carfax;
import uv0.VehicleHistoryAbroad;
import uv0.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luv0/n;", "", "showTechnicalData", "", "Ltj3/a;", "c", "(Luv0/n;Z)Ljava/util/List;", "Luv0/b;", "Ltj3/b$d;", "b", "(Luv0/b;)Ltj3/b$d;", "vehiclehistory_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final tj3.b.ServiceNoData b(uv0.b bVar) {
        return new tj3.b.ServiceNoData(bVar.getCode() != g.VEHICLE_HISTORY_NOT_FOUND, bVar.getTitle(), bVar.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AbroadDetailsPayload> c(VehicleHistoryAbroad vehicleHistoryAbroad, boolean z15) {
        Carfax carfax = vehicleHistoryAbroad.getCarfax();
        String name = carfax.getName();
        uv0.b error = carfax.getError();
        AbroadDetailsPayload abroadDetailsPayload = new AbroadDetailsPayload(name, error != null ? b(error) : null, z15 ? carfax.getAbroadBasicData() : null, null, carfax.d());
        AutoDna autoDna = vehicleHistoryAbroad.getAutoDna();
        String name2 = autoDna.getName();
        uv0.b error2 = autoDna.getError();
        return v.q(abroadDetailsPayload, new AbroadDetailsPayload(name2, error2 != null ? b(error2) : null, null, autoDna.c(), autoDna.d()));
    }
}
