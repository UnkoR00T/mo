package t1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tR4\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lt1/d;", "Lg4/j;", "Lg4/e;", "Lkotlin/Function2;", "Lp1/a;", "Landroid/content/Context;", "Loq/i0;", "builder", "<init>", "(Ler/p;)V", "v", "Ler/p;", "getBuilder", "()Ler/p;", "v3", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends g4.j implements g4.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private er.p<? super p1.a, ? super Context, i0> builder;

    public d(er.p<? super p1.a, ? super Context, i0> pVar) {
        this.builder = pVar;
        n3(new a(new er.l() { // from class: t1.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.u3(this.f186827a, (p1.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u3(d dVar, p1.a aVar) {
        dVar.builder.B(aVar, g4.f.a(dVar, AndroidCompositionLocals_androidKt.c()));
        return i0.f148189a;
    }

    public final void v3(er.p<? super p1.a, ? super Context, i0> pVar) {
        this.builder = pVar;
    }
}
