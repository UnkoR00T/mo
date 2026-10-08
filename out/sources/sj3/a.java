package sj3;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import rj3.State;
import rj3.l;
import tj3.b;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsj3/a;", "Lxw/f;", "Lsj3/a$a;", "Lrj3/l$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lsj3/a$a;)Lrj3/l$a;", "a", "Lmx/c;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, l.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: sj3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsj3/a$a;", "", "Lrj3/k;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "<init>", "(Lrj3/k;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrj3/k;", "b", "()Lrj3/k;", "Ler/a;", "()Ler/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.closeAction = aVar;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.closeAction, params.closeAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l.Data b(Params params) {
        Label labelB;
        Label labelB2;
        IconPageData iconPageData;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        if ((state.getPayload() instanceof b.ServiceNoData) && ((b.ServiceNoData) state.getPayload()).getIsError()) {
            iconPageData = new IconPageData(j.b.a.f164684d, mx.b.b(((b.ServiceNoData) state.getPayload()).getTitle(), "title"), mx.b.b(((b.ServiceNoData) state.getPayload()).getMessage(), "message"), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(yi3.a.f227209a), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), true, 8, null);
        } else if (state.getPayload() instanceof b.a) {
            iconPageData = new IconPageData(j.b.a.f164684d, this.labelProvider.c(yi3.a.f227215c), this.labelProvider.c(yi3.a.f227239k), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(yi3.a.f227209a), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), true, 8, null);
        } else {
            j.b.C4090b c4090b = j.b.C4090b.f164686d;
            b payload = state.getPayload();
            b.C4976b c4976b = b.C4976b.f190522a;
            if (t.c(payload, c4976b)) {
                labelB = this.labelProvider.c(yi3.a.G);
            } else if (t.c(payload, b.c.f190523a)) {
                labelB = this.labelProvider.c(yi3.a.D);
            } else {
                labelB = payload instanceof b.ServiceNoData ? mx.b.b(((b.ServiceNoData) state.getPayload()).getTitle(), "title") : Label.INSTANCE.c();
            }
            Label label = labelB;
            b payload2 = state.getPayload();
            if (t.c(payload2, c4976b)) {
                labelB2 = this.labelProvider.c(yi3.a.F);
            } else if (t.c(payload2, b.c.f190523a)) {
                labelB2 = this.labelProvider.c(yi3.a.E);
            } else {
                labelB2 = payload2 instanceof b.ServiceNoData ? mx.b.b(((b.ServiceNoData) state.getPayload()).getMessage(), "message") : Label.INSTANCE.c();
            }
            iconPageData = new IconPageData(c4090b, label, labelB2, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(yi3.a.f227209a), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), true, 8, null);
        }
        return new l.Data(baseScaffoldData, iconPageData);
    }
}
