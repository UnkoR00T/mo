package pl.gov.mc.fringers.mobywatel;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;
import s74.DecryptedMessage;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls74/a;", "Lr74/a;", "b", "(Ls74/a;)Lr74/a;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultNotificationDetailsData b(DecryptedMessage decryptedMessage) {
        String title;
        String text;
        OffsetDateTime sendDateTime;
        String id5 = decryptedMessage.getId();
        if (id5 == null || (title = decryptedMessage.getTitle()) == null || (text = decryptedMessage.getText()) == null || (sendDateTime = decryptedMessage.getSendDateTime()) == null) {
            return null;
        }
        return new DefaultNotificationDetailsData(id5, false, sendDateTime, title, text, decryptedMessage.getPrivateText());
    }
}
