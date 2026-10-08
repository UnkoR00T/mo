package fp3;

import co3.SingleCardData;
import co3.VerificationDetailsResult;
import fr.t;
import fu.r;
import go3.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k34.WruDocumentData;
import k34.WruDocumentItem;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lfp3/m;", "Lxw/f;", "Lfp3/m$b;", "Lco3/t;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lgo3/x0;", "wruCommonItemsOrderUseCase", "<init>", "(Lmx/c;Lez/e;Lgo3/x0;)V", "params", "c", "(Lfp3/m$b;)Lco3/t;", "a", "Lmx/c;", "b", "Lez/e;", "Lgo3/x0;", "d", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<Params, VerificationDetailsResult> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f66114e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x0 wruCommonItemsOrderUseCase;

    /* JADX INFO: renamed from: fp3.m$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lfp3/m$b;", "", "Lk34/k0;", "data", "", "verificationTime", "picture", "<init>", "(Lk34/k0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/k0;", "()Lk34/k0;", "b", "Ljava/lang/String;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WruDocumentData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        public Params(WruDocumentData wruDocumentData, String str, String str2) {
            this.data = wruDocumentData;
            this.verificationTime = str;
            this.picture = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final WruDocumentData getData() {
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

    public m(mx.c cVar, ez.e eVar, x0 x0Var) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.wruCommonItemsOrderUseCase = x0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    /* JADX WARN: Code duplicated, block: B:60:0x016b  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x016b, please report this as an issue */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VerificationDetailsResult b(Params params) {
        Label labelB;
        Object next;
        SingleCardData singleCardData;
        String strG1;
        String strG2;
        WruDocumentData data = params.getData();
        Label labelE = this.labelProvider.e(un3.b.f199497v0, data.getDocumentName());
        Label labelE2 = this.labelProvider.e(un3.b.f199492u0, params.getVerificationTime());
        String additionalDescription = data.getAdditionalDescription();
        if (additionalDescription == null) {
            labelB = null;
        } else {
            if (additionalDescription.length() <= 0) {
                additionalDescription = null;
            }
            if (additionalDescription != null) {
                labelB = mx.b.b(additionalDescription, "additionalDescription");
            } else {
                labelB = null;
            }
        }
        Iterator<T> it = data.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((WruDocumentItem) next).getType(), "VALID_TO"));
        WruDocumentItem wruDocumentItem = (WruDocumentItem) next;
        Label labelC = wruDocumentItem != null ? wruDocumentItem.getValue().length() == 0 ? this.labelProvider.c(un3.b.f199502w0) : this.labelProvider.e(un3.b.f199507x0, this.dateFormatter.d(new fz.b.String(wruDocumentItem.getValue(), fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED)) : null;
        String pesel = data.getPesel();
        String details = data.getDetails();
        String strO1 = (details == null || (strG2 = r.g1(details, "GIVENNAME=", null, 2, null)) == null) ? null : r.o1(strG2, ",", null, 2, null);
        String strO2 = (details == null || (strG1 = r.g1(details, "SURNAME=", null, 2, null)) == null) ? null : r.o1(strG1, ",", null, 2, null);
        List<WruDocumentItem> listB = this.wruCommonItemsOrderUseCase.b(new x0.Params(data.c()));
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            WruDocumentItem wruDocumentItem2 = (WruDocumentItem) obj;
            switch (wruDocumentItem2.getType()) {
                case "SURNAME":
                    singleCardData = new SingleCardData(wruDocumentItem2.getLabel(), mx.b.d(strO2, "surname_" + i15));
                    break;
                case "VALID_TO":
                    singleCardData = null;
                    break;
                case "NAME":
                    singleCardData = new SingleCardData(wruDocumentItem2.getLabel(), mx.b.d(strO1, "names_" + i15));
                    break;
                case "PESEL":
                    singleCardData = new SingleCardData(wruDocumentItem2.getLabel(), mx.b.b(pesel, "pesel_" + i15));
                    break;
                default:
                    singleCardData = new SingleCardData(wruDocumentItem2.getLabel(), mx.b.d(wruDocumentItem2.getValue(), "itemValue_" + i15));
                    break;
            }
            if (singleCardData != null) {
                arrayList.add(singleCardData);
            }
            i15 = i16;
            data = data;
        }
        List<WruDocumentItem> listB2 = data.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB2, 10));
        int i17 = 0;
        for (Object obj2 : listB2) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                v.x();
            }
            WruDocumentItem wruDocumentItem3 = (WruDocumentItem) obj2;
            arrayList2.add(new SingleCardData(wruDocumentItem3.getLabel(), mx.b.d(wruDocumentItem3.getValue(), "additionalItems_" + i17)));
            i17 = i18;
        }
        return new VerificationDetailsResult(params.getPicture(), labelE, labelB, labelE2, labelC, v.L0(arrayList, arrayList2), null, 64, null);
    }
}
