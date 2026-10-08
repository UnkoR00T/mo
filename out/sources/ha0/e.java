package ha0;

import da0.AvailableDocument;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lha0/e;", "", "c", "b", "a", "Lha0/e$a;", "Lha0/e$b;", "Lha0/e$c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: ha0.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lha0/e$a;", "Lha0/e;", "", "Lda0/a;", "availableDocuments", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddDocument implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AvailableDocument> availableDocuments;

        public AddDocument(List<AvailableDocument> list) {
            this.availableDocuments = list;
        }

        public final List<AvailableDocument> a() {
            return this.availableDocuments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddDocument) && fr.t.c(this.availableDocuments, ((AddDocument) other).availableDocuments);
        }

        public int hashCode() {
            return this.availableDocuments.hashCode();
        }

        public String toString() {
            return "AddDocument(availableDocuments=" + this.availableDocuments + ')';
        }
    }

    /* JADX INFO: renamed from: ha0.e$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lha0/e$b;", "Lha0/e;", "Lhb4/c;", "errorVMS", "", "Lda0/a;", "availableDocuments", "<init>", "(Lhb4/c;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "Ljava/util/List;", "()Ljava/util/List;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AvailableDocument> availableDocuments;

        public Error(hb4.c cVar, List<AvailableDocument> list) {
            this.errorVMS = cVar;
            this.availableDocuments = list;
        }

        public final List<AvailableDocument> a() {
            return this.availableDocuments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.errorVMS, error.errorVMS) && fr.t.c(this.availableDocuments, error.availableDocuments);
        }

        public int hashCode() {
            return (this.errorVMS.hashCode() * 31) + this.availableDocuments.hashCode();
        }

        public String toString() {
            return "Error(errorVMS=" + this.errorVMS + ", availableDocuments=" + this.availableDocuments + ')';
        }
    }

    /* JADX INFO: renamed from: ha0.e$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lha0/e$c;", "Lha0/e;", "", "Lda0/a;", "availableDocuments", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Lha0/e$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AvailableDocument> availableDocuments;

        public Initialized(List<AvailableDocument> list) {
            this.availableDocuments = list;
        }

        public final Initialized a(List<AvailableDocument> availableDocuments) {
            return new Initialized(availableDocuments);
        }

        public final List<AvailableDocument> b() {
            return this.availableDocuments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.availableDocuments, ((Initialized) other).availableDocuments);
        }

        public int hashCode() {
            return this.availableDocuments.hashCode();
        }

        public String toString() {
            return "Initialized(availableDocuments=" + this.availableDocuments + ')';
        }
    }
}
