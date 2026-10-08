package rn2;

import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrn2/o;", "Lxw/f;", "Lrn2/o$a;", "Lrn2/k$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lrn2/o$a;)Lrn2/k$a;", "a", "Lmx/c;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements xw.f<Params, k.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: rn2.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u001c\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b%\u0010(¨\u0006)"}, d2 = {"Lrn2/o$a;", "", "Lrn2/j;", "state", "Lkotlin/Function1;", "Lmm2/a$a;", "Loq/i0;", "showBottomSheet", "Lmm2/e;", "onBottomSheetActionSelected", "Lg30/v;", "onBottomSheetStateChanged", "Lkotlin/Function0;", "onNextAction", "onBackAction", "onCloseAction", "<init>", "(Lrn2/j;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrn2/j;", "g", "()Lrn2/j;", "b", "Ler/l;", "f", "()Ler/l;", "c", "d", "e", "Ler/a;", "()Ler/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<mm2.a.SelectOption, oq.i0> showBottomSheet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<mm2.e, oq.i0> onBottomSheetActionSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<g30.v, oq.i0> onBottomSheetStateChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onNextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBackAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super mm2.a.SelectOption, oq.i0> lVar, er.l<? super mm2.e, oq.i0> lVar2, er.l<? super g30.v, oq.i0> lVar3, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3) {
            this.state = state;
            this.showBottomSheet = lVar;
            this.onBottomSheetActionSelected = lVar2;
            this.onBottomSheetStateChanged = lVar3;
            this.onNextAction = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
        }

        public final er.a<oq.i0> a() {
            return this.onBackAction;
        }

        public final er.l<mm2.e, oq.i0> b() {
            return this.onBottomSheetActionSelected;
        }

        public final er.l<g30.v, oq.i0> c() {
            return this.onBottomSheetStateChanged;
        }

        public final er.a<oq.i0> d() {
            return this.onCloseAction;
        }

        public final er.a<oq.i0> e() {
            return this.onNextAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.showBottomSheet, params.showBottomSheet) && fr.t.c(this.onBottomSheetActionSelected, params.onBottomSheetActionSelected) && fr.t.c(this.onBottomSheetStateChanged, params.onBottomSheetStateChanged) && fr.t.c(this.onNextAction, params.onNextAction) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.onCloseAction, params.onCloseAction);
        }

        public final er.l<mm2.a.SelectOption, oq.i0> f() {
            return this.showBottomSheet;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.showBottomSheet.hashCode()) * 31) + this.onBottomSheetActionSelected.hashCode()) * 31) + this.onBottomSheetStateChanged.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", showBottomSheet=" + this.showBottomSheet + ", onBottomSheetActionSelected=" + this.onBottomSheetActionSelected + ", onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    public o(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(final Params params) {
        params.f().b(new mm2.a.SelectOption(new er.l() { // from class: rn2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.l(params, (mm2.e) obj);
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(Params params, mm2.e eVar) {
        params.b().b(eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(Params params) {
        params.c().b(g30.v.HIDDEN);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q5.F0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(q5.E);
        FilePickerData filePickerData = new FilePickerData(this.labelProvider.c(q5.f219548h), null, params.getState().g(), pq.v.q(new n40.e.AllowedFormats(lm2.a.a()), new n40.e.b.Total(lm2.a.b(), null), new n40.e.SelectionLimit(3)), new er.a() { // from class: rn2.m
            @Override // er.a
            public final Object a() {
                return o.i(params);
            }
        }, 3);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q5.f219556l), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null);
        Label labelC2 = this.labelProvider.c(q5.C);
        cb4.i dialog = params.getState().getDialog();
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(params.getState().getBottomSheetValue(), false, params.c(), 2, null), null, null, null, 14, null);
        mm2.a bottomSheetData = params.getState().getBottomSheetData();
        return new k.Data(baseScaffoldData, labelC, labelC2, filePickerData, buttonData, dialog, modalBottomSheetData, bottomSheetData != null ? mm2.c.b(bottomSheetData, this.labelProvider, new er.a() { // from class: rn2.n
            @Override // er.a
            public final Object a() {
                return o.m(params);
            }
        }) : null);
    }
}
