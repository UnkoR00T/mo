package p079n1;

import b1.d;
import b1.g;
import b1.i;
import b1.j;
import b1.n;
import mu.h;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.m5;
import p076m2.y2;
import r0.q0;
import tq.e;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Ln1/t3;", "", "Lb1/j;", "interactionSource", "<init>", "(Lb1/j;)V", "Loq/i0;", "e", "(Ltq/e;)Ljava/lang/Object;", "a", "Lb1/j;", "", "b", "I", "Focused", "c", "Hovered", "d", "Pressed", "Lm2/y2;", "Lm2/y2;", "interactionState", "", "f", "()Z", "isFocused", "g", "isHovered", "h", "isPressed", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j interactionSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int Focused = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int Hovered = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int Pressed = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y2 interactionState = m5.a(0);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0<i> f130453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t3 f130454b;

        a(q0<i> q0Var, t3 t3Var) {
            this.f130453a = q0Var;
            this.f130454b = t3Var;
        }

        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(i iVar, e<? super i0> eVar) {
            int i15;
            if ((iVar instanceof g) || (iVar instanceof d) || (iVar instanceof n.b)) {
                this.f130453a.n(iVar);
            } else if (iVar instanceof b1.h) {
                this.f130453a.z(((b1.h) iVar).getEnter());
            } else if (iVar instanceof b1.e) {
                this.f130453a.z(((b1.e) iVar).getFocus());
            } else if (iVar instanceof n.c) {
                this.f130453a.z(((n.c) iVar).getPress());
            } else if (iVar instanceof n.a) {
                this.f130453a.z(((n.a) iVar).getPress());
            }
            q0<i> q0Var = this.f130453a;
            t3 t3Var = this.f130454b;
            Object[] objArr = q0Var.content;
            int i16 = q0Var._size;
            int i17 = 0;
            for (int i18 = 0; i18 < i16; i18++) {
                i iVar2 = (i) objArr[i18];
                if (iVar2 instanceof g) {
                    i15 = t3Var.Hovered;
                } else if (iVar2 instanceof d) {
                    i15 = t3Var.Focused;
                } else {
                    if (iVar2 instanceof n.b) {
                        i15 = t3Var.Pressed;
                    }
                }
                i17 |= i15;
            }
            this.f130454b.interactionState.g(i17);
            return i0.f148189a;
        }
    }

    public t3(j jVar) {
        this.interactionSource = jVar;
    }

    public final Object e(e<? super i0> eVar) {
        Object objA = this.interactionSource.c().a(new a(new q0(0, 1, null), this), eVar);
        return objA == b.e() ? objA : i0.f148189a;
    }

    public final boolean f() {
        return (this.interactionState.d() & this.Focused) != 0;
    }

    public final boolean g() {
        return (this.interactionState.d() & this.Hovered) != 0;
    }

    public final boolean h() {
        return (this.interactionState.d() & this.Pressed) != 0;
    }
}
