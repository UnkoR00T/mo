package m1;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0094@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lm1/x;", "T", "", "defaultValue", "<init>", "(Ljava/lang/Object;)V", "Lb1/i;", "interaction", "Lm1/c;", "styleState", "Loq/i0;", "b", "(Lb1/i;Lm1/c;Ltq/e;)Ljava/lang/Object;", "d", "a", "Ljava/lang/Object;", "getDefaultValue$foundation", "()Ljava/lang/Object;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class x<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x<Boolean> f122447c = new a(1, false, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x<Boolean> f122448d = new a(2, false, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final x<Boolean> f122449e = new a(4, false, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x<Boolean> f122450f = new a(8, false, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final x<Boolean> f122451g = new a(16, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T defaultValue;

    /* JADX INFO: renamed from: m1.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm1/x$a;", "", "<init>", "()V", "Lm1/x;", "", "Focused", "Lm1/x;", "a", "()Lm1/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final x<Boolean> a() {
            return x.f122449e;
        }

        private Companion() {
        }
    }

    public x(T t15) {
        this.defaultValue = t15;
    }

    static /* synthetic */ <T> Object c(x<T> xVar, b1.i iVar, c cVar, tq.e<? super i0> eVar) {
        return i0.f148189a;
    }

    protected Object b(b1.i iVar, c cVar, tq.e<? super i0> eVar) {
        return c(this, iVar, cVar, eVar);
    }

    public final Object d(b1.i iVar, c cVar, tq.e<? super i0> eVar) {
        Object objB = b(iVar, cVar, eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }
}
