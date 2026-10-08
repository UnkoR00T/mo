package dw1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Ldw1/h;", "", "Lrq0/b$b;", "dynamicDocumentType", "<init>", "(Lrq0/b$b;)V", "a", "Lrq0/b$b;", "()Lrq0/b$b;", "b", "Ldw1/h$a;", "Ldw1/h$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rq0.b.EnumC4479b dynamicDocumentType;

    /* JADX INFO: renamed from: dw1.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, d2 = {"Ldw1/h$a;", "Ldw1/h;", "Lrq0/b$b;", "dynamicDocumentType", "", "documentIID", "<init>", "(Lrq0/b$b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b$b;", "a", "()Lrq0/b$b;", "c", "Ljava/lang/String;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentById extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b dynamicDocumentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentIID;

        public DocumentById(rq0.b.EnumC4479b enumC4479b, String str) {
            super(enumC4479b, null);
            this.dynamicDocumentType = enumC4479b;
            this.documentIID = str;
        }

        @Override // dw1.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b.EnumC4479b getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDocumentIID() {
            return this.documentIID;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentById)) {
                return false;
            }
            DocumentById documentById = (DocumentById) other;
            return this.dynamicDocumentType == documentById.dynamicDocumentType && fr.t.c(this.documentIID, documentById.documentIID);
        }

        public int hashCode() {
            return (this.dynamicDocumentType.hashCode() * 31) + this.documentIID.hashCode();
        }

        public String toString() {
            return "DocumentById(dynamicDocumentType=" + this.dynamicDocumentType + ", documentIID=" + this.documentIID + ')';
        }
    }

    /* JADX INFO: renamed from: dw1.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldw1/h$b;", "Ldw1/h;", "Lrq0/b$b;", "dynamicDocumentType", "<init>", "(Lrq0/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lrq0/b$b;", "a", "()Lrq0/b$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentByType extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b dynamicDocumentType;

        public DocumentByType(rq0.b.EnumC4479b enumC4479b) {
            super(enumC4479b, null);
            this.dynamicDocumentType = enumC4479b;
        }

        @Override // dw1.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b.EnumC4479b getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DocumentByType) && this.dynamicDocumentType == ((DocumentByType) other).dynamicDocumentType;
        }

        public int hashCode() {
            return this.dynamicDocumentType.hashCode();
        }

        public String toString() {
            return "DocumentByType(dynamicDocumentType=" + this.dynamicDocumentType + ')';
        }
    }

    public /* synthetic */ h(rq0.b.EnumC4479b enumC4479b, fr.k kVar) {
        this(enumC4479b);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public rq0.b.EnumC4479b getDynamicDocumentType() {
        return this.dynamicDocumentType;
    }

    private h(rq0.b.EnumC4479b enumC4479b) {
        this.dynamicDocumentType = enumC4479b;
    }
}
