package zx3;

import by3.BlikRequiredData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lzx3/e;", "", "a", "Lzx3/e$a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lzx3/e$a;", "Lzx3/e;", "Lby3/b;", "a", "()Lby3/b;", "paymentData", "Lzx3/e$a$a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends e {

        /* JADX INFO: renamed from: zx3.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lzx3/e$a$a;", "Lzx3/e$a;", "Lby3/b;", "paymentData", "", "blikCode", "Lby3/a;", "blikCodeValidationState", "<init>", "(Lby3/b;Ljava/lang/String;Lby3/a;)V", "b", "(Lby3/b;Ljava/lang/String;Lby3/a;)Lzx3/e$a$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lby3/b;", "()Lby3/b;", "Ljava/lang/String;", "d", "c", "Lby3/a;", "e", "()Lby3/a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BlikCode implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BlikRequiredData paymentData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String blikCode;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final by3.a blikCodeValidationState;

            public BlikCode(BlikRequiredData blikRequiredData, String str, by3.a aVar) {
                this.paymentData = blikRequiredData;
                this.blikCode = str;
                this.blikCodeValidationState = aVar;
            }

            public static /* synthetic */ BlikCode c(BlikCode blikCode, BlikRequiredData blikRequiredData, String str, by3.a aVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    blikRequiredData = blikCode.paymentData;
                }
                if ((i15 & 2) != 0) {
                    str = blikCode.blikCode;
                }
                if ((i15 & 4) != 0) {
                    aVar = blikCode.blikCodeValidationState;
                }
                return blikCode.b(blikRequiredData, str, aVar);
            }

            @Override // zx3.e.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public BlikRequiredData getPaymentData() {
                return this.paymentData;
            }

            public final BlikCode b(BlikRequiredData paymentData, String blikCode, by3.a blikCodeValidationState) {
                return new BlikCode(paymentData, blikCode, blikCodeValidationState);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getBlikCode() {
                return this.blikCode;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final by3.a getBlikCodeValidationState() {
                return this.blikCodeValidationState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BlikCode)) {
                    return false;
                }
                BlikCode blikCode = (BlikCode) other;
                return fr.t.c(this.paymentData, blikCode.paymentData) && fr.t.c(this.blikCode, blikCode.blikCode) && this.blikCodeValidationState == blikCode.blikCodeValidationState;
            }

            public int hashCode() {
                return (((this.paymentData.hashCode() * 31) + this.blikCode.hashCode()) * 31) + this.blikCodeValidationState.hashCode();
            }

            public String toString() {
                return "BlikCode(paymentData=" + this.paymentData + ", blikCode=" + this.blikCode + ", blikCodeValidationState=" + this.blikCodeValidationState + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        BlikRequiredData getPaymentData();
    }
}
