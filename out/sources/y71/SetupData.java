package y71;

import fr.t;
import i61.DataSplit;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y71.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly71/b;", "", "La81/a;", "contract", "Ld81/b;", "splitType", "Li61/j;", "dataSplit", "<init>", "(La81/a;Ld81/b;Li61/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La81/a;", "()La81/a;", "b", "Ld81/b;", "c", "()Ld81/b;", "Li61/j;", "()Li61/j;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f225212d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a81.a contract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d81.b splitType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataSplit dataSplit;

    public SetupData(a81.a aVar, d81.b bVar, DataSplit dataSplit) {
        this.contract = aVar;
        this.splitType = bVar;
        this.dataSplit = dataSplit;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a81.a getContract() {
        return this.contract;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DataSplit getDataSplit() {
        return this.dataSplit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d81.b getSplitType() {
        return this.splitType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return t.c(this.contract, setupData.contract) && this.splitType == setupData.splitType && t.c(this.dataSplit, setupData.dataSplit);
    }

    public int hashCode() {
        return (((this.contract.hashCode() * 31) + this.splitType.hashCode()) * 31) + this.dataSplit.hashCode();
    }

    public String toString() {
        return "SetupData(contract=" + this.contract + ", splitType=" + this.splitType + ", dataSplit=" + this.dataSplit + ')';
    }
}
