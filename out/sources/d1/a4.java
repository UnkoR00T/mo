package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ld1/a4;", "Lg4/l0;", "Ld1/b4;", "Lf3/c$c;", "alignment", "<init>", "(Lf3/c$c;)V", "a", "()Ld1/b4;", "node", "Loq/i0;", "l", "(Ld1/b4;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lf3/c$c;", "getAlignment", "()Lf3/c$c;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a4 extends g4.l0<b4> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f3.c.InterfaceC1317c alignment;

    public a4(f3.c.InterfaceC1317c interfaceC1317c) {
        this.alignment = interfaceC1317c;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b4 create() {
        return new b4(this.alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        a4 a4Var = other instanceof a4 ? (a4) other : null;
        if (a4Var == null) {
            return false;
        }
        return fr.t.c(this.alignment, a4Var.alignment);
    }

    public int hashCode() {
        return this.alignment.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(b4 node) {
        node.o3(this.alignment);
    }
}
