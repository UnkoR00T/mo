package qx2;

import al0.ApplicationReason;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import tt3.AddressNoSearchResultsData;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\t0\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lqx2/d;", "Lxw/f;", "Lqx2/d$a;", "Lox2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lox2/b$b;", "Lal0/h;", "selectedReason", "Lkotlin/Function1;", "Loq/i0;", "onReasonSelected", "Ltt3/b;", "r", "(Lox2/b$b;Lal0/h;Ler/l;)Ltt3/b;", "", "Ltt3/e;", "m", "(Ljava/util/List;Lal0/h;Ler/l;)Ljava/util/List;", "", "onUrlClicked", "Lc30/b$e;", "s", "(Lal0/h;Ler/l;)Lc30/b$e;", "params", "h", "(Lqx2/d$a;)Lox2/c$a;", "a", "Lmx/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, ox2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: qx2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b$\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010)R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b \u0010)¨\u0006*"}, d2 = {"Lqx2/d$a;", "", "Lox2/b;", "state", "Lkotlin/Function1;", "Ltt3/b;", "Loq/i0;", "onReasonFieldClicked", "Lal0/h;", "onReasonSelected", "", "onUrlClicked", "Lkotlin/Function0;", "onScrolledToDropdownField", "onNextButtonClicked", "onBack", "onClose", "<init>", "(Lox2/b;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lox2/b;", "h", "()Lox2/b;", "b", "Ler/l;", "d", "()Ler/l;", "c", "e", "g", "Ler/a;", "f", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ox2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AddressSearchData, i0> onReasonFieldClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ApplicationReason, i0> onReasonSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToDropdownField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClicked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ox2.b bVar, l<? super AddressSearchData, i0> lVar, l<? super ApplicationReason, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onReasonFieldClicked = lVar;
            this.onReasonSelected = lVar2;
            this.onUrlClicked = lVar3;
            this.onScrolledToDropdownField = aVar;
            this.onNextButtonClicked = aVar2;
            this.onBack = aVar3;
            this.onClose = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onNextButtonClicked;
        }

        public final l<AddressSearchData, i0> d() {
            return this.onReasonFieldClicked;
        }

        public final l<ApplicationReason, i0> e() {
            return this.onReasonSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onReasonFieldClicked, params.onReasonFieldClicked) && t.c(this.onReasonSelected, params.onReasonSelected) && t.c(this.onUrlClicked, params.onUrlClicked) && t.c(this.onScrolledToDropdownField, params.onScrolledToDropdownField) && t.c(this.onNextButtonClicked, params.onNextButtonClicked) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onScrolledToDropdownField;
        }

        public final l<String, i0> g() {
            return this.onUrlClicked;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ox2.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onReasonFieldClicked.hashCode()) * 31) + this.onReasonSelected.hashCode()) * 31) + this.onUrlClicked.hashCode()) * 31) + this.onScrolledToDropdownField.hashCode()) * 31) + this.onNextButtonClicked.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onReasonFieldClicked=" + this.onReasonFieldClicked + ", onReasonSelected=" + this.onReasonSelected + ", onUrlClicked=" + this.onUrlClicked + ", onScrolledToDropdownField=" + this.onScrolledToDropdownField + ", onNextButtonClicked=" + this.onNextButtonClicked + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((AddressSearchItemData) t16).getIsSelected()), Boolean.valueOf(((AddressSearchItemData) t15).getIsSelected()));
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final Params params, d dVar, DropDownButtonData dropDownButtonData) {
        params.d().b(dVar.r((ox2.b.Initialized) params.getState(), ((ox2.b.Initialized) params.getState()).getSelectedReason(), new l() { // from class: qx2.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (ApplicationReason) obj);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, ApplicationReason applicationReason) {
        params.e().b(applicationReason);
        return i0.f148189a;
    }

    private final List<AddressSearchItemData> m(List<ApplicationReason> list, ApplicationReason applicationReason, final l<? super ApplicationReason, i0> lVar) {
        ApplicationReason.b type;
        List<ApplicationReason> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (final ApplicationReason applicationReason2 : list2) {
            arrayList.add(new AddressSearchItemData(mx.b.b(applicationReason2.getDescription(), "description"), null, t.c((applicationReason == null || (type = applicationReason.getType()) == null) ? null : type.name(), applicationReason2.getType().name()), new er.a() { // from class: qx2.b
                @Override // er.a
                public final Object a() {
                    return d.q(lVar, applicationReason2);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, ApplicationReason applicationReason) {
        lVar.b(applicationReason);
        return i0.f148189a;
    }

    private final AddressSearchData r(ox2.b.Initialized initialized, ApplicationReason applicationReason, l<? super ApplicationReason, i0> lVar) {
        return new AddressSearchData(this.labelProvider.c(gv2.a.f77313t2), this.labelProvider.c(gv2.a.Z), v.U0(m(initialized.c(), applicationReason, lVar), new b()), new AddressNoSearchResultsData(this.labelProvider.c(gv2.a.R), this.labelProvider.c(gv2.a.f77275k0)));
    }

    private final c30.b.e s(ApplicationReason applicationReason, l<? super String, i0> lVar) {
        ApplicationReason.InfoTip infoTip = applicationReason.getInfoTip();
        if (infoTip != null) {
            if (infoTip.getType() != ApplicationReason.InfoTip.EnumC0167a.WARNING) {
                infoTip = null;
            }
            if (infoTip != null) {
                return new c30.b.e(null, null, null, mx.b.b(infoTip.getDescription(), "alertDescription"), null, null, new c30.a.Link(new LinkData(null, mx.b.b(infoTip.getLinkLabel(), "linkLabel"), infoTip.getLink(), LinkData.EnumC5775a.WEBSITE, false, lVar, 17, null)), 55, null);
            }
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ox2.c.a b(final Params params) {
        ox2.b state = params.getState();
        if (state instanceof ox2.b.Initial) {
            return ox2.c.a.C3712a.f150501a;
        }
        if (!(state instanceof ox2.b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gv2.a.f77317u2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(gv2.a.f77321v2);
        boolean z15 = ((ox2.b.Initialized) params.getState()).getElementToAutoFocus() == ox2.d.ReasonDropDown;
        Label labelC2 = this.labelProvider.c(gv2.a.X);
        Label labelC3 = this.labelProvider.c(gv2.a.f77313t2);
        List<ApplicationReason> listC = ((ox2.b.Initialized) params.getState()).c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(mx.b.b(((ApplicationReason) it.next()).getDescription(), "description"));
        }
        ApplicationReason selectedReason = ((ox2.b.Initialized) params.getState()).getSelectedReason();
        DropDownButtonData dropDownButtonData = new DropDownButtonData(labelC2, arrayList, selectedReason != null ? Integer.valueOf(((ox2.b.Initialized) params.getState()).c().indexOf(selectedReason)) : null, ((ox2.b.Initialized) params.getState()).getIsValid() ? new m.Enabled(null, 1, null) : new m.Error(this.labelProvider.c(gv2.a.f77274k)), labelC3, z15, null, new l() { // from class: qx2.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(params, this, (DropDownButtonData) obj);
            }
        }, 64, null);
        ApplicationReason selectedReason2 = ((ox2.b.Initialized) params.getState()).getSelectedReason();
        return new ox2.c.a.Initialized(baseScaffoldData, labelC, dropDownButtonData, selectedReason2 != null ? s(selectedReason2, params.g()) : null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.I), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), ((ox2.b.Initialized) params.getState()).getRequestToBringIntoView(), params.f());
    }
}
