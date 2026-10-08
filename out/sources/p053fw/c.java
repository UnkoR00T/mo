package p053fw;

import fu.a;
import fu.r;
import java.net.URLEncoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n*\n\u0010\f\"\u00020\u000b2\u00020\u000b¨\u0006\r"}, d2 = {"", "char", "", "c", "(C)Z", "b", "a", "", "str", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/URI;", "URI", "markdown"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class c {
    private static final boolean a(char c15) {
        return r.c0("$^`", c15, false, 2, null);
    }

    public static final boolean b(char c15) {
        return a(c15) || ((1676673024 >> Character.getType(c15)) & 1) != 0;
    }

    public static final boolean c(char c15) {
        return c15 == 0 || Character.isSpaceChar(c15) || a.c(c15);
    }

    public static final String d(String str) {
        return URLEncoder.encode(str, "UTF-8");
    }
}
