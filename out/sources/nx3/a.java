package nx3;

import fr.k;
import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lnx3/a;", "", "c", "a", "b", "Lnx3/a$a;", "Lnx3/a$b;", "Lnx3/a$c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: nx3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnx3/a$a;", "Lnx3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3453a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3453a f139468a = new C3453a();

        private C3453a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3453a);
        }

        public int hashCode() {
            return -105184502;
        }

        public String toString() {
            return "Generic";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\tj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lnx3/a$b;", "Lnx3/a;", "", "", "path", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "h", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b implements a {
        ACCOUNT_BROKEN("accountIsBroken.html"),
        MISSING_EPUAP("autoCreateAccountForPZConfirmed"),
        MISSING_PZ("create"),
        MORE_THAN_ONE_EPUAP_ACCOUNT("selectLogin"),
        EPUAP_GENERAL("errorPage.html"),
        LOGIN_NOT_POSSIBLE_MANUAL("loginToAccountIsNotPossibleManualPath.html");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ wq.a f139477k = wq.b.a(b());

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: nx3.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnx3/a$b$a;", "", "<init>", "()V", "", "path", "Lnx3/a$b;", "a", "(Ljava/lang/String;)Lnx3/a$b;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b a(String path) {
                b next;
                Iterator<b> it = b.e().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (t.c(next.getPath(), path)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        b(String str) {
            this.path = str;
        }

        public static wq.a<b> e() {
            return f139477k;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPath() {
            return this.path;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnx3/a$c;", "Lnx3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f139479a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1338947948;
        }

        public String toString() {
            return "Timeout";
        }
    }
}
