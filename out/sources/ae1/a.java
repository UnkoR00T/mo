package ae1;

import c30.b;
import fr.t;
import h30.ButtonData;
import java.util.List;
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
import yd1.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lae1/a;", "Lxw/f;", "Lae1/a$a;", "Lyd1/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lst3/b;", "initialData", "Lst3/d;", "e", "(Lst3/b;)Lst3/d;", "params", "c", "(Lae1/a$a;)Lyd1/g$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ae1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lae1/a$a;", "", "Lyd1/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onSelectPermanentAddress", "onEnterNewAddress", "nextAction", "backAction", "<init>", "(Lyd1/f;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyd1/f;", "e", "()Lyd1/f;", "b", "Ler/a;", "d", "()Ler/a;", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yd1.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSelectPermanentAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterNewAddress;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        public Params(yd1.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = fVar;
            this.onSelectPermanentAddress = aVar;
            this.onEnterNewAddress = aVar2;
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
            return this.onSelectPermanentAddress;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final yd1.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectPermanentAddress, params.onSelectPermanentAddress) && t.c(this.onEnterNewAddress, params.onEnterNewAddress) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onSelectPermanentAddress.hashCode()) * 31) + this.onEnterNewAddress.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectPermanentAddress=" + this.onSelectPermanentAddress + ", onEnterNewAddress=" + this.onEnterNewAddress + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        j0 error;
        yd1.f state = params.getState();
        if (!(state instanceof yd1.f.DataDisplayed)) {
            if (t.c(state, yd1.f.b.f226515a)) {
                return g.a.b.f226526a;
            }
            throw new p();
        }
        Label labelC = this.labelProvider.c(ha1.a.S1);
        b.c cVar = new b.c(null, null, null, this.labelProvider.c(ha1.a.P1), null, null, null, 119, null);
        yd1.f.DataDisplayed dataDisplayed = (yd1.f.DataDisplayed) state;
        hb1.c permanentAddress = dataDisplayed.getPermanentAddress();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ha1.a.R1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(permanentAddress != null ? permanentAddress.toString() : null, "permanentAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), new LeadingSection(false, new d.RadioButton(dataDisplayed.getSelectionState() == yd1.f.c.PermanentAddressSelection, false, 2, null), null, 5, null), null, null, 3325, null);
        if (!hb1.d.c(dataDisplayed.getPermanentAddress())) {
            defaultSingleCardData = null;
        }
        List listS = v.s(defaultSingleCardData, new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ha1.a.Q1), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new d.RadioButton(dataDisplayed.getSelectionState() == yd1.f.c.OtherAddressSelection, false, 2, null), null, 5, null), null, null, 3325, null));
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
        return new g.a.DataDisplayed(labelC, new CardListData(listS, error, false, null, null, 28, null), cVar, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), params.a());
    }

    public final AddressFormData e(AddressData initialData) {
        return new AddressFormData(null, false, null, this.labelProvider.c(ha1.a.S1), null, new st3.a.Info(this.labelProvider.c(ha1.a.P1)), initialData, 21, null);
    }
}
