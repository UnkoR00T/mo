package b54;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: b54.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb54/a;", "", "", "test", "prod", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureFlagDefaultValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean test;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean prod;

    public FeatureFlagDefaultValue(boolean z15, boolean z16) {
        this.test = z15;
        this.prod = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getProd() {
        return this.prod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getTest() {
        return this.test;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlagDefaultValue)) {
            return false;
        }
        FeatureFlagDefaultValue featureFlagDefaultValue = (FeatureFlagDefaultValue) other;
        return this.test == featureFlagDefaultValue.test && this.prod == featureFlagDefaultValue.prod;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.test) * 31) + Boolean.hashCode(this.prod);
    }

    public String toString() {
        return "FeatureFlagDefaultValue(test=" + this.test + ", prod=" + this.prod + ")";
    }
}
