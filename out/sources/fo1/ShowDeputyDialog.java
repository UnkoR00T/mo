package fo1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fo1.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfo1/h;", "", "Lgo1/k;", "dialog", "<init>", "(Lgo1/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgo1/k;", "()Lgo1/k;", "deputycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowDeputyDialog implements n20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final go1.k dialog;

    public ShowDeputyDialog(go1.k kVar) {
        this.dialog = kVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final go1.k getDialog() {
        return this.dialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShowDeputyDialog) && fr.t.c(this.dialog, ((ShowDeputyDialog) other).dialog);
    }

    public int hashCode() {
        return this.dialog.hashCode();
    }

    public String toString() {
        return "ShowDeputyDialog(dialog=" + this.dialog + ')';
    }
}
