package mf1;

import er.l;
import fr.t;
import h30.ButtonData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kf1.State;
import ld1.SearchModel;
import ld1.TaxOfficeModel;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\u00020\n*\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\b\u0012\u0004\u0012\u00020\r0\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lmf1/d;", "Lxw/f;", "Lmf1/d$a;", "Lkf1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lkf1/b;", "Lkotlin/Function1;", "Lld1/m;", "Loq/i0;", "onOfficeFieldClicked", "Lld1/r;", "onOfficeSelected", "Lj40/a;", "l", "(Lkf1/b;Ler/l;Ler/l;)Lj40/a;", "officeSelected", "u", "(Lkf1/b;Lld1/r;Ler/l;)Lld1/m;", "", "Lld1/m$a;", "r", "(Ljava/util/List;Lld1/r;Ler/l;)Ljava/util/List;", "officeModel", "", "index", "Lmx/a;", "h", "(Lld1/r;I)Lmx/a;", "params", "i", "(Lmf1/d$a;)Lkf1/c$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, kf1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: mf1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u0010!¨\u0006\""}, d2 = {"Lmf1/d$a;", "", "Lkf1/b;", "state", "Lkotlin/Function1;", "Lld1/m;", "Loq/i0;", "onOfficeFieldClicked", "Lld1/r;", "onOfficeSelected", "Lkotlin/Function0;", "nextAction", "<init>", "(Lkf1/b;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkf1/b;", "d", "()Lkf1/b;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<SearchModel, i0> onOfficeFieldClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<TaxOfficeModel, i0> onOfficeSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super SearchModel, i0> lVar, l<? super TaxOfficeModel, i0> lVar2, er.a<i0> aVar) {
            this.state = state;
            this.onOfficeFieldClicked = lVar;
            this.onOfficeSelected = lVar2;
            this.nextAction = aVar;
        }

        public final er.a<i0> a() {
            return this.nextAction;
        }

        public final l<SearchModel, i0> b() {
            return this.onOfficeFieldClicked;
        }

        public final l<TaxOfficeModel, i0> c() {
            return this.onOfficeSelected;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onOfficeFieldClicked, params.onOfficeFieldClicked) && t.c(this.onOfficeSelected, params.onOfficeSelected) && t.c(this.nextAction, params.nextAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onOfficeFieldClicked.hashCode()) * 31) + this.onOfficeSelected.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onOfficeFieldClicked=" + this.onOfficeFieldClicked + ", onOfficeSelected=" + this.onOfficeSelected + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
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
        return new DropDownButtonData(labelC, arrayList, state.getIsDataLoaded() ? selectedTaxOffice != null ? Integer.valueOf(state.d().indexOf(selectedTaxOffice)) : null : null, error, labelC2, false, null, new l() { // from class: mf1.c
            @Override // er.l
            public final Object b(Object obj2) {
                return d.m(lVar, this, state, lVar2, (DropDownButtonData) obj2);
            }
        }, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, d dVar, State state, final l lVar2, DropDownButtonData dropDownButtonData) {
        lVar.b(dVar.u(state, state.getSelectedTaxOffice(), new l() { // from class: mf1.a
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
            arrayList.add(new SearchModel.a(mx.b.b(taxOfficeModel2.getName(), "taxOfficeNo" + i15), h(taxOfficeModel2, i15), t.c(taxOfficeModel != null ? taxOfficeModel.getName() : null, taxOfficeModel2.getName()), new er.a() { // from class: mf1.b
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
        return new SearchModel(this.labelProvider.c(ha1.a.Q3), this.labelProvider.c(ha1.a.f82363b0), v.U0(r(state.d(), taxOfficeModel, lVar), new b()));
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public kf1.c.a b(Params params) {
        return new kf1.c.a.Initialized(this.labelProvider.c(ha1.a.T3), this.labelProvider.c(ha1.a.S3), l(params.getState(), params.b(), params.c()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null));
    }
}
