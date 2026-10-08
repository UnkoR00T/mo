package lv;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Llv/f;", "", "<init>", "()V", "", "method", "", "d", "(Ljava/lang/String;)Z", "a", "c", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f120554a = new f();

    private f() {
    }

    public static final boolean a(String method) {
        return (t.c(method, "GET") || t.c(method, "HEAD")) ? false : true;
    }

    public static final boolean d(String method) {
        return t.c(method, "POST") || t.c(method, "PUT") || t.c(method, "PATCH") || t.c(method, "PROPPATCH") || t.c(method, "REPORT");
    }

    public final boolean b(String method) {
        return !t.c(method, "PROPFIND");
    }

    public final boolean c(String method) {
        return t.c(method, "PROPFIND");
    }
}
