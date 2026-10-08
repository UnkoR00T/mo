package p046f2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0099\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$¨\u0006:"}, d2 = {"Lf2/vo;", "", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLfr/k;)V", "a", "(JJJJJJJJJJJJJJ)Lf2/vo;", "", "selected", "c", "(Z)J", "d", "e", "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getClockDialColor-0d7_KjU", "()J", "b", "getSelectorColor-0d7_KjU", "getContainerColor-0d7_KjU", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "g", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "h", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "i", "getPeriodSelectorSelectedContentColor-0d7_KjU", "j", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "k", "getTimeSelectorSelectedContainerColor-0d7_KjU", "l", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "m", "getTimeSelectorSelectedContentColor-0d7_KjU", "n", "getTimeSelectorUnselectedContentColor-0d7_KjU", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long clockDialColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long selectorColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorBorderColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long clockDialSelectedContentColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long clockDialUnselectedContentColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorSelectedContentColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long periodSelectorUnselectedContentColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorSelectedContentColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long timeSelectorUnselectedContentColor;

    public /* synthetic */ vo(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, j37, j38);
    }

    public final vo a(long clockDialColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor) {
        return new vo(clockDialColor != 16 ? clockDialColor : this.clockDialColor, selectorColor != 16 ? selectorColor : this.selectorColor, containerColor != 16 ? containerColor : this.containerColor, periodSelectorBorderColor != 16 ? periodSelectorBorderColor : this.periodSelectorBorderColor, clockDialSelectedContentColor != 16 ? clockDialSelectedContentColor : this.clockDialSelectedContentColor, clockDialUnselectedContentColor != 16 ? clockDialUnselectedContentColor : this.clockDialUnselectedContentColor, periodSelectorSelectedContainerColor != 16 ? periodSelectorSelectedContainerColor : this.periodSelectorSelectedContainerColor, periodSelectorUnselectedContainerColor != 16 ? periodSelectorUnselectedContainerColor : this.periodSelectorUnselectedContainerColor, periodSelectorSelectedContentColor != 16 ? periodSelectorSelectedContentColor : this.periodSelectorSelectedContentColor, periodSelectorUnselectedContentColor != 16 ? periodSelectorUnselectedContentColor : this.periodSelectorUnselectedContentColor, timeSelectorSelectedContainerColor != 16 ? timeSelectorSelectedContainerColor : this.timeSelectorSelectedContainerColor, timeSelectorUnselectedContainerColor != 16 ? timeSelectorUnselectedContainerColor : this.timeSelectorUnselectedContainerColor, timeSelectorSelectedContentColor != 16 ? timeSelectorSelectedContentColor : this.timeSelectorSelectedContentColor, timeSelectorUnselectedContentColor != 16 ? timeSelectorUnselectedContentColor : this.timeSelectorUnselectedContentColor, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }

    public final long c(boolean selected) {
        return selected ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    public final long d(boolean selected) {
        return selected ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    public final long e(boolean selected) {
        return selected ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || vo.class != other.getClass()) {
            return false;
        }
        vo voVar = (vo) other;
        return Color.m11equalsimpl0(this.clockDialColor, voVar.clockDialColor) && Color.m11equalsimpl0(this.selectorColor, voVar.selectorColor) && Color.m11equalsimpl0(this.containerColor, voVar.containerColor) && Color.m11equalsimpl0(this.periodSelectorBorderColor, voVar.periodSelectorBorderColor) && Color.m11equalsimpl0(this.periodSelectorSelectedContainerColor, voVar.periodSelectorSelectedContainerColor) && Color.m11equalsimpl0(this.periodSelectorUnselectedContainerColor, voVar.periodSelectorUnselectedContainerColor) && Color.m11equalsimpl0(this.periodSelectorSelectedContentColor, voVar.periodSelectorSelectedContentColor) && Color.m11equalsimpl0(this.periodSelectorUnselectedContentColor, voVar.periodSelectorUnselectedContentColor) && Color.m11equalsimpl0(this.timeSelectorSelectedContainerColor, voVar.timeSelectorSelectedContainerColor) && Color.m11equalsimpl0(this.timeSelectorUnselectedContainerColor, voVar.timeSelectorUnselectedContainerColor) && Color.m11equalsimpl0(this.timeSelectorSelectedContentColor, voVar.timeSelectorSelectedContentColor) && Color.m11equalsimpl0(this.timeSelectorUnselectedContentColor, voVar.timeSelectorUnselectedContentColor);
    }

    public final long f(boolean selected) {
        return selected ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m17hashCodeimpl(this.clockDialColor) * 31) + Color.m17hashCodeimpl(this.selectorColor)) * 31) + Color.m17hashCodeimpl(this.containerColor)) * 31) + Color.m17hashCodeimpl(this.periodSelectorBorderColor)) * 31) + Color.m17hashCodeimpl(this.periodSelectorSelectedContainerColor)) * 31) + Color.m17hashCodeimpl(this.periodSelectorUnselectedContainerColor)) * 31) + Color.m17hashCodeimpl(this.periodSelectorSelectedContentColor)) * 31) + Color.m17hashCodeimpl(this.periodSelectorUnselectedContentColor)) * 31) + Color.m17hashCodeimpl(this.timeSelectorSelectedContainerColor)) * 31) + Color.m17hashCodeimpl(this.timeSelectorUnselectedContainerColor)) * 31) + Color.m17hashCodeimpl(this.timeSelectorSelectedContentColor)) * 31) + Color.m17hashCodeimpl(this.timeSelectorUnselectedContentColor);
    }

    private vo(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38) {
        this.clockDialColor = j15;
        this.selectorColor = j16;
        this.containerColor = j17;
        this.periodSelectorBorderColor = j18;
        this.clockDialSelectedContentColor = j19;
        this.clockDialUnselectedContentColor = j25;
        this.periodSelectorSelectedContainerColor = j26;
        this.periodSelectorUnselectedContainerColor = j27;
        this.periodSelectorSelectedContentColor = j28;
        this.periodSelectorUnselectedContentColor = j29;
        this.timeSelectorSelectedContainerColor = j35;
        this.timeSelectorUnselectedContainerColor = j36;
        this.timeSelectorSelectedContentColor = j37;
        this.timeSelectorUnselectedContentColor = j38;
    }
}
