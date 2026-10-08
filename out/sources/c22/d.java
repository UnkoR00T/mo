package c22;

import d12.SearchQueryParameter;
import eo0.CountryDictionary;
import eo0.SearchAddressRequest;
import eo0.SearchRequest;
import eo0.r0;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lc22/d;", "Lxw/f;", "Lc22/d$a;", "", "Ld12/d;", "Lmx/c;", "labelProvider", "Lc22/b;", "referenceRegistryStringResourceProvider", "<init>", "(Lmx/c;Lc22/b;)V", "Leo0/w0;", "searchRequest", "c", "(Leo0/w0;)Ljava/util/List;", "e", "", "resourceId", "", "f", "(I)Ljava/lang/String;", "params", "h", "(Lc22/d$a;)Ljava/util/List;", "a", "Lmx/c;", "b", "Lc22/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, List<? extends SearchQueryParameter>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b referenceRegistryStringResourceProvider;

    /* JADX INFO: renamed from: c22.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lc22/d$a;", "", "Leo0/w0;", "searchRequest", "<init>", "(Leo0/w0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/w0;", "()Leo0/w0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchRequest searchRequest;

        public Params(SearchRequest searchRequest) {
            this.searchRequest = searchRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SearchRequest getSearchRequest() {
            return this.searchRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.searchRequest, ((Params) other).searchRequest);
        }

        public int hashCode() {
            SearchRequest searchRequest = this.searchRequest;
            if (searchRequest == null) {
                return 0;
            }
            return searchRequest.hashCode();
        }

        public String toString() {
            return "Params(searchRequest=" + this.searchRequest + ')';
        }
    }

    public d(mx.c cVar, b bVar) {
        this.labelProvider = cVar;
        this.referenceRegistryStringResourceProvider = bVar;
    }

    private final List<SearchQueryParameter> c(SearchRequest searchRequest) {
        CountryDictionary country;
        r rVarA = y.a(this.labelProvider.c(e02.a.I1).getText(), searchRequest.getEntityName());
        String text = this.labelProvider.c(e02.a.f46544i).getText();
        SearchAddressRequest address = searchRequest.getAddress();
        r rVarA2 = y.a(text, address != null ? address.getCity() : null);
        String text2 = this.labelProvider.c(e02.a.f46580o).getText();
        SearchAddressRequest address2 = searchRequest.getAddress();
        r rVarA3 = y.a(text2, (address2 == null || (country = address2.getCountry()) == null) ? null : country.getName());
        String text3 = this.labelProvider.c(e02.a.f46527f0).getText();
        SearchAddressRequest address3 = searchRequest.getAddress();
        r rVarA4 = y.a(text3, address3 != null ? address3.getPostalCode() : null);
        String text4 = this.labelProvider.c(e02.a.f46629w0).getText();
        SearchAddressRequest address4 = searchRequest.getAddress();
        r rVarA5 = y.a(text4, address4 != null ? address4.getStreet() : null);
        String text5 = this.labelProvider.c(e02.a.f46526f).getText();
        SearchAddressRequest address5 = searchRequest.getAddress();
        r rVarA6 = y.a(text5, address5 != null ? address5.getBuildingNumber() : null);
        String text6 = this.labelProvider.c(e02.a.f46508c).getText();
        SearchAddressRequest address6 = searchRequest.getAddress();
        Map mapL = v0.l(rVarA, rVarA2, rVarA3, rVarA4, rVarA5, rVarA6, y.a(text6, address6 != null ? address6.getFlatNumber() : null), y.a(this.labelProvider.c(e02.a.M).getText(), searchRequest.getName()), y.a(this.labelProvider.c(e02.a.V).getText(), searchRequest.getSurname()));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapL.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            SearchQueryParameter searchQueryParameter = str2 != null ? new SearchQueryParameter(str, str2) : null;
            if (searchQueryParameter != null) {
                arrayList.add(searchQueryParameter);
            }
        }
        return arrayList;
    }

    private final List<SearchQueryParameter> e(SearchRequest searchRequest) {
        List listC = v.c();
        List<r0> listE = searchRequest.e();
        if (listE != null) {
            for (r0 r0Var : listE) {
                Integer numA = this.referenceRegistryStringResourceProvider.a(r0Var);
                if (numA != null) {
                    listC.add(new SearchQueryParameter(f(numA.intValue()), r0Var.getRegistryId()));
                }
            }
        }
        return v.a(listC);
    }

    private final String f(int resourceId) {
        return this.labelProvider.c(resourceId).getText();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<SearchQueryParameter> b(Params params) {
        List<SearchQueryParameter> listL0;
        SearchRequest searchRequest = params.getSearchRequest();
        return (searchRequest == null || (listL0 = v.L0(e(searchRequest), c(searchRequest))) == null) ? v.n() : listL0;
    }
}
