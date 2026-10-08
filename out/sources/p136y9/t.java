package p136y9;

import android.os.Bundle;
import fr.q0;
import p071kotlin.Metadata;
import ua.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001a\u0010!\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010%\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ly9/t;", "", "", "name", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "Loq/i0;", "e", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "f", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ly9/l1;", "a", "Ly9/l1;", "()Ly9/l1;", "type", "b", "Z", "d", "()Z", "isNullable", "c", "isDefaultValuePresent", "isDefaultValueUnknown", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l1<Object> type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValuePresent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValueUnknown;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object defaultValue;

    public final l1<Object> a() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsDefaultValueUnknown() {
        return this.isDefaultValueUnknown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final void e(String name, Bundle bundle) {
        Object obj;
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.g(bundle, name, obj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && t.class == other.getClass()) {
            t tVar = (t) other;
            if (this.isNullable != tVar.isNullable || this.isDefaultValuePresent != tVar.isDefaultValuePresent || !fr.t.c(this.type, tVar.type)) {
                return false;
            }
            Object obj = this.defaultValue;
            if (obj != null) {
                return fr.t.c(obj, tVar.defaultValue);
            }
            if (tVar.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String name, Bundle bundle) {
        if (!this.isNullable) {
            Bundle bundleA = c.a(bundle);
            if (c.b(bundleA, name) && c.w(bundleA, name)) {
                return false;
            }
        }
        try {
            this.type.a(bundle, name);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(q0.c(t.class).D());
        sb5.append(" Type: " + this.type);
        sb5.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb5.append(" DefaultValue: " + this.defaultValue);
        }
        return sb5.toString();
    }
}
