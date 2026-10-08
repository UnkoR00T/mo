package o24;

import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo24/b;", "", "", "fieldReference", "", "Lo24/p;", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BarcodeSchemaDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fieldReference")
    private final String fieldReference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c(AnnotatedPrivateKey.LABEL)
    private final List<DocumentSchemaLabelDto> label;

    public BarcodeSchemaDto(String str, List<DocumentSchemaLabelDto> list) {
        this.fieldReference = str;
        this.label = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFieldReference() {
        return this.fieldReference;
    }

    public final List<DocumentSchemaLabelDto> b() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeSchemaDto)) {
            return false;
        }
        BarcodeSchemaDto barcodeSchemaDto = (BarcodeSchemaDto) other;
        return fr.t.c(this.fieldReference, barcodeSchemaDto.fieldReference) && fr.t.c(this.label, barcodeSchemaDto.label);
    }

    public int hashCode() {
        return (this.fieldReference.hashCode() * 31) + this.label.hashCode();
    }

    public String toString() {
        return "BarcodeSchemaDto(fieldReference=" + this.fieldReference + ", label=" + this.label + ')';
    }
}
