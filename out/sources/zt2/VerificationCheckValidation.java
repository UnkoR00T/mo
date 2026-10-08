package zt2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: zt2.u, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lzt2/u;", "", "Lhz/g;", "peselNumberValidation", "idNumberValidation", "reasonValidation", "<init>", "(Lhz/g;Lhz/g;Lhz/g;)V", "", "d", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhz/g;", "b", "()Lhz/g;", "c", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationCheckValidation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f237394d = hz.g.f86851a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g peselNumberValidation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g idNumberValidation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g reasonValidation;

    public VerificationCheckValidation(hz.g gVar, hz.g gVar2, hz.g gVar3) {
        this.peselNumberValidation = gVar;
        this.idNumberValidation = gVar2;
        this.reasonValidation = gVar3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final hz.g getIdNumberValidation() {
        return this.idNumberValidation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hz.g getPeselNumberValidation() {
        return this.peselNumberValidation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hz.g getReasonValidation() {
        return this.reasonValidation;
    }

    public final boolean d() {
        List listQ = v.q(this.peselNumberValidation, this.idNumberValidation, this.reasonValidation);
        if ((listQ instanceof Collection) && listQ.isEmpty()) {
            return true;
        }
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            if (((hz.g) it.next()) instanceof hz.g.Invalid) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationCheckValidation)) {
            return false;
        }
        VerificationCheckValidation verificationCheckValidation = (VerificationCheckValidation) other;
        return fr.t.c(this.peselNumberValidation, verificationCheckValidation.peselNumberValidation) && fr.t.c(this.idNumberValidation, verificationCheckValidation.idNumberValidation) && fr.t.c(this.reasonValidation, verificationCheckValidation.reasonValidation);
    }

    public int hashCode() {
        return (((this.peselNumberValidation.hashCode() * 31) + this.idNumberValidation.hashCode()) * 31) + this.reasonValidation.hashCode();
    }

    public String toString() {
        return "VerificationCheckValidation(peselNumberValidation=" + this.peselNumberValidation + ", idNumberValidation=" + this.idNumberValidation + ", reasonValidation=" + this.reasonValidation + ')';
    }
}
