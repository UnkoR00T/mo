package n3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Ln3/f2;", "", "other", "", "t", "b", "(Ljava/lang/Object;F)Ljava/lang/Object;", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f130987a;

    /* JADX INFO: renamed from: n3.f2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Ln3/f2$a;", "", "<init>", "()V", "a", "b", "", "t", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f130987a = new Companion();

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0030 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0031 A[RETURN] */
        public final Object a(Object a15, Object b15, float t15) {
            if (fr.t.c(a15, b15)) {
                if (t15 < 0.5f) {
                    return a15;
                }
                return b15;
            }
            Object objB = a15 instanceof f2 ? ((f2) a15).b(b15, t15) : null;
            if (objB == null && (b15 instanceof f2)) {
                objB = ((f2) b15).b(a15, 1 - t15);
            }
            if (objB != null) {
                return objB;
            }
            if (t15 < 0.5f) {
                return a15;
            }
            return b15;
        }
    }

    Object b(Object other, float t15);
}
