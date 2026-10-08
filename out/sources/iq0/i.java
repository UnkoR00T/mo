package iq0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Liq0/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum i {
    SUPPLEMENT_WEBVIEW,
    WEBVIEW,
    NATIVE,
    UNKNOWN;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f96308g = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iq0.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Liq0/i$a;", "", "<init>", "()V", "", "value", "Liq0/i;", "a", "(Ljava/lang/String;)Liq0/i;", "SUPPLEMENT_WEBVIEW_VALUE", "Ljava/lang/String;", "WEBVIEW_VALUE", "NATIVE_VALUE", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final i a(String value) {
            int iHashCode = value.hashCode();
            if (iHashCode != -1999289321) {
                if (iHashCode != -197105069) {
                    if (iHashCode == 1942407129 && value.equals("WEBVIEW")) {
                        return i.WEBVIEW;
                    }
                } else if (value.equals("SUPPLEMENT_WEBVIEW")) {
                    return i.SUPPLEMENT_WEBVIEW;
                }
            } else if (value.equals("NATIVE")) {
                return i.NATIVE;
            }
            return i.UNKNOWN;
        }

        private Companion() {
        }
    }
}
