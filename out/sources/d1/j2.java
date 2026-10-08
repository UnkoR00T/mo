package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ld1/j2;", "Lg4/d1;", "Lf3/m$c;", "", "weight", "", "fill", "<init>", "(FZ)V", "Lc5/d;", "", "parentData", "Ld1/l3;", "n3", "(Lc5/d;Ljava/lang/Object;)Ld1/l3;", "r", "F", "getWeight", "()F", "p3", "(F)V", "s", "Z", "getFill", "()Z", "o3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j2 extends f3.m.c implements g4.d1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float weight;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean fill;

    public j2(float f15, boolean z15) {
        this.weight = f15;
        this.fill = z15;
    }

    @Override // g4.d1
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData n(c5.d dVar, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.g(this.weight);
        rowColumnParentData.f(this.fill);
        return rowColumnParentData;
    }

    public final void o3(boolean z15) {
        this.fill = z15;
    }

    public final void p3(float f15) {
        this.weight = f15;
    }
}
