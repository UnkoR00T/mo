package c22;

import d12.SearchQueryParameter;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc22/a;", "Lxw/f;", "Lc22/a$a;", "Lb22/c$a;", "Lmx/c;", "labelProvider", "Lc22/d;", "searchRequestParamsMapper", "<init>", "(Lmx/c;Lc22/d;)V", "Lmx/a;", "e", "(Lc22/a$a;)Lmx/a;", "params", "c", "(Lc22/a$a;)Lb22/c$a;", "a", "Lmx/c;", "b", "Lc22/d;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, b22.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d searchRequestParamsMapper;

    /* JADX INFO: renamed from: c22.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lc22/a$a;", "", "Lb22/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "goToQueryDetails", "back", "<init>", "(Lb22/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb22/b;", "c", "()Lb22/b;", "b", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b22.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToQueryDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> back;

        public Params(b22.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.goToQueryDetails = aVar;
            this.back = aVar2;
        }

        public final er.a<i0> a() {
            return this.back;
        }

        public final er.a<i0> b() {
            return this.goToQueryDetails;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b22.b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.goToQueryDetails, params.goToQueryDetails) && t.c(this.back, params.back);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.goToQueryDetails.hashCode()) * 31) + this.back.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", goToQueryDetails=" + this.goToQueryDetails + ", back=" + this.back + ')';
        }
    }

    public a(mx.c cVar, d dVar) {
        this.labelProvider = cVar;
        this.searchRequestParamsMapper = dVar;
    }

    private final Label e(Params params) {
        List<SearchQueryParameter> listB = this.searchRequestParamsMapper.b(new d.Params(params.getState().getSearchRequest()));
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        for (SearchQueryParameter searchQueryParameter : listB) {
            arrayList.add(searchQueryParameter.getKey() + ": " + searchQueryParameter.getValue());
        }
        return mx.b.b(v.v0(arrayList, null, null, null, 0, null, null, 63, null), "parametersLabel");
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b22.c.a b(Params params) {
        b22.b state = params.getState();
        if (!(state instanceof b22.b.Initialized)) {
            if (state instanceof b22.b.Error) {
                return new b22.c.a.Error(((b22.b.Error) params.getState()).getErrorVMS());
            }
            throw new p();
        }
        return new b22.c.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.f46600r1), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(e02.a.f46618u1), e(params), new ButtonTextData(null, this.labelProvider.c(e02.a.W), null, null, params.b(), 13, null));
    }
}
