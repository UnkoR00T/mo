package p046f2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001f\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010!R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\u001f\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010!R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010\u001f\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010!R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010\u001f\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010!R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010\u001f\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010!R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010\u001f\u0012\u0004\b<\u0010-\u001a\u0004\b;\u0010!¨\u0006="}, d2 = {"Lf2/ae;", "", "Landroidx/compose/ui/graphics/Color;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "containerColor", "disabledContainerColor", "selectedTextColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "selectedContainerColor", "<init>", "(JJJJJJJJJJJJLfr/k;)V", "(JJJJJJLfr/k;)V", "", "enabled", "selected", "c", "(ZZ)J", "a", "e", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getTextColor-0d7_KjU", "()J", "b", "getLeadingIconColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "d", "getDisabledTextColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "f", "getDisabledTrailingIconColor-0d7_KjU", "g", "getContainerColor-0d7_KjU", "getContainerColor-0d7_KjU$annotations", "()V", "h", "getDisabledContainerColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU$annotations", "i", "getSelectedContainerColor-0d7_KjU", "getSelectedContainerColor-0d7_KjU$annotations", "j", "getSelectedTextColor-0d7_KjU", "getSelectedTextColor-0d7_KjU$annotations", "k", "getSelectedLeadingIconColor-0d7_KjU", "getSelectedLeadingIconColor-0d7_KjU$annotations", "l", "getSelectedTrailingIconColor-0d7_KjU", "getSelectedTrailingIconColor-0d7_KjU$annotations", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long selectedContainerColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long selectedTextColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long selectedLeadingIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long selectedTrailingIconColor;

    public /* synthetic */ ae(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36);
    }

    public static /* synthetic */ long b(ae aeVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z16 = false;
        }
        return aeVar.a(z15, z16);
    }

    public static /* synthetic */ long d(ae aeVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z16 = false;
        }
        return aeVar.c(z15, z16);
    }

    public static /* synthetic */ long f(ae aeVar, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z16 = false;
        }
        return aeVar.e(z15, z16);
    }

    public final long a(boolean enabled, boolean selected) {
        if (enabled) {
            return selected ? this.selectedLeadingIconColor : this.leadingIconColor;
        }
        return this.disabledLeadingIconColor;
    }

    public final long c(boolean enabled, boolean selected) {
        if (enabled) {
            return selected ? this.selectedTextColor : this.textColor;
        }
        return this.disabledTextColor;
    }

    public final long e(boolean enabled, boolean selected) {
        if (enabled) {
            return selected ? this.selectedTrailingIconColor : this.trailingIconColor;
        }
        return this.disabledTrailingIconColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) other;
        return Color.m11equalsimpl0(this.textColor, aeVar.textColor) && Color.m11equalsimpl0(this.containerColor, aeVar.containerColor) && Color.m11equalsimpl0(this.leadingIconColor, aeVar.leadingIconColor) && Color.m11equalsimpl0(this.trailingIconColor, aeVar.trailingIconColor) && Color.m11equalsimpl0(this.disabledTextColor, aeVar.disabledTextColor) && Color.m11equalsimpl0(this.disabledLeadingIconColor, aeVar.disabledLeadingIconColor) && Color.m11equalsimpl0(this.disabledTrailingIconColor, aeVar.disabledTrailingIconColor) && Color.m11equalsimpl0(this.disabledContainerColor, aeVar.disabledContainerColor) && Color.m11equalsimpl0(this.selectedContainerColor, aeVar.selectedContainerColor) && Color.m11equalsimpl0(this.selectedTextColor, aeVar.selectedTextColor) && Color.m11equalsimpl0(this.selectedLeadingIconColor, aeVar.selectedLeadingIconColor) && Color.m11equalsimpl0(this.selectedTrailingIconColor, aeVar.selectedTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m17hashCodeimpl(this.textColor) * 31) + Color.m17hashCodeimpl(this.containerColor)) * 31) + Color.m17hashCodeimpl(this.leadingIconColor)) * 31) + Color.m17hashCodeimpl(this.trailingIconColor)) * 31) + Color.m17hashCodeimpl(this.disabledTextColor)) * 31) + Color.m17hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m17hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m17hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m17hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m17hashCodeimpl(this.selectedTextColor)) * 31) + Color.m17hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m17hashCodeimpl(this.selectedTrailingIconColor);
    }

    public /* synthetic */ ae(long j15, long j16, long j17, long j18, long j19, long j25, k kVar) {
        this(j15, j16, j17, j18, j19, j25);
    }

    private ae(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36) {
        this.textColor = j15;
        this.leadingIconColor = j16;
        this.trailingIconColor = j17;
        this.disabledTextColor = j18;
        this.disabledLeadingIconColor = j19;
        this.disabledTrailingIconColor = j25;
        this.containerColor = j26;
        this.disabledContainerColor = j27;
        this.selectedContainerColor = j36;
        this.selectedTextColor = j28;
        this.selectedLeadingIconColor = j29;
        this.selectedTrailingIconColor = j35;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ae(long j15, long j16, long j17, long j18, long j19, long j25) {
        Color.Companion companion = Color.INSTANCE;
        this(j15, j16, j17, j18, j19, j25, companion.h(), companion.h(), companion.h(), companion.h(), companion.h(), companion.h(), null);
    }
}
