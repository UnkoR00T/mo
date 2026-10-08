package jw0;

import iy.b0;
import java.time.LocalDate;
import p071kotlin.Metadata;
import uv0.VehicleHistory;
import uv0.VehicleHistoryAbroad;
import uv0.VehicleHistoryTimeline;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J6\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u000e\u0010\fJ6\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011À\u0006\u0003"}, d2 = {"Ljw0/f;", "", "Luv0/d;", "numberPlate", "Luv0/v;", "vin", "Ljava/time/LocalDate;", "firstRegistrationDate", "Ldx/i;", "Ldx/b;", "Luv0/m;", "b", "(Ljava/lang/String;Liy/b0;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "Luv0/n;", "c", "Luv0/t;", "a", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    Object a(String str, b0 b0Var, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, VehicleHistoryTimeline>> eVar);

    Object b(String str, b0 b0Var, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, VehicleHistory>> eVar);

    Object c(String str, b0 b0Var, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, VehicleHistoryAbroad>> eVar);
}
