package xl0;

import al0.y;
import gm0.a2;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal0/y;", "Lgm0/a2;", "a", "(Lal0/y;)Lgm0/a2;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219281a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.PASSPORT_INVALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f219281a = iArr;
        }
    }

    public static final a2 a(y yVar) {
        if (a.f219281a[yVar.ordinal()] == 1) {
            return a2.PASSPORT_INVALIDATION;
        }
        throw new p();
    }
}
