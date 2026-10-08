package jc2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u000e\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0001\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Ljc2/d;", "", "Lhl0/a;", "c", "()Lhl0/a;", "invalidationData", "Liy/b0;", "l", "()Liy/b0;", "userEdorAddress", "Ljc2/d$c;", "b", "()Ljc2/d$c;", "statementData", "a", "Ljc2/d$b;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ljc2/d$a;", "", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Ljc2/e;", "Ljc2/g;", "Ljc2/i;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        hb4.c a();
    }

    /* JADX INFO: renamed from: b */
    StatementData getStatementData();

    /* JADX INFO: renamed from: c */
    hl0.a getInvalidationData();

    /* JADX INFO: renamed from: l */
    iy.b0 getUserEdorAddress();

    /* JADX INFO: renamed from: jc2.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Ljc2/d$b;", "Ljc2/d;", "Lhl0/a;", "invalidationData", "Liy/b0;", "userEdorAddress", "Ljc2/d$c;", "statementData", "<init>", "(Lhl0/a;Liy/b0;Ljc2/d$c;)V", "a", "(Lhl0/a;Liy/b0;Ljc2/d$c;)Ljc2/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhl0/a;", "c", "()Lhl0/a;", "b", "Liy/b0;", "l", "()Liy/b0;", "Ljc2/d$c;", "()Ljc2/d$c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hl0.a invalidationData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 userEdorAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementData statementData;

        public Initialized(hl0.a aVar, iy.b0 b0Var, StatementData statementData) {
            this.invalidationData = aVar;
            this.userEdorAddress = b0Var;
            this.statementData = statementData;
        }

        public static /* synthetic */ Initialized d(Initialized initialized, hl0.a aVar, iy.b0 b0Var, StatementData statementData, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = initialized.invalidationData;
            }
            if ((i15 & 2) != 0) {
                b0Var = initialized.userEdorAddress;
            }
            if ((i15 & 4) != 0) {
                statementData = initialized.statementData;
            }
            return initialized.a(aVar, b0Var, statementData);
        }

        public final Initialized a(hl0.a invalidationData, iy.b0 userEdorAddress, StatementData statementData) {
            return new Initialized(invalidationData, userEdorAddress, statementData);
        }

        @Override // jc2.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public StatementData getStatementData() {
            return this.statementData;
        }

        @Override // jc2.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public hl0.a getInvalidationData() {
            return this.invalidationData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.invalidationData, initialized.invalidationData) && fr.t.c(this.userEdorAddress, initialized.userEdorAddress) && fr.t.c(this.statementData, initialized.statementData);
        }

        public int hashCode() {
            return (((this.invalidationData.hashCode() * 31) + this.userEdorAddress.hashCode()) * 31) + this.statementData.hashCode();
        }

        @Override // jc2.d
        /* JADX INFO: renamed from: l, reason: from getter */
        public iy.b0 getUserEdorAddress() {
            return this.userEdorAddress;
        }

        public String toString() {
            return "Initialized(invalidationData=" + this.invalidationData + ", userEdorAddress=" + this.userEdorAddress + ", statementData=" + this.statementData + ')';
        }

        public /* synthetic */ Initialized(hl0.a aVar, iy.b0 b0Var, StatementData statementData, int i15, fr.k kVar) {
            if ((i15 & 4) != 0) {
                statementData = new StatementData(false, false, false, 7, null);
            }
            this(aVar, b0Var, statementData);
        }
    }

    /* JADX INFO: renamed from: jc2.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Ljc2/d$c;", "", "", "isChecked", "showError", "scrollTo", "<init>", "(ZZZ)V", "a", "(ZZZ)Ljc2/d$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "d", "c", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollTo;

        public StatementData(boolean z15, boolean z16, boolean z17) {
            this.isChecked = z15;
            this.showError = z16;
            this.scrollTo = z17;
        }

        public static /* synthetic */ StatementData b(StatementData statementData, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = statementData.isChecked;
            }
            if ((i15 & 2) != 0) {
                z16 = statementData.showError;
            }
            if ((i15 & 4) != 0) {
                z17 = statementData.scrollTo;
            }
            return statementData.a(z15, z16, z17);
        }

        public final StatementData a(boolean isChecked, boolean showError, boolean scrollTo) {
            return new StatementData(isChecked, showError, scrollTo);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getScrollTo() {
            return this.scrollTo;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowError() {
            return this.showError;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatementData)) {
                return false;
            }
            StatementData statementData = (StatementData) other;
            return this.isChecked == statementData.isChecked && this.showError == statementData.showError && this.scrollTo == statementData.scrollTo;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isChecked) * 31) + Boolean.hashCode(this.showError)) * 31) + Boolean.hashCode(this.scrollTo);
        }

        public String toString() {
            return "StatementData(isChecked=" + this.isChecked + ", showError=" + this.showError + ", scrollTo=" + this.scrollTo + ')';
        }

        public /* synthetic */ StatementData(boolean z15, boolean z16, boolean z17, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? false : z16, (i15 & 4) != 0 ? false : z17);
        }
    }
}
