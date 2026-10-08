package b40;

import er.l;
import fr.k;
import fr.t;
import n4.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b40.i, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lb40/i;", "", "", "mergeDescendants", "", "semanticsContentDescription", "Lkotlin/Function1;", "Ln4/i0;", "Loq/i0;", "semanticsProperties", "<init>", "(ZLjava/lang/String;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/String;", "d", "Ler/l;", "e", "()Ler/l;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemanticsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mergeDescendants;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String semanticsContentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<i0, oq.i0> semanticsProperties;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsData(boolean z15, String str, l<? super i0, oq.i0> lVar) {
        this.mergeDescendants = z15;
        this.semanticsContentDescription = str;
        this.semanticsProperties = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b(i0 i0Var) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSemanticsContentDescription() {
        return this.semanticsContentDescription;
    }

    public final l<i0, oq.i0> e() {
        return this.semanticsProperties;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsData)) {
            return false;
        }
        SemanticsData semanticsData = (SemanticsData) other;
        return this.mergeDescendants == semanticsData.mergeDescendants && t.c(this.semanticsContentDescription, semanticsData.semanticsContentDescription) && t.c(this.semanticsProperties, semanticsData.semanticsProperties);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.mergeDescendants) * 31;
        String str = this.semanticsContentDescription;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.semanticsProperties.hashCode();
    }

    public String toString() {
        return "SemanticsData(mergeDescendants=" + this.mergeDescendants + ", semanticsContentDescription=" + this.semanticsContentDescription + ", semanticsProperties=" + this.semanticsProperties + ')';
    }

    public /* synthetic */ SemanticsData(boolean z15, String str, l lVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? new l() { // from class: b40.h
            @Override // er.l
            public final Object b(Object obj) {
                return SemanticsData.b((i0) obj);
            }
        } : lVar);
    }
}
