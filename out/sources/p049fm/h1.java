package p049fm;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.p;
import lh.c;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lfm/h1;", "", i.f37094u, "Lfm/x1;", "Llh/c;", "map", "Lkotlin/Function2;", "Loq/i0;", "setter", "listener", "<init>", "(Llh/c;Ler/p;Ljava/lang/Object;)V", "listenerOrNull", "b", "(Ljava/lang/Object;)V", "f", "()V", "e", "a", "Llh/c;", "Ler/p;", "c", "Ljava/lang/Object;", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1<L> implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c map;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<c, L, i0> setter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final L listener;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(c cVar, p<? super c, ? super L, i0> pVar, L l15) {
        this.map = cVar;
        this.setter = pVar;
        this.listener = l15;
    }

    private final void b(L listenerOrNull) {
        this.setter.B(this.map, listenerOrNull);
    }

    @Override // p049fm.x1
    public void a() {
        b(null);
    }

    @Override // p049fm.x1
    public void e() {
        b(null);
    }

    @Override // p049fm.x1
    public void f() {
        b(this.listener);
    }
}
