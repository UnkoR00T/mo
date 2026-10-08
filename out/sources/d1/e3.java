package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ld1/e3;", "Lg4/l0;", "Ld1/h3;", "Ld1/d3;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v1;", "Loq/i0;", "inspectorInfo", "<init>", "(Ld1/d3;Ler/l;)V", "a", "()Ld1/h3;", "node", "l", "(Ld1/h3;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ld1/d3;", "getPaddingValues", "()Ld1/d3;", "e", "Ler/l;", "getInspectorInfo", "()Ler/l;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e3 extends g4.l0<h3> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d3 paddingValues;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<androidx.compose.ui.platform.v1, oq.i0> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public e3(d3 d3Var, er.l<? super androidx.compose.ui.platform.v1, oq.i0> lVar) {
        this.paddingValues = d3Var;
        this.inspectorInfo = lVar;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h3 create() {
        return new h3(this.paddingValues);
    }

    public boolean equals(Object other) {
        e3 e3Var = other instanceof e3 ? (e3) other : null;
        if (e3Var == null) {
            return false;
        }
        return fr.t.c(this.paddingValues, e3Var.paddingValues);
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(h3 node) {
        node.p3(this.paddingValues);
    }
}
