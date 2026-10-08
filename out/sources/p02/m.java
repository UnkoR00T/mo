package p02;

import eo0.CountryDictionary;
import eo0.SearchAddressRequest;
import eo0.SearchRequest;
import eo0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m02.Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lp02/m;", "Lgz/a;", "Lp02/m$g;", "Leo0/w0;", "<init>", "()V", "Lm02/a;", "fieldType", "Lm02/b;", "fields", "", "c", "(Lm02/a;Lm02/b;)Ljava/lang/String;", "params", "Leo0/l;", "b", "(Lp02/m$g;)Leo0/l;", "d", "(Lp02/m$g;)Leo0/w0;", "a", "g", "f", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements gz.a<Params, SearchRequest> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<oq.r<m02.a.c, mr.g<eo0.r0>>> f151216b = pq.v.q(oq.y.a(m02.a.c.PESEL, a.f151217j), oq.y.a(m02.a.c.NIP, b.f151218j), oq.y.a(m02.a.c.KRS, c.f151219j), oq.y.a(m02.a.c.EUROPEAN_ID, d.f151220j), oq.y.a(m02.a.c.REGON, e.f151221j));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<String, eo0.r0.Pesel> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f151217j = new a();

        a() {
            super(1, eo0.r0.Pesel.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final eo0.r0.Pesel b(String str) {
            return new eo0.r0.Pesel(str);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<String, eo0.r0.Nip> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f151218j = new b();

        b() {
            super(1, eo0.r0.Nip.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final eo0.r0.Nip b(String str) {
            return new eo0.r0.Nip(str);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<String, eo0.r0.Krs> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c f151219j = new c();

        c() {
            super(1, eo0.r0.Krs.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final eo0.r0.Krs b(String str) {
            return new eo0.r0.Krs(str);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.l<String, eo0.r0.Ue> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f151220j = new d();

        d() {
            super(1, eo0.r0.Ue.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final eo0.r0.Ue b(String str) {
            return new eo0.r0.Ue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<String, eo0.r0.Regon> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final e f151221j = new e();

        e() {
            super(1, eo0.r0.Regon.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final eo0.r0.Regon b(String str) {
            return new eo0.r0.Regon(str);
        }
    }

    /* JADX INFO: renamed from: p02.m$g, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lp02/m$g;", "Lgz/b$a;", "Lm02/b;", "fields", "Lf02/a;", "searchCondition", "", "Leo0/l;", "countryDictionaryList", "<init>", "(Lm02/b;Lf02/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm02/b;", "b", "()Lm02/b;", "Lf02/a;", "c", "()Lf02/a;", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m02.b fields;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final f02.a searchCondition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CountryDictionary> countryDictionaryList;

        public Params(m02.b bVar, f02.a aVar, List<CountryDictionary> list) {
            this.fields = bVar;
            this.searchCondition = aVar;
            this.countryDictionaryList = list;
        }

        public final List<CountryDictionary> a() {
            return this.countryDictionaryList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m02.b getFields() {
            return this.fields;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final f02.a getSearchCondition() {
            return this.searchCondition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.fields, params.fields) && fr.t.c(this.searchCondition, params.searchCondition) && fr.t.c(this.countryDictionaryList, params.countryDictionaryList);
        }

        public int hashCode() {
            return (((this.fields.hashCode() * 31) + this.searchCondition.hashCode()) * 31) + this.countryDictionaryList.hashCode();
        }

        public String toString() {
            return "Params(fields=" + this.fields + ", searchCondition=" + this.searchCondition + ", countryDictionaryList=" + this.countryDictionaryList + ')';
        }
    }

    private final CountryDictionary b(Params params) {
        String str;
        Object next;
        String name;
        Field<String> field;
        Iterator<T> it = params.a().iterator();
        do {
            str = null;
            if (it.hasNext()) {
                next = it.next();
                name = ((CountryDictionary) next).getName();
                field = params.getFields().a().get(m02.a.EnumC2987a.COUNTRY);
            }
            return (CountryDictionary) str;
        } while (!fr.t.c(name, field != null ? field.d() : null));
        str = next;
        return (CountryDictionary) str;
    }

    private final String c(m02.a fieldType, m02.b fields) {
        String strD;
        Field<String> field = fields.a().get(fieldType);
        if (field == null || (strD = field.d()) == null || fu.r.t0(strD)) {
            return null;
        }
        return strD;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    public SearchRequest d(Params params) {
        SearchAddressRequest searchAddressRequest;
        v0 v0Var;
        eo0.r0 r0Var;
        String strC = c(m02.a.EnumC2987a.PUBLIC_NAME, params.getFields());
        String strC2 = c(m02.a.d.NAME, params.getFields());
        if (strC2 == null) {
            strC2 = c(m02.a.EnumC2987a.NAME, params.getFields());
        }
        String str = strC2;
        String strC3 = c(m02.a.d.SURNAME, params.getFields());
        if (strC3 == null) {
            strC3 = c(m02.a.EnumC2987a.SURNAME, params.getFields());
        }
        String str2 = strC3;
        f02.a searchCondition = params.getSearchCondition();
        if (fr.t.c(searchCondition, f02.a.AbstractC1288a.C1289a.f54574a) || fr.t.c(searchCondition, f02.a.b.C1290a.f54577a)) {
            String strC4 = c(m02.a.EnumC2987a.BUILDING_NUMBER, params.getFields());
            String strC5 = c(m02.a.EnumC2987a.CITY, params.getFields());
            CountryDictionary countryDictionaryB = b(params);
            searchAddressRequest = new SearchAddressRequest(strC4, c(m02.a.EnumC2987a.APARTMENT_NUMBER, params.getFields()), strC5, b(params), countryDictionaryB != null ? countryDictionaryB.getCountryCode() : null, c(m02.a.EnumC2987a.POSTCODE, params.getFields()), c(m02.a.EnumC2987a.STREET, params.getFields()));
        } else {
            searchAddressRequest = null;
        }
        f02.a searchCondition2 = params.getSearchCondition();
        if (searchCondition2 instanceof f02.a.AbstractC1288a) {
            v0Var = v0.BAILIFF;
        } else {
            if (!(searchCondition2 instanceof f02.a.b)) {
                throw new oq.p();
            }
            v0Var = v0.PUBLIC;
        }
        v0 v0Var2 = v0Var;
        List<oq.r<m02.a.c, mr.g<eo0.r0>>> list = f151216b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            oq.r rVar = (oq.r) it.next();
            m02.a.c cVar = (m02.a.c) rVar.a();
            mr.g gVar = (mr.g) rVar.b();
            String strC6 = c(cVar, params.getFields());
            if (strC6 == null) {
                r0Var = null;
            } else {
                if (fu.r.t0(strC6)) {
                    strC6 = null;
                }
                if (strC6 != null) {
                    r0Var = (eo0.r0) ((er.l) gVar).b(strC6);
                } else {
                    r0Var = null;
                }
            }
            if (r0Var != null) {
                arrayList.add(r0Var);
            }
        }
        return new SearchRequest(v0Var2, arrayList, str, strC, str2, searchAddressRequest);
    }
}
