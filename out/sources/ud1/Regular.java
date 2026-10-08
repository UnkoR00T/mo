package ud1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ud1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lud1/d;", "", "Lhz/b;", "validationState", "", "value", "<init>", "(Lhz/b;Ljava/lang/String;)V", "a", "(Lhz/b;Ljava/lang/String;)Lud1/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/String;", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Regular {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f197632c = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    public Regular(hz.b bVar, String str) {
        this.validationState = bVar;
        this.value = str;
    }

    public static /* synthetic */ Regular b(Regular regular, hz.b bVar, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = regular.validationState;
        }
        if ((i15 & 2) != 0) {
            str = regular.value;
        }
        return regular.a(bVar, str);
    }

    public final Regular a(hz.b validationState, String value) {
        return new Regular(validationState, value);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public hz.b getValidationState() {
        return this.validationState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Regular)) {
            return false;
        }
        Regular regular = (Regular) other;
        return fr.t.c(this.validationState, regular.validationState) && fr.t.c(this.value, regular.value);
    }

    public int hashCode() {
        return (this.validationState.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Regular(validationState=" + this.validationState + ", value=" + this.value + ')';
    }

    public /* synthetic */ Regular(hz.b bVar, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? hz.b.d.f86848c : bVar, (i15 & 2) != 0 ? "" : str);
    }
}
