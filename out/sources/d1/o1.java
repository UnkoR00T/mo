package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Ld1/o1;", "Lg4/d1;", "Lf3/m$c;", "Lf3/c$b;", "horizontal", "<init>", "(Lf3/c$b;)V", "Lc5/d;", "", "parentData", "Ld1/l3;", "n3", "(Lc5/d;Ljava/lang/Object;)Ld1/l3;", "r", "Lf3/c$b;", "getHorizontal", "()Lf3/c$b;", "o3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 extends f3.m.c implements g4.d1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private f3.c.b horizontal;

    public o1(f3.c.b bVar) {
        this.horizontal = bVar;
    }

    @Override // g4.d1
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData n(c5.d dVar, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.e(m0.INSTANCE.a(this.horizontal));
        return rowColumnParentData;
    }

    public final void o3(f3.c.b bVar) {
        this.horizontal = bVar;
    }
}
