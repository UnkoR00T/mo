package p046f2;

import fr.k;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import u0.d1;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lf2/pd;", "Lf2/lr;", "", "isVisible", "isPersistent", "<init>", "(ZZ)V", "Lw0/z1;", "mutatePriority", "Loq/i0;", "b", "(Lw0/z1;Ltq/e;)Ljava/lang/Object;", "dismiss", "()V", "a", "Z", "()Z", "e", "Lu0/d1;", "c", "Lu0/d1;", "()Lu0/d1;", "transition", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class pd implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d1<Boolean> transition;

    /* JADX WARN: Illegal instructions before constructor call */
    public pd() {
        boolean z15 = false;
        this(z15, z15, 3, null);
    }

    @Override // p046f2.lr
    public void a() {
    }

    @Override // p046f2.lr
    public Object b(z1 z1Var, e<? super i0> eVar) {
        return i0.f148189a;
    }

    @Override // p046f2.lr
    public d1<Boolean> c() {
        return this.transition;
    }

    @Override // p046f2.lr
    public void dismiss() {
    }

    @Override // p046f2.lr
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // p046f2.lr
    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    public pd(boolean z15, boolean z16) {
        this.isVisible = z15;
        this.isPersistent = z16;
        this.transition = new d1<>(Boolean.FALSE);
    }

    public /* synthetic */ pd(boolean z15, boolean z16, int i15, k kVar) {
        this((i15 & 1) != 0 ? true : z15, (i15 & 2) != 0 ? true : z16);
    }
}
