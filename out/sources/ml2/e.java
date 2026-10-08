package ml2;

import a14.m;
import a14.y;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lml2/e;", "Lgz/b;", "Lml2/e$a;", "Lml2/e$b;", "La14/y;", "requestPermissionUseCase", "Lmx/c;", "labelProvider", "La14/m;", "goToApplicationDetailsSettingsUseCase", "<init>", "(La14/y;Lmx/c;La14/m;)V", "params", "Lcb4/d;", "e", "(Lml2/e$a;)Lcb4/d;", "g", "(Lml2/e$a;Ltq/e;)Ljava/lang/Object;", "a", "La14/y;", "b", "Lmx/c;", "c", "La14/m;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b<Params, b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y requestPermissionUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: ml2.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lml2/e$a;", "Lgz/b$a;", "Lkotlin/Function0;", "Loq/i0;", "onHideDialog", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHideDialog;

        public Params(er.a<i0> aVar) {
            this.onHideDialog = aVar;
        }

        public final er.a<i0> a() {
            return this.onHideDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.onHideDialog, ((Params) other).onHideDialog);
        }

        public int hashCode() {
            return this.onHideDialog.hashCode();
        }

        public String toString() {
            return "Params(onHideDialog=" + this.onHideDialog + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lml2/e$b;", "Lgz/b$a;", "b", "a", "Lml2/e$b$a;", "Lml2/e$b$b;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends gz.b.a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lml2/e$b$a;", "Lml2/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f127096a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 402703825;
            }

            public String toString() {
                return "Granted";
            }
        }

        /* JADX INFO: renamed from: ml2.e$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lml2/e$b$b;", "Lml2/e$b;", "Lcb4/d;", "dialogData", "<init>", "(Lcb4/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/d;", "()Lcb4/d;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPermissionsSettingsDialog implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogData dialogData;

            public ShowPermissionsSettingsDialog(DialogData dialogData) {
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
                return (other instanceof ShowPermissionsSettingsDialog) && t.c(this.dialogData, ((ShowPermissionsSettingsDialog) other).dialogData);
            }

            public int hashCode() {
                return this.dialogData.hashCode();
            }

            public String toString() {
                return "ShowPermissionsSettingsDialog(dialogData=" + this.dialogData + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f127099e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f127101g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127099e = obj;
            this.f127101g |= PKIFailureInfo.systemUnavail;
            return e.this.g(null, this);
        }
    }

    public e(y yVar, mx.c cVar, m mVar) {
        this.requestPermissionUseCase = yVar;
        this.labelProvider = cVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
    }

    private final DialogData e(final Params params) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(hl2.a.H), this.labelProvider.c(hl2.a.f85260e), new DialogButtonTextData(this.labelProvider.c(hl2.a.I), null, new er.a() { // from class: ml2.d
            @Override // er.a
            public final Object a() {
                return e.f(this.f127090a, params);
            }
        }, 2, null), new DialogButtonTextData(this.labelProvider.c(hl2.a.f85257b), cb4.a.C0668a.f24967a, params.a()), null, params.a(), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(e eVar, Params params) {
        eVar.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
        params.a().a();
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(Params params, tq.e<? super b> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f127101g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f127101g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f127099e;
        Object objE = uq.b.e();
        int i16 = cVar.f127101g;
        if (i16 == 0) {
            u.b(objC);
            y yVar = this.requestPermissionUseCase;
            y.Params params2 = new y.Params(gy.d.EXTERNAL_STORAGE);
            cVar.f127098d = params;
            cVar.f127101g = 1;
            objC = yVar.c(params2, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) cVar.f127098d;
            u.b(objC);
        }
        u04.c cVar2 = (u04.c) objC;
        if (cVar2 instanceof u04.c.b) {
            return new b.ShowPermissionsSettingsDialog(e(params));
        }
        if (cVar2 instanceof u04.c.a) {
            return b.a.f127096a;
        }
        throw new p();
    }
}
