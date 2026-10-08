package tn3;

import bn3.VehicleInsuranceModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ltn3/b;", "Ltn3/a;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "", "Lbn3/k;", "insurances", "b", "(Ljava/util/List;)Lbn3/k;", "a", "c", "Lez/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements tn3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((VehicleInsuranceModel) t15).getInsurancePeriodEnd(), ((VehicleInsuranceModel) t16).getInsurancePeriodEnd());
        }
    }

    public b(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    @Override // tn3.a
    public VehicleInsuranceModel a(List<VehicleInsuranceModel> insurances) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : insurances) {
            if (((VehicleInsuranceModel) obj).getInsurancePeriodEnd().compareTo(this.currentTimeProvider.h()) >= 0) {
                arrayList.add(obj);
            }
        }
        return (VehicleInsuranceModel) v.o0(v.U0(arrayList, new a()), 1);
    }

    @Override // tn3.a
    public VehicleInsuranceModel b(List<VehicleInsuranceModel> insurances) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : insurances) {
            VehicleInsuranceModel vehicleInsuranceModel = (VehicleInsuranceModel) obj2;
            Date dateH = this.currentTimeProvider.h();
            if (vehicleInsuranceModel.getInsurancePeriodStart().compareTo(dateH) <= 0 && vehicleInsuranceModel.getInsurancePeriodEnd().compareTo(dateH) >= 0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date insurancePeriodEnd = ((VehicleInsuranceModel) next).getInsurancePeriodEnd();
                do {
                    Object next2 = it.next();
                    Date insurancePeriodEnd2 = ((VehicleInsuranceModel) next2).getInsurancePeriodEnd();
                    if (insurancePeriodEnd.compareTo(insurancePeriodEnd2) > 0) {
                        next = next2;
                        insurancePeriodEnd = insurancePeriodEnd2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (VehicleInsuranceModel) obj;
    }

    @Override // tn3.a
    public VehicleInsuranceModel c(List<VehicleInsuranceModel> insurances) {
        Object obj;
        Iterator<T> it = insurances.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date insurancePeriodEnd = ((VehicleInsuranceModel) next).getInsurancePeriodEnd();
                do {
                    Object next2 = it.next();
                    Date insurancePeriodEnd2 = ((VehicleInsuranceModel) next2).getInsurancePeriodEnd();
                    if (insurancePeriodEnd.compareTo(insurancePeriodEnd2) < 0) {
                        next = next2;
                        insurancePeriodEnd = insurancePeriodEnd2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (VehicleInsuranceModel) obj;
    }
}
