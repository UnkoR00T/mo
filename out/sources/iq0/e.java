package iq0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Liq0/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum e {
    ACTIVATION_BY_GOVERNMENT_OFFICE,
    ACTIVATION_BY_ELECTRONIC_ID,
    ASYNC_ACTIVATION_DIIA,
    ASYNC_ACTIVATION_MOBILE_ID_CARD,
    INSTANT_PAYMENTS,
    SHORTCUTS_ON_DOCUMENTS,
    ACTIVATION_BY_JUNIOR,
    SHOW_SEARCH_ICON,
    UNKNOWN;


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ wq.a f96267m = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iq0.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Liq0/e$a;", "", "<init>", "()V", "", "value", "Liq0/e;", "a", "(Ljava/lang/String;)Liq0/e;", "ACTIVATION_BY_GOVERNMENT_OFFICE_VALUE", "Ljava/lang/String;", "ACTIVATION_BY_ELECTRONIC_ID_VALUE", "ASYNC_ACTIVATION_DIIA_VALUE", "ASYNC_ACTIVATION_MOBILE_ID_CARD_VALUE", "INSTANT_PAYMENTS_VALUE", "SHORTCUTS_ON_DOCUMENTS_VALUE", "ACTIVATION_BY_JUNIOR_VALUE", "SHOW_SEARCH_ICON_VALUE", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final e a(String value) {
            switch (value.hashCode()) {
                case -2109440406:
                    if (value.equals("SHORTCUTS_ON_DOCUMENTS")) {
                        return e.SHORTCUTS_ON_DOCUMENTS;
                    }
                    break;
                case -1139886680:
                    if (value.equals("ACTIVATION_BY_JUNIOR")) {
                        return e.ACTIVATION_BY_JUNIOR;
                    }
                    break;
                case 329332227:
                    if (value.equals("ASYNC_ACTIVATION_DIIA")) {
                        return e.ASYNC_ACTIVATION_DIIA;
                    }
                    break;
                case 833677291:
                    if (value.equals("INSTANT_PAYMENTS")) {
                        return e.INSTANT_PAYMENTS;
                    }
                    break;
                case 1039960683:
                    if (value.equals("ACTIVATION_BY_GOVERNMENT_OFFICE")) {
                        return e.ACTIVATION_BY_GOVERNMENT_OFFICE;
                    }
                    break;
                case 1271258941:
                    if (value.equals("ASYNC_ACTIVATION_MOBILE_ID_CARD")) {
                        return e.ASYNC_ACTIVATION_MOBILE_ID_CARD;
                    }
                    break;
                case 1725102702:
                    if (value.equals("SHOW_SEARCH_ICON")) {
                        return e.SHOW_SEARCH_ICON;
                    }
                    break;
                case 1992378335:
                    if (value.equals("ACTIVATION_BY_ELECTRONIC_ID")) {
                        return e.ACTIVATION_BY_ELECTRONIC_ID;
                    }
                    break;
            }
            return e.UNKNOWN;
        }

        private Companion() {
        }
    }
}
