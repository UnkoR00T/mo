package fp3;

import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import l34.DynamicDocumentVerification;
import mx.Label;
import oq.r;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfp3/a;", "Lxw/f;", "Lfp3/a$a;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "", "date", "Lmx/a;", "e", "(Ljava/lang/String;)Lmx/a;", "params", "c", "(Lfp3/a$a;)Lco3/t;", "a", "Lmx/c;", "b", "Lez/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: fp3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lfp3/a$a;", "", "Ll34/b;", "data", "", "verificationTime", "picture", "<init>", "(Ll34/b;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll34/b;", "()Ll34/b;", "b", "Ljava/lang/String;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentVerification data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(DynamicDocumentVerification dynamicDocumentVerification, String str, String str2) {
            this.data = dynamicDocumentVerification;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DynamicDocumentVerification getData() {
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

    public a(mx.c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    private final Label e(String date) {
        Label labelE;
        return (this.dateConverter.e(date, fz.c.DOTTED) == null || (labelE = this.labelProvider.e(un3.b.f199507x0, date)) == null) ? this.labelProvider.c(un3.b.f199502w0) : labelE;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        Label labelE = this.labelProvider.e(un3.b.f199497v0, params.getData().getDocumentName());
        Label labelE2 = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        List<r<String, String>> listA = params.getData().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            r rVar = (r) obj;
            arrayList.add(new SingleCardData(mx.b.d((String) rVar.d(), "dataAttributeTitle_" + i15), mx.b.d((String) rVar.c(), "dataAttributeValue_" + i15)));
            i15 = i16;
        }
        String picture = params.getPicture();
        String expirationDate = params.getData().getExpirationDate();
        return new VerificationDetailsResult(picture, labelE, null, labelE2, expirationDate != null ? e(expirationDate) : null, arrayList, null, 68, null);
    }
}
