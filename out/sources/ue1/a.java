package ue1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lue1/a;", "Lxw/f;", "Lue1/b;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "dialogType", "c", "(Lue1/b;)Lcb4/d;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<b, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(b dialogType) {
        if (!(dialogType instanceof b.UnderSelectionLimit)) {
            throw new p();
        }
        return new DialogData(h.b.f24985a, this.labelProvider.c(ha1.a.U1), null, new DialogButtonTextData(this.labelProvider.c(ha1.a.f82450m), null, ((b.UnderSelectionLimit) dialogType).a(), 2, null), null, null, null, 116, null);
    }
}
