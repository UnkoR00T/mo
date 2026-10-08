package js;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rs.m f104770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection<c> f104771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f104772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f104773d;

    /* JADX WARN: Multi-variable type inference failed */
    public w(rs.m mVar, Collection<? extends c> collection, boolean z15, boolean z16) {
        this.f104770a = mVar;
        this.f104771b = collection;
        this.f104772c = z15;
        this.f104773d = z16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w b(w wVar, rs.m mVar, Collection collection, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            mVar = wVar.f104770a;
        }
        if ((i15 & 2) != 0) {
            collection = wVar.f104771b;
        }
        if ((i15 & 4) != 0) {
            z15 = wVar.f104772c;
        }
        if ((i15 & 8) != 0) {
            z16 = wVar.f104773d;
        }
        return wVar.a(mVar, collection, z15, z16);
    }

    public final w a(rs.m mVar, Collection<? extends c> collection, boolean z15, boolean z16) {
        return new w(mVar, collection, z15, z16);
    }

    public final boolean c() {
        return this.f104772c;
    }

    public final rs.m d() {
        return this.f104770a;
    }

    public final Collection<c> e() {
        return this.f104771b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return fr.t.c(this.f104770a, wVar.f104770a) && fr.t.c(this.f104771b, wVar.f104771b) && this.f104772c == wVar.f104772c && this.f104773d == wVar.f104773d;
    }

    public int hashCode() {
        return (((((this.f104770a.hashCode() * 31) + this.f104771b.hashCode()) * 31) + Boolean.hashCode(this.f104772c)) * 31) + Boolean.hashCode(this.f104773d);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f104770a + ", qualifierApplicabilityTypes=" + this.f104771b + ", definitelyNotNull=" + this.f104772c + ", preferQualifierOverBound=" + this.f104773d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w(rs.m mVar, Collection collection, boolean z15, boolean z16, int i15, fr.k kVar) {
        if ((i15 & 4) != 0) {
            z15 = mVar.c() == rs.l.NOT_NULL;
        }
        this(mVar, collection, z15, (i15 & 8) != 0 ? false : z16);
    }
}
