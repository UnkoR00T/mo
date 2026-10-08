package ic4;

import fr.k;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lic4/a;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    INVALID_FORMAT_CAN_LENGTH(1),
    INVALID_FORMAT_PIN_LENGTH(2),
    INVALID_FORMAT_PUK(3),
    INVALID_FORMAT_TIMESTAMP(4),
    INIT_WITHOUT_DATA(5),
    CAN_NOT_INITIALIZED(6),
    EMPTY_SIGNED_DATA(7),
    CERTIFICATE_NOT_SET(8),
    INVALID_FORMAT_PIN(9),
    INCORRECT_CAN(11),
    INTERRUPTED(12),
    INCORRECT_PIN_OR_PUK(13),
    PIN_OR_PUK_BLOCKED(14),
    CERTIFICATE_INACTIVE(15),
    CERTIFICATE_MISSING(16),
    DATA_MISSING(17),
    NO_ACTIVE_SESSION(18),
    PROCESS_ALREADY_IN_PROGRESS(19),
    DOCUMENT_NOT_SUPPORTED(20),
    TIMEOUT(21),
    UNEXPECTED_ERROR(99),
    NOT_MAPPED(Integer.MAX_VALUE);

    private static final /* synthetic */ wq.a C = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: ic4.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lic4/a$a;", "", "<init>", "()V", "", "value", "Lic4/a;", "a", "(I)Lic4/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(int value) {
            a next;
            Iterator<a> it = a.g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getCode() != value);
            a aVar = next;
            return aVar == null ? a.NOT_MAPPED : aVar;
        }

        private Companion() {
        }
    }

    a(int i15) {
        this.code = i15;
    }

    public static wq.a<a> g() {
        return C;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCode() {
        return this.code;
    }
}
