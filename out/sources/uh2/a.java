package uh2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\nR*\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Luh2/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Luh2/b;", "type", "parent", "", "requestId", "<init>", "(Luh2/b;Ljava/lang/Exception;Ljava/lang/String;)V", "(Luh2/b;)V", "(Luh2/b;Ljava/lang/Exception;)V", "toString", "()Ljava/lang/String;", "a", "Luh2/b;", "()Luh2/b;", "setType", "b", "Ljava/lang/Exception;", "getParent", "()Ljava/lang/Exception;", "setParent", "(Ljava/lang/Exception;)V", "c", "Ljava/lang/String;", "getRequestId", "setRequestId", "(Ljava/lang/String;)V", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Exception parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String requestId;

    public a(b bVar, Exception exc, String str) {
        super(exc);
        this.type = bVar;
        this.parent = exc;
        this.requestId = str;
        if (exc instanceof a) {
            this.type = ((a) exc).type;
            Exception exc2 = ((a) exc).parent;
            this.parent = exc2;
            this.requestId = ((a) exc2).requestId;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getType() {
        return this.type;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String string = this.type.toString();
        Throwable cause = getCause();
        if (cause instanceof a) {
            string = string + " < " + cause;
        }
        return String.valueOf(string);
    }

    public a(b bVar) {
        this(bVar, null, null);
    }

    public a(b bVar, Exception exc) {
        this(bVar, exc, null);
    }
}
