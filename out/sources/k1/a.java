package k1;

import b1.l;
import fr.t;
import g4.l0;
import oq.i0;
import p071kotlin.Metadata;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lk1/a;", "Lg4/l0;", "Lk1/e;", "", "selected", "Lb1/l;", "interactionSource", "Lw0/r1;", "indicationNodeFactory", "useLocalIndication", "enabled", "Ln4/l;", "role", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(ZLb1/l;Lw0/r1;ZZLn4/l;Ler/a;Lfr/k;)V", "a", "()Lk1/e;", "node", "l", "(Lk1/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Z", "e", "Lb1/l;", "f", "Lw0/r1;", "g", "h", "i", "Ln4/l;", "j", "Ler/a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends l0<e> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r1 indicationNodeFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean useLocalIndication;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final n4.l role;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onClick;

    public /* synthetic */ a(boolean z15, l lVar, r1 r1Var, boolean z16, boolean z17, n4.l lVar2, er.a aVar, fr.k kVar) {
        this(z15, lVar, r1Var, z16, z17, lVar2, aVar);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e create() {
        return new e(this.selected, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || a.class != other.getClass()) {
            return false;
        }
        a aVar = (a) other;
        return this.selected == aVar.selected && t.c(this.interactionSource, aVar.interactionSource) && t.c(this.indicationNodeFactory, aVar.indicationNodeFactory) && this.useLocalIndication == aVar.useLocalIndication && this.enabled == aVar.enabled && t.c(this.role, aVar.role) && this.onClick == aVar.onClick;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.selected) * 31;
        l lVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        r1 r1Var = this.indicationNodeFactory;
        int iHashCode3 = (((((iHashCode2 + (r1Var != null ? r1Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        n4.l lVar2 = this.role;
        return ((iHashCode3 + (lVar2 != null ? n4.l.n(lVar2.getValue()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(e node) {
        node.t4(this.selected, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick);
    }

    private a(boolean z15, l lVar, r1 r1Var, boolean z16, boolean z17, n4.l lVar2, er.a<i0> aVar) {
        this.selected = z15;
        this.interactionSource = lVar;
        this.indicationNodeFactory = r1Var;
        this.useLocalIndication = z16;
        this.enabled = z17;
        this.role = lVar2;
        this.onClick = aVar;
    }
}
