package rw2;

import al0.ParentOrGuardData;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import k30.d;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lrw2/c;", "Lxw/f;", "Lrw2/c$a;", "Lpw2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lal0/j0;", "Ln30/b;", "e", "(Lal0/j0;)Ln30/b;", "params", "c", "(Lrw2/c$a;)Lpw2/c$a;", "a", "Lmx/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, pw2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: rw2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lrw2/c$a;", "", "Lpw2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "onBack", "onClose", "<init>", "(Lpw2/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpw2/b;", "d", "()Lpw2/b;", "b", "Ler/a;", "c", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final pw2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(pw2.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onNextButtonClick = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onNextButtonClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final pw2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData e(ParentOrGuardData parentOrGuardData) {
        return new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.F), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(parentOrGuardData.getFirstName(), "firstName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77226a0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(parentOrGuardData.getSecondName(), "secondName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.L), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(parentOrGuardData.getSurname(), "surname"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.J), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(parentOrGuardData.getIdentityCardSeriesAndNumber()), "idCardSeriesAndNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public pw2.c.a b(Params params) {
        pw2.b state = params.getState();
        if (state instanceof pw2.b.Initial) {
            return pw2.c.a.C4036a.f163004a;
        }
        if (!(state instanceof pw2.b.Initialized)) {
            throw new p();
        }
        return new pw2.c.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gv2.a.A0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(gv2.a.f77335z0), e(((pw2.b.Initialized) params.getState()).getParentOrGuardData()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.I), null, 2, null), d.a.f107773a, null, params.c(), 35, null));
    }
}
