package jd2;

import al0.IdentityCardSuspensionData;
import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import hd2.d;
import hd2.i;
import i50.BaseScaffoldData;
import iy.c0;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u00020\u0016*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u00020\u001a*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001d"}, d2 = {"Ljd2/c;", "Lxw/f;", "Ljd2/c$a;", "Lhd2/i$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lu04/a;Lez/e;)V", "params", "f", "(Ljd2/c$a;)Lhd2/i$a;", "a", "Lmx/c;", "b", "Lu04/a;", "c", "Lez/e;", "Lal0/f0$a;", "", "e", "(Lal0/f0$a;)I", "titleResId", "Lmx/a;", "(Lal0/f0$a;)Lmx/a;", "descriptionLabel", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: jd2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Ljd2/c$a;", "", "Lhd2/d;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClick", "Lkotlin/Function0;", "onNextButtonClick", "onBackClick", "<init>", "(Lhd2/d;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhd2/d;", "d", "()Lhd2/d;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, l<? super String, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = dVar;
            this.onUrlClick = lVar;
            this.onNextButtonClick = aVar;
            this.onBackClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onNextButtonClick;
        }

        public final l<String, i0> c() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onUrlClick.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUrlClick=" + this.onUrlClick + ", onNextButtonClick=" + this.onNextButtonClick + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    public c(mx.c cVar, u04.a aVar, e eVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
        this.dateFormatter = eVar;
    }

    private final Label c(IdentityCardSuspensionData.a aVar) {
        if (aVar instanceof IdentityCardSuspensionData.a.Unsuspension) {
            return this.labelProvider.e(uc2.a.B, this.dateFormatter.d(new fz.b.LocalDate(((IdentityCardSuspensionData.a.Unsuspension) aVar).getAllowedUntilDate()), fz.c.DOTTED));
        }
        if (t.c(aVar, IdentityCardSuspensionData.a.C0166a.f7353a)) {
            return this.labelProvider.c(uc2.a.f197487u);
        }
        throw new p();
    }

    private final int e(IdentityCardSuspensionData.a aVar) {
        if (aVar instanceof IdentityCardSuspensionData.a.Unsuspension) {
            return uc2.a.C;
        }
        if (t.c(aVar, IdentityCardSuspensionData.a.C0166a.f7353a)) {
            return uc2.a.f197489w;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        d state = params.getState();
        if (state instanceof d.a) {
            return new i.a.Error(((d.a) params.getState()).getVmsAdapter());
        }
        if (state instanceof hd2.f) {
            return i.a.c.f83786a;
        }
        if (!(state instanceof d.InterfaceC1927d)) {
            throw new p();
        }
        return new i.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(uc2.a.f197485s), null, null, null, 28, null), null, null, null, null, 61, null), new i.a.Initialized.HeaderData(this.labelProvider.c(e(((d.InterfaceC1927d) params.getState()).getData().getAllowedAction())), c(((d.InterfaceC1927d) params.getState()).getData().getAllowedAction())), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(uc2.a.f197488v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(((d.InterfaceC1927d) params.getState()).getData().getIdCardSeriesAndNumber()), "idCardSeriesAndNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new c30.b.c(null, null, null, this.labelProvider.c(uc2.a.f197486t), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(uc2.a.f197472f), this.commonEndpoints.l(), LinkData.EnumC5775a.WEBSITE, false, params.c(), 17, null)), 55, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uc2.a.f197473g), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), params.a());
    }
}
