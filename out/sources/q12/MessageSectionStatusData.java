package q12;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q12.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lq12/c;", "", "Lmx/a;", "keyLabel", "Lr50/a$b;", "statusBadge", "<init>", "(Lmx/a;Lr50/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Lr50/a$b;", "()Lr50/a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageSectionStatusData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f163746c = r50.a.WithIcon.f171875m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label keyLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final r50.a.WithIcon statusBadge;

    public MessageSectionStatusData(Label label, r50.a.WithIcon withIcon) {
        this.keyLabel = label;
        this.statusBadge = withIcon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getKeyLabel() {
        return this.keyLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r50.a.WithIcon getStatusBadge() {
        return this.statusBadge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSectionStatusData)) {
            return false;
        }
        MessageSectionStatusData messageSectionStatusData = (MessageSectionStatusData) other;
        return t.c(this.keyLabel, messageSectionStatusData.keyLabel) && t.c(this.statusBadge, messageSectionStatusData.statusBadge);
    }

    public int hashCode() {
        return (this.keyLabel.hashCode() * 31) + this.statusBadge.hashCode();
    }

    public String toString() {
        return "MessageSectionStatusData(keyLabel=" + this.keyLabel + ", statusBadge=" + this.statusBadge + ')';
    }
}
