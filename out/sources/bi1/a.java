package bi1;

import ai1.State;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.b;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbi1/a;", "Lxw/f;", "Lbi1/a$a;", "Lai1/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lbi1/a$a;)Lai1/f$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, ai1.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: bi1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lbi1/a$a;", "", "Lai1/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onConfirmClick", "onCheckClick", "onSignClick", "<init>", "(Lai1/e;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lai1/e;", "d", "()Lai1/e;", "b", "Ler/a;", "()Ler/a;", "c", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCheckClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSignClick;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onConfirmClick = aVar;
            this.onCheckClick = aVar2;
            this.onSignClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onCheckClick;
        }

        public final er.a<i0> b() {
            return this.onConfirmClick;
        }

        public final er.a<i0> c() {
            return this.onSignClick;
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
            return t.c(this.state, params.state) && t.c(this.onConfirmClick, params.onConfirmClick) && t.c(this.onCheckClick, params.onCheckClick) && t.c(this.onSignClick, params.onSignClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onConfirmClick.hashCode()) * 31) + this.onCheckClick.hashCode()) * 31) + this.onSignClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onConfirmClick=" + this.onConfirmClick + ", onCheckClick=" + this.onCheckClick + ", onSignClick=" + this.onSignClick + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ai1.f.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Medium(null, this.labelProvider.c(sg1.a.f181478h2), null, null, true, null, 45, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(sg1.a.f181474g2);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(sg1.a.f181494l2), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(sg1.a.f181490k2), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106785h1, null, null, null, null, 30, null), 3, null), new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(sg1.a.f181486j2), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(sg1.a.f181482i2), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106792i1, null, null, null, null, 30, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(sg1.a.f181493l1), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(sg1.a.f181489k1), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.B, null, null, null, null, 30, null), 3, null), new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
        if (!params.getState().getIsQualifiedSignatureActive()) {
            defaultSingleCardData3 = null;
        }
        return new ai1.f.Data(labelC, baseScaffoldData, defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3);
    }
}
