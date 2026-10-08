package y12;

import eo0.CountryDictionary;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y12.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, d2 = {"Ly12/b;", "", "Lf02/a;", "searchCondition", "Lm02/b;", "fields", "Lm02/a;", "fieldTypeToScroll", "", "Leo0/l;", "countryDictionaryList", "<init>", "(Lf02/a;Lm02/b;Lm02/a;Ljava/util/List;)V", "a", "(Lf02/a;Lm02/b;Lm02/a;Ljava/util/List;)Ly12/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf02/a;", "f", "()Lf02/a;", "b", "Lm02/b;", "e", "()Lm02/b;", "c", "Lm02/a;", "d", "()Lm02/a;", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f02.a searchCondition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final m02.b fields;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m02.a fieldTypeToScroll;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CountryDictionary> countryDictionaryList;

    public State(f02.a aVar, m02.b bVar, m02.a aVar2, List<CountryDictionary> list) {
        this.searchCondition = aVar;
        this.fields = bVar;
        this.fieldTypeToScroll = aVar2;
        this.countryDictionaryList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, f02.a aVar, m02.b bVar, m02.a aVar2, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.searchCondition;
        }
        if ((i15 & 2) != 0) {
            bVar = state.fields;
        }
        if ((i15 & 4) != 0) {
            aVar2 = state.fieldTypeToScroll;
        }
        if ((i15 & 8) != 0) {
            list = state.countryDictionaryList;
        }
        return state.a(aVar, bVar, aVar2, list);
    }

    public final State a(f02.a searchCondition, m02.b fields, m02.a fieldTypeToScroll, List<CountryDictionary> countryDictionaryList) {
        return new State(searchCondition, fields, fieldTypeToScroll, countryDictionaryList);
    }

    public final List<CountryDictionary> c() {
        return this.countryDictionaryList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m02.a getFieldTypeToScroll() {
        return this.fieldTypeToScroll;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final m02.b getFields() {
        return this.fields;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.searchCondition, state.searchCondition) && fr.t.c(this.fields, state.fields) && fr.t.c(this.fieldTypeToScroll, state.fieldTypeToScroll) && fr.t.c(this.countryDictionaryList, state.countryDictionaryList);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f02.a getSearchCondition() {
        return this.searchCondition;
    }

    public int hashCode() {
        int iHashCode = ((this.searchCondition.hashCode() * 31) + this.fields.hashCode()) * 31;
        m02.a aVar = this.fieldTypeToScroll;
        return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.countryDictionaryList.hashCode();
    }

    public String toString() {
        return "State(searchCondition=" + this.searchCondition + ", fields=" + this.fields + ", fieldTypeToScroll=" + this.fieldTypeToScroll + ", countryDictionaryList=" + this.countryDictionaryList + ')';
    }

    public /* synthetic */ State(f02.a aVar, m02.b bVar, m02.a aVar2, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? f02.a.b.C1291b.f54578a : aVar, bVar, (i15 & 4) != 0 ? null : aVar2, (i15 & 8) != 0 ? pq.v.e(CountryDictionary.INSTANCE.a()) : list);
    }
}
