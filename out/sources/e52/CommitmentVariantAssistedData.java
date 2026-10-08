package e52;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e52.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Le52/a;", "", "Lw52/b;", "commitmentVariantContract", "Le52/b;", "commitmentVariantEntryData", "<init>", "(Lw52/b;Le52/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw52/b;", "()Lw52/b;", "b", "Le52/b;", "()Le52/b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommitmentVariantAssistedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final w52.b commitmentVariantContract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CommitmentVariantEntryData commitmentVariantEntryData;

    public CommitmentVariantAssistedData(w52.b bVar, CommitmentVariantEntryData commitmentVariantEntryData) {
        this.commitmentVariantContract = bVar;
        this.commitmentVariantEntryData = commitmentVariantEntryData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w52.b getCommitmentVariantContract() {
        return this.commitmentVariantContract;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CommitmentVariantEntryData getCommitmentVariantEntryData() {
        return this.commitmentVariantEntryData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitmentVariantAssistedData)) {
            return false;
        }
        CommitmentVariantAssistedData commitmentVariantAssistedData = (CommitmentVariantAssistedData) other;
        return t.c(this.commitmentVariantContract, commitmentVariantAssistedData.commitmentVariantContract) && t.c(this.commitmentVariantEntryData, commitmentVariantAssistedData.commitmentVariantEntryData);
    }

    public int hashCode() {
        return (this.commitmentVariantContract.hashCode() * 31) + this.commitmentVariantEntryData.hashCode();
    }

    public String toString() {
        return "CommitmentVariantAssistedData(commitmentVariantContract=" + this.commitmentVariantContract + ", commitmentVariantEntryData=" + this.commitmentVariantEntryData + ')';
    }
}
