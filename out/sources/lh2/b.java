package lh2;

import fr.k;
import fr.t;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Llh2/b;", "", "", "lang", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum b {
    POLISH("pl"),
    ENGLISH("en"),
    UKRAINIAN("uk"),
    UNKNOWN("");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String lang;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f118289h = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lh2.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llh2/b$a;", "", "<init>", "()V", "", "language", "Llh2/b;", "a", "(Ljava/lang/String;)Llh2/b;", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b a(String language) {
            try {
                for (b bVar : b.e()) {
                    if (t.c(bVar.getLang(), language)) {
                        return bVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                return b.UNKNOWN;
            }
        }

        private Companion() {
        }
    }

    b(String str) {
        this.lang = str;
    }

    public static wq.a<b> e() {
        return f118289h;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLang() {
        return this.lang;
    }
}
