package ns2;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lns2/c;", "", "<init>", "(Ljava/lang/String;I)V", "", "e", "()Z", "a", "b", "c", "d", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum c {
    ACTIVE,
    INACTIVE,
    EXPIRED,
    REVOKED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ wq.a f138269f = wq.b.a(b());

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138270a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f138270a = iArr;
        }
    }

    public final boolean e() {
        int i15 = a.f138270a[ordinal()];
        if (i15 == 1) {
            return true;
        }
        if (i15 == 2 || i15 == 3 || i15 == 4) {
            return false;
        }
        throw new p();
    }
}
