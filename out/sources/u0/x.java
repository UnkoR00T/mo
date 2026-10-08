package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Lu0/x;", "", "", "value", "b", "(I)I", "a", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f193937b = b(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f193938c = b(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f193939d = b(0);

    /* JADX INFO: renamed from: u0.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu0/x$a;", "", "<init>", "()V", "Lu0/x;", "ArcLinear", "I", "a", "()I", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return x.f193939d;
        }

        private Companion() {
        }
    }

    public static int b(int i15) {
        return i15;
    }

    public static final boolean c(int i15, int i16) {
        return i15 == i16;
    }

    public static int d(int i15) {
        return Integer.hashCode(i15);
    }

    public static String e(int i15) {
        return "ArcMode(value=" + i15 + ')';
    }
}
