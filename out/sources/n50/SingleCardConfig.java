package n50;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: n50.j, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ln50/j;", "", "Lf3/m;", "modifier", "", "isOuterFocusEnabled", "<init>", "(Lf3/m;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lf3/m;", "()Lf3/m;", "b", "Z", "()Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SingleCardConfig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132071c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f3.m modifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOuterFocusEnabled;

    public SingleCardConfig(f3.m mVar, boolean z15) {
        this.modifier = mVar;
        this.isOuterFocusEnabled = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f3.m getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsOuterFocusEnabled() {
        return this.isOuterFocusEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCardConfig)) {
            return false;
        }
        SingleCardConfig singleCardConfig = (SingleCardConfig) other;
        return fr.t.c(this.modifier, singleCardConfig.modifier) && this.isOuterFocusEnabled == singleCardConfig.isOuterFocusEnabled;
    }

    public int hashCode() {
        return (this.modifier.hashCode() * 31) + Boolean.hashCode(this.isOuterFocusEnabled);
    }

    public String toString() {
        return "SingleCardConfig(modifier=" + this.modifier + ", isOuterFocusEnabled=" + this.isOuterFocusEnabled + ')';
    }

    public /* synthetic */ SingleCardConfig(f3.m mVar, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? f3.m.INSTANCE : mVar, (i15 & 2) != 0 ? true : z15);
    }
}
