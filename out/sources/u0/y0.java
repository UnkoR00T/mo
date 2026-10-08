package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lu0/y0;", "T", "", "value", "Lu0/g0;", "easing", "<init>", "(Ljava/lang/Object;Lu0/g0;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lu0/g0;", "()Lu0/g0;", "c", "(Lu0/g0;)V", "Lu0/z0$a;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class y0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g0 easing;

    public /* synthetic */ y0(Object obj, g0 g0Var, fr.k kVar) {
        this(obj, g0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g0 getEasing() {
        return this.easing;
    }

    public final T b() {
        return this.value;
    }

    public final void c(g0 g0Var) {
        this.easing = g0Var;
    }

    private y0(T t15, g0 g0Var) {
        this.value = t15;
        this.easing = g0Var;
    }
}
