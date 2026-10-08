package p046f2;

import c5.h;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f2.sm, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, d2 = {"Lf2/sm;", "", "Lc5/h;", "left", "width", "contentWidth", "<init>", "(FFFLfr/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "()F", "b", "c", "getContentWidth-D9Ej5fM", "right", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float contentWidth;

    public /* synthetic */ TabPosition(float f15, float f16, float f17, k kVar) {
        this(f15, f16, f17);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final float b() {
        return h.n(this.left + this.width);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) other;
        return h.p(this.left, tabPosition.left) && h.p(this.width, tabPosition.width) && h.p(this.contentWidth, tabPosition.contentWidth);
    }

    public int hashCode() {
        return (((h.q(this.left) * 31) + h.q(this.width)) * 31) + h.q(this.contentWidth);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) h.r(this.left)) + ", right=" + ((Object) h.r(b())) + ", width=" + ((Object) h.r(this.width)) + ", contentWidth=" + ((Object) h.r(this.contentWidth)) + ')';
    }

    private TabPosition(float f15, float f16, float f17) {
        this.left = f15;
        this.width = f16;
        this.contentWidth = f17;
    }
}
