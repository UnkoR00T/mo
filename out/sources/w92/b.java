package w92;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import k30.d;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import v92.c;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lw92/b;", "Lxw/f;", "Lw92/b$a;", "Lv92/c$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "e", "(Lw92/b$a;)Lv92/c$a;", "a", "Lmx/c;", "b", "Lu04/a;", "heatingsupplement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: w92.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006\""}, d2 = {"Lw92/b$a;", "", "Lv92/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "onApplicationButtonAction", "onMoreInfoLinkAction", "onGoToInfoPage", "<init>", "(Lv92/b;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv92/b;", "e", "()Lv92/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "heatingsupplement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v92.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onApplicationButtonAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onMoreInfoLinkAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToInfoPage;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(v92.b bVar, er.a<i0> aVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onApplicationButtonAction = lVar;
            this.onMoreInfoLinkAction = lVar2;
            this.onGoToInfoPage = aVar2;
        }

        public final l<String, i0> a() {
            return this.onApplicationButtonAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onGoToInfoPage;
        }

        public final l<String, i0> d() {
            return this.onMoreInfoLinkAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final v92.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onApplicationButtonAction, params.onApplicationButtonAction) && t.c(this.onMoreInfoLinkAction, params.onMoreInfoLinkAction) && t.c(this.onGoToInfoPage, params.onGoToInfoPage);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onApplicationButtonAction.hashCode()) * 31) + this.onMoreInfoLinkAction.hashCode()) * 31) + this.onGoToInfoPage.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onApplicationButtonAction=" + this.onApplicationButtonAction + ", onMoreInfoLinkAction=" + this.onMoreInfoLinkAction + ", onGoToInfoPage=" + this.onGoToInfoPage + ')';
        }
    }

    public b(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, b bVar) {
        params.a().b(bVar.commonEndpoints.X());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        v92.b state = params.getState();
        if (!t.c(state, v92.b.C5360b.f205489a)) {
            if (t.c(state, v92.b.a.f205488a)) {
                return new c.a.InfoPage(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null), this.labelProvider.c(s92.a.f179482q), this.labelProvider.c(s92.a.f179473h), this.labelProvider.c(s92.a.f179474i), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(s92.a.f179475j)), new t40.a.C4874a(this.labelProvider.c(s92.a.f179476k)), new t40.a.C4874a(this.labelProvider.c(s92.a.f179477l)), new t40.a.C4874a(this.labelProvider.c(s92.a.f179478m)))), this.labelProvider.c(s92.a.f179479n), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(s92.a.f179480o)), new t40.a.C4874a(this.labelProvider.c(s92.a.f179481p)))), params.b());
            }
            throw new p();
        }
        return new c.a.WelcomePage(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(s92.a.f179488w), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(s92.a.f179487v), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(s92.a.f179484s)), new t40.a.C4874a(this.labelProvider.c(s92.a.f179485t)), new t40.a.C4874a(this.labelProvider.c(s92.a.f179486u)))), new ButtonTextData("more_info_button", this.labelProvider.c(s92.a.f179483r), null, null, params.c(), 12, null), new c30.b.c(null, null, null, this.labelProvider.c(s92.a.f179472g), null, null, new c30.a.Link(new LinkData("moreInfoLink", this.labelProvider.c(s92.a.f179467b), this.commonEndpoints.e(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 16, null)), 55, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(s92.a.f179469d), null, 2, null), d.a.f107773a, null, new er.a() { // from class: w92.a
            @Override // er.a
            public final Object a() {
                return b.f(params, this);
            }
        }, 35, null));
    }
}
