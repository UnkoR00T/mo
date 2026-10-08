package sp1;

import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.j0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lsp1/e;", "Lxw/f;", "Lsp1/e$b;", "Lsp1/m$a;", "<init>", "()V", "params", "i", "(Lsp1/e$b;)Lsp1/m$a;", "a", "b", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, m.Data> {

    /* JADX INFO: renamed from: sp1.e$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lsp1/e$b;", "", "Lsp1/l;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "mutateCardListSelectedIndex", "mutateErrorCardListSelectedIndex", "<init>", "(Lsp1/l;Ler/a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp1/l;", "d", "()Lsp1/l;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Integer, i0> mutateCardListSelectedIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Integer, i0> mutateErrorCardListSelectedIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.l<? super Integer, i0> lVar, er.l<? super Integer, i0> lVar2) {
            this.state = state;
            this.onBackAction = aVar;
            this.mutateCardListSelectedIndex = lVar;
            this.mutateErrorCardListSelectedIndex = lVar2;
        }

        public final er.l<Integer, i0> a() {
            return this.mutateCardListSelectedIndex;
        }

        public final er.l<Integer, i0> b() {
            return this.mutateErrorCardListSelectedIndex;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.mutateCardListSelectedIndex, params.mutateCardListSelectedIndex) && fr.t.c(this.mutateErrorCardListSelectedIndex, params.mutateErrorCardListSelectedIndex);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.mutateCardListSelectedIndex.hashCode()) * 31) + this.mutateErrorCardListSelectedIndex.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", mutateCardListSelectedIndex=" + this.mutateCardListSelectedIndex + ", mutateErrorCardListSelectedIndex=" + this.mutateErrorCardListSelectedIndex + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.a().b(0);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.a().b(1);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.b().b(0);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.b().b(1);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public m.Data b(final Params params) {
        j0.Error error = new j0.Error(mx.b.b("Error text.", ""));
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description", ""), null, null, 0, 0, null, 62, null), 1, null);
        Integer cardListSelectedIndex = params.getState().getCardListSelectedIndex();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: sp1.a
            @Override // er.a
            public final Object a() {
                return e.l(params);
            }
        }, false, null, null, false, null, null, bodySection, new LeadingSection(false, new n50.d.RadioButton(cardListSelectedIndex != null && cardListSelectedIndex.intValue() == 0, true), null, 5, null), null, null, 3325, null);
        BodySection bodySection2 = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description 2", ""), null, null, 0, 0, null, 62, null), 1, null);
        Integer cardListSelectedIndex2 = params.getState().getCardListSelectedIndex();
        CardListData cardListData = new CardListData(pq.v.q(defaultSingleCardData, new DefaultSingleCardData(null, new er.a() { // from class: sp1.b
            @Override // er.a
            public final Object a() {
                return e.m(params);
            }
        }, false, null, null, false, null, null, bodySection2, new LeadingSection(false, new n50.d.RadioButton(cardListSelectedIndex2 != null && cardListSelectedIndex2.intValue() == 1, true), null, 5, null), null, null, 3325, null)), error, false, null, null, 28, null);
        BodySection bodySection3 = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description", ""), null, null, 0, 0, null, 62, null), 1, null);
        Integer errorCardListSelectedIndex = params.getState().getErrorCardListSelectedIndex();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, new er.a() { // from class: sp1.c
            @Override // er.a
            public final Object a() {
                return e.q(params);
            }
        }, false, null, null, false, null, null, bodySection3, new LeadingSection(false, new n50.d.RadioButton(errorCardListSelectedIndex != null && errorCardListSelectedIndex.intValue() == 0, false, 2, null), null, 5, null), null, null, 3325, null);
        BodySection bodySection4 = new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description 2", ""), null, null, 0, 0, null, 62, null), 1, null);
        Integer errorCardListSelectedIndex2 = params.getState().getErrorCardListSelectedIndex();
        return new m.Data(new CardListData(pq.v.q(defaultSingleCardData2, new DefaultSingleCardData(null, new er.a() { // from class: sp1.d
            @Override // er.a
            public final Object a() {
                return e.r(params);
            }
        }, false, null, null, false, null, null, bodySection4, new LeadingSection(false, new n50.d.RadioButton(errorCardListSelectedIndex2 != null && errorCardListSelectedIndex2.intValue() == 1, false, 2, null), null, 5, null), null, null, 3325, null)), null, false, null, null, 30, null), cardListData, new CardListData(pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description", ""), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, new n50.d.CheckBox(false, 1, null), null, 5, null), null, null, 3327, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description 2", ""), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, new n50.d.CheckBox(false, 1, null), null, 5, null), null, null, 3327, null)), null, false, null, null, 30, null), new CardListData(pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description", ""), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, new n50.d.CheckBox(false, 1, null), null, 5, null), null, null, 3327, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b("Card title 2", ""), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b("Card description 2", ""), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, new n50.d.CheckBox(false, 1, null), null, 5, null), null, null, 3327, null)), new j0.Error(mx.b.b("Error text.", "")), false, null, null, 28, null), params.c());
    }
}
