package yt3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyt3/d;", "Lxw/f;", "Lyt3/d$a;", "Lyt3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lst3/a;", "Lc30/b;", "e", "(Lst3/a;)Lc30/b;", "params", "c", "(Lyt3/d$a;)Lyt3/c$a;", "a", "Lmx/c;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: yt3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lyt3/d$a;", "", "Lyt3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClicked", "onCloseClicked", "onBackClicked", "<init>", "(Lyt3/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyt3/b;", "d", "()Lyt3/b;", "b", "Ler/a;", "c", "()Ler/a;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClicked;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onNextButtonClicked = aVar;
            this.onCloseClicked = aVar2;
            this.onBackClicked = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackClicked;
        }

        public final er.a<i0> b() {
            return this.onCloseClicked;
        }

        public final er.a<i0> c() {
            return this.onNextButtonClicked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onNextButtonClicked, params.onNextButtonClicked) && fr.t.c(this.onCloseClicked, params.onCloseClicked) && fr.t.c(this.onBackClicked, params.onBackClicked);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onNextButtonClicked.hashCode()) * 31) + this.onCloseClicked.hashCode()) * 31) + this.onBackClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClicked=" + this.onNextButtonClicked + ", onCloseClicked=" + this.onCloseClicked + ", onBackClicked=" + this.onBackClicked + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final c30.b e(st3.a aVar) {
        if (aVar instanceof st3.a.Info) {
            return new c30.b.c(null, null, null, ((st3.a.Info) aVar).getBodyText(), null, null, null, 119, null);
        }
        if (aVar instanceof st3.a.c) {
            return new c30.b.d(null, null, null, ((st3.a.c) aVar).a(), null, null, null, 119, null);
        }
        if (aVar instanceof st3.a.Warning) {
            return new c30.b.e(null, null, null, ((st3.a.Warning) aVar).getBodyText(), null, null, null, 119, null);
        }
        if (aVar instanceof st3.a.C4757a) {
            return new c30.b.C0606b(null, null, null, ((st3.a.C4757a) aVar).a(), null, null, null, 119, null);
        }
        throw new oq.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        BaseScaffoldData baseScaffoldData;
        boolean includeTopMenu = params.getState().getAddressFormData().getIncludeTopMenu();
        Boolean boolValueOf = Boolean.valueOf(includeTopMenu);
        if (!includeTopMenu) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            Label topMenuTitle = params.getState().getAddressFormData().getTopMenuTitle();
            if (topMenuTitle == null) {
                topMenuTitle = Label.INSTANCE.c();
            }
            baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), topMenuTitle, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, 0 == true ? 1 : 0), null, null, null, null, 61, null);
        } else {
            baseScaffoldData = null;
        }
        st3.g addressFormVMS = params.getState().getAddressFormVMS();
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(rt3.a.f176108k), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null);
        Label title = params.getState().getAddressFormData().getTitle();
        Label subtitle = params.getState().getAddressFormData().getSubtitle();
        st3.a bottomAlertData = params.getState().getAddressFormData().getBottomAlertData();
        return new c.Data(baseScaffoldData, addressFormVMS, title, subtitle, bottomAlertData != null ? e(bottomAlertData) : null, buttonData, params.a());
    }
}
