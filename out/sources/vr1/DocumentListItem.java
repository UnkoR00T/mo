package vr1;

import fr.k;
import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vr1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvr1/b;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lrq0/b;", "documentType", "Lr54/b;", "documentNotificationSubType", "<init>", "(Lmx/a;Lrq0/b;Lr54/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lrq0/b;", "()Lrq0/b;", "Lr54/b;", "()Lr54/b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentListItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final r54.b documentNotificationSubType;

    public DocumentListItem(Label label, rq0.b bVar, r54.b bVar2) {
        this.label = label;
        this.documentType = bVar;
        this.documentNotificationSubType = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r54.b getDocumentNotificationSubType() {
        return this.documentNotificationSubType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rq0.b getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentListItem)) {
            return false;
        }
        DocumentListItem documentListItem = (DocumentListItem) other;
        return t.c(this.label, documentListItem.label) && t.c(this.documentType, documentListItem.documentType) && this.documentNotificationSubType == documentListItem.documentNotificationSubType;
    }

    public int hashCode() {
        int iHashCode = ((this.label.hashCode() * 31) + this.documentType.hashCode()) * 31;
        r54.b bVar = this.documentNotificationSubType;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "DocumentListItem(label=" + this.label + ", documentType=" + this.documentType + ", documentNotificationSubType=" + this.documentNotificationSubType + ')';
    }

    public /* synthetic */ DocumentListItem(Label label, rq0.b bVar, r54.b bVar2, int i15, k kVar) {
        this(label, bVar, (i15 & 4) != 0 ? null : bVar2);
    }
}
