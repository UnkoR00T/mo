package fp3;

import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import k34.FamilyDataModel;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfp3/f;", "Lxw/f;", "Lfp3/f$b;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "c", "(Lfp3/f$b;)Lco3/t;", "a", "Lmx/c;", "b", "Lez/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66069d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: fp3.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lfp3/f$b;", "", "Lk34/r;", "data", "", "verificationTime", "picture", "<init>", "(Lk34/r;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/r;", "()Lk34/r;", "b", "Ljava/lang/String;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyDataModel data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(FamilyDataModel familyDataModel, String str, String str2) {
            this.data = familyDataModel;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FamilyDataModel getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getVerificationTime() {
            return this.verificationTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.verificationTime, params.verificationTime) && t.c(this.picture, params.picture);
        }

        public int hashCode() {
            int iHashCode = ((this.data.hashCode() * 31) + this.verificationTime.hashCode()) * 31;
            String str = this.picture;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(data=" + this.data + ", verificationTime=" + this.verificationTime + ", picture=" + this.picture + ')';
        }
    }

    public f(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        Label labelC;
        FamilyDataModel data = params.getData();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(data.getDataContainer().getFirstName());
        sb5.append(" ");
        String secondName = data.getDataContainer().getSecondName();
        if (secondName == null) {
            secondName = new String();
        }
        sb5.append(secondName);
        String string = sb5.toString();
        String ed5 = data.getDataContainer().getED();
        String strD = ed5 != null ? this.dateFormatter.d(new fz.b.String(ed5, fz.c.BLANK_REVERSED, false, 4, null), fz.c.DOTTED) : null;
        Label labelE = this.labelProvider.e(un3.b.f199497v0, this.labelProvider.c(un3.b.f199503w1).getText());
        Label labelE2 = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        if (strD == null || (labelC = this.labelProvider.e(un3.b.f199507x0, strD)) == null) {
            labelC = this.labelProvider.c(un3.b.f199502w0);
        }
        return new VerificationDetailsResult(params.getPicture(), labelE, null, labelE2, labelC, v.q(new SingleCardData(this.labelProvider.c(un3.b.f199410d3), mx.b.b(data.getDataContainer().getLastName(), "lastName")), new SingleCardData(this.labelProvider.c(un3.b.U1), mx.b.b(string, "names")), new SingleCardData(this.labelProvider.c(un3.b.f199429h2), mx.b.d(data.getDataContainer().getP(), "pesel")), new SingleCardData(this.labelProvider.c(un3.b.f199488t1), mx.b.b(data.getDataContainer().getNumber(), "cardNumber")), new SingleCardData(this.labelProvider.c(un3.b.B1), this.labelProvider.c(t.c(data.getDataContainer().getCardRelation(), "W") ? un3.b.f199518z1 : un3.b.A1)), new SingleCardData(this.labelProvider.c(un3.b.f199493u1), this.labelProvider.c(t.c(data.getDataContainer().getHolderType(), "R") ? un3.b.f199513y1 : un3.b.f199508x1))), null, 68, null);
    }
}
