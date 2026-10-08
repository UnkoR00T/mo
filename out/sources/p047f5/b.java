package p047f5;

import j5.a;
import j5.e;
import j5.f;
import j5.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lf5/b;", "Lf5/w;", "Lj5/f;", "containerObject", "", "index", "<init>", "(Lj5/f;I)V", "Lf5/i$b;", "anchor", "Lc5/h;", "margin", "goneMargin", "Loq/i0;", "b", "(Lf5/i$b;FF)V", "a", "Lj5/f;", "", "Ljava/lang/String;", "anchorName", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f containerObject;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String anchorName;

    public b(f fVar, int i15) {
        this.containerObject = fVar;
        this.anchorName = a.f59146a.a(i15);
    }

    @Override // p047f5.w
    public final void b(i.HorizontalAnchor anchor, float margin, float goneMargin) {
        String strA = a.f59146a.a(anchor.getIndex());
        a aVar = new a(new char[0]);
        aVar.v(i.v(anchor.getId().toString()));
        aVar.v(i.v(strA));
        aVar.v(new e(margin));
        aVar.v(new e(goneMargin));
        this.containerObject.j0(this.anchorName, aVar);
    }
}
