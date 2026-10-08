package p046f2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lf2/x1;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLfr/k;)V", "c", "(JJJJ)Lf2/x1;", "", "enabled", "a", "(Z)J", "b", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "d", "getDisabledContentColor-0d7_KjU", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ x1(long j15, long j16, long j17, long j18, k kVar) {
        this(j15, j16, j17, j18);
    }

    public static /* synthetic */ x1 d(x1 x1Var, long j15, long j16, long j17, long j18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = x1Var.containerColor;
        }
        long j19 = j15;
        if ((i15 & 2) != 0) {
            j16 = x1Var.contentColor;
        }
        long j25 = j16;
        if ((i15 & 4) != 0) {
            j17 = x1Var.disabledContainerColor;
        }
        return x1Var.c(j19, j25, j17, (i15 & 8) != 0 ? x1Var.disabledContentColor : j18);
    }

    public final long a(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    public final long b(boolean enabled) {
        return enabled ? this.contentColor : this.disabledContentColor;
    }

    public final x1 c(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor) {
        return new x1(containerColor != 16 ? containerColor : this.containerColor, contentColor != 16 ? contentColor : this.contentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledContentColor != 16 ? disabledContentColor : this.disabledContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) other;
        return Color.m11equalsimpl0(this.containerColor, x1Var.containerColor) && Color.m11equalsimpl0(this.contentColor, x1Var.contentColor) && Color.m11equalsimpl0(this.disabledContainerColor, x1Var.disabledContainerColor) && Color.m11equalsimpl0(this.disabledContentColor, x1Var.disabledContentColor);
    }

    public int hashCode() {
        return (((((Color.m17hashCodeimpl(this.containerColor) * 31) + Color.m17hashCodeimpl(this.contentColor)) * 31) + Color.m17hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m17hashCodeimpl(this.disabledContentColor);
    }

    private x1(long j15, long j16, long j17, long j18) {
        this.containerColor = j15;
        this.contentColor = j16;
        this.disabledContainerColor = j17;
        this.disabledContentColor = j18;
    }
}
