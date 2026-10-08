package m00;

import fr.k;
import fr.t;
import fv.u;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lm00/c;", "", "", "headerValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "c", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum c {
    JSON("application/json");


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String headerValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ wq.a f121983e = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m00.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lm00/c$a;", "", "<init>", "()V", "Lfv/u;", "headers", "Lm00/c;", "a", "(Lfv/u;)Lm00/c;", "", "CONTENT_TYPE_HEADER", "Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c a(u headers) {
            c next;
            Iterator<c> it = c.e().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (t.c(next.getHeaderValue(), headers.e("content-type"))) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    c(String str) {
        this.headerValue = str;
    }

    public static wq.a<c> e() {
        return f121983e;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHeaderValue() {
        return this.headerValue;
    }
}
