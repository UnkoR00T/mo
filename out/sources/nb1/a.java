package nb1;

import fr.t;
import gz.b;
import hz.g;
import hz.h;
import hz.i;
import j14.l;
import java.util.Map;
import mx.c;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import tq.e;
import ub1.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnb1/a;", "Lgz/b;", "Lnb1/a$a;", "", "Lub1/k;", "Lhz/g;", "Lj14/l;", "checkNipNumberCheckSumUC", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lj14/l;Lmx/c;Lhz/i;)V", "params", "d", "(Lnb1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj14/l;", "Lhz/h;", "b", "Lhz/h;", "accountingOfficeValidator", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b<Params, Map<k, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l checkNipNumberCheckSumUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h accountingOfficeValidator;

    /* JADX INFO: renamed from: nb1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lnb1/a$a;", "Lgz/b$a;", "", "nipNumber", "accountingOfficeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nipNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountingOfficeName;

        public Params(String str, String str2) {
            this.nipNumber = str;
            this.accountingOfficeName = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountingOfficeName() {
            return this.accountingOfficeName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNipNumber() {
            return this.nipNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.nipNumber, params.nipNumber) && t.c(this.accountingOfficeName, params.accountingOfficeName);
        }

        public int hashCode() {
            return (this.nipNumber.hashCode() * 31) + this.accountingOfficeName.hashCode();
        }

        public String toString() {
            return "Params(nipNumber=" + this.nipNumber + ", accountingOfficeName=" + this.accountingOfficeName + ')';
        }
    }

    public a(l lVar, c cVar, i iVar) {
        this.checkNipNumberCheckSumUC = lVar;
        this.accountingOfficeValidator = iVar.a().y(100, cVar.e(ha1.a.f82466o0, 100)).M(cVar.e(ha1.a.F0, 100));
    }

    public Object d(Params params, e<? super Map<k, ? extends g>> eVar) {
        return v0.l(y.a(k.ACCOUNTING_OFFICE, this.accountingOfficeValidator.a(params.getAccountingOfficeName())), y.a(k.NIP_NUMBER, this.checkNipNumberCheckSumUC.a(new l.Params(params.getNipNumber(), false, 2, null))));
    }
}
