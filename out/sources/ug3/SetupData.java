package ug3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ug3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lug3/b;", "", "Lyd3/a;", "confirmationModel", "Lvg3/a;", "contract", "<init>", "(Lyd3/a;Lvg3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyd3/a;", "()Lyd3/a;", "b", "Lvg3/a;", "()Lvg3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final yd3.a confirmationModel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final vg3.a contract;

    public SetupData(yd3.a aVar, vg3.a aVar2) {
        this.confirmationModel = aVar;
        this.contract = aVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final yd3.a getConfirmationModel() {
        return this.confirmationModel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vg3.a getContract() {
        return this.contract;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return t.c(this.confirmationModel, setupData.confirmationModel) && t.c(this.contract, setupData.contract);
    }

    public int hashCode() {
        return (this.confirmationModel.hashCode() * 31) + this.contract.hashCode();
    }

    public String toString() {
        return "SetupData(confirmationModel=" + this.confirmationModel + ", contract=" + this.contract + ')';
    }
}
