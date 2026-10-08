package tg2;

import java.math.BigDecimal;
import java.util.Set;
import p071kotlin.Metadata;
import tq0.LandRegisterDocument;
import tq0.LandRegisterSubDocument;
import tq0.MyRegistry;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ltg2/b;", "", "a", "Ltg2/b$a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Ltg2/b$a;", "Ltg2/b;", "Ltq0/u;", "x0", "()Ltq0/u;", "myRegistry", "Ltq0/p;", "y0", "()Ltq0/p;", "selectedDocument", "", "Ltq0/s;", "z0", "()Ljava/util/Set;", "extractDocuments", "Ljava/math/BigDecimal;", "A0", "()Ljava/math/BigDecimal;", "calculatedAmount", "c", "a", "b", "Ltg2/b$a$a;", "Ltg2/b$a$b;", "Ltg2/b$a$c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends b {

        /* JADX INFO: renamed from: tg2.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Ltg2/b$a$a;", "Ltg2/b$a;", "Ltq0/u;", "myRegistry", "Ltq0/p;", "selectedDocument", "", "Ltq0/s;", "extractDocuments", "Ljava/math/BigDecimal;", "calculatedAmount", "<init>", "(Ltq0/u;Ltq0/p;Ljava/util/Set;Ljava/math/BigDecimal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/u;", "x0", "()Ltq0/u;", "b", "Ltq0/p;", "y0", "()Ltq0/p;", "c", "Ljava/util/Set;", "z0", "()Ljava/util/Set;", "d", "Ljava/math/BigDecimal;", "A0", "()Ljava/math/BigDecimal;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreatingPayment implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final MyRegistry myRegistry;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final LandRegisterDocument selectedDocument;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<LandRegisterSubDocument> extractDocuments;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final BigDecimal calculatedAmount;

            public CreatingPayment(MyRegistry myRegistry, LandRegisterDocument landRegisterDocument, Set<LandRegisterSubDocument> set, BigDecimal bigDecimal) {
                this.myRegistry = myRegistry;
                this.selectedDocument = landRegisterDocument;
                this.extractDocuments = set;
                this.calculatedAmount = bigDecimal;
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: A0, reason: from getter */
            public BigDecimal getCalculatedAmount() {
                return this.calculatedAmount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreatingPayment)) {
                    return false;
                }
                CreatingPayment creatingPayment = (CreatingPayment) other;
                return fr.t.c(this.myRegistry, creatingPayment.myRegistry) && fr.t.c(this.selectedDocument, creatingPayment.selectedDocument) && fr.t.c(this.extractDocuments, creatingPayment.extractDocuments) && fr.t.c(this.calculatedAmount, creatingPayment.calculatedAmount);
            }

            public int hashCode() {
                return (((((this.myRegistry.hashCode() * 31) + this.selectedDocument.hashCode()) * 31) + this.extractDocuments.hashCode()) * 31) + this.calculatedAmount.hashCode();
            }

            public String toString() {
                return "CreatingPayment(myRegistry=" + this.myRegistry + ", selectedDocument=" + this.selectedDocument + ", extractDocuments=" + this.extractDocuments + ", calculatedAmount=" + this.calculatedAmount + ')';
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: x0, reason: from getter */
            public MyRegistry getMyRegistry() {
                return this.myRegistry;
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: y0, reason: from getter */
            public LandRegisterDocument getSelectedDocument() {
                return this.selectedDocument;
            }

            @Override // tg2.b.a
            public Set<LandRegisterSubDocument> z0() {
                return this.extractDocuments;
            }
        }

        /* JADX INFO: renamed from: tg2.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001a\u0010,¨\u0006-"}, d2 = {"Ltg2/b$a$b;", "Ltg2/b$a;", "Ltq0/u;", "myRegistry", "Ltq0/p;", "selectedDocument", "", "Ltq0/s;", "extractDocuments", "Ljava/math/BigDecimal;", "calculatedAmount", "Lhb4/c;", "errorVMS", "<init>", "(Ltq0/u;Ltq0/p;Ljava/util/Set;Ljava/math/BigDecimal;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/u;", "x0", "()Ltq0/u;", "b", "Ltq0/p;", "y0", "()Ltq0/p;", "c", "Ljava/util/Set;", "z0", "()Ljava/util/Set;", "d", "Ljava/math/BigDecimal;", "A0", "()Ljava/math/BigDecimal;", "e", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreatingPaymentError implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final MyRegistry myRegistry;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final LandRegisterDocument selectedDocument;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<LandRegisterSubDocument> extractDocuments;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final BigDecimal calculatedAmount;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public CreatingPaymentError(MyRegistry myRegistry, LandRegisterDocument landRegisterDocument, Set<LandRegisterSubDocument> set, BigDecimal bigDecimal, hb4.c cVar) {
                this.myRegistry = myRegistry;
                this.selectedDocument = landRegisterDocument;
                this.extractDocuments = set;
                this.calculatedAmount = bigDecimal;
                this.errorVMS = cVar;
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: A0, reason: from getter */
            public BigDecimal getCalculatedAmount() {
                return this.calculatedAmount;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreatingPaymentError)) {
                    return false;
                }
                CreatingPaymentError creatingPaymentError = (CreatingPaymentError) other;
                return fr.t.c(this.myRegistry, creatingPaymentError.myRegistry) && fr.t.c(this.selectedDocument, creatingPaymentError.selectedDocument) && fr.t.c(this.extractDocuments, creatingPaymentError.extractDocuments) && fr.t.c(this.calculatedAmount, creatingPaymentError.calculatedAmount) && fr.t.c(this.errorVMS, creatingPaymentError.errorVMS);
            }

            public int hashCode() {
                return (((((((this.myRegistry.hashCode() * 31) + this.selectedDocument.hashCode()) * 31) + this.extractDocuments.hashCode()) * 31) + this.calculatedAmount.hashCode()) * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "CreatingPaymentError(myRegistry=" + this.myRegistry + ", selectedDocument=" + this.selectedDocument + ", extractDocuments=" + this.extractDocuments + ", calculatedAmount=" + this.calculatedAmount + ", errorVMS=" + this.errorVMS + ')';
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: x0, reason: from getter */
            public MyRegistry getMyRegistry() {
                return this.myRegistry;
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: y0, reason: from getter */
            public LandRegisterDocument getSelectedDocument() {
                return this.selectedDocument;
            }

            @Override // tg2.b.a
            public Set<LandRegisterSubDocument> z0() {
                return this.extractDocuments;
            }
        }

        /* JADX INFO: renamed from: tg2.b$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Ltg2/b$a$c;", "Ltg2/b$a;", "Ltq0/u;", "myRegistry", "Ltq0/p;", "selectedDocument", "", "Ltq0/s;", "extractDocuments", "Ljava/math/BigDecimal;", "calculatedAmount", "<init>", "(Ltq0/u;Ltq0/p;Ljava/util/Set;Ljava/math/BigDecimal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/u;", "x0", "()Ltq0/u;", "b", "Ltq0/p;", "y0", "()Ltq0/p;", "c", "Ljava/util/Set;", "z0", "()Ljava/util/Set;", "d", "Ljava/math/BigDecimal;", "A0", "()Ljava/math/BigDecimal;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final MyRegistry myRegistry;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final LandRegisterDocument selectedDocument;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<LandRegisterSubDocument> extractDocuments;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final BigDecimal calculatedAmount;

            public Screen(MyRegistry myRegistry, LandRegisterDocument landRegisterDocument, Set<LandRegisterSubDocument> set, BigDecimal bigDecimal) {
                this.myRegistry = myRegistry;
                this.selectedDocument = landRegisterDocument;
                this.extractDocuments = set;
                this.calculatedAmount = bigDecimal;
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: A0, reason: from getter */
            public BigDecimal getCalculatedAmount() {
                return this.calculatedAmount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.myRegistry, screen.myRegistry) && fr.t.c(this.selectedDocument, screen.selectedDocument) && fr.t.c(this.extractDocuments, screen.extractDocuments) && fr.t.c(this.calculatedAmount, screen.calculatedAmount);
            }

            public int hashCode() {
                return (((((this.myRegistry.hashCode() * 31) + this.selectedDocument.hashCode()) * 31) + this.extractDocuments.hashCode()) * 31) + this.calculatedAmount.hashCode();
            }

            public String toString() {
                return "Screen(myRegistry=" + this.myRegistry + ", selectedDocument=" + this.selectedDocument + ", extractDocuments=" + this.extractDocuments + ", calculatedAmount=" + this.calculatedAmount + ')';
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: x0, reason: from getter */
            public MyRegistry getMyRegistry() {
                return this.myRegistry;
            }

            @Override // tg2.b.a
            /* JADX INFO: renamed from: y0, reason: from getter */
            public LandRegisterDocument getSelectedDocument() {
                return this.selectedDocument;
            }

            @Override // tg2.b.a
            public Set<LandRegisterSubDocument> z0() {
                return this.extractDocuments;
            }
        }

        /* JADX INFO: renamed from: A0 */
        BigDecimal getCalculatedAmount();

        /* JADX INFO: renamed from: x0 */
        MyRegistry getMyRegistry();

        /* JADX INFO: renamed from: y0 */
        LandRegisterDocument getSelectedDocument();

        Set<LandRegisterSubDocument> z0();
    }
}
