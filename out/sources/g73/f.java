package g73;

import er.l;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import vw.NavigationDialogModel;
import wy3.SetPasswordSetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lg73/f;", "Lxw/f;", "Lg73/f$a;", "Lwy3/c;", "Lmx/c;", "labelProvider", "Lg73/d;", "settingsNavigationDialogMapper", "<init>", "(Lmx/c;Lg73/d;)V", "params", "c", "(Lg73/f$a;)Lwy3/c;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lg73/d;", "getSettingsNavigationDialogMapper", "()Lg73/d;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, SetPasswordSetupData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f71164c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: g73.f$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg73/f$a;", "", "Lkotlin/Function1;", "Lvw/a;", "Loq/i0;", "showNavigationDialog", "Lkotlin/Function0;", "navResult", "<init>", "(Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "getShowNavigationDialog", "()Ler/l;", "b", "Ler/a;", "getNavResult", "()Ler/a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<NavigationDialogModel, i0> showNavigationDialog;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navResult;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(l<? super NavigationDialogModel, i0> lVar, er.a<i0> aVar) {
            this.showNavigationDialog = lVar;
            this.navResult = aVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.showNavigationDialog, params.showNavigationDialog) && t.c(this.navResult, params.navResult);
        }

        public int hashCode() {
            return (this.showNavigationDialog.hashCode() * 31) + this.navResult.hashCode();
        }

        public String toString() {
            return "Params(showNavigationDialog=" + this.showNavigationDialog + ", navResult=" + this.navResult + ')';
        }
    }

    public f(mx.c cVar, d dVar) {
        this.labelProvider = cVar;
        this.settingsNavigationDialogMapper = dVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SetPasswordSetupData b(Params params) {
        return new SetPasswordSetupData(false, this.labelProvider.c(c53.a.C), this.labelProvider.c(c53.a.B), this.labelProvider.c(c53.a.A), this.labelProvider.c(c53.a.f23696i), this.labelProvider.c(c53.a.f23705l), false, true);
    }
}
