package tp2;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import sp2.State;
import sp2.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltp2/b;", "Lxw/f;", "Ltp2/b$a;", "Lsp2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Ltp2/b$a;)Lsp2/d$a;", "a", "Lmx/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: tp2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Ltp2/b$a;", "", "Lsp2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lnq2/c;", "goBackWithResult", "<init>", "(Lsp2/c;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsp2/c;", "c", "()Lsp2/c;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<nq2.c, i0> goBackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super nq2.c, i0> lVar) {
            this.state = state;
            this.onBackAction = aVar;
            this.goBackWithResult = lVar;
        }

        public final l<nq2.c, i0> a() {
            return this.goBackWithResult;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.goBackWithResult, params.goBackWithResult);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.goBackWithResult.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", goBackWithResult=" + this.goBackWithResult + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, nq2.c cVar) {
        params.a().b(cVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(bp2.a.A0), null, null, null, 28, null), null, null, null, null, 61, null);
        wq.a<nq2.c> aVarE = nq2.c.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        for (final nq2.c cVar : aVarE) {
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(cVar.getResId()), null, null, 0, 0, null, 62, null)), null, 5, null);
            x0.Icon iconA = x0.Icon.INSTANCE.a();
            if (params.getState().getSelectedDocumentType() != cVar) {
                iconA = null;
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: tp2.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, cVar);
                }
            }, false, null, null, false, null, null, bodySection, null, iconA, null, 2813, null));
        }
        return new d.Data(baseScaffoldData, new CardListData(arrayList, null, false, null, null, 30, null), params.b());
    }
}
