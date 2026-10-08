package ac0;

import bc0.DocumentPhotoData;
import bc0.ItemData;
import bc0.VerificationFamilyCardData;
import cc0.l;
import fr.t;
import java.time.LocalDate;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lac0/h;", "Lxw/f;", "Lac0/h$a;", "Lbc0/f;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "c", "(Lac0/h$a;)Lbc0/f;", "a", "Lmx/c;", "b", "Lez/e;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, VerificationFamilyCardData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ac0.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lac0/h$a;", "", "Lcc0/l$d$a;", "state", "<init>", "(Lcc0/l$d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcc0/l$d$a;", "()Lcc0/l$d$a;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.d.Displaying state;

        public Params(l.d.Displaying displaying) {
            this.state = displaying;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final l.d.Displaying getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.state, ((Params) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ')';
        }
    }

    public h(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationFamilyCardData b(Params params) {
        Label labelC;
        String documentId = params.getState().getStateData().getSelectedCard().getDocumentId();
        Label labelC2 = this.labelProvider.c(tb0.b.G);
        int i15 = jz.a.O2;
        String scopeName = params.getState().getStateData().getSelectedCard().getScopeName();
        DocumentPhotoData photoData = params.getState().getStateData().getPhotoData();
        if (!params.getState().getStateData().getSelectedCard().getScopeData().getData().g()) {
            photoData = null;
        }
        DocumentPhotoData documentPhotoData = photoData;
        ItemData itemData = new ItemData(this.labelProvider.c(tb0.b.f189405p), mx.b.d(params.getState().getStateData().getSelectedCard().getScopeData().getData().h(), "name"));
        ItemData itemData2 = new ItemData(this.labelProvider.c(tb0.b.f189408s), mx.b.d(params.getState().getStateData().getSelectedCard().getScopeData().getData().getSu(), "lastName"));
        ItemData itemData3 = new ItemData(this.labelProvider.c(tb0.b.f189407r), mx.b.d(params.getState().getStateData().getSelectedCard().getScopeData().getData().getP(), "pesel"));
        ItemData itemData4 = new ItemData(this.labelProvider.c(tb0.b.f189415z), mx.b.d(params.getState().getStateData().getSelectedCard().getScopeData().getData().getNo(), "cardNumber"));
        Label labelC3 = this.labelProvider.c(tb0.b.f189397h);
        LocalDate ed5 = params.getState().getStateData().getSelectedCard().getScopeData().getData().getED();
        if (ed5 == null || (labelC = mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(ed5), fz.c.DOTTED), "expirationDate")) == null) {
            labelC = this.labelProvider.c(tb0.b.P);
        }
        return new VerificationFamilyCardData(documentId, labelC2, i15, scopeName, documentPhotoData, v.q(itemData, itemData2, itemData3, itemData4, new ItemData(labelC3, labelC), new ItemData(this.labelProvider.c(tb0.b.O), this.labelProvider.c(params.getState().getStateData().getSelectedCard().getScopeData().getData().g() ? tb0.b.M : tb0.b.N)), new ItemData(this.labelProvider.c(tb0.b.J), this.labelProvider.c(t.c(params.getState().getStateData().getSelectedCard().getScopeData().getData().getCh(), "R") ? tb0.b.L : tb0.b.K))), null, 64, null);
    }
}
