package ib1;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lib1/b;", "", "Lib1/a;", "type", "<init>", "(Lib1/a;)V", "a", "Lib1/a;", "()Lib1/a;", "b", "Lib1/b$a;", "Lib1/b$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a type;

    /* JADX INFO: renamed from: ib1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lib1/b$a;", "Lib1/b;", "", "nipNumber", "accountingOfficeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountingOffice extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nipNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountingOfficeName;

        public AccountingOffice(String str, String str2) {
            super(a.ACCOUNTING_OFFICE, null);
            this.nipNumber = str;
            this.accountingOfficeName = str2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAccountingOfficeName() {
            return this.accountingOfficeName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNipNumber() {
            return this.nipNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountingOffice)) {
                return false;
            }
            AccountingOffice accountingOffice = (AccountingOffice) other;
            return t.c(this.nipNumber, accountingOffice.nipNumber) && t.c(this.accountingOfficeName, accountingOffice.accountingOfficeName);
        }

        public int hashCode() {
            return (this.nipNumber.hashCode() * 31) + this.accountingOfficeName.hashCode();
        }

        public String toString() {
            return "AccountingOffice(nipNumber=" + this.nipNumber + ", accountingOfficeName=" + this.accountingOfficeName + ')';
        }
    }

    /* JADX INFO: renamed from: ib1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lib1/b$b;", "Lib1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C2150b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2150b f90722b = new C2150b();

        private C2150b() {
            super(a.SELF_ACCOUNTING_OFFICE, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C2150b);
        }

        public int hashCode() {
            return -1194319458;
        }

        public String toString() {
            return "SelfAccountingOffice";
        }
    }

    public /* synthetic */ b(a aVar, k kVar) {
        this(aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getType() {
        return this.type;
    }

    private b(a aVar) {
        this.type = aVar;
    }
}
