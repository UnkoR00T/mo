package g84;

import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lg84/c;", "", "Lmx/a;", "header", "Ln30/b;", "notificationSettingCardList", "<init>", "(Lmx/a;Ln30/b;)V", "a", "Lmx/a;", "()Lmx/a;", "b", "Ln30/b;", "()Ln30/b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CardListData notificationSettingCardList;

    public c(Label label, CardListData cardListData) {
        this.header = label;
        this.notificationSettingCardList = cardListData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CardListData getNotificationSettingCardList() {
        return this.notificationSettingCardList;
    }
}
