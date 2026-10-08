package cu3;

import androidx.compose.ui.graphics.Color;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import tt3.AddressSearchItemData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcu3/h;", "Lxw/f;", "Lcu3/h$a;", "Lcu3/f$a;", "<init>", "()V", "", "Ltt3/e;", "items", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "Ln30/b;", "f", "(Ljava/util/List;Ler/a;)Ln30/b;", "params", "e", "(Lcu3/h$a;)Lcu3/f$a;", "a", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, f.Data> {

    /* JADX INFO: renamed from: cu3.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcu3/h$a;", "", "Lcu3/e;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onQueryChanged", "", "onActiveChanged", "Lkotlin/Function0;", "onClearClicked", "onCloseClick", "<init>", "(Lcu3/e;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcu3/e;", "e", "()Lcu3/e;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onQueryChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onActiveChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onQueryChanged = lVar;
            this.onActiveChanged = lVar2;
            this.onClearClicked = aVar;
            this.onCloseClick = aVar2;
        }

        public final er.l<Boolean, i0> a() {
            return this.onActiveChanged;
        }

        public final er.a<i0> b() {
            return this.onClearClicked;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        public final er.l<String, i0> d() {
            return this.onQueryChanged;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onQueryChanged, params.onQueryChanged) && fr.t.c(this.onActiveChanged, params.onActiveChanged) && fr.t.c(this.onClearClicked, params.onClearClicked) && fr.t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onQueryChanged.hashCode()) * 31) + this.onActiveChanged.hashCode()) * 31) + this.onClearClicked.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onQueryChanged=" + this.onQueryChanged + ", onActiveChanged=" + this.onActiveChanged + ", onClearClicked=" + this.onClearClicked + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f38060a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(2044413618);
            if (p076m2.t.k()) {
                p076m2.t.o(2044413618, i15, -1, "pl.gov.coi.mobywatel.segment.addressform.presentation.search.AddressSearchMapper.mapToCardListData.<anonymous>.<anonymous>.<anonymous> (AddressSearchMapper.kt:76)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    private final CardListData f(List<AddressSearchItemData> items, final er.a<i0> onCloseClick) {
        List<AddressSearchItemData> list = items;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        for (final AddressSearchItemData addressSearchItemData : list) {
            x0.Icon icon = null;
            n50.b.Title title = new n50.b.Title(n50.l.b(addressSearchItemData.getLabel(), null, null, 3, null));
            Label description = addressSearchItemData.getDescription();
            BodySection bodySection = new BodySection(null, title, description != null ? n50.l.b(description, null, null, 3, null) : null, 1, null);
            if ((addressSearchItemData.getIsSelected() ? addressSearchItemData : null) != null) {
                icon = new x0.Icon(jz.a.f106783h, c70.a.f23835a.a().B(), b.f38060a);
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: cu3.g
                @Override // er.a
                public final Object a() {
                    return h.h(onCloseClick, addressSearchItemData);
                }
            }, false, null, null, false, null, null, bodySection, null, icon, null, 2813, null));
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(er.a aVar, AddressSearchItemData addressSearchItemData) {
        aVar.a();
        addressSearchItemData.c().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f.Data b(Params params) {
        x50.i.Small small;
        State state = params.getState();
        if (state.getIsActive()) {
            state = null;
        }
        if (state != null) {
            small = new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), params.getState().getAddressSearchData().getTitleLabel(), null, null, null, 28, null);
        } else {
            small = null;
        }
        return new f.Data(new BaseScaffoldData(null, small, null, null, null, null, 61, null), new SearchBarData(params.getState().getQuery(), params.d(), params.getState().getIsActive(), params.a(), params.b(), params.getState().getAddressSearchData().getPlaceholderLabel(), null, Integer.valueOf(params.getState().e().size()), 64, null), f(params.getState().e(), params.c()), i.b(params.getState().getAddressSearchData().getAddressNoSearchResultsData()), params.c());
    }
}
