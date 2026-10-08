package p088nul;

import er.a;
import oq.i0;
import p008Nul.w;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lnul/t0;", "LNul/w;", "Lnul/j0;", "info", "<init>", "(Lnul/j0;)V", "Loq/i0;", "e", "()V", "Lkotlin/Function0;", "d", "Ler/a;", "getCurrentOnBackCompleted", "()Ler/a;", "k", "(Ler/a;)V", "currentOnBackCompleted", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class t0 extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a<i0> currentOnBackCompleted;

    public t0(BackHandlerInfo backHandlerInfo) {
        super(backHandlerInfo);
        this.currentOnBackCompleted = new a() { // from class: nul.s0
            @Override // er.a
            public final Object a() {
                return t0.j();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j() {
        return i0.f148189a;
    }

    @Override // p008Nul.w
    public void e() {
        this.currentOnBackCompleted.a();
    }

    public final void k(a<i0> aVar) {
        this.currentOnBackCompleted = aVar;
    }
}
