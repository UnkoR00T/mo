package l60;

import fr.k;
import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l60.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll60/c;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "description", "", "readLetterByLetter", "<init>", "(Lmx/a;Lmx/a;Z)V", "a", "()Lmx/a;", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "d", "c", "Z", "e", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KeyValueData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116329d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean readLetterByLetter;

    public KeyValueData(Label label, Label label2, boolean z15) {
        this.label = label;
        this.description = label2;
        this.readLetterByLetter = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    public final Label c() {
        return this.description;
    }

    public final Label d() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getReadLetterByLetter() {
        return this.readLetterByLetter;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyValueData)) {
            return false;
        }
        KeyValueData keyValueData = (KeyValueData) other;
        return t.c(this.label, keyValueData.label) && t.c(this.description, keyValueData.description) && this.readLetterByLetter == keyValueData.readLetterByLetter;
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.readLetterByLetter);
    }

    public String toString() {
        return "KeyValueData(label=" + this.label + ", description=" + this.description + ", readLetterByLetter=" + this.readLetterByLetter + ')';
    }

    public /* synthetic */ KeyValueData(Label label, Label label2, boolean z15, int i15, k kVar) {
        this(label, label2, (i15 & 4) != 0 ? false : z15);
    }
}
