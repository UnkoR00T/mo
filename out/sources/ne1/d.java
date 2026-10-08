package ne1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ld1.KrusOfficeModel;
import ld1.SearchModel;
import me1.j;
import me1.k;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0012\u001a\u00020\u0011*\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u00020\f*\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u000f0\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lne1/d;", "Lxw/f;", "Lne1/d$a;", "Lme1/k$a;", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "<init>", "(Lmx/c;Lia1/a;)V", "Lme1/j$b$b;", "Lkotlin/Function1;", "Lld1/m;", "Loq/i0;", "onOfficeFieldClicked", "Lld1/i;", "onOfficeSelected", "Lj40/a;", "l", "(Lme1/j$b$b;Ler/l;Ler/l;)Lj40/a;", "officeSelected", "u", "(Lme1/j$b$b;Lld1/i;Ler/l;)Lld1/m;", "", "Lld1/m$a;", "r", "(Ljava/util/List;Lld1/i;Ler/l;)Ljava/util/List;", "officeModel", "", "index", "Lmx/a;", "h", "(Lld1/i;I)Lmx/a;", "params", "i", "(Lne1/d$a;)Lme1/k$a;", "a", "Lmx/c;", "b", "Lia1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: ne1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u001c\u0010(R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b \u0010(R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b$\u0010(¨\u0006*"}, d2 = {"Lne1/d$a;", "", "Lme1/j;", "state", "Lkotlin/Function1;", "Lld1/m;", "Loq/i0;", "onOfficeFieldAction", "Lld1/i;", "onOfficeSelected", "Lkotlin/Function0;", "onMoreInfoAction", "nextAction", "", "onUrlAction", "onBackAction", "onCloseAction", "<init>", "(Lme1/j;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme1/j;", "h", "()Lme1/j;", "b", "Ler/l;", "e", "()Ler/l;", "c", "f", "d", "Ler/a;", "()Ler/a;", "g", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<SearchModel, i0> onOfficeFieldAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<KrusOfficeModel, i0> onOfficeSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreInfoAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j jVar, l<? super SearchModel, i0> lVar, l<? super KrusOfficeModel, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar3, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = jVar;
            this.onOfficeFieldAction = lVar;
            this.onOfficeSelected = lVar2;
            this.onMoreInfoAction = aVar;
            this.nextAction = aVar2;
            this.onUrlAction = lVar3;
            this.onBackAction = aVar3;
            this.onCloseAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.nextAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        public final er.a<i0> d() {
            return this.onMoreInfoAction;
        }

        public final l<SearchModel, i0> e() {
            return this.onOfficeFieldAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onOfficeFieldAction, params.onOfficeFieldAction) && t.c(this.onOfficeSelected, params.onOfficeSelected) && t.c(this.onMoreInfoAction, params.onMoreInfoAction) && t.c(this.nextAction, params.nextAction) && t.c(this.onUrlAction, params.onUrlAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final l<KrusOfficeModel, i0> f() {
            return this.onOfficeSelected;
        }

        public final l<String, i0> g() {
            return this.onUrlAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final j getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onOfficeFieldAction.hashCode()) * 31) + this.onOfficeSelected.hashCode()) * 31) + this.onMoreInfoAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.onUrlAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onOfficeFieldAction=" + this.onOfficeFieldAction + ", onOfficeSelected=" + this.onOfficeSelected + ", onMoreInfoAction=" + this.onMoreInfoAction + ", nextAction=" + this.nextAction + ", onUrlAction=" + this.onUrlAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f135098a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-551935900);
            if (p076m2.t.k()) {
                p076m2.t.o(-551935900, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.krusofficeselection.mapper.KrusOfficeSelectionMapper.invoke.<anonymous> (KrusOfficeSelectionMapper.kt:59)");
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

    public d(mx.c cVar, ia1.a aVar) {
        this.labelProvider = cVar;
        this.companyEndpoints = aVar;
    }

    private final Label h(KrusOfficeModel officeModel, int index) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(officeModel.getStreetName() + ' ' + officeModel.getBuildingNumber());
        sb5.append("\n");
        sb5.append(officeModel.getPostalCode() + ' ' + officeModel.getCity());
        return mx.b.b(sb5.toString(), "addressKrusOfficeSelectionNo" + index);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    private final DropDownButtonData l(final j.b.Initialized initialized, final l<? super SearchModel, i0> lVar, final l<? super KrusOfficeModel, i0> lVar2) {
        Integer numValueOf;
        Label labelC = this.labelProvider.c(ha1.a.K2);
        Label labelC2 = this.labelProvider.c(ha1.a.J2);
        m error = initialized.getFormData().getIsDataLoaded() ? !initialized.getFormData().getIsValid() ? new m.Error(this.labelProvider.c(ha1.a.f82418i)) : new m.Enabled(null, 1, null) : new m.Disabled(null, 1, null);
        List<KrusOfficeModel> listC = initialized.getFormData().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(mx.b.b(((KrusOfficeModel) obj).getName(), "krusOfficeSelectionNo" + i15));
            i15 = i16;
        }
        KrusOfficeModel selectedKrusOfficeSelection = initialized.getFormData().getSelectedKrusOfficeSelection();
        if (selectedKrusOfficeSelection != null) {
            numValueOf = Integer.valueOf(initialized.getFormData().c().indexOf(selectedKrusOfficeSelection));
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        return new DropDownButtonData(labelC, arrayList, initialized.getFormData().getIsDataLoaded() ? numValueOf : null, error, labelC2, false, null, new l() { // from class: ne1.c
            @Override // er.l
            public final Object b(Object obj2) {
                return d.m(lVar, this, initialized, lVar2, (DropDownButtonData) obj2);
            }
        }, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, d dVar, j.b.Initialized initialized, final l lVar2, DropDownButtonData dropDownButtonData) {
        lVar.b(dVar.u(initialized, initialized.getFormData().getSelectedKrusOfficeSelection(), new l() { // from class: ne1.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.q(lVar2, (KrusOfficeModel) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, KrusOfficeModel krusOfficeModel) {
        lVar.b(krusOfficeModel);
        return i0.f148189a;
    }

    private final List<SearchModel.a> r(List<KrusOfficeModel> list, KrusOfficeModel krusOfficeModel, final l<? super KrusOfficeModel, i0> lVar) {
        List<KrusOfficeModel> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final KrusOfficeModel krusOfficeModel2 = (KrusOfficeModel) obj;
            arrayList.add(new SearchModel.a(mx.b.b(krusOfficeModel2.getDescription(), "krusOfficeSelectionNo" + i15), h(krusOfficeModel2, i15), t.c(krusOfficeModel != null ? krusOfficeModel.getName() : null, krusOfficeModel2.getName()), new er.a() { // from class: ne1.b
                @Override // er.a
                public final Object a() {
                    return d.s(lVar, krusOfficeModel2);
                }
            }));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar, KrusOfficeModel krusOfficeModel) {
        lVar.b(krusOfficeModel);
        return i0.f148189a;
    }

    private final SearchModel u(j.b.Initialized initialized, KrusOfficeModel krusOfficeModel, l<? super KrusOfficeModel, i0> lVar) {
        return new SearchModel(this.labelProvider.c(ha1.a.J2), this.labelProvider.c(ha1.a.f82363b0), v.U0(r(initialized.getFormData().c(), krusOfficeModel, lVar), new c()));
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k.a b(Params params) {
        j state = params.getState();
        if (state instanceof j.b.Initialized) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f135098a, null, params.c(), 4, null)), null, 20, null), null, null, null, null, 61, null);
            Label labelC = this.labelProvider.c(ha1.a.V2);
            Label labelC2 = this.labelProvider.c(ha1.a.I2);
            DropDownButtonData dropDownButtonDataL = l((j.b.Initialized) params.getState(), params.e(), params.f());
            return new k.a.Initialized(baseScaffoldData, labelC, labelC2, new ButtonTextData(null, this.labelProvider.c(ha1.a.U2), null, null, params.d(), 13, null), dropDownButtonDataL, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null));
        }
        if (!(state instanceof j.b.InfoPage)) {
            if (t.c(state, j.c.f126001a)) {
                return k.a.b.f126011a;
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(ha1.a.T2), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC3 = this.labelProvider.c(ha1.a.Q2);
        Label labelC4 = this.labelProvider.c(ha1.a.R2);
        Label labelC5 = this.labelProvider.c(ha1.a.S2);
        InfoRowListData infoRowListData = new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.L2)), new t40.a.C4874a(this.labelProvider.c(ha1.a.M2)), new t40.a.C4874a(this.labelProvider.c(ha1.a.N2)), new t40.a.C4874a(this.labelProvider.c(ha1.a.O2)), new t40.a.C4874a(this.labelProvider.c(ha1.a.P2))));
        Label labelC6 = this.labelProvider.c(ha1.a.D);
        l<String, i0> lVarG = params.g();
        String strT = this.companyEndpoints.t();
        LinkData.EnumC5775a enumC5775a = LinkData.EnumC5775a.WEBSITE;
        return new k.a.InfoPage(baseScaffoldData2, infoRowListData, labelC3, labelC4, labelC5, new LinkData(null, labelC6, strT, enumC5775a, false, lVarG, 17, null), new LinkData(null, this.labelProvider.c(ha1.a.J4), this.companyEndpoints.w(), enumC5775a, false, params.g(), 17, null), params.b());
    }
}
