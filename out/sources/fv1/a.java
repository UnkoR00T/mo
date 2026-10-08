package fv1;

import fr.k;
import gx.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lfv1/a;", "Lgx/b;", "<init>", "()V", "a", "b", "Lfv1/a$a;", "Lfv1/a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements b {

    /* JADX INFO: renamed from: fv1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfv1/a$a;", "Lfv1/a;", "Lrq0/b$b;", "dynamicDocumentType", "<init>", "(Lrq0/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$b;", "()Lrq0/b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToDynamicDocument extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b dynamicDocumentType;

        public ToDynamicDocument(rq0.b.EnumC4479b enumC4479b) {
            super(null);
            this.dynamicDocumentType = enumC4479b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b.EnumC4479b getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToDynamicDocument) && this.dynamicDocumentType == ((ToDynamicDocument) other).dynamicDocumentType;
        }

        public int hashCode() {
            return this.dynamicDocumentType.hashCode();
        }

        public String toString() {
            return "ToDynamicDocument(dynamicDocumentType=" + this.dynamicDocumentType + ")";
        }
    }

    /* JADX INFO: renamed from: fv1.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfv1/a$b;", "Lfv1/a;", "Lrq0/b$c;", "dynamicMultiDocumentType", "<init>", "(Lrq0/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$c;", "()Lrq0/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToDynamicMultiDocument extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.c dynamicMultiDocumentType;

        public ToDynamicMultiDocument(rq0.b.c cVar) {
            super(null);
            this.dynamicMultiDocumentType = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b.c getDynamicMultiDocumentType() {
            return this.dynamicMultiDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToDynamicMultiDocument) && this.dynamicMultiDocumentType == ((ToDynamicMultiDocument) other).dynamicMultiDocumentType;
        }

        public int hashCode() {
            return this.dynamicMultiDocumentType.hashCode();
        }

        public String toString() {
            return "ToDynamicMultiDocument(dynamicMultiDocumentType=" + this.dynamicMultiDocumentType + ")";
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
