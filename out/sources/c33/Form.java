package c33;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: c33.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lc33/b;", "", "Lst3/g;", "addressFormVMS", "Lk23/m;", "reportLocationType", "<init>", "(Lst3/g;Lk23/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/g;", "()Lst3/g;", "b", "Lk23/m;", "()Lk23/m;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Form {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final st3.g addressFormVMS;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final k23.m reportLocationType;

    public Form(st3.g gVar, k23.m mVar) {
        this.addressFormVMS = gVar;
        this.reportLocationType = mVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final st3.g getAddressFormVMS() {
        return this.addressFormVMS;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k23.m getReportLocationType() {
        return this.reportLocationType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Form)) {
            return false;
        }
        Form form = (Form) other;
        return fr.t.c(this.addressFormVMS, form.addressFormVMS) && this.reportLocationType == form.reportLocationType;
    }

    public int hashCode() {
        return (this.addressFormVMS.hashCode() * 31) + this.reportLocationType.hashCode();
    }

    public String toString() {
        return "Form(addressFormVMS=" + this.addressFormVMS + ", reportLocationType=" + this.reportLocationType + ')';
    }
}
