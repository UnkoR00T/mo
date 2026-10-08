package e62;

import androidx.compose.ui.graphics.Color;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import vr0.BEUserCard;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Le62/e;", "Lxw/f;", "Le62/e$a;", "Le62/d$a;", "Lmx/c;", "labelProvider", "Lg42/j;", "paymentsCardsHelper", "<init>", "(Lmx/c;Lg42/j;)V", "params", "l", "(Le62/e$a;)Le62/d$a;", "Lmx/a;", "i", "()Lmx/a;", "h", "f", "e", "a", "Lmx/c;", "b", "Lg42/j;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g42.j paymentsCardsHelper;

    /* JADX INFO: renamed from: e62.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Le62/e$a;", "", "Le62/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onSnackBarHidden", "onBackButtonAction", "deleteCardsAction", "onAddCardAction", "<init>", "(Le62/c;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le62/c;", "e", "()Le62/c;", "b", "Ler/a;", "d", "()Ler/a;", "c", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e62.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackButtonAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteCardsAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddCardAction;

        public Params(e62.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = cVar;
            this.onSnackBarHidden = aVar;
            this.onBackButtonAction = aVar2;
            this.deleteCardsAction = aVar3;
            this.onAddCardAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.deleteCardsAction;
        }

        public final er.a<i0> b() {
            return this.onAddCardAction;
        }

        public final er.a<i0> c() {
            return this.onBackButtonAction;
        }

        public final er.a<i0> d() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final e62.c getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onSnackBarHidden, params.onSnackBarHidden) && fr.t.c(this.onBackButtonAction, params.onBackButtonAction) && fr.t.c(this.deleteCardsAction, params.deleteCardsAction) && fr.t.c(this.onAddCardAction, params.onAddCardAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.onBackButtonAction.hashCode()) * 31) + this.deleteCardsAction.hashCode()) * 31) + this.onAddCardAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSnackBarHidden=" + this.onSnackBarHidden + ", onBackButtonAction=" + this.onBackButtonAction + ", deleteCardsAction=" + this.deleteCardsAction + ", onAddCardAction=" + this.onAddCardAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BEUserCard f47766b;

        b(BEUserCard bEUserCard) {
            this.f47766b = bEUserCard;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(768379658);
            if (p076m2.t.k()) {
                p076m2.t.o(768379658, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsMapper.invoke.<anonymous>.<anonymous> (PaymentsYourCardsMapper.kt:52)");
            }
            long jE = e.this.paymentsCardsHelper.e(this.f47766b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jE;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"e62/e$c", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.f106727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription = c70.a.f23835a.a().u();

        c() {
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    public e(mx.c cVar, g42.j jVar) {
        this.labelProvider = cVar;
        this.paymentsCardsHelper = jVar;
    }

    public final Label e() {
        return this.labelProvider.c(t32.b.F);
    }

    public final Label f() {
        return this.labelProvider.c(t32.b.D);
    }

    public final Label h() {
        return this.labelProvider.c(t32.b.K);
    }

    public final Label i() {
        return this.labelProvider.c(t32.b.E);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        e62.c state = params.getState();
        if (fr.t.c(state, e62.c.b.f47744a)) {
            return d.a.b.f47751a;
        }
        if (!(state instanceof e62.c.Initialized)) {
            if (!fr.t.c(state, e62.c.a.f47743a)) {
                throw new oq.p();
            }
            return new d.a.Empty(params.d(), new IconPageData(new q40.j.a(jz.a.f106754d2), this.labelProvider.c(t32.b.N), this.labelProvider.c(t32.b.M), null, null, null, false, 72, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.C), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(t32.b.V), null, null, null, 28, null), null, null, null, null, 61, null));
        }
        er.a<i0> aVarD = params.d();
        er.a<i0> aVarB = params.b();
        List<BEUserCard> listA = ((e62.c.Initialized) state).a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        for (BEUserCard bEUserCard : listA) {
            LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(this.paymentsCardsHelper.d(bEUserCard), null, new b(bEUserCard), null, this.paymentsCardsHelper.a(bEUserCard), 10, null), 3, null);
            arrayList.add(new DefaultSingleCardData(null, null, bEUserCard.getActive(), null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.paymentsCardsHelper.c(bEUserCard.getCardNumberMasked()), this.paymentsCardsHelper.f(bEUserCard.getCardNumberMasked()), null, 0, 0, null, 60, null)), n50.l.b(this.paymentsCardsHelper.b(bEUserCard), null, null, 3, null), 1, null), leadingSection, null, null, 3323, null));
        }
        return new d.a.Initialized(aVarD, aVarB, new CardListData(arrayList, null, false, null, null, 30, null), this.labelProvider.c(t32.b.C), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(t32.b.V), null, new x50.a.Icon(new x50.a.MenuButtonData(new c(), null, null, params.a(), 6, null)), null, 20, null), null, null, null, null, 61, null));
    }
}
