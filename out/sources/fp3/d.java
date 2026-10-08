package fp3;

import co3.Section;
import co3.SectionRow;
import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jr0.CategoryContainer;
import jr0.DrivingLicenceDataContainer;
import jr0.DrivingLicenceScope;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfp3/d;", "Lxw/f;", "Lfp3/d$a;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "params", "e", "(Lfp3/d$a;)Lco3/t;", "a", "Lmx/c;", "b", "Lez/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: fp3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lfp3/d$a;", "", "Ljr0/d;", "data", "", "verificationTime", "picture", "<init>", "(Ljr0/d;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljr0/d;", "()Ljr0/d;", "b", "Ljava/lang/String;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DrivingLicenceScope data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(DrivingLicenceScope drivingLicenceScope, String str, String str2) {
            this.data = drivingLicenceScope;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DrivingLicenceScope getData() {
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

    public d(mx.c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(String str) {
        return str;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        Label labelC;
        ArrayList arrayList;
        DrivingLicenceScope data = params.getData();
        Integer stp = data.getMnemonicHeaderContainer().getStp();
        boolean z15 = stp != null && stp.intValue() == 2;
        DrivingLicenceDataContainer drivingLicenceDataContainer = data.getDrivingLicenceDataContainer();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(drivingLicenceDataContainer.getName());
        String secondName = drivingLicenceDataContainer.getSecondName();
        if (secondName != null) {
            sb5.append(' ' + secondName);
        }
        String string = sb5.toString();
        LocalDate expiredDate = drivingLicenceDataContainer.getExpiredDate();
        String strA = expiredDate != null ? this.dateConverter.a(expiredDate) : null;
        Label labelE = this.labelProvider.e(un3.b.f199497v0, z15 ? this.labelProvider.c(un3.b.f199415e3).getText() : this.labelProvider.c(un3.b.f199423g1).getText());
        Label labelE2 = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        if (strA == null || (labelC = this.labelProvider.e(un3.b.f199507x0, strA)) == null) {
            labelC = this.labelProvider.c(un3.b.f199502w0);
        }
        Label label = labelC;
        SingleCardData singleCardData = new SingleCardData(this.labelProvider.c(un3.b.I), mx.b.b(c0.e(data.getMnemonicHeaderContainer().getPe()), "pesel"));
        SingleCardData singleCardData2 = new SingleCardData(this.labelProvider.c(un3.b.U1), mx.b.b(string, "names"));
        SingleCardData singleCardData3 = new SingleCardData(this.labelProvider.c(un3.b.f199410d3), mx.b.d(drivingLicenceDataContainer.getSurname(), "surname"));
        Label labelC2 = this.labelProvider.c(un3.b.f199511y);
        LocalDate birthday = drivingLicenceDataContainer.getBirthday();
        SingleCardData singleCardData4 = new SingleCardData(labelC2, mx.b.d(birthday != null ? this.dateConverter.a(birthday) + ' ' + drivingLicenceDataContainer.getBirthplace() : null, "birthday"));
        Label labelC3 = this.labelProvider.c(un3.b.B);
        LocalDate releaseDate = drivingLicenceDataContainer.getReleaseDate();
        SingleCardData singleCardData5 = new SingleCardData(labelC3, mx.b.d(releaseDate != null ? this.dateConverter.a(releaseDate) : null, "releaseDate"));
        SingleCardData singleCardData6 = new SingleCardData(this.labelProvider.c(z15 ? un3.b.L : un3.b.D), mx.b.d(drivingLicenceDataContainer.getDocumentState(), "status"));
        SingleCardData singleCardData7 = new SingleCardData(this.labelProvider.c(un3.b.A), mx.b.d(drivingLicenceDataContainer.getLongDocumentId(), "longDocumentId"));
        SingleCardData singleCardData8 = new SingleCardData(this.labelProvider.c(z15 ? un3.b.J : un3.b.f199516z), mx.b.d(drivingLicenceDataContainer.getFormNumber(), "formNumber"));
        SingleCardData singleCardData9 = new SingleCardData(this.labelProvider.c(z15 ? un3.b.K : un3.b.C), mx.b.d(data.getMnemonicHeaderContainer().getId(), "id"));
        Label labelC4 = this.labelProvider.c(un3.b.H);
        List<String> listK = drivingLicenceDataContainer.k();
        String strV0 = listK != null ? v.v0(listK, null, null, null, 0, null, null, 63, null) : null;
        if (strV0 == null || strV0.length() == 0) {
            strV0 = null;
        }
        List listQ = v.q(singleCardData, singleCardData2, singleCardData3, singleCardData4, singleCardData5, singleCardData6, singleCardData7, singleCardData8, singleCardData9, new SingleCardData(labelC4, mx.b.d(strV0, "restrictions")));
        List<CategoryContainer> listC = drivingLicenceDataContainer.c();
        if (listC != null) {
            List<CategoryContainer> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                CategoryContainer categoryContainer = (CategoryContainer) obj;
                Label labelC5 = this.labelProvider.c(un3.b.G);
                LocalDate formReleaseDate = categoryContainer.getFormReleaseDate();
                SingleCardData singleCardData10 = new SingleCardData(labelC5, mx.b.d(formReleaseDate != null ? this.dateConverter.a(formReleaseDate) : null, "formReleaseDate_" + i15));
                Label labelC6 = this.labelProvider.c(un3.b.F);
                LocalDate expiredDate2 = categoryContainer.getExpiredDate();
                SingleCardData singleCardData11 = new SingleCardData(labelC6, mx.b.d(expiredDate2 != null ? this.dateConverter.a(expiredDate2) : null, "expiredDate_" + i15));
                Label labelC7 = this.labelProvider.c(un3.b.H);
                List<String> listB = categoryContainer.b();
                String strV1 = listB != null ? v.v0(listB, null, null, null, 0, null, new er.l() { // from class: fp3.c
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d.f((String) obj2);
                    }
                }, 31, null) : null;
                if (strV1 == null || strV1.length() == 0) {
                    strV1 = null;
                }
                List listT = v.t(singleCardData10, singleCardData11, new SingleCardData(labelC7, mx.b.d(strV1, "categoryRestrictions_" + i15)));
                String categoryStatus = categoryContainer.getCategoryStatus();
                if (categoryStatus != null) {
                    listT.add(new SingleCardData(this.labelProvider.c(un3.b.X0), mx.b.d(categoryStatus, "categoryStatus_" + i15)));
                }
                arrayList.add(new SectionRow(this.labelProvider.e(un3.b.E, mx.b.d(categoryContainer.getCategoryName(), "categoryName").getText()), listT));
                i15 = i16;
            }
        } else {
            arrayList = null;
        }
        return new VerificationDetailsResult(params.getPicture(), labelE, null, labelE2, label, listQ, arrayList != null ? new Section(this.labelProvider.c(un3.b.f199396b), arrayList) : null, 4, null);
    }
}
