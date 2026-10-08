package g73;

import j30.ButtonTextData;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg73/e;", "Lg73/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lg73/d$a;", "params", "Lvw/a;", "c", "(Lg73/d$a;)Lvw/a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public NavigationDialogModel b(d.Params params) {
        a dialogType = params.getDialogType();
        if (dialogType instanceof a.TerminationProcessDialog) {
            a.TerminationProcessDialog terminationProcessDialog = (a.TerminationProcessDialog) dialogType;
            return new NavigationDialogModel(this.labelProvider.c(c53.a.f23734u1), this.labelProvider.c(c53.a.f23725r1), null, null, null, terminationProcessDialog.c(), new ButtonTextData(null, this.labelProvider.c(c53.a.f23728s1), null, null, terminationProcessDialog.d(), 13, null), new ButtonTextData(null, this.labelProvider.c(c53.a.f23708m), null, null, terminationProcessDialog.c(), 13, null), 28, null);
        }
        if (!(dialogType instanceof a.ResetBiometricDialog)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(c53.a.A0);
        Label labelC2 = this.labelProvider.c(c53.a.f23744z0);
        a.ResetBiometricDialog resetBiometricDialog = (a.ResetBiometricDialog) dialogType;
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(c53.a.f23742y0), null, null, resetBiometricDialog.b(), 13, null);
        ButtonTextData buttonTextData2 = new ButtonTextData(null, this.labelProvider.c(c53.a.f23740x0), null, null, resetBiometricDialog.a(), 13, null);
        return new NavigationDialogModel(labelC, labelC2, null, null, NavigationDialogModel.EnumC5473a.NEVER, resetBiometricDialog.a(), buttonTextData, buttonTextData2, 12, null);
    }
}
