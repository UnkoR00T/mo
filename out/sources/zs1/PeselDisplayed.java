package zs1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zs1.q0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzs1/q0;", "", "Liy/b0;", "pesel", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeselDisplayed implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f236836b = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 pesel;

    public PeselDisplayed(iy.b0 b0Var) {
        this.pesel = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getPesel() {
        return this.pesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PeselDisplayed) && fr.t.c(this.pesel, ((PeselDisplayed) other).pesel);
    }

    public int hashCode() {
        iy.b0 b0Var = this.pesel;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.hashCode();
    }

    public String toString() {
        return "PeselDisplayed(pesel=" + this.pesel + ')';
    }
}
