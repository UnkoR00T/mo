package se1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lse1/b;", "Lxw/f;", "Lse1/c;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "dialogType", "e", "(Lse1/c;)Lcb4/d;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        if (!(dialogType instanceof c.Close)) {
            throw new p();
        }
        return new DialogData(h.b.f24985a, this.labelProvider.c(ha1.a.J), this.labelProvider.c(ha1.a.f82500t), new DialogButtonTextData(this.labelProvider.c(ha1.a.f82402g), null, ((c.Close) dialogType).a(), 2, null), new DialogButtonTextData(this.labelProvider.c(ha1.a.f82355a0), null, new er.a() { // from class: se1.a
            @Override // er.a
            public final Object a() {
                return b.f();
            }
        }, 2, null), null, null, 96, null);
    }
}
