package re1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ld1.SearchModel;
import ld1.TaxOfficeModel;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import qe1.State;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\u00020\n*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\b\u0012\u0004\u0012\u00020\r0\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lre1/d;", "Lxw/f;", "Lre1/d$a;", "Lqe1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lqe1/b;", "Lkotlin/Function1;", "Lld1/m;", "Loq/i0;", "onOfficeFieldClicked", "Lld1/r;", "onOfficeSelected", "Lj40/a;", "l", "(Lqe1/b;Ler/l;Ler/l;)Lj40/a;", "officeSelected", "u", "(Lqe1/b;Lld1/r;Ler/l;)Lld1/m;", "", "Lld1/m$a;", "r", "(Ljava/util/List;Lld1/r;Ler/l;)Ljava/util/List;", "officeModel", "", "index", "Lmx/a;", "h", "(Lld1/r;I)Lmx/a;", "params", "i", "(Lre1/d$a;)Lqe1/c$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, qe1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: re1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b\"\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001a\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u001e\u0010%¨\u0006&"}, d2 = {"Lre1/d$a;", "", "Lqe1/b;", "state", "Lkotlin/Function1;", "Lld1/m;", "Loq/i0;", "onOfficeFieldClicked", "Lld1/r;", "onOfficeSelected", "Lkotlin/Function0;", "nextAction", "backAction", "closeAction", "<init>", "(Lqe1/b;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqe1/b;", "f", "()Lqe1/b;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<SearchModel, i0> onOfficeFieldClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<TaxOfficeModel, i0> onOfficeSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super SearchModel, i0> lVar, l<? super TaxOfficeModel, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onOfficeFieldClicked = lVar;
            this.onOfficeSelected = lVar2;
            this.nextAction = aVar;
            this.backAction = aVar2;
            this.closeAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final l<SearchModel, i0> d() {
            return this.onOfficeFieldClicked;
        }

        public final l<TaxOfficeModel, i0> e() {
            return this.onOfficeSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onOfficeFieldClicked, params.onOfficeFieldClicked) && t.c(this.onOfficeSelected, params.onOfficeSelected) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onOfficeFieldClicked.hashCode()) * 31) + this.onOfficeSelected.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onOfficeFieldClicked=" + this.onOfficeFieldClicked + ", onOfficeSelected=" + this.onOfficeSelected + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f173460a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-913433486);
            if (p076m2.t.k()) {
                p076m2.t.o(-913433486, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.taxofficeselection.mapper.TaxOfficeSelectionMapper.invoke.<anonymous> (TaxOfficeSelectionMapper.kt:49)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((SearchModel.a) t16).getIsSelected()), Boolean.valueOf(((SearchModel.a) t15).getIsSelected()));
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label h(TaxOfficeModel officeModel, int index) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(officeModel.getStreetName() + ' ' + officeModel.getBuildingNumber());
        sb5.append("\n");
        sb5.append(officeModel.getPostalCode() + ' ' + officeModel.getCity());
        return mx.b.b(sb5.toString(), "addressTaxOfficeNo" + index);
    }

    private final DropDownButtonData l(final State state, final l<? super SearchModel, i0> lVar, final l<? super TaxOfficeModel, i0> lVar2) {
        Label labelC = this.labelProvider.c(ha1.a.R3);
        Label labelC2 = this.labelProvider.c(ha1.a.Q3);
        m error = state.getIsDataLoaded() ? !state.getIsValid() ? new m.Error(this.labelProvider.c(ha1.a.f82418i)) : new m.Enabled(null, 1, null) : new m.Disabled(null, 1, null);
        List<TaxOfficeModel> listD = state.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(mx.b.b(((TaxOfficeModel) obj).getName(), "taxOfficeNo" + i15));
            i15 = i16;
        }
        TaxOfficeModel selectedTaxOffice = state.getSelectedTaxOffice();
        return new DropDownButtonData(labelC, arrayList, state.getIsDataLoaded() ? selectedTaxOffice != null ? Integer.valueOf(state.d().indexOf(selectedTaxOffice)) : null : null, error, labelC2, false, null, new l() { // from class: re1.c
            @Override // er.l
            public final Object b(Object obj2) {
                return d.m(lVar, this, state, lVar2, (DropDownButtonData) obj2);
            }
        }, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, d dVar, State state, final l lVar2, DropDownButtonData dropDownButtonData) {
        lVar.b(dVar.u(state, state.getSelectedTaxOffice(), new l() { // from class: re1.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.q(lVar2, (TaxOfficeModel) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, TaxOfficeModel taxOfficeModel) {
        lVar.b(taxOfficeModel);
        return i0.f148189a;
    }

    private final List<SearchModel.a> r(List<TaxOfficeModel> list, TaxOfficeModel taxOfficeModel, final l<? super TaxOfficeModel, i0> lVar) {
        List<TaxOfficeModel> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final TaxOfficeModel taxOfficeModel2 = (TaxOfficeModel) obj;
            arrayList.add(new SearchModel.a(mx.b.b(taxOfficeModel2.getName(), "taxOfficeNo" + i15), h(taxOfficeModel2, i15), t.c(taxOfficeModel != null ? taxOfficeModel.getName() : null, taxOfficeModel2.getName()), new er.a() { // from class: re1.b
                @Override // er.a
                public final Object a() {
                    return d.s(lVar, taxOfficeModel2);
                }
            }));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar, TaxOfficeModel taxOfficeModel) {
        lVar.b(taxOfficeModel);
        return i0.f148189a;
    }

    private final SearchModel u(State state, TaxOfficeModel taxOfficeModel, l<? super TaxOfficeModel, i0> lVar) {
        return new SearchModel(this.labelProvider.c(ha1.a.Q3), this.labelProvider.c(ha1.a.f82363b0), v.U0(r(state.d(), taxOfficeModel, lVar), new c()));
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public qe1.c.a b(Params params) {
        return new qe1.c.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f173460a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(ha1.a.X2), this.labelProvider.c(ha1.a.W2), l(params.getState(), params.d(), params.e()), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
