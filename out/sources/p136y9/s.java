package p136y9;

import android.os.Bundle;
import fr.t;
import p071kotlin.Metadata;
import ua.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001d\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ly9/s;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "destinationId", "Ly9/i1;", "Ly9/i1;", "c", "()Ly9/i1;", "setNavOptions", "(Ly9/i1;)V", "navOptions", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "defaultArguments", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private i1 navOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArguments;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i1 getNavOptions() {
        return this.navOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        if (this.destinationId != sVar.destinationId || !t.c(this.navOptions, sVar.navOptions)) {
            return false;
        }
        Bundle bundle = this.defaultArguments;
        Bundle bundle2 = sVar.defaultArguments;
        if (t.c(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !c.c(c.a(bundle), bundle2)) ? false : true;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.destinationId) * 31;
        i1 i1Var = this.navOptions;
        int iHashCode2 = iHashCode + (i1Var != null ? i1Var.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        return bundle != null ? (iHashCode2 * 31) + c.d(c.a(bundle)) : iHashCode2;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(s.class.getSimpleName());
        sb5.append("(0x");
        sb5.append(Integer.toHexString(this.destinationId));
        sb5.append(")");
        if (this.navOptions != null) {
            sb5.append(" navOptions=");
            sb5.append(this.navOptions);
        }
        return sb5.toString();
    }
}
