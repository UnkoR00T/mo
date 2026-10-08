package v1;

import a4.k0;
import a4.o;
import a4.q;
import a4.w0;
import a4.y0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import er.p;
import g4.f1;
import g4.h;
import g4.j;
import l3.h0;
import l3.l0;
import oq.i0;
import p071kotlin.Metadata;
import p143z0.g1;
import tq.e;
import vq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\tR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lv1/c;", "Lg4/j;", "Lg4/f1;", "Ll3/j;", "Ll3/h0;", "Lkotlin/Function0;", "Loq/i0;", "onHandwritingSlopExceeded", "<init>", "(Ler/a;)V", "Ll3/l0;", "focusState", "i", "(Ll3/l0;)V", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "Z1", "()V", "v", "Ler/a;", "u3", "()Ler/a;", "v3", "", "w", "Z", "focused", "La4/y0;", "x", "La4/y0;", "suspendingPointerInputModifierNode", "Lg4/n1;", "B1", "()J", "touchBoundsExpansion", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends j implements f1, l3.j, h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onHandwritingSlopExceeded;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean focused;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final y0 suspendingPointerInputModifierNode = (y0) n3(w0.a(new a()));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: v1.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
        static final class C5276a extends i implements p<a4.c, e<? super i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f203009c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f203010d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f203011e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f203012f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f203013g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5276a(c cVar, e<? super C5276a> eVar) {
                super(2, eVar);
                this.f203013g = cVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            
                if (r9 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a6, code lost:
            
                if (r5 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:42:0x00f8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a6 -> B:75:0x01a9). Please report as a decompilation issue!!! */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: v1.c.a.C5276a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(a4.c cVar, e<? super i0> eVar) {
                return ((C5276a) v(cVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                C5276a c5276a = new C5276a(this.f203013g, eVar);
                c5276a.f203012f = obj;
                return c5276a;
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, e<? super i0> eVar) {
            Object objD = g1.d(k0Var, new C5276a(c.this, null), eVar);
            return objD == uq.b.e() ? objD : i0.f148189a;
        }
    }

    public c(er.a<i0> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }

    @Override // g4.f1
    public long B1() {
        return b.a().a(h.o(this));
    }

    @Override // g4.f1
    public void Y(o pointerEvent, q pass, long bounds) {
        this.suspendingPointerInputModifierNode.Y(pointerEvent, pass, bounds);
    }

    @Override // g4.f1
    public void Z1() {
        this.suspendingPointerInputModifierNode.Z1();
    }

    @Override // l3.j
    public void i(l0 focusState) {
        this.focused = focusState.b();
    }

    public final er.a<i0> u3() {
        return this.onHandwritingSlopExceeded;
    }

    public final void v3(er.a<i0> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }
}
