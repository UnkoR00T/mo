package mb1;

import fr.t;
import fu.r;
import gz.b;
import java.util.ArrayList;
import java.util.List;
import ju.g2;
import ld1.SearchModel;
import mx.Label;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lmb1/a;", "Lgz/b;", "Lmb1/a$a;", "", "Lld1/m$a;", "<init>", "()V", "params", "d", "(Lmb1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b<Params, List<? extends SearchModel.a>> {

    /* JADX INFO: renamed from: mb1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmb1/a$a;", "Lgz/b$a;", "", "query", "", "Lld1/m$a;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String query;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SearchModel.a> items;

        public Params(String str, List<SearchModel.a> list) {
            this.query = str;
            this.items = list;
        }

        public final List<SearchModel.a> a() {
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
            return t.c(this.query, params.query) && t.c(this.items, params.items);
        }

        public int hashCode() {
            return (this.query.hashCode() * 31) + this.items.hashCode();
        }

        public String toString() {
            return "Params(query=" + this.query + ", items=" + this.items + ')';
        }
    }

    public Object d(Params params, e<? super List<SearchModel.a>> eVar) {
        String text;
        String string;
        List<SearchModel.a> listA = params.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            SearchModel.a aVar = (SearchModel.a) obj;
            g2.j(eVar.getContext());
            boolean z15 = true;
            if (!r.b0(r.u1(aVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String().getText()).toString(), params.getQuery(), true)) {
                Label description = aVar.getDescription();
                if (!((description == null || (text = description.getText()) == null || (string = r.u1(text).toString()) == null) ? false : r.b0(string, params.getQuery(), true))) {
                    z15 = false;
                }
            }
            if (z15) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
