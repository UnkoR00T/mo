package gr1;

import java.util.Iterator;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lgr1/c;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;ILmx/a;)V", "a", "Lmx/a;", "g", "()Lmx/a;", "b", "c", "d", "e", "f", "h", "j", "k", "l", "m", "n", "p", "q", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum c {
    PRESENCE_SIGN(mx.b.b("Presence sign", "ModePresenceSign")),
    AUTHENTICATION_SIGN(mx.b.b("Authentication sign", "ModeAuthenticationSign")),
    AUTHORIZATION_SIGN(mx.b.b("Authorization sign", "ModeAuthorizationSign")),
    READ_ALL_DATA(mx.b.b("Read all data", "ModeReadAllData")),
    READ_ICAO(mx.b.b("Read ICAO", "ModeReadICAO")),
    READ_PHOTO(mx.b.b("Read photo", "ModeReadPhoto")),
    READ_CERTIFICATE_PRESENCE(mx.b.b("Read presence certificate", "ModeReadPresenceCertificate")),
    READ_CERTIFICATE_AUTHENTICATION(mx.b.b("Read authentication certificate", "ModeReadAuthenticationCertificate")),
    READ_CERTIFICATE_AUTHORIZATION(mx.b.b("Read authorization certificate", "ModeReadAuthorizationCertificate")),
    CHANGE_AUTHENTICATION_PIN(mx.b.b("Change authentication PIN", "ModeChangeAuthenticationPIN")),
    CHANGE_AUTHORIZATION_PIN(mx.b.b("Change authorization PIN", "ModeChangeAuthorizationPIN")),
    RESET_AUTHENTICATION_PIN(mx.b.b("Reset authentication PIN", "ModeResetAuthenticationPIN")),
    RESET_AUTHORIZATION_PIN(mx.b.b("Reset authorization PIN", "ModeResetAuthorizationPIN"));


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label label;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ wq.a f76406s = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: gr1.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgr1/c$a;", "", "<init>", "()V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lgr1/c;", "a", "(Lmx/a;)Lgr1/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final c a(Label label) {
            c next;
            Iterator<c> it = c.e().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (fr.t.c(next.getLabel(), label)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    c(Label label) {
        this.label = label;
    }

    public static wq.a<c> e() {
        return f76406s;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }
}
