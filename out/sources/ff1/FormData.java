package ff1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ff1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lff1/g;", "", "", "statementAccepted", "Lhz/b;", "validationState", "<init>", "(ZLhz/b;)V", "a", "(ZLhz/b;)Lff1/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "Lhz/b;", "d", "()Lhz/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f62182c = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean statementAccepted;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    public FormData(boolean z15, hz.b bVar) {
        this.statementAccepted = z15;
        this.validationState = bVar;
    }

    public static /* synthetic */ FormData b(FormData formData, boolean z15, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = formData.statementAccepted;
        }
        if ((i15 & 2) != 0) {
            bVar = formData.validationState;
        }
        return formData.a(z15, bVar);
    }

    public final FormData a(boolean statementAccepted, hz.b validationState) {
        return new FormData(statementAccepted, validationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getStatementAccepted() {
        return this.statementAccepted;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormData)) {
            return false;
        }
        FormData formData = (FormData) other;
        return this.statementAccepted == formData.statementAccepted && fr.t.c(this.validationState, formData.validationState);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.statementAccepted) * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "FormData(statementAccepted=" + this.statementAccepted + ", validationState=" + this.validationState + ')';
    }

    public /* synthetic */ FormData(boolean z15, hz.b bVar, int i15, fr.k kVar) {
        this(z15, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar);
    }
}
