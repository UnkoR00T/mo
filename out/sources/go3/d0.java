package go3;

import co3.VerificationDecryptedData;
import jr0.DrivingLicenceScope;
import jr0.NipipScope;
import jr0.PersonalDataScope8;
import k34.AdvocateDataModel;
import k34.DeputyCardModel;
import k34.FamilyDataModel;
import k34.JuniorSchoolCardData;
import k34.PensionerCardDocumentData;
import k34.RailwayCardDocumentData;
import k34.StudentCardDocumentData;
import k34.WruDocumentData;
import l34.DynamicDocumentVerification;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030'2\u0006\u0010&\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lgo3/d0;", "", "Lgo3/d0$a;", "Lco3/s;", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Lez/e;", "dateFormatter", "Lq34/p;", "decodeNipipDataUseCase", "Lq34/o;", "decodeMIdCardDataUseCase", "Lq34/h;", "decodeAdvocateCardDataUseCase", "Lq34/m;", "decodeFamilyCardDataUseCase", "Lq34/n;", "decodeJuniorSchoolCardDataUseCase", "Lq34/s;", "decodeStudentCardDataUseCase", "Lq34/q;", "decodePensionerCardDataUseCase", "Lq34/r;", "decodeRailwayCardDataUseCase", "Lq34/i;", "decodeDeputyCardDataUseCase", "Lq34/j;", "decodeDiiaDataUseCase", "Lq34/k;", "decodeDrivingLicenceDataUseCase", "Lq34/t;", "decodeWruDataUseCase", "Lq34/l;", "decodeDynamicDocumentVerificationDataUseCase", "<init>", "(Liy/j;Liy/a;Lez/e;Lq34/p;Lq34/o;Lq34/h;Lq34/m;Lq34/n;Lq34/s;Lq34/q;Lq34/r;Lq34/i;Lq34/j;Lq34/k;Lq34/t;Lq34/l;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/d0$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/j;", "b", "Liy/a;", "c", "Lez/e;", "Lq34/p;", "e", "Lq34/o;", "f", "Lq34/h;", "g", "Lq34/m;", "h", "Lq34/n;", "i", "Lq34/s;", "j", "Lq34/q;", "k", "Lq34/r;", "l", "Lq34/i;", "m", "Lq34/j;", "n", "Lq34/k;", "o", "Lq34/t;", "p", "Lq34/l;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q34.p decodeNipipDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q34.o decodeMIdCardDataUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q34.h decodeAdvocateCardDataUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final q34.m decodeFamilyCardDataUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q34.n decodeJuniorSchoolCardDataUseCase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final q34.s decodeStudentCardDataUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final q34.q decodePensionerCardDataUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final q34.r decodeRailwayCardDataUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final q34.i decodeDeputyCardDataUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final q34.j decodeDiiaDataUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final q34.k decodeDrivingLicenceDataUseCase;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final q34.t decodeWruDataUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final q34.l decodeDynamicDocumentVerificationDataUseCase;

    /* JADX INFO: renamed from: go3.d0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/d0$a;", "Lgz/b$a;", "Lco3/r;", "data", "<init>", "(Lco3/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/r;", "()Lco3/r;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerificationDecryptedData data;

        public Params(VerificationDecryptedData verificationDecryptedData) {
            this.data = verificationDecryptedData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VerificationDecryptedData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f75358h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f75360k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75358h = obj;
            this.f75360k |= PKIFailureInfo.systemUnavail;
            return d0.this.d(null, this);
        }
    }

    public d0(iy.j jVar, iy.a aVar, ez.e eVar, q34.p pVar, q34.o oVar, q34.h hVar, q34.m mVar, q34.n nVar, q34.s sVar, q34.q qVar, q34.r rVar, q34.i iVar, q34.j jVar2, q34.k kVar, q34.t tVar, q34.l lVar) {
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.dateFormatter = eVar;
        this.decodeNipipDataUseCase = pVar;
        this.decodeMIdCardDataUseCase = oVar;
        this.decodeAdvocateCardDataUseCase = hVar;
        this.decodeFamilyCardDataUseCase = mVar;
        this.decodeJuniorSchoolCardDataUseCase = nVar;
        this.decodeStudentCardDataUseCase = sVar;
        this.decodePensionerCardDataUseCase = qVar;
        this.decodeRailwayCardDataUseCase = rVar;
        this.decodeDeputyCardDataUseCase = iVar;
        this.decodeDiiaDataUseCase = jVar2;
        this.decodeDrivingLicenceDataUseCase = kVar;
        this.decodeWruDataUseCase = tVar;
        this.decodeDynamicDocumentVerificationDataUseCase = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:102:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:104:0x030e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0343 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0344  */
    /* JADX WARN: Code duplicated, block: B:117:0x0348  */
    /* JADX WARN: Code duplicated, block: B:119:0x035b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0390 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x0391  */
    /* JADX WARN: Code duplicated, block: B:132:0x0395  */
    /* JADX WARN: Code duplicated, block: B:134:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x03dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:145:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x0436 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:165:0x0437  */
    /* JADX WARN: Code duplicated, block: B:167:0x043b  */
    /* JADX WARN: Code duplicated, block: B:169:0x044e  */
    /* JADX WARN: Code duplicated, block: B:234:0x050c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:235:0x050d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0511  */
    /* JADX WARN: Code duplicated, block: B:239:0x0524  */
    /* JADX WARN: Code duplicated, block: B:251:0x055f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:252:0x0560  */
    /* JADX WARN: Code duplicated, block: B:254:0x0564  */
    /* JADX WARN: Code duplicated, block: B:256:0x0577  */
    /* JADX WARN: Code duplicated, block: B:266:0x05ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:267:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:269:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:279:0x05ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:280:0x0600  */
    /* JADX WARN: Code duplicated, block: B:282:0x0604  */
    /* JADX WARN: Code duplicated, block: B:284:0x061f  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x01de  */
    /* JADX WARN: Code duplicated, block: B:54:0x0211 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0212  */
    /* JADX WARN: Code duplicated, block: B:57:0x0216  */
    /* JADX WARN: Code duplicated, block: B:59:0x0229  */
    /* JADX WARN: Code duplicated, block: B:69:0x025d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x025e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0262  */
    /* JADX WARN: Code duplicated, block: B:74:0x0275  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f6 A[RETURN] */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, ? extends co3.s>> eVar) throws Throwable {
        b bVar;
        Params params2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        dx.i iVar;
        dx.i iVar2;
        dx.i iVar3;
        dx.i iVar4;
        dx.i iVar5;
        dx.i iVar6;
        dx.i iVar7;
        dx.i iVar8;
        dx.i iVar9;
        dx.i iVar10;
        dx.i iVar11;
        dx.i iVar12;
        dx.i iVar13;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f75360k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f75360k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f75358h;
        Object objE = uq.b.e();
        switch (bVar.f75360k) {
            case 0:
                oq.u.b(objC);
                iy.j jVar = this.cmsManager;
                dx.i iVarC = iy.a.c(this.base64Coder, params.getData().getCitizenData(), null, 2, null);
                if (iVarC instanceof dx.i.Left) {
                    return new dx.i.Left((dx.b) ((dx.i.Left) iVarC).b());
                }
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                String strA = jVar.a((byte[]) ((dx.i.Right) iVarC).b());
                String strD = this.dateFormatter.d(new fz.b.Long(params.getData().getVerificationDateTime()), fz.c.FULL_MONTH_DATE_TIME_COMMA);
                String picture = params.getData().getPicture();
                int scope = params.getData().getScope();
                if (scope == 8) {
                    q34.o oVar = this.decodeMIdCardDataUseCase;
                    q34.o.Params params3 = new q34.o.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 1;
                    objC = oVar.c(params3, bVar);
                    if (objC != objE) {
                        str25 = strD;
                        str26 = picture;
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            return iVar;
                        }
                        if (iVar instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.MIdData(str26, str25, (PersonalDataScope8) ((dx.i.Right) iVar).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 1002) {
                    q34.n nVar = this.decodeJuniorSchoolCardDataUseCase;
                    q34.n.Params params4 = new q34.n.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 2;
                    objC = nVar.c(params4, bVar);
                    if (objC != objE) {
                        str23 = strD;
                        str24 = picture;
                        iVar2 = (dx.i) objC;
                        if (iVar2 instanceof dx.i.Left) {
                            return iVar2;
                        }
                        if (iVar2 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.JuniorSchoolData(str24, str23, (JuniorSchoolCardData) ((dx.i.Right) iVar2).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 2001) {
                    q34.s sVar = this.decodeStudentCardDataUseCase;
                    q34.s.Params params5 = new q34.s.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 3;
                    objC = sVar.c(params5, bVar);
                    if (objC != objE) {
                        str21 = strD;
                        str22 = picture;
                        iVar3 = (dx.i) objC;
                        if (iVar3 instanceof dx.i.Left) {
                            return iVar3;
                        }
                        if (iVar3 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.StudentData(str22, str21, (StudentCardDocumentData) ((dx.i.Right) iVar3).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 3001) {
                    q34.j jVar2 = this.decodeDiiaDataUseCase;
                    q34.j.Params params6 = new q34.j.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 4;
                    objC = jVar2.c(params6, bVar);
                    if (objC != objE) {
                        str19 = strD;
                        str20 = picture;
                        iVar4 = (dx.i) objC;
                        if (iVar4 instanceof dx.i.Left) {
                            return iVar4;
                        }
                        if (iVar4 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.DiiaData(str20, str19, (o34.c) ((dx.i.Right) iVar4).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 1000000) {
                    q34.k kVar = this.decodeDrivingLicenceDataUseCase;
                    q34.k.Params params7 = new q34.k.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 5;
                    objC = kVar.c(params7, bVar);
                    if (objC != objE) {
                        str17 = strD;
                        str18 = picture;
                        iVar5 = (dx.i) objC;
                        if (iVar5 instanceof dx.i.Left) {
                            return iVar5;
                        }
                        if (iVar5 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.DrivingLicenceData(str18, str17, (DrivingLicenceScope) ((dx.i.Right) iVar5).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 1000400) {
                    q34.i iVar14 = this.decodeDeputyCardDataUseCase;
                    q34.i.Params params8 = new q34.i.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 6;
                    objC = iVar14.c(params8, bVar);
                    if (objC != objE) {
                        str15 = strD;
                        str16 = picture;
                        iVar6 = (dx.i) objC;
                        if (iVar6 instanceof dx.i.Left) {
                            return iVar6;
                        }
                        if (iVar6 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.DeputyData(str16, str15, (DeputyCardModel) ((dx.i.Right) iVar6).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 1001000) {
                    q34.m mVar = this.decodeFamilyCardDataUseCase;
                    q34.m.Params params9 = new q34.m.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 7;
                    objC = mVar.c(params9, bVar);
                    if (objC != objE) {
                        str13 = strD;
                        str14 = picture;
                        iVar7 = (dx.i) objC;
                        if (iVar7 instanceof dx.i.Left) {
                            return iVar7;
                        }
                        if (iVar7 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.FamilyCardData(str14, str13, (FamilyDataModel) ((dx.i.Right) iVar7).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 1003000) {
                    q34.q qVar = this.decodePensionerCardDataUseCase;
                    q34.q.Params params10 = new q34.q.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 8;
                    objC = qVar.c(params10, bVar);
                    if (objC != objE) {
                        str11 = strD;
                        str12 = picture;
                        iVar8 = (dx.i) objC;
                        if (iVar8 instanceof dx.i.Left) {
                            return iVar8;
                        }
                        if (iVar8 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.PensionerData(str12, str11, (PensionerCardDocumentData) ((dx.i.Right) iVar8).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 3000000 || scope == 3000001) {
                    q34.p pVar = this.decodeNipipDataUseCase;
                    q34.p.Params params11 = new q34.p.Params(strA);
                    bVar.f75354d = params;
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 9;
                    objC = pVar.c(params11, bVar);
                    if (objC != objE) {
                        params2 = params;
                        str = strD;
                        str2 = picture;
                        iVar9 = (dx.i) objC;
                        if (iVar9 instanceof dx.i.Left) {
                            return iVar9;
                        }
                        if (iVar9 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.NipipData(str2, str, (NipipScope) ((dx.i.Right) iVar9).b(), params2.getData().getScope()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 3001000) {
                    q34.h hVar = this.decodeAdvocateCardDataUseCase;
                    q34.h.Params params12 = new q34.h.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 10;
                    objC = hVar.c(params12, bVar);
                    if (objC != objE) {
                        str9 = strD;
                        str10 = picture;
                        iVar10 = (dx.i) objC;
                        if (iVar10 instanceof dx.i.Left) {
                            return iVar10;
                        }
                        if (iVar10 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.AdvocateData(str10, str9, (AdvocateDataModel) ((dx.i.Right) iVar10).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 3002000 || scope == 3002001 || scope == 3003000 || scope == 3004000 || scope == 3003001 || scope == 1002000 || scope == 3005000 || scope == 3006000 || scope == 3007000 || scope == 3008000 || scope == 1003 || scope == 5001000 || scope == 1004000 || scope == 3009000 || scope == 3010000 || scope == 5002000 || scope == 5003000 || scope == 5004000 || scope == 5005000 || scope == 5006000 || scope == 5007000 || scope == 5008000 || scope == 1005000 || scope == 1005001 || scope == 1005002 || scope == 3011000 || scope == 3012000) {
                    q34.l lVar = this.decodeDynamicDocumentVerificationDataUseCase;
                    q34.l.Params params13 = new q34.l.Params(strA, params.getData().getSchema());
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 11;
                    objC = lVar.c(params13, bVar);
                    if (objC != objE) {
                        str3 = strD;
                        str4 = picture;
                        iVar11 = (dx.i) objC;
                        if (iVar11 instanceof dx.i.Left) {
                            return iVar11;
                        }
                        if (iVar11 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.DynamicDocumentData(str4, str3, (DynamicDocumentVerification) ((dx.i.Right) iVar11).b()));
                        }
                        throw new oq.p();
                    }
                } else if (scope == 5000000) {
                    q34.r rVar = this.decodeRailwayCardDataUseCase;
                    q34.r.Params params14 = new q34.r.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 12;
                    objC = rVar.c(params14, bVar);
                    if (objC != objE) {
                        str7 = strD;
                        str8 = picture;
                        iVar12 = (dx.i) objC;
                        if (iVar12 instanceof dx.i.Left) {
                            return iVar12;
                        }
                        if (iVar12 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.RailwayCardData(str8, str7, (RailwayCardDocumentData) ((dx.i.Right) iVar12).b()));
                        }
                        throw new oq.p();
                    }
                } else {
                    if (7000000 > scope || scope >= 8000000) {
                        return new dx.i.Left(new dx.b.Generic(null, 1, null));
                    }
                    q34.t tVar = this.decodeWruDataUseCase;
                    q34.t.Params params15 = new q34.t.Params(strA);
                    bVar.f75354d = vq.j.a(params);
                    bVar.f75355e = vq.j.a(strA);
                    bVar.f75356f = strD;
                    bVar.f75357g = picture;
                    bVar.f75360k = 13;
                    objC = tVar.c(params15, bVar);
                    if (objC != objE) {
                        str5 = strD;
                        str6 = picture;
                        iVar13 = (dx.i) objC;
                        if (iVar13 instanceof dx.i.Left) {
                            return iVar13;
                        }
                        if (iVar13 instanceof dx.i.Right) {
                            return new dx.i.Right(new co3.s.WruData(str6, str5, (WruDocumentData) ((dx.i.Right) iVar13).b()));
                        }
                        throw new oq.p();
                    }
                }
                return objE;
            case 1:
                str26 = (String) bVar.f75357g;
                str25 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar = (dx.i) objC;
                if (iVar instanceof dx.i.Left) {
                    return iVar;
                }
                if (iVar instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.MIdData(str26, str25, (PersonalDataScope8) ((dx.i.Right) iVar).b()));
                }
                throw new oq.p();
            case 2:
                str24 = (String) bVar.f75357g;
                str23 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar2 = (dx.i) objC;
                if (iVar2 instanceof dx.i.Left) {
                    return iVar2;
                }
                if (iVar2 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.JuniorSchoolData(str24, str23, (JuniorSchoolCardData) ((dx.i.Right) iVar2).b()));
                }
                throw new oq.p();
            case 3:
                str22 = (String) bVar.f75357g;
                str21 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar3 = (dx.i) objC;
                if (iVar3 instanceof dx.i.Left) {
                    return iVar3;
                }
                if (iVar3 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.StudentData(str22, str21, (StudentCardDocumentData) ((dx.i.Right) iVar3).b()));
                }
                throw new oq.p();
            case 4:
                str20 = (String) bVar.f75357g;
                str19 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar4 = (dx.i) objC;
                if (iVar4 instanceof dx.i.Left) {
                    return iVar4;
                }
                if (iVar4 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.DiiaData(str20, str19, (o34.c) ((dx.i.Right) iVar4).b()));
                }
                throw new oq.p();
            case 5:
                str18 = (String) bVar.f75357g;
                str17 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar5 = (dx.i) objC;
                if (iVar5 instanceof dx.i.Left) {
                    return iVar5;
                }
                if (iVar5 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.DrivingLicenceData(str18, str17, (DrivingLicenceScope) ((dx.i.Right) iVar5).b()));
                }
                throw new oq.p();
            case 6:
                str16 = (String) bVar.f75357g;
                str15 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar6 = (dx.i) objC;
                if (iVar6 instanceof dx.i.Left) {
                    return iVar6;
                }
                if (iVar6 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.DeputyData(str16, str15, (DeputyCardModel) ((dx.i.Right) iVar6).b()));
                }
                throw new oq.p();
            case 7:
                str14 = (String) bVar.f75357g;
                str13 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar7 = (dx.i) objC;
                if (iVar7 instanceof dx.i.Left) {
                    return iVar7;
                }
                if (iVar7 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.FamilyCardData(str14, str13, (FamilyDataModel) ((dx.i.Right) iVar7).b()));
                }
                throw new oq.p();
            case 8:
                str12 = (String) bVar.f75357g;
                str11 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar8 = (dx.i) objC;
                if (iVar8 instanceof dx.i.Left) {
                    return iVar8;
                }
                if (iVar8 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.PensionerData(str12, str11, (PensionerCardDocumentData) ((dx.i.Right) iVar8).b()));
                }
                throw new oq.p();
            case 9:
                str2 = (String) bVar.f75357g;
                str = (String) bVar.f75356f;
                params2 = (Params) bVar.f75354d;
                oq.u.b(objC);
                iVar9 = (dx.i) objC;
                if (iVar9 instanceof dx.i.Left) {
                    return iVar9;
                }
                if (iVar9 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.NipipData(str2, str, (NipipScope) ((dx.i.Right) iVar9).b(), params2.getData().getScope()));
                }
                throw new oq.p();
            case 10:
                str10 = (String) bVar.f75357g;
                str9 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar10 = (dx.i) objC;
                if (iVar10 instanceof dx.i.Left) {
                    return iVar10;
                }
                if (iVar10 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.AdvocateData(str10, str9, (AdvocateDataModel) ((dx.i.Right) iVar10).b()));
                }
                throw new oq.p();
            case 11:
                str4 = (String) bVar.f75357g;
                str3 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar11 = (dx.i) objC;
                if (iVar11 instanceof dx.i.Left) {
                    return iVar11;
                }
                if (iVar11 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.DynamicDocumentData(str4, str3, (DynamicDocumentVerification) ((dx.i.Right) iVar11).b()));
                }
                throw new oq.p();
            case 12:
                str8 = (String) bVar.f75357g;
                str7 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar12 = (dx.i) objC;
                if (iVar12 instanceof dx.i.Left) {
                    return iVar12;
                }
                if (iVar12 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.RailwayCardData(str8, str7, (RailwayCardDocumentData) ((dx.i.Right) iVar12).b()));
                }
                throw new oq.p();
            case 13:
                str6 = (String) bVar.f75357g;
                str5 = (String) bVar.f75356f;
                oq.u.b(objC);
                iVar13 = (dx.i) objC;
                if (iVar13 instanceof dx.i.Left) {
                    return iVar13;
                }
                if (iVar13 instanceof dx.i.Right) {
                    return new dx.i.Right(new co3.s.WruData(str6, str5, (WruDocumentData) ((dx.i.Right) iVar13).b()));
                }
                throw new oq.p();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
