package fp3;

import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import k34.RailwayCardDocumentData;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: fp3.l, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lfp3/l;", "Lxw/f;", "Lfp3/l$b;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "c", "(Lfp3/l$b;)Lco3/t;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/c;", "b", "Lez/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Scope5000000Mapper implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66107d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: fp3.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lfp3/l$b;", "", "Lk34/z;", "data", "", "verificationTime", "picture", "<init>", "(Lk34/z;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/z;", "()Lk34/z;", "b", "Ljava/lang/String;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardDocumentData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(RailwayCardDocumentData railwayCardDocumentData, String str, String str2) {
            this.data = railwayCardDocumentData;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RailwayCardDocumentData getData() {
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

    public Scope5000000Mapper(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        RailwayCardDocumentData data = params.getData();
        Label labelE = this.labelProvider.e(un3.b.f199497v0, this.labelProvider.c(un3.b.f199506x).getText());
        Label labelE2 = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(data.getDataContainer().getFirstName());
        String secondName = data.getDataContainer().getSecondName();
        if (secondName != null) {
            sb5.append(' ' + secondName);
        }
        String string = sb5.toString();
        String expiryDate = data.getDataContainer().getExpiryDate();
        ez.e eVar = this.dateFormatter;
        fz.c cVar = fz.c.BLANK_REVERSED;
        fz.b.String string2 = new fz.b.String(expiryDate, cVar, false, 4, null);
        fz.c cVar2 = fz.c.DOTTED;
        Label labelE3 = this.labelProvider.e(un3.b.f199507x0, mx.b.b(eVar.d(string2, cVar2), "expiryDate").getText());
        int i15 = t.c(data.getDataContainer().getCardRelation(), "W") ? un3.b.f199518z1 : un3.b.A1;
        int i16 = t.c(data.getDataContainer().getHolderType(), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m) ? un3.b.f199500v3 : un3.b.f199520z3;
        SingleCardData singleCardData = new SingleCardData(this.labelProvider.c(un3.b.U1), mx.b.b(string, "names"));
        SingleCardData singleCardData2 = new SingleCardData(this.labelProvider.c(un3.b.f199410d3), mx.b.b(data.getDataContainer().getLastName(), "lastName"));
        SingleCardData singleCardData3 = t.c(data.getDataContainer().getCardRelation(), "W") ? new SingleCardData(this.labelProvider.c(un3.b.B3), mx.b.d(data.getDataContainer().getPesel(), "pesel")) : null;
        List<SingleCardData> listQ = v.q(singleCardData, singleCardData2, singleCardData3, new SingleCardData(this.labelProvider.c(un3.b.A3), new Label(data.getDataContainer().getBatch() + data.getDataContainer().getNumber(), "uutNumberLabel")), new SingleCardData(this.labelProvider.c(un3.b.D3), this.labelProvider.c(i15)), new SingleCardData(this.labelProvider.c(un3.b.C3), this.labelProvider.c(i16)), new SingleCardData(this.labelProvider.c(un3.b.f199510x3), mx.b.b(data.getDataContainer().getEmployer(), "employer")), new SingleCardData(this.labelProvider.c(un3.b.f199485s3), mx.b.b(data.getDataContainer().getOuCategory().getValue(), "uutCategory")), new SingleCardData(this.labelProvider.c(un3.b.f199490t3), mx.b.b(data.getDataContainer().getTrainClass(), "trainClass")), new SingleCardData(this.labelProvider.c(un3.b.f199495u3), mx.b.b(this.dateFormatter.d(new fz.b.String(data.getDataContainer().getValidFrom(), cVar, false, 4, null), cVar2), "validFrom")), new SingleCardData(this.labelProvider.c(un3.b.f199480r3), mx.b.d(data.getDataContainer().getAnnotation(), "annotation")), new SingleCardData(this.labelProvider.c(un3.b.f199475q3), mx.b.d(data.getDataContainer().getConcession(), "concession")), new SingleCardData(this.labelProvider.c(un3.b.F3), mx.b.b(data.getDataContainer().getStatus(), "status")), new SingleCardData(this.labelProvider.c(un3.b.f199505w3), mx.b.b(data.getDataContainer().getEmployerCode(), "employerCode")));
        ArrayList arrayList = new ArrayList();
        for (SingleCardData singleCardData4 : listQ) {
            if (singleCardData4 != null) {
                arrayList.add(singleCardData4);
            }
        }
        return new VerificationDetailsResult(params.getPicture(), labelE, null, labelE2, labelE3, arrayList, null, 68, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scope5000000Mapper)) {
            return false;
        }
        Scope5000000Mapper scope5000000Mapper = (Scope5000000Mapper) other;
        return t.c(this.labelProvider, scope5000000Mapper.labelProvider) && t.c(this.dateFormatter, scope5000000Mapper.dateFormatter);
    }

    public int hashCode() {
        return (this.labelProvider.hashCode() * 31) + this.dateFormatter.hashCode();
    }

    public String toString() {
        return "Scope5000000Mapper(labelProvider=" + this.labelProvider + ", dateFormatter=" + this.dateFormatter + ')';
    }
}
