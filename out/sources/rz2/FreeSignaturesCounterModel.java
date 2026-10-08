package rz2;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rz2.g, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lrz2/g;", "", "Lmx/a;", "availableSignatures", "message", "contentDescription", "<init>", "(Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "c", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreeSignaturesCounterModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label availableSignatures;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    public FreeSignaturesCounterModel(Label label, Label label2, Label label3) {
        this.availableSignatures = label;
        this.message = label2;
        this.contentDescription = label3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getAvailableSignatures() {
        return this.availableSignatures;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreeSignaturesCounterModel)) {
            return false;
        }
        FreeSignaturesCounterModel freeSignaturesCounterModel = (FreeSignaturesCounterModel) other;
        return t.c(this.availableSignatures, freeSignaturesCounterModel.availableSignatures) && t.c(this.message, freeSignaturesCounterModel.message) && t.c(this.contentDescription, freeSignaturesCounterModel.contentDescription);
    }

    public int hashCode() {
        int iHashCode = ((this.availableSignatures.hashCode() * 31) + this.message.hashCode()) * 31;
        Label label = this.contentDescription;
        return iHashCode + (label == null ? 0 : label.hashCode());
    }

    public String toString() {
        return "FreeSignaturesCounterModel(availableSignatures=" + this.availableSignatures + ", message=" + this.message + ", contentDescription=" + this.contentDescription + ')';
    }
}
