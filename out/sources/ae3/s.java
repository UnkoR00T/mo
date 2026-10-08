package ae3;

import hi3.SearchInsuranceItem;
import java.util.ArrayList;
import java.util.List;
import ju.g2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lae3/s;", "Lgz/b;", "Lae3/s$a;", "", "Lhi3/a;", "<init>", "()V", "params", "d", "(Lae3/s$a;Ltq/e;)Ljava/lang/Object;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements gz.b<Params, List<? extends SearchInsuranceItem>> {

    /* JADX INFO: renamed from: ae3.s$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lae3/s$a;", "Lgz/b$a;", "", "query", "", "Lhi3/a;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String query;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SearchInsuranceItem> items;

        public Params(String str, List<SearchInsuranceItem> list) {
            this.query = str;
            this.items = list;
        }

        public final List<SearchInsuranceItem> a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.query, params.query) && fr.t.c(this.items, params.items);
        }

        public int hashCode() {
            return (this.query.hashCode() * 31) + this.items.hashCode();
        }

        public String toString() {
            return "Params(query=" + this.query + ", items=" + this.items + ')';
        }
    }

    public Object d(Params params, tq.e<? super List<SearchInsuranceItem>> eVar) {
        List<SearchInsuranceItem> listA = params.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            g2.j(eVar.getContext());
            if (fu.r.b0(fu.r.u1(((SearchInsuranceItem) obj).getLabel().getText()).toString(), params.getQuery(), true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
