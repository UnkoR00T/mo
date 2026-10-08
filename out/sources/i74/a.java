package i74;

import oq.p;
import p071kotlin.Metadata;
import qp0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc74/a;", "Lqp0/b;", "a", "(Lc74/a;)Lqp0/b;", "wk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: i74.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2134a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89917a;

        static {
            int[] iArr = new int[c74.a.values().length];
            try {
                iArr[c74.a.ACTIVATION_BY_PERSONAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c74.a.CONTACT_CHANGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c74.a.PASSPORT_INVALIDATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89917a = iArr;
        }
    }

    public static final b a(c74.a aVar) {
        int i15 = C2134a.f89917a[aVar.ordinal()];
        if (i15 == 1) {
            return b.ACTIVATION_BY_PERSONAL_ID;
        }
        if (i15 == 2) {
            return b.CONTACT_CHANGES;
        }
        if (i15 == 3) {
            return b.PASSPORT_INVALIDATION;
        }
        throw new p();
    }
}
