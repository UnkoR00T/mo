package oo0;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0015\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0019"}, d2 = {"Loo0/u;", "", "", AnnotatedPrivateKey.LABEL, "Loo0/u$b;", "type", "email", "<init>", "(Ljava/lang/String;Loo0/u$b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Loo0/u$b;", "d", "()Loo0/u$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Topic {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Topic f147352e = new Topic("", b.UNKNOWN, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: oo0.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Loo0/u$a;", "", "<init>", "()V", "Loo0/u;", "EMPTY", "Loo0/u;", "a", "()Loo0/u;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final Topic a() {
            return Topic.f147352e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: oo0.u$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\bZ\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZ¨\u0006["}, d2 = {"Loo0/u$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "I", "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "O", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "R", "T", "X", "Y", "Z", "h0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "y0", "z0", "A0", "B0", "C0", "D0", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "O0", "P0", "Q0", "R0", "S0", "T0", "U0", "V0", "W0", "X0", "Y0", "Z0", "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1", "i1", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        PESEL_RESTRICTION,
        AIR_QUALITY,
        VEHICLE_HISTORY,
        ELECTORAL_REGISTER,
        GIVE_ELECTORAL_SUPPORT,
        MEDICAL_PRESCRIPTIONS,
        SAFE_BUS,
        TRAIN_TICKETS,
        ENVIRONMENTAL_VIOLATION,
        ABROAD_INFO,
        PAYMENTS,
        GAS_SUPPLEMENT,
        MKA_CARD,
        E_VISIT_ZUS,
        PENALTY_POINTS,
        FINES,
        DOCUMENT_SIGN,
        TRUSTED_PROFILE_BANKING,
        COMPANY,
        VEHICLE_COLLISION,
        NETWORK_SECURITY_ISSUES,
        ENERGY_VOUCHER,
        MOBILE_ID_CARD,
        DRIVING_LICENCE,
        VEHICLE_CARD,
        FAMILY_CARD,
        DIIA,
        SCHOOL_STUDENT_CARD,
        UNIVERSITY_STUDENT_CARD,
        PENSIONER,
        UUT_CARD,
        DEPUTY,
        ADVOCATE,
        NURSE,
        DOCTOR,
        DENTIST,
        MIDWIFE,
        OTHER_SERVICES,
        OTHER_DOCUMENTS,
        OTHER,
        APPLICATION_FORM_SERVICES,
        DISABLED_PERSON_IDENTIFICATION_CARD,
        TEACHER,
        CIVIL_ENGINEER,
        FLOOD_ALERT,
        BAILIFF,
        ATTORNEY_AT_LAW,
        TRAINEE_ATTORNEY_AT_LAW,
        DRIVER_QUALIFICATIONS,
        TAX_ADVISOR,
        DOCUMENT_RESTRICTION,
        ID_CARD_VERIFICATION,
        ID_CARD_COLLECTING,
        MY_CASES,
        AUDITOR,
        SOLIDARITY_CARD,
        MY_IKP,
        DEFENCE_TRAINING,
        QUALIFIED_SIGNATURE,
        ELECTRONIC_DELIVERY,
        CHECK_VEHICLE_INSURANCE,
        LAND_REGISTRY,
        NATIONAL_COURT_REGISTER,
        SAFETY_GUIDE,
        PASSPORT_PICKUP,
        PHD_STUDENT,
        INTERNET_ACCESS,
        TRAVEL_ABROAD,
        JUNIOR_SCHOOL_EDUCATION,
        PHYSIOTHERAPIST,
        PHARMACIST,
        SANITARY_VIOLATION,
        SHOOTING_LICENCE,
        SPORT_SHOOTING_COMPETITOR_LICENCE,
        SPORT_SHOOTING_COACH_LICENCE,
        SPORT_SHOOTING_INSTRUCTOR_LICENCE,
        SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING,
        SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING,
        SPORT_SHOOTING_RANGE_OFFICER_LICENCE,
        ELECTRONIC_DIPLOMA_GRADUATION,
        ELECTRONIC_DIPLOMA_PHD,
        ELECTRONIC_DIPLOMA_DSC,
        LABORATORY_DIAGNOSTICIAN,
        VEHICLE_REGISTRATION,
        PENSIONER_MSWIA,
        EUROPE_READINESS,
        UNKNOWN;


        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private static final /* synthetic */ wq.a f147377k1 = wq.b.a(b());
    }

    public Topic(String str, b bVar, String str2) {
        this.label = str;
        this.type = bVar;
        this.email = str2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) other;
        return fr.t.c(this.label, topic.label) && this.type == topic.type && fr.t.c(this.email, topic.email);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + this.type.hashCode()) * 31) + this.email.hashCode();
    }

    public String toString() {
        return "Topic(label=" + this.label + ", type=" + this.type + ", email=" + this.email + ")";
    }
}
