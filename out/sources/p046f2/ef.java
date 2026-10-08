package p046f2;

import androidx.compose.ui.window.v;
import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, d2 = {"Lf2/ef;", "", "", "shouldDismissOnBackPress", "shouldDismissOnClickOutside", "<init>", "(ZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/window/v;", "a", "Landroidx/compose/ui/window/v;", "()Landroidx/compose/ui/window/v;", "securePolicy", "b", "Z", "()Z", "c", "e", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAppearanceLightStatusBars", "isAppearanceLightNavigationBars", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v securePolicy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldDismissOnBackPress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldDismissOnClickOutside;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Boolean isAppearanceLightStatusBars;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Boolean isAppearanceLightNavigationBars;

    public ef(boolean z15, boolean z16) {
        this.securePolicy = v.Inherit;
        this.shouldDismissOnBackPress = z15;
        this.shouldDismissOnClickOutside = z16;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getSecurePolicy() {
        return this.securePolicy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getIsAppearanceLightNavigationBars() {
        return this.isAppearanceLightNavigationBars;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsAppearanceLightStatusBars() {
        return this.isAppearanceLightStatusBars;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldDismissOnClickOutside() {
        return this.shouldDismissOnClickOutside;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ef)) {
            return false;
        }
        ef efVar = (ef) other;
        return this.securePolicy == efVar.securePolicy && t.c(this.isAppearanceLightStatusBars, efVar.isAppearanceLightStatusBars) && t.c(this.isAppearanceLightNavigationBars, efVar.isAppearanceLightNavigationBars) && this.shouldDismissOnClickOutside == efVar.shouldDismissOnClickOutside && this.shouldDismissOnBackPress == efVar.shouldDismissOnBackPress;
    }

    public int hashCode() {
        int iHashCode = ((this.securePolicy.hashCode() * 31) + Boolean.hashCode(this.shouldDismissOnBackPress)) * 31;
        Boolean bool = this.isAppearanceLightStatusBars;
        int iHashCode2 = (iHashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 31;
        Boolean bool2 = this.isAppearanceLightNavigationBars;
        return ((iHashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 31) + Boolean.hashCode(this.shouldDismissOnClickOutside);
    }

    public /* synthetic */ ef(boolean z15, boolean z16, int i15, k kVar) {
        this((i15 & 1) != 0 ? true : z15, (i15 & 2) != 0 ? true : z16);
    }
}
