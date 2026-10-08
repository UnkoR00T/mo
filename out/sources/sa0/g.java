package sa0;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsa0/g;", "Lxw/f;", "Lsa0/g$a;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "l", "(Lsa0/g$a;)Lcb4/d;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: sa0.g$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsa0/g$a;", "", "Lsa0/a;", "dashboardDialog", "Lkotlin/Function0;", "Loq/i0;", "onLogoutAction", "onChangeApplicationVersionAction", "<init>", "(Lsa0/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsa0/a;", "()Lsa0/a;", "b", "Ler/a;", "c", "()Ler/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a dashboardDialog;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onLogoutAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeApplicationVersionAction;

        public Params(a aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.dashboardDialog = aVar;
            this.onLogoutAction = aVar2;
            this.onChangeApplicationVersionAction = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getDashboardDialog() {
            return this.dashboardDialog;
        }

        public final er.a<i0> b() {
            return this.onChangeApplicationVersionAction;
        }

        public final er.a<i0> c() {
            return this.onLogoutAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.dashboardDialog, params.dashboardDialog) && t.c(this.onLogoutAction, params.onLogoutAction) && t.c(this.onChangeApplicationVersionAction, params.onChangeApplicationVersionAction);
        }

        public int hashCode() {
            return (((this.dashboardDialog.hashCode() * 31) + this.onLogoutAction.hashCode()) * 31) + this.onChangeApplicationVersionAction.hashCode();
        }

        public String toString() {
            return "Params(dashboardDialog=" + this.dashboardDialog + ", onLogoutAction=" + this.onLogoutAction + ", onChangeApplicationVersionAction=" + this.onChangeApplicationVersionAction + ')';
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        mx.c cVar = this.labelProvider;
        a dashboardDialog = params.getDashboardDialog();
        if (dashboardDialog instanceof a.c) {
            return new DialogData(h.b.f24985a, cVar.c(ia0.a.f90629k0), null, new DialogButtonTextData(cVar.c(ia0.a.f90627j0), null, params.c(), 2, null), new DialogButtonTextData(cVar.c(ia0.a.f90612c), null, new er.a() { // from class: sa0.b
                @Override // er.a
                public final Object a() {
                    return g.m();
                }
            }, 2, null), null, null, 100, null);
        }
        if (dashboardDialog instanceof a.d) {
            return new DialogData(h.b.f24985a, cVar.c(ia0.a.f90635n0), cVar.c(ia0.a.f90633m0), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90614d), null, params.c(), 2, null), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90628k), null, new er.a() { // from class: sa0.c
                @Override // er.a
                public final Object a() {
                    return g.q();
                }
            }, 2, null), null, new er.a() { // from class: sa0.d
                @Override // er.a
                public final Object a() {
                    return g.r();
                }
            }, 32, null);
        }
        if (t.c(dashboardDialog, a.b.f179567a)) {
            return new DialogData(h.b.f24985a, this.labelProvider.c(ia0.a.B), this.labelProvider.c(ia0.a.A), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90616e), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90628k), null, new er.a() { // from class: sa0.e
                @Override // er.a
                public final Object a() {
                    return g.s();
                }
            }, 2, null), null, null, 96, null);
        }
        if (t.c(dashboardDialog, a.C4617a.f179566a)) {
            return new DialogData(h.b.f24985a, cVar.c(ia0.a.f90655z), cVar.c(ia0.a.f90654y), new DialogButtonTextData(cVar.c(ia0.a.f90618f), null, new er.a() { // from class: sa0.f
                @Override // er.a
                public final Object a() {
                    return g.u();
                }
            }, 2, null), null, null, null, 112, null);
        }
        throw new p();
    }
}
