package jy3;

import p071kotlin.Metadata;
import qx3.MakePaymentInitialData;
import xr0.BEStartGooglePayPaymentResponseModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ljy3/e;", "", "a", "Ljy3/e$a;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Ljy3/e$a;", "Ljy3/e;", "Lqx3/d;", "W", "()Lqx3/d;", "makePaymentInitialData", "", "Y", "()Z", "isGooglePayRemoteFlagActive", "X", "isGooglePayReady", "a", "Ljy3/e$a$a;", "Ljy3/h;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends e {

        /* JADX INFO: renamed from: jy3.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ljy3/e$a$a;", "Ljy3/e$a;", "d", "a", "c", "b", "Ljy3/e$a$a$a;", "Ljy3/e$a$a$b;", "Ljy3/e$a$a$c;", "Ljy3/e$a$a$d;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC2541a extends a {

            /* JADX INFO: renamed from: jy3.e$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!¨\u0006\""}, d2 = {"Ljy3/e$a$a$a;", "Ljy3/e$a$a;", "Lqx3/d;", "makePaymentInitialData", "", "isGooglePayRemoteFlagActive", "isGooglePayReady", "Lxr0/h;", "responseModel", "<init>", "(Lqx3/d;ZZLxr0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqx3/d;", "W", "()Lqx3/d;", "b", "Z", "Y", "()Z", "c", "X", "d", "Lxr0/h;", "()Lxr0/h;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class CollectGooglePayStatus implements InterfaceC2541a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final MakePaymentInitialData makePaymentInitialData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayRemoteFlagActive;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayReady;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final BEStartGooglePayPaymentResponseModel responseModel;

                public CollectGooglePayStatus(MakePaymentInitialData makePaymentInitialData, boolean z15, boolean z16, BEStartGooglePayPaymentResponseModel bEStartGooglePayPaymentResponseModel) {
                    this.makePaymentInitialData = makePaymentInitialData;
                    this.isGooglePayRemoteFlagActive = z15;
                    this.isGooglePayReady = z16;
                    this.responseModel = bEStartGooglePayPaymentResponseModel;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: W, reason: from getter */
                public MakePaymentInitialData getMakePaymentInitialData() {
                    return this.makePaymentInitialData;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: X, reason: from getter */
                public boolean getIsGooglePayReady() {
                    return this.isGooglePayReady;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: Y, reason: from getter */
                public boolean getIsGooglePayRemoteFlagActive() {
                    return this.isGooglePayRemoteFlagActive;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final BEStartGooglePayPaymentResponseModel getResponseModel() {
                    return this.responseModel;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CollectGooglePayStatus)) {
                        return false;
                    }
                    CollectGooglePayStatus collectGooglePayStatus = (CollectGooglePayStatus) other;
                    return fr.t.c(this.makePaymentInitialData, collectGooglePayStatus.makePaymentInitialData) && this.isGooglePayRemoteFlagActive == collectGooglePayStatus.isGooglePayRemoteFlagActive && this.isGooglePayReady == collectGooglePayStatus.isGooglePayReady && fr.t.c(this.responseModel, collectGooglePayStatus.responseModel);
                }

                public int hashCode() {
                    return (((((this.makePaymentInitialData.hashCode() * 31) + Boolean.hashCode(this.isGooglePayRemoteFlagActive)) * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31) + this.responseModel.hashCode();
                }

                public String toString() {
                    return "CollectGooglePayStatus(makePaymentInitialData=" + this.makePaymentInitialData + ", isGooglePayRemoteFlagActive=" + this.isGooglePayRemoteFlagActive + ", isGooglePayReady=" + this.isGooglePayReady + ", responseModel=" + this.responseModel + ')';
                }
            }

            /* JADX INFO: renamed from: jy3.e$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Ljy3/e$a$a$b;", "Ljy3/e$a$a;", "Lqx3/d;", "makePaymentInitialData", "", "isGooglePayRemoteFlagActive", "isGooglePayReady", "", "transactionId", "<init>", "(Lqx3/d;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqx3/d;", "W", "()Lqx3/d;", "b", "Z", "Y", "()Z", "c", "X", "d", "Ljava/lang/String;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class GooglePayCancelled implements InterfaceC2541a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final MakePaymentInitialData makePaymentInitialData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayRemoteFlagActive;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayReady;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final String transactionId;

                public GooglePayCancelled(MakePaymentInitialData makePaymentInitialData, boolean z15, boolean z16, String str) {
                    this.makePaymentInitialData = makePaymentInitialData;
                    this.isGooglePayRemoteFlagActive = z15;
                    this.isGooglePayReady = z16;
                    this.transactionId = str;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: W, reason: from getter */
                public MakePaymentInitialData getMakePaymentInitialData() {
                    return this.makePaymentInitialData;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: X, reason: from getter */
                public boolean getIsGooglePayReady() {
                    return this.isGooglePayReady;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: Y, reason: from getter */
                public boolean getIsGooglePayRemoteFlagActive() {
                    return this.isGooglePayRemoteFlagActive;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getTransactionId() {
                    return this.transactionId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof GooglePayCancelled)) {
                        return false;
                    }
                    GooglePayCancelled googlePayCancelled = (GooglePayCancelled) other;
                    return fr.t.c(this.makePaymentInitialData, googlePayCancelled.makePaymentInitialData) && this.isGooglePayRemoteFlagActive == googlePayCancelled.isGooglePayRemoteFlagActive && this.isGooglePayReady == googlePayCancelled.isGooglePayReady && fr.t.c(this.transactionId, googlePayCancelled.transactionId);
                }

                public int hashCode() {
                    return (((((this.makePaymentInitialData.hashCode() * 31) + Boolean.hashCode(this.isGooglePayRemoteFlagActive)) * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31) + this.transactionId.hashCode();
                }

                public String toString() {
                    return "GooglePayCancelled(makePaymentInitialData=" + this.makePaymentInitialData + ", isGooglePayRemoteFlagActive=" + this.isGooglePayRemoteFlagActive + ", isGooglePayReady=" + this.isGooglePayReady + ", transactionId=" + this.transactionId + ')';
                }
            }

            /* JADX INFO: renamed from: jy3.e$a$a$c, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Ljy3/e$a$a$c;", "Ljy3/e$a$a;", "Lqx3/d;", "makePaymentInitialData", "", "isGooglePayRemoteFlagActive", "isGooglePayReady", "", "transactionId", "<init>", "(Lqx3/d;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqx3/d;", "W", "()Lqx3/d;", "b", "Z", "Y", "()Z", "c", "X", "d", "Ljava/lang/String;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class GooglePayError implements InterfaceC2541a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final MakePaymentInitialData makePaymentInitialData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayRemoteFlagActive;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayReady;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final String transactionId;

                public GooglePayError(MakePaymentInitialData makePaymentInitialData, boolean z15, boolean z16, String str) {
                    this.makePaymentInitialData = makePaymentInitialData;
                    this.isGooglePayRemoteFlagActive = z15;
                    this.isGooglePayReady = z16;
                    this.transactionId = str;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: W, reason: from getter */
                public MakePaymentInitialData getMakePaymentInitialData() {
                    return this.makePaymentInitialData;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: X, reason: from getter */
                public boolean getIsGooglePayReady() {
                    return this.isGooglePayReady;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: Y, reason: from getter */
                public boolean getIsGooglePayRemoteFlagActive() {
                    return this.isGooglePayRemoteFlagActive;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getTransactionId() {
                    return this.transactionId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof GooglePayError)) {
                        return false;
                    }
                    GooglePayError googlePayError = (GooglePayError) other;
                    return fr.t.c(this.makePaymentInitialData, googlePayError.makePaymentInitialData) && this.isGooglePayRemoteFlagActive == googlePayError.isGooglePayRemoteFlagActive && this.isGooglePayReady == googlePayError.isGooglePayReady && fr.t.c(this.transactionId, googlePayError.transactionId);
                }

                public int hashCode() {
                    return (((((this.makePaymentInitialData.hashCode() * 31) + Boolean.hashCode(this.isGooglePayRemoteFlagActive)) * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31) + this.transactionId.hashCode();
                }

                public String toString() {
                    return "GooglePayError(makePaymentInitialData=" + this.makePaymentInitialData + ", isGooglePayRemoteFlagActive=" + this.isGooglePayRemoteFlagActive + ", isGooglePayReady=" + this.isGooglePayReady + ", transactionId=" + this.transactionId + ')';
                }
            }

            /* JADX INFO: renamed from: jy3.e$a$a$d, reason: from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!¨\u0006\""}, d2 = {"Ljy3/e$a$a$d;", "Ljy3/e$a$a;", "Lqx3/d;", "makePaymentInitialData", "", "isGooglePayRemoteFlagActive", "isGooglePayReady", "Lxr0/h;", "responseModel", "<init>", "(Lqx3/d;ZZLxr0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lqx3/d;", "W", "()Lqx3/d;", "b", "Z", "Y", "()Z", "c", "X", "d", "Lxr0/h;", "()Lxr0/h;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class RequestGooglePay implements InterfaceC2541a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final MakePaymentInitialData makePaymentInitialData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayRemoteFlagActive;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean isGooglePayReady;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final BEStartGooglePayPaymentResponseModel responseModel;

                public RequestGooglePay(MakePaymentInitialData makePaymentInitialData, boolean z15, boolean z16, BEStartGooglePayPaymentResponseModel bEStartGooglePayPaymentResponseModel) {
                    this.makePaymentInitialData = makePaymentInitialData;
                    this.isGooglePayRemoteFlagActive = z15;
                    this.isGooglePayReady = z16;
                    this.responseModel = bEStartGooglePayPaymentResponseModel;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: W, reason: from getter */
                public MakePaymentInitialData getMakePaymentInitialData() {
                    return this.makePaymentInitialData;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: X, reason: from getter */
                public boolean getIsGooglePayReady() {
                    return this.isGooglePayReady;
                }

                @Override // jy3.e.a
                /* JADX INFO: renamed from: Y, reason: from getter */
                public boolean getIsGooglePayRemoteFlagActive() {
                    return this.isGooglePayRemoteFlagActive;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final BEStartGooglePayPaymentResponseModel getResponseModel() {
                    return this.responseModel;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RequestGooglePay)) {
                        return false;
                    }
                    RequestGooglePay requestGooglePay = (RequestGooglePay) other;
                    return fr.t.c(this.makePaymentInitialData, requestGooglePay.makePaymentInitialData) && this.isGooglePayRemoteFlagActive == requestGooglePay.isGooglePayRemoteFlagActive && this.isGooglePayReady == requestGooglePay.isGooglePayReady && fr.t.c(this.responseModel, requestGooglePay.responseModel);
                }

                public int hashCode() {
                    return (((((this.makePaymentInitialData.hashCode() * 31) + Boolean.hashCode(this.isGooglePayRemoteFlagActive)) * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31) + this.responseModel.hashCode();
                }

                public String toString() {
                    return "RequestGooglePay(makePaymentInitialData=" + this.makePaymentInitialData + ", isGooglePayRemoteFlagActive=" + this.isGooglePayRemoteFlagActive + ", isGooglePayReady=" + this.isGooglePayReady + ", responseModel=" + this.responseModel + ')';
                }
            }
        }

        /* JADX INFO: renamed from: W */
        MakePaymentInitialData getMakePaymentInitialData();

        /* JADX INFO: renamed from: X */
        boolean getIsGooglePayReady();

        /* JADX INFO: renamed from: Y */
        boolean getIsGooglePayRemoteFlagActive();
    }
}
