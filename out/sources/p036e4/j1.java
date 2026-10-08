package p036e4;

import er.l;
import g4.l0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Le4/j1;", "Lg4/l0;", "Le4/m1;", "Lkotlin/Function1;", "Le4/b0;", "Loq/i0;", "onGloballyPositioned", "<init>", "(Ler/l;)V", "a", "()Le4/m1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "node", "l", "(Le4/m1;)V", "d", "Ler/l;", "getOnGloballyPositioned", "()Ler/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j1 extends l0<m1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<b0, i0> onGloballyPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(l<? super b0, i0> lVar) {
        this.onGloballyPositioned = lVar;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1 create() {
        return new m1(this.onGloballyPositioned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof j1) && this.onGloballyPositioned == ((j1) other).onGloballyPositioned;
    }

    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(m1 node) {
        node.n3(this.onGloballyPositioned);
    }
}
