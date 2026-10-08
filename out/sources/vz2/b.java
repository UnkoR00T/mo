package vz2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvz2/b;", "Lxw/f;", "Lvz2/c;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "dialogType", "e", "(Lvz2/c;)Lcb4/d;", "a", "Lmx/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<c, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DialogData b(c dialogType) {
        Label labelC;
        if (dialogType instanceof c.ToProvider) {
            c.ToProvider toProvider = (c.ToProvider) dialogType;
            return new DialogData(h.b.f24985a, this.labelProvider.c(uy2.b.f202287d0), this.labelProvider.c(uy2.b.f202283b0), new DialogButtonTextData(this.labelProvider.c(uy2.b.f202285c0), null, toProvider.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(uy2.b.f202296i), null, toProvider.a(), 2, null), null, null, 96, null);
        }
        if (dialogType instanceof c.ToSettings) {
            c.ToSettings toSettings = (c.ToSettings) dialogType;
            return new DialogData(h.b.f24985a, this.labelProvider.c(uy2.b.f202301k0), this.labelProvider.c(uy2.b.f202299j0), new DialogButtonTextData(this.labelProvider.c(uy2.b.f202292g), null, toSettings.a(), 2, null), new DialogButtonTextData(this.labelProvider.c(uy2.b.f202296i), null, toSettings.b(), 2, null), null, null, 96, null);
        }
        if (!(dialogType instanceof c.TemporaryInterruption)) {
            throw new p();
        }
        c.TemporaryInterruption temporaryInterruption = (c.TemporaryInterruption) dialogType;
        String title = temporaryInterruption.getDialogData().getTitle();
        if (title == null || (labelC = mx.b.b(title, "TemporaryInterruptionDialogTitle")) == null) {
            labelC = Label.INSTANCE.c();
        }
        return new DialogData(h.b.f24985a, labelC, mx.b.b(temporaryInterruption.getDialogData().getMessage(), "TemporaryInterruptionDialogMessage"), new DialogButtonTextData(this.labelProvider.c(uy2.b.f202284c), null, new er.a() { // from class: vz2.a
            @Override // er.a
            public final Object a() {
                return b.f();
            }
        }, 2, null), null, null, null, 112, null);
    }
}
