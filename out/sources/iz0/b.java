package iz0;

import er.l;
import fr.t;
import fu.r;
import hz0.State;
import hz0.d;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kh0.BEBasicMeasurementPoint;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0015*\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Liz0/b;", "Lxw/f;", "Liz0/b$a;", "Lhz0/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ln30/b;", "filteredCardsList", "Lj50/e;", "i", "(Liz0/b$a;Ln30/b;)Lj50/e;", "", "Lkh0/c;", "Lkotlin/Function1;", "Loq/i0;", "onClick", "Ln50/g;", "q", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "", "query", "e", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "m", "f", "(Lkh0/c;)Ljava/lang/String;", "h", "params", "l", "(Liz0/b$a;)Lhz0/d$a;", "a", "Lmx/c;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: iz0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001a\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\"\u0010!R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006'"}, d2 = {"Liz0/b$a;", "", "Lhz0/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function1;", "", "queryChangeAction", "", "activeChangeAction", "clearAction", "Lkh0/c;", "itemClickAction", "backAction", "<init>", "(Lhz0/c;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhz0/c;", "g", "()Lhz0/c;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "f", "()Ler/l;", "e", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> queryChangeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> activeChangeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> clearAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEBasicMeasurementPoint, i0> itemClickAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar2, l<? super BEBasicMeasurementPoint, i0> lVar3, er.a<i0> aVar3) {
            this.state = state;
            this.closeAction = aVar;
            this.queryChangeAction = lVar;
            this.activeChangeAction = lVar2;
            this.clearAction = aVar2;
            this.itemClickAction = lVar3;
            this.backAction = aVar3;
        }

        public final l<Boolean, i0> a() {
            return this.activeChangeAction;
        }

        public final er.a<i0> b() {
            return this.backAction;
        }

        public final er.a<i0> c() {
            return this.clearAction;
        }

        public final er.a<i0> d() {
            return this.closeAction;
        }

        public final l<BEBasicMeasurementPoint, i0> e() {
            return this.itemClickAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.closeAction, params.closeAction) && t.c(this.queryChangeAction, params.queryChangeAction) && t.c(this.activeChangeAction, params.activeChangeAction) && t.c(this.clearAction, params.clearAction) && t.c(this.itemClickAction, params.itemClickAction) && t.c(this.backAction, params.backAction);
        }

        public final l<String, i0> f() {
            return this.queryChangeAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.queryChangeAction.hashCode()) * 31) + this.activeChangeAction.hashCode()) * 31) + this.clearAction.hashCode()) * 31) + this.itemClickAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", queryChangeAction=" + this.queryChangeAction + ", activeChangeAction=" + this.activeChangeAction + ", clearAction=" + this.clearAction + ", itemClickAction=" + this.itemClickAction + ", backAction=" + this.backAction + ')';
        }
    }

    /* JADX INFO: renamed from: iz0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C2300b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98062a;

        public C2300b(String str) {
            this.f98062a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(r.T(((BEBasicMeasurementPoint) t16).getPlace().getCity(), this.f98062a, true)), Boolean.valueOf(r.T(((BEBasicMeasurementPoint) t15).getPlace().getCity(), this.f98062a, true)));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            kh0.l quality = ((BEBasicMeasurementPoint) t16).getQuality();
            kh0.l lVar = kh0.l.UNKNOWN;
            return sq.a.e(Boolean.valueOf(quality != lVar), Boolean.valueOf(((BEBasicMeasurementPoint) t15).getQuality() != lVar));
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<BEBasicMeasurementPoint> e(List<BEBasicMeasurementPoint> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BEBasicMeasurementPoint bEBasicMeasurementPoint = (BEBasicMeasurementPoint) obj;
            if (r.b0(h(bEBasicMeasurementPoint) + "" + f(bEBasicMeasurementPoint), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final String f(BEBasicMeasurementPoint bEBasicMeasurementPoint) {
        StringBuilder sb5 = new StringBuilder();
        String street = bEBasicMeasurementPoint.getPlace().getStreet();
        if (street != null && !r.t0(street)) {
            sb5.append(bEBasicMeasurementPoint.getPlace().getStreet());
            sb5.append(", ");
        }
        sb5.append(bEBasicMeasurementPoint.getPlace().getPostcode());
        sb5.append(" ");
        sb5.append(bEBasicMeasurementPoint.getPlace().getCity());
        return sb5.toString().toUpperCase(Locale.ROOT);
    }

    private final String h(BEBasicMeasurementPoint bEBasicMeasurementPoint) {
        return bEBasicMeasurementPoint.getPlace().getCity().toUpperCase(Locale.ROOT);
    }

    private final SearchBarData i(Params params, CardListData cardListData) {
        String query = params.getState().getQuery();
        boolean isActive = params.getState().getIsActive();
        Label labelC = this.labelProvider.c(zx0.b.Y);
        return new SearchBarData(query, params.f(), isActive, params.a(), params.c(), labelC, null, Integer.valueOf(cardListData.d().size()), 64, null);
    }

    private final List<BEBasicMeasurementPoint> m(List<BEBasicMeasurementPoint> list, String str) {
        return v.U0(v.U0(list, new C2300b(str)), new c());
    }

    private final List<DefaultSingleCardData> q(List<BEBasicMeasurementPoint> list, final l<? super BEBasicMeasurementPoint, i0> lVar) {
        List<BEBasicMeasurementPoint> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final BEBasicMeasurementPoint bEBasicMeasurementPoint = (BEBasicMeasurementPoint) obj;
            py0.a aVarA = oy0.a.a(bEBasicMeasurementPoint.getQuality());
            Label labelB = mx.b.b(f(bEBasicMeasurementPoint), "address: " + i15);
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: iz0.a
                @Override // er.a
                public final Object a() {
                    return b.r(lVar, bEBasicMeasurementPoint);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(h(bEBasicMeasurementPoint), "city: " + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(labelB, null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new i.Icon(aVarA.getIconResId(), null, aVarA.e(), null, null, 26, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, BEBasicMeasurementPoint bEBasicMeasurementPoint) {
        lVar.b(bEBasicMeasurementPoint);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        BaseScaffoldData baseScaffoldData;
        CardListData cardListData = new CardListData(q(e(m(params.getState().c(), params.getState().getQuery()), params.getState().getQuery()), params.e()), null, false, null, null, 30, null);
        if (params.getState().getIsActive()) {
            baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
        } else {
            baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.d()), this.labelProvider.c(zx0.b.K), null, null, null, 28, null), null, null, null, null, 61, null);
        }
        return new d.Data(baseScaffoldData, params.b(), i(params, cardListData), cardListData, this.labelProvider.c(zx0.b.J));
    }
}
