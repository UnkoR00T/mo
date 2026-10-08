package ae3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lae3/q;", "Lgz/b;", "Lgz/b$a$a;", "Lae3/q$a;", "La14/y;", "requestPermissionUseCase", "Lmx/c;", "labelProvider", "La14/m;", "goToApplicationDetailsSettingsUseCase", "<init>", "(La14/y;Lmx/c;La14/m;)V", "Lcb4/d;", "f", "()Lcb4/d;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "La14/y;", "b", "Lmx/c;", "c", "La14/m;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements gz.b<gz.b.a.C1792a, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lae3/q$a;", "Lgz/b$a;", "<init>", "()V", "b", "a", "Lae3/q$a$a;", "Lae3/q$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: ae3.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lae3/q$a$a;", "Lae3/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0123a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0123a f5887a = new C0123a();

            private C0123a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0123a);
            }

            public int hashCode() {
                return -891716603;
            }

            public String toString() {
                return "Granted";
            }
        }

        /* JADX INFO: renamed from: ae3.q$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae3/q$a$b;", "Lae3/q$a;", "Lcb4/d;", "dialogData", "<init>", "(Lcb4/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/d;", "()Lcb4/d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPermissionsSettingsDialog extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogData dialogData;

            public ShowPermissionsSettingsDialog(DialogData dialogData) {
                super(null);
                this.dialogData = dialogData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DialogData getDialogData() {
                return this.dialogData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowPermissionsSettingsDialog) && fr.t.c(this.dialogData, ((ShowPermissionsSettingsDialog) other).dialogData);
            }

            public int hashCode() {
                return this.dialogData.hashCode();
            }

            public String toString() {
                return "ShowPermissionsSettingsDialog(dialogData=" + this.dialogData + ')';
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5890e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f5892g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5890e = obj;
            this.f5892g |= PKIFailureInfo.systemUnavail;
            return q.this.a(null, this);
        }
    }

    public q(a14.y yVar, mx.c cVar, a14.m mVar) {
        this.requestPermissionUseCase = yVar;
        this.labelProvider = cVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
    }

    private final DialogData f() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.f125876z0), this.labelProvider.c(md3.b.f125787o), new DialogButtonTextData(this.labelProvider.c(md3.b.A0), null, new er.a() { // from class: ae3.o
            @Override // er.a
            public final Object a() {
                return q.g(this.f5883a);
            }
        }, 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.f125699d), cb4.a.C0668a.f24967a, new er.a() { // from class: ae3.p
            @Override // er.a
            public final Object a() {
                return q.h();
            }
        }), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(q qVar) {
        qVar.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super a> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f5892g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f5892g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f5890e;
        Object objE = uq.b.e();
        int i16 = bVar.f5892g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.y yVar = this.requestPermissionUseCase;
            a14.y.Params params = new a14.y.Params(gy.d.EXTERNAL_STORAGE);
            bVar.f5889d = vq.j.a(c1792a);
            bVar.f5892g = 1;
            objC = yVar.c(params, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        u04.c cVar = (u04.c) objC;
        if ((!(cVar instanceof u04.c.b) || !((u04.c.b) cVar).getShouldShowRationale()) && (cVar instanceof u04.c.a)) {
            return a.C0123a.f5887a;
        }
        return new a.ShowPermissionsSettingsDialog(f());
    }
}
