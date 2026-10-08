package o24;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b5\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u00067"}, d2 = {"Lo24/t;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "I", "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "O", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "R", "T", "X", "Y", "Z", "h0", "q0", "r0", "s0", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum t {
    MOBILE_ID_CARD("MOBILE_ID_CARD"),
    DRIVING_LICENCE("DRIVING_LICENCE"),
    TEMPORARY_DRIVING_LICENCE("TEMPORARY_DRIVING_LICENCE"),
    DEPUTY("DEPUTY"),
    NURSE("NURSE"),
    MIDWIFE("MIDWIFE"),
    PENSIONER("PENSIONER"),
    DOCTOR("DOCTOR"),
    DENTIST("DENTIST"),
    FAMILY_CARD("FAMILY_CARD"),
    UNIVERSITY_STUDENT_CARD("UNIVERSITY_STUDENT_CARD"),
    SCHOOL_STUDENT_CARD("SCHOOL_STUDENT_CARD"),
    VEHICLE_CARD("VEHICLE_CARD"),
    ADVOCATE_DATA("ADVOCATE_DATA"),
    DIIA_PL("DIIA_PL"),
    WRU_DATA("WRU_DATA"),
    ATTORNEY_AT_LAW("ATTORNEY_AT_LAW"),
    TRAINEE_ATTORNEY_AT_LAW("TRAINEE_ATTORNEY_AT_LAW"),
    UUT("UUT"),
    DISABLED_PERSON_IDENTIFICATION_CARD("DISABLED_PERSON_IDENTIFICATION_CARD"),
    DIIA_PL_KID("DIIA_PL_KID"),
    TEACHER("TEACHER"),
    CIVIL_ENGINEER("CIVIL_ENGINEER"),
    BAILIFF("BAILIFF"),
    TAX_ADVISOR("TAX_ADVISOR"),
    JUNIOR_SCHOOL_CARD("JUNIOR_SCHOOL_CARD"),
    JUNIOR_SCHOOL_CARD_MOBYWATEL_APP("JUNIOR_SCHOOL_CARD_MOBYWATEL_APP"),
    AUDITOR("AUDITOR"),
    SOLIDARITY_CARD("SOLIDARITY_CARD"),
    PHD_STUDENT("PHD_STUDENT"),
    PHYSIOTHERAPIST("PHYSIOTHERAPIST"),
    SHOOTING_LICENCE("SHOOTING_LICENCE"),
    PHARMACIST("PHARMACIST"),
    SPORT_SHOOTING_COMPETITOR_LICENCE("SPORT_SHOOTING_COMPETITOR_LICENCE"),
    ELECTRONIC_DIPLOMA_GRADUATION("ELECTRONIC_DIPLOMA_GRADUATION"),
    ELECTRONIC_DIPLOMA_PHD("ELECTRONIC_DIPLOMA_PHD"),
    ELECTRONIC_DIPLOMA_DSC("ELECTRONIC_DIPLOMA_DSC"),
    SPORT_SHOOTING_COACH_LICENCE("SPORT_SHOOTING_COACH_LICENCE"),
    SPORT_SHOOTING_INSTRUCTOR_LICENCE("SPORT_SHOOTING_INSTRUCTOR_LICENCE"),
    SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING("SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING"),
    SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING("SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING"),
    SPORT_SHOOTING_RANGE_OFFICER_LICENCE("SPORT_SHOOTING_RANGE_OFFICER_LICENCE"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final /* synthetic */ wq.a f141613u0 = wq.b.a(b());

    t(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
