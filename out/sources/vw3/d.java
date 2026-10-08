package vw3;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvw3/d;", "Lxw/f;", "Lvw3/d$a;", "Luw3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lvw3/d$a;)Luw3/c$a;", "a", "Lmx/c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, uw3.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vw3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, d2 = {"Lvw3/d$a;", "", "Luw3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onAddPhotoClick", "onTakePhotoClick", "onBack", "<init>", "(Luw3/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luw3/b;", "getState", "()Luw3/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final uw3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddPhotoClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTakePhotoClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(uw3.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onAddPhotoClick = aVar;
            this.onTakePhotoClick = aVar2;
            this.onBack = aVar3;
        }

        public final er.a<i0> a() {
            return this.onAddPhotoClick;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onTakePhotoClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onAddPhotoClick, params.onAddPhotoClick) && t.c(this.onTakePhotoClick, params.onTakePhotoClick) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onAddPhotoClick.hashCode()) * 31) + this.onTakePhotoClick.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAddPhotoClick=" + this.onAddPhotoClick + ", onTakePhotoClick=" + this.onTakePhotoClick + ", onBack=" + this.onBack + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public uw3.c.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(bw3.a.T), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(bw3.a.J);
        List listQ = v.q(new uw3.c.Data.Section(this.labelProvider.c(bw3.a.S), v.q(this.labelProvider.c(bw3.a.O), this.labelProvider.c(bw3.a.P), this.labelProvider.c(bw3.a.Q), this.labelProvider.c(bw3.a.R))), new uw3.c.Data.Section(this.labelProvider.c(bw3.a.N), v.q(this.labelProvider.c(bw3.a.K), this.labelProvider.c(bw3.a.L), this.labelProvider.c(bw3.a.M))));
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(bw3.a.f21868f), null, null, 0, 0, null, 62, null)), null, 5, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, null, null, null, 30, null), 3, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new uw3.c.Data(baseScaffoldData, labelC, listQ, v.q(new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2301, null), new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(bw3.a.f21870g), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106818m, null, null, null, null, 30, null), 3, null), companion.b(), null, 2301, null)));
    }
}
