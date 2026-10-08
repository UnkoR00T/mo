package e64;

import java.time.LocalDate;
import java.util.List;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import r54.LocalDocumentNotification;
import r54.LocalVehicleNotification;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0013\u0010\u0011J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001aH¦@¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H¦@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H¦@¢\u0006\u0004\b&\u0010%J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160'H¦@¢\u0006\u0004\b(\u0010\fJ\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00160'H¦@¢\u0006\u0004\b)\u0010\fJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H¦@¢\u0006\u0004\b*\u0010\f¨\u0006+À\u0006\u0003"}, d2 = {"Le64/b;", "", "Lrq0/b;", "documentType", "Loq/i0;", "m", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Lr54/b;", "documentSubType", "i", "(Lr54/b;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "k", "", "registerNo", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "reminderId", "b", "Ljava/time/LocalDate;", "date", "", "Lr54/a;", "a", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "Lr54/d;", "e", "localDocumentNotification", "n", "(Lr54/a;Ltq/e;)Ljava/lang/Object;", "localVehicleNotification", "j", "(Lr54/d;Ltq/e;)Ljava/lang/Object;", "Lr54/e;", "status", "c", "(Ljava/lang/String;Lr54/e;Ltq/e;)Ljava/lang/Object;", "g", "Lmu/g;", "o", "l", "f", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(LocalDate localDate, e<? super List<LocalDocumentNotification>> eVar);

    Object b(String str, e<? super i0> eVar);

    Object c(String str, r54.e eVar, e<? super i0> eVar2);

    Object d(e<? super i0> eVar);

    Object e(LocalDate localDate, e<? super List<LocalVehicleNotification>> eVar);

    Object f(e<? super List<LocalVehicleNotification>> eVar);

    Object g(String str, r54.e eVar, e<? super i0> eVar2);

    Object h(String str, e<? super i0> eVar);

    Object i(r54.b bVar, e<? super i0> eVar);

    Object j(LocalVehicleNotification localVehicleNotification, e<? super i0> eVar);

    Object k(e<? super i0> eVar);

    Object l(e<? super g<? extends List<LocalVehicleNotification>>> eVar);

    Object m(rq0.b bVar, e<? super i0> eVar);

    Object n(LocalDocumentNotification localDocumentNotification, e<? super i0> eVar);

    Object o(e<? super g<? extends List<LocalDocumentNotification>>> eVar);
}
