package fq2;

import hq2.CheckBoxState;
import jl0.PassportChildAgreementAttachmentConfigOutputModel;
import jl0.PassportChildAgreementAttachments;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lfq2/d;", "", "a", "b", "d", "c", "Lfq2/d$a;", "Lfq2/d$b;", "Lfq2/d$c;", "Lfq2/d$d;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lfq2/d$a;", "Lfq2/d;", "b", "a", "Lfq2/d$a$a;", "Lfq2/d$a$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends d {

        /* JADX INFO: renamed from: fq2.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfq2/d$a$a;", "Lfq2/d$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq2/d$a$b;", "Lfq2/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f66164a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -51864726;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lfq2/d$b;", "Lfq2/d;", "Lfq2/d$b$a;", "getData", "()Lfq2/d$b$a;", "data", "", "a", "()Z", "scrollToStatementCheckBox", "d", "b", "e", "c", "f", "Lfq2/d$b$b;", "Lfq2/d$b$c;", "Lfq2/d$b$d;", "Lfq2/d$b$e;", "Lfq2/d$b$f;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends d {

        /* JADX INFO: renamed from: fq2.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfq2/d$b$a;", "", "Lhq2/c$a;", "summaryContractData", "Lhq2/b;", "statementState", "<init>", "(Lhq2/c$a;Lhq2/b;)V", "a", "(Lhq2/c$a;Lhq2/b;)Lfq2/d$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhq2/c$a;", "d", "()Lhq2/c$a;", "b", "Lhq2/b;", "c", "()Lhq2/b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Data {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hq2.c.SummaryContractData summaryContractData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxState statementState;

            public Data(hq2.c.SummaryContractData summaryContractData, CheckBoxState checkBoxState) {
                this.summaryContractData = summaryContractData;
                this.statementState = checkBoxState;
            }

            public static /* synthetic */ Data b(Data data, hq2.c.SummaryContractData summaryContractData, CheckBoxState checkBoxState, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    summaryContractData = data.summaryContractData;
                }
                if ((i15 & 2) != 0) {
                    checkBoxState = data.statementState;
                }
                return data.a(summaryContractData, checkBoxState);
            }

            public final Data a(hq2.c.SummaryContractData summaryContractData, CheckBoxState statementState) {
                return new Data(summaryContractData, statementState);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CheckBoxState getStatementState() {
                return this.statementState;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hq2.c.SummaryContractData getSummaryContractData() {
                return this.summaryContractData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return fr.t.c(this.summaryContractData, data.summaryContractData) && fr.t.c(this.statementState, data.statementState);
            }

            public int hashCode() {
                return (this.summaryContractData.hashCode() * 31) + this.statementState.hashCode();
            }

            public String toString() {
                return "Data(summaryContractData=" + this.summaryContractData + ", statementState=" + this.statementState + ')';
            }
        }

        /* JADX INFO: renamed from: fq2.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lfq2/d$b$b;", "Lfq2/d$b;", "a", "b", "Lfq2/d$b$b$a;", "Lfq2/d$b$b$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC1470b extends b {

            /* JADX INFO: renamed from: fq2.d$b$b$a, reason: from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfq2/d$b$b$a;", "Lfq2/d$b$b;", "Lfq2/d$b$a;", "data", "Ljl0/u;", "passportChildAgreementAttachments", "", "scrollToStatementCheckBox", "<init>", "(Lfq2/d$b$a;Ljl0/u;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq2/d$b$a;", "getData", "()Lfq2/d$b$a;", "b", "Ljl0/u;", "()Ljl0/u;", "c", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Generating implements InterfaceC1470b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Data data;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final PassportChildAgreementAttachments passportChildAgreementAttachments;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean scrollToStatementCheckBox;

                public Generating(Data data, PassportChildAgreementAttachments passportChildAgreementAttachments, boolean z15) {
                    this.data = data;
                    this.passportChildAgreementAttachments = passportChildAgreementAttachments;
                    this.scrollToStatementCheckBox = z15;
                }

                @Override // fq2.d.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public boolean getScrollToStatementCheckBox() {
                    return this.scrollToStatementCheckBox;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final PassportChildAgreementAttachments getPassportChildAgreementAttachments() {
                    return this.passportChildAgreementAttachments;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Generating)) {
                        return false;
                    }
                    Generating generating = (Generating) other;
                    return fr.t.c(this.data, generating.data) && fr.t.c(this.passportChildAgreementAttachments, generating.passportChildAgreementAttachments) && this.scrollToStatementCheckBox == generating.scrollToStatementCheckBox;
                }

                @Override // fq2.d.b
                public Data getData() {
                    return this.data;
                }

                public int hashCode() {
                    int iHashCode = this.data.hashCode() * 31;
                    PassportChildAgreementAttachments passportChildAgreementAttachments = this.passportChildAgreementAttachments;
                    return ((iHashCode + (passportChildAgreementAttachments == null ? 0 : passportChildAgreementAttachments.hashCode())) * 31) + Boolean.hashCode(this.scrollToStatementCheckBox);
                }

                public String toString() {
                    return "Generating(data=" + this.data + ", passportChildAgreementAttachments=" + this.passportChildAgreementAttachments + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ')';
                }
            }

            /* JADX INFO: renamed from: fq2.d$b$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfq2/d$b$b$b;", "Lfq2/d$b$b;", "Lfq2/d$b$a;", "data", "Ljl0/u;", "passportChildAgreementAttachments", "", "scrollToStatementCheckBox", "<init>", "(Lfq2/d$b$a;Ljl0/u;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq2/d$b$a;", "getData", "()Lfq2/d$b$a;", "b", "Ljl0/u;", "()Ljl0/u;", "c", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class MissingToken implements InterfaceC1470b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Data data;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final PassportChildAgreementAttachments passportChildAgreementAttachments;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean scrollToStatementCheckBox;

                public MissingToken(Data data, PassportChildAgreementAttachments passportChildAgreementAttachments, boolean z15) {
                    this.data = data;
                    this.passportChildAgreementAttachments = passportChildAgreementAttachments;
                    this.scrollToStatementCheckBox = z15;
                }

                @Override // fq2.d.b
                /* JADX INFO: renamed from: a, reason: from getter */
                public boolean getScrollToStatementCheckBox() {
                    return this.scrollToStatementCheckBox;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final PassportChildAgreementAttachments getPassportChildAgreementAttachments() {
                    return this.passportChildAgreementAttachments;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MissingToken)) {
                        return false;
                    }
                    MissingToken missingToken = (MissingToken) other;
                    return fr.t.c(this.data, missingToken.data) && fr.t.c(this.passportChildAgreementAttachments, missingToken.passportChildAgreementAttachments) && this.scrollToStatementCheckBox == missingToken.scrollToStatementCheckBox;
                }

                @Override // fq2.d.b
                public Data getData() {
                    return this.data;
                }

                public int hashCode() {
                    int iHashCode = this.data.hashCode() * 31;
                    PassportChildAgreementAttachments passportChildAgreementAttachments = this.passportChildAgreementAttachments;
                    return ((iHashCode + (passportChildAgreementAttachments == null ? 0 : passportChildAgreementAttachments.hashCode())) * 31) + Boolean.hashCode(this.scrollToStatementCheckBox);
                }

                public String toString() {
                    return "MissingToken(data=" + this.data + ", passportChildAgreementAttachments=" + this.passportChildAgreementAttachments + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ')';
                }
            }
        }

        /* JADX INFO: renamed from: fq2.d$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfq2/d$b$c;", "Lfq2/d$b;", "Lfq2/d$b$a;", "data", "", "scrollToStatementCheckBox", "<init>", "(Lfq2/d$b$a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq2/d$b$a;", "getData", "()Lfq2/d$b$a;", "b", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PreparingFiles implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToStatementCheckBox;

            public PreparingFiles(Data data, boolean z15) {
                this.data = data;
                this.scrollToStatementCheckBox = z15;
            }

            @Override // fq2.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getScrollToStatementCheckBox() {
                return this.scrollToStatementCheckBox;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PreparingFiles)) {
                    return false;
                }
                PreparingFiles preparingFiles = (PreparingFiles) other;
                return fr.t.c(this.data, preparingFiles.data) && this.scrollToStatementCheckBox == preparingFiles.scrollToStatementCheckBox;
            }

            @Override // fq2.d.b
            public Data getData() {
                return this.data;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + Boolean.hashCode(this.scrollToStatementCheckBox);
            }

            public String toString() {
                return "PreparingFiles(data=" + this.data + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ')';
            }
        }

        /* JADX INFO: renamed from: fq2.d$b$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfq2/d$b$d;", "Lfq2/d$b;", "Lfq2/d$b$a;", "data", "", "scrollToStatementCheckBox", "<init>", "(Lfq2/d$b$a;Z)V", "b", "(Lfq2/d$b$a;Z)Lfq2/d$b$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq2/d$b$a;", "getData", "()Lfq2/d$b$a;", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Presenting implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToStatementCheckBox;

            public Presenting(Data data, boolean z15) {
                this.data = data;
                this.scrollToStatementCheckBox = z15;
            }

            public static /* synthetic */ Presenting c(Presenting presenting, Data data, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    data = presenting.data;
                }
                if ((i15 & 2) != 0) {
                    z15 = presenting.scrollToStatementCheckBox;
                }
                return presenting.b(data, z15);
            }

            @Override // fq2.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getScrollToStatementCheckBox() {
                return this.scrollToStatementCheckBox;
            }

            public final Presenting b(Data data, boolean scrollToStatementCheckBox) {
                return new Presenting(data, scrollToStatementCheckBox);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Presenting)) {
                    return false;
                }
                Presenting presenting = (Presenting) other;
                return fr.t.c(this.data, presenting.data) && this.scrollToStatementCheckBox == presenting.scrollToStatementCheckBox;
            }

            @Override // fq2.d.b
            public Data getData() {
                return this.data;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + Boolean.hashCode(this.scrollToStatementCheckBox);
            }

            public String toString() {
                return "Presenting(data=" + this.data + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ')';
            }
        }

        /* JADX INFO: renamed from: fq2.d$b$e, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfq2/d$b$e;", "Lfq2/d$b;", "Lfq2/d$b$a;", "data", "Lry/a;", "base64xml", "", "scrollToStatementCheckBox", "<init>", "(Lfq2/d$b$a;Liy/b0;ZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq2/d$b$a;", "getData", "()Lfq2/d$b$a;", "b", "Liy/b0;", "()Liy/b0;", "c", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SubmitXml implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 base64xml;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToStatementCheckBox;

            public /* synthetic */ SubmitXml(Data data, iy.b0 b0Var, boolean z15, fr.k kVar) {
                this(data, b0Var, z15);
            }

            @Override // fq2.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getScrollToStatementCheckBox() {
                return this.scrollToStatementCheckBox;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final iy.b0 getBase64xml() {
                return this.base64xml;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubmitXml)) {
                    return false;
                }
                SubmitXml submitXml = (SubmitXml) other;
                return fr.t.c(this.data, submitXml.data) && ry.a.d(this.base64xml, submitXml.base64xml) && this.scrollToStatementCheckBox == submitXml.scrollToStatementCheckBox;
            }

            @Override // fq2.d.b
            public Data getData() {
                return this.data;
            }

            public int hashCode() {
                return (((this.data.hashCode() * 31) + ry.a.e(this.base64xml)) * 31) + Boolean.hashCode(this.scrollToStatementCheckBox);
            }

            public String toString() {
                return "SubmitXml(data=" + this.data + ", base64xml=" + ((Object) ry.a.f(this.base64xml)) + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ')';
            }

            private SubmitXml(Data data, iy.b0 b0Var, boolean z15) {
                this.data = data;
                this.base64xml = b0Var;
                this.scrollToStatementCheckBox = z15;
            }
        }

        /* JADX INFO: renamed from: fq2.d$b$f, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfq2/d$b$f;", "Lfq2/d$b;", "Lfq2/d$b$a;", "data", "Ljl0/s;", "passportChildAgreementAttachmentConfigOutputModel", "", "scrollToStatementCheckBox", "<init>", "(Lfq2/d$b$a;Ljl0/s;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq2/d$b$a;", "getData", "()Lfq2/d$b$a;", "b", "Ljl0/s;", "()Ljl0/s;", "c", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UploadingFiles implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Data data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final PassportChildAgreementAttachmentConfigOutputModel passportChildAgreementAttachmentConfigOutputModel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToStatementCheckBox;

            public UploadingFiles(Data data, PassportChildAgreementAttachmentConfigOutputModel passportChildAgreementAttachmentConfigOutputModel, boolean z15) {
                this.data = data;
                this.passportChildAgreementAttachmentConfigOutputModel = passportChildAgreementAttachmentConfigOutputModel;
                this.scrollToStatementCheckBox = z15;
            }

            @Override // fq2.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getScrollToStatementCheckBox() {
                return this.scrollToStatementCheckBox;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final PassportChildAgreementAttachmentConfigOutputModel getPassportChildAgreementAttachmentConfigOutputModel() {
                return this.passportChildAgreementAttachmentConfigOutputModel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadingFiles)) {
                    return false;
                }
                UploadingFiles uploadingFiles = (UploadingFiles) other;
                return fr.t.c(this.data, uploadingFiles.data) && fr.t.c(this.passportChildAgreementAttachmentConfigOutputModel, uploadingFiles.passportChildAgreementAttachmentConfigOutputModel) && this.scrollToStatementCheckBox == uploadingFiles.scrollToStatementCheckBox;
            }

            @Override // fq2.d.b
            public Data getData() {
                return this.data;
            }

            public int hashCode() {
                return (((this.data.hashCode() * 31) + this.passportChildAgreementAttachmentConfigOutputModel.hashCode()) * 31) + Boolean.hashCode(this.scrollToStatementCheckBox);
            }

            public String toString() {
                return "UploadingFiles(data=" + this.data + ", passportChildAgreementAttachmentConfigOutputModel=" + this.passportChildAgreementAttachmentConfigOutputModel + ", scrollToStatementCheckBox=" + this.scrollToStatementCheckBox + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        boolean getScrollToStatementCheckBox();

        Data getData();
    }

    /* JADX INFO: renamed from: fq2.d$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfq2/d$c;", "Lfq2/d;", "Lhb4/c;", "errorVMS", "Lfq2/d$b;", "initializedState", "<init>", "(Lhb4/c;Lfq2/d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "Lfq2/d$b;", "c", "()Lfq2/d$b;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializedError implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b initializedState;

        public InitializedError(hb4.c cVar, b bVar) {
            this.errorVMS = cVar;
            this.initializedState = bVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getInitializedState() {
            return this.initializedState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializedError)) {
                return false;
            }
            InitializedError initializedError = (InitializedError) other;
            return fr.t.c(this.errorVMS, initializedError.errorVMS) && fr.t.c(this.initializedState, initializedError.initializedState);
        }

        public int hashCode() {
            return (this.errorVMS.hashCode() * 31) + this.initializedState.hashCode();
        }

        public String toString() {
            return "InitializedError(errorVMS=" + this.errorVMS + ", initializedState=" + this.initializedState + ')';
        }
    }

    /* JADX INFO: renamed from: fq2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfq2/d$d;", "Lfq2/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1473d implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1473d f66185a = new C1473d();

        private C1473d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1473d);
        }

        public int hashCode() {
            return -694094085;
        }

        public String toString() {
            return "Success";
        }
    }
}
