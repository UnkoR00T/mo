package le0;

import fr.t;
import java.util.Locale;
import me0.DocumentPhotoData;
import me0.ItemData;
import me0.VerificationUutCardData;
import mx.Label;
import ne0.p;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lle0/i;", "Lxw/f;", "Lle0/i$b;", "Lme0/f;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "c", "(Lle0/i$b;)Lme0/f;", "a", "Lmx/c;", "b", "Lez/e;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, VerificationUutCardData> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f117978d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: le0.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lle0/i$b;", "", "Lne0/p$d;", "state", "<init>", "(Lne0/p$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lne0/p$d;", "()Lne0/p$d;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p.Initialized state;

        public Params(p.Initialized initialized) {
            this.state = initialized;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final p.Initialized getState() {
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

    public i(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationUutCardData b(Params params) {
        int i15;
        String documentId = params.getState().getSelectedCard().getDocumentId();
        Label labelC = this.labelProvider.c(ge0.a.f72051z);
        int i16 = jz.a.T2;
        String scopeName = params.getState().getSelectedCard().getScopeName();
        DocumentPhotoData photoData = params.getState().getPhotoData();
        if (!params.getState().getSelectedCard().getScopeData().getData().q()) {
            photoData = null;
        }
        Label labelC2 = this.labelProvider.c(ge0.a.f72041p);
        String strR = params.getState().getSelectedCard().getScopeData().getData().r();
        Locale locale = Locale.ROOT;
        ItemData itemData = new ItemData(labelC2, mx.b.d(strR.toUpperCase(locale), "name"));
        Label labelC3 = this.labelProvider.c(ge0.a.f72043r);
        String lastName = params.getState().getSelectedCard().getScopeData().getData().getLastName();
        ItemData itemData2 = new ItemData(labelC3, mx.b.d(lastName != null ? lastName.toUpperCase(locale) : null, "lastName"));
        ItemData itemData3 = new ItemData(this.labelProvider.c(ge0.a.E), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getOuCategory(), "ouCategory"));
        ItemData itemData4 = new ItemData(this.labelProvider.c(ge0.a.Q), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getTrainClass(), "trainClass"));
        ItemData itemData5 = new ItemData(this.labelProvider.c(ge0.a.F), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getConcession(), "concession"));
        Label labelC4 = this.labelProvider.c(ge0.a.X);
        i0 i0Var = i0.f148189a;
        ItemData itemData6 = new ItemData(labelC4, mx.b.b(params.getState().getSelectedCard().getScopeData().getData().getBatch() + params.getState().getSelectedCard().getScopeData().getData().getNumber(), "batchNumber"));
        Label labelC5 = this.labelProvider.c(ge0.a.V);
        ez.e eVar = this.dateFormatter;
        String expiryDate = params.getState().getSelectedCard().getScopeData().getData().getExpiryDate();
        fz.c cVar = fz.c.BLANK_REVERSED;
        fz.b.String string = new fz.b.String(expiryDate, cVar, false, 4, null);
        DocumentPhotoData documentPhotoData = photoData;
        fz.c cVar2 = fz.c.DOTTED;
        ItemData itemData7 = new ItemData(labelC5, mx.b.b(eVar.d(string, cVar2), "expirationDate"));
        ItemData itemData8 = new ItemData(this.labelProvider.c(ge0.a.U), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getEmployer(), "employer"));
        ItemData itemData9 = new ItemData(this.labelProvider.c(ge0.a.T), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getEmployerCode(), "employerCode"));
        ItemData itemData10 = new ItemData(this.labelProvider.c(ge0.a.f72034i), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getStatus(), "status"));
        Label labelC6 = this.labelProvider.c(ge0.a.f72026a0);
        mx.c cVar3 = this.labelProvider;
        boolean zQ = params.getState().getSelectedCard().getScopeData().getData().q();
        if (zQ) {
            i15 = ge0.a.C;
        } else {
            if (zQ) {
                throw new oq.p();
            }
            i15 = ge0.a.D;
        }
        return new VerificationUutCardData(documentId, labelC, i16, scopeName, documentPhotoData, v.q(itemData, itemData2, itemData3, itemData4, itemData5, itemData6, itemData7, itemData8, itemData9, itemData10, new ItemData(labelC6, cVar3.c(i15)), new ItemData(this.labelProvider.c(ge0.a.Z), this.labelProvider.c(t.c(params.getState().getSelectedCard().getScopeData().getData().getHolderType(), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m) ? ge0.a.S : ge0.a.W)), new ItemData(this.labelProvider.c(ge0.a.R), mx.b.b(this.dateFormatter.d(new fz.b.String(params.getState().getSelectedCard().getScopeData().getData().getValidFrom(), cVar, false, 4, null), cVar2), "validFrom")), new ItemData(this.labelProvider.c(ge0.a.Y), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getPesel(), "pesel")), new ItemData(this.labelProvider.c(ge0.a.P), mx.b.d(params.getState().getSelectedCard().getScopeData().getData().getAnnotation(), "annotation"))), null, 64, null);
    }
}
