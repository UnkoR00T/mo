package m4;

import android.os.CancellationSignal;
import er.l;
import er.p;
import fr.w;
import ju.d2;
import ju.k;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lju/p0;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Ltq/e;", "Loq/i0;", "", "block", "Lju/d2;", "c", "(Lju/p0;Landroid/os/CancellationSignal;Ler/p;)Lju/d2;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Loq/i0;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f123702b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f123702b = cancellationSignal;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            if (th4 != null) {
                this.f123702b.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d2 c(p0 p0Var, CancellationSignal cancellationSignal, p<? super p0, ? super tq.e<? super i0>, ? extends Object> pVar) {
        final d2 d2VarD = k.d(p0Var, null, null, pVar, 3, null);
        d2VarD.C0(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: m4.c
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                d.d(d2VarD);
            }
        });
        return d2VarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d2 d2Var) {
        d2.a.a(d2Var, null, 1, null);
    }
}
