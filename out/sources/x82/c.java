package x82;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lx82/c;", "Lxw/f;", "Lx82/c$a;", "Lx82/c$b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lx82/c$a;)Lx82/c$b;", "a", "Lmx/c;", "b", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: x82.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lx82/c$a;", "", "Le14/a$a$a;", "error", "Lkotlin/Function0;", "Loq/i0;", "goToPermissionSettingsAction", "goToLocationSettingsAction", "<init>", "(Le14/a$a$a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le14/a$a$a;", "()Le14/a$a$a;", "b", "Ler/a;", "c", "()Ler/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e14.a.InterfaceC1068a.EnumC1069a error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPermissionSettingsAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToLocationSettingsAction;

        public Params(e14.a.InterfaceC1068a.EnumC1069a enumC1069a, er.a<i0> aVar, er.a<i0> aVar2) {
            this.error = enumC1069a;
            this.goToPermissionSettingsAction = aVar;
            this.goToLocationSettingsAction = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e14.a.InterfaceC1068a.EnumC1069a getError() {
            return this.error;
        }

        public final er.a<i0> b() {
            return this.goToLocationSettingsAction;
        }

        public final er.a<i0> c() {
            return this.goToPermissionSettingsAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.error == params.error && t.c(this.goToPermissionSettingsAction, params.goToPermissionSettingsAction) && t.c(this.goToLocationSettingsAction, params.goToLocationSettingsAction);
        }

        public int hashCode() {
            return (((this.error.hashCode() * 31) + this.goToPermissionSettingsAction.hashCode()) * 31) + this.goToLocationSettingsAction.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", goToPermissionSettingsAction=" + this.goToPermissionSettingsAction + ", goToLocationSettingsAction=" + this.goToLocationSettingsAction + ')';
        }
    }

    /* JADX INFO: renamed from: x82.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx82/c$b;", "", "Lcb4/d;", "dialog", "<init>", "(Lcb4/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/d;", "()Lcb4/d;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DialogData dialog;

        public Result(DialogData dialogData) {
            this.dialog = dialogData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DialogData getDialog() {
            return this.dialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && t.c(this.dialog, ((Result) other).dialog);
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }

        public String toString() {
            return "Result(dialog=" + this.dialog + ')';
        }
    }

    /* JADX INFO: renamed from: x82.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5802c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217375a;

        static {
            int[] iArr = new int[e14.a.InterfaceC1068a.EnumC1069a.values().length];
            try {
                iArr[e14.a.InterfaceC1068a.EnumC1069a.NO_PERMISSIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e14.a.InterfaceC1068a.EnumC1069a.NO_GPS_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f217375a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Result b(Params params) {
        DialogData dialogData;
        int i15 = C5802c.f217375a[params.getError().ordinal()];
        if (i15 == 1) {
            dialogData = new DialogData(h.b.f24985a, this.labelProvider.c(v72.b.K1), this.labelProvider.c(v72.b.J1), new DialogButtonTextData(this.labelProvider.c(v72.b.I1), null, params.c(), 2, null), new DialogButtonTextData(this.labelProvider.c(v72.b.f204238a), null, new er.a() { // from class: x82.a
                @Override // er.a
                public final Object a() {
                    return c.h();
                }
            }, 2, null), null, null, 96, null);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            dialogData = new DialogData(h.b.f24985a, this.labelProvider.c(v72.b.M1), this.labelProvider.c(v72.b.L1), new DialogButtonTextData(this.labelProvider.c(v72.b.I1), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(v72.b.f204238a), null, new er.a() { // from class: x82.b
                @Override // er.a
                public final Object a() {
                    return c.i();
                }
            }, 2, null), null, null, 96, null);
        }
        return new Result(dialogData);
    }
}
