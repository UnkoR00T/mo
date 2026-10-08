package mc1;

import er.l;
import fr.t;
import h30.ButtonData;
import java.util.ArrayList;
import java.util.List;
import kc1.g;
import kc1.h;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.d;
import n50.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import st3.AddressData;
import st3.AddressFormData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmc1/b;", "Lxw/f;", "Lmc1/b$a;", "Lkc1/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lst3/b;", "initialData", "Lst3/d;", "h", "(Lst3/b;)Lst3/d;", "params", "e", "(Lmc1/b$a;)Lkc1/h$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: mc1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u0019\u0010#¨\u0006%"}, d2 = {"Lmc1/b$a;", "", "Lkc1/g;", "state", "Lkotlin/Function1;", "Lhb1/c;", "Loq/i0;", "onSelectAddress", "Lkotlin/Function0;", "onEnterNewAddress", "onEnterPostOfficeData", "nextAction", "backAction", "<init>", "(Lkc1/g;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkc1/g;", "f", "()Lkc1/g;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<hb1.c, i0> onSelectAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterNewAddress;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterPostOfficeData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, l<? super hb1.c, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = gVar;
            this.onSelectAddress = lVar;
            this.onEnterNewAddress = aVar;
            this.onEnterPostOfficeData = aVar2;
            this.nextAction = aVar3;
            this.backAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final er.a<i0> c() {
            return this.onEnterNewAddress;
        }

        public final er.a<i0> d() {
            return this.onEnterPostOfficeData;
        }

        public final l<hb1.c, i0> e() {
            return this.onSelectAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSelectAddress, params.onSelectAddress) && t.c(this.onEnterNewAddress, params.onEnterNewAddress) && t.c(this.onEnterPostOfficeData, params.onEnterPostOfficeData) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onSelectAddress.hashCode()) * 31) + this.onEnterNewAddress.hashCode()) * 31) + this.onEnterPostOfficeData.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectAddress=" + this.onSelectAddress + ", onEnterNewAddress=" + this.onEnterNewAddress + ", onEnterPostOfficeData=" + this.onEnterPostOfficeData + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, hb1.c cVar) {
        params.e().b(cVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h.a b(final Params params) {
        j0 error;
        g state = params.getState();
        if (!(state instanceof g.DataDisplayed)) {
            if (t.c(state, g.b.f109934a)) {
                return h.a.b.f109946a;
            }
            throw new p();
        }
        Label labelC = this.labelProvider.c(ha1.a.f82453m2);
        Label labelC2 = this.labelProvider.c(ha1.a.f82445l2);
        g.DataDisplayed dataDisplayed = (g.DataDisplayed) state;
        List<hb1.c> listC = dataDisplayed.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final hb1.c cVar = (hb1.c) obj;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: mc1.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, cVar);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.d(cVar.toString(), "address_" + i15), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new d.RadioButton(dataDisplayed.getSelectionState() == g.c.AddressSelected && t.c(dataDisplayed.getSelectedAddress(), cVar), false, 2, null), null, 5, null), null, null, 3325, null));
            i15 = i16;
        }
        List listM0 = v.M0(v.M0(arrayList, new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ha1.a.f82413h2), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new d.RadioButton(dataDisplayed.getSelectionState() == g.c.PostOfficeBox, false, 2, null), null, 5, null), null, null, 3325, null)), new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ha1.a.Q1), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new d.RadioButton(dataDisplayed.getSelectionState() == g.c.EnterNewAddress, false, 2, null), null, 5, null), null, null, 3325, null));
        hz.b validation = dataDisplayed.getValidation();
        if (t.c(validation, hz.b.C2039b.f86846c)) {
            error = j0.a.f132074a;
        } else if (validation instanceof hz.b.Invalid) {
            error = new j0.Error(this.labelProvider.c(ha1.a.f82426j));
        } else {
            if (!t.c(validation, hz.b.d.f86848c)) {
                throw new p();
            }
            error = j0.a.f132074a;
        }
        return new h.a.DataDisplayed(labelC, labelC2, new CardListData(listM0, error, false, null, null, 28, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), params.a());
    }

    public final AddressFormData h(AddressData initialData) {
        return new AddressFormData(null, false, null, this.labelProvider.c(ha1.a.f82381d2), this.labelProvider.c(ha1.a.f82445l2), null, initialData, 37, null);
    }
}
