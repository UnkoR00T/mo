package lk2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lk2.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Llk2/d;", "", "Llk2/f;", "dataHeader", "Llk2/e;", "data", "<init>", "(Llk2/f;Llk2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llk2/f;", "b", "()Llk2/f;", "Llk2/e;", "()Llk2/e;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MIdCardScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MnemonicHeader dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MidCardScopeDataContainer data;

    public MIdCardScope(MnemonicHeader fVar, MidCardScopeDataContainer eVar) {
        this.dataHeader = fVar;
        this.data = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MidCardScopeDataContainer getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MnemonicHeader getDataHeader() {
        return this.dataHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MIdCardScope)) {
            return false;
        }
        MIdCardScope mIdCardScope = (MIdCardScope) other;
        return t.c(this.dataHeader, mIdCardScope.dataHeader) && t.c(this.data, mIdCardScope.data);
    }

    public int hashCode() {
        return (this.dataHeader.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "MIdCardScope(dataHeader=" + this.dataHeader + ", data=" + this.data + ')';
    }
}
