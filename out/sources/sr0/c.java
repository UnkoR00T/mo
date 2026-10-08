package sr0;

import dx.i;
import er0.BEDocumentAndCertificateStatuses;
import er0.BEDocumentStatus;
import er0.BEExtUserCertificateStatus;
import fu.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oq.p;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsr0/c;", "Lkr0/c;", "Lrr0/e;", "repository", "<init>", "(Lrr0/e;)V", "Lkr0/c$a;", "params", "Ldx/i;", "Ldx/b;", "Lkr0/c$b;", "d", "(Lkr0/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lrr0/e;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements kr0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rr0.e repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f183711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183712g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f183714j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183712g = obj;
            this.f183714j |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(rr0.e eVar) {
        this.repository = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1 A[LOOP:4: B:61:0x01cb->B:63:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0212  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(kr0.c.Params params, tq.e<? super i<? extends dx.b, kr0.c.Result>> eVar) throws Throwable {
        a aVar;
        Object right;
        ArrayList arrayList;
        ArrayList arrayList2;
        String value;
        ArrayList<BEExtUserCertificateStatus> arrayList3;
        ArrayList arrayList4;
        List<String> value2;
        ArrayList arrayList5;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f183714j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f183714j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f183712g;
        Object objE = uq.b.e();
        int i16 = aVar2.f183714j;
        if (i16 == 0) {
            u.b(objA);
            List listA = v.A(params.a().values());
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : listA) {
                if (!r.t0((String) obj)) {
                    arrayList6.add(obj);
                }
            }
            Set<String> setK1 = v.k1(arrayList6);
            Collection<String> collectionValues = params.c().values();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (!r.t0((String) obj2)) {
                    arrayList7.add(obj2);
                }
            }
            Set<String> setK2 = v.k1(arrayList7);
            if (setK1.isEmpty() && setK2.isEmpty()) {
                right = new i.Right(new BEDocumentAndCertificateStatuses(v.n(), v.n(), false));
            } else {
                rr0.e eVar2 = this.repository;
                boolean hasVehiclesWithoutId = params.getHasVehiclesWithoutId();
                Set<String> setD = params.d();
                aVar2.f183709d = params;
                aVar2.f183710e = j.a(setK1);
                aVar2.f183711f = j.a(setK2);
                aVar2.f183714j = 1;
                objA = eVar2.a(setK1, setK2, setD, hasVehiclesWithoutId, aVar2);
                if (objA == objE) {
                    return objE;
                }
            }
            if (right instanceof i.Left) {
                return right;
            }
            if (right instanceof i.Right) {
                throw new p();
            }
            Map<rq0.b, List<String>> mapA = params.a();
            arrayList = new ArrayList(mapA.size());
            for (Map.Entry<rq0.b, List<String>> entry : mapA.entrySet()) {
                rq0.b key = entry.getKey();
                value2 = entry.getValue();
                List<BEDocumentStatus> listB = ((BEDocumentAndCertificateStatuses) ((i.Right) right).b()).b();
                arrayList5 = new ArrayList();
                for (Object obj3 : listB) {
                    if (value2.contains(((BEDocumentStatus) obj3).getId())) {
                        arrayList5.add(obj3);
                    }
                }
                arrayList.add(y.a(key, arrayList5));
            }
            Map<rq0.b, String> mapC = params.c();
            arrayList2 = new ArrayList(mapC.size());
            for (Map.Entry<rq0.b, String> entry2 : mapC.entrySet()) {
                rq0.b key2 = entry2.getKey();
                value = entry2.getValue();
                List<BEExtUserCertificateStatus> listA2 = ((BEDocumentAndCertificateStatuses) ((i.Right) right).b()).a();
                arrayList3 = new ArrayList();
                for (Object obj4 : listA2) {
                    if (r.d0(value, ((BEExtUserCertificateStatus) obj4).getSerialNumber(), false, 2, null)) {
                        arrayList3.add(obj4);
                    }
                }
                arrayList4 = new ArrayList(v.y(arrayList3, 10));
                for (BEExtUserCertificateStatus bEExtUserCertificateStatus : arrayList3) {
                    arrayList4.add(new BEDocumentStatus(bEExtUserCertificateStatus.getSerialNumber(), bEExtUserCertificateStatus.getStatus(), false));
                }
                arrayList2.add(y.a(key2, arrayList4));
            }
            return new i.Right(new kr0.c.Result(((BEDocumentAndCertificateStatuses) ((i.Right) right).b()).getUpdateVehicleCardsRequired(), v0.s(v.L0(arrayList, arrayList2))));
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        params = (kr0.c.Params) aVar2.f183709d;
        u.b(objA);
        right = (i) objA;
        if (right instanceof i.Left) {
            return right;
        }
        if (right instanceof i.Right) {
            throw new p();
        }
        Map<rq0.b, List<String>> mapA2 = params.a();
        arrayList = new ArrayList(mapA2.size());
        while (r0.hasNext()) {
            rq0.b key3 = entry.getKey();
            value2 = entry.getValue();
            List<BEDocumentStatus> listB2 = ((BEDocumentAndCertificateStatuses) ((i.Right) right).b()).b();
            arrayList5 = new ArrayList();
            while (r4.hasNext()) {
                if (value2.contains(((BEDocumentStatus) obj3).getId())) {
                    arrayList5.add(obj3);
                }
            }
            arrayList.add(y.a(key3, arrayList5));
        }
        Map<rq0.b, String> mapC2 = params.c();
        arrayList2 = new ArrayList(mapC2.size());
        while (r12.hasNext()) {
            rq0.b key4 = entry2.getKey();
            value = entry2.getValue();
            List<BEExtUserCertificateStatus> listA3 = ((BEDocumentAndCertificateStatuses) ((i.Right) right).b()).a();
            arrayList3 = new ArrayList();
            while (r4.hasNext()) {
                if (r.d0(value, ((BEExtUserCertificateStatus) obj4).getSerialNumber(), false, 2, null)) {
                    arrayList3.add(obj4);
                }
            }
            arrayList4 = new ArrayList(v.y(arrayList3, 10));
            while (r4.hasNext()) {
                arrayList4.add(new BEDocumentStatus(bEExtUserCertificateStatus.getSerialNumber(), bEExtUserCertificateStatus.getStatus(), false));
            }
            arrayList2.add(y.a(key4, arrayList4));
        }
        return new i.Right(new kr0.c.Result(((BEDocumentAndCertificateStatuses) ((i.Right) right).b()).getUpdateVehicleCardsRequired(), v0.s(v.L0(arrayList, arrayList2))));
    }
}
