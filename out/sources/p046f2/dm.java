package p046f2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010%R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b8\u0010%R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010#\u001a\u0004\b<\u0010%R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\b@\u0010%¨\u0006A"}, d2 = {"Lf2/dm;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLfr/k;)V", "", "enabled", "checked", "c", "(ZZ)J", "d", "a", "b", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getCheckedThumbColor-0d7_KjU", "()J", "getCheckedTrackColor-0d7_KjU", "getCheckedBorderColor-0d7_KjU", "getCheckedIconColor-0d7_KjU", "e", "getUncheckedThumbColor-0d7_KjU", "f", "getUncheckedTrackColor-0d7_KjU", "g", "getUncheckedBorderColor-0d7_KjU", "h", "getUncheckedIconColor-0d7_KjU", "i", "getDisabledCheckedThumbColor-0d7_KjU", "j", "getDisabledCheckedTrackColor-0d7_KjU", "k", "getDisabledCheckedBorderColor-0d7_KjU", "l", "getDisabledCheckedIconColor-0d7_KjU", "m", "getDisabledUncheckedThumbColor-0d7_KjU", "n", "getDisabledUncheckedTrackColor-0d7_KjU", "o", "getDisabledUncheckedBorderColor-0d7_KjU", "p", "getDisabledUncheckedIconColor-0d7_KjU", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long checkedThumbColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long checkedTrackColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long checkedBorderColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long checkedIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedThumbColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedTrackColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBorderColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedThumbColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedTrackColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBorderColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedThumbColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedTrackColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBorderColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedIconColor;

    public /* synthetic */ dm(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, j37, j38, j39, j45);
    }

    public final long a(boolean enabled, boolean checked) {
        if (enabled) {
            return checked ? this.checkedBorderColor : this.uncheckedBorderColor;
        }
        return checked ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    public final long b(boolean enabled, boolean checked) {
        if (enabled) {
            return checked ? this.checkedIconColor : this.uncheckedIconColor;
        }
        return checked ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    public final long c(boolean enabled, boolean checked) {
        if (enabled) {
            return checked ? this.checkedThumbColor : this.uncheckedThumbColor;
        }
        return checked ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    public final long d(boolean enabled, boolean checked) {
        if (enabled) {
            return checked ? this.checkedTrackColor : this.uncheckedTrackColor;
        }
        return checked ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) other;
        return Color.m11equalsimpl0(this.checkedThumbColor, dmVar.checkedThumbColor) && Color.m11equalsimpl0(this.checkedTrackColor, dmVar.checkedTrackColor) && Color.m11equalsimpl0(this.checkedBorderColor, dmVar.checkedBorderColor) && Color.m11equalsimpl0(this.checkedIconColor, dmVar.checkedIconColor) && Color.m11equalsimpl0(this.uncheckedThumbColor, dmVar.uncheckedThumbColor) && Color.m11equalsimpl0(this.uncheckedTrackColor, dmVar.uncheckedTrackColor) && Color.m11equalsimpl0(this.uncheckedBorderColor, dmVar.uncheckedBorderColor) && Color.m11equalsimpl0(this.uncheckedIconColor, dmVar.uncheckedIconColor) && Color.m11equalsimpl0(this.disabledCheckedThumbColor, dmVar.disabledCheckedThumbColor) && Color.m11equalsimpl0(this.disabledCheckedTrackColor, dmVar.disabledCheckedTrackColor) && Color.m11equalsimpl0(this.disabledCheckedBorderColor, dmVar.disabledCheckedBorderColor) && Color.m11equalsimpl0(this.disabledCheckedIconColor, dmVar.disabledCheckedIconColor) && Color.m11equalsimpl0(this.disabledUncheckedThumbColor, dmVar.disabledUncheckedThumbColor) && Color.m11equalsimpl0(this.disabledUncheckedTrackColor, dmVar.disabledUncheckedTrackColor) && Color.m11equalsimpl0(this.disabledUncheckedBorderColor, dmVar.disabledUncheckedBorderColor) && Color.m11equalsimpl0(this.disabledUncheckedIconColor, dmVar.disabledUncheckedIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m17hashCodeimpl(this.checkedThumbColor) * 31) + Color.m17hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m17hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m17hashCodeimpl(this.checkedIconColor)) * 31) + Color.m17hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m17hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m17hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m17hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m17hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m17hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m17hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m17hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m17hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m17hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m17hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m17hashCodeimpl(this.disabledUncheckedIconColor);
    }

    private dm(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45) {
        this.checkedThumbColor = j15;
        this.checkedTrackColor = j16;
        this.checkedBorderColor = j17;
        this.checkedIconColor = j18;
        this.uncheckedThumbColor = j19;
        this.uncheckedTrackColor = j25;
        this.uncheckedBorderColor = j26;
        this.uncheckedIconColor = j27;
        this.disabledCheckedThumbColor = j28;
        this.disabledCheckedTrackColor = j29;
        this.disabledCheckedBorderColor = j35;
        this.disabledCheckedIconColor = j36;
        this.disabledUncheckedThumbColor = j37;
        this.disabledUncheckedTrackColor = j38;
        this.disabledUncheckedBorderColor = j39;
        this.disabledUncheckedIconColor = j45;
    }
}
