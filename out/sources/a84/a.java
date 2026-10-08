package a84;

import dx.i;
import fr.t;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import y74.NotificationRegistrationData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002'%BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b \u0010!J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\"\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00100¨\u00061"}, d2 = {"La84/a;", "", "La84/a$a;", "La84/a$b;", "Lgy/a;", "permissionManager", "Lz74/a;", "notificationLocalRepository", "Ljx/a;", "appInfo", "Ljx/g;", "systemInfo", "Ley/a;", "remoteNotificationsManager", "Lt74/a;", "setupNotificationsChannelsUseCase", "Lv74/e;", "interactorFactory", "<init>", "(Lgy/a;Lz74/a;Ljx/a;Ljx/g;Ley/a;Lt74/a;Lv74/e;)V", "", "permissionGranted", "Lw74/a;", "featureConfig", "Ldx/i;", "Ldx/b;", "f", "(ZLw74/a;Ltq/e;)Ljava/lang/Object;", "", "token", "language", "appVersion", "h", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "params", "g", "(La84/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgy/a;", "b", "Lz74/a;", "c", "Ljx/a;", "d", "Ljx/g;", "e", "Ley/a;", "Lt74/a;", "Lv74/e;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z74.a notificationLocalRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jx.a appInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jx.g systemInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ey.a remoteNotificationsManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t74.a setupNotificationsChannelsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final v74.e interactorFactory;

    /* JADX INFO: renamed from: a84.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"La84/a$a;", "Lgz/b$a;", "Lw74/a;", "featureConfig", "<init>", "(Lw74/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw74/a;", "()Lw74/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w74.a featureConfig;

        public Params(w74.a aVar) {
            this.featureConfig = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w74.a getFeatureConfig() {
            return this.featureConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.featureConfig == ((Params) other).featureConfig;
        }

        public int hashCode() {
            return this.featureConfig.hashCode();
        }

        public String toString() {
            return "Params(featureConfig=" + this.featureConfig + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"La84/a$b;", "", "a", "b", "La84/a$b$a;", "La84/a$b$b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: a84.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"La84/a$b$a;", "La84/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0082a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0082a f4864a = new C0082a();

            private C0082a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0082a);
            }

            public int hashCode() {
                return -1851466592;
            }

            public String toString() {
                return "RegistrationCompleted";
            }
        }

        /* JADX INFO: renamed from: a84.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"La84/a$b$b;", "La84/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0083b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0083b f4865a = new C0083b();

            private C0083b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0083b);
            }

            public int hashCode() {
                return 2086381292;
            }

            public String toString() {
                return "RegistrationConditionsNotMet";
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f4867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f4868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f4869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f4870h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f4871j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f4872k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f4873l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f4874m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4875n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f4876p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4877q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4878r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f4879s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4880t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f4882w;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4880t = obj;
            this.f4882w |= PKIFailureInfo.systemUnavail;
            return a.this.f(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f4883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f4884e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4886g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4884e = obj;
            this.f4886g |= PKIFailureInfo.systemUnavail;
            return a.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f4888e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f4889f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f4890g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f4891h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f4893k;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4891h = obj;
            this.f4893k |= PKIFailureInfo.systemUnavail;
            return a.this.h(false, null, null, null, this);
        }
    }

    public a(gy.a aVar, z74.a aVar2, jx.a aVar3, jx.g gVar, ey.a aVar4, t74.a aVar5, v74.e eVar) {
        this.permissionManager = aVar;
        this.notificationLocalRepository = aVar2;
        this.appInfo = aVar3;
        this.systemInfo = gVar;
        this.remoteNotificationsManager = aVar4;
        this.setupNotificationsChannelsUseCase = aVar5;
        this.interactorFactory = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x016d  */
    /* JADX WARN: Code duplicated, block: B:39:0x017a  */
    /* JADX WARN: Code duplicated, block: B:41:0x017e  */
    /* JADX WARN: Code duplicated, block: B:44:0x018c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0200 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0201  */
    /* JADX WARN: Code duplicated, block: B:59:0x0205  */
    /* JADX WARN: Code duplicated, block: B:64:0x026f  */
    /* JADX WARN: Code duplicated, block: B:68:0x027d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0264, code lost:
    
        if (r7.b(r7, r5) == r6) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r21, w74.a r22, tq.e<? super dx.i<? extends dx.b, ? extends a84.a.b>> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.a.f(boolean, w74.a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(boolean z15, String str, String str2, String str3, tq.e<? super Boolean> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f4893k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f4893k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f4891h;
        Object objE = uq.b.e();
        int i16 = eVar2.f4893k;
        boolean z16 = true;
        if (i16 == 0) {
            u.b(objC);
            z74.a aVar = this.notificationLocalRepository;
            eVar2.f4888e = str;
            eVar2.f4889f = str2;
            eVar2.f4890g = str3;
            eVar2.f4887d = z15;
            eVar2.f4893k = 1;
            objC = aVar.c(eVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = eVar2.f4887d;
            str3 = (String) eVar2.f4890g;
            str2 = (String) eVar2.f4889f;
            str = (String) eVar2.f4888e;
            u.b(objC);
        }
        NotificationRegistrationData notificationRegistrationData = (NotificationRegistrationData) objC;
        if (t.c(str3, notificationRegistrationData.getAppVersion()) && t.c(str2, notificationRegistrationData.getLanguage()) && t.c(str, notificationRegistrationData.getToken()) && z15 == notificationRegistrationData.getSettingsPermission()) {
            z16 = false;
        }
        return vq.b.a(z16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(Params params, tq.e<? super i<? extends dx.b, ? extends b>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f4886g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f4886g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objD = dVar.f4884e;
        Object objE = uq.b.e();
        int i16 = dVar.f4886g;
        if (i16 == 0) {
            u.b(objD);
            this.setupNotificationsChannelsUseCase.a(gz.b.a.C1792a.f78542a);
            gy.a aVar = this.permissionManager;
            gy.d dVar2 = gy.d.POST_NOTIFICATIONS;
            dVar.f4883d = params;
            dVar.f4886g = 1;
            objD = aVar.d(dVar2, dVar);
            if (objD != objE) {
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 != 2 && i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
            return objD;
        }
        params = (Params) dVar.f4883d;
        u.b(objD);
        gy.c cVar = (gy.c) objD;
        if (t.c(cVar, gy.c.a.f78236a) || t.c(cVar, gy.c.C1774c.f78238a)) {
            w74.a featureConfig = params.getFeatureConfig();
            dVar.f4883d = j.a(params);
            dVar.f4886g = 2;
            Object objF = f(true, featureConfig, dVar);
            if (objF != objE) {
                return objF;
            }
        } else {
            if (!(cVar instanceof gy.c.NotGranted)) {
                throw new p();
            }
            w74.a featureConfig2 = params.getFeatureConfig();
            dVar.f4883d = j.a(params);
            dVar.f4886g = 3;
            Object objF2 = f(false, featureConfig2, dVar);
            if (objF2 != objE) {
                return objF2;
            }
        }
        return objE;
    }
}
