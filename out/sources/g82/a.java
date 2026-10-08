package g82;

import e82.c;
import e82.e;
import fr.t;
import hz.g;
import iy.c0;
import j14.o;
import java.util.Map;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import vq.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lg82/a;", "Lgz/b;", "Lg82/a$a;", "", "La82/a;", "Lhz/g;", "Le82/a;", "checkIfAddressIsValidUseCase", "Le82/c;", "checkIfCityIsValidUseCase", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "Le82/e;", "checkIfVoivodeshipNameIsValidUseCase", "<init>", "(Le82/a;Le82/c;Lj14/o;Le82/e;)V", "params", "d", "(Lg82/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Le82/a;", "b", "Le82/c;", "c", "Lj14/o;", "Le82/e;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, Map<a82.a, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e82.a checkIfAddressIsValidUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c checkIfCityIsValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o checkPolishPostalCodeCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e checkIfVoivodeshipNameIsValidUseCase;

    /* JADX INFO: renamed from: g82.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lg82/a$a;", "Lgz/b$a;", "", "voivodeship", "city", "streetBuildingAndApartment", "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String voivodeship;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String city;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String streetBuildingAndApartment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String zipCode;

        public Params(String str, String str2, String str3, String str4) {
            this.voivodeship = str;
            this.city = str2;
            this.streetBuildingAndApartment = str3;
            this.zipCode = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStreetBuildingAndApartment() {
            return this.streetBuildingAndApartment;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getVoivodeship() {
            return this.voivodeship;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getZipCode() {
            return this.zipCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.voivodeship, params.voivodeship) && t.c(this.city, params.city) && t.c(this.streetBuildingAndApartment, params.streetBuildingAndApartment) && t.c(this.zipCode, params.zipCode);
        }

        public int hashCode() {
            return (((((this.voivodeship.hashCode() * 31) + this.city.hashCode()) * 31) + this.streetBuildingAndApartment.hashCode()) * 31) + this.zipCode.hashCode();
        }

        public String toString() {
            return "Params(voivodeship=" + this.voivodeship + ", city=" + this.city + ", streetBuildingAndApartment=" + this.streetBuildingAndApartment + ", zipCode=" + this.zipCode + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f71226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f71227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f71228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f71229g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f71230h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f71231j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f71233l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f71231j = obj;
            this.f71233l |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(e82.a aVar, c cVar, o oVar, e eVar) {
        this.checkIfAddressIsValidUseCase = aVar;
        this.checkIfCityIsValidUseCase = cVar;
        this.checkPolishPostalCodeCorrectUC = oVar;
        this.checkIfVoivodeshipNameIsValidUseCase = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super Map<a82.a, ? extends g>> eVar) throws Throwable {
        b bVar;
        r[] rVarArr;
        a82.a aVar;
        Params params2;
        int i15;
        r[] rVarArr2;
        a82.a aVar2;
        r[] rVarArr3;
        Params params3;
        a82.a aVar3;
        r[] rVarArr4;
        r[] rVarArr5;
        Params params4;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i16 = bVar.f71233l;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f71233l = i16 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f71231j;
        Object objE = uq.b.e();
        int i17 = bVar.f71233l;
        int i18 = 2;
        int i19 = 1;
        if (i17 == 0) {
            u.b(objD);
            rVarArr = new r[4];
            aVar = a82.a.VOIVODESHIP;
            e eVar2 = this.checkIfVoivodeshipNameIsValidUseCase;
            e.Params params5 = new e.Params(params.getVoivodeship());
            bVar.f71226d = params;
            bVar.f71227e = rVarArr;
            bVar.f71228f = rVarArr;
            bVar.f71229g = aVar;
            bVar.f71230h = 0;
            bVar.f71233l = 1;
            objD = eVar2.d(params5, bVar);
            if (objD != objE) {
                params2 = params;
                i15 = 0;
                rVarArr2 = rVarArr;
            }
            return objE;
        }
        if (i17 == 1) {
            i15 = bVar.f71230h;
            aVar = (a82.a) bVar.f71229g;
            r[] rVarArr6 = (r[]) bVar.f71228f;
            r[] rVarArr7 = (r[]) bVar.f71227e;
            params2 = (Params) bVar.f71226d;
            u.b(objD);
            rVarArr2 = rVarArr6;
            rVarArr = rVarArr7;
        } else {
            if (i17 == 2) {
                i19 = bVar.f71230h;
                aVar2 = (a82.a) bVar.f71229g;
                rVarArr3 = (r[]) bVar.f71228f;
                rVarArr = (r[]) bVar.f71227e;
                params3 = (Params) bVar.f71226d;
                u.b(objD);
                rVarArr3[i19] = y.a(aVar2, objD);
                aVar3 = a82.a.STREET_BUILDING_AND_APARTMENT;
                e82.a aVar4 = this.checkIfAddressIsValidUseCase;
                e82.a.Params params6 = new e82.a.Params(params3.getStreetBuildingAndApartment());
                bVar.f71226d = params3;
                bVar.f71227e = rVarArr;
                bVar.f71228f = rVarArr;
                bVar.f71229g = aVar3;
                bVar.f71230h = 2;
                bVar.f71233l = 3;
                objD = aVar4.d(params6, bVar);
                if (objD != objE) {
                    rVarArr4 = rVarArr;
                    rVarArr5 = rVarArr4;
                    params4 = params3;
                }
                return objE;
            }
            if (i17 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i18 = bVar.f71230h;
            aVar3 = (a82.a) bVar.f71229g;
            rVarArr4 = (r[]) bVar.f71228f;
            rVarArr5 = (r[]) bVar.f71227e;
            params4 = (Params) bVar.f71226d;
            u.b(objD);
        }
        rVarArr4[i18] = y.a(aVar3, objD);
        rVarArr5[3] = y.a(a82.a.ZIP_CODE, this.checkPolishPostalCodeCorrectUC.a(new o.Params(c0.g(params4.getZipCode()), false)));
        return v0.l(rVarArr5);
        rVarArr2[i15] = y.a(aVar, objD);
        aVar2 = a82.a.CITY;
        c cVar = this.checkIfCityIsValidUseCase;
        c.Params params7 = new c.Params(params2.getCity());
        bVar.f71226d = params2;
        bVar.f71227e = rVarArr;
        bVar.f71228f = rVarArr;
        bVar.f71229g = aVar2;
        bVar.f71230h = 1;
        bVar.f71233l = 2;
        objD = cVar.d(params7, bVar);
        if (objD != objE) {
            rVarArr3 = rVarArr;
            params3 = params2;
            rVarArr3[i19] = y.a(aVar2, objD);
            aVar3 = a82.a.STREET_BUILDING_AND_APARTMENT;
            e82.a aVar5 = this.checkIfAddressIsValidUseCase;
            e82.a.Params params8 = new e82.a.Params(params3.getStreetBuildingAndApartment());
            bVar.f71226d = params3;
            bVar.f71227e = rVarArr;
            bVar.f71228f = rVarArr;
            bVar.f71229g = aVar3;
            bVar.f71230h = 2;
            bVar.f71233l = 3;
            objD = aVar5.d(params8, bVar);
            if (objD != objE) {
                rVarArr4 = rVarArr;
                rVarArr5 = rVarArr4;
                params4 = params3;
                rVarArr4[i18] = y.a(aVar3, objD);
                rVarArr5[3] = y.a(a82.a.ZIP_CODE, this.checkPolishPostalCodeCorrectUC.a(new o.Params(c0.g(params4.getZipCode()), false)));
                return v0.l(rVarArr5);
            }
        }
        return objE;
    }
}
