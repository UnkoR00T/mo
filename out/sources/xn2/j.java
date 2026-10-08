package xn2;

import i50.BaseScaffoldData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxn2/j;", "Lxw/f;", "Lxn2/j$a;", "Lxn2/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lxn2/j$a;)Lxn2/i$a;", "Lmx/a;", "e", "()Lmx/a;", "c", "f", "a", "Lmx/c;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, i.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xn2.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b!\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lxn2/j$a;", "", "Lxn2/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onMaliciousWebsiteAction", "onFraudAction", "onSuspiciousSmsAction", "onSuspiciousEmailAction", "onOtherAction", "<init>", "(Lxn2/h;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxn2/h;", "getState", "()Lxn2/h;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "f", "g", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMaliciousWebsiteAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFraudAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSuspiciousSmsAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSuspiciousEmailAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOtherAction;

        public Params(h hVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = hVar;
            this.onBackAction = aVar;
            this.onMaliciousWebsiteAction = aVar2;
            this.onFraudAction = aVar3;
            this.onSuspiciousSmsAction = aVar4;
            this.onSuspiciousEmailAction = aVar5;
            this.onOtherAction = aVar6;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onFraudAction;
        }

        public final er.a<i0> c() {
            return this.onMaliciousWebsiteAction;
        }

        public final er.a<i0> d() {
            return this.onOtherAction;
        }

        public final er.a<i0> e() {
            return this.onSuspiciousEmailAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.onMaliciousWebsiteAction, params.onMaliciousWebsiteAction) && fr.t.c(this.onFraudAction, params.onFraudAction) && fr.t.c(this.onSuspiciousSmsAction, params.onSuspiciousSmsAction) && fr.t.c(this.onSuspiciousEmailAction, params.onSuspiciousEmailAction) && fr.t.c(this.onOtherAction, params.onOtherAction);
        }

        public final er.a<i0> f() {
            return this.onSuspiciousSmsAction;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onMaliciousWebsiteAction.hashCode()) * 31) + this.onFraudAction.hashCode()) * 31) + this.onSuspiciousSmsAction.hashCode()) * 31) + this.onSuspiciousEmailAction.hashCode()) * 31) + this.onOtherAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onMaliciousWebsiteAction=" + this.onMaliciousWebsiteAction + ", onFraudAction=" + this.onFraudAction + ", onSuspiciousSmsAction=" + this.onSuspiciousSmsAction + ", onSuspiciousEmailAction=" + this.onSuspiciousEmailAction + ", onOtherAction=" + this.onOtherAction + ')';
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    public final Label c() {
        return this.labelProvider.c(q5.T);
    }

    public final Label e() {
        return this.labelProvider.c(q5.D0);
    }

    public final Label f() {
        return this.labelProvider.c(q5.F0);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q5.f219555k0), null, null, null, 28, null), null, null, null, null, 61, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.T), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.S), null, null, 0, 0, null, 62, null), 1, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new i.Data(baseScaffoldData, v.q(new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, bodySection, null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.D0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.C0), null, null, 0, 0, null, 62, null), 1, null), null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.f(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.f219540d1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.f219531a1), null, null, 0, 0, null, 62, null), 1, null), null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.e(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.X0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.T0), null, null, 0, 0, null, 62, null), 1, null), null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.F0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.E0), null, null, 0, 0, null, 62, null), 1, null), null, companion.b(), null, 2813, null)));
    }
}
