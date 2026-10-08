package pl.gov.mc.fringers.mobywatel;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;
import s74.DecryptedMessage;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls74/a;", "Ljava/time/OffsetDateTime;", "expirationDateTime", "", "authId", "Leo2/a$b;", "f", "(Ls74/a;Ljava/time/OffsetDateTime;Ljava/lang/String;)Leo2/a$b;", "processId", "Leo2/a$a;", "e", "(Ls74/a;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;)Leo2/a$a;", "Lr74/a;", "d", "(Ls74/a;)Lr74/a;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultNotificationDetailsData d(DecryptedMessage decryptedMessage) {
        String id5;
        String title;
        OffsetDateTime sendDateTime;
        String text = decryptedMessage.getText();
        if (text == null || (id5 = decryptedMessage.getId()) == null || (title = decryptedMessage.getTitle()) == null || (sendDateTime = decryptedMessage.getSendDateTime()) == null) {
            return null;
        }
        return new DefaultNotificationDetailsData(id5, false, sendDateTime, title, text, decryptedMessage.getPrivateText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eo2.a.QualifiedSignatureConfirmationData e(DecryptedMessage decryptedMessage, OffsetDateTime offsetDateTime, String str, String str2) {
        String text;
        String title;
        OffsetDateTime sendDateTime;
        String id5 = decryptedMessage.getId();
        if (id5 == null || (text = decryptedMessage.getText()) == null || (title = decryptedMessage.getTitle()) == null || (sendDateTime = decryptedMessage.getSendDateTime()) == null) {
            return null;
        }
        return new eo2.a.QualifiedSignatureConfirmationData(id5, false, sendDateTime, title, text, decryptedMessage.getPrivateText(), str, offsetDateTime, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eo2.a.TrustedProfileConfirmationData f(DecryptedMessage decryptedMessage, OffsetDateTime offsetDateTime, String str) {
        String text;
        String title;
        OffsetDateTime sendDateTime;
        String id5 = decryptedMessage.getId();
        if (id5 == null || (text = decryptedMessage.getText()) == null || (title = decryptedMessage.getTitle()) == null || (sendDateTime = decryptedMessage.getSendDateTime()) == null) {
            return null;
        }
        return new eo2.a.TrustedProfileConfirmationData(id5, false, sendDateTime, title, text, decryptedMessage.getPrivateText(), str, offsetDateTime);
    }
}
