package tb1;

import er.l;
import fr.t;
import h30.ButtonData;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import rb1.j;
import rb1.k;
import st3.AddressData;
import st3.AddressFormData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltb1/b;", "Lxw/f;", "Ltb1/b$a;", "Lrb1/k$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Ltb1/b$a;)Lrb1/k$a;", "Lst3/b;", "initialData", "Lst3/d;", "h", "(Lst3/b;)Lst3/d;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: tb1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Ltb1/b$a;", "", "Lrb1/j;", "state", "Lkotlin/Function1;", "Lhb1/c;", "Loq/i0;", "onSelectAction", "Lkotlin/Function0;", "onEnterNewAddress", "onNextAction", "onBackAction", "<init>", "(Lrb1/j;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrb1/j;", "e", "()Lrb1/j;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<hb1.c, i0> onSelectAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterNewAddress;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j jVar, l<? super hb1.c, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = jVar;
            this.onSelectAction = lVar;
            this.onEnterNewAddress = aVar;
            this.onNextAction = aVar2;
            this.onBackAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onEnterNewAddress;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        public final l<hb1.c, i0> d() {
            return this.onSelectAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final j getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectAction, params.onSelectAction) && t.c(this.onEnterNewAddress, params.onEnterNewAddress) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onSelectAction.hashCode()) * 31) + this.onEnterNewAddress.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectAction=" + this.onSelectAction + ", onEnterNewAddress=" + this.onEnterNewAddress + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, hb1.c cVar) {
        params.d().b(cVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k.a b(final Params params) {
        j0 error;
        j state = params.getState();
        if (t.c(state, j.a.f172929a)) {
            return k.a.C4410a.f172939a;
        }
        if (!(state instanceof j.Initialized)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(ha1.a.f82373c2);
        Label labelC2 = this.labelProvider.c(ha1.a.f82365b2);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), d.a.f107773a, null, params.c(), 35, null);
        er.a<i0> aVarA = params.a();
        List<hb1.c> listC = ((j.Initialized) params.getState()).c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final hb1.c cVar = (hb1.c) obj;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: tb1.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, cVar);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.d(cVar.toString(), "address_" + i15), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new n50.d.RadioButton(((j.Initialized) params.getState()).getSelectionState() == j.c.AddressSelected && t.c(((j.Initialized) params.getState()).getSelectedAddress(), cVar), false, 2, null), null, 5, null), null, null, 3325, null));
            i15 = i16;
        }
        List listM0 = v.M0(arrayList, new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ha1.a.Q1), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new n50.d.RadioButton(((j.Initialized) params.getState()).getSelectionState() == j.c.EnterNewAddress, false, 2, null), null, 5, null), null, null, 3325, null));
        hz.b validationState = ((j.Initialized) params.getState()).getValidationState();
        if (validationState instanceof hz.b.Invalid) {
            error = new j0.Error(this.labelProvider.c(ha1.a.f82426j));
        } else {
            if (!t.c(validationState, hz.b.C2039b.f86846c) && !t.c(validationState, hz.b.d.f86848c)) {
                throw new p();
            }
            error = j0.a.f132074a;
        }
        return new k.a.Initialized(labelC, labelC2, new CardListData(listM0, error, false, null, null, 28, null), aVarA, buttonData);
    }

    public final AddressFormData h(AddressData initialData) {
        return new AddressFormData(null, false, null, this.labelProvider.c(ha1.a.f82365b2), null, null, initialData, 53, null);
    }
}
