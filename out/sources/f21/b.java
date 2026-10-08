package f21;

import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import rq0.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf21/b;", "Lf21/a;", "<init>", "()V", "Lf21/a$a;", "params", "Lgx/b;", "c", "(Lf21/a$a;)Lgx/b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f21.a {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58555a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.SAFE_BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TRAIN_TICKETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.GAS_SUPPLEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.MEDICAL_PRESCRIPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.GIOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.CRACOW_CITY_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.ABROAD_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.PENALTY_POINTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.E_PAYMENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c.ZUS_VISIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c.VEHICLE_HISTORY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c.PESEL_RESTRICTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c.AIR_QUALITY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c.ELECTORAL_REGISTER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[c.GIVE_ELECTORAL_SUPPORT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[c.FINES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[c.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[c.MY_CASES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[c.DOCUMENT_SIGNING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[c.PASSPORTS_DATA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[c.VEHICLE_COLLISION_DATA.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[c.COMPANY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[c.VEHICLE_COLLISION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[c.NETWORK_SECURITY_ISSUES.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[c.FLOOD_ALERT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[c.APPLICATION_FORM_SERVICES.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[c.IDENTITY_CARD_SUSPENSION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[c.IDENTITY_CARD_INVALIDATION.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[c.DRIVER_QUALIFICATIONS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[c.DOCUMENT_RESTRICTION.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[c.ID_CARD_VERIFICATION.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[c.ID_CARD_COLLECTING.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[c.MY_IKP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[c.DEFENCE_TRAINING.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[c.QUALIFIED_SIGNATURE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[c.LAND_REGISTRY.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[c.CHECK_VEHICLE_INSURANCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[c.ENERGY_LIMIT_STATEMENT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[c.NATIONAL_COURT_REGISTER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[c.MILITARY_ALERT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[c.SAFETY_GUIDE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[c.PASSPORT_PICKUP.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[c.INTERNET_ACCESS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[c.TRAVEL_ABROAD.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[c.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[c.COAL_SUPPLEMENT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[c.ENERGY_VOUCHER.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[c.MAKE_PROPOSAL.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[c.SANITARY_VIOLATION.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[c.VEHICLE_REGISTRATION.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[c.EUROPE_READINESS.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[c.CHILD_PASSPORT_APPLICATION_DATA.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[c.UNKNOWN.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            f58555a = iArr;
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public gx.b b(f21.a.Params params) {
        switch (a.f58555a[params.getServiceType().ordinal()]) {
            case 1:
                return l03.a.C2766a.f113996a;
            case 2:
                return r43.a.C4368a.f171780a;
            case 3:
                String supplementOrigin = params.getSupplementOrigin();
                if (supplementOrigin != null) {
                    return new r43.a.ToMakeProposalService(supplementOrigin);
                }
                return null;
            case 4:
                return r43.a.e.f171784a;
            case 5:
                return w72.a.C5539a.f210874a;
            case 6:
                return r43.a.b.f171781a;
            case 7:
                return r43.a.c.f171782a;
            case 8:
                return as2.a.C0311a.f14330a;
            case 9:
                return new w32.b.ToPayments(w32.b.ToPayments.InterfaceC5522a.C5524b.f210183a, false, 2, null);
            case 10:
                return jr3.a.C2485a.f104604a;
            case 11:
                return new zi3.a.ToVehicleHistory(null, null, null, null, 15, null);
            case 12:
                return ss2.a.C4742a.f183980a;
            case 13:
                return ay0.a.C0352a.f15203a;
            case 14:
                return ry1.a.C4516a.f176876a;
            case 15:
                return gz1.a.C1794a.f78547a;
            case 16:
                return p62.a.C3769a.f153207a;
            case 17:
                return vt2.a.C5468a.f208291a;
            case 18:
                return e11.a.C1060a.f46819a;
            case 19:
                return hx1.a.b.f86824a;
            case 20:
                return cp2.a.f37245a;
            case 21:
                return nd3.a.f134345a;
            case 22:
                return ia1.b.a.f90656a;
            case 23:
                return nd3.a.f134345a;
            case 24:
                return yl2.a.C6114a.f227798a;
            case 25:
                return b72.b.a.f17021a;
            case 26:
                return tz0.c.f192691a;
            case 27:
                return vc2.a.C5386a.f206112a;
            case 28:
                return ib2.b.a.f90723a;
            case 29:
                return wt1.a.C5710a.f215067a;
            case 30:
                return ft1.a.C1501a.f67006a;
            case BERTags.DATE /* 31 */:
                return nd2.a.f134344a;
            case 32:
                return ab2.a.C0104a.f5296a;
            case 33:
                return zk2.a.C6358a.f235574a;
            case 34:
                return si1.b.a.f181938a;
            case 35:
                return wy2.c.b.f215979a;
            case 36:
                return yf2.a.C6082a.f226771a;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return u21.a.f194519a;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return tz0.c.f192691a;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return il2.a.C2200a.f93279a;
            case 40:
                return vd2.a.f206264a;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return h13.b.a.f79645a;
            case EACTags.CURRENCY_CODE /* 42 */:
                return pr2.b.f162175a;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return defpackage.a.C0004a.f1008a;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return s93.b.f179492a;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return d43.a.f40001a;
            case 46:
            case 47:
            case 48:
                String supplementOrigin2 = params.getSupplementOrigin();
                if (supplementOrigin2 != null) {
                    return new r43.a.ToMakeProposalService(supplementOrigin2);
                }
                return null;
            case 49:
                return i23.a.C2089a.f88559a;
            case 50:
                return gk3.a.f73516a;
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
                return null;
            default:
                throw new p();
        }
    }
}
