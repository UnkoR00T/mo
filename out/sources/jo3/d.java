package jo3;

import co3.p;
import co3.q;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljo3/d;", "", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lco3/p;", "data", "", "c", "(Lco3/p;)I", "index", "Lco3/q;", "item", "Lmx/a;", "b", "(ILco3/q;)Lmx/a;", "", "list", "a", "(Ljava/util/List;)Ljava/util/List;", "Lmx/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104276a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.NAMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SURNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.FAMILY_SURNAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.PESEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.BIRTH_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.BIRTH_PLACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.BIRTH_DATE_AND_PLACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.BIRTH_PLACE_COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[p.IDENTITY_CARD_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[p.IDENTITY_CARD_EXPIRATION_DATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[p.IDENTITY_CARD_STATUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[p.IDENTITY_CARD_CREATION_DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[p.IDENTITY_CARD_REVOCATION_DATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[p.IDENTITY_CARD_SUSPENSION_DATE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[p.ISSUING_AUTHORITY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[p.MOTHER_NAME.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[p.MOTHER_FAMILY_SURNAME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[p.FATHER_NAME.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[p.FATHER_FAMILY_SURNAME.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[p.NATIONALITY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[p.SEX.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[p.REGISTERED_ADDRESS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[p.REGISTERED_DATE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[p.PESEL_CHECKSUM.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[p.TOWN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[p.ANNOTATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[p.SCHOOL_NAME.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[p.STUDENT_ID.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[p.STUDENT_CARD_NUMBER.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[p.STUDENT_CARD_EDITION_NUMBER.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[p.SCHOOL_ADDRESS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[p.STUDENT_CARD_DISTRIBUTION_DATE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[p.STUDENT_CARD_EXPIRATION_DATE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[p.SCHOOL_PHONE_NUMBER.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[p.SCHOOL_PRINCIPAL_NAME.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[p.DISABILITY_INDEX.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[p.FOREIGNER_STATUS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[p.DOCUMENT_CARD_SERIES.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[p.DOCUMENT_EXPIRATION_DATE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[p.DRIVING_LICENCE_ISSUE_DATE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[p.DRIVING_LICENCE_EXPIRATION_DATE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[p.DRIVING_LICENCE_ISSUER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[p.TEMPORARY_DRIVING_LICENCE_ISSUER_FOR_PKK.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[p.DRIVING_LICENCE_NUMBER.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[p.DRIVING_LICENCE_CARD_NUMBER.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[p.TEMPORARY_DRIVING_LICENCE_CARD_NUMBER.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[p.DRIVING_LICENCE_STATUS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[p.TEMPORARY_DRIVING_LICENCE_STATUS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[p.DRIVING_LICENCE_RESTRICTIONS.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[p.DRIVING_LICENCE_CATEGORY.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[p.DRIVING_LICENCE_CATEGORY_FIRST_ISSUE_DATE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[p.DRIVING_LICENCE_CATEGORY_EXPIRATION_DATE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[p.DRIVING_LICENCE_ENTITLEMENT_RESTRICTIONS.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[p.ENTITLEMENTS_STATUS.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[p.UNIVERSITY_NAME.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[p.UNIVERSITY_UNIT_NAME.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[p.UNIVERSITY_TYPE_SYMBOL.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[p.UNIVERSITY_ID.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[p.UNIVERSITY_REGON.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[p.UNIVERSITY_ADDRESS.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[p.UNIVERSITY_PHONE_NUMBER.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[p.MOBYWATEL_SERIES_NUMBER.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[p.MOBYWATEL_EXPIRATION_DATE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[p.MOBYWATEL_ISSUANCE_DATE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[p.REFUGEE_SERIES_NUMBER.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[p.PENSIONER_CARD_NUMBER.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[p.PENSIONER_BENEFIT_TYPE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[p.PENSIONER_BENEFIT_TYPE_EXPIRATION_DATE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[p.PENSIONER_DOCUMENT_ISSUER.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[p.PENSIONER_DOCUMENT_DEPARTMENT_ISSUER.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[p.FAMILY_DOCUMENT_CARD_NUMBER.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[p.FAMILY_DOCUMENT_EXPIRATION_DATE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[p.FAMILY_DOCUMENT_RELATIONSHIP_TYPE.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[p.FAMILY_DOCUMENT_OWNER_CARD_TYPE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[p.ADVOCATE_CARD_BAR_ASSOCIATION.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[p.ADVOCATE_CARD_LEGITIMATION_ISSUER.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[p.ADVOCATE_CARD_DOCUMENT_DISTRIBUTION_DATE.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[p.ADVOCATE_CARD_DOCUMENT_EXPIRATION_DATE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[p.ADVOCATE_CARD_DOCUMENT_NUMBER.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[p.ADVOCATE_CARD_ENTRY_NUMBER.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[p.ADVOCATE_CARD_AUTHORIZATION_TYPE.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[p.UUT_SERIAL_NUMBER.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[p.UUT_NUMBER.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[p.UUT_RELATION_TYPE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[p.UUT_OWNER_TYPE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[p.UUT_OWNER_PESEL.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[p.UUT_EMPLOYER.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[p.UUT_CATEGORY.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[p.UUT_CLASS.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[p.UUT_ANNOTATION.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[p.UUT_ADDITIONAL_BENEFIT.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[p.UUT_STATUS.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[p.UUT_EMPLOYER_CODE.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[p.UUT_DISTRIBUTION_DATE.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[p.UUT_EXPIRATION_DATE.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[p.DEPUTY_LICENCE_NUMBER.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[p.DEPUTY_CADENCE_NUMBER.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[p.DEPUTY_CREATION_DATE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[p.PWZ_PROFESSIONAL_TITLE.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[p.PWZ_DOCUMENT_NUMBER_FULL.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[p.PWZ_DOCUMENT_NUMBER_PARTIAL.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[p.PWZ_ISSUER_NAME.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[p.PWZ_CREATION_DATE_FULL.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[p.PWZ_CREATION_DATE_PARTIAL.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[p.PWZ_RESTRICTION_TYPE.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            f104276a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label b(int index, q item) {
        if (!(item instanceof q.a)) {
            if (!(item instanceof q.b)) {
                throw new oq.p();
            }
            return this.labelProvider.c(c(((q.b) item).getData()));
        }
        return mx.b.b(((q.a) item).getData(), "data_" + index);
    }

    private final int c(p data) {
        switch (a.f104276a[data.ordinal()]) {
            case 1:
                return un3.b.R1;
            case 2:
                return un3.b.U1;
            case 3:
                return un3.b.f199410d3;
            case 4:
                return un3.b.C1;
            case 5:
                return un3.b.f199429h2;
            case 6:
                return un3.b.f199447l0;
            case 7:
                return un3.b.f199442k0;
            case 8:
                return un3.b.f199437j0;
            case 9:
                return un3.b.f199432i0;
            case 10:
                return un3.b.M1;
            case 11:
                return un3.b.K1;
            case 12:
                return un3.b.P1;
            case 13:
                return un3.b.J1;
            case 14:
                return un3.b.N1;
            case 15:
                return un3.b.Q1;
            case 16:
                return un3.b.L1;
            case 17:
                return un3.b.T1;
            case 18:
                return un3.b.S1;
            case 19:
                return un3.b.E1;
            case 20:
                return un3.b.D1;
            case 21:
                return un3.b.V1;
            case 22:
                return un3.b.Z2;
            case 23:
                return un3.b.H2;
            case 24:
                return un3.b.I2;
            case 25:
                return un3.b.f199434i2;
            case 26:
                return un3.b.f199420f3;
            case 27:
                return un3.b.f199427h0;
            case 28:
                return un3.b.U2;
            case 29:
                return un3.b.f199445k3;
            case 30:
                return un3.b.f199467p0;
            case BERTags.DATE /* 31 */:
                return un3.b.f199457n0;
            case 32:
                return un3.b.R2;
            case 33:
                return un3.b.f199452m0;
            case 34:
                return un3.b.f199462o0;
            case 35:
                return un3.b.V2;
            case 36:
                return un3.b.W2;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return un3.b.S2;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return un3.b.F1;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return un3.b.O1;
            case 40:
                return un3.b.A0;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return un3.b.T0;
            case EACTags.CURRENCY_CODE /* 42 */:
                return un3.b.f199418f1;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return un3.b.P0;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return un3.b.Y0;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return un3.b.V0;
            case 46:
                return un3.b.f199391a;
            case 47:
                return un3.b.Z0;
            case 48:
                return un3.b.Q0;
            case 49:
                return un3.b.f199393a1;
            case 50:
                return un3.b.W0;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return un3.b.S0;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return un3.b.R0;
            case 53:
                return un3.b.f199408d1;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return un3.b.f199413e1;
            case 55:
                return un3.b.U0;
            case 56:
                return un3.b.f199430h3;
            case 57:
                return un3.b.f199465o3;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return un3.b.f199440j3;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return un3.b.f199425g3;
            case 60:
                return un3.b.f199450l3;
            case 61:
                return un3.b.f199455m3;
            case 62:
                return un3.b.f199435i3;
            case 63:
                return un3.b.I0;
            case 64:
                return un3.b.G0;
            case 65:
                return un3.b.H0;
            case 66:
                return un3.b.J0;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return un3.b.Y1;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return un3.b.X1;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return un3.b.W1;
            case 70:
                return un3.b.f199394a2;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return un3.b.Z1;
            case 72:
                return un3.b.f199488t1;
            case 73:
                return un3.b.f199498v1;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return un3.b.B1;
            case EACTags.DEPRECATED /* 75 */:
                return un3.b.f199493u1;
            case 76:
                return un3.b.Z;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return un3.b.f199407d0;
            case 78:
                return un3.b.f199452m0;
            case 79:
                return un3.b.f199397b0;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return un3.b.f199467p0;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return un3.b.f199417f0;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return un3.b.Y;
            case 83:
                return un3.b.E3;
            case 84:
                return un3.b.A3;
            case 85:
                return un3.b.D3;
            case 86:
                return un3.b.C3;
            case 87:
                return un3.b.B3;
            case 88:
                return un3.b.f199510x3;
            case 89:
                return un3.b.f199485s3;
            case 90:
                return un3.b.f199490t3;
            case 91:
                return un3.b.f199480r3;
            case 92:
                return un3.b.f199475q3;
            case 93:
                return un3.b.F3;
            case 94:
                return un3.b.f199505w3;
            case 95:
                return un3.b.f199495u3;
            case 96:
                return un3.b.f199515y3;
            case 97:
                return un3.b.f199467p0;
            case 98:
                return un3.b.f199472q0;
            case 99:
                return un3.b.f199452m0;
            case 100:
                return un3.b.A2;
            case 101:
                return un3.b.f199449l2;
            case 102:
                return un3.b.f199454m2;
            case 103:
                return un3.b.f199459n2;
            case 104:
                return un3.b.f199439j2;
            case 105:
                return un3.b.f199444k2;
            case 106:
                return un3.b.B2;
            default:
                throw new oq.p();
        }
    }

    public final List<Label> a(List<? extends q> list) {
        List<? extends q> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(b(i15, (q) obj));
            i15 = i16;
        }
        return arrayList;
    }
}
