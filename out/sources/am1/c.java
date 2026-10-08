package am1;

import al0.BEContactDetailsData;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import pq.v;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lam1/c;", "Lxw/f;", "Lam1/c$a;", "Lyl1/i$a$b$b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lam1/c$a;)Lyl1/i$a$b$b;", "a", "Lmx/c;", "", "Ln50/g;", "c", "(Lam1/c$a;)Ljava/util/List;", "cards", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, yl1.i.a.Initialized.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: am1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lam1/c$a;", "", "Lal0/j;", "data", "Liy/b0;", "userEdorAddress", "<init>", "(Lal0/j;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/j;", "()Lal0/j;", "b", "Liy/b0;", "()Liy/b0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            return (this.data.hashCode() * 31) + this.userEdorAddress.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", userEdorAddress=" + this.userEdorAddress + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> c(Params params) {
        mx.c cVar = this.labelProvider;
        PhoneNumber phoneNumber = params.getData().getPhoneNumber();
        if (r.t0(c0.e(phoneNumber.g()))) {
            phoneNumber = null;
        }
        DefaultSingleCardData defaultSingleCardDataB = phoneNumber != null ? xk1.a.b(cVar, Integer.valueOf(gk1.a.X), mx.b.b(phoneNumber.f(), "phoneNumber"), null, 4, null) : null;
        String strE = c0.e(params.getData().getEmailAddress());
        if (r.t0(strE)) {
            strE = null;
        }
        return v.s(defaultSingleCardDataB, strE != null ? xk1.a.b(cVar, Integer.valueOf(gk1.a.f73455s), mx.b.b(strE, "emailAddress"), null, 4, null) : null, xk1.a.b(cVar, Integer.valueOf(gk1.a.f73453r), xk1.b.a(params.getUserEdorAddress(), "userEdorAddress"), null, 4, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yl1.i.a.Initialized.Section b(Params params) {
        return new yl1.i.a.Initialized.Section(this.labelProvider.c(gk1.a.f73449p), new CardListData(c(params), null, false, null, null, 30, null));
    }
}
