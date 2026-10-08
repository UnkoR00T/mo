package ky3;

import by3.BlikRequiredData;
import java.util.List;
import p071kotlin.Metadata;
import ur0.BEAlias;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lky3/e;", "", "a", "Lky3/e$a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lky3/e$a;", "Lky3/e;", "Lby3/b;", "a", "()Lby3/b;", "paymentData", "Lky3/e$a$a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends e {

        /* JADX INFO: renamed from: ky3.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, d2 = {"Lky3/e$a$a;", "Lky3/e$a;", "Lby3/b;", "paymentData", "", "Lur0/a;", "aliasesData", "selectedAlias", "", "shouldShowOneClickPaymentInfoAlert", "Lg30/v;", "bottomSheetState", "<init>", "(Lby3/b;Ljava/util/List;Lur0/a;ZLg30/v;)V", "b", "(Lby3/b;Ljava/util/List;Lur0/a;ZLg30/v;)Lky3/e$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lby3/b;", "()Lby3/b;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lur0/a;", "f", "()Lur0/a;", "Z", "g", "()Z", "e", "Lg30/v;", "()Lg30/v;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Aliases implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BlikRequiredData paymentData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<BEAlias> aliasesData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BEAlias selectedAlias;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShowOneClickPaymentInfoAlert;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final g30.v bottomSheetState;

            public Aliases(BlikRequiredData blikRequiredData, List<BEAlias> list, BEAlias bEAlias, boolean z15, g30.v vVar) {
                this.paymentData = blikRequiredData;
                this.aliasesData = list;
                this.selectedAlias = bEAlias;
                this.shouldShowOneClickPaymentInfoAlert = z15;
                this.bottomSheetState = vVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Aliases c(Aliases aliases, BlikRequiredData blikRequiredData, List list, BEAlias bEAlias, boolean z15, g30.v vVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    blikRequiredData = aliases.paymentData;
                }
                if ((i15 & 2) != 0) {
                    list = aliases.aliasesData;
                }
                if ((i15 & 4) != 0) {
                    bEAlias = aliases.selectedAlias;
                }
                if ((i15 & 8) != 0) {
                    z15 = aliases.shouldShowOneClickPaymentInfoAlert;
                }
                if ((i15 & 16) != 0) {
                    vVar = aliases.bottomSheetState;
                }
                g30.v vVar2 = vVar;
                BEAlias bEAlias2 = bEAlias;
                return aliases.b(blikRequiredData, list, bEAlias2, z15, vVar2);
            }

            @Override // ky3.e.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public BlikRequiredData getPaymentData() {
                return this.paymentData;
            }

            public final Aliases b(BlikRequiredData paymentData, List<BEAlias> aliasesData, BEAlias selectedAlias, boolean shouldShowOneClickPaymentInfoAlert, g30.v bottomSheetState) {
                return new Aliases(paymentData, aliasesData, selectedAlias, shouldShowOneClickPaymentInfoAlert, bottomSheetState);
            }

            public final List<BEAlias> d() {
                return this.aliasesData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final g30.v getBottomSheetState() {
                return this.bottomSheetState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Aliases)) {
                    return false;
                }
                Aliases aliases = (Aliases) other;
                return fr.t.c(this.paymentData, aliases.paymentData) && fr.t.c(this.aliasesData, aliases.aliasesData) && fr.t.c(this.selectedAlias, aliases.selectedAlias) && this.shouldShowOneClickPaymentInfoAlert == aliases.shouldShowOneClickPaymentInfoAlert && this.bottomSheetState == aliases.bottomSheetState;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BEAlias getSelectedAlias() {
                return this.selectedAlias;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getShouldShowOneClickPaymentInfoAlert() {
                return this.shouldShowOneClickPaymentInfoAlert;
            }

            public int hashCode() {
                return (((((((this.paymentData.hashCode() * 31) + this.aliasesData.hashCode()) * 31) + this.selectedAlias.hashCode()) * 31) + Boolean.hashCode(this.shouldShowOneClickPaymentInfoAlert)) * 31) + this.bottomSheetState.hashCode();
            }

            public String toString() {
                return "Aliases(paymentData=" + this.paymentData + ", aliasesData=" + this.aliasesData + ", selectedAlias=" + this.selectedAlias + ", shouldShowOneClickPaymentInfoAlert=" + this.shouldShowOneClickPaymentInfoAlert + ", bottomSheetState=" + this.bottomSheetState + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        BlikRequiredData getPaymentData();
    }
}
