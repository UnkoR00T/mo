package m1;

import c3.SnapshotStateMap;
import java.util.Iterator;
import java.util.Map;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.m5;
import p076m2.x5;
import p076m2.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0090@¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR2\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#¨\u0006)"}, d2 = {"Lm1/c;", "Lm1/w;", "Lb1/j;", "interactionSource", "<init>", "(Lb1/j;)V", "interactions", "Loq/i0;", "c", "(Lb1/j;Ltq/e;)Ljava/lang/Object;", "a", "Lb1/j;", "()Lb1/j;", "Lc3/h0;", "Lm1/x;", "", "b", "Lc3/h0;", "d", "()Lc3/h0;", "setCustomStates$foundation", "(Lc3/h0;)V", "customStates", "", "<set-?>", "Lm2/y2;", "e", "()I", "h", "(I)V", "predefinedState", "", "value", "()Z", "f", "(Z)V", "isFocused", "isHovered", "g", "isPressed", "i", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b1.j interactionSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private SnapshotStateMap<x<?>, Object> customStates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y2 predefinedState;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements mu.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<b1.n.b> f122340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f122341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<b1.g> f122342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b<b1.d> f122343d;

        /* JADX INFO: renamed from: m1.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C2992a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f122344d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f122345e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f122346f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f122347g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ a<T> f122348h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f122349j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2992a(a<? super T> aVar, tq.e<? super C2992a> eVar) {
                super(eVar);
                this.f122348h = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f122347g = obj;
                this.f122349j |= PKIFailureInfo.systemUnavail;
                return this.f122348h.F(null, this);
            }
        }

        a(b<b1.n.b> bVar, c cVar, b<b1.g> bVar2, b<b1.d> bVar3) {
            this.f122340a = bVar;
            this.f122341b = cVar;
            this.f122342c = bVar2;
            this.f122343d = bVar3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(b1.i iVar, tq.e<? super i0> eVar) throws Throwable {
            C2992a c2992a;
            c cVar;
            b1.i iVar2;
            Iterator<Map.Entry<x<?>, Object>> it;
            if (eVar instanceof C2992a) {
                c2992a = (C2992a) eVar;
                int i15 = c2992a.f122349j;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c2992a.f122349j = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c2992a = new C2992a(this, eVar);
                }
            } else {
                c2992a = new C2992a(this, eVar);
            }
            Object obj = c2992a.f122347g;
            Object objE = uq.b.e();
            int i16 = c2992a.f122349j;
            if (i16 == 0) {
                oq.u.b(obj);
                if (iVar instanceof b1.n.b) {
                    this.f122340a.a(iVar);
                    this.f122341b.i(true);
                } else if (iVar instanceof b1.n.c) {
                    this.f122340a.c(((b1.n.c) iVar).getPress());
                    this.f122341b.i(this.f122340a.b());
                } else if (iVar instanceof b1.n.a) {
                    this.f122340a.c(((b1.n.a) iVar).getPress());
                    this.f122341b.i(this.f122340a.b());
                } else if (iVar instanceof b1.g) {
                    this.f122342c.a(iVar);
                    this.f122341b.g(true);
                } else if (iVar instanceof b1.h) {
                    this.f122342c.c(((b1.h) iVar).getEnter());
                    this.f122341b.g(this.f122342c.b());
                } else if (iVar instanceof b1.d) {
                    this.f122343d.a(iVar);
                    this.f122341b.f(true);
                } else if (iVar instanceof b1.e) {
                    this.f122343d.c(((b1.e) iVar).getFocus());
                    this.f122341b.f(this.f122343d.b());
                } else {
                    SnapshotStateMap<x<?>, Object> snapshotStateMapD = this.f122341b.d();
                    cVar = this.f122341b;
                    Iterator<Map.Entry<x<?>, Object>> it4 = snapshotStateMapD.entrySet().iterator();
                    iVar2 = iVar;
                    it = it4;
                }
                return i0.f148189a;
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c2992a.f122346f;
            cVar = (c) c2992a.f122345e;
            b1.i iVar3 = (b1.i) c2992a.f122344d;
            oq.u.b(obj);
            iVar2 = iVar3;
            while (it.hasNext()) {
                x<?> key = it.next().getKey();
                c2992a.f122344d = iVar2;
                c2992a.f122345e = cVar;
                c2992a.f122346f = it;
                c2992a.f122349j = 1;
                if (key.d(iVar2, cVar, c2992a) == objE) {
                    return objE;
                }
            }
            return i0.f148189a;
        }
    }

    public c(b1.j jVar) {
        super(null);
        this.interactionSource = jVar;
        this.customStates = x5.h();
        this.predefinedState = m5.a(16);
    }

    @Override // m1.w
    /* JADX INFO: renamed from: a, reason: from getter */
    public b1.j getInteractionSource() {
        return this.interactionSource;
    }

    @Override // m1.w
    public boolean b() {
        return (e() & 4) != 0;
    }

    @Override // m1.w
    public Object c(b1.j jVar, tq.e<? super i0> eVar) {
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        i(false);
        g(false);
        f(false);
        Object objA = jVar.c().a(new a(bVar, this, bVar2, bVar3), eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    public final SnapshotStateMap<x<?>, Object> d() {
        return this.customStates;
    }

    public final int e() {
        return this.predefinedState.d();
    }

    public void f(boolean z15) {
        h((z15 ? 4 : 0) | (e() & (-5)));
    }

    public void g(boolean z15) {
        h((z15 ? 2 : 0) | (e() & (-3)));
    }

    public final void h(int i15) {
        this.predefinedState.g(i15);
    }

    public void i(boolean z15) {
        h((z15 ? 1 : 0) | (e() & (-2)));
    }
}
