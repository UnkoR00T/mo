package fp3;

import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import fu.r;
import java.util.Date;
import k34.AdvocateDataModel;
import k34.DataHeaderStandardModel;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfp3/j;", "Lxw/f;", "Lfp3/j$b;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "params", "c", "(Lfp3/j$b;)Lco3/t;", "a", "Lmx/c;", "b", "Lez/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66095d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: fp3.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lfp3/j$b;", "", "Lk34/b;", "data", "", "verificationTime", "picture", "<init>", "(Lk34/b;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/b;", "()Lk34/b;", "b", "Ljava/lang/String;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdvocateDataModel data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(AdvocateDataModel advocateDataModel, String str, String str2) {
            this.data = advocateDataModel;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdvocateDataModel getData() {
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

    public j(mx.c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        Label labelC;
        String strG1;
        String strG2;
        Label labelE = this.labelProvider.e(un3.b.f199497v0, this.labelProvider.c(un3.b.f199412e0).getText());
        Label labelE2 = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        Date expiredData = params.getData().getAdvocateCardDataModel().getExpiredData();
        String strO1 = null;
        String strA = expiredData != null ? this.dateConverter.a(this.dateConverter.l(expiredData)) : null;
        Date releaseDate = params.getData().getAdvocateCardDataModel().getReleaseDate();
        String strA2 = releaseDate != null ? this.dateConverter.a(this.dateConverter.l(releaseDate)) : null;
        if (strA == null || (labelC = this.labelProvider.e(un3.b.f199507x0, strA)) == null) {
            labelC = this.labelProvider.c(un3.b.f199502w0);
        }
        Label label = labelC;
        DataHeaderStandardModel dataHeader = params.getData().getDataHeader();
        String dn4 = dataHeader.getDn();
        String strO2 = (dn4 == null || (strG2 = r.g1(dn4, "GIVENNAME=", null, 2, null)) == null) ? null : r.o1(strG2, ",", null, 2, null);
        String dn5 = dataHeader.getDn();
        if (dn5 != null && (strG1 = r.g1(dn5, "SURNAME=", null, 2, null)) != null) {
            strO1 = r.o1(strG1, ",", null, 2, null);
        }
        return new VerificationDetailsResult(params.getPicture(), labelE, null, labelE2, label, v.q(new SingleCardData(this.labelProvider.c(un3.b.f199410d3), mx.b.d(strO1, "surname")), new SingleCardData(this.labelProvider.c(un3.b.U1), mx.b.d(strO2, "names")), new SingleCardData(this.labelProvider.c(un3.b.f199417f0), mx.b.d(params.getData().getAdvocateCardDataModel().getNumber(), "number")), new SingleCardData(this.labelProvider.c(un3.b.Y), mx.b.d(params.getData().getAdvocateCardDataModel().getPermissionType(), "permissionType")), new SingleCardData(this.labelProvider.c(un3.b.f199422g0), mx.b.d(params.getData().getAdvocateCardDataModel().getMemberInstitution(), "memberInstitution")), new SingleCardData(this.labelProvider.c(un3.b.f199402c0), mx.b.d(params.getData().getDataHeader().getId(), "id")), new SingleCardData(this.labelProvider.c(un3.b.f199392a0), mx.b.d(strA2, "releaseDate"))), null, 68, null);
    }
}
