package zt2;

import iy.c0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tu2.CompanyIdData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lzt2/d;", "Lgz/b;", "Lzt2/d$a;", "Lzt2/l;", "Lzt2/e;", "checkCompanyNameCorrectUseCase", "Lzt2/c;", "checkCompanyCityCorrectUseCase", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "Lzt2/f;", "checkCompanyStreetCorrectUseCase", "Lzt2/b;", "checkCompanyBuildingNumberCorrectUseCase", "Lzt2/a;", "checkCompanyApartmentNumberCorrectUseCase", "Lj14/l;", "checkNipNumberCheckSumUC", "Lj14/q;", "checkRegonNumberCorrectUC", "Lj14/k;", "checkKrsNumberCorrectUC", "<init>", "(Lzt2/e;Lzt2/c;Lj14/o;Lzt2/f;Lzt2/b;Lzt2/a;Lj14/l;Lj14/q;Lj14/k;)V", "Ltu2/a;", "companyIdData", "Lhz/g;", "d", "(Ltu2/a;Ltq/e;)Ljava/lang/Object;", "params", "e", "(Lzt2/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzt2/e;", "b", "Lzt2/c;", "c", "Lj14/o;", "Lzt2/f;", "Lzt2/b;", "f", "Lzt2/a;", "g", "Lj14/l;", "h", "Lj14/q;", "i", "Lj14/k;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<Params, CompanyDataValidation> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e checkCompanyNameCorrectUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zt2.c checkCompanyCityCorrectUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.o checkPolishPostalCodeCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f checkCompanyStreetCorrectUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zt2.b checkCompanyBuildingNumberCorrectUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a checkCompanyApartmentNumberCorrectUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j14.l checkNipNumberCheckSumUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final j14.q checkRegonNumberCorrectUC;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final j14.k checkKrsNumberCorrectUC;

    /* JADX INFO: renamed from: zt2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, d2 = {"Lzt2/d$a;", "Lgz/b$a;", "", "name", "city", "postalCode", "street", "buildingNumber", "apartmentNumber", "Ltu2/a;", "companyIdData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltu2/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "h", "d", "i", "e", "g", "Ltu2/a;", "()Ltu2/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String city;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postalCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String street;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String buildingNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String apartmentNumber;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanyIdData companyIdData;

        public Params(String str, String str2, String str3, String str4, String str5, String str6, CompanyIdData companyIdData) {
            this.name = str;
            this.city = str2;
            this.postalCode = str3;
            this.street = str4;
            this.buildingNumber = str5;
            this.apartmentNumber = str6;
            this.companyIdData = companyIdData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApartmentNumber() {
            return this.apartmentNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBuildingNumber() {
            return this.buildingNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final CompanyIdData getCompanyIdData() {
            return this.companyIdData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.name, params.name) && fr.t.c(this.city, params.city) && fr.t.c(this.postalCode, params.postalCode) && fr.t.c(this.street, params.street) && fr.t.c(this.buildingNumber, params.buildingNumber) && fr.t.c(this.apartmentNumber, params.apartmentNumber) && fr.t.c(this.companyIdData, params.companyIdData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        public int hashCode() {
            return (((((((((((this.name.hashCode() * 31) + this.city.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.street.hashCode()) * 31) + this.buildingNumber.hashCode()) * 31) + this.apartmentNumber.hashCode()) * 31) + this.companyIdData.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getStreet() {
            return this.street;
        }

        public String toString() {
            return "Params(name=" + this.name + ", city=" + this.city + ", postalCode=" + this.postalCode + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", apartmentNumber=" + this.apartmentNumber + ", companyIdData=" + this.companyIdData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f237321a;

        static {
            int[] iArr = new int[bu2.a.values().length];
            try {
                iArr[bu2.a.NIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bu2.a.REGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bu2.a.KRS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f237321a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f237322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f237323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f237324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f237325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f237326h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f237327j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f237328k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f237329l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f237331n;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f237329l = obj;
            this.f237331n |= PKIFailureInfo.systemUnavail;
            return d.this.e(null, this);
        }
    }

    public d(e eVar, zt2.c cVar, j14.o oVar, f fVar, zt2.b bVar, a aVar, j14.l lVar, j14.q qVar, j14.k kVar) {
        this.checkCompanyNameCorrectUseCase = eVar;
        this.checkCompanyCityCorrectUseCase = cVar;
        this.checkPolishPostalCodeCorrectUC = oVar;
        this.checkCompanyStreetCorrectUseCase = fVar;
        this.checkCompanyBuildingNumberCorrectUseCase = bVar;
        this.checkCompanyApartmentNumberCorrectUseCase = aVar;
        this.checkNipNumberCheckSumUC = lVar;
        this.checkRegonNumberCorrectUC = qVar;
        this.checkKrsNumberCorrectUC = kVar;
    }

    private final Object d(CompanyIdData companyIdData, tq.e<? super hz.g> eVar) {
        int i15 = b.f237321a[companyIdData.getCompanyIdType().ordinal()];
        if (i15 == 1) {
            return this.checkNipNumberCheckSumUC.a(new j14.l.Params(companyIdData.getCompanyIdNumber(), false, 2, null));
        }
        if (i15 == 2) {
            return this.checkRegonNumberCorrectUC.a(new j14.q.Params(companyIdData.getCompanyIdNumber(), false, 2, null));
        }
        if (i15 == 3) {
            return this.checkKrsNumberCorrectUC.a(new j14.k.Params(companyIdData.getCompanyIdNumber(), false, 2, null));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:29:0x012d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0154  */
    /* JADX WARN: Code duplicated, block: B:37:0x017a  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Params params, tq.e<? super CompanyDataValidation> eVar) throws Throwable {
        c cVar;
        Params params2;
        hz.g gVar;
        Object objD;
        Params params3;
        hz.g gVar2;
        hz.g gVar3;
        hz.g gVarA;
        Object objD2;
        hz.g gVar4;
        hz.g gVar5;
        Params params4;
        hz.g gVar6;
        Object objD3;
        Params params5;
        hz.g gVar7;
        hz.g gVar8;
        Object objD4;
        hz.g gVar9;
        hz.g gVar10;
        hz.g gVar11;
        hz.g gVar12;
        hz.g gVar13;
        hz.g gVar14;
        Object objD5;
        hz.g gVar15;
        hz.g gVar16;
        hz.g gVar17;
        hz.g gVar18;
        hz.g gVar19;
        hz.g gVar20;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f237331n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f237331n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD6 = cVar.f237329l;
        Object objE = uq.b.e();
        switch (cVar.f237331n) {
            case 0:
                oq.u.b(objD6);
                e eVar2 = this.checkCompanyNameCorrectUseCase;
                e.Params params6 = new e.Params(params.getName());
                cVar.f237322d = params;
                cVar.f237331n = 1;
                objD6 = eVar2.d(params6, cVar);
                if (objD6 != objE) {
                    params2 = params;
                    gVar = (hz.g) objD6;
                    zt2.c cVar2 = this.checkCompanyCityCorrectUseCase;
                    zt2.c.Params params7 = new zt2.c.Params(params2.getCity());
                    cVar.f237322d = params2;
                    cVar.f237323e = gVar;
                    cVar.f237331n = 2;
                    objD = cVar2.d(params7, cVar);
                    if (objD != objE) {
                        params3 = params2;
                        gVar2 = gVar;
                        objD6 = objD;
                        gVar3 = (hz.g) objD6;
                        gVarA = this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(c0.g(params3.getPostalCode()), false, 2, null));
                        f fVar = this.checkCompanyStreetCorrectUseCase;
                        f.Params params8 = new f.Params(params3.getStreet());
                        cVar.f237322d = params3;
                        cVar.f237323e = gVar2;
                        cVar.f237324f = gVar3;
                        cVar.f237325g = gVarA;
                        cVar.f237331n = 3;
                        objD2 = fVar.d(params8, cVar);
                        if (objD2 != objE) {
                            gVar4 = gVar3;
                            objD6 = objD2;
                            Params params9 = params3;
                            gVar5 = gVar2;
                            params4 = params9;
                            gVar6 = (hz.g) objD6;
                            zt2.b bVar = this.checkCompanyBuildingNumberCorrectUseCase;
                            zt2.b.Params params10 = new zt2.b.Params(params4.getBuildingNumber());
                            cVar.f237322d = params4;
                            cVar.f237323e = gVar5;
                            cVar.f237324f = gVar4;
                            cVar.f237325g = gVarA;
                            cVar.f237326h = gVar6;
                            cVar.f237331n = 4;
                            objD3 = bVar.d(params10, cVar);
                            if (objD3 != objE) {
                                params5 = params4;
                                gVar7 = gVar6;
                                objD6 = objD3;
                                gVar8 = (hz.g) objD6;
                                a aVar = this.checkCompanyApartmentNumberCorrectUseCase;
                                a.Params params11 = new a.Params(params5.getApartmentNumber());
                                cVar.f237322d = params5;
                                cVar.f237323e = gVar5;
                                cVar.f237324f = gVar4;
                                cVar.f237325g = gVarA;
                                cVar.f237326h = gVar7;
                                cVar.f237327j = gVar8;
                                cVar.f237331n = 5;
                                objD4 = aVar.d(params11, cVar);
                                if (objD4 != objE) {
                                    hz.g gVar21 = gVar7;
                                    gVar9 = gVar8;
                                    objD6 = objD4;
                                    gVar10 = gVar5;
                                    gVar11 = gVar4;
                                    gVar12 = gVarA;
                                    gVar13 = gVar21;
                                    gVar14 = (hz.g) objD6;
                                    CompanyIdData companyIdData = params5.getCompanyIdData();
                                    cVar.f237322d = vq.j.a(params5);
                                    cVar.f237323e = gVar10;
                                    cVar.f237324f = gVar11;
                                    cVar.f237325g = gVar12;
                                    cVar.f237326h = gVar13;
                                    cVar.f237327j = gVar9;
                                    cVar.f237328k = gVar14;
                                    cVar.f237331n = 6;
                                    objD5 = d(companyIdData, cVar);
                                    if (objD5 != objE) {
                                        hz.g gVar22 = gVar11;
                                        gVar15 = gVar9;
                                        gVar16 = gVar22;
                                        hz.g gVar23 = gVar12;
                                        gVar17 = gVar13;
                                        gVar18 = gVar23;
                                        gVar19 = gVar10;
                                        gVar20 = gVar14;
                                        objD6 = objD5;
                                        return new CompanyDataValidation(gVar19, gVar16, gVar18, gVar17, gVar15, gVar20, (hz.g) objD6);
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 1:
                params2 = (Params) cVar.f237322d;
                oq.u.b(objD6);
                gVar = (hz.g) objD6;
                zt2.c cVar3 = this.checkCompanyCityCorrectUseCase;
                zt2.c.Params params12 = new zt2.c.Params(params2.getCity());
                cVar.f237322d = params2;
                cVar.f237323e = gVar;
                cVar.f237331n = 2;
                objD = cVar3.d(params12, cVar);
                if (objD != objE) {
                    params3 = params2;
                    gVar2 = gVar;
                    objD6 = objD;
                    gVar3 = (hz.g) objD6;
                    gVarA = this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(c0.g(params3.getPostalCode()), false, 2, null));
                    f fVar2 = this.checkCompanyStreetCorrectUseCase;
                    f.Params params13 = new f.Params(params3.getStreet());
                    cVar.f237322d = params3;
                    cVar.f237323e = gVar2;
                    cVar.f237324f = gVar3;
                    cVar.f237325g = gVarA;
                    cVar.f237331n = 3;
                    objD2 = fVar2.d(params13, cVar);
                    if (objD2 != objE) {
                        gVar4 = gVar3;
                        objD6 = objD2;
                        Params params14 = params3;
                        gVar5 = gVar2;
                        params4 = params14;
                        gVar6 = (hz.g) objD6;
                        zt2.b bVar2 = this.checkCompanyBuildingNumberCorrectUseCase;
                        zt2.b.Params params15 = new zt2.b.Params(params4.getBuildingNumber());
                        cVar.f237322d = params4;
                        cVar.f237323e = gVar5;
                        cVar.f237324f = gVar4;
                        cVar.f237325g = gVarA;
                        cVar.f237326h = gVar6;
                        cVar.f237331n = 4;
                        objD3 = bVar2.d(params15, cVar);
                        if (objD3 != objE) {
                            params5 = params4;
                            gVar7 = gVar6;
                            objD6 = objD3;
                            gVar8 = (hz.g) objD6;
                            a aVar2 = this.checkCompanyApartmentNumberCorrectUseCase;
                            a.Params params16 = new a.Params(params5.getApartmentNumber());
                            cVar.f237322d = params5;
                            cVar.f237323e = gVar5;
                            cVar.f237324f = gVar4;
                            cVar.f237325g = gVarA;
                            cVar.f237326h = gVar7;
                            cVar.f237327j = gVar8;
                            cVar.f237331n = 5;
                            objD4 = aVar2.d(params16, cVar);
                            if (objD4 != objE) {
                                hz.g gVar24 = gVar7;
                                gVar9 = gVar8;
                                objD6 = objD4;
                                gVar10 = gVar5;
                                gVar11 = gVar4;
                                gVar12 = gVarA;
                                gVar13 = gVar24;
                                gVar14 = (hz.g) objD6;
                                CompanyIdData companyIdData2 = params5.getCompanyIdData();
                                cVar.f237322d = vq.j.a(params5);
                                cVar.f237323e = gVar10;
                                cVar.f237324f = gVar11;
                                cVar.f237325g = gVar12;
                                cVar.f237326h = gVar13;
                                cVar.f237327j = gVar9;
                                cVar.f237328k = gVar14;
                                cVar.f237331n = 6;
                                objD5 = d(companyIdData2, cVar);
                                if (objD5 != objE) {
                                    hz.g gVar25 = gVar11;
                                    gVar15 = gVar9;
                                    gVar16 = gVar25;
                                    hz.g gVar26 = gVar12;
                                    gVar17 = gVar13;
                                    gVar18 = gVar26;
                                    gVar19 = gVar10;
                                    gVar20 = gVar14;
                                    objD6 = objD5;
                                    return new CompanyDataValidation(gVar19, gVar16, gVar18, gVar17, gVar15, gVar20, (hz.g) objD6);
                                }
                            }
                        }
                    }
                }
                return objE;
            case 2:
                gVar2 = (hz.g) cVar.f237323e;
                Params params17 = (Params) cVar.f237322d;
                oq.u.b(objD6);
                params3 = params17;
                gVar3 = (hz.g) objD6;
                gVarA = this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(c0.g(params3.getPostalCode()), false, 2, null));
                f fVar3 = this.checkCompanyStreetCorrectUseCase;
                f.Params params18 = new f.Params(params3.getStreet());
                cVar.f237322d = params3;
                cVar.f237323e = gVar2;
                cVar.f237324f = gVar3;
                cVar.f237325g = gVarA;
                cVar.f237331n = 3;
                objD2 = fVar3.d(params18, cVar);
                if (objD2 != objE) {
                    gVar4 = gVar3;
                    objD6 = objD2;
                    Params params19 = params3;
                    gVar5 = gVar2;
                    params4 = params19;
                    gVar6 = (hz.g) objD6;
                    zt2.b bVar3 = this.checkCompanyBuildingNumberCorrectUseCase;
                    zt2.b.Params params110 = new zt2.b.Params(params4.getBuildingNumber());
                    cVar.f237322d = params4;
                    cVar.f237323e = gVar5;
                    cVar.f237324f = gVar4;
                    cVar.f237325g = gVarA;
                    cVar.f237326h = gVar6;
                    cVar.f237331n = 4;
                    objD3 = bVar3.d(params110, cVar);
                    if (objD3 != objE) {
                        params5 = params4;
                        gVar7 = gVar6;
                        objD6 = objD3;
                        gVar8 = (hz.g) objD6;
                        a aVar3 = this.checkCompanyApartmentNumberCorrectUseCase;
                        a.Params params111 = new a.Params(params5.getApartmentNumber());
                        cVar.f237322d = params5;
                        cVar.f237323e = gVar5;
                        cVar.f237324f = gVar4;
                        cVar.f237325g = gVarA;
                        cVar.f237326h = gVar7;
                        cVar.f237327j = gVar8;
                        cVar.f237331n = 5;
                        objD4 = aVar3.d(params111, cVar);
                        if (objD4 != objE) {
                            hz.g gVar27 = gVar7;
                            gVar9 = gVar8;
                            objD6 = objD4;
                            gVar10 = gVar5;
                            gVar11 = gVar4;
                            gVar12 = gVarA;
                            gVar13 = gVar27;
                            gVar14 = (hz.g) objD6;
                            CompanyIdData companyIdData3 = params5.getCompanyIdData();
                            cVar.f237322d = vq.j.a(params5);
                            cVar.f237323e = gVar10;
                            cVar.f237324f = gVar11;
                            cVar.f237325g = gVar12;
                            cVar.f237326h = gVar13;
                            cVar.f237327j = gVar9;
                            cVar.f237328k = gVar14;
                            cVar.f237331n = 6;
                            objD5 = d(companyIdData3, cVar);
                            if (objD5 != objE) {
                                hz.g gVar28 = gVar11;
                                gVar15 = gVar9;
                                gVar16 = gVar28;
                                hz.g gVar29 = gVar12;
                                gVar17 = gVar13;
                                gVar18 = gVar29;
                                gVar19 = gVar10;
                                gVar20 = gVar14;
                                objD6 = objD5;
                                return new CompanyDataValidation(gVar19, gVar16, gVar18, gVar17, gVar15, gVar20, (hz.g) objD6);
                            }
                        }
                    }
                }
                return objE;
            case 3:
                hz.g gVar30 = (hz.g) cVar.f237325g;
                hz.g gVar31 = (hz.g) cVar.f237324f;
                hz.g gVar32 = (hz.g) cVar.f237323e;
                Params params20 = (Params) cVar.f237322d;
                oq.u.b(objD6);
                gVarA = gVar30;
                params4 = params20;
                gVar5 = gVar32;
                gVar4 = gVar31;
                gVar6 = (hz.g) objD6;
                zt2.b bVar4 = this.checkCompanyBuildingNumberCorrectUseCase;
                zt2.b.Params params112 = new zt2.b.Params(params4.getBuildingNumber());
                cVar.f237322d = params4;
                cVar.f237323e = gVar5;
                cVar.f237324f = gVar4;
                cVar.f237325g = gVarA;
                cVar.f237326h = gVar6;
                cVar.f237331n = 4;
                objD3 = bVar4.d(params112, cVar);
                if (objD3 != objE) {
                    params5 = params4;
                    gVar7 = gVar6;
                    objD6 = objD3;
                    gVar8 = (hz.g) objD6;
                    a aVar4 = this.checkCompanyApartmentNumberCorrectUseCase;
                    a.Params params113 = new a.Params(params5.getApartmentNumber());
                    cVar.f237322d = params5;
                    cVar.f237323e = gVar5;
                    cVar.f237324f = gVar4;
                    cVar.f237325g = gVarA;
                    cVar.f237326h = gVar7;
                    cVar.f237327j = gVar8;
                    cVar.f237331n = 5;
                    objD4 = aVar4.d(params113, cVar);
                    if (objD4 != objE) {
                        hz.g gVar210 = gVar7;
                        gVar9 = gVar8;
                        objD6 = objD4;
                        gVar10 = gVar5;
                        gVar11 = gVar4;
                        gVar12 = gVarA;
                        gVar13 = gVar210;
                        gVar14 = (hz.g) objD6;
                        CompanyIdData companyIdData4 = params5.getCompanyIdData();
                        cVar.f237322d = vq.j.a(params5);
                        cVar.f237323e = gVar10;
                        cVar.f237324f = gVar11;
                        cVar.f237325g = gVar12;
                        cVar.f237326h = gVar13;
                        cVar.f237327j = gVar9;
                        cVar.f237328k = gVar14;
                        cVar.f237331n = 6;
                        objD5 = d(companyIdData4, cVar);
                        if (objD5 != objE) {
                            hz.g gVar211 = gVar11;
                            gVar15 = gVar9;
                            gVar16 = gVar211;
                            hz.g gVar212 = gVar12;
                            gVar17 = gVar13;
                            gVar18 = gVar212;
                            gVar19 = gVar10;
                            gVar20 = gVar14;
                            objD6 = objD5;
                            return new CompanyDataValidation(gVar19, gVar16, gVar18, gVar17, gVar15, gVar20, (hz.g) objD6);
                        }
                    }
                }
                return objE;
            case 4:
                gVar7 = (hz.g) cVar.f237326h;
                gVarA = (hz.g) cVar.f237325g;
                gVar4 = (hz.g) cVar.f237324f;
                gVar5 = (hz.g) cVar.f237323e;
                Params params21 = (Params) cVar.f237322d;
                oq.u.b(objD6);
                params5 = params21;
                gVar8 = (hz.g) objD6;
                a aVar5 = this.checkCompanyApartmentNumberCorrectUseCase;
                a.Params params114 = new a.Params(params5.getApartmentNumber());
                cVar.f237322d = params5;
                cVar.f237323e = gVar5;
                cVar.f237324f = gVar4;
                cVar.f237325g = gVarA;
                cVar.f237326h = gVar7;
                cVar.f237327j = gVar8;
                cVar.f237331n = 5;
                objD4 = aVar5.d(params114, cVar);
                if (objD4 != objE) {
                    hz.g gVar213 = gVar7;
                    gVar9 = gVar8;
                    objD6 = objD4;
                    gVar10 = gVar5;
                    gVar11 = gVar4;
                    gVar12 = gVarA;
                    gVar13 = gVar213;
                    gVar14 = (hz.g) objD6;
                    CompanyIdData companyIdData5 = params5.getCompanyIdData();
                    cVar.f237322d = vq.j.a(params5);
                    cVar.f237323e = gVar10;
                    cVar.f237324f = gVar11;
                    cVar.f237325g = gVar12;
                    cVar.f237326h = gVar13;
                    cVar.f237327j = gVar9;
                    cVar.f237328k = gVar14;
                    cVar.f237331n = 6;
                    objD5 = d(companyIdData5, cVar);
                    if (objD5 != objE) {
                        hz.g gVar214 = gVar11;
                        gVar15 = gVar9;
                        gVar16 = gVar214;
                        hz.g gVar215 = gVar12;
                        gVar17 = gVar13;
                        gVar18 = gVar215;
                        gVar19 = gVar10;
                        gVar20 = gVar14;
                        objD6 = objD5;
                        return new CompanyDataValidation(gVar19, gVar16, gVar18, gVar17, gVar15, gVar20, (hz.g) objD6);
                    }
                }
                return objE;
            case 5:
                gVar9 = (hz.g) cVar.f237327j;
                gVar13 = (hz.g) cVar.f237326h;
                gVar12 = (hz.g) cVar.f237325g;
                gVar11 = (hz.g) cVar.f237324f;
                gVar10 = (hz.g) cVar.f237323e;
                params5 = (Params) cVar.f237322d;
                oq.u.b(objD6);
                gVar14 = (hz.g) objD6;
                CompanyIdData companyIdData6 = params5.getCompanyIdData();
                cVar.f237322d = vq.j.a(params5);
                cVar.f237323e = gVar10;
                cVar.f237324f = gVar11;
                cVar.f237325g = gVar12;
                cVar.f237326h = gVar13;
                cVar.f237327j = gVar9;
                cVar.f237328k = gVar14;
                cVar.f237331n = 6;
                objD5 = d(companyIdData6, cVar);
                if (objD5 != objE) {
                    hz.g gVar216 = gVar11;
                    gVar15 = gVar9;
                    gVar16 = gVar216;
                    hz.g gVar217 = gVar12;
                    gVar17 = gVar13;
                    gVar18 = gVar217;
                    gVar19 = gVar10;
                    gVar20 = gVar14;
                    objD6 = objD5;
                    return new CompanyDataValidation(gVar19, gVar16, gVar18, gVar17, gVar15, gVar20, (hz.g) objD6);
                }
                return objE;
            case 6:
                hz.g gVar33 = (hz.g) cVar.f237328k;
                hz.g gVar34 = (hz.g) cVar.f237327j;
                hz.g gVar35 = (hz.g) cVar.f237326h;
                hz.g gVar36 = (hz.g) cVar.f237325g;
                hz.g gVar37 = (hz.g) cVar.f237324f;
                hz.g gVar38 = (hz.g) cVar.f237323e;
                oq.u.b(objD6);
                gVar20 = gVar33;
                gVar19 = gVar38;
                gVar15 = gVar34;
                gVar16 = gVar37;
                gVar17 = gVar35;
                gVar18 = gVar36;
                return new CompanyDataValidation(gVar19, gVar16, gVar18, gVar17, gVar15, gVar20, (hz.g) objD6);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
