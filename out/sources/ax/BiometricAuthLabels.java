package ax;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ax.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lax/b;", "", "Lmx/a;", "title", "subtitle", "description", "negativeButton", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricAuthLabels {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label negativeButton;

    public BiometricAuthLabels(Label label, Label label2, Label label3, Label label4) {
        this.title = label;
        this.subtitle = label2;
        this.description = label3;
        this.negativeButton = label4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getNegativeButton() {
        return this.negativeButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricAuthLabels)) {
            return false;
        }
        BiometricAuthLabels biometricAuthLabels = (BiometricAuthLabels) other;
        return t.c(this.title, biometricAuthLabels.title) && t.c(this.subtitle, biometricAuthLabels.subtitle) && t.c(this.description, biometricAuthLabels.description) && t.c(this.negativeButton, biometricAuthLabels.negativeButton);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.negativeButton.hashCode();
    }

    public String toString() {
        return "BiometricAuthLabels(title=" + this.title + ", subtitle=" + this.subtitle + ", description=" + this.description + ", negativeButton=" + this.negativeButton + ")";
    }
}
