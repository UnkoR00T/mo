package ez2;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ez2.g, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lez2/g;", "", "Liy/b0;", "can", "<init>", "(Liy/b0;)V", "a", "(Liy/b0;)Lez2/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "b", "()Liy/b0;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CanSharedData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f54388b = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 can;

    public CanSharedData(b0 b0Var) {
        this.can = b0Var;
    }

    public final CanSharedData a(b0 can) {
        return new CanSharedData(can);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getCan() {
        return this.can;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CanSharedData) && t.c(this.can, ((CanSharedData) other).can);
    }

    public int hashCode() {
        return this.can.hashCode();
    }

    public String toString() {
        return "CanSharedData(can=" + this.can + ')';
    }

    public /* synthetic */ CanSharedData(b0 b0Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var);
    }
}
