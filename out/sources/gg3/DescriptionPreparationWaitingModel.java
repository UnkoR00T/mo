package gg3;

import fr.t;
import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.o;

/* JADX INFO: renamed from: gg3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgg3/a;", "", "Lsv0/y;", "processId", "Lsv0/o;", "author", "", "rejection", "<init>", "(Lsv0/y;Lsv0/o;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "b", "()Lsv0/y;", "Lsv0/o;", "()Lsv0/o;", "c", "Z", "()Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DescriptionPreparationWaitingModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProcessId processId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o author;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rejection;

    public DescriptionPreparationWaitingModel(ProcessId processId, o oVar, boolean z15) {
        this.processId = processId;
        this.author = oVar;
        this.rejection = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ProcessId getProcessId() {
        return this.processId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRejection() {
        return this.rejection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DescriptionPreparationWaitingModel)) {
            return false;
        }
        DescriptionPreparationWaitingModel descriptionPreparationWaitingModel = (DescriptionPreparationWaitingModel) other;
        return t.c(this.processId, descriptionPreparationWaitingModel.processId) && this.author == descriptionPreparationWaitingModel.author && this.rejection == descriptionPreparationWaitingModel.rejection;
    }

    public int hashCode() {
        return (((this.processId.hashCode() * 31) + this.author.hashCode()) * 31) + Boolean.hashCode(this.rejection);
    }

    public String toString() {
        return "DescriptionPreparationWaitingModel(processId=" + this.processId + ", author=" + this.author + ", rejection=" + this.rejection + ')';
    }
}
