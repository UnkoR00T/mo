package er0;

import fr.k;
import fr.t;
import java.util.Iterator;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ler0/h;", "", "<init>", "(Ljava/lang/String;I)V", "", "g", "()Z", "a", "b", "c", "d", "e", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum h {
    ACTIVE,
    INACTIVE,
    EXPIRED,
    REVOKED,
    UNKNOWN;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f52945h = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: er0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ler0/h$a;", "", "<init>", "()V", "", "name", "Ler0/h;", "a", "(Ljava/lang/String;)Ler0/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final h a(String name) {
            h next;
            Iterator<h> it = h.e().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (t.c(next.name(), name)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52946a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.REVOKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f52946a = iArr;
        }
    }

    public static wq.a<h> e() {
        return f52945h;
    }

    public final boolean g() {
        int i15 = b.f52946a[ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3 || i15 == 4 || i15 == 5) {
            return false;
        }
        throw new p();
    }
}
