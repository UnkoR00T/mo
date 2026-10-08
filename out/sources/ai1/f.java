package ai1;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lai1/f;", "Ll00/e;", "Lai1/f$a;", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: ai1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lai1/f$a;", "", "Lmx/a;", "message", "Li50/a;", "scaffoldData", "Ln50/k;", "confirmDocumentSingleCardData", "checkIdentitySingleCardData", "qualifiedSignatureCardData", "<init>", "(Lmx/a;Li50/a;Ln50/k;Ln50/k;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Li50/a;", "e", "()Li50/a;", "Ln50/k;", "()Ln50/k;", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k confirmDocumentSingleCardData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k checkIdentitySingleCardData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k qualifiedSignatureCardData;

        public Data(Label label, BaseScaffoldData baseScaffoldData, n50.k kVar, n50.k kVar2, n50.k kVar3) {
            this.message = label;
            this.scaffoldData = baseScaffoldData;
            this.confirmDocumentSingleCardData = kVar;
            this.checkIdentitySingleCardData = kVar2;
            this.qualifiedSignatureCardData = kVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n50.k getCheckIdentitySingleCardData() {
            return this.checkIdentitySingleCardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n50.k getConfirmDocumentSingleCardData() {
            return this.confirmDocumentSingleCardData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final n50.k getQualifiedSignatureCardData() {
            return this.qualifiedSignatureCardData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.message, data.message) && t.c(this.scaffoldData, data.scaffoldData) && t.c(this.confirmDocumentSingleCardData, data.confirmDocumentSingleCardData) && t.c(this.checkIdentitySingleCardData, data.checkIdentitySingleCardData) && t.c(this.qualifiedSignatureCardData, data.qualifiedSignatureCardData);
        }

        public int hashCode() {
            int iHashCode = ((((((this.message.hashCode() * 31) + this.scaffoldData.hashCode()) * 31) + this.confirmDocumentSingleCardData.hashCode()) * 31) + this.checkIdentitySingleCardData.hashCode()) * 31;
            n50.k kVar = this.qualifiedSignatureCardData;
            return iHashCode + (kVar == null ? 0 : kVar.hashCode());
        }

        public String toString() {
            return "Data(message=" + this.message + ", scaffoldData=" + this.scaffoldData + ", confirmDocumentSingleCardData=" + this.confirmDocumentSingleCardData + ", checkIdentitySingleCardData=" + this.checkIdentitySingleCardData + ", qualifiedSignatureCardData=" + this.qualifiedSignatureCardData + ')';
        }
    }
}
