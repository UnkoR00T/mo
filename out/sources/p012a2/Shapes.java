package p012a2;

import fr.k;
import fr.t;
import l1.a;
import l1.h;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a2.s3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0018"}, d2 = {"La2/s3;", "", "Ll1/a;", "small", "medium", "large", "<init>", "(Ll1/a;Ll1/a;Ll1/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ll1/a;", "b", "()Ll1/a;", "getMedium", "c", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Shapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a small;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a medium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a large;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getLarge() {
        return this.large;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getSmall() {
        return this.small;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) other;
        return t.c(this.small, shapes.small) && t.c(this.medium, shapes.medium) && t.c(this.large, shapes.large);
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }

    public Shapes(a aVar, a aVar2, a aVar3) {
        this.small = aVar;
        this.medium = aVar2;
        this.large = aVar3;
    }

    public /* synthetic */ Shapes(a aVar, a aVar2, a aVar3, int i15, k kVar) {
        this((i15 & 1) != 0 ? h.f(c5.h.n(4)) : aVar, (i15 & 2) != 0 ? h.f(c5.h.n(4)) : aVar2, (i15 & 4) != 0 ? h.f(c5.h.n(0)) : aVar3);
    }
}
