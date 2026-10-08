package g03;

import bh0.RegisteredAddress;
import bh0.RegisteredAddressDetails;
import er.l;
import f03.j;
import f03.k;
import fr.t;
import fu.r;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u0018\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J%\u0010&\u001a\u00020%2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'JW\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020-0,2\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lg03/e;", "Lxw/f;", "Lg03/e$a;", "Lf03/k$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "Lbh0/b;", "addressData", "", "isTemporaryAddress", "Ln30/b;", "l", "(Lbh0/b;Z)Ln30/b;", "Lmx/a;", "title", "", "info", "Ln50/g;", "q", "(Lmx/a;I)Ln50/g;", "bodyText", "buttonText", "Lkotlin/Function1;", "", "Loq/i0;", "onOpenUrlAction", "endpointUrl", "Lc30/b$c;", "m", "(IILer/l;Ljava/lang/String;)Lc30/b$c;", "Lkotlin/Function0;", "onBackAction", "autoFocusOnSelectedTab", "Li50/a;", "i", "(Ler/a;Z)Li50/a;", "hasHistoryTimeline", "openUrlAction", "goToAddressHistoryAction", "forceFocusOnSelectedTab", "Lq40/g;", "Lq40/f;", "r", "(IZLer/l;Ler/a;Z)Lq40/g;", "params", "u", "(Lg03/e$a;)Lf03/k$a;", "a", "Lmx/c;", "b", "Lu04/a;", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: g03.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001b\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001f\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b'\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b%\u0010\"¨\u0006("}, d2 = {"Lg03/e$a;", "", "Lf03/j;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lbh0/c;", "goToAddressHistoryAction", "goToMIdCard", "Ly30/n$b$b;", "onSwitchItemChanged", "", "openUrlAction", "onCloseOutdatedAlert", "<init>", "(Lf03/j;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf03/j;", "g", "()Lf03/j;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "()Ler/l;", "d", "e", "f", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<RegisteredAddressDetails, i0> goToAddressHistoryAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToMIdCard;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onSwitchItemChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrlAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseOutdatedAlert;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j jVar, er.a<i0> aVar, l<? super RegisteredAddressDetails, i0> lVar, er.a<i0> aVar2, l<? super n.Switch.EnumC5973b, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar3) {
            this.state = jVar;
            this.onBackAction = aVar;
            this.goToAddressHistoryAction = lVar;
            this.goToMIdCard = aVar2;
            this.onSwitchItemChanged = lVar2;
            this.openUrlAction = lVar3;
            this.onCloseOutdatedAlert = aVar3;
        }

        public final l<RegisteredAddressDetails, i0> a() {
            return this.goToAddressHistoryAction;
        }

        public final er.a<i0> b() {
            return this.goToMIdCard;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onCloseOutdatedAlert;
        }

        public final l<n.Switch.EnumC5973b, i0> e() {
            return this.onSwitchItemChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.goToAddressHistoryAction, params.goToAddressHistoryAction) && t.c(this.goToMIdCard, params.goToMIdCard) && t.c(this.onSwitchItemChanged, params.onSwitchItemChanged) && t.c(this.openUrlAction, params.openUrlAction) && t.c(this.onCloseOutdatedAlert, params.onCloseOutdatedAlert);
        }

        public final l<String, i0> f() {
            return this.openUrlAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final j getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.goToAddressHistoryAction.hashCode()) * 31) + this.goToMIdCard.hashCode()) * 31) + this.onSwitchItemChanged.hashCode()) * 31) + this.openUrlAction.hashCode()) * 31) + this.onCloseOutdatedAlert.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", goToAddressHistoryAction=" + this.goToAddressHistoryAction + ", goToMIdCard=" + this.goToMIdCard + ", onSwitchItemChanged=" + this.onSwitchItemChanged + ", openUrlAction=" + this.openUrlAction + ", onCloseOutdatedAlert=" + this.onCloseOutdatedAlert + ')';
        }
    }

    public e(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final BaseScaffoldData i(er.a<i0> onBackAction, boolean autoFocusOnSelectedTab) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackAction), this.labelProvider.c(wz2.a.f216110x), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final CardListData l(RegisteredAddress addressData, boolean isTemporaryAddress) {
        DefaultSingleCardData defaultSingleCardDataQ = q(mx.b.b(addressData.getRegistrationPeriod(), "addressRegistrationPeriod"), wz2.a.B);
        if (!isTemporaryAddress) {
            defaultSingleCardDataQ = null;
        }
        if (defaultSingleCardDataQ == null) {
            defaultSingleCardDataQ = q(mx.b.b(addressData.getRegistrationFrom(), "addressRegistrationFrom"), wz2.a.f216108v);
        }
        DefaultSingleCardData defaultSingleCardData = defaultSingleCardDataQ;
        DefaultSingleCardData defaultSingleCardDataQ2 = q(mx.b.b(addressData.getCity(), "addressCity"), wz2.a.f216088b);
        DefaultSingleCardData defaultSingleCardDataQ3 = q(mx.b.d(addressData.getPostalCode(), "addressPostalCode"), wz2.a.f216093g);
        String str = addressData.getStreetPrefix() + ' ';
        String streetPrefix = addressData.getStreetPrefix();
        String str2 = streetPrefix == null || r.t0(streetPrefix) ? null : str;
        if (str2 == null) {
            str2 = "";
        }
        return new CardListData(v.q(defaultSingleCardData, defaultSingleCardDataQ2, defaultSingleCardDataQ3, q(mx.b.b(str2, "addressStreetPrefix").o(mx.b.d(addressData.getStreetName(), "addressStreetName")), wz2.a.f216095i), q(mx.b.b(addressData.getBuildingNumber(), "addressBuildingNumber"), wz2.a.f216092f), q(mx.b.d(addressData.getApartmentNumber(), "addressApartmentNumber"), wz2.a.f216087a), q(mx.b.b(addressData.getVoivodeship(), "addressVoivodeship"), wz2.a.f216094h), q(mx.b.d(addressData.getCounty(), "addressCounty"), wz2.a.f216090d), q(mx.b.d(addressData.getCommune(), "addressCommune"), wz2.a.f216089c)), null, false, null, null, 30, null);
    }

    private final c30.b.c m(int bodyText, int buttonText, l<? super String, i0> onOpenUrlAction, String endpointUrl) {
        return new c30.b.c(null, null, null, this.labelProvider.c(bodyText), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(buttonText), endpointUrl, LinkData.EnumC5775a.WEBSITE, false, onOpenUrlAction, 17, null)), 55, null);
    }

    private final DefaultSingleCardData q(Label title, int info) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(info), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(title, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final IconPageData<i0, IconPageBottomContentData> r(int title, boolean hasHistoryTimeline, final l<? super String, i0> openUrlAction, er.a<i0> goToAddressHistoryAction, boolean forceFocusOnSelectedTab) {
        return new IconPageData<>(new q40.j.a(jz.a.f106842p2), this.labelProvider.c(title), this.labelProvider.c(wz2.a.f216096j), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(wz2.a.f216097k), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: g03.d
            @Override // er.a
            public final Object a() {
                return e.s(openUrlAction, this);
            }
        }, 35, null), hasHistoryTimeline ? new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(wz2.a.f216109w), null, 2, null), new k30.d.Secondary(null, 1, null), null, goToAddressHistoryAction, 35, null) : null, null, 4, null), !forceFocusOnSelectedTab, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar, e eVar) {
        lVar.b(eVar.commonEndpoints.o());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, j jVar) {
        params.a().b(((j.Empty) jVar).getAddressDetails());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, j jVar) {
        params.a().b(((j.Initialized) jVar).getAddressDetails());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, j jVar) {
        params.a().b(((j.Initialized) jVar).getAddressDetails());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public k.a b(final Params params) {
        CardListData cardListDataL;
        final j state = params.getState();
        if (t.c(state, j.b.f54606a)) {
            return k.a.b.f54617a;
        }
        if (state instanceof j.Empty) {
            return new k.a.Empty(i(params.c(), false), r(wz2.a.f216099m, !((j.Empty) state).getAddressDetails().getTimeline().b().isEmpty(), params.f(), new er.a() { // from class: g03.a
                @Override // er.a
                public final Object a() {
                    return e.v(params, state);
                }
            }, false), params.c());
        }
        if (!(state instanceof j.Initialized)) {
            throw new p();
        }
        j.Initialized initialized = (j.Initialized) state;
        BaseScaffoldData baseScaffoldDataI = i(params.c(), initialized.getAutoFocusOnSelectedTab());
        Label labelC = this.labelProvider.c(wz2.a.f216112z);
        if (initialized.getSelectedAddress() != null) {
            cardListDataL = l(initialized.getSelectedAddress(), initialized.getSelectedItem() == n.Switch.EnumC5973b.RIGHT);
        } else {
            cardListDataL = null;
        }
        return new k.a.Initialized(baseScaffoldDataI, labelC, initialized.getAddressDetails().getTemporaryAddress() != null ? new n.Switch(new n.Switch.TabItem(this.labelProvider.c(wz2.a.f216112z), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(wz2.a.A), n.Switch.EnumC5973b.RIGHT), initialized.getSelectedItem(), initialized.getAutoFocusOnSelectedTab(), params.e()) : null, cardListDataL, new DefaultSingleCardData(null, new er.a() { // from class: g03.b
            @Override // er.a
            public final Object a() {
                return e.x(params, state);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(wz2.a.f216109w), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106853r, null, null, null, null, 30, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null), (initialized.getShouldDisplayOutdatedAlert() && initialized.getIsAddressOutdated() && initialized.getSelectedItem() == n.Switch.EnumC5973b.LEFT) ? new c30.b.e(null, null, null, this.labelProvider.c(wz2.a.f216107u), params.d(), null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(wz2.a.f216106t), null, null, params.b(), 13, null)), 39, null) : null, v.q(m(wz2.a.f216101o, wz2.a.f216091e, params.f(), this.commonEndpoints.o()), m(wz2.a.f216111y, wz2.a.f216100n, params.f(), this.commonEndpoints.Z())), r(wz2.a.f216098l, !initialized.getAddressDetails().getTimeline().b().isEmpty(), params.f(), new er.a() { // from class: g03.c
            @Override // er.a
            public final Object a() {
                return e.z(params, state);
            }
        }, initialized.getAutoFocusOnSelectedTab()), params.c());
    }
}
