package tl2;

import cb4.i;
import d60.ScrollControllerData;
import er.l;
import er.q;
import ez.e;
import f3.m;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import u50.v0;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltl2/c;", "Lxw/f;", "Ltl2/c$a;", "Lsl2/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "h", "(Ltl2/c$a;)Lsl2/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, sl2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: tl2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0019\u0010 ¨\u0006&"}, d2 = {"Ltl2/c$a;", "", "Lsl2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClickNotificationsInApp", "onClickNotificationsByEmail", "onDateClicked", "Lkotlin/Function1;", "", "onEmailChanged", "onSaveClicked", "onBack", "<init>", "(Lsl2/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsl2/b;", "g", "()Lsl2/b;", "b", "Ler/a;", "c", "()Ler/a;", "d", "e", "Ler/l;", "()Ler/l;", "f", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sl2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClickNotificationsInApp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClickNotificationsByEmail;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEmailChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSaveClicked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(sl2.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = bVar;
            this.onClickNotificationsInApp = aVar;
            this.onClickNotificationsByEmail = aVar2;
            this.onDateClicked = aVar3;
            this.onEmailChanged = lVar;
            this.onSaveClicked = aVar4;
            this.onBack = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClickNotificationsByEmail;
        }

        public final er.a<i0> c() {
            return this.onClickNotificationsInApp;
        }

        public final er.a<i0> d() {
            return this.onDateClicked;
        }

        public final l<String, i0> e() {
            return this.onEmailChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClickNotificationsInApp, params.onClickNotificationsInApp) && t.c(this.onClickNotificationsByEmail, params.onClickNotificationsByEmail) && t.c(this.onDateClicked, params.onDateClicked) && t.c(this.onEmailChanged, params.onEmailChanged) && t.c(this.onSaveClicked, params.onSaveClicked) && t.c(this.onBack, params.onBack);
        }

        public final er.a<i0> f() {
            return this.onSaveClicked;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final sl2.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onClickNotificationsInApp.hashCode()) * 31) + this.onClickNotificationsByEmail.hashCode()) * 31) + this.onDateClicked.hashCode()) * 31) + this.onEmailChanged.hashCode()) * 31) + this.onSaveClicked.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClickNotificationsInApp=" + this.onClickNotificationsInApp + ", onClickNotificationsByEmail=" + this.onClickNotificationsByEmail + ", onDateClicked=" + this.onDateClicked + ", onEmailChanged=" + this.onEmailChanged + ", onSaveClicked=" + this.onSaveClicked + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tl2/c$b", "Ln50/e;", "Loq/i0;", "a", "(Lm2/r;I)V", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements n50.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ sl2.b f190650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Params f190651c;

        b(sl2.b bVar, Params params) {
            this.f190650b = bVar;
            this.f190651c = params;
        }

        @Override // n50.e
        public void a(r rVar, int i15) {
            rVar.X(-998387817);
            if (p076m2.t.k()) {
                p076m2.t.o(-998387817, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.notifications.mapper.NotificationsScreenMapper.invoke.<no name provided>.Content (NotificationsScreenMapper.kt:115)");
            }
            Label labelC = c.this.labelProvider.c(hl2.a.f85261f);
            String email = this.f190650b.getData().getEmail();
            if (email == null) {
                email = "";
            }
            v0.g(new v50.c.Text("EmailCardInput", labelC, null, mx.b.b(email, ""), this.f190650b.getData().getEmailValidator(), null, null, this.f190651c.e(), null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, ul2.b.f198968a, 393060, null), null, rVar, v50.c.Text.P, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
        }

        @Override // n50.e
        public /* bridge */ q<n50.e.CustomContainerModifierData, r, Integer, m> b() {
            return super.b();
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, boolean z15) {
        params.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, boolean z15) {
        params.b().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public sl2.c.a b(final Params params) {
        String text;
        sl2.b state = params.getState();
        if (state instanceof sl2.b.Error) {
            return new sl2.c.a.Error(((sl2.b.Error) state).getError());
        }
        if (!(state instanceof sl2.b.Content) && !(state instanceof sl2.b.Saving) && !(state instanceof sl2.b.Dialog)) {
            throw new p();
        }
        sl2.b.Dialog dialog = state instanceof sl2.b.Dialog ? (sl2.b.Dialog) state : null;
        i dialogVMSAdapter = dialog != null ? dialog.getDialogVMSAdapter() : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(hl2.a.f85266k), null, null, null, 28, null), null, null, null, new ScrollControllerData(params.getState().getData().h(), false, false, 6, null), 29, null);
        Label labelC = this.labelProvider.c(hl2.a.f85275t);
        Label labelC2 = this.labelProvider.c(hl2.a.f85279x);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("notificationsInApp", params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(hl2.a.f85256a), null, null, 3, null)), null, 5, null), null, new x0.Switch(new s50.a.C4550a(null, state.getData().getSelectedNotificationsInApp(), false, new l() { // from class: tl2.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, ((Boolean) obj).booleanValue());
            }
        }, null, null, null, false, 245, null)), null, 2812, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(hl2.a.f85262g), null, null, 3, null)), null, 5, null);
        boolean selectedNotificationsByEmail = state.getData().getSelectedNotificationsByEmail();
        if (selectedNotificationsByEmail) {
            text = null;
        } else {
            if (selectedNotificationsByEmail) {
                throw new p();
            }
            text = this.labelProvider.c(hl2.a.f85268m).getText();
        }
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("notificationsByEmail", params.b(), false, null, null, false, null, null, bodySection, null, new x0.Switch(new s50.a.C4550a(null, state.getData().getSelectedNotificationsByEmail(), false, new l() { // from class: tl2.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.l(params, ((Boolean) obj).booleanValue());
            }
        }, null, text, null, false, 213, null)), null, 2812, null);
        CustomSingleCardData customSingleCardData = new CustomSingleCardData("EmailCard", new b(state, params), null, false, null, null, false, null, 252, null);
        if (!state.getData().getSelectedNotificationsByEmail()) {
            customSingleCardData = null;
        }
        CardListData cardListData = new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, customSingleCardData), null, false, null, null, 30, null);
        Label labelC3 = this.labelProvider.c(hl2.a.f85276u);
        InputDateTimeData inputDateTimeData = new InputDateTimeData(null, this.labelProvider.c(hl2.a.f85274s), this.dateFormatter.d(state.getData().getSelectedDate(), fz.c.DOTTED), InputDateTimeData.b.C5303a.f203783c, null, null, null, null, false, null, params.d(), 1009, null);
        if (!state.getData().getSelectedNotificationsInApp() && !state.getData().getSelectedNotificationsByEmail()) {
            inputDateTimeData = null;
        }
        return new sl2.c.a.Content(dialogVMSAdapter, params.a(), baseScaffoldData, labelC, labelC2, labelC3, cardListData, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(hl2.a.f85267l), null, 2, null), d.a.f107773a, null, params.f(), 35, null), inputDateTimeData);
    }
}
