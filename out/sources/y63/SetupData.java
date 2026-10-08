package y63;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: y63.h, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ly63/h;", "", "Lm63/b;", "snackBarSuccessMessage", "<init>", "(Lm63/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm63/b;", "()Lm63/b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m63.b snackBarSuccessMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public SetupData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m63.b getSnackBarSuccessMessage() {
        return this.snackBarSuccessMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetupData) && fr.t.c(this.snackBarSuccessMessage, ((SetupData) other).snackBarSuccessMessage);
    }

    public int hashCode() {
        m63.b bVar = this.snackBarSuccessMessage;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public String toString() {
        return "SetupData(snackBarSuccessMessage=" + this.snackBarSuccessMessage + ')';
    }

    public SetupData(m63.b bVar) {
        this.snackBarSuccessMessage = bVar;
    }

    public /* synthetic */ SetupData(m63.b bVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : bVar);
    }
}
