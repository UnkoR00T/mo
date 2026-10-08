package nx0;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnx0/c;", "Lnx0/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lnx0/a$b;", "params", "Lcb4/d;", "e", "(Lnx0/a$b;)Lcb4/d;", "a", "Lmx/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DialogData b(a.Params params) {
        a.InterfaceC3450a dialogType = params.getDialogType();
        if (dialogType instanceof a.InterfaceC3450a.Terminate) {
            return new DialogData(h.b.f24985a, this.labelProvider.c(yw0.a.T), this.labelProvider.c(yw0.a.S), new DialogButtonTextData(this.labelProvider.c(yw0.a.K), null, ((a.InterfaceC3450a.Terminate) params.getDialogType()).a(), 2, null), new DialogButtonTextData(this.labelProvider.c(yw0.a.J), null, new er.a() { // from class: nx0.b
                @Override // er.a
                public final Object a() {
                    return c.f();
                }
            }, 2, null), null, null, 96, null);
        }
        if (dialogType instanceof a.InterfaceC3450a.NewUserActivation) {
            return new DialogData(h.b.f24985a, this.labelProvider.c(yw0.a.G), this.labelProvider.c(yw0.a.F), new DialogButtonTextData(this.labelProvider.c(yw0.a.H), null, ((a.InterfaceC3450a.NewUserActivation) params.getDialogType()).b(), 2, null), new DialogButtonTextData(this.labelProvider.c(yw0.a.J), null, ((a.InterfaceC3450a.NewUserActivation) params.getDialogType()).a(), 2, null), null, null, 96, null);
        }
        if (dialogType instanceof a.InterfaceC3450a.SecondDeviceActivation) {
            return new DialogData(h.b.f24985a, this.labelProvider.c(yw0.a.f229980i), this.labelProvider.e(yw0.a.f229979h, ((a.InterfaceC3450a.SecondDeviceActivation) params.getDialogType()).getSecondDeviceName()), new DialogButtonTextData(this.labelProvider.c(yw0.a.H), null, ((a.InterfaceC3450a.SecondDeviceActivation) params.getDialogType()).b(), 2, null), new DialogButtonTextData(this.labelProvider.c(yw0.a.J), null, ((a.InterfaceC3450a.SecondDeviceActivation) params.getDialogType()).a(), 2, null), null, null, 96, null);
        }
        throw new p();
    }
}
