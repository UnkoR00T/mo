package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld1/y3;", "Ld1/r1;", "Ld1/c4;", "insets", "<init>", "(Ld1/c4;)V", "ancestorConsumedInsets", "p3", "(Ld1/c4;)Ld1/c4;", "Loq/i0;", "x3", "t", "Ld1/c4;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y3 extends r1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private c4 insets;

    public y3(c4 c4Var) {
        this.insets = c4Var;
    }

    @Override // d1.r1
    public c4 p3(c4 ancestorConsumedInsets) {
        return f4.i(ancestorConsumedInsets, this.insets);
    }

    public final void x3(c4 insets) {
        if (fr.t.c(insets, this.insets)) {
            return;
        }
        this.insets = insets;
        s3();
    }
}
