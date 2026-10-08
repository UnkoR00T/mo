package pl.gov.coi.mobywatel.feature.legacy.storage;

import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpl/gov/coi/mobywatel/feature/legacy/storage/m;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "<init>", "()V", "Laj2/a;", "p1", "Lrq0/a;", "c", "(Laj2/a;)Lrq0/a;", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements l {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158842a;

        static {
            int[] iArr = new int[aj2.a.values().length];
            try {
                iArr[aj2.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[aj2.a.TOZSAMOSC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[aj2.a.SCHOOL_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[aj2.a.STUDENT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[aj2.a.REFUGEE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[aj2.a.VEHICLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[aj2.a.PRESCRIPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[aj2.a.IPOLAK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[aj2.a.DRIVING_LICENCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[aj2.a.CITY_CARD_KRAKOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[aj2.a.FAMILY_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[aj2.a.PKP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[aj2.a.RAILWAY_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[aj2.a.DEPUTY_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[aj2.a.PENSIONER_CARD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[aj2.a.GIOS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[aj2.a.MAKE_PROPOSAL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[aj2.a.NURSE_CARD.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[aj2.a.MIDWIFE_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[aj2.a.ADVOCATE_CARD.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[aj2.a.RASKA_SENIOR_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[aj2.a.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[aj2.a.ZDUNSKOWOLSKA_CITY_FAMILY_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[aj2.a.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[aj2.a.E_PAYMENTS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[aj2.a.WRU.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[aj2.a.REFUGEE_CHILD.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[aj2.a.OLAWA_RESIDENT_LICENCE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[aj2.a.OLAWA_FAMILY_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[aj2.a.OLAWA_SENIOR_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[aj2.a.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[aj2.a.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[aj2.a.CHELM_FAMILY_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[aj2.a.CHELM_SENIOR_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[aj2.a.CHELM_RESIDENT_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[aj2.a.LODZ_SENIOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[aj2.a.LODZ_FAMILY_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[aj2.a.SENATOR_CARD.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[aj2.a.PZPN_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[aj2.a.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[aj2.a.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[aj2.a.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[aj2.a.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[aj2.a.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[aj2.a.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[aj2.a.MIEKINIA_SENIOR_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[aj2.a.MIEKINIA_FAMILY_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[aj2.a.TOPR_LICENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[aj2.a.MAZOVIA_LICENCE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[aj2.a.GENERAL_COUNSEL_LICENCE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[aj2.a.OLECKO_RESIDENT_LICENCE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[aj2.a.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[aj2.a.WODZISLAW_FAMILY_LICENCE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[aj2.a.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[aj2.a.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[aj2.a.WISLA_RESIDENT_LICENCE.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[aj2.a.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[aj2.a.FIREFIGHTER_OSP_LICENCE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[aj2.a.DYNAMIC_DOCUMENTS.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[aj2.a.PASSPORTS_DATA.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[aj2.a.VEHICLE_COLLISION_DATA.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[aj2.a.CHILD_PASSPORT_APPLICATION.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[aj2.a.DYNAMIC_MULTI_DOCUMENTS.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            f158842a = iArr;
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rq0.a b(aj2.a p15) {
        switch (a.f158842a[p15.ordinal()]) {
            case 1:
                return rq0.a.C4478a.f175408a;
            case 2:
                return rq0.b.d.ID_CARD;
            case 3:
                return rq0.b.d.SCHOOL_CARD;
            case 4:
                return rq0.b.d.STUDENT_CARD;
            case 5:
                return rq0.b.d.DIIA_REFUGEE_CARD;
            case 6:
                return rq0.b.d.VEHICLE_CARD;
            case 7:
                return rq0.a.b.f175409a;
            case 8:
                return rq0.c.ABROAD_INFO;
            case 9:
                return rq0.b.d.DRIVING_LICENCE;
            case 10:
                return rq0.c.CRACOW_CITY_CARD;
            case 11:
                return rq0.b.d.FAMILY_CARD;
            case 12:
                return rq0.c.TRAIN_TICKETS;
            case 13:
                return rq0.b.d.RAILWAY_CARD;
            case 14:
                return rq0.b.d.DEPUTY_CARD;
            case 15:
                return rq0.b.d.PENSIONER_CARD;
            case 16:
                return rq0.c.GIOS;
            case 17:
                return rq0.c.MAKE_PROPOSAL;
            case 18:
                return rq0.b.d.NURSE_CARD;
            case 19:
                return rq0.b.d.MIDWIFE_CARD;
            case 20:
                return rq0.b.d.ADVOCATE_CARD;
            case 21:
                return rq0.b.e.RASKA_SENIOR_LICENCE;
            case 22:
                return rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
            case 23:
                return rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE;
            case 24:
                return rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE;
            case 25:
                return rq0.c.E_PAYMENTS;
            case 26:
                return rq0.a.c.f175410a;
            case 27:
                return rq0.b.d.DIIA_REFUGEE_CHILD_CARD;
            case 28:
                return rq0.b.e.OLAWA_RESIDENT_LICENCE;
            case 29:
                return rq0.b.e.OLAWA_FAMILY_LICENCE;
            case 30:
                return rq0.b.e.OLAWA_SENIOR_LICENCE;
            case BERTags.DATE /* 31 */:
                return rq0.b.e.SUCHY_LAS_FAMILY_LICENCE;
            case 32:
                return rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
            case 33:
                return rq0.b.e.CHELM_FAMILY_LICENCE;
            case 34:
                return rq0.b.e.CHELM_SENIOR_LICENCE;
            case 35:
                return rq0.b.e.CHELM_RESIDENT_LICENCE;
            case 36:
                return rq0.b.e.LODZ_SENIOR_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return rq0.b.e.LODZ_FAMILY_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return rq0.b.e.SENATOR_CARD;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return rq0.b.e.PZPN_LICENCE;
            case 40:
                return rq0.b.e.GIZYCKA_RESIDENT_LICENCE;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return rq0.b.e.RACIBORSKA_RESIDENT_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return rq0.b.e.RACIBORSKA_SENIOR_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return rq0.b.e.RACIBORSKA_FAMILY_LICENCE;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return rq0.b.e.WROCLAWSKA_SENIOR_LICENCE;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return rq0.b.e.KOBYLKA_RESIDENT_LICENCE;
            case 46:
                return rq0.b.e.MIEKINIA_SENIOR_LICENCE;
            case 47:
                return rq0.b.e.MIEKINIA_FAMILY_LICENCE;
            case 48:
                return rq0.b.e.TOPR_LICENCE;
            case 49:
                return rq0.b.e.MAZOVIA_LICENCE;
            case 50:
                return rq0.b.e.GENERAL_COUNSEL_LICENCE;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return rq0.b.e.OLECKO_RESIDENT_LICENCE;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE;
            case 53:
                return rq0.b.e.WODZISLAW_FAMILY_LICENCE;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return rq0.b.e.MICHALOWICE_RESIDENT_LICENCE;
            case 55:
                return rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE;
            case 56:
                return rq0.b.e.WISLA_RESIDENT_LICENCE;
            case 57:
                return rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return rq0.b.e.FIREFIGHTER_OSP_LICENCE;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return rq0.b.EnumC4479b.DEFAULT;
            case 60:
                return rq0.c.PASSPORTS_DATA;
            case 61:
                return rq0.c.VEHICLE_COLLISION_DATA;
            case 62:
                return rq0.c.CHILD_PASSPORT_APPLICATION_DATA;
            case 63:
                return rq0.b.c.DEFAULT;
            default:
                throw new p();
        }
    }
}
