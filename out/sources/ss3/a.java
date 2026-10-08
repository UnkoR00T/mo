package ss3;

import fr.k;
import oq.p;
import p071kotlin.Metadata;
import p096or3.c1;
import p096or3.w0;
import p096or3.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lss3/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    INITIAL,
    NEW_VISIT,
    REDO_VISIT;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ wq.a f183986f = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ss3.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lss3/a$a;", "", "<init>", "()V", "Lss3/a;", "Lor3/w0;", "a", "(Lss3/a;)Lor3/w0;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ss3.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C4744a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f183987a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.INITIAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.NEW_VISIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.REDO_VISIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f183987a = iArr;
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final w0 a(a aVar) {
            int i15 = C4744a.f183987a[aVar.ordinal()];
            if (i15 == 1) {
                return null;
            }
            if (i15 == 2) {
                return c1.f148631a;
            }
            if (i15 == 3) {
                return x0.f148825a;
            }
            throw new p();
        }

        private Companion() {
        }
    }
}
