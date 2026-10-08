package v91;

import fr.k;
import fr.t;
import hz.b;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: v91.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lv91/a;", "", "", "initialPick", "Lhz/b;", "validationState", "<init>", "(Ljava/lang/Integer;Lhz/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Lhz/b;", "()Lhz/b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropDownState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f205479c = b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer initialPick;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b validationState;

    public DropDownState(Integer num, b bVar) {
        this.initialPick = num;
        this.validationState = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getInitialPick() {
        return this.initialPick;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getValidationState() {
        return this.validationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropDownState)) {
            return false;
        }
        DropDownState dropDownState = (DropDownState) other;
        return t.c(this.initialPick, dropDownState.initialPick) && t.c(this.validationState, dropDownState.validationState);
    }

    public int hashCode() {
        Integer num = this.initialPick;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "DropDownState(initialPick=" + this.initialPick + ", validationState=" + this.validationState + ')';
    }

    public /* synthetic */ DropDownState(Integer num, b bVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? b.C2039b.f86846c : bVar);
    }
}
