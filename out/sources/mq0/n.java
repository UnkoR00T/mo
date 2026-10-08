package mq0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b:\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;¨\u0006<"}, d2 = {"Lmq0/n;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "I", "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "O", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "R", "T", "X", "Y", "Z", "h0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum n {
    MY_CASES("MY_CASES"),
    PENALTY_POINTS("PENALTY_POINTS"),
    TRAIN_TICKETS("TRAIN_TICKETS"),
    GAS_SUPPLEMENT("GAS_SUPPLEMENT"),
    ABROAD_INFO("ABROAD_INFO"),
    MEDICAL_PRESCRIPTIONS("MEDICAL_PRESCRIPTIONS"),
    ENVIRONMENTAL_VIOLATION("ENVIRONMENTAL_VIOLATION"),
    COAL_SUPPLEMENT("COAL_SUPPLEMENT"),
    ENERGY_LIMIT_STATEMENT("ENERGY_LIMIT_STATEMENT"),
    SAFE_BUS("SAFE_BUS"),
    PESEL_RESTRICTION("PESEL_RESTRICTION"),
    MKA_CARD("MKA_CARD"),
    PAYMENTS("PAYMENTS"),
    E_VISIT_ZUS("E_VISIT_ZUS"),
    VEHICLE_HISTORY("VEHICLE_HISTORY"),
    AIR_QUALITY("AIR_QUALITY"),
    ELECTORAL_REGISTER("ELECTORAL_REGISTER"),
    FINES("FINES"),
    PESEL_RESTRICTION_VERIFICATION("PESEL_RESTRICTION_VERIFICATION"),
    DOCUMENT_SIGN("DOCUMENT_SIGN"),
    VEHICLE_COLLISION("VEHICLE_COLLISION"),
    COMPANY("COMPANY"),
    NETWORK_SECURITY_ISSUES("NETWORK_SECURITY_ISSUES"),
    ENERGY_VOUCHER("ENERGY_VOUCHER"),
    FLOOD_ALERT("FLOOD_ALERT"),
    APPLICATION_FORM_SERVICES("APPLICATION_FORM_SERVICES"),
    DRIVER_QUALIFICATIONS("DRIVER_QUALIFICATIONS"),
    DOCUMENT_RESTRICTION("DOCUMENT_RESTRICTION"),
    ID_CARD_VERIFICATION("ID_CARD_VERIFICATION"),
    QUALIFIED_SIGNATURE("QUALIFIED_SIGNATURE"),
    ID_CARD_COLLECTING("ID_CARD_COLLECTING"),
    MY_IKP("MY_IKP"),
    DEFENCE_TRAINING("DEFENCE_TRAINING"),
    VEHICLE_INSURANCE_VERIFICATION("VEHICLE_INSURANCE_VERIFICATION"),
    LAND_REGISTER("LAND_REGISTER"),
    KRS_DATA("KRS_DATA"),
    MILITARY_ALERT("MILITARY_ALERT"),
    SAFETY_GUIDE("SAFETY_GUIDE"),
    PASSPORT_PICKUP("PASSPORT_PICKUP"),
    INTERNET_ACCESS("INTERNET_ACCESS"),
    JUNIOR_SCHOOL_EDUCATION("JUNIOR_SCHOOL_EDUCATION"),
    TRAVEL_ABROAD("TRAVEL_ABROAD"),
    SANITARY_VIOLATION("SANITARY_VIOLATION"),
    GIVE_ELECTORAL_SUPPORT("GIVE_ELECTORAL_SUPPORT"),
    VEHICLE_REGISTRATION("VEHICLE_REGISTRATION"),
    RCB_ALERT("RCB_ALERT"),
    EUROPE_READINESS("EUROPE_READINESS"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final /* synthetic */ wq.a f127783z0 = wq.b.a(b());

    n(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
