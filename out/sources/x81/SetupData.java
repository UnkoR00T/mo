package x81;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: x81.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lx81/b;", "", "Lz81/a;", "introType", "Li61/h;", "reason", "<init>", "(Lz81/a;Li61/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz81/a;", "()Lz81/a;", "b", "Li61/h;", "()Li61/h;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final z81.a introType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i61.h reason;

    public SetupData(z81.a aVar, i61.h hVar) {
        this.introType = aVar;
        this.reason = hVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z81.a getIntroType() {
        return this.introType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i61.h getReason() {
        return this.reason;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.introType == setupData.introType && this.reason == setupData.reason;
    }

    public int hashCode() {
        int iHashCode = this.introType.hashCode() * 31;
        i61.h hVar = this.reason;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "SetupData(introType=" + this.introType + ", reason=" + this.reason + ')';
    }
}
