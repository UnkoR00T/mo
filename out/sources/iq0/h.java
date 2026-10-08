package iq0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Liq0/h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum h {
    PHYSICAL_ID_CARD_APPLICATION,
    CHILD_PHYSICAL_ID_CARD_APPLICATION,
    WARD_PHYSICAL_ID_CARD_APPLICATION,
    PHYSICAL_ID_CARD_SUSPENSION,
    WARD_ID_SUSPENSION,
    CHILD_ID_SUSPENSION,
    PASSPORT_INVALIDATION,
    PHYSICAL_ID_CARD_INVALIDATION,
    CHILD_ID_INVALIDATION,
    WARD_ID_INVALIDATION,
    CHILD_BIRTH_REGISTRATION,
    PASSPORT_AGREEMENT_OPTION,
    CHILD_PASSPORT_APPLICATION_OPTION,
    HEATING_SUPPLEMENT,
    PASSPORT_AGREEMENT_MANAGEMENT,
    UNKNOWN;


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ wq.a f96300v = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iq0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Liq0/h$a;", "", "<init>", "()V", "", "value", "Liq0/h;", "a", "(Ljava/lang/String;)Liq0/h;", "PHYSICAL_ID_CARD_APPLICATION_VALUE", "Ljava/lang/String;", "CHILD_PHYSICAL_ID_CARD_APPLICATION_VALUE", "WARD_PHYSICAL_ID_CARD_APPLICATION_VALUE", "PHYSICAL_ID_CARD_SUSPENSION_VALUE", "PASSPORT_INVALIDATION_VALUE", "PHYSICAL_ID_CARD_INVALIDATION_VALUE", "CHILD_BIRTH_REGISTRATION_VALUE", "CHILD_ID_CARD_SUSPENSION", "DEPENDANT_ID_CARD_SUSPENSION", "PASSPORT_AGREEMENT", "CHILD_PASSPORT_APPLICATION", "CHILD_ID_CARD_INVALIDATION", "WARD_ID_CARD_INVALIDATION", "HEATING_SUPPLEMENT_VALUE", "PASSPORT_AGREEMENT_MANAGEMENT_VALUE", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final h a(String value) {
            switch (value.hashCode()) {
                case -1672766032:
                    if (value.equals("PHYSICAL_ID_CARD_SUSPENSION")) {
                        return h.PHYSICAL_ID_CARD_SUSPENSION;
                    }
                    break;
                case -1596861280:
                    if (value.equals("WARD_PHYSICAL_ID_CARD_APPLICATION")) {
                        return h.WARD_PHYSICAL_ID_CARD_APPLICATION;
                    }
                    break;
                case -1553470101:
                    if (value.equals("CHILD_ID_CARD_SUSPENSION")) {
                        return h.CHILD_ID_SUSPENSION;
                    }
                    break;
                case -345204372:
                    if (value.equals("CHILD_ID_CARD_INVALIDATION")) {
                        return h.CHILD_ID_INVALIDATION;
                    }
                    break;
                case -27837466:
                    if (value.equals("CHILD_PASSPORT_APPLICATION")) {
                        return h.CHILD_PASSPORT_APPLICATION_OPTION;
                    }
                    break;
                case 76247584:
                    if (value.equals("CHILD_PHYSICAL_ID_CARD_APPLICATION")) {
                        return h.CHILD_PHYSICAL_ID_CARD_APPLICATION;
                    }
                    break;
                case 192773100:
                    if (value.equals("WARD_ID_CARD_INVALIDATION")) {
                        return h.WARD_ID_INVALIDATION;
                    }
                    break;
                case 198995563:
                    if (value.equals("PASSPORT_INVALIDATION")) {
                        return h.PASSPORT_INVALIDATION;
                    }
                    break;
                case 321728957:
                    if (value.equals("PHYSICAL_ID_CARD_APPLICATION")) {
                        return h.PHYSICAL_ID_CARD_APPLICATION;
                    }
                    break;
                case 849351494:
                    if (value.equals("HEATING_SUPPLEMENT")) {
                        return h.HEATING_SUPPLEMENT;
                    }
                    break;
                case 911763965:
                    if (value.equals("PASSPORT_AGREEMENT")) {
                        return h.PASSPORT_AGREEMENT_OPTION;
                    }
                    break;
                case 975522929:
                    if (value.equals("PHYSICAL_ID_CARD_INVALIDATION")) {
                        return h.PHYSICAL_ID_CARD_INVALIDATION;
                    }
                    break;
                case 1284186053:
                    if (value.equals("PASSPORT_AGREEMENT_MANAGEMENT")) {
                        return h.PASSPORT_AGREEMENT_MANAGEMENT;
                    }
                    break;
                case 1294097452:
                    if (value.equals("DEPENDANT_ID_CARD_SUSPENSION")) {
                        return h.WARD_ID_SUSPENSION;
                    }
                    break;
                case 1921337468:
                    if (value.equals("CHILD_BIRTH_REGISTRATION")) {
                        return h.CHILD_BIRTH_REGISTRATION;
                    }
                    break;
            }
            return h.UNKNOWN;
        }

        private Companion() {
        }
    }
}
