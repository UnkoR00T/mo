package fp3;

import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import iy.b0;
import iy.c0;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfp3/k;", "Lxw/f;", "Lfp3/k$a;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "c", "(Lfp3/k$a;)Lco3/t;", "a", "Lmx/c;", "b", "Lez/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: fp3.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lfp3/k$a;", "", "Lo34/c;", "data", "", "verificationTime", "picture", "<init>", "(Lo34/c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo34/c;", "()Lo34/c;", "b", "Ljava/lang/String;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o34.c data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(o34.c cVar, String str, String str2) {
            this.data = cVar;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o34.c getData() {
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

    public k(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        o34.c data = params.getData();
        StringBuilder sb5 = new StringBuilder();
        b0 firstName = data.getDataContainer().getFirstName();
        sb5.append(firstName != null ? c0.e(firstName) : null);
        b0 secondName = data.getDataContainer().getSecondName();
        if (secondName != null) {
            sb5.append(' ' + c0.e(secondName));
        }
        Label labelB = mx.b.b(sb5.toString(), "names");
        Label labelC = this.labelProvider.c(un3.b.f199512y0);
        Label labelE = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        Label labelC2 = this.labelProvider.c(un3.b.f199410d3);
        b0 surname = data.getDataContainer().getSurname();
        SingleCardData singleCardData = new SingleCardData(labelC2, mx.b.d(surname != null ? c0.e(surname) : null, "surname"));
        SingleCardData singleCardData2 = new SingleCardData(this.labelProvider.c(un3.b.U1), labelB);
        Label labelC3 = this.labelProvider.c(un3.b.f199429h2);
        b0 pesel = data.getDataContainer().getPesel();
        SingleCardData singleCardData3 = new SingleCardData(labelC3, mx.b.d(pesel != null ? c0.e(pesel) : null, "pesel"));
        Label labelC4 = this.labelProvider.c(un3.b.V1);
        b0 nationality = data.getDataContainer().getNationality();
        SingleCardData singleCardData4 = new SingleCardData(labelC4, mx.b.d(nationality != null ? c0.e(nationality) : null, "nationality"));
        Label labelC5 = this.labelProvider.c(un3.b.F1);
        b0 refugeeStatus = data.getDataContainer().getRefugeeStatus();
        SingleCardData singleCardData5 = new SingleCardData(labelC5, mx.b.d(refugeeStatus != null ? c0.e(refugeeStatus) : null, "refugeeStatus"));
        Label labelC6 = this.labelProvider.c(un3.b.f199447l0);
        b0 birthDate = data.getDataContainer().getBirthDate();
        SingleCardData singleCardData6 = new SingleCardData(labelC6, mx.b.d(birthDate != null ? this.dateFormatter.d(new fz.b.String(c0.e(birthDate), fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED) : null, "birthDate"));
        Label labelC7 = this.labelProvider.c(un3.b.f199432i0);
        b0 birthCountry = data.getDataContainer().getBirthCountry();
        SingleCardData singleCardData7 = new SingleCardData(labelC7, mx.b.d(birthCountry != null ? c0.e(birthCountry) : null, "birthCountry"));
        Label labelC8 = this.labelProvider.c(un3.b.f199442k0);
        b0 birthPlace = data.getDataContainer().getBirthPlace();
        SingleCardData singleCardData8 = new SingleCardData(labelC8, mx.b.d(birthPlace != null ? c0.e(birthPlace) : null, "birthPlace"));
        Label labelC9 = this.labelProvider.c(un3.b.A0);
        String expiryDate = data.getDataContainer().getExpiryDate();
        return new VerificationDetailsResult(params.getPicture(), labelC, null, labelE, null, v.q(singleCardData, singleCardData2, singleCardData3, singleCardData4, singleCardData5, singleCardData6, singleCardData7, singleCardData8, new SingleCardData(labelC9, mx.b.d(expiryDate != null ? this.dateFormatter.d(new fz.b.String(expiryDate, fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED) : null, "expiryDate"))), null, 68, null);
    }
}
