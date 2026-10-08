package jy3;

import androidx.compose.ui.graphics.Color;
import i50.BaseScaffoldData;
import java.util.List;
import k40.EmptyStateData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljy3/m;", "Lxw/f;", "Ljy3/m$a;", "Ljy3/k$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lqx3/a;", "Lkotlin/Function0;", "Loq/i0;", "toBlikPaymentMethod", "getOneClickPaymentMethod", "Ln50/g;", "c", "(Ljava/util/List;Ler/a;Ler/a;)Ln50/g;", "toCardsPaymentMethod", "e", "(Ljava/util/List;Ler/a;)Ln50/g;", "toGooglePayMethod", "f", "params", "h", "(Ljy3/m$a;)Ljy3/k$a;", "a", "Lmx/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: jy3.m$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Ljy3/m$a;", "", "Ljy3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "toBlikPaymentMethod", "getOneClickPaymentMethod", "toCardsPaymentMethod", "openGooglePayAction", "<init>", "(Ljy3/e;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljy3/e;", "d", "()Ljy3/e;", "b", "Ler/a;", "()Ler/a;", "c", "e", "f", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> toBlikPaymentMethod;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> getOneClickPaymentMethod;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> toCardsPaymentMethod;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> openGooglePayAction;

        public Params(e eVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4, er.a<oq.i0> aVar5) {
            this.state = eVar;
            this.onBack = aVar;
            this.toBlikPaymentMethod = aVar2;
            this.getOneClickPaymentMethod = aVar3;
            this.toCardsPaymentMethod = aVar4;
            this.openGooglePayAction = aVar5;
        }

        public final er.a<oq.i0> a() {
            return this.getOneClickPaymentMethod;
        }

        public final er.a<oq.i0> b() {
            return this.onBack;
        }

        public final er.a<oq.i0> c() {
            return this.openGooglePayAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getState() {
            return this.state;
        }

        public final er.a<oq.i0> e() {
            return this.toBlikPaymentMethod;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBack, params.onBack) && fr.t.c(this.toBlikPaymentMethod, params.toBlikPaymentMethod) && fr.t.c(this.getOneClickPaymentMethod, params.getOneClickPaymentMethod) && fr.t.c(this.toCardsPaymentMethod, params.toCardsPaymentMethod) && fr.t.c(this.openGooglePayAction, params.openGooglePayAction);
        }

        public final er.a<oq.i0> f() {
            return this.toCardsPaymentMethod;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.toBlikPaymentMethod.hashCode()) * 31) + this.getOneClickPaymentMethod.hashCode()) * 31) + this.toCardsPaymentMethod.hashCode()) * 31) + this.openGooglePayAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", toBlikPaymentMethod=" + this.toBlikPaymentMethod + ", getOneClickPaymentMethod=" + this.getOneClickPaymentMethod + ", toCardsPaymentMethod=" + this.toCardsPaymentMethod + ", openGooglePayAction=" + this.openGooglePayAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f106701a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-426410852);
            if (p076m2.t.k()) {
                p076m2.t.o(-426410852, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentsPaymentMethodsMapper.getBlikPaymentMethodCard.<anonymous> (PaymentsPaymentMethodsMapper.kt:122)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f106702a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1548349701);
            if (p076m2.t.k()) {
                p076m2.t.o(1548349701, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.methods.PaymentsPaymentMethodsMapper.getGooglePayMethodCard.<anonymous> (PaymentsPaymentMethodsMapper.kt:170)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    public m(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData c(List<? extends qx3.a> list, er.a<oq.i0> aVar, er.a<oq.i0> aVar2) {
        if (!list.contains(qx3.a.BLIK_T6_CODE)) {
            return null;
        }
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(px3.a.f163114d, null, b.f106701a, null, null, 26, null), 3, null);
        return new DefaultSingleCardData(null, list.contains(qx3.a.BLIK_ONE_CLICK) ? aVar2 : aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(px3.b.I), null, null, 3, null)), null, 5, null), leadingSection, n50.x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    private final DefaultSingleCardData e(List<? extends qx3.a> list, er.a<oq.i0> aVar) {
        if (!list.contains(qx3.a.CARD)) {
            return null;
        }
        return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(px3.b.K), null, null, 3, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.C, null, null, null, null, 30, null), 3, null), n50.x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    private final DefaultSingleCardData f(List<? extends qx3.a> list, er.a<oq.i0> aVar) {
        if (!list.contains(qx3.a.WALLET_GP)) {
            return null;
        }
        return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(px3.b.J), null, null, 3, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(px3.a.f163112b, null, c.f106702a, null, null, 26, null), 3, null), n50.x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k.a b(Params params) {
        boolean z15;
        boolean isGooglePayReady;
        e state = params.getState();
        if (fr.t.c(state, d.f106552a)) {
            return k.a.b.f106683a;
        }
        if (!(state instanceof Displayed) && !(state instanceof Loading) && !(state instanceof e.a.InterfaceC2541a.RequestGooglePay) && !(state instanceof e.a.InterfaceC2541a.CollectGooglePayStatus) && !(state instanceof e.a.InterfaceC2541a.GooglePayError) && !(state instanceof e.a.InterfaceC2541a.GooglePayCancelled)) {
            if (state instanceof jy3.c) {
                return new k.a.Error(null, ((jy3.c) state).a(), 1, null);
            }
            if (state instanceof Error) {
                return new k.a.Error(null, ((Error) state).getErrorVMS(), 1, null);
            }
            if (state instanceof Error) {
                return new k.a.Error(null, ((Error) state).getErrorVMS(), 1, null);
            }
            throw new oq.p();
        }
        e.a aVar = (e.a) state;
        DefaultSingleCardData defaultSingleCardDataC = c(aVar.getMakePaymentInitialData().b(), params.e(), params.a());
        DefaultSingleCardData defaultSingleCardDataF = f(aVar.getMakePaymentInitialData().b(), params.c());
        if (aVar.getIsGooglePayRemoteFlagActive()) {
            if ((aVar instanceof Displayed) || (aVar instanceof Error)) {
                isGooglePayReady = ((e.a) params.getState()).getIsGooglePayReady();
            } else {
                if (!(aVar instanceof e.a.InterfaceC2541a)) {
                    throw new oq.p();
                }
                isGooglePayReady = true;
            }
            z15 = isGooglePayReady;
        }
        List listS = pq.v.s(defaultSingleCardDataC, z15 ? defaultSingleCardDataF : null, e(aVar.getMakePaymentInitialData().b(), params.f()));
        if (listS.isEmpty()) {
            return new k.a.NoAvailableMethods(params.b(), new EmptyStateData(this.labelProvider.c(px3.b.O), this.labelProvider.c(px3.b.N), null, 4, null), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null));
        }
        return new k.a.Initialized(params.b(), new CardListData(listS, null, false, null, null, 30, null), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(px3.b.M), null, null, null, 28, null), null, null, null, null, 61, null), new c30.b.c("MethodsInfoAlart", null, null, this.labelProvider.c(px3.b.L), null, null, null, 118, null));
    }
}
