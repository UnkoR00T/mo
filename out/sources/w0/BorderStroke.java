package w0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: w0.w, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lw0/w;", "", "Lc5/h;", "width", "Landroidx/compose/ui/graphics/c;", "brush", "<init>", "(FLandroidx/compose/ui/graphics/c;Lfr/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "Landroidx/compose/ui/graphics/c;", "()Landroidx/compose/ui/graphics/c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorderStroke {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.graphics.c brush;

    public /* synthetic */ BorderStroke(float f15, androidx.compose.ui.graphics.c cVar, fr.k kVar) {
        this(f15, cVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.compose.ui.graphics.c getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) other;
        return c5.h.p(this.width, borderStroke.width) && fr.t.c(this.brush, borderStroke.brush);
    }

    public int hashCode() {
        return (c5.h.q(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) c5.h.r(this.width)) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f15, androidx.compose.ui.graphics.c cVar) {
        this.width = f15;
        this.brush = cVar;
    }
}
