package a22;

import eo0.CountryDictionary;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import m02.SearchModel;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La22/s;", "Lxw/f;", "La22/s$a;", "Lm02/h;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(La22/s$a;)Lm02/h;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements xw.f<Params, SearchModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: a22.s$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"La22/s$a;", "", "", "selectedCountryName", "", "Leo0/l;", "items", "Lkotlin/Function1;", "Loq/i0;", "onChange", "<init>", "(Ljava/lang/String;Ljava/util/List;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "Ler/l;", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedCountryName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CountryDictionary> items;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<CountryDictionary, i0> onChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(String str, List<CountryDictionary> list, er.l<? super CountryDictionary, i0> lVar) {
            this.selectedCountryName = str;
            this.items = list;
            this.onChange = lVar;
        }

        public final List<CountryDictionary> a() {
            return this.items;
        }

        public final er.l<CountryDictionary, i0> b() {
            return this.onChange;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSelectedCountryName() {
            return this.selectedCountryName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.selectedCountryName, params.selectedCountryName) && fr.t.c(this.items, params.items) && fr.t.c(this.onChange, params.onChange);
        }

        public int hashCode() {
            String str = this.selectedCountryName;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.items.hashCode()) * 31) + this.onChange.hashCode();
        }

        public String toString() {
            return "Params(selectedCountryName=" + this.selectedCountryName + ", items=" + this.items + ", onChange=" + this.onChange + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((SearchModel.Item) t16).getIsSelected()), Boolean.valueOf(((SearchModel.Item) t15).getIsSelected()));
        }
    }

    public s(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, CountryDictionary countryDictionary) {
        params.b().b(countryDictionary);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SearchModel b(final Params params) {
        Label labelC = this.labelProvider.c(e02.a.f46606s1);
        List<CountryDictionary> listA = params.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final CountryDictionary countryDictionary = (CountryDictionary) obj;
            arrayList.add(new SearchModel.Item(mx.b.b(countryDictionary.getName(), "item" + i15), null, fr.t.c(countryDictionary.getName(), params.getSelectedCountryName()), new er.a() { // from class: a22.r
                @Override // er.a
                public final Object a() {
                    return s.f(params, countryDictionary);
                }
            }, 2, null));
            i15 = i16;
        }
        return new SearchModel(labelC, v.U0(arrayList, new b()));
    }
}
