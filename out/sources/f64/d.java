package f64;

import d64.VehicleData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import r54.VehicleReminderNotification;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lf64/d;", "Ls54/d;", "Lc64/a;", "localNotificationsContainersInteractor", "Lez/c;", "dateConverter", "<init>", "(Lc64/a;Lez/c;)V", "", "Ld64/b;", "Lr54/g;", "d", "(Ljava/util/List;)Ljava/util/List;", "Lgz/b$a$a;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljava/util/Date;", "technicalExaminationExpireDate", "", "e", "(Ljava/util/Date;)Z", "Lc64/a;", "b", "Lez/c;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements s54.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c64.a localNotificationsContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f59566e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f59568g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59566e = obj;
            this.f59568g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(c64.a aVar, ez.c cVar) {
        this.localNotificationsContainersInteractor = aVar;
        this.dateConverter = cVar;
    }

    private final List<VehicleReminderNotification> d(List<VehicleData> list) {
        ArrayList arrayList = new ArrayList();
        for (VehicleData vehicleData : list) {
            List listC = v.c();
            String registrationNumber = vehicleData.getRegistrationNumber();
            if (registrationNumber != null) {
                Date insuranceExpireDate = vehicleData.getInsuranceExpireDate();
                if (insuranceExpireDate != null) {
                    listC.add(new VehicleReminderNotification(this.dateConverter.l(insuranceExpireDate), r54.f.CAR_INSURANCE, registrationNumber));
                }
                Date technicalExaminationExpireDate = vehicleData.getTechnicalExaminationExpireDate();
                if (technicalExaminationExpireDate != null && !e(technicalExaminationExpireDate)) {
                    listC.add(new VehicleReminderNotification(this.dateConverter.l(technicalExaminationExpireDate), r54.f.TECHNICAL_EXAMINATION, registrationNumber));
                }
            }
            v.D(arrayList, v.a(listC));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super List<VehicleReminderNotification>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f59568g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f59568g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objG = aVar.f59566e;
        Object objE = uq.b.e();
        int i16 = aVar.f59568g;
        if (i16 == 0) {
            u.b(objG);
            c64.a aVar2 = this.localNotificationsContainersInteractor;
            aVar.f59565d = vq.j.a(c1792a);
            aVar.f59568g = 1;
            objG = aVar2.g(aVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objG);
        }
        dx.i iVar = (dx.i) objG;
        if (!(iVar instanceof dx.i.Left)) {
            if (iVar instanceof dx.i.Right) {
                return d((List) ((dx.i.Right) iVar).b());
            }
            throw new oq.p();
        }
        dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
        px.f.e(px.f.f163100a, "failed to retrieve data from Vehicles " + bVar, null, px.c.a(this), 2, null);
        return v.n();
    }

    public final boolean e(Date technicalExaminationExpireDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(technicalExaminationExpireDate);
        return calendar.get(1) == 9999;
    }
}
