package q90;

import d84.NotificationSettingsSection;
import d84.NotificationSettingsUpdateEntry;
import dx.i;
import h90.BENotificationSettingsUpdateEntry;
import h90.BENotificationsSettings;
import j90.f;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006'"}, d2 = {"Lq90/a;", "Lc84/a;", "Lj90/b;", "beGetNotificationSettingsUC", "Lj90/f;", "beUpdateNotificationSettingsUC", "Lu04/a;", "commonEndpoints", "<init>", "(Lj90/b;Lj90/f;Lu04/a;)V", "Ldx/i;", "Ldx/b;", "", "Ld84/c;", "d", "(Ltq/e;)Ljava/lang/Object;", "Ld84/d;", "settings", "Loq/i0;", "c", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "isEnabled", "f", "(ZLtq/e;)Ljava/lang/Object;", "a", "Lj90/b;", "b", "Lj90/f;", "Lu04/a;", "Lw74/a;", "Lw74/a;", "()Lw74/a;", "featureConfig", "", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "appPzGovUrl", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c84.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j90.b beGetNotificationSettingsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f beUpdateNotificationSettingsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig = w74.a.MJUNIOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String appPzGovUrl;

    /* JADX INFO: renamed from: q90.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4125a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f165376d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f165378f;

        C4125a(tq.e<? super C4125a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165376d = obj;
            this.f165378f |= PKIFailureInfo.systemUnavail;
            return a.this.d(this);
        }
    }

    public a(j90.b bVar, f fVar, u04.a aVar) {
        this.beGetNotificationSettingsUC = bVar;
        this.beUpdateNotificationSettingsUC = fVar;
        this.commonEndpoints = aVar;
        this.appPzGovUrl = aVar.I();
    }

    @Override // c84.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public w74.a getFeatureConfig() {
        return this.featureConfig;
    }

    @Override // c84.a
    public Object c(List<NotificationSettingsUpdateEntry> list, tq.e<? super i<? extends dx.b, i0>> eVar) {
        f fVar = this.beUpdateNotificationSettingsUC;
        List<NotificationSettingsUpdateEntry> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (NotificationSettingsUpdateEntry notificationSettingsUpdateEntry : list2) {
            arrayList.add(new BENotificationSettingsUpdateEntry(notificationSettingsUpdateEntry.getType(), notificationSettingsUpdateEntry.getEnabled()));
        }
        return fVar.d(new f.Params(arrayList), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c84.a
    public Object d(tq.e<? super i<? extends dx.b, ? extends List<NotificationSettingsSection>>> eVar) throws Throwable {
        C4125a c4125a;
        if (eVar instanceof C4125a) {
            c4125a = (C4125a) eVar;
            int i15 = c4125a.f165378f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4125a.f165378f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4125a = new C4125a(eVar);
            }
        } else {
            c4125a = new C4125a(eVar);
        }
        Object objA = c4125a.f165376d;
        Object objE = uq.b.e();
        int i16 = c4125a.f165378f;
        if (i16 == 0) {
            u.b(objA);
            j90.b bVar = this.beGetNotificationSettingsUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            c4125a.f165378f = 1;
            objA = bVar.a(c1792a, c4125a);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        i iVar = (i) objA;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(b.d((BENotificationsSettings) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // c84.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getAppPzGovUrl() {
        return this.appPzGovUrl;
    }

    @Override // c84.a
    public Object f(boolean z15, tq.e<? super i0> eVar) {
        return i0.f148189a;
    }
}
