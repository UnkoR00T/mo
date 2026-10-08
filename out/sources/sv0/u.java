package sv0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lsv0/u;", "", "Lsv0/y;", "processId", "Lsv0/o;", "descriptionAuthor", "<init>", "(Lsv0/y;Lsv0/o;)V", "a", "Lsv0/y;", "b", "()Lsv0/y;", "Lsv0/o;", "()Lsv0/o;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ProcessId processId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o descriptionAuthor;

    public u(ProcessId processId, o oVar) {
        this.processId = processId;
        this.descriptionAuthor = oVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getDescriptionAuthor() {
        return this.descriptionAuthor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ProcessId getProcessId() {
        return this.processId;
    }
}
