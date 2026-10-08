package vd1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k30.d;
import ld1.SearchModel;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pd1.NonPublicSupplier;
import pq.v;
import ud1.DropDown;
import ud1.TextInput;
import ud1.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u000f*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012*\b\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvd1/c;", "Lxw/f;", "Lvd1/c$a;", "Lud1/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lud1/c;", "Lkotlin/Function1;", "Lpd1/a;", "Loq/i0;", "onChanged", "Lld1/m;", "onSearch", "Lj40/a;", "h", "(Lud1/c;Ler/l;Ler/l;)Lj40/a;", "", "selected", "onClick", "Lld1/m$a;", "l", "(Ljava/util/List;Lpd1/a;Ler/l;)Ljava/util/List;", "params", "f", "(Lvd1/c$a;)Lud1/f$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, ud1.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vd1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b#\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006("}, d2 = {"Lvd1/c$a;", "", "Lud1/e;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onAddressChanged", "Lpd1/a;", "onProviderChanged", "Lld1/m;", "onSearch", "Lkotlin/Function0;", "nextAction", "backAction", "closeAction", "<init>", "(Lud1/e;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lud1/e;", "g", "()Lud1/e;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "f", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onAddressChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<NonPublicSupplier, i0> onProviderChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<SearchModel, i0> onSearch;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, l<? super String, i0> lVar, l<? super NonPublicSupplier, i0> lVar2, l<? super SearchModel, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = eVar;
            this.onAddressChanged = lVar;
            this.onProviderChanged = lVar2;
            this.onSearch = lVar3;
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

        public final l<String, i0> d() {
            return this.onAddressChanged;
        }

        public final l<NonPublicSupplier, i0> e() {
            return this.onProviderChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onAddressChanged, params.onAddressChanged) && t.c(this.onProviderChanged, params.onProviderChanged) && t.c(this.onSearch, params.onSearch) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        public final l<SearchModel, i0> f() {
            return this.onSearch;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final e getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onAddressChanged.hashCode()) * 31) + this.onProviderChanged.hashCode()) * 31) + this.onSearch.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAddressChanged=" + this.onAddressChanged + ", onProviderChanged=" + this.onProviderChanged + ", onSearch=" + this.onSearch + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
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

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DropDownButtonData h(final DropDown dropDown, final l<? super NonPublicSupplier, i0> lVar, final l<? super SearchModel, i0> lVar2) {
        Label labelC = this.labelProvider.c(ha1.a.f82452m1);
        Label labelC2 = this.labelProvider.c(ha1.a.f82410h);
        Integer num = null;
        m disabled = dropDown.c().isEmpty() ? new m.Disabled(null, 1, null) : dropDown.getValidationState() instanceof hz.b.Invalid ? new m.Error(this.labelProvider.c(ha1.a.f82418i)) : new m.Enabled(null, 1, null);
        List<NonPublicSupplier> listC = dropDown.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(mx.b.b(((NonPublicSupplier) obj).getName(), "provider" + i15));
            i15 = i16;
        }
        NonPublicSupplier value = dropDown.getValue();
        if (value != null) {
            Integer numValueOf = Integer.valueOf(dropDown.c().indexOf(value));
            if (numValueOf.intValue() >= 0) {
                num = numValueOf;
            }
        }
        return new DropDownButtonData(labelC, arrayList, num, disabled, labelC2, false, null, new l() { // from class: vd1.b
            @Override // er.l
            public final Object b(Object obj2) {
                return c.i(lVar2, this, dropDown, lVar, (DropDownButtonData) obj2);
            }
        }, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, c cVar, DropDown dropDown, l lVar2, DropDownButtonData dropDownButtonData) {
        lVar.b(new SearchModel(null, cVar.labelProvider.c(ha1.a.f82363b0), v.U0(cVar.l(dropDown.c(), dropDown.getValue(), lVar2), new b()), 1, null));
        return i0.f148189a;
    }

    private final List<SearchModel.a> l(List<NonPublicSupplier> list, NonPublicSupplier nonPublicSupplier, final l<? super NonPublicSupplier, i0> lVar) {
        List<NonPublicSupplier> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final NonPublicSupplier nonPublicSupplier2 = (NonPublicSupplier) obj;
            arrayList.add(new SearchModel.a(mx.b.b(nonPublicSupplier2.getName(), "provider" + i15), null, t.c(nonPublicSupplier != null ? nonPublicSupplier.getName() : null, nonPublicSupplier2.getName()), new er.a() { // from class: vd1.a
                @Override // er.a
                public final Object a() {
                    return c.m(lVar, nonPublicSupplier2);
                }
            }));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, NonPublicSupplier nonPublicSupplier) {
        lVar.b(nonPublicSupplier);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ud1.f.a b(Params params) {
        e state = params.getState();
        if (!(state instanceof e.FormDisplayed)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.f82467o1);
        Label labelC2 = this.labelProvider.c(ha1.a.f82460n1);
        er.a<i0> aVarA = params.a();
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), d.a.f107773a, null, params.c(), 35, null);
        ud1.a aVar = ud1.a.ADDRESS;
        Label labelC3 = this.labelProvider.c(ha1.a.f82428j1);
        int iD = v4.t.INSTANCE.d();
        e.FormDisplayed formDisplayed = (e.FormDisplayed) state;
        return new ud1.f.a.DataDisplayed(baseScaffoldData, labelC, labelC2, new TextInput(aVar, new v50.c.Text(null, labelC3, this.labelProvider.c(ha1.a.f82420i1), mx.b.b(formDisplayed.getAddress().getValue(), "address"), formDisplayed.getAddress().getValidationState(), null, null, params.d(), null, false, iD, null, false, null, false, null, null, null, null, null, 1047393, null)), new ud1.DropDown(ud1.a.PROVIDER, h(formDisplayed.getProvider(), params.e(), params.f())), buttonData, aVarA);
    }
}
