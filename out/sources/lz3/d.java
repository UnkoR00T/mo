package lz3;

import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Llz3/d;", "", "", "referenceName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "c", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum d {
    DOCUMENT_UPDATE("DOCUMENT_UPDATE"),
    DOCUMENT_REDOWNLOAD("DOCUMENT_REDOWNLOAD"),
    FIRST_DOWNLOAD("FIRST_DOWNLOAD");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String referenceName;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f121723g = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lz3.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llz3/d$a;", "", "<init>", "()V", "", "name", "Llz3/d;", "a", "(Ljava/lang/String;)Llz3/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final d a(String name) {
            d next;
            Iterator<d> it = d.e().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (t.c(next.getReferenceName(), name)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    d(String str) {
        this.referenceName = str;
    }

    public static wq.a<d> e() {
        return f121723g;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReferenceName() {
        return this.referenceName;
    }
}
