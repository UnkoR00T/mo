package p076m2;

import er.a;
import oq.i0;
import p071kotlin.Metadata;
import y2.b;
import y2.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lm2/j3;", "Lm2/g;", "Lkotlin/Function0;", "Loq/i0;", "action", "<init>", "(Ler/a;)V", "cancel", "()V", "b", "Ler/a;", "Ly2/b;", "c", "Ly2/c;", "didFireCancellation", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j3 implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<i0> action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c didFireCancellation = b.b(false);

    public j3(a<i0> aVar) {
        this.action = aVar;
    }

    @Override // p076m2.g
    public void cancel() {
        if (b.d(this.didFireCancellation, true)) {
            return;
        }
        this.action.a();
    }
}
