package cr3;

import fr.t;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cr3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcr3/f;", "", "", "dataType", "value", "Lmx/a;", AnnotatedPrivateKey.LABEL, "type", "", "share", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmx/a;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Lmx/a;", "()Lmx/a;", "e", "Z", "getShare", "()Z", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WruDocumentItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean share;

    public WruDocumentItem(String str, String str2, Label label, String str3, boolean z15) {
        this.dataType = str;
        this.value = str2;
        this.label = label;
        this.type = str3;
        this.share = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WruDocumentItem)) {
            return false;
        }
        WruDocumentItem wruDocumentItem = (WruDocumentItem) other;
        return t.c(this.dataType, wruDocumentItem.dataType) && t.c(this.value, wruDocumentItem.value) && t.c(this.label, wruDocumentItem.label) && t.c(this.type, wruDocumentItem.type) && this.share == wruDocumentItem.share;
    }

    public int hashCode() {
        return (((((((this.dataType.hashCode() * 31) + this.value.hashCode()) * 31) + this.label.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.share);
    }

    public String toString() {
        return "WruDocumentItem(dataType=" + this.dataType + ", value=" + this.value + ", label=" + this.label + ", type=" + this.type + ", share=" + this.share + ')';
    }
}
