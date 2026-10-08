package og1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import k30.d;
import mg1.n;
import mg1.o;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Log1/a;", "Lxw/f;", "Log1/a$a;", "Lmg1/o$a;", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "<init>", "(Lmx/c;Lia1/a;)V", "params", "c", "(Log1/a$a;)Lmg1/o$a;", "a", "Lmx/c;", "b", "Lia1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, o.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: og1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Log1/a$a;", "", "Lmg1/n;", "state", "Lkotlin/Function0;", "Loq/i0;", "onOpenInfoPageAction", "onCloseAction", "Lkotlin/Function1;", "", "onOpenUrlAction", "onSubmitAction", "<init>", "(Lmg1/n;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmg1/n;", "e", "()Lmg1/n;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenInfoPageAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOpenUrlAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSubmitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(n nVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, er.a<i0> aVar3) {
            this.state = nVar;
            this.onOpenInfoPageAction = aVar;
            this.onCloseAction = aVar2;
            this.onOpenUrlAction = lVar;
            this.onSubmitAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onCloseAction;
        }

        public final er.a<i0> b() {
            return this.onOpenInfoPageAction;
        }

        public final l<String, i0> c() {
            return this.onOpenUrlAction;
        }

        public final er.a<i0> d() {
            return this.onSubmitAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final n getState() {
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
            return t.c(this.state, params.state) && t.c(this.onOpenInfoPageAction, params.onOpenInfoPageAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onOpenUrlAction, params.onOpenUrlAction) && t.c(this.onSubmitAction, params.onSubmitAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onOpenInfoPageAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onOpenUrlAction.hashCode()) * 31) + this.onSubmitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onOpenInfoPageAction=" + this.onOpenInfoPageAction + ", onCloseAction=" + this.onCloseAction + ", onOpenUrlAction=" + this.onOpenUrlAction + ", onSubmitAction=" + this.onSubmitAction + ')';
        }
    }

    public a(c cVar, ia1.a aVar) {
        this.labelProvider = cVar;
        this.companyEndpoints = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a b(Params params) {
        n state = params.getState();
        if (state instanceof n.b) {
            return o.a.b.f126374a;
        }
        if (!(state instanceof n.c)) {
            if (!(state instanceof n.a)) {
                throw new p();
            }
            return new o.a.InfoPage(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(ha1.a.G), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(ha1.a.Q5), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.M5)), new t40.a.C4874a(this.labelProvider.c(ha1.a.N5)), new t40.a.C4874a(this.labelProvider.c(ha1.a.O5)), new t40.a.C4874a(this.labelProvider.c(ha1.a.P5)))), this.labelProvider.c(ha1.a.R5), new LinkData(null, this.labelProvider.c(ha1.a.J4), this.companyEndpoints.H(), LinkData.EnumC5775a.WEBSITE, false, params.c(), 17, null), params.a());
        }
        return new o.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82547z4), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(ha1.a.V5), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.f82385d6), null, 2, null), d.a.f107773a, null, params.d(), 35, null), this.labelProvider.c(ha1.a.K5), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.H5)), new t40.a.C4874a(this.labelProvider.c(ha1.a.I5)), new t40.a.C4874a(this.labelProvider.c(ha1.a.J5)))), this.labelProvider.c(ha1.a.U5), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.S5)), new t40.a.C4874a(this.labelProvider.c(ha1.a.T5)))), new ButtonTextData(null, this.labelProvider.c(ha1.a.L5), null, null, params.b(), 13, null));
    }
}
