package l42;

import androidx.compose.ui.graphics.Color;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import vr0.BEUserCard;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll42/f;", "Lxw/f;", "Ll42/f$a;", "Ll42/d$a;", "Lmx/c;", "labelProvider", "Lg42/j;", "paymentsCardsHelper", "<init>", "(Lmx/c;Lg42/j;)V", "params", "f", "(Ll42/f$a;)Ll42/d$a;", "a", "Lmx/c;", "b", "Lg42/j;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g42.j paymentsCardsHelper;

    /* JADX INFO: renamed from: l42.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, d2 = {"Ll42/f$a;", "", "Ll42/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Lkotlin/Function1;", "", "onCardClickAction", "onSnackBarHidden", "<init>", "(Ll42/c;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll42/c;", "d", "()Ll42/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onCardClickAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(c cVar, er.a<i0> aVar, er.l<? super String, i0> lVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onCloseAction = aVar;
            this.onCardClickAction = lVar;
            this.onSnackBarHidden = aVar2;
        }

        public final er.l<String, i0> a() {
            return this.onCardClickAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onCloseAction, params.onCloseAction) && fr.t.c(this.onCardClickAction, params.onCardClickAction) && fr.t.c(this.onSnackBarHidden, params.onSnackBarHidden);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onCardClickAction.hashCode()) * 31) + this.onSnackBarHidden.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onCardClickAction=" + this.onCardClickAction + ", onSnackBarHidden=" + this.onSnackBarHidden + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BEUserCard f115904b;

        b(BEUserCard bEUserCard) {
            this.f115904b = bEUserCard;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(662353037);
            if (p076m2.t.k()) {
                p076m2.t.o(662353037, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.deletecards.PaymentsDeleteCardsMapper.invoke.<anonymous>.<anonymous> (PaymentsDeleteCardsMapper.kt:39)");
            }
            long jE = f.this.paymentsCardsHelper.e(this.f115904b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jE;
        }
    }

    public f(mx.c cVar, g42.j jVar) {
        this.labelProvider = cVar;
        this.paymentsCardsHelper = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, BEUserCard bEUserCard) {
        params.a().b(bEUserCard.getCardTokenId());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.a b(final Params params) {
        c state = params.getState();
        if (fr.t.c(state, c.a.f115884a)) {
            return d.a.C2798a.f115889a;
        }
        if (!(state instanceof c.Initialized)) {
            throw new oq.p();
        }
        er.a<i0> aVarB = params.b();
        c.Initialized initialized = (c.Initialized) state;
        List<BEUserCard> listC = initialized.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        for (final BEUserCard bEUserCard : listC) {
            LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(this.paymentsCardsHelper.d(bEUserCard), null, new b(bEUserCard), null, this.paymentsCardsHelper.a(bEUserCard), 10, null), 3, null);
            arrayList.add(new DefaultSingleCardData(null, null, bEUserCard.getActive(), null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.paymentsCardsHelper.c(bEUserCard.getCardNumberMasked()), this.paymentsCardsHelper.f(bEUserCard.getCardNumberMasked()), null, 0, 0, null, 60, null)), new SingleCardLabel(this.paymentsCardsHelper.b(bEUserCard), null, null, 0, 0, null, 62, null), 1, null), leadingSection, x0.IconButton.INSTANCE.a(this.labelProvider.c(t32.b.S), new er.a() { // from class: l42.e
                @Override // er.a
                public final Object a() {
                    return f.h(params, bEUserCard);
                }
            }), null, 2299, null));
        }
        return new d.a.Initialized(aVarB, arrayList, params.c(), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(t32.b.H), null, null, null, 28, null), null, null, null, null, 61, null), initialized.getDialog());
    }
}
