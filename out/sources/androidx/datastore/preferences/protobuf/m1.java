package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m1 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f12049a;

    public m1(r0 r0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f12049a = null;
    }

    public a0 a() {
        return new a0(getMessage());
    }
}
