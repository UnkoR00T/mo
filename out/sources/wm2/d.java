package wm2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t50.TextAreaData;
import x50.NavigationButtonData;
import xl2.q5;
import zm2.NetworkSecurityIssuesIllegalContentAddressErrorData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lwm2/d;", "Lxw/f;", "Lwm2/d$b;", "Lwm2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "Lt50/e;", "h", "(Lhz/b;)Lt50/e;", "", "f", "(Lhz/b;)Z", "Lmx/a;", "c", "(Lhz/b;)Lmx/a;", "params", "e", "(Lwm2/d$b;)Lwm2/c$a;", "a", "Lmx/c;", "b", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f214103c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: wm2.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lwm2/d$b;", "", "Lwm2/b;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "illegalContentAddressChangedAction", "Lkotlin/Function0;", "onBackAction", "onNextAction", "<init>", "(Lwm2/b;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwm2/b;", "d", "()Lwm2/b;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f214105e = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> illegalContentAddressChangedAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super String, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.illegalContentAddressChangedAction = lVar;
            this.onBackAction = aVar;
            this.onNextAction = aVar2;
        }

        public final er.l<String, i0> a() {
            return this.illegalContentAddressChangedAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
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
            return t.c(this.state, params.state) && t.c(this.illegalContentAddressChangedAction, params.illegalContentAddressChangedAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onNextAction, params.onNextAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.illegalContentAddressChangedAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onNextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", illegalContentAddressChangedAction=" + this.illegalContentAddressChangedAction + ", onBackAction=" + this.onBackAction + ", onNextAction=" + this.onNextAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(hz.b bVar) {
        return bVar instanceof hz.b.Invalid ? ((hz.b.Invalid) bVar).getMessage() : Label.INSTANCE.c();
    }

    private final boolean f(hz.b bVar) {
        return bVar instanceof hz.b.Invalid;
    }

    private final t50.e h(hz.b bVar) {
        return bVar instanceof hz.b.Invalid ? new t50.e.Error(((hz.b.Invalid) bVar).getMessage()) : new t50.e.Default(null, 1, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(q5.f219532b), null, null, null, 28, null), null, null, null, null, 61, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q5.f219529a), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null);
        NetworkSecurityIssuesIllegalContentAddressErrorData networkSecurityIssuesIllegalContentAddressErrorData = new NetworkSecurityIssuesIllegalContentAddressErrorData(c(params.getState().getValidationState()), f(params.getState().getValidationState()));
        t50.s.Fix fix = new t50.s.Fix(4);
        Label labelC = this.labelProvider.c(q5.A);
        t50.a.C4878a c4878a = t50.a.C4878a.f187691a;
        String text = mx.b.b(params.getState().getIllegalContentAddress(), "illegalContentAddress").getText();
        return new c.Data(baseScaffoldData, buttonData, networkSecurityIssuesIllegalContentAddressErrorData, new TextAreaData(null, labelC, fix, null, h(params.getState().getValidationState()), text, false, c4878a, Label.INSTANCE.c(), 0, null, null, params.a(), null, 11849, null));
    }
}
