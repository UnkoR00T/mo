package p056h1;

import er.a;
import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u0006."}, d2 = {"Lh1/v1;", "Lg4/l0;", "Lh1/b2;", "Lkotlin/Function0;", "Lh1/o0;", "itemProviderLambda", "Lh1/t1;", "state", "Lz0/a2;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Ler/a;Lh1/t1;Lz0/a2;ZZ)V", "a", "()Lh1/b2;", "node", "Loq/i0;", "l", "(Lh1/b2;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ler/a;", "getItemProviderLambda", "()Ler/a;", "e", "Lh1/t1;", "getState", "()Lh1/t1;", "f", "Lz0/a2;", "getOrientation", "()Lz0/a2;", "g", "Z", "getUserScrollEnabled", "()Z", "h", "getReverseScrolling", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v1 extends l0<b2> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a<o0> itemProviderLambda;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t1 state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a2 orientation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean userScrollEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseScrolling;

    /* JADX WARN: Multi-variable type inference failed */
    public v1(a<? extends o0> aVar, t1 t1Var, a2 a2Var, boolean z15, boolean z16) {
        this.itemProviderLambda = aVar;
        this.state = t1Var;
        this.orientation = a2Var;
        this.userScrollEnabled = z15;
        this.reverseScrolling = z16;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b2 create() {
        return new b2(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) other;
        return this.itemProviderLambda == v1Var.itemProviderLambda && t.c(this.state, v1Var.state) && this.orientation == v1Var.orientation && this.userScrollEnabled == v1Var.userScrollEnabled && this.reverseScrolling == v1Var.reverseScrolling;
    }

    public int hashCode() {
        return (((((((this.itemProviderLambda.hashCode() * 31) + this.state.hashCode()) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.userScrollEnabled)) * 31) + Boolean.hashCode(this.reverseScrolling);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(b2 node) {
        node.x3(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }
}
