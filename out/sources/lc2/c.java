package lc2;

import al0.BEContactDetailsData;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import mc2.Section;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import pq.v;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Llc2/c;", "Lxw/f;", "Llc2/c$a;", "Lmc2/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Liy/b0;", "", "tag", "Lmx/a;", "e", "(Liy/b0;Ljava/lang/String;)Lmx/a;", "params", "c", "(Llc2/c$a;)Lmc2/a;", "a", "Lmx/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lc2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Llc2/c$a;", "", "Lal0/j;", "data", "Liy/b0;", "userEdorAddress", "<init>", "(Lal0/j;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/j;", "()Lal0/j;", "b", "Liy/b0;", "()Liy/b0;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEContactDetailsData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 userEdorAddress;

        public Params(BEContactDetailsData bEContactDetailsData, b0 b0Var) {
            this.data = bEContactDetailsData;
            this.userEdorAddress = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEContactDetailsData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getUserEdorAddress() {
            return this.userEdorAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.userEdorAddress, params.userEdorAddress);
        }

        public int hashCode() {
            BEContactDetailsData bEContactDetailsData = this.data;
            return ((bEContactDetailsData == null ? 0 : bEContactDetailsData.hashCode()) * 31) + this.userEdorAddress.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", userEdorAddress=" + this.userEdorAddress + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(b0 b0Var, String str) {
        return mx.b.b(c0.e(b0Var), str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Section b(Params params) {
        Label labelO;
        b0 emailAddress;
        String strE;
        PhoneNumber phoneNumber;
        BEContactDetailsData data = params.getData();
        DefaultSingleCardData defaultSingleCardData = null;
        if (data == null || (phoneNumber = data.getPhoneNumber()) == null) {
            labelO = null;
        } else {
            if (r.t0(c0.e(phoneNumber.g()))) {
                phoneNumber = null;
            }
            if (phoneNumber != null) {
                labelO = e(phoneNumber.h(), "prefix").o(Label.INSTANCE.d()).o(e(phoneNumber.g(), "phoneNumber"));
            } else {
                labelO = null;
            }
        }
        Label labelC = this.labelProvider.c(hb2.b.f82795l);
        DefaultSingleCardData defaultSingleCardData2 = labelO != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.I), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelO, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
        BEContactDetailsData data2 = params.getData();
        if (data2 != null && (emailAddress = data2.getEmailAddress()) != null && (strE = c0.e(emailAddress)) != null) {
            if (r.t0(strE)) {
                strE = null;
            }
            if (strE != null) {
                defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82801o), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(e(params.getData().getEmailAddress(), "emailAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            }
        }
        return new Section(labelC, new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hb2.b.f82799n), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(e(params.getUserEdorAddress(), "communicationAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
    }
}
