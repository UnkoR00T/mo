package yy1;

import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: renamed from: yy1.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lyy1/e;", "", "Lzy1/b;", "electoralRegisterScreenData", "Li50/a;", "scaffoldData", "<init>", "(Lzy1/b;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzy1/b;", "()Lzy1/b;", "b", "Li50/a;", "()Li50/a;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NoDataAvailable implements c.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230736c = BaseScaffoldData.f89350g | IconPageData.f164667h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final zy1.NoDataAvailable electoralRegisterScreenData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    public NoDataAvailable(zy1.NoDataAvailable noDataAvailable, BaseScaffoldData baseScaffoldData) {
        this.electoralRegisterScreenData = noDataAvailable;
        this.scaffoldData = baseScaffoldData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final zy1.NoDataAvailable getElectoralRegisterScreenData() {
        return this.electoralRegisterScreenData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoDataAvailable)) {
            return false;
        }
        NoDataAvailable noDataAvailable = (NoDataAvailable) other;
        return fr.t.c(this.electoralRegisterScreenData, noDataAvailable.electoralRegisterScreenData) && fr.t.c(this.scaffoldData, noDataAvailable.scaffoldData);
    }

    public int hashCode() {
        return (this.electoralRegisterScreenData.hashCode() * 31) + this.scaffoldData.hashCode();
    }

    public String toString() {
        return "NoDataAvailable(electoralRegisterScreenData=" + this.electoralRegisterScreenData + ", scaffoldData=" + this.scaffoldData + ')';
    }
}
