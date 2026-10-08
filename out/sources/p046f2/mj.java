package p046f2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJq\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!¨\u00061"}, d2 = {"Lf2/mj;", "", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLfr/k;)V", "a", "(JJJJJJJJJJ)Lf2/mj;", "", "enabled", "b", "(Z)J", "active", "d", "(ZZ)J", "c", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getThumbColor-0d7_KjU", "()J", "getActiveTrackColor-0d7_KjU", "getActiveTickColor-0d7_KjU", "getInactiveTrackColor-0d7_KjU", "e", "getInactiveTickColor-0d7_KjU", "f", "getDisabledThumbColor-0d7_KjU", "g", "getDisabledActiveTrackColor-0d7_KjU", "h", "getDisabledActiveTickColor-0d7_KjU", "i", "getDisabledInactiveTrackColor-0d7_KjU", "j", "getDisabledInactiveTickColor-0d7_KjU", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long thumbColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long activeTrackColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long activeTickColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long inactiveTrackColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long inactiveTickColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledThumbColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveTrackColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledActiveTickColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveTrackColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledInactiveTickColor;

    public /* synthetic */ mj(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29);
    }

    public final mj a(long thumbColor, long activeTrackColor, long activeTickColor, long inactiveTrackColor, long inactiveTickColor, long disabledThumbColor, long disabledActiveTrackColor, long disabledActiveTickColor, long disabledInactiveTrackColor, long disabledInactiveTickColor) {
        return new mj(thumbColor != 16 ? thumbColor : this.thumbColor, activeTrackColor != 16 ? activeTrackColor : this.activeTrackColor, activeTickColor != 16 ? activeTickColor : this.activeTickColor, inactiveTrackColor != 16 ? inactiveTrackColor : this.inactiveTrackColor, inactiveTickColor != 16 ? inactiveTickColor : this.inactiveTickColor, disabledThumbColor != 16 ? disabledThumbColor : this.disabledThumbColor, disabledActiveTrackColor != 16 ? disabledActiveTrackColor : this.disabledActiveTrackColor, disabledActiveTickColor != 16 ? disabledActiveTickColor : this.disabledActiveTickColor, disabledInactiveTrackColor != 16 ? disabledInactiveTrackColor : this.disabledInactiveTrackColor, disabledInactiveTickColor != 16 ? disabledInactiveTickColor : this.disabledInactiveTickColor, null);
    }

    public final long b(boolean enabled) {
        return enabled ? this.thumbColor : this.disabledThumbColor;
    }

    public final long c(boolean enabled, boolean active) {
        if (enabled) {
            return active ? this.activeTickColor : this.inactiveTickColor;
        }
        return active ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    public final long d(boolean enabled, boolean active) {
        if (enabled) {
            return active ? this.activeTrackColor : this.inactiveTrackColor;
        }
        return active ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) other;
        return Color.m11equalsimpl0(this.thumbColor, mjVar.thumbColor) && Color.m11equalsimpl0(this.activeTrackColor, mjVar.activeTrackColor) && Color.m11equalsimpl0(this.activeTickColor, mjVar.activeTickColor) && Color.m11equalsimpl0(this.inactiveTrackColor, mjVar.inactiveTrackColor) && Color.m11equalsimpl0(this.inactiveTickColor, mjVar.inactiveTickColor) && Color.m11equalsimpl0(this.disabledThumbColor, mjVar.disabledThumbColor) && Color.m11equalsimpl0(this.disabledActiveTrackColor, mjVar.disabledActiveTrackColor) && Color.m11equalsimpl0(this.disabledActiveTickColor, mjVar.disabledActiveTickColor) && Color.m11equalsimpl0(this.disabledInactiveTrackColor, mjVar.disabledInactiveTrackColor) && Color.m11equalsimpl0(this.disabledInactiveTickColor, mjVar.disabledInactiveTickColor);
    }

    public int hashCode() {
        return (((((((((((((((((Color.m17hashCodeimpl(this.thumbColor) * 31) + Color.m17hashCodeimpl(this.activeTrackColor)) * 31) + Color.m17hashCodeimpl(this.activeTickColor)) * 31) + Color.m17hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m17hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m17hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m17hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m17hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m17hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m17hashCodeimpl(this.disabledInactiveTickColor);
    }

    private mj(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29) {
        this.thumbColor = j15;
        this.activeTrackColor = j16;
        this.activeTickColor = j17;
        this.inactiveTrackColor = j18;
        this.inactiveTickColor = j19;
        this.disabledThumbColor = j25;
        this.disabledActiveTrackColor = j26;
        this.disabledActiveTickColor = j27;
        this.disabledInactiveTrackColor = j28;
        this.disabledInactiveTickColor = j29;
    }
}
