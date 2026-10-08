package v32;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: v32.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lv32/a;", "Ljava/io/Serializable;", "", "paymentId", "messageId", "", "messageDisplayed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", i.f37086m, "c", "Z", "l", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstantPaymentNotificationDetailsData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean messageDisplayed;

    public InstantPaymentNotificationDetailsData(String str, String str2, boolean z15) {
        this.paymentId = str;
        this.messageId = str2;
        this.messageDisplayed = z15;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantPaymentNotificationDetailsData)) {
            return false;
        }
        InstantPaymentNotificationDetailsData instantPaymentNotificationDetailsData = (InstantPaymentNotificationDetailsData) other;
        return t.c(this.paymentId, instantPaymentNotificationDetailsData.paymentId) && t.c(this.messageId, instantPaymentNotificationDetailsData.messageId) && this.messageDisplayed == instantPaymentNotificationDetailsData.messageDisplayed;
    }

    public int hashCode() {
        String str = this.paymentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.messageId;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.messageDisplayed);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getMessageDisplayed() {
        return this.messageDisplayed;
    }

    public String toString() {
        return "InstantPaymentNotificationDetailsData(paymentId=" + this.paymentId + ", messageId=" + this.messageId + ", messageDisplayed=" + this.messageDisplayed + ")";
    }
}
