package q90;

import h90.BEPushHistory;
import h90.BEPushHistoryEntry;
import h90.BEPushParameters;
import j84.NotificationsHistoryData;
import j84.NotificationsHistoryRecord;
import j84.NotificationsHistoryRecordParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh90/e;", "Lj84/a;", "b", "(Lh90/e;)Lj84/a;", "Lh90/f;", "Lj84/c;", "c", "(Lh90/f;)Lj84/c;", "", "Lj84/c$a;", "e", "(Ljava/lang/String;)Lj84/c$a;", "Lh90/g;", "Lj84/d;", "d", "(Lh90/g;)Lj84/d;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsHistoryData b(BEPushHistory bEPushHistory) {
        ArrayList arrayList;
        List<BEPushHistoryEntry> listA = bEPushHistory.a();
        if (listA != null) {
            List<BEPushHistoryEntry> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((BEPushHistoryEntry) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new NotificationsHistoryData(arrayList);
    }

    private static final NotificationsHistoryRecord c(BEPushHistoryEntry bEPushHistoryEntry) {
        return new NotificationsHistoryRecord(bEPushHistoryEntry.getId(), bEPushHistoryEntry.getTitle(), bEPushHistoryEntry.getContent(), bEPushHistoryEntry.getPrivateContent(), bEPushHistoryEntry.getSendingDateTime(), bEPushHistoryEntry.getDisplayed(), e(bEPushHistoryEntry.getPushType()), d(bEPushHistoryEntry.getParameters()));
    }

    private static final NotificationsHistoryRecordParameters d(BEPushParameters bEPushParameters) {
        BEPushParameters.BETrustedProfileAuthorizationParams trustedProfileAuthorization = bEPushParameters.getTrustedProfileAuthorization();
        NotificationsHistoryRecordParameters.TrustedProfileAuthorizationParams trustedProfileAuthorizationParams = trustedProfileAuthorization != null ? new NotificationsHistoryRecordParameters.TrustedProfileAuthorizationParams(trustedProfileAuthorization.getAuthorizationId(), trustedProfileAuthorization.getExpirationDateTime()) : null;
        BEPushParameters.BEQualifiedSignatureAuthorizationParams qualifiedSignatureAuthorization = bEPushParameters.getQualifiedSignatureAuthorization();
        NotificationsHistoryRecordParameters.QualifiedSignatureAuthorizationParams qualifiedSignatureAuthorizationParams = qualifiedSignatureAuthorization != null ? new NotificationsHistoryRecordParameters.QualifiedSignatureAuthorizationParams(qualifiedSignatureAuthorization.getAuthorizationId(), qualifiedSignatureAuthorization.getExpirationDateTime(), qualifiedSignatureAuthorization.getProcessId()) : null;
        BEPushParameters.BEPaymentParams payment = bEPushParameters.getPayment();
        return new NotificationsHistoryRecordParameters(trustedProfileAuthorizationParams, qualifiedSignatureAuthorizationParams, payment != null ? new NotificationsHistoryRecordParameters.PaymentParams(payment.getPaymentId()) : null, null);
    }

    private static final NotificationsHistoryRecord.a e(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 17863355) {
                if (iHashCode != 41306878) {
                    if (iHashCode == 1353728699 && str.equals("EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION")) {
                        return NotificationsHistoryRecord.a.EXTERNAL_QUALIFIED_SIGNATURE_AUTHORIZATION;
                    }
                } else if (str.equals("NEW_PAYMENT_IN_OFFICE")) {
                    return NotificationsHistoryRecord.a.NEW_PAYMENT_IN_OFFICE;
                }
            } else if (str.equals("TRUSTED_PROFILE_AUTHORIZATION")) {
                return NotificationsHistoryRecord.a.TRUSTED_PROFILE_AUTHORIZATION;
            }
        }
        return NotificationsHistoryRecord.a.NOT_MAPPED;
    }
}
