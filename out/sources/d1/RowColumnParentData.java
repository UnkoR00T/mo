package d1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.l3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0015\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b \u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ld1/l3;", "", "", "weight", "", "fill", "Ld1/m0;", "crossAxisAlignment", "Ld1/s0;", "flowLayoutData", "<init>", "(FZLd1/m0;Ld1/s0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "d", "()F", "g", "(F)V", "b", "Z", "()Z", "f", "(Z)V", "c", "Ld1/m0;", "()Ld1/m0;", "e", "(Ld1/m0;)V", "Ld1/s0;", "()Ld1/s0;", "setFlowLayoutData", "(Ld1/s0;)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RowColumnParentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private float weight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean fill;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private m0 crossAxisAlignment;

    public RowColumnParentData(float f15, boolean z15, m0 m0Var, s0 s0Var) {
        this.weight = f15;
        this.fill = z15;
        this.crossAxisAlignment = m0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m0 getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    public final s0 c() {
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public final void e(m0 m0Var) {
        this.crossAxisAlignment = m0Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) other;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && fr.t.c(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && fr.t.c(null, null);
    }

    public final void f(boolean z15) {
        this.fill = z15;
    }

    public final void g(float f15) {
        this.weight = f15;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        m0 m0Var = this.crossAxisAlignment;
        return (iHashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + ((Object) null) + ')';
    }

    public /* synthetic */ RowColumnParentData(float f15, boolean z15, m0 m0Var, s0 s0Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? 0.0f : f15, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? null : m0Var, (i15 & 8) != 0 ? null : s0Var);
    }
}
