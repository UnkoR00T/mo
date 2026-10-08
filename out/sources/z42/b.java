package z42;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y42.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0012\u001a\u00020\u0011*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lz42/b;", "Lxw/f;", "Lz42/b$a;", "Ly42/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ly42/f$b;", "Ly42/g$a$b$a;", "contentData", "Lkotlin/Function0;", "Loq/i0;", "primaryAction", "backAction", "closeAction", "onSnackBarHidden", "Ly42/g$a$b;", "f", "(Ly42/f$b;Ly42/g$a$b$a;Ler/a;Ler/a;Ler/a;Ler/a;)Ly42/g$a$b;", "Lh30/a;", "c", "(Ler/a;)Lh30/a;", "params", "e", "(Lz42/b$a;)Ly42/g$a;", "a", "Lmx/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: z42.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lz42/b$a;", "", "Ly42/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onResultPrimaryAction", "onResultCloseAction", "onSnackBarHidden", "<init>", "(Ly42/f;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly42/f;", "e", "()Ly42/f;", "b", "Ler/a;", "()Ler/a;", "c", "d", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y42.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResultPrimaryAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResultCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        public Params(y42.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = fVar;
            this.onBackAction = aVar;
            this.onResultPrimaryAction = aVar2;
            this.onResultCloseAction = aVar3;
            this.onSnackBarHidden = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onResultCloseAction;
        }

        public final er.a<i0> c() {
            return this.onResultPrimaryAction;
        }

        public final er.a<i0> d() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final y42.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onResultPrimaryAction, params.onResultPrimaryAction) && t.c(this.onResultCloseAction, params.onResultCloseAction) && t.c(this.onSnackBarHidden, params.onSnackBarHidden);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onResultPrimaryAction.hashCode()) * 31) + this.onResultCloseAction.hashCode()) * 31) + this.onSnackBarHidden.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onResultPrimaryAction=" + this.onResultPrimaryAction + ", onResultCloseAction=" + this.onResultCloseAction + ", onSnackBarHidden=" + this.onSnackBarHidden + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final ButtonData c(er.a<i0> backAction) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.L0), null, 2, null), d.a.f107773a, null, backAction, 35, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x015e  */
    private final g.a.Result f(y42.f.b bVar, g.a.Result.ContentData contentData, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
        Label labelC;
        if (bVar instanceof y42.f.b.Success) {
            return new g.a.Result(new IconPageData(j.b.c.f164688d, this.labelProvider.c(t32.b.V1), null, null, contentData, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.M0), null, 2, null), d.a.f107773a, null, aVar, 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.L0), null, 2, null), new d.Secondary(null, 1, null), null, aVar2, 35, null), null, 4, null), true, 12, null), aVar2, aVar4, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), aVar3), null, null, null, null, 30, null), null, null, null, null, 61, null), ((y42.f.b.Success) bVar).getDialog());
        }
        if (bVar instanceof y42.f.b.Info) {
            return new g.a.Result(new IconPageData(j.b.C4090b.f164686d, this.labelProvider.c(t32.b.f187484q), this.labelProvider.c(t32.b.T), null, contentData, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t32.b.L0), null, 2, null), d.a.f107773a, null, aVar2, 35, null), null, null, 4, null), true, 8, null), aVar2, aVar4, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), aVar3), null, null, null, null, 30, null), null, null, null, null, 61, null), ((y42.f.b.Info) bVar).getDialog());
        }
        if (!(bVar instanceof y42.f.b.a)) {
            throw new p();
        }
        j.b.a aVar5 = j.b.a.f164684d;
        y42.f.b.a aVar6 = (y42.f.b.a) bVar;
        Label title = aVar6.getTitle();
        if (title == null) {
            labelC = this.labelProvider.c(t32.b.f187463j);
        } else {
            labelC = title.l() ? title : null;
            if (labelC == null) {
                labelC = this.labelProvider.c(t32.b.f187463j);
            }
        }
        return new g.a.Result(new IconPageData(aVar5, labelC, aVar6.getMessage(), null, contentData, new IconPageBottomContentData(c(aVar2), null, null, 6, null), true, 8, null), aVar2, aVar4, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), aVar3), null, null, null, null, 30, null), null, null, null, null, 61, null), bVar.getDialog());
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        y42.f state = params.getState();
        if (state instanceof y42.f.a) {
            return g.a.C5997a.f224073a;
        }
        if (!(state instanceof y42.f.b)) {
            throw new p();
        }
        return f((y42.f.b) params.getState(), new g.a.Result.ContentData(this.labelProvider.c(t32.b.P0), ((y42.f.b) params.getState()).getPaymentTitle(), this.labelProvider.c(t32.b.K0), ((y42.f.b) params.getState()).getPaymentAmount()), params.c(), params.a(), params.b(), params.d());
    }
}
