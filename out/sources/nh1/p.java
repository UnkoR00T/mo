package nh1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lnh1/p;", "", "a", "Lnh1/p$a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p {

    /* JADX INFO: renamed from: nh1.p$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lnh1/p$a;", "Lnh1/p;", "", "Lk34/g;", "documents", "Lrq0/b;", "visibleDocumentType", "<init>", "(Ljava/util/List;Lrq0/b;)V", "a", "(Ljava/util/List;Lrq0/b;)Lnh1/p$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lrq0/b;", "d", "()Lrq0/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> documents;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b visibleDocumentType;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends k34.g> list, rq0.b bVar) {
            this.documents = list;
            this.visibleDocumentType = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content b(Content content, List list, rq0.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = content.documents;
            }
            if ((i15 & 2) != 0) {
                bVar = content.visibleDocumentType;
            }
            return content.a(list, bVar);
        }

        public final Content a(List<? extends k34.g> documents, rq0.b visibleDocumentType) {
            return new Content(documents, visibleDocumentType);
        }

        public List<k34.g> c() {
            return this.documents;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final rq0.b getVisibleDocumentType() {
            return this.visibleDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return fr.t.c(this.documents, content.documents) && fr.t.c(this.visibleDocumentType, content.visibleDocumentType);
        }

        public int hashCode() {
            int iHashCode = this.documents.hashCode() * 31;
            rq0.b bVar = this.visibleDocumentType;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Content(documents=" + this.documents + ", visibleDocumentType=" + this.visibleDocumentType + ')';
        }
    }
}
