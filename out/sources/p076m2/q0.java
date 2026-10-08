package p076m2;

import er.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lm2/q0;", "Lm2/u4;", "Lkotlin/Function1;", "Lm2/s0;", "Lm2/r0;", "effect", "<init>", "(Ler/l;)V", "Loq/i0;", "c", "()V", "e", "d", "a", "Ler/l;", "b", "Lm2/r0;", "onDispose", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q0 implements u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<s0, r0> effect;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r0 onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(l<? super s0, ? extends r0> lVar) {
        this.effect = lVar;
    }

    @Override // p076m2.u4
    public void c() {
        this.onDispose = this.effect.b(Function0.f123201a);
    }

    @Override // p076m2.u4
    public void d() {
    }

    @Override // p076m2.u4
    public void e() {
        r0 r0Var = this.onDispose;
        if (r0Var != null) {
            r0Var.j();
        }
        this.onDispose = null;
    }
}
