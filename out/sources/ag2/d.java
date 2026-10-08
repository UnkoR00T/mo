package ag2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lag2/d;", "Lag2/c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lag2/c$a;", "params", "Lcb4/d;", "c", "(Lag2/c$a;)Lcb4/d;", "a", "Lmx/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DialogData b(c.Params params) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(xf2.a.P1), this.labelProvider.c(xf2.a.f218370j), new DialogButtonTextData(this.labelProvider.c(xf2.a.Q1), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(xf2.a.f218355e), cb4.a.C0668a.f24967a, params.a()), null, params.a(), 32, null);
    }
}
