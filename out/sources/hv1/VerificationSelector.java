package hv1;

import fr.t;
import gv1.DocumentDynamicSection;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hv1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhv1/d;", "", "Lgv1/g;", "dynamicSections", "Lhv1/b;", AnnotatedPrivateKey.LABEL, "<init>", "(Lgv1/g;Lhv1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgv1/g;", "getDynamicSections", "()Lgv1/g;", "b", "Lhv1/b;", "getLabel", "()Lhv1/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentDynamicSection dynamicSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiDocumentSelectorLabel label;

    public VerificationSelector(DocumentDynamicSection documentDynamicSection, MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
        this.dynamicSections = documentDynamicSection;
        this.label = multiDocumentSelectorLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationSelector)) {
            return false;
        }
        VerificationSelector verificationSelector = (VerificationSelector) other;
        return t.c(this.dynamicSections, verificationSelector.dynamicSections) && t.c(this.label, verificationSelector.label);
    }

    public int hashCode() {
        return (this.dynamicSections.hashCode() * 31) + this.label.hashCode();
    }

    public String toString() {
        return "VerificationSelector(dynamicSections=" + this.dynamicSections + ", label=" + this.label + ")";
    }
}
