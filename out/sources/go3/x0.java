package go3;

import java.util.Iterator;
import java.util.List;
import k34.WruDocumentItem;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\b\nB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgo3/x0;", "Lgz/a;", "Lgo3/x0$b;", "", "Lk34/l0;", "<init>", "()V", "params", "b", "(Lgo3/x0$b;)Ljava/util/List;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x0 implements gz.a<Params, List<? extends WruDocumentItem>> {

    /* JADX INFO: renamed from: go3.x0$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgo3/x0$b;", "Lgz/b$a;", "", "Lk34/l0;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<WruDocumentItem> items;

        public Params(List<WruDocumentItem> list) {
            this.items = list;
        }

        public final List<WruDocumentItem> a() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.items, ((Params) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "Params(items=" + this.items + ')';
        }
    }

    public List<WruDocumentItem> b(Params params) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Iterator<T> it = params.a().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((WruDocumentItem) next).getType(), "NAME"));
        WruDocumentItem wruDocumentItem = (WruDocumentItem) next;
        Iterator<T> it4 = params.a().iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!fr.t.c(((WruDocumentItem) next2).getType(), "SURNAME"));
        WruDocumentItem wruDocumentItem2 = (WruDocumentItem) next2;
        Iterator<T> it5 = params.a().iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!fr.t.c(((WruDocumentItem) next3).getType(), "PESEL"));
        WruDocumentItem wruDocumentItem3 = (WruDocumentItem) next3;
        Iterator<T> it6 = params.a().iterator();
        do {
            if (!it6.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it6.next();
        } while (!fr.t.c(((WruDocumentItem) next4).getType(), "VALID_TO"));
        WruDocumentItem wruDocumentItem4 = (WruDocumentItem) next4;
        for (Object obj2 : params.a()) {
            if (fr.t.c(((WruDocumentItem) obj2).getType(), "DOCUMENT_NUMBER")) {
                obj = obj2;
                break;
            }
        }
        return pq.v.s(wruDocumentItem, wruDocumentItem2, wruDocumentItem3, wruDocumentItem4, (WruDocumentItem) obj);
    }
}
