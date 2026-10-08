package vk2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvk2/g;", "Lxw/f;", "Lvk2/h;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "dialogType", "c", "(Lvk2/h;)Lcb4/d;", "a", "Lmx/c;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<h, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(h dialogType) {
        if (!(dialogType instanceof h.Refresh)) {
            throw new p();
        }
        h.Refresh refresh = (h.Refresh) dialogType;
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(ik2.a.B), this.labelProvider.c(ik2.a.A), new DialogButtonTextData(this.labelProvider.c(ik2.a.f93189d), null, refresh.a(), 2, null), new DialogButtonTextData(this.labelProvider.c(ik2.a.f93183a), null, refresh.b(), 2, null), null, refresh.b(), 32, null);
    }
}
