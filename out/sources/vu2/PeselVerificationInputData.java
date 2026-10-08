package vu2;

import fr.k;
import fr.t;
import hz.b;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vu2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lvu2/a;", "", "Lmx/a;", "content", "Lhz/b;", "validationState", "<init>", "(Lmx/a;Lhz/b;)V", "a", "(Lmx/a;Lhz/b;)Lvu2/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "c", "()Lmx/a;", "b", "Lhz/b;", "d", "()Lhz/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeselVerificationInputData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b validationState;

    public PeselVerificationInputData(Label label, b bVar) {
        this.content = label;
        this.validationState = bVar;
    }

    public static /* synthetic */ PeselVerificationInputData b(PeselVerificationInputData peselVerificationInputData, Label label, b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = peselVerificationInputData.content;
        }
        if ((i15 & 2) != 0) {
            bVar = peselVerificationInputData.validationState;
        }
        return peselVerificationInputData.a(label, bVar);
    }

    public final PeselVerificationInputData a(Label content, b validationState) {
        return new PeselVerificationInputData(content, validationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getValidationState() {
        return this.validationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeselVerificationInputData)) {
            return false;
        }
        PeselVerificationInputData peselVerificationInputData = (PeselVerificationInputData) other;
        return t.c(this.content, peselVerificationInputData.content) && t.c(this.validationState, peselVerificationInputData.validationState);
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "PeselVerificationInputData(content=" + this.content + ", validationState=" + this.validationState + ')';
    }

    public /* synthetic */ PeselVerificationInputData(Label label, b bVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? Label.INSTANCE.c() : label, (i15 & 2) != 0 ? b.C2039b.f86846c : bVar);
    }
}
