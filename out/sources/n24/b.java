package n24;

import dx.j;
import ex.d;
import f24.i;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import px.f;
import xw.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf24/i;", "Ldx/i;", "Ldx/b;", "", "a", "(Lf24/i;)Ldx/i;", "containers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130931a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.RASKA_SENIOR_LICENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.OLAWA_RESIDENT_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.OLAWA_FAMILY_LICENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.OLAWA_SENIOR_LICENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[i.CHELM_FAMILY_LICENCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[i.CHELM_SENIOR_LICENCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[i.CHELM_RESIDENT_LICENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[i.LODZ_SENIOR_LICENCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[i.LODZ_FAMILY_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[i.SENATOR_CARD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[i.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[i.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[i.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[i.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[i.PZPN_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[i.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[i.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[i.MIEKINIA_SENIOR_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[i.MIEKINIA_FAMILY_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[i.TOPR_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[i.MAZOVIA_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[i.GENERAL_COUNSEL_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[i.OLECKO_RESIDENT_LICENCE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[i.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[i.WODZISLAW_FAMILY_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[i.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[i.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[i.WISLA_RESIDENT_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[i.FIREFIGHTER_OSP_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[i.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[i.ID_CARD.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[i.DRIVING_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[i.VEHICLE_CARD.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[i.FAMILY_CARD.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[i.REFUGEE_CARD.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[i.REFUGEE_CHILD_CARD.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[i.STUDENT_CARD.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[i.RAILWAY_CARD.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[i.PENSIONER_CARD.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[i.DEPUTY_CARD.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[i.ADVOCATE_CARD.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[i.MIDWIFE_CARD.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[i.NURSE_CARD.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[i.DOCTOR.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[i.DENTIST.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[i.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[i.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[i.CIVIL_ENGINEER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[i.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[i.AUDITOR.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[i.SOLIDARITY_CARD.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[i.PHD_STUDENT.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[i.PHYSIOTHERAPIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[i.PHARMACIST.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[i.SHOOTING_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[i.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[i.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[i.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[i.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[i.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[i.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[i.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[i.TEACHER.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[i.BAILIFF_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[i.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[i.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[i.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[i.LABORATORY_DIAGNOSTICIAN.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[i.PENSIONER_MSWIA.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            f130931a = iArr;
        }
    }

    public static final dx.i<dx.b, String> a(i iVar) {
        Object objB;
        String str;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    switch (a.f130931a[iVar.ordinal()]) {
                        case 1:
                            str = "licenseData_RASKA_SENIOR_LICENCE";
                            break;
                        case 2:
                            str = "licenseData_ZDUNSKOWOLSKA_RESIDENT_LICENCE";
                            break;
                        case 3:
                            str = "licenseData_OLAWA_RESIDENT_LICENCE";
                            break;
                        case 4:
                            str = "licenseData_OLAWA_FAMILY_LICENCE";
                            break;
                        case 5:
                            str = "licenseData_OLAWA_SENIOR_LICENCE";
                            break;
                        case 6:
                            str = "licenseData_ZDUNSKOWOLSKA_FAMILY_LICENCE";
                            break;
                        case 7:
                            str = "licenseData_ZDUNSKOWOLSKA_SENIOR_LICENCE";
                            break;
                        case 8:
                            str = "licenseData_SUCHY_LAS_FAMILY_LICENCE";
                            break;
                        case 9:
                            str = "licenseData_MIEJSKA_AUGUSTOW_TOURIST_LICENCE";
                            break;
                        case 10:
                            str = "licenseData_CHELM_FAMILY_LICENCE";
                            break;
                        case 11:
                            str = "licenseData_CHELM_SENIOR_LICENCE";
                            break;
                        case 12:
                            str = "licenseData_CHELM_RESIDENT_LICENCE";
                            break;
                        case 13:
                            str = "licenseData_LODZ_SENIOR_LICENCE";
                            break;
                        case 14:
                            str = "licenseData_LODZ_FAMILY_LICENCE";
                            break;
                        case 15:
                            str = "licenseData_SENATOR_CARD";
                            break;
                        case 16:
                            str = "licenseData_RACIBORSKA_RESIDENT_LICENCE";
                            break;
                        case 17:
                            str = "licenseData_RACIBORSKA_SENIOR_LICENCE";
                            break;
                        case 18:
                            str = "licenseData_RACIBORSKA_FAMILY_LICENCE";
                            break;
                        case 19:
                            str = "licenseData_GIZYCKA_RESIDENT_LICENCE";
                            break;
                        case 20:
                            str = "licenseData_PZPN_LICENCE";
                            break;
                        case 21:
                            str = "licenseData_KOBYLKA_RESIDENT_LICENCE";
                            break;
                        case 22:
                            str = "licenseData_WROCLAWSKA_SENIOR_LICENCE";
                            break;
                        case 23:
                            str = "licenseData_MIEKINIA_SENIOR_LICENCE";
                            break;
                        case 24:
                            str = "licenseData_MIEKINIA_FAMILY_LICENCE";
                            break;
                        case 25:
                            str = "licenseData_TOPR_LICENCE";
                            break;
                        case 26:
                            str = "licenseData_MAZOVIA_LICENCE";
                            break;
                        case 27:
                            str = "licenseData_GENERAL_COUNSEL_LICENCE_SCOPE";
                            break;
                        case 28:
                            str = "licenseData_OLECKO_RESIDENT_LICENCE";
                            break;
                        case 29:
                            str = "licenseData_BYDGOSZCZ_FAMILY_LICENCE";
                            break;
                        case 30:
                            str = "licenseData_WODZISLAW_FAMILY_LICENCE";
                            break;
                        case BERTags.DATE /* 31 */:
                            str = "licenseData_MICHALOWICE_RESIDENT_LICENCE";
                            break;
                        case 32:
                            str = "licenseData_KOLEJE_DOLNOSLASKIE_LICENCE";
                            break;
                        case 33:
                            str = "licenseData_WISLA_RESIDENT_LICENCE";
                            break;
                        case 34:
                            str = "licenseData_FIREFIGHTER_OSP_LICENCE";
                            break;
                        case 35:
                            str = "licenseData_JASTRZEBIA_GORA_RESIDENT_LICENCE";
                            break;
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        case 40:
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        case EACTags.CURRENCY_CODE /* 42 */:
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case EACTags.TRANSACTION_DATE /* 51 */:
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        case 53:
                        case EACTags.CURRENCY_EXPONENT /* 54 */:
                        case 55:
                        case 56:
                        case 57:
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                        case EACTags.DISPLAY_IMAGE /* 69 */:
                        case 70:
                        case EACTags.MESSAGE_REFERENCE /* 71 */:
                        case 72:
                        case 73:
                        case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                        case EACTags.DEPRECATED /* 75 */:
                            aVar.b(new dx.b.Generic(new UnsupportedOperationException(aVar + " is not a WRU document type")));
                            throw new g();
                        default:
                            throw new p();
                    }
                    return new dx.i.Right(str);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
