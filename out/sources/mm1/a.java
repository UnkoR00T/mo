package mm1;

import fr.k;
import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;
import wq.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lmm1/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    CHILD,
    WARD;


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ wq.a f127132e = b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: mm1.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmm1/a$a;", "", "<init>", "()V", "", "name", "Lmm1/a;", "a", "(Ljava/lang/String;)Lmm1/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(String name) {
            a next;
            Iterator<a> it = a.e().iterator();
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

    public static wq.a<a> e() {
        return f127132e;
    }
}
