package k21;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk21/n;", "Lk21/m;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lk21/m$a;", "params", "Lcb4/d;", "c", "(Lk21/m$a;)Lcb4/d;", "a", "Lmx/c;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public n(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(m.Params params) {
        int i15;
        int i16;
        Label labelC;
        o dialogType = params.getDialogType();
        if (dialogType instanceof o.ExitDialog) {
            o.ExitDialog exitDialog = (o.ExitDialog) dialogType;
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(a21.a.f2083d), null, new DialogButtonTextData(this.labelProvider.c(a21.a.f2106o0), null, exitDialog.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(a21.a.f2120v0), null, exitDialog.a(), 2, null), null, exitDialog.a(), 36, null);
        }
        if (dialogType instanceof o.OpenNewChatDialog) {
            o.OpenNewChatDialog openNewChatDialog = (o.OpenNewChatDialog) dialogType;
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(a21.a.f2097k), null, new DialogButtonTextData(this.labelProvider.c(a21.a.f2095j), null, openNewChatDialog.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(a21.a.f2120v0), null, openNewChatDialog.a(), 2, null), null, openNewChatDialog.a(), 36, null);
        }
        if (dialogType instanceof o.PersonalDataFoundDialog) {
            o.PersonalDataFoundDialog personalDataFoundDialog = (o.PersonalDataFoundDialog) dialogType;
            return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(personalDataFoundDialog.getTitleStringResId()), null, new DialogButtonTextData(this.labelProvider.c(a21.a.f2107p), null, personalDataFoundDialog.a(), 2, null), null, null, personalDataFoundDialog.a(), 52, null);
        }
        if (dialogType instanceof o.TemporaryInterruptionDialog) {
            cb4.h.b bVar = cb4.h.b.f24985a;
            String title = ((o.TemporaryInterruptionDialog) params.getDialogType()).getData().getTitle();
            if (title == null || (labelC = mx.b.b(title, "temporaryInterruptionTitle")) == null) {
                labelC = this.labelProvider.c(a21.a.f2122w0);
            }
            o.TemporaryInterruptionDialog temporaryInterruptionDialog = (o.TemporaryInterruptionDialog) dialogType;
            return new DialogData(bVar, labelC, mx.b.b(((o.TemporaryInterruptionDialog) params.getDialogType()).getData().getMessage(), "temporaryInterruptionMessage"), new DialogButtonTextData(this.labelProvider.c(a21.a.f2104n0), null, temporaryInterruptionDialog.b(), 2, null), null, null, temporaryInterruptionDialog.b(), 48, null);
        }
        if (!(dialogType instanceof o.RedirectDialog)) {
            throw new oq.p();
        }
        cb4.h.b bVar2 = cb4.h.b.f24985a;
        mx.c cVar = this.labelProvider;
        o.RedirectDialog redirectDialog = (o.RedirectDialog) dialogType;
        l21.a type = redirectDialog.getType();
        l21.a.b bVar3 = l21.a.b.f115429a;
        if (t.c(type, bVar3)) {
            i15 = a21.a.f2124y;
        } else if (t.c(type, l21.a.InterfaceC2784a.b.f115428a)) {
            i15 = a21.a.f2121w;
        } else {
            if (!t.c(type, l21.a.InterfaceC2784a.C2785a.f115427a)) {
                throw new oq.p();
            }
            i15 = a21.a.f2079b;
        }
        Label labelC2 = cVar.c(i15);
        mx.c cVar2 = this.labelProvider;
        l21.a type2 = redirectDialog.getType();
        if (t.c(type2, bVar3)) {
            i16 = a21.a.f2123x;
        } else {
            if (!(type2 instanceof l21.a.InterfaceC2784a)) {
                throw new oq.p();
            }
            i16 = a21.a.f2119v;
        }
        return new DialogData(bVar2, labelC2, cVar2.c(i16), new DialogButtonTextData(this.labelProvider.c(a21.a.f2108p0), null, redirectDialog.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(a21.a.f2112r0), null, redirectDialog.a(), 2, null), null, redirectDialog.a(), 32, null);
    }
}
