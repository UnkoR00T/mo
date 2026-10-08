package vv1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvv1/h;", "Lvv1/g;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lvv1/g$a;", "params", "Lcb4/d;", "c", "(Lvv1/g$a;)Lcb4/d;", "a", "Lmx/c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(g.Params params) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(dv1.a.f44658r0), this.labelProvider.c(dv1.a.f44631e), new DialogButtonTextData(this.labelProvider.c(dv1.a.f44660s0), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(dv1.a.f44627c), cb4.a.C0668a.f24967a, params.a()), null, params.a(), 32, null);
    }
}
