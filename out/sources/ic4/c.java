package ic4;

import fr.k;
import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\b¨\u0006\r"}, d2 = {"Lic4/c;", "", "", "content", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum c {
    INTERRUPTED("Interrupted"),
    INTERRUPTED_TAG_LOST("Interrupted Tag was lost."),
    INTERRUPTED_TECHNICAL_ERROR("");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String content;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f90952g = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ic4.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lic4/c$a;", "", "<init>", "()V", "", "content", "Lic4/c;", "a", "(Ljava/lang/String;)Lic4/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c a(String content) {
            c next;
            Iterator<c> it = c.g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(next.getContent(), content));
            c cVar = next;
            return cVar == null ? c.INTERRUPTED_TECHNICAL_ERROR : cVar;
        }

        private Companion() {
        }
    }

    c(String str) {
        this.content = str;
    }

    public static wq.a<c> g() {
        return f90952g;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getContent() {
        return this.content;
    }
}
