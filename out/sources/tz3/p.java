package tz3;

import hr0.MultiDocumentSchema;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ltz3/p;", "Lgz/b;", "Ltz3/p$a;", "Loq/i0;", "a", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends gz.b<Params, oq.i0> {

    /* JADX INFO: renamed from: tz3.p$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\r¨\u0006\""}, d2 = {"Ltz3/p$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "Lhr0/a;", "multiDocumentSchema", "Llz3/d;", "downloadMethod", "", "documentIID", "<init>", "(Lrq0/b;Lhr0/a;Llz3/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "g", "()Lrq0/b;", "b", "Lhr0/a;", "c", "()Lhr0/a;", "Llz3/d;", "()Llz3/d;", "d", "Ljava/lang/String;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MultiDocumentSchema multiDocumentSchema;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final lz3.d downloadMethod;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentIID;

        public Params(rq0.b bVar, MultiDocumentSchema multiDocumentSchema, lz3.d dVar, String str) {
            this.documentType = bVar;
            this.multiDocumentSchema = multiDocumentSchema;
            this.downloadMethod = dVar;
            this.documentIID = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentIID() {
            return this.documentIID;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final lz3.d getDownloadMethod() {
            return this.downloadMethod;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final MultiDocumentSchema getMultiDocumentSchema() {
            return this.multiDocumentSchema;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.documentType, params.documentType) && fr.t.c(this.multiDocumentSchema, params.multiDocumentSchema) && this.downloadMethod == params.downloadMethod && fr.t.c(this.documentIID, params.documentIID);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        public int hashCode() {
            int iHashCode = this.documentType.hashCode() * 31;
            MultiDocumentSchema multiDocumentSchema = this.multiDocumentSchema;
            return ((((iHashCode + (multiDocumentSchema == null ? 0 : multiDocumentSchema.hashCode())) * 31) + this.downloadMethod.hashCode()) * 31) + this.documentIID.hashCode();
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ", multiDocumentSchema=" + this.multiDocumentSchema + ", downloadMethod=" + this.downloadMethod + ", documentIID=" + this.documentIID + ')';
        }
    }
}
