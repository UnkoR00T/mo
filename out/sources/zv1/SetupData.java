package zv1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zv1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzv1/d;", "", "", "isDocumentValid", "Lgv1/t;", "scopeData", "<init>", "(ZLiy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Liy/b0;", "()Liy/b0;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f237911c = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDocumentValid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 scopeData;

    public /* synthetic */ SetupData(boolean z15, iy.b0 b0Var, fr.k kVar) {
        this(z15, b0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getScopeData() {
        return this.scopeData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsDocumentValid() {
        return this.isDocumentValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.isDocumentValid == setupData.isDocumentValid && gv1.t.b(this.scopeData, setupData.scopeData);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isDocumentValid) * 31) + gv1.t.c(this.scopeData);
    }

    public String toString() {
        return "SetupData(isDocumentValid=" + this.isDocumentValid + ", scopeData=" + ((Object) gv1.t.d(this.scopeData)) + ')';
    }

    private SetupData(boolean z15, iy.b0 b0Var) {
        this.isDocumentValid = z15;
        this.scopeData = b0Var;
    }
}
