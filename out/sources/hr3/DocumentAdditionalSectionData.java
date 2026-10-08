package hr3;

import fr.t;
import mx.Label;
import n30.CardListData;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hr3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhr3/a;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Ln30/b;", "data", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentAdditionalSectionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData data;

    public DocumentAdditionalSectionData(Label label, CardListData cardListData) {
        this.label = label;
        this.data = cardListData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardListData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentAdditionalSectionData)) {
            return false;
        }
        DocumentAdditionalSectionData documentAdditionalSectionData = (DocumentAdditionalSectionData) other;
        return t.c(this.label, documentAdditionalSectionData.label) && t.c(this.data, documentAdditionalSectionData.data);
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "DocumentAdditionalSectionData(label=" + this.label + ", data=" + this.data + ')';
    }
}
