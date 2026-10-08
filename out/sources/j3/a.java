package j3;

import android.view.DragEvent;
import android.view.View;
import er.l;
import er.q;
import f3.m;
import g4.l0;
import java.util.Iterator;
import m3.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lj3/a;", "Landroid/view/View$OnDragListener;", "Lj3/d;", "Lkotlin/Function3;", "Lj3/h;", "Lm3/k;", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "", "startDrag", "<init>", "(Ler/q;)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", "event", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Lj3/g;", "target", "b", "(Lj3/g;)V", "a", "(Lj3/g;)Z", "Ler/q;", "Lj3/e;", "Lj3/e;", "rootDragAndDropNode", "Lr0/b;", "c", "Lr0/b;", "interestedTargets", "Lf3/m;", "d", "Lf3/m;", "()Lf3/m;", "modifier", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements View.OnDragListener, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q<h, k, l<? super p3.f, i0>, Boolean> startDrag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e rootDragAndDropNode = new e(null, null, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r0.b<g> interestedTargets = new r0.b<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m modifier = new C2326a();

    /* JADX INFO: renamed from: j3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"j3/a$a", "Lg4/l0;", "Lj3/e;", "a", "()Lj3/e;", "node", "Loq/i0;", "l", "(Lj3/e;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2326a extends l0<e> {
        C2326a() {
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e create() {
            return a.this.rootDragAndDropNode;
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return a.this.rootDragAndDropNode.hashCode();
        }

        @Override // g4.l0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void update(e node) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(q<? super h, ? super k, ? super l<? super p3.f, i0>, Boolean> qVar) {
        this.startDrag = qVar;
    }

    @Override // j3.d
    public boolean a(g target) {
        return this.interestedTargets.contains(target);
    }

    @Override // j3.d
    public void b(g target) {
        this.interestedTargets.add(target);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public m getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        c cVar = new c(event);
        switch (event.getAction()) {
            case 1:
                boolean zN3 = this.rootDragAndDropNode.n3(cVar);
                Iterator<g> it = this.interestedTargets.iterator();
                while (it.hasNext()) {
                    it.next().t2(cVar);
                }
                return zN3;
            case 2:
                this.rootDragAndDropNode.o0(cVar);
                return false;
            case 3:
                return this.rootDragAndDropNode.Q1(cVar);
            case 4:
                this.rootDragAndDropNode.V1(cVar);
                this.interestedTargets.clear();
                return false;
            case 5:
                this.rootDragAndDropNode.o1(cVar);
                return false;
            case 6:
                this.rootDragAndDropNode.k1(cVar);
                return false;
            default:
                return false;
        }
    }
}
