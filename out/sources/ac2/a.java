package ac2;

import er.l;
import fr.t;
import h30.ButtonData;
import hb2.b;
import i50.BaseScaffoldData;
import iy.b0;
import k30.d;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import yb2.State;
import yb2.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lac2/a;", "Lxw/f;", "Lac2/a$a;", "Lyb2/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lac2/a$a;)Lyb2/g$a;", "a", "Lmx/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ac2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Lac2/a$a;", "", "Lyb2/f;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onLinkClick", "Lkotlin/Function0;", "onNextButtonClick", "onBackClick", "onCloseClick", "<init>", "(Lyb2/f;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyb2/f;", "d", "()Lyb2/f;", "b", "Ler/l;", "getOnLinkClick", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "e", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onLinkClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onLinkClick = lVar;
            this.onNextButtonClick = aVar;
            this.onBackClick = aVar2;
            this.onCloseClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final er.a<i0> c() {
            return this.onNextButtonClick;
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
            return t.c(this.state, params.state) && t.c(this.onLinkClick, params.onLinkClick) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onLinkClick.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onLinkClick=" + this.onLinkClick + ", onNextButtonClick=" + this.onNextButtonClick + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        return new g.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(b.F), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(b.f82774a0), this.labelProvider.c(b.X), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(params.getState().getData().getDescriptiveOrganizationName(), "officeName"), null, null, 0, 0, null, 62, null)), null, 5, null), null, null, null, 3839, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(b.D), null, 2, null), d.a.f107773a, null, params.c(), 35, null));
    }
}
