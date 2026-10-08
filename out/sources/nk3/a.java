package nk3;

import fr.k;
import fu.r;
import java.util.Iterator;
import kk3.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\b¨\u0006\r"}, d2 = {"Lnk3/a;", "", "Lkk3/b;", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "d", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    FIRST_REGISTRATION(b.b("DICT651_CEP.POJ.RE")),
    RE_REGISTRATION(b.b("DICT651_CEP.POJ.PO")),
    TRANSFER_REGISTRATION(b.b("DICT651_CEP.POJ.PR"));


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f137175g = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nk3.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\f\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnk3/a$a;", "", "<init>", "()V", "Lkk3/b;", "code", "Lnk3/a;", "a", "(Ljava/lang/String;)Lnk3/a;", "", "b", "(Lnk3/a;)Ljava/lang/String;", "shortCode", "DICTIONARY_CODE_FIRST_DELIMITER", "Ljava/lang/String;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(String code) {
            a next;
            Iterator<a> it = a.g().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (r.G(next.getCode(), code, false)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public final String b(a aVar) {
            return r.g1(aVar.getCode(), "_", null, 2, null);
        }

        private Companion() {
        }
    }

    a(String str) {
        this.code = str;
    }

    public static wq.a<a> g() {
        return f137175g;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
