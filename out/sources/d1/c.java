package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ld1/c;", "Lg4/l0;", "Ld1/d;", "Le4/a;", "alignmentLine", "Lc5/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v1;", "Loq/i0;", "inspectorInfo", "<init>", "(Le4/a;FFLer/l;Lfr/k;)V", "a", "()Ld1/d;", "node", "l", "(Ld1/d;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Le4/a;", "getAlignmentLine", "()Le4/a;", "e", "F", "getBefore-D9Ej5fM", "()F", "f", "getAfter-D9Ej5fM", "g", "Ler/l;", "getInspectorInfo", "()Ler/l;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c extends g4.l0<d> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p036e4.a alignmentLine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.l<androidx.compose.ui.platform.v1, oq.i0> inspectorInfo;

    public /* synthetic */ c(p036e4.a aVar, float f15, float f16, er.l lVar, fr.k kVar) {
        this(aVar, f15, f16, lVar);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d create() {
        return new d(this.alignmentLine, this.before, this.after, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        c cVar = other instanceof c ? (c) other : null;
        return cVar != null && fr.t.c(this.alignmentLine, cVar.alignmentLine) && c5.h.p(this.before, cVar.before) && c5.h.p(this.after, cVar.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + c5.h.q(this.before)) * 31) + c5.h.q(this.after);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(d node) {
        node.o3(this.alignmentLine);
        node.p3(this.before);
        node.n3(this.after);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(p036e4.a aVar, float f15, float f16, er.l<? super androidx.compose.ui.platform.v1, oq.i0> lVar) {
        this.alignmentLine = aVar;
        this.before = f15;
        this.after = f16;
        this.inspectorInfo = lVar;
        boolean z15 = true;
        boolean z16 = f15 >= 0.0f || Float.isNaN(f15);
        if (f16 < 0.0f && !Float.isNaN(f16)) {
            z15 = false;
        }
        if (!z16 || !z15) {
            e1.a.a("Padding from alignment line must be a non-negative number");
        }
    }
}
