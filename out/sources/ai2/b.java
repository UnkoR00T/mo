package ai2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k34.DistanceMeter;
import k34.DocumentModel;
import k34.IdentityDataHeaderModel;
import k34.TimeMeter;
import k34.VehicleDocumentDataModel;
import k34.VehicleInsuranceModel;
import k34.g0;
import k34.j0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ri2.DistanceMeterData;
import ri2.TimeMeterData;
import ri2.d;
import ri2.e;
import ri2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lri2/f;", "Lvm3/a;", "vehicleCategoryMapper", "Lk34/g0;", "f", "(Lri2/f;Lvm3/a;)Lk34/g0;", "Lri2/e;", "vehicleTypeMapper", "Lk34/h0;", "g", "(Lri2/e;Lvm3/a;)Lk34/h0;", "Lwm3/b;", "Lk34/j0;", "a", "(Lwm3/b;)Lk34/j0;", "Lri2/b;", "Lk34/t;", "d", "(Lri2/b;)Lk34/t;", "Lsi2/a;", "Lk34/i0;", "h", "(Lsi2/a;)Lk34/i0;", "Lri2/d;", "Lk34/m;", "c", "(Lri2/d;)Lk34/m;", "Lri2/g;", "Lk34/e0;", "e", "(Lri2/g;)Lk34/e0;", "Lri2/c;", "Lk34/f;", "b", "(Lri2/c;)Lk34/f;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6427a;

        static {
            int[] iArr = new int[wm3.b.values().length];
            try {
                iArr[wm3.b.Ambulance.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wm3.b.Bus.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wm3.b.Motorcycle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wm3.b.StandardCar.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[wm3.b.Tractor.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[wm3.b.Trailer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[wm3.b.Truck.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f6427a = iArr;
        }
    }

    public static final j0 a(wm3.b bVar) {
        switch (a.f6427a[bVar.ordinal()]) {
            case 1:
                return j0.Ambulance;
            case 2:
                return j0.Bus;
            case 3:
                return j0.Motorcycle;
            case 4:
                return j0.StandardCar;
            case 5:
                return j0.Tractor;
            case 6:
                return j0.Trailer;
            case 7:
                return j0.Truck;
            default:
                throw new p();
        }
    }

    public static final DistanceMeter b(DistanceMeterData distanceMeterData) {
        return new DistanceMeter(distanceMeterData.getUnit(), distanceMeterData.getDataImporter(), distanceMeterData.getSaveDate(), distanceMeterData.getValue());
    }

    public static final DocumentModel c(d dVar) {
        return new DocumentModel(dVar.f174450a, dVar.f174451b, dVar.f174452c, dVar.f174453d, dVar.f174454e, dVar.f174455f, dVar.f174456g);
    }

    public static final IdentityDataHeaderModel d(ri2.b bVar) {
        return new IdentityDataHeaderModel(bVar.a(), bVar.g(), bVar.e(), bVar.h(), bVar.f(), bVar.b(), bVar.c(), bVar.d());
    }

    public static final TimeMeter e(TimeMeterData timeMeterData) {
        return new TimeMeter(timeMeterData.getUnit(), timeMeterData.getDataImporter(), timeMeterData.getSaveDate(), timeMeterData.getValue());
    }

    public static final g0 f(f fVar, vm3.a aVar) {
        IdentityDataHeaderModel identityDataHeaderModelD = d(fVar.f174481a);
        e eVar = fVar.f174483c.get("FULL");
        return new g0(identityDataHeaderModelD, eVar != null ? g(eVar, aVar) : null);
    }

    public static final VehicleDocumentDataModel g(e eVar, vm3.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = eVar.f174431a;
        String str2 = eVar.f174434d;
        String str3 = eVar.f174432b;
        String str4 = eVar.f174433c;
        String str5 = eVar.f174435e;
        BigDecimal bigDecimal = eVar.f174436f;
        BigDecimal bigDecimal2 = eVar.f174437g;
        String str6 = eVar.f174462h;
        Date date = eVar.f174463i;
        Date date2 = eVar.f174464j;
        Date date3 = eVar.f174465k;
        List<si2.a> list = eVar.f174466l;
        if (list != null) {
            List<si2.a> list2 = list;
            ArrayList arrayList3 = new ArrayList(v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(h((si2.a) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<d> list3 = eVar.f174467m;
        if (list3 != null) {
            List<d> list4 = list3;
            ArrayList arrayList4 = new ArrayList(v.y(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(c((d) it4.next()));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        String str7 = eVar.f174468n;
        String str8 = eVar.f174469o;
        String str9 = eVar.f174470p;
        String str10 = eVar.f174471q;
        String str11 = eVar.f174472r;
        String str12 = eVar.f174473s;
        String str13 = eVar.f174474t;
        String str14 = eVar.f174475u;
        String str15 = eVar.f174476v;
        String str16 = eVar.f174477w;
        String str17 = eVar.f174478x;
        String str18 = eVar.f174479y;
        String str19 = eVar.f174480z;
        String str20 = eVar.A;
        BigDecimal bigDecimal3 = eVar.B;
        BigDecimal bigDecimal4 = eVar.C;
        BigDecimal bigDecimal5 = eVar.D;
        String str21 = eVar.E;
        BigDecimal bigDecimal6 = eVar.F;
        BigDecimal bigDecimal7 = eVar.G;
        BigDecimal bigDecimal8 = eVar.H;
        BigDecimal bigDecimal9 = eVar.I;
        BigDecimal bigDecimal10 = eVar.J;
        BigDecimal bigDecimal11 = eVar.K;
        BigDecimal bigDecimal12 = eVar.L;
        BigDecimal bigDecimal13 = eVar.M;
        BigDecimal bigDecimal14 = eVar.N;
        BigDecimal bigDecimal15 = eVar.O;
        BigDecimal bigDecimal16 = eVar.P;
        BigDecimal bigDecimal17 = eVar.Q;
        BigDecimal bigDecimal18 = eVar.R;
        BigDecimal bigDecimal19 = eVar.S;
        BigDecimal bigDecimal20 = eVar.T;
        BigDecimal bigDecimal21 = eVar.U;
        String str22 = eVar.V;
        BigDecimal bigDecimal22 = eVar.W;
        int i15 = eVar.X;
        String str23 = eVar.Y;
        String str24 = eVar.Z;
        Date date4 = eVar.f174457a0;
        boolean z15 = eVar.f174458b0;
        String str25 = eVar.f174459c0;
        DistanceMeterData distanceMeterData = eVar.f174460d0;
        DistanceMeter distanceMeterB = distanceMeterData != null ? b(distanceMeterData) : null;
        TimeMeterData timeMeterData = eVar.f174461e0;
        return new VehicleDocumentDataModel(str, str3, str4, str2, str5, bigDecimal, bigDecimal2, str6, date, date2, date3, arrayList, arrayList2, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, bigDecimal3, bigDecimal4, bigDecimal5, str21, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, str22, bigDecimal22, i15, str23, str24, date4, z15, str25, distanceMeterB, timeMeterData != null ? e(timeMeterData) : null, a(aVar.b(new vm3.a.Params(eVar.f174471q, eVar.f174462h))));
    }

    public static final VehicleInsuranceModel h(si2.a aVar) {
        Date date = aVar.f181939a;
        int i15 = aVar.f181940b;
        String str = aVar.f181941c;
        String str2 = aVar.f181942d;
        String str3 = aVar.f181943e;
        Date date2 = aVar.f181944f;
        si2.b bVar = aVar.f181945g;
        return new VehicleInsuranceModel(date, i15, str, str2, str3, date2, bVar.f181946a, bVar.f181947b);
    }
}
