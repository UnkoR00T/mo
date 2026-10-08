package p076m2;

import er.a;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lm2/b4;", "Lm2/l1;", "a", "Lm2/b4;", "c", "()Lm2/b4;", "LocalHostDefaultProvider", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<l1> f123020a = d0.h(null, new a() { // from class: m2.m1
        @Override // er.a
        public final Object a() {
            return n1.b();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final l1 b() {
        throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
    }

    public static final b4<l1> c() {
        return f123020a;
    }
}
