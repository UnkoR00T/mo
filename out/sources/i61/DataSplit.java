package i61;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i61.j, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Li61/j;", "", "Liy/b0;", "firstLine", "secondLine", "<init>", "(Liy/b0;Liy/b0;)V", "a", "(Liy/b0;Liy/b0;)Li61/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "b", "()Liy/b0;", "c", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DataSplit {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89759c = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 firstLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 secondLine;

    public DataSplit(b0 b0Var, b0 b0Var2) {
        this.firstLine = b0Var;
        this.secondLine = b0Var2;
    }

    public final DataSplit a(b0 firstLine, b0 secondLine) {
        return new DataSplit(firstLine, secondLine);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getFirstLine() {
        return this.firstLine;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getSecondLine() {
        return this.secondLine;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSplit)) {
            return false;
        }
        DataSplit dataSplit = (DataSplit) other;
        return fr.t.c(this.firstLine, dataSplit.firstLine) && fr.t.c(this.secondLine, dataSplit.secondLine);
    }

    public int hashCode() {
        return (this.firstLine.hashCode() * 31) + this.secondLine.hashCode();
    }

    public String toString() {
        return "DataSplit(firstLine=" + this.firstLine + ", secondLine=" + this.secondLine + ')';
    }
}
