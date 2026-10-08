package xc4;

import d84.NotificationSettingsSection;
import d84.NotificationSettingsUpdateEntry;
import dx.b;
import dx.i;
import java.util.ArrayList;
import java.util.List;
import kt0.NotificationSettingsEntry;
import kt0.PushNotificationSettings;
import lt0.f;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import s54.j;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001d\u0010$R\u001a\u0010)\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\"\u0010(¨\u0006*"}, d2 = {"Lxc4/a;", "Lc84/a;", "Lkt0/a;", "loadNotificationSettingsUseCase", "Llt0/f;", "updateNotificationSettingUseCase", "Ls54/j;", "setDocumentsNotificationsSettingsUC", "Lu04/a;", "commonEndpoints", "<init>", "(Lkt0/a;Llt0/f;Ls54/j;Lu04/a;)V", "Ldx/i;", "Ldx/b;", "", "Ld84/c;", "d", "(Ltq/e;)Ljava/lang/Object;", "Ld84/d;", "settings", "Loq/i0;", "c", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "isEnabled", "f", "(ZLtq/e;)Ljava/lang/Object;", "a", "Lkt0/a;", "b", "Llt0/f;", "Ls54/j;", "Lu04/a;", "Lw74/a;", "e", "Lw74/a;", "()Lw74/a;", "featureConfig", "", "Ljava/lang/String;", "()Ljava/lang/String;", "appPzGovUrl", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c84.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kt0.a loadNotificationSettingsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f updateNotificationSettingUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j setDocumentsNotificationsSettingsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig = w74.a.MOBYWATEL;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String appPzGovUrl;

    /* JADX INFO: renamed from: xc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5821a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f217987d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f217989f;

        C5821a(e<? super C5821a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f217987d = obj;
            this.f217989f |= PKIFailureInfo.systemUnavail;
            return a.this.d(this);
        }
    }

    public a(kt0.a aVar, f fVar, j jVar, u04.a aVar2) {
        this.loadNotificationSettingsUseCase = aVar;
        this.updateNotificationSettingUseCase = fVar;
        this.setDocumentsNotificationsSettingsUC = jVar;
        this.commonEndpoints = aVar2;
        this.appPzGovUrl = aVar2.I();
    }

    @Override // c84.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public w74.a getFeatureConfig() {
        return this.featureConfig;
    }

    @Override // c84.a
    public Object c(List<NotificationSettingsUpdateEntry> list, e<? super i<? extends b, i0>> eVar) {
        f fVar = this.updateNotificationSettingUseCase;
        List<NotificationSettingsUpdateEntry> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (NotificationSettingsUpdateEntry notificationSettingsUpdateEntry : list2) {
            arrayList.add(new PushNotificationSettings(notificationSettingsUpdateEntry.getType(), notificationSettingsUpdateEntry.getEnabled()));
        }
        return fVar.c(new f.Params(arrayList), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c84.a
    public Object d(e<? super i<? extends b, ? extends List<NotificationSettingsSection>>> eVar) throws Throwable {
        C5821a c5821a;
        ArrayList arrayList;
        if (eVar instanceof C5821a) {
            c5821a = (C5821a) eVar;
            int i15 = c5821a.f217989f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5821a.f217989f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5821a = new C5821a(eVar);
            }
        } else {
            c5821a = new C5821a(eVar);
        }
        Object objC = c5821a.f217987d;
        Object objE = uq.b.e();
        int i16 = c5821a.f217989f;
        if (i16 == 0) {
            u.b(objC);
            kt0.a aVar = this.loadNotificationSettingsUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            c5821a.f217989f = 1;
            objC = aVar.c(c1792a, c5821a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List<kt0.NotificationSettingsSection> list = (List) ((i.Right) iVar).b();
        ArrayList arrayList2 = new ArrayList(v.y(list, 10));
        for (kt0.NotificationSettingsSection notificationSettingsSection : list) {
            String title = notificationSettingsSection.getTitle();
            List<NotificationSettingsEntry> listA = notificationSettingsSection.a();
            if (listA != null) {
                List<NotificationSettingsEntry> list2 = listA;
                arrayList = new ArrayList(v.y(list2, 10));
                for (NotificationSettingsEntry notificationSettingsEntry : list2) {
                    arrayList.add(new d84.NotificationSettingsEntry(notificationSettingsEntry.getType(), notificationSettingsEntry.getTitle(), notificationSettingsEntry.getDescription(), notificationSettingsEntry.getEnabled()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new NotificationSettingsSection(title, arrayList));
        }
        return new i.Right(arrayList2);
    }

    @Override // c84.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getAppPzGovUrl() {
        return this.appPzGovUrl;
    }

    @Override // c84.a
    public Object f(boolean z15, e<? super i0> eVar) {
        Object objC = this.setDocumentsNotificationsSettingsUC.c(new j.Params(z15), eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }
}
