package bt;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f21496a;

    public w(q qVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f21496a = null;
    }

    public k a() {
        return new k(getMessage());
    }
}
