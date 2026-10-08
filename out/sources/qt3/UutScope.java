package qt3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: qt3.q0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqt3/q0;", "", "Lqt3/f0;", "dh", "Lqt3/p0;", "dc", "<init>", "(Lqt3/f0;Lqt3/p0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqt3/f0;", "b", "()Lqt3/f0;", "Lqt3/p0;", "()Lqt3/p0;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UutScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dh")
    private final MnemonicHeaderContainer dh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dc")
    private final UutDataContainer dc;

    /* JADX WARN: Multi-variable type inference failed */
    public UutScope() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UutDataContainer getDc() {
        return this.dc;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MnemonicHeaderContainer getDh() {
        return this.dh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UutScope)) {
            return false;
        }
        UutScope uutScope = (UutScope) other;
        return fr.t.c(this.dh, uutScope.dh) && fr.t.c(this.dc, uutScope.dc);
    }

    public int hashCode() {
        MnemonicHeaderContainer mnemonicHeaderContainer = this.dh;
        int iHashCode = (mnemonicHeaderContainer == null ? 0 : mnemonicHeaderContainer.hashCode()) * 31;
        UutDataContainer uutDataContainer = this.dc;
        return iHashCode + (uutDataContainer != null ? uutDataContainer.hashCode() : 0);
    }

    public String toString() {
        return "UutScope(dh=" + this.dh + ", dc=" + this.dc + ')';
    }

    public UutScope(MnemonicHeaderContainer mnemonicHeaderContainer, UutDataContainer uutDataContainer) {
        this.dh = mnemonicHeaderContainer;
        this.dc = uutDataContainer;
    }

    public /* synthetic */ UutScope(MnemonicHeaderContainer mnemonicHeaderContainer, UutDataContainer uutDataContainer, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : mnemonicHeaderContainer, (i15 & 2) != 0 ? null : uutDataContainer);
    }
}
