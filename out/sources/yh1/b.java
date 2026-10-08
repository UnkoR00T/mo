package yh1;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k34.g;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.i;
import xh1.State;
import xw.f;
import zh1.MoreModel;
import zh1.MoreSection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JS\u0010\u001f\u001a\u00020\u000f*\u00020\u00172\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lyh1/b;", "Lxw/f;", "Lyh1/b$a;", "Lxh1/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lxh1/c;", "state", "params", "Lzh1/a;", "f", "(Lxh1/c;Lyh1/b$a;)Lzh1/a;", "", "Ln50/g;", "i", "(Lxh1/c;Lyh1/b$a;)Ljava/util/List;", "h", "", "isCertValid", "e", "(ZLyh1/b$a;)Ljava/util/List;", "Lah1/a$b;", "isEnabled", "Ln50/x0;", "trailingSection", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "m", "(Lah1/a$b;Lyh1/b$a;ZLn50/x0;Ler/p;Ler/p;)Ln50/g;", "l", "(Lyh1/b$a;)Lxh1/d$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, xh1.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: yh1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lyh1/b$a;", "", "Lxh1/c;", "state", "Lkotlin/Function1;", "Lah1/a$b;", "Loq/i0;", "goToItem", "", "isContactDetailsRegistryFeatureFlagActive", "isChatBotFeatureFlagActive", "isVoteIdeaFeatureFlagActive", "isAppRatingFeatureFlagActive", "isRegisteredAddressFeatureFlagActive", "<init>", "(Lxh1/c;Ler/l;ZZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lxh1/c;", "b", "()Lxh1/c;", "Ler/l;", "()Ler/l;", "c", "Z", "e", "()Z", "d", "g", "f", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ah1.a.b, i0> goToItem;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isContactDetailsRegistryFeatureFlagActive;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChatBotFeatureFlagActive;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isVoteIdeaFeatureFlagActive;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAppRatingFeatureFlagActive;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRegisteredAddressFeatureFlagActive;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super ah1.a.b, i0> lVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
            this.state = state;
            this.goToItem = lVar;
            this.isContactDetailsRegistryFeatureFlagActive = z15;
            this.isChatBotFeatureFlagActive = z16;
            this.isVoteIdeaFeatureFlagActive = z17;
            this.isAppRatingFeatureFlagActive = z18;
            this.isRegisteredAddressFeatureFlagActive = z19;
        }

        public final l<ah1.a.b, i0> a() {
            return this.goToItem;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAppRatingFeatureFlagActive() {
            return this.isAppRatingFeatureFlagActive;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsChatBotFeatureFlagActive() {
            return this.isChatBotFeatureFlagActive;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsContactDetailsRegistryFeatureFlagActive() {
            return this.isContactDetailsRegistryFeatureFlagActive;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.goToItem, params.goToItem) && this.isContactDetailsRegistryFeatureFlagActive == params.isContactDetailsRegistryFeatureFlagActive && this.isChatBotFeatureFlagActive == params.isChatBotFeatureFlagActive && this.isVoteIdeaFeatureFlagActive == params.isVoteIdeaFeatureFlagActive && this.isAppRatingFeatureFlagActive == params.isAppRatingFeatureFlagActive && this.isRegisteredAddressFeatureFlagActive == params.isRegisteredAddressFeatureFlagActive;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsRegisteredAddressFeatureFlagActive() {
            return this.isRegisteredAddressFeatureFlagActive;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsVoteIdeaFeatureFlagActive() {
            return this.isVoteIdeaFeatureFlagActive;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.goToItem.hashCode()) * 31) + Boolean.hashCode(this.isContactDetailsRegistryFeatureFlagActive)) * 31) + Boolean.hashCode(this.isChatBotFeatureFlagActive)) * 31) + Boolean.hashCode(this.isVoteIdeaFeatureFlagActive)) * 31) + Boolean.hashCode(this.isAppRatingFeatureFlagActive)) * 31) + Boolean.hashCode(this.isRegisteredAddressFeatureFlagActive);
        }

        public String toString() {
            return "Params(state=" + this.state + ", goToItem=" + this.goToItem + ", isContactDetailsRegistryFeatureFlagActive=" + this.isContactDetailsRegistryFeatureFlagActive + ", isChatBotFeatureFlagActive=" + this.isChatBotFeatureFlagActive + ", isVoteIdeaFeatureFlagActive=" + this.isVoteIdeaFeatureFlagActive + ", isAppRatingFeatureFlagActive=" + this.isAppRatingFeatureFlagActive + ", isRegisteredAddressFeatureFlagActive=" + this.isRegisteredAddressFeatureFlagActive + ')';
        }
    }

    /* JADX INFO: renamed from: yh1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6089b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C6089b f227090a = new C6089b();

        C6089b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1931926962);
            if (p076m2.t.k()) {
                p076m2.t.o(-1931926962, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.more.mapper.DashboardMoreMapper.createMoreModel.<anonymous> (DashboardMoreMapper.kt:87)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f227091a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1878095085);
            if (p076m2.t.k()) {
                p076m2.t.o(1878095085, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.more.mapper.DashboardMoreMapper.createMoreModel.<anonymous> (DashboardMoreMapper.kt:88)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f227092a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1834208443);
            if (p076m2.t.k()) {
                p076m2.t.o(-1834208443, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.more.mapper.DashboardMoreMapper.toSingleCardData.<anonymous> (DashboardMoreMapper.kt:168)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> e(boolean isCertValid, Params params) {
        DefaultSingleCardData defaultSingleCardDataQ = q(this, ah1.a.b.HISTORY, params, false, null, null, null, 30, null);
        DefaultSingleCardData defaultSingleCardData = null;
        if (!isCertValid) {
            defaultSingleCardDataQ = null;
        }
        DefaultSingleCardData defaultSingleCardDataQ2 = q(this, ah1.a.b.ABOUT_APP, params, false, null, null, null, 30, null);
        DefaultSingleCardData defaultSingleCardDataQ3 = q(this, ah1.a.b.TECHNICAL_SUPPORT, params, false, null, null, null, 30, null);
        DefaultSingleCardData defaultSingleCardDataQ4 = (isCertValid && params.getIsAppRatingFeatureFlagActive()) ? q(this, ah1.a.b.APP_RATING, params, false, null, null, null, 30, null) : null;
        DefaultSingleCardData defaultSingleCardDataQ5 = (isCertValid && params.getIsChatBotFeatureFlagActive() && !params.getState().getIsCertExpired()) ? q(this, ah1.a.b.CHAT_BOT, params, false, null, null, null, 30, null) : null;
        DefaultSingleCardData defaultSingleCardDataQ6 = q(this, ah1.a.b.VOTE_IDEA, params, false, null, null, null, 30, null);
        if (isCertValid && params.getIsVoteIdeaFeatureFlagActive()) {
            defaultSingleCardData = defaultSingleCardDataQ6;
        }
        return v.s(defaultSingleCardDataQ, defaultSingleCardDataQ2, defaultSingleCardDataQ3, defaultSingleCardDataQ4, defaultSingleCardDataQ5, defaultSingleCardData, q(this, ah1.a.b.DEACTIVATE_APP, params, false, null, null, null, 30, null));
    }

    private final MoreModel f(State state, Params params) {
        MoreSection moreSection = new MoreSection(this.labelProvider.c(sg1.a.f181454b2), new CardListData(i(state, params), null, false, null, null, 30, null));
        Label labelC = this.labelProvider.c(sg1.a.f181470f2);
        List<DefaultSingleCardData> listH = h(state, params);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (((DefaultSingleCardData) obj).getIsEnabled()) {
                arrayList.add(obj);
            }
        }
        List listQ = v.q(moreSection, new MoreSection(labelC, new CardListData(arrayList, null, false, null, null, 30, null)), new MoreSection(this.labelProvider.c(sg1.a.f181524v0), new CardListData(e(state.getIsCertValid(), params), null, false, null, null, 30, null)));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listQ) {
            if (!((MoreSection) obj2).getItemsListData().d().isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        return new MoreModel(arrayList2, q(this, ah1.a.b.LOGOUT, params, false, null, C6089b.f227090a, c.f227091a, 2, null), new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(null, this.labelProvider.c(sg1.a.f181521u0), null, null, true, null, 45, null), null, null, null, new ScrollControllerData(state.d(), false, false, 4, null), 28, null));
    }

    private final List<DefaultSingleCardData> h(State state, Params params) {
        return v.q(q(this, ah1.a.b.CHANGE_PASSWORD, params, false, null, null, null, 30, null), q(this, ah1.a.b.BIOMETRIC_LOGIN, params, false, null, null, null, 30, null), q(this, ah1.a.b.NOTIFICATIONS, params, state.getIsCertValid(), null, null, null, 28, null), q(this, ah1.a.b.APPEARANCE, params, false, null, null, null, 30, null), q(this, ah1.a.b.LANGUAGE, params, false, null, null, null, 30, null), q(this, ah1.a.b.CERTIFICATES_ISSUED, params, !state.c().isEmpty() && state.getIsCertValid(), null, null, null, 28, null));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    private final List<DefaultSingleCardData> i(State state, Params params) {
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardDataQ = q(this, ah1.a.b.CONTACT_DETAILS, params, false, null, null, null, 30, null);
        DefaultSingleCardData defaultSingleCardData2 = null;
        if (!params.getIsContactDetailsRegistryFeatureFlagActive()) {
            defaultSingleCardDataQ = null;
        }
        DefaultSingleCardData defaultSingleCardDataQ2 = q(this, ah1.a.b.REGISTERED_ADDRESS, params, false, null, null, null, 30, null);
        if (params.getIsRegisteredAddressFeatureFlagActive() && state.getIsCertValid()) {
            List<g> listC = state.c();
            ArrayList arrayList = new ArrayList(v.y(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(((g) it.next()).getType());
            }
            if (arrayList.contains(rq0.b.d.ID_CARD)) {
                defaultSingleCardData = defaultSingleCardDataQ2;
            } else {
                defaultSingleCardData = null;
            }
        } else {
            defaultSingleCardData = null;
        }
        DefaultSingleCardData defaultSingleCardDataQ3 = q(this, ah1.a.b.PASSPORT_DETAILS, params, false, null, null, null, 30, null);
        if (state.getIsCertValid()) {
            List<g> listC2 = state.c();
            ArrayList arrayList2 = new ArrayList(v.y(listC2, 10));
            Iterator<T> it4 = listC2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((g) it4.next()).getType());
            }
            if (arrayList2.contains(rq0.b.d.ID_CARD)) {
                defaultSingleCardData2 = defaultSingleCardDataQ3;
            }
        }
        return v.s(defaultSingleCardDataQ, defaultSingleCardData, defaultSingleCardData2);
    }

    private final DefaultSingleCardData m(final ah1.a.b bVar, final Params params, boolean z15, x0 x0Var, p<? super r, ? super Integer, Color> pVar, p<? super r, ? super Integer, Color> pVar2) {
        return new DefaultSingleCardData(null, new er.a() { // from class: yh1.a
            @Override // er.a
            public final Object a() {
                return b.r(params, bVar);
            }
        }, z15, null, null, false, bVar, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(bVar.getTitle()), null, pVar, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(bVar.getIcon(), null, pVar2, null, null, 26, null), 3, null), x0Var, null, 2233, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ DefaultSingleCardData q(b bVar, ah1.a.b bVar2, Params params, boolean z15, x0 x0Var, p pVar, p pVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        boolean z16 = z15;
        if ((i15 & 4) != 0) {
            x0Var = x0.Icon.INSTANCE.b();
        }
        x0 x0Var2 = x0Var;
        if ((i15 & 8) != 0) {
            pVar = null;
        }
        p pVar3 = pVar;
        if ((i15 & 16) != 0) {
            pVar2 = d.f227092a;
        }
        return bVar.m(bVar2, params, z16, x0Var2, pVar3, pVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, ah1.a.b bVar) {
        params.a().b(bVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public xh1.d.Data b(Params params) {
        return new xh1.d.Data(f(params.getState(), params));
    }
}
