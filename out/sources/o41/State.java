package o41;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: o41.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lo41/b;", "", "Lbl0/d;", "maritalStatusType", "Lxw/e;", "parentGender", "", "areMultipleChildren", "<init>", "(Lbl0/d;Lxw/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbl0/d;", "b", "()Lbl0/d;", "Lxw/e;", "c", "()Lxw/e;", "Z", "()Z", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final bl0.d maritalStatusType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final xw.e parentGender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean areMultipleChildren;

    public State(bl0.d dVar, xw.e eVar, boolean z15) {
        this.maritalStatusType = dVar;
        this.parentGender = eVar;
        this.areMultipleChildren = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAreMultipleChildren() {
        return this.areMultipleChildren;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final bl0.d getMaritalStatusType() {
        return this.maritalStatusType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final xw.e getParentGender() {
        return this.parentGender;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.maritalStatusType == state.maritalStatusType && this.parentGender == state.parentGender && this.areMultipleChildren == state.areMultipleChildren;
    }

    public int hashCode() {
        return (((this.maritalStatusType.hashCode() * 31) + this.parentGender.hashCode()) * 31) + Boolean.hashCode(this.areMultipleChildren);
    }

    public String toString() {
        return "State(maritalStatusType=" + this.maritalStatusType + ", parentGender=" + this.parentGender + ", areMultipleChildren=" + this.areMultipleChildren + ')';
    }
}
