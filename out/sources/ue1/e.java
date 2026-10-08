package ue1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import ld1.CompanyPkdCode;
import n30.CardListData;
import n50.BodySection;
import n50.BottomSection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import te1.FormData;
import te1.q;
import te1.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lue1/e;", "Lxw/f;", "Lue1/e$a;", "Lte1/r$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lte1/p$a;", "Lkotlin/Function1;", "Lld1/g;", "Loq/i0;", "onItemClickAction", "onMoreInfoAction", "Ln50/g;", "i", "(Ljava/util/List;Ler/l;Ler/l;)Ljava/util/List;", "", "query", "f", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "params", "h", "(Lue1/e$a;)Lte1/r$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, r.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ue1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u001d\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b%\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b!\u0010(R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b+\u0010$R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b)\u0010(¨\u0006,"}, d2 = {"Lue1/e$a;", "", "Lte1/q;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onQueryChangeAction", "", "onActiveChangeAction", "Lkotlin/Function0;", "onClearAction", "Lld1/g;", "onItemClickAction", "onBackAction", "onAddPkdCodeAction", "Lte1/p$a;", "onMoreInfoAction", "onCloseAction", "<init>", "(Lte1/q;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lte1/q;", "i", "()Lte1/q;", "b", "Ler/l;", "h", "()Ler/l;", "c", "d", "Ler/a;", "()Ler/a;", "e", "f", "g", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onQueryChangeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onActiveChangeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClearAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<CompanyPkdCode, i0> onItemClickAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddPkdCodeAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<FormData.PkdCodeItem, i0> onMoreInfoAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(q qVar, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar, l<? super CompanyPkdCode, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3, l<? super FormData.PkdCodeItem, i0> lVar4, er.a<i0> aVar4) {
            this.state = qVar;
            this.onQueryChangeAction = lVar;
            this.onActiveChangeAction = lVar2;
            this.onClearAction = aVar;
            this.onItemClickAction = lVar3;
            this.onBackAction = aVar2;
            this.onAddPkdCodeAction = aVar3;
            this.onMoreInfoAction = lVar4;
            this.onCloseAction = aVar4;
        }

        public final l<Boolean, i0> a() {
            return this.onActiveChangeAction;
        }

        public final er.a<i0> b() {
            return this.onAddPkdCodeAction;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onClearAction;
        }

        public final er.a<i0> e() {
            return this.onCloseAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onQueryChangeAction, params.onQueryChangeAction) && t.c(this.onActiveChangeAction, params.onActiveChangeAction) && t.c(this.onClearAction, params.onClearAction) && t.c(this.onItemClickAction, params.onItemClickAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onAddPkdCodeAction, params.onAddPkdCodeAction) && t.c(this.onMoreInfoAction, params.onMoreInfoAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final l<CompanyPkdCode, i0> f() {
            return this.onItemClickAction;
        }

        public final l<FormData.PkdCodeItem, i0> g() {
            return this.onMoreInfoAction;
        }

        public final l<String, i0> h() {
            return this.onQueryChangeAction;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onQueryChangeAction.hashCode()) * 31) + this.onActiveChangeAction.hashCode()) * 31) + this.onClearAction.hashCode()) * 31) + this.onItemClickAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onAddPkdCodeAction.hashCode()) * 31) + this.onMoreInfoAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final q getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onQueryChangeAction=" + this.onQueryChangeAction + ", onActiveChangeAction=" + this.onActiveChangeAction + ", onClearAction=" + this.onClearAction + ", onItemClickAction=" + this.onItemClickAction + ", onBackAction=" + this.onBackAction + ", onAddPkdCodeAction=" + this.onAddPkdCodeAction + ", onMoreInfoAction=" + this.onMoreInfoAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<FormData.PkdCodeItem> f(List<FormData.PkdCodeItem> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            FormData.PkdCodeItem pkdCodeItem = (FormData.PkdCodeItem) obj;
            if (fu.r.b0(pkdCodeItem.getPkdCode().getCode(), str, true) || fu.r.b0(pkdCodeItem.getPkdCode().getName(), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<DefaultSingleCardData> i(List<FormData.PkdCodeItem> list, final l<? super CompanyPkdCode, i0> lVar, final l<? super FormData.PkdCodeItem, i0> lVar2) {
        List<FormData.PkdCodeItem> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final FormData.PkdCodeItem pkdCodeItem = (FormData.PkdCodeItem) obj;
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(pkdCodeItem.getPkdCode().getCode(), "bodySectionSearchTitle_" + i15), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 5, null);
            x0.Button button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithIcon(jz.a.H1, c70.a.f23835a.a().t()), k30.d.c.f107775a, k30.b.c.f107768a, new er.a() { // from class: ue1.c
                @Override // er.a
                public final Object a() {
                    return e.l(lVar2, pkdCodeItem);
                }
            }, 3, null));
            String description = pkdCodeItem.getPkdCode().getDescription();
            x0.Button button2 = !(description == null || fu.r.t0(description)) ? button : null;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: ue1.d
                @Override // er.a
                public final Object a() {
                    return e.m(lVar, pkdCodeItem);
                }
            }, false, null, null, false, null, null, bodySection, new LeadingSection(false, new n50.d.CheckBox(pkdCodeItem.getIsChecked()), null, 5, null), button2, new BottomSection(new SingleCardLabel(mx.b.b(pkdCodeItem.getPkdCode().getName(), "pkdCodeName_" + i15), null, null, 0, 0, null, 62, null), null, 2, null), 253, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, FormData.PkdCodeItem pkdCodeItem) {
        lVar.b(pkdCodeItem);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, FormData.PkdCodeItem pkdCodeItem) {
        lVar.b(pkdCodeItem.getPkdCode());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public r.a b(Params params) {
        q state = params.getState();
        if (!(state instanceof q.Dialog) && !(state instanceof q.Initialized)) {
            if (state instanceof q.MoreInfo) {
                return new r.a.MoreInfo(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.e()), mx.b.b(((q.MoreInfo) params.getState()).getSelectedPkdCodeItem().getPkdCode().getCode(), "moreInfoTitle"), null, null, null, 28, null), null, null, null, null, 61, null), params.e(), mx.b.d(((q.MoreInfo) params.getState()).getSelectedPkdCodeItem().getPkdCode().getDescription(), "moreInfoDescription"));
            }
            throw new p();
        }
        CardListData cardListData = new CardListData(i(f(params.getState().getFormData().c(), params.getState().getFormData().getSearchQuery()), params.f(), params.g()), null, false, null, null, 30, null);
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, !params.getState().getFormData().getIsSearchActive() ? new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.e()), this.labelProvider.c(ha1.a.T1), null, null, null, 28, null) : null, null, null, null, null, 61, null);
        er.a<i0> aVarC = params.c();
        SearchBarData searchBarData = new SearchBarData(params.getState().getFormData().getSearchQuery(), params.h(), params.getState().getFormData().getIsSearchActive(), params.a(), params.d(), this.labelProvider.c(ha1.a.f82363b0), null, Integer.valueOf(cardListData.d().size()), 64, null);
        EmptyStateData emptyStateData = new EmptyStateData(this.labelProvider.c(ha1.a.R), this.labelProvider.c(ha1.a.f82427j0), null, 4, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null);
        q state2 = params.getState();
        q.Dialog dialog = state2 instanceof q.Dialog ? (q.Dialog) state2 : null;
        return new r.a.Initialized(baseScaffoldData, buttonData, aVarC, searchBarData, cardListData, emptyStateData, dialog != null ? dialog.getDialogVMSAdapter() : null);
    }
}
