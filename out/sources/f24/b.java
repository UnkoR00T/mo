package f24;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lf24/b;", "", "<init>", "(Ljava/lang/String;I)V", "", "e", "()Z", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum b {
    ACTIVE,
    INACTIVE;


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ wq.a f58614d = wq.b.a(b());

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58615a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58615a = iArr;
        }
    }

    public final boolean e() {
        int i15 = a.f58615a[ordinal()];
        if (i15 == 1) {
            return true;
        }
        if (i15 == 2) {
            return false;
        }
        throw new p();
    }
}
