package p076m2;

import p071kotlin.Metadata;
import y2.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J$\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lm2/e0;", "", "T", "Lm2/z;", "key", "a", "(Lm2/z;)Ljava/lang/Object;", "d0", "Lm2/v3;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e0 {

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f122843a;

    /* JADX INFO: renamed from: m2.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lm2/e0$a;", "", "<init>", "()V", "Lm2/e0;", "b", "Lm2/e0;", "a", "()Lm2/e0;", "Empty", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f122843a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final e0 Empty = r.a();

        private Companion() {
        }

        public final e0 a() {
            return Empty;
        }
    }

    <T> T a(z<T> key);
}
