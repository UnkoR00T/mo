package b70;

import fr.k;
import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b70.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb70/a;", "", "", "testTag", "", "isFulfilled", "Lmx/a;", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;ZLmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Lmx/a;", "()Lmx/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequirementItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFulfilled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    public RequirementItem(String str, boolean z15, Label label) {
        this.testTag = str;
        this.isFulfilled = z15;
        this.label = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsFulfilled() {
        return this.isFulfilled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequirementItem)) {
            return false;
        }
        RequirementItem requirementItem = (RequirementItem) other;
        return t.c(this.testTag, requirementItem.testTag) && this.isFulfilled == requirementItem.isFulfilled && t.c(this.label, requirementItem.label);
    }

    public int hashCode() {
        String str = this.testTag;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isFulfilled)) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "RequirementItem(testTag=" + this.testTag + ", isFulfilled=" + this.isFulfilled + ", label=" + this.label + ')';
    }

    public /* synthetic */ RequirementItem(String str, boolean z15, Label label, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, z15, label);
    }
}
