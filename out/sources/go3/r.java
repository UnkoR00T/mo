package go3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006$"}, d2 = {"Lgo3/r;", "", "Lgo3/r$a;", "", "Lco3/q;", "Lgo3/e0;", "getWruListVerificationDataUseCase", "Lgo3/t;", "getPwzVerificationDataUseCase", "Lgo3/k;", "getDynamicDocumentVerificationDataUseCase", "Lgo3/l;", "getDynamicMultiDocumentVerificationDataUseCase", "Lwn3/b;", "verificationConfiguration", "<init>", "(Lgo3/e0;Lgo3/t;Lgo3/k;Lgo3/l;Lwn3/b;)V", "Lco3/n;", "subDocument", "", "Lco3/p;", "d", "(Lco3/n;)Ljava/lang/Iterable;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lgo3/r$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/e0;", "b", "Lgo3/t;", "c", "Lgo3/k;", "Lgo3/l;", "Lwn3/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e0 getWruListVerificationDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t getPwzVerificationDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k getDynamicDocumentVerificationDataUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l getDynamicMultiDocumentVerificationDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn3.b verificationConfiguration;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75672a;

        static {
            int[] iArr = new int[wn3.a.values().length];
            try {
                iArr[wn3.a.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wn3.a.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75672a = iArr;
        }
    }

    public r(e0 e0Var, t tVar, k kVar, l lVar, wn3.b bVar) {
        this.getWruListVerificationDataUseCase = e0Var;
        this.getPwzVerificationDataUseCase = tVar;
        this.getDynamicDocumentVerificationDataUseCase = kVar;
        this.getDynamicMultiDocumentVerificationDataUseCase = lVar;
        this.verificationConfiguration = bVar;
    }

    private final Iterable<co3.p> d(co3.n subDocument) {
        if (!(subDocument instanceof co3.n.DrivingLicenceDocument)) {
            return pq.v.n();
        }
        int i15 = b.f75672a[((co3.n.DrivingLicenceDocument) subDocument).getSubtype().ordinal()];
        if (i15 == 1) {
            return pq.v.q(co3.p.NAMES, co3.p.SURNAME, co3.p.PESEL, co3.p.BIRTH_DATE_AND_PLACE, co3.p.PICTURE, co3.p.DRIVING_LICENCE_ISSUER, co3.p.DRIVING_LICENCE_ISSUE_DATE, co3.p.DRIVING_LICENCE_EXPIRATION_DATE, co3.p.DRIVING_LICENCE_NUMBER, co3.p.DRIVING_LICENCE_CARD_NUMBER, co3.p.DRIVING_LICENCE_STATUS, co3.p.DRIVING_LICENCE_RESTRICTIONS, co3.p.DRIVING_LICENCE_CATEGORY, co3.p.DRIVING_LICENCE_CATEGORY_FIRST_ISSUE_DATE, co3.p.DRIVING_LICENCE_CATEGORY_EXPIRATION_DATE, co3.p.DRIVING_LICENCE_ENTITLEMENT_RESTRICTIONS, co3.p.ENTITLEMENTS_STATUS);
        }
        if (i15 == 2) {
            return pq.v.q(co3.p.NAMES, co3.p.SURNAME, co3.p.PESEL, co3.p.BIRTH_DATE_AND_PLACE, co3.p.PICTURE, co3.p.TEMPORARY_DRIVING_LICENCE_ISSUER_FOR_PKK, co3.p.DRIVING_LICENCE_ISSUE_DATE, co3.p.DRIVING_LICENCE_EXPIRATION_DATE, co3.p.DRIVING_LICENCE_NUMBER, co3.p.TEMPORARY_DRIVING_LICENCE_CARD_NUMBER, co3.p.TEMPORARY_DRIVING_LICENCE_STATUS, co3.p.DRIVING_LICENCE_RESTRICTIONS, co3.p.DRIVING_LICENCE_CATEGORY, co3.p.DRIVING_LICENCE_CATEGORY_FIRST_ISSUE_DATE, co3.p.DRIVING_LICENCE_CATEGORY_EXPIRATION_DATE, co3.p.DRIVING_LICENCE_ENTITLEMENT_RESTRICTIONS, co3.p.ENTITLEMENTS_STATUS);
        }
        throw new oq.p();
    }

    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends co3.q>>> eVar) {
        Iterable iterableQ;
        ArrayList arrayList;
        k34.a0 scope = params.getScope();
        if (fr.t.c(scope, k34.a0.h1.f107869a) || fr.t.c(scope, k34.a0.g1.f107866a) || fr.t.c(scope, k34.a0.f1.f107863a) || fr.t.c(scope, k34.a0.y0.f107903a) || fr.t.c(scope, k34.a0.p0.f107885a) || fr.t.c(scope, k34.a0.o0.f107883a) || fr.t.c(scope, k34.a0.q0.f107887a) || fr.t.c(scope, k34.a0.a1.f107848a) || fr.t.c(scope, k34.a0.i0.f107871a) || fr.t.c(scope, k34.a0.c.f107852a) || fr.t.c(scope, k34.a0.e.f107858a) || fr.t.c(scope, k34.a0.d.f107855a) || fr.t.c(scope, k34.a0.g0.f107865a) || fr.t.c(scope, k34.a0.f0.f107862a) || fr.t.c(scope, k34.a0.z0.f107905a) || fr.t.c(scope, k34.a0.t0.f107893a) || fr.t.c(scope, k34.a0.k.f107874a) || fr.t.c(scope, k34.a0.v0.f107897a) || fr.t.c(scope, k34.a0.w0.f107899a) || fr.t.c(scope, k34.a0.u0.f107895a) || fr.t.c(scope, k34.a0.c1.f107854a) || fr.t.c(scope, k34.a0.d0.f107856a) || fr.t.c(scope, k34.a0.k0.f107875a) || fr.t.c(scope, k34.a0.j0.f107873a) || fr.t.c(scope, k34.a0.b1.f107851a) || fr.t.c(scope, k34.a0.l0.f107877a) || fr.t.c(scope, k34.a0.l.f107876a) || fr.t.c(scope, k34.a0.r0.f107889a) || fr.t.c(scope, k34.a0.b.f107849a) || fr.t.c(scope, k34.a0.e1.f107860a) || fr.t.c(scope, k34.a0.m0.f107879a) || fr.t.c(scope, k34.a0.e0.f107859a) || fr.t.c(scope, k34.a0.d1.f107857a) || fr.t.c(scope, k34.a0.c0.f107853a) || fr.t.c(scope, k34.a0.j.f107872a)) {
            return this.getWruListVerificationDataUseCase.d(new e0.Params(params.getScope()), eVar);
        }
        if (fr.t.c(scope, k34.a0.n0.f107881a) || fr.t.c(scope, k34.a0.h0.f107868a)) {
            return this.getPwzVerificationDataUseCase.e(new t.Params(params.getScope()), eVar);
        }
        if (scope instanceof k34.a0.DynamicDocument) {
            return this.getDynamicDocumentVerificationDataUseCase.f(new k.Params(params.getScope(), params.getEntryPoint()), eVar);
        }
        if (scope instanceof k34.a0.DynamicMultiDocument) {
            return this.getDynamicMultiDocumentVerificationDataUseCase.f(new l.Params(params.getScope(), params.getEntryPoint(), params.getHasPicture()), eVar);
        }
        k34.a0 scope2 = params.getScope();
        if (fr.t.c(scope2, k34.a0.m.f107878a)) {
            arrayList = new ArrayList();
            arrayList.add(co3.p.NAMES);
            arrayList.add(co3.p.SURNAME);
            arrayList.add(co3.p.PESEL);
            Integer institutionId = params.getInstitutionId();
            int wkIdentifier = this.verificationConfiguration.getWkIdentifier();
            if (institutionId == null || institutionId.intValue() != wkIdentifier) {
                iterableQ = arrayList;
                arrayList.add(co3.p.NATIONALITY);
                iterableQ = arrayList;
            }
        } else if (fr.t.c(scope2, k34.a0.n.f107880a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.BIRTH_DATE, co3.p.BIRTH_PLACE, co3.p.IDENTITY_CARD_ID, co3.p.IDENTITY_CARD_EXPIRATION_DATE, co3.p.ISSUING_AUTHORITY);
        } else if (fr.t.c(scope2, k34.a0.o.f107882a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL);
        } else if (fr.t.c(scope2, k34.a0.p.f107884a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.IDENTITY_CARD_ID, co3.p.ISSUING_AUTHORITY);
        } else if (fr.t.c(scope2, k34.a0.q.f107886a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.BIRTH_DATE, co3.p.BIRTH_PLACE, co3.p.FAMILY_SURNAME, co3.p.FATHER_NAME, co3.p.FATHER_FAMILY_SURNAME, co3.p.MOTHER_NAME, co3.p.MOTHER_FAMILY_SURNAME, co3.p.BIRTH_PLACE_COUNTRY, co3.p.SEX, co3.p.NATIONALITY, co3.p.REGISTERED_ADDRESS, co3.p.REGISTERED_DATE, co3.p.IDENTITY_CARD_ID, co3.p.IDENTITY_CARD_EXPIRATION_DATE, co3.p.ISSUING_AUTHORITY);
        } else if (fr.t.c(scope2, k34.a0.r.f107888a)) {
            iterableQ = pq.v.q(co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.IDENTITY_CARD_ID, co3.p.IDENTITY_CARD_EXPIRATION_DATE, co3.p.ISSUING_AUTHORITY, co3.p.NATIONALITY, co3.p.BIRTH_PLACE_COUNTRY);
        } else if (fr.t.c(scope2, k34.a0.s.f107890a)) {
            iterableQ = pq.v.q(co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.IDENTITY_CARD_ID);
        } else if (fr.t.c(scope2, k34.a0.t.f107892a)) {
            iterableQ = pq.v.q(co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.IDENTITY_CARD_ID, co3.p.NATIONALITY, co3.p.BIRTH_PLACE_COUNTRY);
        } else if (fr.t.c(scope2, k34.a0.u.f107894a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.BIRTH_DATE, co3.p.NATIONALITY, co3.p.FATHER_NAME, co3.p.MOTHER_NAME, co3.p.MOBYWATEL_SERIES_NUMBER, co3.p.MOBYWATEL_EXPIRATION_DATE, co3.p.MOBYWATEL_ISSUANCE_DATE);
        } else if (fr.t.c(scope2, k34.a0.v.f107896a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.BIRTH_DATE, co3.p.NATIONALITY, co3.p.FATHER_NAME, co3.p.MOTHER_NAME, co3.p.MOBYWATEL_SERIES_NUMBER, co3.p.MOBYWATEL_EXPIRATION_DATE, co3.p.MOBYWATEL_ISSUANCE_DATE, co3.p.BIRTH_PLACE, co3.p.BIRTH_PLACE_COUNTRY, co3.p.REGISTERED_ADDRESS, co3.p.REGISTERED_DATE, co3.p.FAMILY_SURNAME, co3.p.FATHER_FAMILY_SURNAME, co3.p.MOTHER_FAMILY_SURNAME, co3.p.SEX, co3.p.IDENTITY_CARD_ID, co3.p.IDENTITY_CARD_EXPIRATION_DATE, co3.p.IDENTITY_CARD_STATUS, co3.p.IDENTITY_CARD_CREATION_DATE, co3.p.ISSUING_AUTHORITY, co3.p.IDENTITY_CARD_REVOCATION_DATE, co3.p.IDENTITY_CARD_SUSPENSION_DATE);
        } else if (fr.t.c(scope2, k34.a0.C2570a0.f107847a)) {
            iterableQ = pq.v.g(co3.p.SURNAME, co3.p.NAMES, co3.p.BIRTH_DATE, co3.p.STUDENT_CARD_NUMBER, co3.p.STUDENT_CARD_EDITION_NUMBER, co3.p.UNIVERSITY_NAME, co3.p.UNIVERSITY_ADDRESS, co3.p.STUDENT_CARD_DISTRIBUTION_DATE, co3.p.STUDENT_CARD_EXPIRATION_DATE);
        } else if (fr.t.c(scope2, k34.a0.b0.f107850a)) {
            iterableQ = pq.v.g(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.BIRTH_DATE, co3.p.STUDENT_CARD_NUMBER, co3.p.STUDENT_CARD_EDITION_NUMBER, co3.p.UNIVERSITY_NAME, co3.p.UNIVERSITY_ADDRESS, co3.p.STUDENT_CARD_DISTRIBUTION_DATE, co3.p.STUDENT_CARD_EXPIRATION_DATE, co3.p.UNIVERSITY_PHONE_NUMBER);
        } else if (fr.t.c(scope2, k34.a0.w.f107898a)) {
            iterableQ = pq.v.q(co3.p.NAMES, co3.p.SURNAME, co3.p.PESEL, co3.p.NATIONALITY);
        } else if (fr.t.c(scope2, k34.a0.x.f107900a)) {
            iterableQ = pq.v.q(co3.p.NAMES, co3.p.SURNAME, co3.p.PESEL, co3.p.NATIONALITY, co3.p.FOREIGNER_STATUS, co3.p.BIRTH_DATE, co3.p.BIRTH_PLACE_COUNTRY, co3.p.BIRTH_PLACE, co3.p.DOCUMENT_EXPIRATION_DATE, co3.p.PICTURE);
        } else if (fr.t.c(scope2, k34.a0.y.f107902a)) {
            iterableQ = pq.v.q(co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.NATIONALITY, co3.p.PICTURE);
        } else if (fr.t.c(scope2, k34.a0.z.f107904a)) {
            iterableQ = d(params.getSubDocument());
        } else if (fr.t.c(scope2, k34.a0.s0.f107891a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.PESEL, co3.p.PENSIONER_CARD_NUMBER, co3.p.PENSIONER_BENEFIT_TYPE, co3.p.PENSIONER_BENEFIT_TYPE_EXPIRATION_DATE, co3.p.PENSIONER_DOCUMENT_ISSUER, co3.p.PENSIONER_DOCUMENT_DEPARTMENT_ISSUER);
        } else if (fr.t.c(scope2, k34.a0.i.f107870a)) {
            ArrayList arrayList2 = new ArrayList();
            if (params.getHasPicture()) {
                arrayList2.add(co3.p.PICTURE);
            }
            arrayList2.add(co3.p.SURNAME);
            arrayList2.add(co3.p.NAMES);
            arrayList2.add(co3.p.PESEL);
            arrayList2.add(co3.p.FAMILY_DOCUMENT_CARD_NUMBER);
            arrayList2.add(co3.p.FAMILY_DOCUMENT_EXPIRATION_DATE);
            arrayList2.add(co3.p.FAMILY_DOCUMENT_RELATIONSHIP_TYPE);
            arrayList2.add(co3.p.FAMILY_DOCUMENT_OWNER_CARD_TYPE);
            iterableQ = arrayList2;
        } else if (fr.t.c(scope2, k34.a0.a.f107846a)) {
            iterableQ = pq.v.q(co3.p.PICTURE, co3.p.SURNAME, co3.p.NAMES, co3.p.ADVOCATE_CARD_ENTRY_NUMBER, co3.p.ADVOCATE_CARD_AUTHORIZATION_TYPE, co3.p.ADVOCATE_CARD_BAR_ASSOCIATION, co3.p.ADVOCATE_CARD_LEGITIMATION_ISSUER, co3.p.ADVOCATE_CARD_DOCUMENT_DISTRIBUTION_DATE, co3.p.ADVOCATE_CARD_DOCUMENT_EXPIRATION_DATE);
        } else if (fr.t.c(scope2, k34.a0.x0.f107901a)) {
            ArrayList arrayList3 = new ArrayList();
            if (params.getHasPicture()) {
                arrayList3.add(co3.p.PICTURE);
            }
            arrayList3.add(co3.p.NAMES);
            arrayList3.add(co3.p.SURNAME);
            arrayList3.add(co3.p.UUT_SERIAL_NUMBER);
            arrayList3.add(co3.p.UUT_NUMBER);
            arrayList3.add(co3.p.UUT_RELATION_TYPE);
            arrayList3.add(co3.p.UUT_OWNER_TYPE);
            if (params.getHasPicture()) {
                arrayList3.add(co3.p.UUT_OWNER_PESEL);
            }
            arrayList3.add(co3.p.UUT_EMPLOYER);
            arrayList3.add(co3.p.UUT_CATEGORY);
            arrayList3.add(co3.p.UUT_CLASS);
            arrayList3.add(co3.p.UUT_ANNOTATION);
            arrayList3.add(co3.p.UUT_ADDITIONAL_BENEFIT);
            arrayList3.add(co3.p.UUT_STATUS);
            arrayList3.add(co3.p.UUT_EMPLOYER_CODE);
            arrayList3.add(co3.p.UUT_DISTRIBUTION_DATE);
            arrayList3.add(co3.p.UUT_EXPIRATION_DATE);
            iterableQ = arrayList3;
        } else {
            iterableQ = fr.t.c(scope2, k34.a0.f.f107861a) ? pq.v.q(co3.p.PICTURE, co3.p.NAMES, co3.p.SURNAME, co3.p.DEPUTY_LICENCE_NUMBER, co3.p.DEPUTY_CADENCE_NUMBER, co3.p.DEPUTY_CREATION_DATE) : pq.v.n();
        }
        iterableQ = arrayList;
        ArrayList arrayList4 = new ArrayList(pq.v.y(iterableQ, 10));
        Iterator it = iterableQ.iterator();
        while (it.hasNext()) {
            arrayList4.add(new co3.q.b((co3.p) it.next()));
        }
        return new dx.i.Right(arrayList4);
    }

    /* JADX INFO: renamed from: go3.r$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0017\u0010&¨\u0006'"}, d2 = {"Lgo3/r$a;", "Lgz/b$a;", "Lk34/a0;", "scope", "", "institutionId", "", "hasPicture", "Lco3/n;", "subDocument", "Lwn3/c;", "entryPoint", "<init>", "(Lk34/a0;Ljava/lang/Integer;ZLco3/n;Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/a0;", "d", "()Lk34/a0;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Z", "()Z", "Lco3/n;", "f", "()Lco3/n;", "e", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.a0 scope;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer institutionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPicture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        public Params(k34.a0 a0Var, Integer num, boolean z15, co3.n nVar, wn3.c cVar) {
            this.scope = a0Var;
            this.institutionId = num;
            this.hasPicture = z15;
            this.subDocument = nVar;
            this.entryPoint = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasPicture() {
            return this.hasPicture;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getInstitutionId() {
            return this.institutionId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final k34.a0 getScope() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.scope, params.scope) && fr.t.c(this.institutionId, params.institutionId) && this.hasPicture == params.hasPicture && fr.t.c(this.subDocument, params.subDocument) && fr.t.c(this.entryPoint, params.entryPoint);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            Integer num = this.institutionId;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.hasPicture)) * 31;
            co3.n nVar = this.subDocument;
            int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
            wn3.c cVar = this.entryPoint;
            return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Params(scope=" + this.scope + ", institutionId=" + this.institutionId + ", hasPicture=" + this.hasPicture + ", subDocument=" + this.subDocument + ", entryPoint=" + this.entryPoint + ')';
        }

        public /* synthetic */ Params(k34.a0 a0Var, Integer num, boolean z15, co3.n nVar, wn3.c cVar, int i15, fr.k kVar) {
            this(a0Var, num, (i15 & 4) != 0 ? true : z15, nVar, cVar);
        }
    }
}
