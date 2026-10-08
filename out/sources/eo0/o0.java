package eo0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Leo0/n0;", "Leo0/m0;", "recipientInfo", "Leo0/k0;", "a", "(Leo0/n0;Leo0/m0;)Leo0/k0;", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o0 {
    public static final Recipient a(RecipientResult recipientResult, RecipientInfo recipientInfo) {
        return new Recipient(recipientResult.getFullName(), p0.E_DELIVERY, null, recipientInfo != null ? recipientInfo.getRecipientEda() : null, null, null, null, null, recipientInfo != null ? recipientInfo.getWarningType() : null);
    }
}
