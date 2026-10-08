package o24;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.p, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lo24/p;", "", "Lo24/q;", "language", "", "value", "<init>", "(Lo24/q;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo24/q;", "()Lo24/q;", "b", "Ljava/lang/String;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchemaLabelDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("language")
    private final q language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("value")
    private final String value;

    public DocumentSchemaLabelDto(q qVar, String str) {
        this.language = qVar;
        this.value = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchemaLabelDto)) {
            return false;
        }
        DocumentSchemaLabelDto documentSchemaLabelDto = (DocumentSchemaLabelDto) other;
        return this.language == documentSchemaLabelDto.language && fr.t.c(this.value, documentSchemaLabelDto.value);
    }

    public int hashCode() {
        return (this.language.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "DocumentSchemaLabelDto(language=" + this.language + ", value=" + this.value + ')';
    }
}
