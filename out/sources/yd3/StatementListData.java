package yd3;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yd3.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lyd3/g;", "", "", "canCreateNewCollision", "", "workingCopyValidityDays", "Lfy/c;", "Lyd3/c;", "page", "<init>", "(ZILfy/c;)V", "a", "(ZILfy/c;)Lyd3/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "I", "e", "Lfy/c;", "d", "()Lfy/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementListData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canCreateNewCollision;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int workingCopyValidityDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fy.c<c> page;

    public StatementListData(boolean z15, int i15, fy.c<c> cVar) {
        this.canCreateNewCollision = z15;
        this.workingCopyValidityDays = i15;
        this.page = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatementListData b(StatementListData statementListData, boolean z15, int i15, fy.c cVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            z15 = statementListData.canCreateNewCollision;
        }
        if ((i16 & 2) != 0) {
            i15 = statementListData.workingCopyValidityDays;
        }
        if ((i16 & 4) != 0) {
            cVar = statementListData.page;
        }
        return statementListData.a(z15, i15, cVar);
    }

    public final StatementListData a(boolean canCreateNewCollision, int workingCopyValidityDays, fy.c<c> page) {
        return new StatementListData(canCreateNewCollision, workingCopyValidityDays, page);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanCreateNewCollision() {
        return this.canCreateNewCollision;
    }

    public final fy.c<c> d() {
        return this.page;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getWorkingCopyValidityDays() {
        return this.workingCopyValidityDays;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementListData)) {
            return false;
        }
        StatementListData statementListData = (StatementListData) other;
        return this.canCreateNewCollision == statementListData.canCreateNewCollision && this.workingCopyValidityDays == statementListData.workingCopyValidityDays && t.c(this.page, statementListData.page);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.canCreateNewCollision) * 31) + Integer.hashCode(this.workingCopyValidityDays)) * 31) + this.page.hashCode();
    }

    public String toString() {
        return "StatementListData(canCreateNewCollision=" + this.canCreateNewCollision + ", workingCopyValidityDays=" + this.workingCopyValidityDays + ", page=" + this.page + ')';
    }

    public /* synthetic */ StatementListData(boolean z15, int i15, fy.c cVar, int i16, k kVar) {
        this(z15, i15, (i16 & 4) != 0 ? new fy.c.Initial(null, 1, null) : cVar);
    }
}
