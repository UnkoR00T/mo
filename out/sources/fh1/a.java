package fh1;

import oq.p;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq0/b;", "Lwh1/a;", "a", "(Lrq0/b;)Lwh1/a;", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: fh1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1420a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63798a;

        static {
            int[] iArr = new int[rq0.b.e.values().length];
            try {
                iArr[rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rq0.b.e.OLAWA_FAMILY_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rq0.b.e.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rq0.b.e.CHELM_FAMILY_LICENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rq0.b.e.LODZ_FAMILY_LICENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rq0.b.e.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rq0.b.e.MIEKINIA_FAMILY_LICENCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rq0.b.e.WODZISLAW_FAMILY_LICENCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[rq0.b.e.RASKA_SENIOR_LICENCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[rq0.b.e.OLAWA_RESIDENT_LICENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[rq0.b.e.OLAWA_SENIOR_LICENCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[rq0.b.e.CHELM_SENIOR_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[rq0.b.e.CHELM_RESIDENT_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[rq0.b.e.LODZ_SENIOR_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[rq0.b.e.SENATOR_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[rq0.b.e.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[rq0.b.e.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[rq0.b.e.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[rq0.b.e.PZPN_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[rq0.b.e.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[rq0.b.e.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[rq0.b.e.MIEKINIA_SENIOR_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[rq0.b.e.TOPR_LICENCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[rq0.b.e.MAZOVIA_LICENCE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[rq0.b.e.GENERAL_COUNSEL_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[rq0.b.e.OLECKO_RESIDENT_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[rq0.b.e.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[rq0.b.e.WISLA_RESIDENT_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[rq0.b.e.FIREFIGHTER_OSP_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            f63798a = iArr;
        }
    }

    public static final wh1.a a(rq0.b bVar) {
        if (bVar == rq0.b.EnumC4479b.DOCTOR) {
            return wh1.a.PWZ_LEKARZA;
        }
        if (bVar == rq0.b.EnumC4479b.DENTIST) {
            return wh1.a.PWZ_DENTYSTA;
        }
        if (bVar != rq0.b.EnumC4479b.ATTORNEY_AT_LAW && bVar != rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW) {
            if (bVar == rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD) {
                return wh1.a.LEG_OSOBY_NIEPELNOSPRAWNEJ;
            }
            if (bVar == rq0.b.c.TEACHER) {
                return wh1.a.LEG_NAUCZYCIELA;
            }
            if (bVar == rq0.b.c.BAILIFF_CARD) {
                return wh1.a.IDENT_KOMORNIKA_SADOWEGO;
            }
            if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION) {
                return wh1.a.ELECTRONIC_DIPLOMA_GRADUATION;
            }
            if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_PHD) {
                return wh1.a.ELECTRONIC_DIPLOMA_PHD;
            }
            if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_DSC) {
                return wh1.a.ELECTRONIC_DIPLOMA_DSC;
            }
            if (bVar == rq0.b.d.ID_CARD) {
                return wh1.a.MDOWOD;
            }
            if (bVar == rq0.b.d.DRIVING_LICENCE) {
                return wh1.a.PRAWO_JAZDY;
            }
            if (bVar == rq0.b.d.VEHICLE_CARD) {
                return wh1.a.M_POJAZD;
            }
            if (bVar == rq0.b.d.FAMILY_CARD) {
                return wh1.a.KDR;
            }
            if (bVar != rq0.b.d.DIIA_REFUGEE_CARD && bVar != rq0.b.d.DIIA_REFUGEE_CHILD_CARD) {
                if (bVar == rq0.b.d.STUDENT_CARD) {
                    return wh1.a.LEG_STUDENCKA;
                }
                if (bVar == rq0.b.d.RAILWAY_CARD) {
                    return wh1.a.LEG_UUT;
                }
                if (bVar == rq0.b.d.PENSIONER_CARD) {
                    return wh1.a.EMERYT;
                }
                if (bVar == rq0.b.d.DEPUTY_CARD) {
                    return wh1.a.LEG_POSELSKA;
                }
                if (bVar == rq0.b.d.ADVOCATE_CARD) {
                    return wh1.a.LEG_ADWOKACKA;
                }
                if (bVar == rq0.b.d.MIDWIFE_CARD) {
                    return wh1.a.PWZ_POLOZNEJ;
                }
                if (bVar == rq0.b.d.NURSE_CARD) {
                    return wh1.a.PWZ_PIELEGNIARKI;
                }
                if (bVar == rq0.b.e.SENATOR_CARD) {
                    return wh1.a.LEG_SENATORSKA;
                }
                if (bVar == rq0.b.EnumC4479b.TAX_ADVISOR) {
                    return wh1.a.LEG_DORADCY_PODATKOWEGO;
                }
                if (bVar == rq0.b.EnumC4479b.AUDITOR) {
                    return wh1.a.AUDITOR;
                }
                if (bVar == rq0.b.EnumC4479b.CIVIL_ENGINEER || bVar == rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP || bVar == rq0.b.d.SCHOOL_CARD || bVar == rq0.b.EnumC4479b.DEFAULT || bVar == rq0.b.c.DEFAULT) {
                    return wh1.a.GENERIC;
                }
                if (bVar instanceof rq0.b.e) {
                    switch (C1420a.f63798a[((rq0.b.e) bVar).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            return wh1.a.WRU_FAMILY;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            return wh1.a.GENERIC;
                        default:
                            throw new p();
                    }
                }
                if (bVar == rq0.b.EnumC4479b.SOLIDARITY_CARD) {
                    return wh1.a.SOLIDARITY_CARD;
                }
                if (bVar == rq0.b.EnumC4479b.PHD_STUDENT) {
                    return wh1.a.PHD_STUDENT;
                }
                if (bVar == rq0.b.EnumC4479b.PHYSIOTHERAPIST) {
                    return wh1.a.PHYSIOTHERAPIST;
                }
                if (bVar == rq0.b.EnumC4479b.PHARMACIST) {
                    return wh1.a.PHARMACIST;
                }
                if (bVar == rq0.b.EnumC4479b.SHOOTING_LICENCE) {
                    return wh1.a.SHOOTING_LICENCE;
                }
                if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE) {
                    return wh1.a.SPORT_SHOOTING_COMPETITOR_LICENCE;
                }
                if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE) {
                    return wh1.a.SPORT_SHOOTING_COACH_LICENCE;
                }
                if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE) {
                    return wh1.a.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
                }
                if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING) {
                    return wh1.a.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
                }
                if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING) {
                    return wh1.a.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
                }
                if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE) {
                    return wh1.a.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
                }
                if (bVar == rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN) {
                    return wh1.a.LABORATORY_DIAGNOSTICIAN;
                }
                if (bVar == rq0.b.EnumC4479b.PENSIONER_MSWIA) {
                    return wh1.a.PENSIONER_MSWIA;
                }
                throw new p();
            }
            return wh1.a.DIIA;
        }
        return wh1.a.LEG_RADCY;
    }
}
