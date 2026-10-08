package xn1;

import al0.ParentOrGuardData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xn1.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxn1/h;", "", "Lxn1/d$d;", "Lmm1/a;", "type", "Lal0/j0;", "parentOrGuardData", "<init>", "(Lmm1/a;Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmm1/a;", "getType", "()Lmm1/a;", "b", "Lal0/j0;", "f", "()Lal0/j0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Loading implements d.InterfaceC5873d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mm1.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentOrGuardData parentOrGuardData;

    public Loading(mm1.a aVar, ParentOrGuardData parentOrGuardData) {
        this.type = aVar;
        this.parentOrGuardData = parentOrGuardData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Loading)) {
            return false;
        }
        Loading loading = (Loading) other;
        return this.type == loading.type && fr.t.c(this.parentOrGuardData, loading.parentOrGuardData);
    }

    @Override // xn1.d.InterfaceC5873d
    /* JADX INFO: renamed from: f, reason: from getter */
    public ParentOrGuardData getParentOrGuardData() {
        return this.parentOrGuardData;
    }

    @Override // xn1.d
    public mm1.a getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.parentOrGuardData.hashCode();
    }

    public String toString() {
        return "Loading(type=" + this.type + ", parentOrGuardData=" + this.parentOrGuardData + ')';
    }
}
