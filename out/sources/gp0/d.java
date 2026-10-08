package gp0;

import fp0.InstitutionCardAndCertData;
import fp0.SummaryData;
import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import xw.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgp0/d;", "", "Lgp0/d$a;", "", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b {

    /* JADX INFO: renamed from: gp0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, d2 = {"Lgp0/d$a;", "Lgz/b$a;", "Lfp0/f;", "institutionCardAndCertData", "Lfp0/j;", "summaryData", "Lxw/g;", "pesel", "Lry/c;", "certKeyPair", "<init>", "(Lfp0/f;Lfp0/j;Liy/b0;Lry/c;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp0/f;", "b", "()Lfp0/f;", "Lfp0/j;", "d", "()Lfp0/j;", "c", "Liy/b0;", "()Liy/b0;", "Lry/c;", "()Lry/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstitutionCardAndCertData institutionCardAndCertData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SummaryData summaryData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pesel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certKeyPair;

        public /* synthetic */ Params(InstitutionCardAndCertData institutionCardAndCertData, SummaryData summaryData, b0 b0Var, CertKeyPair certKeyPair, k kVar) {
            this(institutionCardAndCertData, summaryData, b0Var, certKeyPair);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertKeyPair() {
            return this.certKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InstitutionCardAndCertData getInstitutionCardAndCertData() {
            return this.institutionCardAndCertData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPesel() {
            return this.pesel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final SummaryData getSummaryData() {
            return this.summaryData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.institutionCardAndCertData, params.institutionCardAndCertData) && t.c(this.summaryData, params.summaryData) && g.f(this.pesel, params.pesel) && t.c(this.certKeyPair, params.certKeyPair);
        }

        public int hashCode() {
            return (((((this.institutionCardAndCertData.hashCode() * 31) + this.summaryData.hashCode()) * 31) + g.h(this.pesel)) * 31) + this.certKeyPair.hashCode();
        }

        public String toString() {
            return "Params(institutionCardAndCertData=" + this.institutionCardAndCertData + ", summaryData=" + this.summaryData + ", pesel=" + g.i(this.pesel) + ", certKeyPair=" + this.certKeyPair + ")";
        }

        private Params(InstitutionCardAndCertData institutionCardAndCertData, SummaryData summaryData, b0 b0Var, CertKeyPair certKeyPair) {
            this.institutionCardAndCertData = institutionCardAndCertData;
            this.summaryData = summaryData;
            this.pesel = b0Var;
            this.certKeyPair = certKeyPair;
        }
    }
}
