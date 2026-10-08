package xq3;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iq0.Announcement;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import mx.Label;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import vq3.WhatsNewScreenModel;
import wq3.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxq3/a;", "Lxw/f;", "Lxq3/a$a;", "Lwq3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Liq0/a;", "it", "", "c", "(Liq0/a;)I", "params", "e", "(Lxq3/a$a;)Lwq3/c$a;", "a", "Lmx/c;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xq3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lxq3/a$a;", "", "Lwq3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Lwq3/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwq3/b;", "b", "()Lwq3/b;", "Ler/a;", "()Ler/a;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wq3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(wq3.b bVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onClose = aVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final wq3.b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220524a;

        static {
            int[] iArr = new int[iq0.b.values().length];
            try {
                iArr[iq0.b.PESEL_RESTRICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iq0.b.AIR_QUALITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iq0.b.VEHICLE_HISTORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[iq0.b.MY_CASES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[iq0.b.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[iq0.b.MEDICAL_PRESCRIPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[iq0.b.SAFE_BUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[iq0.b.ELECTORAL_REGISTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[iq0.b.GIVE_ELECTORAL_SUPPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[iq0.b.TRAIN_TICKETS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[iq0.b.ENVIRONMENTAL_VIOLATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[iq0.b.ABROAD_INFO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[iq0.b.PAYMENTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[iq0.b.GAS_SUPPLEMENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[iq0.b.COAL_SUPPLEMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[iq0.b.MKA_CARD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[iq0.b.E_VISIT_ZUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[iq0.b.PENALTY_POINTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[iq0.b.FINES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[iq0.b.MOBILE_ID_CARD.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[iq0.b.DRIVING_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[iq0.b.TEMPORARY_DRIVING_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[iq0.b.VEHICLE_CARD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[iq0.b.FAMILY_CARD.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[iq0.b.DIIA.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[iq0.b.SCHOOL_STUDENT_CARD.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[iq0.b.UNIVERSITY_STUDENT_CARD.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[iq0.b.PENSIONER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[iq0.b.UUT_CARD.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[iq0.b.DEPUTY.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[iq0.b.ADVOCATE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[iq0.b.NURSE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[iq0.b.DOCTOR.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[iq0.b.DENTIST.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[iq0.b.MIDWIFE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[iq0.b.DOCUMENT_SIGN.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[iq0.b.COMPANY.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[iq0.b.NETWORK_SECURITY_ISSUES.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[iq0.b.ENERGY_VOUCHER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[iq0.b.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[iq0.b.TEACHER.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[iq0.b.BAILIFF.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[iq0.b.VEHICLE_COLLISION.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[iq0.b.ENERGY_LIMIT_STATEMENT.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[iq0.b.FLOOD_ALERT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[iq0.b.APPLICATION_FORM_SERVICES.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[iq0.b.CIVIL_ENGINEER.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[iq0.b.IDENTITY_CARD_SUSPENSION.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[iq0.b.ATTORNEY_AT_LAW.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[iq0.b.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[iq0.b.DRIVER_QUALIFICATIONS.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[iq0.b.TAX_ADVISOR.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[iq0.b.OTHER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[iq0.b.UNKNOWN.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[iq0.b.ID_CARD_VERIFICATION.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[iq0.b.DOCUMENT_RESTRICTION.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[iq0.b.ID_CARD_COLLECTING.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[iq0.b.AUDITOR.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[iq0.b.MY_IKP.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[iq0.b.DEFENCE_TRAINING.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[iq0.b.QUALIFIED_SIGNATURE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[iq0.b.ELECTRONIC_DELIVERY.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[iq0.b.CHECK_VEHICLE_INSURANCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[iq0.b.LAND_REGISTRY.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[iq0.b.SOLIDARITY_CARD.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[iq0.b.NATIONAL_COURT_REGISTER.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[iq0.b.MILITARY_ALERT.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[iq0.b.SAFETY_GUIDE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[iq0.b.PASSPORT_PICKUP.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[iq0.b.PHD_STUDENT.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[iq0.b.INTERNET_ACCESS.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[iq0.b.TRAVEL_ABROAD.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[iq0.b.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[iq0.b.PHYSIOTHERAPIST.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[iq0.b.PHARMACIST.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[iq0.b.SANITARY_VIOLATION.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[iq0.b.SHOOTING_LICENCE.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[iq0.b.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[iq0.b.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[iq0.b.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[iq0.b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[iq0.b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[iq0.b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[iq0.b.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[iq0.b.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[iq0.b.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[iq0.b.LABORATORY_DIAGNOSTICIAN.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[iq0.b.VEHICLE_REGISTRATION.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[iq0.b.PENSIONER_MSWIA.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[iq0.b.EUROPE_READINESS.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            f220524a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final int c(Announcement it) {
        switch (b.f220524a[it.getType().ordinal()]) {
            case 1:
                return jz.a.L3;
            case 2:
                return jz.a.G3;
            case 3:
                return jz.a.E3;
            case 4:
                return jz.a.T3;
            case 5:
                return jz.a.K3;
            case 6:
                return jz.a.f106913z3;
            case 7:
                return jz.a.O3;
            case 8:
                return jz.a.J3;
            case 9:
                return jz.a.J3;
            case 10:
                return jz.a.P3;
            case 11:
                return jz.a.F3;
            case 12:
                return jz.a.R3;
            case 13:
                return jz.a.M3;
            case 14:
                return jz.a.Z3;
            case 15:
                return jz.a.Z3;
            case 16:
                return jz.a.Q3;
            case 17:
                return jz.a.N3;
            case 18:
                return jz.a.C3;
            case 19:
                return jz.a.D3;
            case 20:
                return jz.a.K2;
            case 21:
                return jz.a.M2;
            case 22:
                return jz.a.M2;
            case 23:
                return jz.a.N2;
            case 24:
                return jz.a.O2;
            case 25:
                return jz.a.U2;
            case 26:
                return jz.a.P2;
            case 27:
                return jz.a.Q2;
            case 28:
                return jz.a.f106779g3;
            case 29:
                return jz.a.T2;
            case 30:
                return jz.a.S2;
            case BERTags.DATE /* 31 */:
                return jz.a.R2;
            case 32:
                return jz.a.V2;
            case 33:
                return jz.a.X2;
            case 34:
                return jz.a.Y2;
            case 35:
                return jz.a.W2;
            case 36:
                return jz.a.B3;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return jz.a.A3;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return jz.a.I3;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return jz.a.Z3;
            case 40:
                return jz.a.f106731a3;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return jz.a.f106747c3;
            case EACTags.CURRENCY_CODE /* 42 */:
                return jz.a.f106763e3;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return jz.a.U3;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return jz.a.Z3;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return jz.a.H3;
            case 46:
                return jz.a.S3;
            case 47:
                return jz.a.f106755d3;
            case 48:
                return jz.a.Z3;
            case 49:
                return jz.a.Z2;
            case 50:
                return jz.a.Z2;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return jz.a.V3;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return jz.a.f106771f3;
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return jz.a.f106755d3;
            case 55:
                return jz.a.f106764e4;
            case 56:
                return jz.a.f106732a4;
            case 57:
                return jz.a.f106740b4;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return jz.a.f106794i3;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return jz.a.f106772f4;
            case 60:
                return jz.a.f106788h4;
            case 61:
                return jz.a.f106748c4;
            case 62:
                return jz.a.f106756d4;
            case 63:
                return jz.a.f106780g4;
            case 64:
                return jz.a.f106795i4;
            case 65:
                return jz.a.f106808k3;
            case 66:
                return jz.a.f106802j4;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return jz.a.f106809k4;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return jz.a.f106823m4;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return jz.a.f106816l4;
            case 70:
                return jz.a.f106815l3;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return jz.a.W3;
            case 72:
                return jz.a.R3;
            case 73:
                return jz.a.f106830n4;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return jz.a.f106822m3;
            case EACTags.DEPRECATED /* 75 */:
                return jz.a.f106829n3;
            case 76:
                return jz.a.f106837o4;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return jz.a.f106878u3;
            case 78:
                return jz.a.f106857r3;
            case 79:
                return jz.a.f106864s3;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return jz.a.f106871t3;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return jz.a.f106843p3;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return jz.a.f106850q3;
            case 83:
                return jz.a.f106885v3;
            case 84:
                return jz.a.f106899x3;
            case 85:
                return jz.a.f106892w3;
            case 86:
                return jz.a.f106906y3;
            case 87:
                return jz.a.f106836o3;
            case 88:
                return jz.a.f106844p4;
            case 89:
                return jz.a.f106779g3;
            case 90:
                return jz.a.f106851q4;
            default:
                throw new p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        wq3.b state = params.getState();
        if (t.c(state, wq3.b.C5689b.f214472a)) {
            return c.a.C5690a.f214473a;
        }
        if (!(state instanceof wq3.b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(nq3.a.f137832b);
        List<Announcement> listA = ((wq3.b.Initialized) state).getAnnouncements().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (Announcement announcement : listA) {
            arrayList.add(new t40.a.b(mx.b.b(announcement.getDescription(), "whats_new_announcement_message"), c(announcement), null, mx.b.b(announcement.getTitle(), "whats_new_announcement_title"), 4, null));
        }
        return new c.a.Initialized(new WhatsNewScreenModel(labelC, baseScaffoldData, new InfoRowListData(arrayList), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(nq3.a.f137831a), null, 2, null), d.a.f107773a, null, params.a(), 35, null)));
    }
}
