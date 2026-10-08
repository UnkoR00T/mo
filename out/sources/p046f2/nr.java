package p046f2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import n3.o1;
import p071kotlin.Metadata;
import u0.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJI\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lf2/nr;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "subtitleContentColor", "<init>", "(JJJJJJLfr/k;)V", "b", "(JJJJJJ)Lf2/nr;", "", "colorTransitionFraction", "a", "(F)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getScrolledContainerColor-0d7_KjU", "c", "d", "f", "e", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long scrolledContainerColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long navigationIconContentColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long titleContentColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long actionIconContentColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long subtitleContentColor;

    public /* synthetic */ nr(long j15, long j16, long j17, long j18, long j19, long j25, k kVar) {
        this(j15, j16, j17, j18, j19, j25);
    }

    public final long a(float colorTransitionFraction) {
        return o1.h(this.containerColor, this.scrolledContainerColor, i0.c().a(colorTransitionFraction));
    }

    public final nr b(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, long subtitleContentColor) {
        return new nr(containerColor != 16 ? containerColor : this.containerColor, scrolledContainerColor != 16 ? scrolledContainerColor : this.scrolledContainerColor, navigationIconContentColor != 16 ? navigationIconContentColor : this.navigationIconContentColor, titleContentColor != 16 ? titleContentColor : this.titleContentColor, actionIconContentColor != 16 ? actionIconContentColor : this.actionIconContentColor, subtitleContentColor != 16 ? subtitleContentColor : this.subtitleContentColor, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getActionIconContentColor() {
        return this.actionIconContentColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNavigationIconContentColor() {
        return this.navigationIconContentColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSubtitleContentColor() {
        return this.subtitleContentColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof nr)) {
            return false;
        }
        nr nrVar = (nr) other;
        return Color.m11equalsimpl0(this.containerColor, nrVar.containerColor) && Color.m11equalsimpl0(this.scrolledContainerColor, nrVar.scrolledContainerColor) && Color.m11equalsimpl0(this.navigationIconContentColor, nrVar.navigationIconContentColor) && Color.m11equalsimpl0(this.titleContentColor, nrVar.titleContentColor) && Color.m11equalsimpl0(this.actionIconContentColor, nrVar.actionIconContentColor) && Color.m11equalsimpl0(this.subtitleContentColor, nrVar.subtitleContentColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((((Color.m17hashCodeimpl(this.containerColor) * 31) + Color.m17hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m17hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m17hashCodeimpl(this.titleContentColor)) * 31) + Color.m17hashCodeimpl(this.actionIconContentColor)) * 31) + Color.m17hashCodeimpl(this.subtitleContentColor);
    }

    private nr(long j15, long j16, long j17, long j18, long j19, long j25) {
        this.containerColor = j15;
        this.scrolledContainerColor = j16;
        this.navigationIconContentColor = j17;
        this.titleContentColor = j18;
        this.actionIconContentColor = j19;
        this.subtitleContentColor = j25;
    }
}
