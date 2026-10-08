package y7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f224937a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f224938b;

    public synchronized Map<String, String> a() {
        try {
            if (this.f224938b == null) {
                this.f224938b = Collections.unmodifiableMap(new HashMap(this.f224937a));
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f224938b;
    }
}
