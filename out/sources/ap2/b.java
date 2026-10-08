package ap2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lap2/b;", "Lxw/f;", "Loq/i0;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Loq/i0;)Lcb4/d;", "a", "Lmx/c;", "onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<i0, DialogData> {

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
    public DialogData b(i0 params) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(oo2.b.E), this.labelProvider.c(oo2.b.D), new DialogButtonTextData(this.labelProvider.c(oo2.b.f147854k), null, new er.a() { // from class: ap2.a
            @Override // er.a
            public final Object a() {
                return b.f();
            }
        }, 2, null), null, null, null, 112, null);
    }
}
