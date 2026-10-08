package a84;

import java.util.Iterator;
import java.util.List;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001b"}, d2 = {"La84/g;", "Lt74/a;", "Lmx/c;", "labelProvider", "Ldy/a;", "systemNotificationsManager", "<init>", "(Lmx/c;Ldy/a;)V", "Ls74/c;", "", "d", "(Ls74/c;)Ljava/lang/String;", "Ls74/b;", "c", "(Ls74/b;)Ljava/lang/String;", "Lgz/b$a$a;", "params", "Loq/i0;", "b", "(Lgz/b$a$a;)V", "a", "Lmx/c;", "Ldy/a;", "", "Ljava/util/List;", "deprecatedChannelIds", "deprecatedChannelGroupIds", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements t74.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dy.a systemNotificationsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> deprecatedChannelIds = v.q("MFAMILY_CARD_NOTIFICATION_CHANNEL_ID", "MCOVID_PASSPPORT_NOTIFICATION_CHANNEL_ID", "MLEGITYMACJASTUDENCKA_NOTIFICATION_CHANNEL_ID", "MLEGITYMACJASZKOLNA_NOTIFICATION_CHANNEL_ID", "MUUT_NOTIFICATION_CHANNEL_ID", "MPRAWOJAZDY_NOTIFICATION_CHANNEL_ID", "MPOJAZD_NOTIFICATION_CHANNEL_ID", "MTOZSAMOSC_NOTIFICATION_CHANNEL_ID", "mobywatel_channel_id", "mpojazd_channel_id", "mprawojazdy_channel_id", "mlegitymacja_uut_channel_id", "mlegitymacjaszkolna_channel_id", "mlegitymacjastudencka_channel_id", "mcovid_paszport_channel_id", "mfamily_card_channel_id", "general_channel_id", "individual_channel_id", "default_channel_id");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> deprecatedChannelGroupIds = v.q("DOCUMENTS_GROUP_ID", "OTHER_GROUP_ID");

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4939a;

        static {
            int[] iArr = new int[s74.b.values().length];
            try {
                iArr[s74.b.MAIN_GENERAL_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4939a = iArr;
        }
    }

    public g(mx.c cVar, dy.a aVar) {
        this.labelProvider = cVar;
        this.systemNotificationsManager = aVar;
    }

    private final String c(s74.b bVar) {
        if (a.f4939a[bVar.ordinal()] == 1) {
            return this.labelProvider.c(q74.a.f165222e).getText();
        }
        throw new p();
    }

    private final String d(s74.c cVar) {
        return "";
    }

    @Override // gz.a
    public /* bridge */ /* synthetic */ i0 a(gz.b.a aVar) {
        b((gz.b.a.C1792a) aVar);
        return i0.f148189a;
    }

    public void b(gz.b.a.C1792a params) {
        Iterator<T> it = this.deprecatedChannelIds.iterator();
        while (it.hasNext()) {
            this.systemNotificationsManager.b((String) it.next());
        }
        Iterator<T> it4 = this.deprecatedChannelGroupIds.iterator();
        while (it4.hasNext()) {
            this.systemNotificationsManager.b((String) it4.next());
        }
        for (s74.c cVar : s74.c.e()) {
            this.systemNotificationsManager.d(cVar.getId(), d(cVar));
        }
        for (s74.b bVar : s74.b.e()) {
            dy.a aVar = this.systemNotificationsManager;
            String id5 = bVar.getId();
            String strC = c(bVar);
            s74.c group = bVar.getGroup();
            aVar.a(id5, strC, group != null ? group.getId() : null);
        }
    }
}
